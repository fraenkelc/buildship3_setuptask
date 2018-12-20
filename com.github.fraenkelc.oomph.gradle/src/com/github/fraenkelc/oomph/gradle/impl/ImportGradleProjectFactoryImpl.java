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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.github.fraenkelc.oomph.gradle.ImportGradleProjectFactory;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectTask;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ImportGradleProjectFactoryImpl extends EFactoryImpl implements ImportGradleProjectFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public static ImportGradleProjectFactory init() {
		try {
			ImportGradleProjectFactory theImportGradleProjectFactory = (ImportGradleProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(ImportGradleProjectPackage.eNS_URI);
			if (theImportGradleProjectFactory != null) {
				return theImportGradleProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImportGradleProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public ImportGradleProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK:
			return createImportGradleProjectTask();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ImportGradleProjectTask createImportGradleProjectTask() {
		ImportGradleProjectTaskImpl importGradleProjectTask = new ImportGradleProjectTaskImpl();
		return importGradleProjectTask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ImportGradleProjectPackage getImportGradleProjectPackage() {
		return (ImportGradleProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImportGradleProjectPackage getPackage() {
		return ImportGradleProjectPackage.eINSTANCE;
	}

} // ImportGradleProjectFactoryImpl
