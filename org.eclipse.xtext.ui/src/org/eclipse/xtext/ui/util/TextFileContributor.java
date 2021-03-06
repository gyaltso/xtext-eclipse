/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.de) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.util;

import org.eclipse.core.resources.IProject;

/**
 * Simple {@link IProjectFactoryContributor} that gets a file name and text contents and creates a new text file based on this content.
 * 
 * @author Arne Deutsch - Initial contribution and API
 * @since 2.14
 */
public class TextFileContributor implements IProjectFactoryContributor {

	private CharSequence fileName;
	private CharSequence contents;

	public TextFileContributor(CharSequence fileName, CharSequence contents) {
		this.fileName = fileName;
		this.contents = contents;
	}

	@Override
	public void contributeFiles(IProject project, IFileCreator fileWriter) {
		fileWriter.writeToFile(contents, fileName.toString());
	}

}