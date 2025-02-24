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

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Automatic Task</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.eclipsesource.emfforms.coffee.model.coffee.AutomaticTask#getName
 * <em>Name</em>}</li>
 * <li>{@link com.eclipsesource.emfforms.coffee.model.coffee.AutomaticTask#getComponent
 * <em>Component</em>}</li>
 * </ul>
 *
 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getAutomaticTask()
 * @model
 * @generated
 */
public interface AutomaticTask extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getAutomaticTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the
	 * '{@link com.eclipsesource.emfforms.coffee.model.coffee.AutomaticTask#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#getAutomaticTask_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the
	 * '{@link com.eclipsesource.emfforms.coffee.model.coffee.AutomaticTask#getComponent
	 * <em>Component</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // AutomaticTask
