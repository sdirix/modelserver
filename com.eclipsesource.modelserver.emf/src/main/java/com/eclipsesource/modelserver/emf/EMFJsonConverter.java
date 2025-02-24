/********************************************************************************
 * Copyright (c) 2019 EclipseSource and others.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 ********************************************************************************/
package com.eclipsesource.modelserver.emf;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Optional;
import java.util.TimeZone;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.emfjson.jackson.module.EMFModule;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class EMFJsonConverter {
	private static Logger LOG = Logger.getLogger(EMFJsonConverter.class);

	public static ObjectMapper setupDefaultMapper() {
		return EMFJsonConverter.setupDefaultMapper(null);
	}

	public static ObjectMapper setupDefaultMapper(JsonFactory factory) {
		final ObjectMapper mapper = new ObjectMapper(factory);
		// same as emf
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
		dateFormat.setTimeZone(TimeZone.getDefault());

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.setDateFormat(dateFormat);
		mapper.setTimeZone(TimeZone.getDefault());
		mapper.registerModule(new EMFModule());
		return mapper;
	}

	private ObjectMapper mapper;

	public EMFJsonConverter() {
		this.mapper = setupDefaultMapper();
	}

	public Optional<String> toJson(EObject object) {
		try {
			return Optional.of(mapper.writeValueAsString(object));
		} catch (JsonProcessingException e) {
			LOG.warn("Could not convert object to json String: " + object);
			return Optional.empty();
		}
	}

	public <T extends EObject> Optional<T> fromJson(String json, Class<T> clazz) {
		try {
			return Optional.of(mapper.readValue(json, clazz)).map(clazz::cast);
		} catch (IOException | ClassCastException e) {
			LOG.error(String.format("The json input \"%s\" could not be converted to an EObject of type \"%s\"", json,
					clazz.getSimpleName()));
			return Optional.empty();
		}
	}

	public Optional<EObject> fromJson(String json) {
		return fromJson(json, EObject.class);
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	public void setMapper(ObjectMapper mapper) {
		this.mapper = mapper;
	}

}