/**
 *  Copyright (c) 2019 EclipseSource and others.
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
 * 
 */
package com.eclipsesource.emfforms.coffee.model.coffee;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Display</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.eclipsesource.emfforms.coffee.model.coffee.Display#getWidth
 * <em>Width</em>}</li>
 * <li>{@link com.eclipsesource.emfforms.coffee.model.coffee.Display#getHeight
 * <em>Height</em>}</li>
 * </ul>
 *
 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getDisplay_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the
	 * '{@link com.eclipsesource.emfforms.coffee.model.coffee.Display#getWidth
	 * <em>Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getDisplay_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the
	 * '{@link com.eclipsesource.emfforms.coffee.model.coffee.Display#getHeight
	 * <em>Height</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Display
