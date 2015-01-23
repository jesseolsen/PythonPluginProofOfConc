package com.github.EclipseChameleonPlugins;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.TemplateTranslator;
import org.python.pydev.core.ICompletionState;
import org.python.pydev.core.ILocalScope;
import org.python.pydev.core.IToken;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.structure.CompletionRecursionException;
import org.python.pydev.editor.codecompletion.CompletionRequest;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant;
import org.python.pydev.editor.codecompletion.revisited.modules.SourceToken;
import org.python.pydev.parser.jython.ast.Name;

public class ChameleonPythonCompletionProposalComputer implements
		IPyDevCompletionParticipant {

	@Override
	public Collection<Object> getGlobalCompletions(CompletionRequest request,
			ICompletionState state) throws MisconfigurationException {
		ArrayList<Object> completions = new ArrayList<Object>();
		if (request.isInCalltip) {
			return completions;
		}

		String qual = request.qualifier;

		String lowerQual = qual.toLowerCase();

		String[] tokensToComplete = new String[] { "MyCompletion1",
				"MyCompletion2", "MyCompletion3", "MyCompletion4" };

		for (String rep : tokensToComplete) {
			String lowerRep = rep.toLowerCase();
			if (!lowerRep.startsWith(lowerQual)) {
				continue;
			}
			
	        Name name = new Name(rep, Name.Load, false);

			completions.add(new SourceToken(name, rep, "", "", ""));
		}
		return completions;
	}

	@Override
	public Collection<Object> getStringGlobalCompletions(
			CompletionRequest request, ICompletionState state)
			throws MisconfigurationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IToken> getCompletionsForMethodParameter(
			ICompletionState state, ILocalScope localScope,
			Collection<IToken> interfaceForLocal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IToken> getCompletionsForTokenWithUndefinedType(
			ICompletionState state, ILocalScope localScope,
			Collection<IToken> interfaceForLocal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Object> getArgsCompletion(ICompletionState state,
			ILocalScope localScope, Collection<IToken> interfaceForLocal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<IToken> getCompletionsForType(ICompletionState state)
			throws CompletionRecursionException {
		// TODO Auto-generated method stub
		return null;
	}
}
