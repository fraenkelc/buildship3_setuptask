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

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.Trigger;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.buildship.core.BuildConfiguration;
import org.eclipse.buildship.core.GradleBuild;
import org.eclipse.buildship.core.GradleCore;
import org.eclipse.buildship.core.GradleDistribution;
import org.eclipse.buildship.core.GradleWorkspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.osgi.util.NLS;

import com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectTask;

import org.gradle.tooling.ProjectConnection;

import java.io.File;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Task</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link com.github.fraenkelc.oomph.gradle.impl.ImportGradleProjectTaskImpl#getSourceLocators
 * <em>Source Locators</em>}</li>
 * <li>{@link com.github.fraenkelc.oomph.gradle.impl.ImportGradleProjectTaskImpl#getPreSynchronizatonTasks
 * <em>Pre Synchronizaton Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportGradleProjectTaskImpl extends SetupTaskImpl implements ImportGradleProjectTask {
	private static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

	/**
	 * The cached value of the '{@link #getSourceLocators() <em>Source
	 * Locators</em>}' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getSourceLocators()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceLocator> sourceLocators;

	/**
	 * The cached value of the '{@link #getPreSynchronizatonTasks() <em>Pre
	 * Synchronizaton Tasks</em>}' attribute list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #getPreSynchronizatonTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> preSynchronizatonTasks;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ImportGradleProjectTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportGradleProjectPackage.Literals.IMPORT_GRADLE_PROJECT_TASK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<SourceLocator> getSourceLocators() {
		if (sourceLocators == null) {
			sourceLocators = new EObjectContainmentEList<SourceLocator>(SourceLocator.class, this,
					ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS);
		}
		return sourceLocators;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<String> getPreSynchronizatonTasks() {
		if (preSynchronizatonTasks == null) {
			preSynchronizatonTasks = new EDataTypeUniqueEList<String>(String.class, this,
					ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS);
		}
		return preSynchronizatonTasks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
			return ((InternalEList<?>) getSourceLocators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
			return getSourceLocators();
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS:
			return getPreSynchronizatonTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
			getSourceLocators().clear();
			getSourceLocators().addAll((Collection<? extends SourceLocator>) newValue);
			return;
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS:
			getPreSynchronizatonTasks().clear();
			getPreSynchronizatonTasks().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
			getSourceLocators().clear();
			return;
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS:
			getPreSynchronizatonTasks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
			return sourceLocators != null && !sourceLocators.isEmpty();
		case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__PRE_SYNCHRONIZATON_TASKS:
			return preSynchronizatonTasks != null && !preSynchronizatonTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (preSynchronizatonTasks: ");
		result.append(preSynchronizatonTasks);
		result.append(')');
		return result.toString();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.oomph.setup.SetupTask#isNeeded(org.eclipse.oomph.setup.
	 * SetupTaskContext)
	 */
	@Override
	public boolean isNeeded(SetupTaskContext context) throws Exception {
		EList<SourceLocator> sourceLocators = getSourceLocators();
		if (sourceLocators.isEmpty()) {
			return false;
		}
		if (context.getTrigger() != Trigger.MANUAL) {
			for (IProject project : ROOT.getProjects()) {
				IPath projectFolder = project.getLocation();
				for (SourceLocator sourceLocator : sourceLocators) {
					Path rootFolder = new Path(sourceLocator.getRootFolder());
					if (rootFolder.isPrefixOf(projectFolder)) {
						// In STARTUP trigger don't perform if there's already
						// at least 1 project from the source locators
						return false;
					}
				}
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.oomph.setup.SetupTask#perform(org.eclipse.oomph.setup.
	 * SetupTaskContext)
	 */
	@Override
	public void perform(SetupTaskContext context) throws Exception {
		EList<SourceLocator> sourceLocators = getSourceLocators();
		EList<String> tasks = getPreSynchronizatonTasks();
		SubMonitor monitor = SubMonitor.convert(context.getProgressMonitor(true));
		monitor.beginTask("", sourceLocators.size() * 2); //$NON-NLS-1$
		try {
			GradleWorkspace workspace = GradleCore.getWorkspace();
			for (SourceLocator sourceLocator : sourceLocators) {
				context.log(NLS.bind(Messages.ImportGradleProjectTaskImpl_0, sourceLocator.getRootFolder()));
				SubMonitor progress = monitor.newChild(2);
				Optional<GradleBuild> gradleBuild = Optional.empty();
				for (IProject project : ROOT.getProjects()) {
					if (!gradleBuild.isPresent()
							&& project.getLocation().equals(new Path(sourceLocator.getRootFolder()))) {
						gradleBuild = workspace.getBuild(project);
						context.log(NLS.bind(Messages.ImportGradleProjectTaskImpl_1, project.getName()));
					}
				}

				GradleBuild newBuild = gradleBuild.orElseGet(new Supplier<GradleBuild>() {
					/*
					 * (non-Javadoc)
					 *
					 * @see java.util.function.Supplier#get()
					 */
					@Override
					public GradleBuild get() {
						BuildConfiguration configuration = BuildConfiguration
								.forRootProjectDirectory(new File(sourceLocator.getRootFolder()))
								.overrideWorkspaceConfiguration(false)
								.gradleDistribution(GradleDistribution.fromBuild()).autoSync(false).build();
						context.log(Messages.ImportGradleProjectTaskImpl_3);
						return workspace.createBuild(configuration);
					}
				});
				if (!tasks.isEmpty()) {
					context.log(Messages.ImportGradleProjectTaskImpl_2);
					newBuild.withConnection(new Function<ProjectConnection, Void>() {

						@Override
						public Void apply(ProjectConnection t) {
							t.newBuild().forTasks(tasks.toArray(new String[0])).run();
							return null;
						}
					}, progress.newChild(1));
				}
				progress.setWorkRemaining(1);

				newBuild.synchronize(progress.newChild(1));
			}
		} finally {
			monitor.done();
		}
	}

} // ImportGradleProjectTaskImpl
