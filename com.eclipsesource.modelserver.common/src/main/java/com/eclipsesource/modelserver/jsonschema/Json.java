/*******************************************************************************
 * Copyright (c) 2019 EclipseSource and others.
 *
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License v. 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0.
 *
 *   This Source Code may also be made available under the following Secondary
 *   Licenses when the conditions for such availability set forth in the Eclipse
 *   Public License v. 2.0 are satisfied: GNU General Public License, version 2
 *   with the GNU Classpath Exception which is available at
 *   https://www.gnu.org/software/classpath/license.html.
 *
 *   SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 *******************************************************************************/
package com.eclipsesource.modelserver.jsonschema;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;

import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class Json {

    private static ObjectMapper mapper = new ObjectMapper();

    public static ObjectNode object() {
        return mapper.createObjectNode();
    }

    public static ObjectNode object(Map<String, JsonNode> props) {
        final ObjectNode obj = mapper.createObjectNode();
        props.forEach(obj::set);
        return obj;
    }

    public static Map.Entry<String, JsonNode> prop(String name, JsonNode value) {
        return entry(name, value);
    }

    @SafeVarargs
    public static ObjectNode object(Map.Entry<String, JsonNode>... props) {
        final ObjectNode obj = mapper.createObjectNode();
        for (Map.Entry<String, JsonNode> prop : props){
            obj.set(prop.getKey(), prop.getValue());
        }
        return obj;
    }

    public static ArrayNode array() { return mapper.createArrayNode(); }

    public static ArrayNode array(List<String> list) {
        final ArrayNode array = mapper.createArrayNode();
        list.forEach(array::add);
        return array;
    }

    public static TextNode text(String s) { return TextNode.valueOf(s); }

    public static BooleanNode bool(Boolean b) { return BooleanNode.valueOf(b); }
}
