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
package com.eclipsesource.emfforms.coffee.model.coffee.impl;

import com.eclipsesource.emfforms.coffee.model.coffee.AutomaticTask;
import com.eclipsesource.emfforms.coffee.model.coffee.BrewingUnit;
import com.eclipsesource.emfforms.coffee.model.coffee.CoffeeFactory;
import com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage;
import com.eclipsesource.emfforms.coffee.model.coffee.Component;
import com.eclipsesource.emfforms.coffee.model.coffee.ControlUnit;
import com.eclipsesource.emfforms.coffee.model.coffee.Decision;
import com.eclipsesource.emfforms.coffee.model.coffee.Dimension;
import com.eclipsesource.emfforms.coffee.model.coffee.DipTray;
import com.eclipsesource.emfforms.coffee.model.coffee.Display;
import com.eclipsesource.emfforms.coffee.model.coffee.Flow;
import com.eclipsesource.emfforms.coffee.model.coffee.Fork;
import com.eclipsesource.emfforms.coffee.model.coffee.Join;
import com.eclipsesource.emfforms.coffee.model.coffee.Machine;
import com.eclipsesource.emfforms.coffee.model.coffee.ManualTask;
import com.eclipsesource.emfforms.coffee.model.coffee.ManufactoringProcess;
import com.eclipsesource.emfforms.coffee.model.coffee.Merge;
import com.eclipsesource.emfforms.coffee.model.coffee.Node;
import com.eclipsesource.emfforms.coffee.model.coffee.Processor;
import com.eclipsesource.emfforms.coffee.model.coffee.RamType;
import com.eclipsesource.emfforms.coffee.model.coffee.SocketConnectorType;
import com.eclipsesource.emfforms.coffee.model.coffee.WaterTank;
import com.eclipsesource.emfforms.coffee.model.coffee.WeightedFlow;
import com.eclipsesource.emfforms.coffee.model.coffee.Workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class CoffeePackageImpl extends EPackageImpl implements CoffeePackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass controlUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass brewingUnitEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dipTrayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass waterTankEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ramEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass displayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass workflowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass automaticTaskEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass manualTaskEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass forkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass decisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mergeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass weightedFlowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum socketConnectorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum manufactoringProcessEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum ramTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method
	 * {@link #init init()}, which also performs initialization of the package, or
	 * returns the registered package, if one already exists. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.eclipsesource.emfforms.coffee.model.coffee.CoffeePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoffeePackageImpl() {
		super(eNS_URI, CoffeeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and
	 * for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link CoffeePackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoffeePackage init() {
		if (isInited)
			return (CoffeePackage) EPackage.Registry.INSTANCE.getEPackage(CoffeePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCoffeePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CoffeePackageImpl theCoffeePackage = registeredCoffeePackage instanceof CoffeePackageImpl
				? (CoffeePackageImpl) registeredCoffeePackage
				: new CoffeePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCoffeePackage.createPackageContents();

		// Initialize created meta-data
		theCoffeePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoffeePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoffeePackage.eNS_URI, theCoffeePackage);
		return theCoffeePackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getComponent_Children() {
		return (EReference) componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getComponent_Parent() {
		return (EReference) componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getMachine_Name() {
		return (EAttribute) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getMachine_Workflows() {
		return (EReference) machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getControlUnit() {
		return controlUnitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getControlUnit_Processor() {
		return (EReference) controlUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getControlUnit_Dimension() {
		return (EReference) controlUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getControlUnit_Ram() {
		return (EReference) controlUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getControlUnit_Display() {
		return (EReference) controlUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getControlUnit_UserDescription() {
		return (EAttribute) controlUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getBrewingUnit() {
		return brewingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDipTray() {
		return dipTrayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getWaterTank() {
		return waterTankEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_Vendor() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_ClockSpeed() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_NumberOfCores() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_SocketconnectorType() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_ThermalDesignPower() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getProcessor_ManufactoringProcess() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Width() {
		return (EAttribute) dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Height() {
		return (EAttribute) dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Length() {
		return (EAttribute) dimensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getRAM() {
		return ramEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getRAM_ClockSpeed() {
		return (EAttribute) ramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getRAM_Size() {
		return (EAttribute) ramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getRAM_Type() {
		return (EAttribute) ramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDisplay() {
		return displayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDisplay_Width() {
		return (EAttribute) displayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getDisplay_Height() {
		return (EAttribute) displayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Nodes() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getWorkflow_Flows() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAutomaticTask() {
		return automaticTaskEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getAutomaticTask_Name() {
		return (EAttribute) automaticTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAutomaticTask_Component() {
		return (EReference) automaticTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getManualTask() {
		return manualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getManualTask_Name() {
		return (EAttribute) manualTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getFork() {
		return forkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getDecision() {
		return decisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getMerge() {
		return mergeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getFlow_Source() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getFlow_Target() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getWeightedFlow() {
		return weightedFlowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EAttribute getWeightedFlow_Probability() {
		return (EAttribute) weightedFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getSocketConnectorType() {
		return socketConnectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getManufactoringProcess() {
		return manufactoringProcessEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EEnum getRamType() {
		return ramTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CoffeeFactory getCoffeeFactory() {
		return (CoffeeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__CHILDREN);
		createEReference(componentEClass, COMPONENT__PARENT);

		machineEClass = createEClass(MACHINE);
		createEAttribute(machineEClass, MACHINE__NAME);
		createEReference(machineEClass, MACHINE__WORKFLOWS);

		controlUnitEClass = createEClass(CONTROL_UNIT);
		createEReference(controlUnitEClass, CONTROL_UNIT__PROCESSOR);
		createEReference(controlUnitEClass, CONTROL_UNIT__DIMENSION);
		createEReference(controlUnitEClass, CONTROL_UNIT__RAM);
		createEReference(controlUnitEClass, CONTROL_UNIT__DISPLAY);
		createEAttribute(controlUnitEClass, CONTROL_UNIT__USER_DESCRIPTION);

		brewingUnitEClass = createEClass(BREWING_UNIT);

		dipTrayEClass = createEClass(DIP_TRAY);

		waterTankEClass = createEClass(WATER_TANK);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__VENDOR);
		createEAttribute(processorEClass, PROCESSOR__CLOCK_SPEED);
		createEAttribute(processorEClass, PROCESSOR__NUMBER_OF_CORES);
		createEAttribute(processorEClass, PROCESSOR__SOCKETCONNECTOR_TYPE);
		createEAttribute(processorEClass, PROCESSOR__THERMAL_DESIGN_POWER);
		createEAttribute(processorEClass, PROCESSOR__MANUFACTORING_PROCESS);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__WIDTH);
		createEAttribute(dimensionEClass, DIMENSION__HEIGHT);
		createEAttribute(dimensionEClass, DIMENSION__LENGTH);

		ramEClass = createEClass(RAM);
		createEAttribute(ramEClass, RAM__CLOCK_SPEED);
		createEAttribute(ramEClass, RAM__SIZE);
		createEAttribute(ramEClass, RAM__TYPE);

		displayEClass = createEClass(DISPLAY);
		createEAttribute(displayEClass, DISPLAY__WIDTH);
		createEAttribute(displayEClass, DISPLAY__HEIGHT);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__NODES);
		createEReference(workflowEClass, WORKFLOW__FLOWS);

		nodeEClass = createEClass(NODE);

		automaticTaskEClass = createEClass(AUTOMATIC_TASK);
		createEAttribute(automaticTaskEClass, AUTOMATIC_TASK__NAME);
		createEReference(automaticTaskEClass, AUTOMATIC_TASK__COMPONENT);

		manualTaskEClass = createEClass(MANUAL_TASK);
		createEAttribute(manualTaskEClass, MANUAL_TASK__NAME);

		forkEClass = createEClass(FORK);

		joinEClass = createEClass(JOIN);

		decisionEClass = createEClass(DECISION);

		mergeEClass = createEClass(MERGE);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__SOURCE);
		createEReference(flowEClass, FLOW__TARGET);

		weightedFlowEClass = createEClass(WEIGHTED_FLOW);
		createEAttribute(weightedFlowEClass, WEIGHTED_FLOW__PROBABILITY);

		// Create enums
		socketConnectorTypeEEnum = createEEnum(SOCKET_CONNECTOR_TYPE);
		manufactoringProcessEEnum = createEEnum(MANUFACTORING_PROCESS);
		ramTypeEEnum = createEEnum(RAM_TYPE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is
	 * guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineEClass.getESuperTypes().add(this.getComponent());
		controlUnitEClass.getESuperTypes().add(this.getComponent());
		brewingUnitEClass.getESuperTypes().add(this.getComponent());
		dipTrayEClass.getESuperTypes().add(this.getComponent());
		waterTankEClass.getESuperTypes().add(this.getComponent());
		automaticTaskEClass.getESuperTypes().add(this.getNode());
		manualTaskEClass.getESuperTypes().add(this.getNode());
		forkEClass.getESuperTypes().add(this.getNode());
		joinEClass.getESuperTypes().add(this.getNode());
		decisionEClass.getESuperTypes().add(this.getNode());
		mergeEClass.getESuperTypes().add(this.getNode());
		weightedFlowEClass.getESuperTypes().add(this.getFlow());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Children(), this.getComponent(), this.getComponent_Parent(), "children", null, 0, //$NON-NLS-1$
				-1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Parent(), this.getComponent(), this.getComponent_Children(), "parent", null, 0, 1, //$NON-NLS-1$
				Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getMachine_Name(), ecorePackage.getEString(), "name", null, 1, 1, Machine.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Workflows(), this.getWorkflow(), null, "workflows", null, 0, -1, Machine.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlUnit_Processor(), this.getProcessor(), null, "processor", null, 1, 1, //$NON-NLS-1$
				ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, //$NON-NLS-1$
				ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlUnit_Ram(), this.getRAM(), null, "ram", null, 1, -1, ControlUnit.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getControlUnit_Display(), this.getDisplay(), null, "display", null, 0, 1, ControlUnit.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlUnit_UserDescription(), ecorePackage.getEString(), "userDescription", null, 0, 1, //$NON-NLS-1$
				ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(brewingUnitEClass, BrewingUnit.class, "BrewingUnit", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dipTrayEClass, DipTray.class, "DipTray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(waterTankEClass, WaterTank.class, "WaterTank", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Vendor(), ecorePackage.getEString(), "vendor", null, 0, 1, Processor.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ClockSpeed(), ecorePackage.getEInt(), "clockSpeed", null, 0, 1, Processor.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_NumberOfCores(), ecorePackage.getEInt(), "numberOfCores", null, 0, 1, //$NON-NLS-1$
				Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_SocketconnectorType(), this.getSocketConnectorType(), "socketconnectorType", null, //$NON-NLS-1$
				0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ThermalDesignPower(), ecorePackage.getEInt(), "thermalDesignPower", null, 0, 1, //$NON-NLS-1$
				Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_ManufactoringProcess(), this.getManufactoringProcess(), "manufactoringProcess", //$NON-NLS-1$
				null, 0, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Dimension.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Dimension.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimension_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Dimension.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ramEClass, com.eclipsesource.emfforms.coffee.model.coffee.RAM.class, "RAM", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRAM_ClockSpeed(), ecorePackage.getEInt(), "clockSpeed", null, 0, 1, //$NON-NLS-1$
				com.eclipsesource.emfforms.coffee.model.coffee.RAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAM_Size(), ecorePackage.getEInt(), "size", null, 0, 1, //$NON-NLS-1$
				com.eclipsesource.emfforms.coffee.model.coffee.RAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRAM_Type(), this.getRamType(), "type", null, 0, 1, //$NON-NLS-1$
				com.eclipsesource.emfforms.coffee.model.coffee.RAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayEClass, Display.class, "Display", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDisplay_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Display.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplay_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Display.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Workflow.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getWorkflow_Flows(), this.getFlow(), null, "flows", null, 0, -1, Workflow.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(automaticTaskEClass, AutomaticTask.class, "AutomaticTask", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomaticTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, AutomaticTask.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticTask_Component(), this.getComponent(), null, "component", null, 0, 1, //$NON-NLS-1$
				AutomaticTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manualTaskEClass, ManualTask.class, "ManualTask", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualTask_Name(), ecorePackage.getEString(), "name", null, 1, 1, ManualTask.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkEClass, Fork.class, "Fork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(decisionEClass, Decision.class, "Decision", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeEClass, Merge.class, "Merge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFlow_Source(), this.getNode(), null, "source", null, 1, 1, Flow.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFlow_Target(), this.getNode(), null, "target", null, 1, 1, Flow.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(weightedFlowEClass, WeightedFlow.class, "WeightedFlow", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeightedFlow_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, //$NON-NLS-1$
				WeightedFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(socketConnectorTypeEEnum, SocketConnectorType.class, "SocketConnectorType"); //$NON-NLS-1$
		addEEnumLiteral(socketConnectorTypeEEnum, SocketConnectorType.A1T);
		addEEnumLiteral(socketConnectorTypeEEnum, SocketConnectorType.Z51);

		initEEnum(manufactoringProcessEEnum, ManufactoringProcess.class, "ManufactoringProcess"); //$NON-NLS-1$
		addEEnumLiteral(manufactoringProcessEEnum, ManufactoringProcess.NM18);
		addEEnumLiteral(manufactoringProcessEEnum, ManufactoringProcess.NM25);

		initEEnum(ramTypeEEnum, RamType.class, "RamType"); //$NON-NLS-1$
		addEEnumLiteral(ramTypeEEnum, RamType.SODIMM);
		addEEnumLiteral(ramTypeEEnum, RamType.SIDIMM);

		// Create resource
		createResource(eNS_URI);
	}

} // CoffeePackageImpl
