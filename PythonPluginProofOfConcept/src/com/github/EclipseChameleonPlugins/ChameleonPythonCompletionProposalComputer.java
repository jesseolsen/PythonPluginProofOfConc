package com.github.EclipseChameleonPlugins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension2;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.python.pydev.core.ICompletionState;
import org.python.pydev.core.ILocalScope;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.IToken;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.docutils.PySelection.ActivationTokenAndQual;
import org.python.pydev.core.structure.CompletionRecursionException;
import org.python.pydev.editor.IPySyntaxHighlightingAndCodeCompletionEditor;
import org.python.pydev.editor.codecompletion.AbstractPyCompletionProposalExtension2;
import org.python.pydev.editor.codecompletion.CompletionRequest;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant;
import org.python.pydev.editor.codecompletion.IPyDevCompletionParticipant2;
import org.python.pydev.editor.codecompletion.PyContentAssistant;
import org.python.pydev.shared_interactive_console.console.ui.IScriptConsoleViewer;

public class ChameleonPythonCompletionProposalComputer extends
		AbstractPyCompletionProposalExtension2 implements
		IPyDevCompletionParticipant, IPyDevCompletionParticipant2,
		ICompletionProposalExtension2, ICompletionProposalExtension {

	final static int fLen = 0;
	final static int fAdditionalProposalInfo = 0;
	final static int fContextInformation = 0;

	public ChameleonPythonCompletionProposalComputer(String replacementString,
			int replacementOffset, int replacementLength, int cursorPosition,
			int priority) {
		super(replacementString, replacementOffset, replacementLength,
				cursorPosition, priority);
		// NEVER HIT
	}

	public ChameleonPythonCompletionProposalComputer(String replacementString,
			int replacementOffset, int replacementLength, int cursorPosition,
			Image image, String displayString,
			IContextInformation contextInformation,
			String additionalProposalInfo, int priority, int onApplyAction,
			String args) {
		super(replacementString, replacementOffset, replacementLength,
				cursorPosition, image, displayString, contextInformation,
				additionalProposalInfo, priority, onApplyAction, args);
		// NEVER HIT
	}

	public ChameleonPythonCompletionProposalComputer(
			IPySyntaxHighlightingAndCodeCompletionEditor edit,
			PyContentAssistant pyContentAssistant) {
		// NEVER HIT
		super(null, fLen, fLen, fLen, fAdditionalProposalInfo);
		System.out
				.println("ChameleonPythonCompletionProposalComputer(edit, pyContentAssistant)");
	}

	@Override
	public Collection<Object> getArgsCompletion(ICompletionState arg0,
			ILocalScope arg1, Collection<IToken> arg2) {
		System.out.println("getArgsCompletion()");
		return null;
		// NEVER HIT
	}

	@Override
	public Collection<IToken> getCompletionsForMethodParameter(
			ICompletionState arg0, ILocalScope arg1, Collection<IToken> arg2) {
		System.out.println("getCompletionsForMethodParameter()");
		return null;
		// NEVER HIT
	}

	@Override
	public Collection<IToken> getCompletionsForTokenWithUndefinedType(
			ICompletionState arg0, ILocalScope arg1, Collection<IToken> arg2) {
		System.out.println("getCompletionsForTokenWithUndefinedType()");
		return null;
		// NEVER HIT
	}

	public ChameleonPythonCompletionProposalComputer() {
		// >>>>> BREAKPOINT here gets hit every other keystroke...
		super("ReplacementString", fLen, fLen, fLen, fAdditionalProposalInfo);
		System.out.println("ChameleonPythonCompletionProposalComputer()");
	}

	@Override
	public Collection<Object> getGlobalCompletions(CompletionRequest arg0,
			ICompletionState arg1) throws MisconfigurationException {
		// >>>>> BREAKPOINT here gets hit every other keystroke...
		System.out.println("getGlobalCompletions" + arg0 + " documentOffset="
				+ arg0.documentOffset + " showTemplates=" + arg0.showTemplates);
		String replacementString = "{" + arg0.qualifier + "}";
		int replacementOffset = arg0.documentOffset - arg0.qlen;
		int replacementLength = arg0.qlen;
		int cursorPosition = arg0.documentOffset;
		String displayString = arg0.qualifier;
		final IContextInformation contextInformation = new ContextInformation(
				"displayStr", "message");
		String additionalProposalInfo = "additionalProposalInfo";
		final org.eclipse.swt.graphics.Image image = null;

		final CompletionProposal proposal = new CompletionProposal(
				replacementString, replacementOffset, replacementLength,
				cursorPosition, image, displayString, contextInformation,
				additionalProposalInfo);

		List<ICompletionProposal> proposals = new ArrayList<ICompletionProposal>();
		proposals.add(proposal);
		final Collection<Object> returnProposals = new ArrayList<Object>(
				proposals);
		return returnProposals;
	}

	@Override
	public Collection<Object> getStringGlobalCompletions(
			CompletionRequest arg0, ICompletionState arg1)
			throws MisconfigurationException {
		System.out.println("getStringGlobalCompletions()");
		return null;
		// NEVER HIT
	}

	@Override
	public Collection<IToken> getCompletionsForType(ICompletionState arg0)
			throws CompletionRecursionException {
		// NEVER HIT
		return null;
	}

	@Override
	public Collection<ICompletionProposal> computeConsoleCompletions(
			ActivationTokenAndQual arg0, List<IPythonNature> arg1,
			IScriptConsoleViewer arg2, int arg3) {
		// NEVER HIT
		return null;
	}

	@Override
	public void apply(IDocument arg0, char arg1, int arg2) {
		// NEVER HIT
	}

	@Override
	public int getContextInformationPosition() {
		// NEVER HIT
		return 0;
	}

	@Override
	public char[] getTriggerCharacters() {
		// NEVER HIT
		return null;
	}

	@Override
	public boolean isValidFor(IDocument arg0, int arg1) {
		// NEVER HIT
		return false;
	}

	@Override
	public void apply(ITextViewer arg0, char arg1, int arg2, int arg3) {
		// NEVER HIT
	}

	@Override
	public void selected(ITextViewer arg0, boolean arg1) {
		// NEVER HIT
	}

	@Override
	public void unselected(ITextViewer arg0) {
		// NEVER HIT
	}

	@Override
	public boolean validate(IDocument arg0, int arg1, DocumentEvent arg2) {
		// NEVER HIT
		return false;
	}
}
