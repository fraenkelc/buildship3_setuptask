/********************************************************************************
 * Copyright (c) 2018 Christian Fränkel
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Christian Fränkel - initial API and implementation
 ********************************************************************************/
package com.github.fraenkelc.oomph.gradle.impl;

import org.eclipse.oomph.base.BasePackage;
import org.eclipse.oomph.predicates.PredicatesPackage;
import org.eclipse.oomph.resources.ResourcesPackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.github.fraenkelc.oomph.gradle.ImportGradleProjectFactory;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectTask;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ImportGradleProjectPackageImpl extends EPackageImpl implements ImportGradleProjectPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass importGradleProjectTaskEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ImportGradleProjectPackageImpl() {
		super(eNS_URI, ImportGradleProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize
	 * {@link ImportGradleProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ImportGradleProjectPackage init() {
		if (isInited) {
			return (ImportGradleProjectPackage) EPackage.Registry.INSTANCE
					.getEPackage(ImportGradleProjectPackage.eNS_URI);
		}

		// Obtain or create and register package
		Object registeredImportGradleProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ImportGradleProjectPackageImpl theImportGradleProjectPackage = registeredImportGradleProjectPackage instanceof ImportGradleProjectPackageImpl
				? (ImportGradleProjectPackageImpl) registeredImportGradleProjectPackage
				: new ImportGradleProjectPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasePackage.eINSTANCE.eClass();
		PredicatesPackage.eINSTANCE.eClass();
		ResourcesPackage.eINSTANCE.eClass();
		SetupPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theImportGradleProjectPackage.createPackageContents();

		// Initialize created meta-data
		theImportGradleProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theImportGradleProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ImportGradleProjectPackage.eNS_URI, theImportGradleProjectPackage);
		return theImportGradleProjectPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getImportGradleProjectTask() {
		return importGradleProjectTaskEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getImportGradleProjectTask_SourceLocators() {
		return (EReference) importGradleProjectTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getImportGradleProjectTask_PreSynchronizatonTasks() {
		return (EAttribute) importGradleProjectTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ImportGradleProjectFactory getImportGradleProjectFactory() {
		return (ImportGradleProjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		importGradleProjectTaskEClass = createEClass(IMPORT_GRADLE_PROJECT_TASK);
		createEReference(importGradleProjectTaskEClass, IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS);
		createEAttribute(importGradleProjectTaskEClass, IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SetupPackage theSetupPackage = (SetupPackage) EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage) EPackage.Registry.INSTANCE
				.getEPackage(ResourcesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		importGradleProjectTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

		// Initialize classes and features; add operations and parameters
		initEClass(importGradleProjectTaskEClass, ImportGradleProjectTask.class, "ImportGradleProjectTask",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImportGradleProjectTask_SourceLocators(), theResourcesPackage.getSourceLocator(), null,
				"sourceLocators", null, 1, -1, ImportGradleProjectTask.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportGradleProjectTask_PreSynchronizatonTasks(), ecorePackage.getEString(),
				"preSynchronizatonTasks", null, 0, -1, ImportGradleProjectTask.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource("http://www.github.com/fraenkelc/buildship3_setuptask/schemas/Buildship3_setuptask-1.0.ecore");

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/oomph/setup/Enablement
		createEnablementAnnotations();
		// http://www.eclipse.org/oomph/setup/ValidTriggers
		createValidTriggersAnnotations();
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] { "schemaLocation",
				"http://www.github.com/fraenkelc/buildship3_setuptask/schemas/Buildship3_setuptask-1.0.ecore" });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/oomph/setup/Enablement</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createEnablementAnnotations() {
		String source = "http://www.eclipse.org/oomph/setup/Enablement";
		addAnnotation(importGradleProjectTaskEClass, source,
				new String[] { "variableName", "p2.import.gradle.project", "repository",
						"https://dl.bintray.com/fraenkelc/buildship3_setuptask/updates", "installableUnits",
						"buildship3_setuptask.feature.group" });
	}

	/**
	 * Initializes the annotations for
	 * <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createValidTriggersAnnotations() {
		String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
		addAnnotation(importGradleProjectTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
	}

} // ImportGradleProjectPackageImpl
