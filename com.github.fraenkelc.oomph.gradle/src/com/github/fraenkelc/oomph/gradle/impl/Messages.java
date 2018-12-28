/**
 * 
 */
package com.github.fraenkelc.oomph.gradle.impl;

import org.eclipse.osgi.util.NLS;

/**
 * @author Christian
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.github.fraenkelc.oomph.gradle.impl.messages"; //$NON-NLS-1$
	public static String ImportGradleProjectTaskImpl_0;
	public static String ImportGradleProjectTaskImpl_1;
	public static String ImportGradleProjectTaskImpl_2;
	public static String ImportGradleProjectTaskImpl_3;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
