/*******************************************************************************
 * Copyright (c) 2015, 2019 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.example.arithmetics.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.example.arithmetics.ui.internal.ArithmeticsActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ArithmeticsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(ArithmeticsActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		ArithmeticsActivator activator = ArithmeticsActivator.getInstance();
		return activator != null ? activator.getInjector(ArithmeticsActivator.ORG_ECLIPSE_XTEXT_EXAMPLE_ARITHMETICS_ARITHMETICS) : null;
	}

}
