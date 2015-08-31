
/*
 *  JScripter Simulation 1.0 - For Java To Script
 *  Copyright (C) 2008-2011  J.J.Liu<jianjunliu@126.com> <http://www.jscripter.org>
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jscripter.sim;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;

import javax.swing.JOptionPane;

import js.*;
import js.core.*;
import js.user.JsXMLHttpRequest;
import jsx.client.Browser;
import jsx.core.ArrayLikes;

/**
 * <p>An abstract <b>internal</b> class for JS Simulation.</p>
 * <p>This <b>internal</b> class is only extended internally in JS Simulation Library.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must report error on resolving an <tt>internal</tt> class. 
 */
public abstract class Simul extends Sim
{
	/**
	 * <p>Internally constructs a JS Simulation.</p>
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor. 
	 */
	protected Simul() {}

	/**
	 * <p>Internally checks if the simulation is limited to JavaScript core features only.</p>
	 * @return <tt>true</tt> if this is a core simulation; <tt>false</tt>, otherwise;
	 * @since 1.0
	 * 
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected abstract boolean isCore();

	/**
	 * <p>Displays a simple message in a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified <tt>message</tt> to the 
	 * user in a dialog box. The dialog box contains an OK button the user can click to 
	 * dismiss it. The dialog box is typically modal, and the call to this function 
	 * typically blocks until the dialog is dismissed.</p>
	 * <p>Perhaps the most common use of this method is to display error messages when the 
	 * user's input to some form element is invalid in some way. The alert dialog box can 
	 * inform the user of the problem and explain what needs to be corrected to avoid the 
	 * problem in the future</p>
	 * <p>The appearance of the dialog box is platform-dependent, but it generally contains 
	 * graphics that indicate an error, warning, or alert message of some kind. While it can 
	 * display any desired message, the alert graphics of the dialog box mean that this 
	 * method is not appropriate for simple informational messages like "Welcome to my blog"</p>
	 * <p>Note that the <tt>message</tt> displayed in the dialog box is a string of 
	 * plain text, not formatted HTML. You can use the newline character "\n" in your strings 
	 * to break your message across multiple lines. You can also do some rudimentary 
	 * formatting using spaces and can approximate horizontal rules with underscore characters, 
	 * but the results depend greatly on the font used in the dialog box and thus are 
	 * system-dependent.</p>
	 * @param message The plain-text (not HTML) string to display in a dialog box popped up 
	 * over the current window.
	 * @see Js#alert(Object)
	 * @see jsx.client.Global#alert(Object)
	 * @see jsx.client.Client#alert(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected void alert(Object message) {
		JOptionPane.showMessageDialog(
				null,
				Js.toString(message),
				"[JavaJavaScript Application]",
				JOptionPane.WARNING_MESSAGE
		);
	}

	/**
	 * <p>Asks a yes-or-no question with a dialog box.</p>
	 * <p>In JavaScript, this method displays the specified question in a dialog box. The 
	 * dialog box contains OK and Cancel buttons that the user can use to answer the 
	 * question. If the user clicks the OK button, it returns <tt>true</tt>. If the 
	 * user clicks Cancel, it returns <tt>false</tt>.</p>
	 * <p>The dialog box that is displayed by the this method is modal. That is, it blocks 
	 * all user input to the main browser window until the user dismisses the dialog box 
	 * by clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call to 
	 * this method, and subsequent statements are not executed until the user responds to 
	 * the dialog box.</p>
	 * <p>There is no way to change the labels that appear in the buttons of the dialog box 
	 * (to make them read Yes and No, for example). Therefore, you should take care to 
	 * phrase your question or message so that OK and Cancel are suitable responses.</p>
	 * @param question The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should generally express a question you want the user to answer.
	 * @return <tt>true</tt> if the user clicks the OK button; <tt>false</tt> if 
	 * the user clicks the Cancel button.
	 * @see Js#confirm(Object)
	 * @see jsx.client.Global#confirm(Object)
	 * @see jsx.client.Client#confirm(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected boolean confirm(Object question) {
		return JOptionPane.showConfirmDialog(
				null,
				Js.toString(question),
				"[JavaJavaScript Application]",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE
		) == JOptionPane.YES_OPTION;
	}

	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays text input field and OK and Cancel buttons in a dialog box. 
	 * Platform-dependent graphics in the dialog box help indicate to the user that an 
	 * input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @see #prompt(Object, Object)
	 * @see Js#prompt(Object)
	 * @see jsx.client.Global#prompt(Object)
	 * @see jsx.client.Client#prompt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String prompt(Object message) {
		return JOptionPane.showInputDialog(
				null,
				Js.toString(message)
		);
	}

	/**
	 * <p>Asks for simple string input with a dialog box.</p>
	 * <p>This method displays the specified message in a dialog box that also contains a 
	 * text input field and OK and Cancel buttons. Platform-dependent graphics in the 
	 * dialog box help indicate to the user that an input is desired.</p>
	 * <p>If the user clicks the Cancel button, the method returns <tt>null</tt>. If 
	 * the user clicks the OK button, it returns the text currently displayed in the 
	 * input field.</p>
	 * <p>The dialog box that is displayed by this method is modal. That is, it blocks all 
	 * user input to the main browser window until the user dismisses the dialog box by 
	 * clicking on the OK or Cancel buttons. Since this method returns a value depending 
	 * on the user's response to the dialog box, JavaScript execution pauses in the call 
	 * to this method, and subsequent statements are not executed until the user responds 
	 * to the dialog box.</p>
	 * @param message The plain-text (not HTML) string to be displayed in the dialog box. 
	 * It should ask the user to enter the information you want.
	 * @param defaultInput A string that is displayed as the default input in the dialog 
	 * box. Pass the empty string ("") to make the method display an empty input box.
	 * @return The string entered by the user, the empty string if the user did not enter 
	 * a string, or <tt>null</tt> if the user clicked Cancel.
	 * @see #prompt(Object)
	 * @see Js#prompt(Object, Object)
	 * @see jsx.client.Global#prompt(Object, Object)
	 * @see jsx.client.Client#prompt(Object, Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String prompt(Object message, Object defaultInput) {
		return JOptionPane.showInputDialog(
				null,
				Js.toString(message),
				Js.toString(defaultInput)
		);
	}

	/**
	 * <p>Cancels periodic execution of code.</p>
	 * <p>This method stops the repeated execution of code that was started by a call to 
	 * {@link #setInterval(JsFunction, Number)}. <tt>intervalId</tt> must be the value 
	 * that was returned by a call to {@link #setInterval(JsFunction, Number)}.</p>
	 * @param intervalId The value returned by the corresponding call to {@link #setInterval(JsFunction, Number)}.
	 * @see #setInterval(JsFunction, Number)
	 * @see Js#clearInterval(Object)
	 * @see jsx.client.Global#clearInterval(Object)
	 * @see jsx.client.Client#clearInterval(Object)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final void clearInterval(Object intervalId) {
		if (intervalId instanceof Thread) {
			((SimThread)intervalId).clear();
		} else if (!isCore()) {
			Js.win().clearInterval(intervalId);
		}
	}

	/**
	 * <p>Cancels a pending timeout operation.</p>
	 * <p>This method cancels the execution of code that has been deferred with the 
	 * {@link #setTimeout(JsFunction, Number)} method. The <tt>timeoutId</tt> argument 
	 * is a value returned by the call to {@link #setTimeout(JsFunction, Number)} and 
	 * identifies which deferred code to cancel.</p>
	 * @param timeoutId A value returned by {@link #setTimeout(JsFunction, Number)} that 
	 * identifies the timeout to be canceled.
	 * @see #clearTimeout(Object)
	 * @see Js#clearTimeout(Object)
	 * @see jsx.client.Global#clearTimeout(Object)
	 * @see jsx.client.Client#clearTimeout(Object)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final void clearTimeout(Object timeoutId) {
		if (timeoutId instanceof Thread) {
			((SimThread)timeoutId).clear();
		} else if (!isCore()) {
			Js.win().clearTimeout(timeoutId);
		}
	}

	/**
	 * <p>Executes code at periodic intervals.</p>
	 * <p>Note that the specified function is executed in the context of the Window object, 
	 * that is, the Window object is the value of the <tt>this</tt> keyword of the 
	 * executing context of the function. This is <tt>true</tt> even if the call to 
	 * {@link #setTimeout(JsFunction, Number)} occurred within a function with a longer 
	 * scope chain.</p>
	 * @param f A function to be periodically invoked.
	 * @param interval The interval, in milliseconds, between invocations of the function.
	 * @return A value that can be passed to {@link #clearInterval(Object)} method to 
	 * cancel the periodic execution of the function.
	 * @see #clearInterval(Object)
	 * @see Js#setInterval(JsFunction)
	 * @see Js#setInterval(JsFunction, Number)
	 * @see jsx.client.Global#setInterval(JsFunction)
	 * @see jsx.client.Global#setInterval(JsFunction, Number)
	 * @see jsx.client.Client#setInterval(JsFunction)
	 * @see jsx.client.Client#setInterval(JsFunction, Number)
	 * @see jsx.Interval
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final Object setInterval(JsFunction<?> f, Number interval) {
		if (!isCore()) {
			if (Browser.isIE) {
				return interval != null ? Js.win().setInterval(f, interval) : Js.win().setInterval(f, 1);
			}
		}
		return new SimInterval(f, interval);
	}

	/**
	 * <p>Executes code after a specified amount of time elapses.</p>
	 * <p>Note that this method executes the specified function only once. The function is 
	 * executed in the context of the Window object, that is, the Window object is the 
	 * value of the <tt>this</tt> keyword of the executing context of the function. 
	 * This is <tt>true</tt> even if the call to {@link #setTimeout(JsFunction, Number)} 
	 * occurred within a function with a longer scope chain.</p>
	 * @param f A function to be invoked after the <tt>delay</tt> has elapsed.
	 * @param delay The amount of time, in milliseconds, before the function should be executed.
	 * @return A value that can be passed to the {@link #clearTimeout(Object)} method to 
	 * cancel the execution of the function.
	 * @see #clearTimeout(Object)
	 * @see Js#setTimeout(JsFunction)
	 * @see Js#setTimeout(JsFunction, Number)
	 * @see jsx.client.Global#setTimeout(JsFunction)
	 * @see jsx.client.Global#setTimeout(JsFunction, Number)
	 * @see jsx.client.Client#setTimeout(JsFunction)
	 * @see jsx.client.Client#setTimeout(JsFunction, Number)
	 * @see jsx.Timeout
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final Object setTimeout(JsFunction<?> f, Number delay) {
		if (!isCore()) {
			if (Browser.isIE) {
				return delay != null ? Js.win().setTimeout(f, delay) : Js.win().setTimeout(f, 1);
			}
		}
		return new SimTimeout(f, delay);
	}

	/**
	 * <p>Decodes a string escaped with {@link #encodeURI(Object)}.</p>
	 * @param s A string that contains an encoded URI or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced with 
	 * the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURI(Object)
	 * @see Js#decodeURI(Object)
	 * @see jsx.client.Global#decodeURI(Object)
	 * @see jsx.client.Client#decodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String decodeURI(Object s) {
		String str = Js.toString(s);
		if (str == null) {
			return null;
		}
		String res = null;
		try {
			res = URLDecoder.decode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			res = str;  
		}
		return res;
	}

	/**
	 * <p>Decodes a string escaped with {@link #encodeURIComponent(Object)}.</p>
	 * @param s A string that contains an encoded URI component or other text to be decoded.
	 * @return A copy of <tt>s</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if one or more of the 
	 * escape sequences in <tt>s</tt> is malformed and cannot be correctly decoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #encodeURIComponent(Object)
	 * @see Js#decodeURIComponent(Object)
	 * @see jsx.client.Global#decodeURIComponent(Object)
	 * @see jsx.client.Client#decodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String decodeURIComponent(Object s) {
		return decodeURI(s);
	}

	/**
	 * <p>Encodes a URI by escaping certain characters.</p>
	 * @param uri A string that contains the URI or other text to be encoded.
	 * @return A copy of <tt>uri</tt>, with any hexadecimal escape sequences replaced 
	 * with the characters they represent..
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURI(Object)
	 * @see Js#encodeURI(Object)
	 * @see jsx.client.Global#encodeURI(Object)
	 * @see jsx.client.Client#encodeURI(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String encodeURI(Object uri) {
		String str = Js.toString(uri);
		String res = null;
		try {
			res = URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			res = str;
		}
		return res;
	}

	/**
	 * <p>Encodes a URI component by escaping certain characters.</p>
	 * @param uri A string that contains a portion of a URI or other text to be encoded.
	 * @return The opaque global object with the client-side support.
	 * @throws RuntimeException JavaScript throws a <tt>URIError</tt> if <tt>s</tt> 
	 * contains malformed unicode surrogate pairs and cannot be encoded. See 
	 * {@link Js#err(Object)} and {@link js.core.JsURIError} for JS Simulation.
	 * @see #decodeURIComponent(Object)
	 * @see Js#encodeURIComponent(Object)
	 * @see jsx.client.Global#encodeURIComponent(Object)
	 * @see jsx.client.Client#encodeURIComponent(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String encodeURIComponent(Object uri) {
		String str = encodeURI(uri);
		return str == null ? null : str.replaceAll("\\+", "%20")
				                       .replaceAll("\\%21", "!")
				                       .replaceAll("\\%27", "'")
				                       .replaceAll("\\%28", "(")
				                       .replaceAll("\\%29", ")")
				                       .replaceAll("\\%7E", "~");
	}

	/**
	 * <p>Encodes a string by replacing certain characters with escape sequences.</p>
	 * @param s The string that is to be "escaped" or encoded.
	 * @return An encoded copy of <tt>s</tt> in which certain characters have been 
	 * replaced by hexadecimal escape sequences.
	 * @see #unescape(Object)
	 * @see Js#escape(Object)
	 * @see jsx.client.Global#escape(Object)
	 * @see jsx.client.Client#escape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String escape(Object s) {
		String str = Js.toString(s);
		StringBuilder sb = new StringBuilder();   
		sb.ensureCapacity(str.length() * 6);   
		for (int i = 0; i < str.length(); i++) {   
			char c = str.charAt(i);   
			if (Character.isDigit(c) ||
			    Character.isLowerCase(c) ||
			    Character.isUpperCase(c)) {   
				sb.append(c);   
			} else if (c < 256) {   
				sb.append("%");   
				if (c < 16) {
					sb.append("0");   
				}
				sb.append(Integer.toString(c, 16));   
			} else {   
				sb.append("%u");   
				sb.append(Integer.toString(c, 16));   
			}   
		}   
		return sb.toString();   
	}

	/**
	 * <p>Decodes a string encoded with {@link #escape(Object)}.</p>
	 * @param s The string that is to be decoded or "unescaped".
	 * @return A decoded copy of <tt>s</tt>.
	 * @see #escape(Object)
	 * @see Js#unescape(Object)
	 * @see jsx.client.Global#unescape(Object)
	 * @see jsx.client.Client#unescape(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected String unescape(Object s) {
		String str = Js.toString(s);
		StringBuilder sb = new StringBuilder();   
		sb.ensureCapacity(str.length());   
		int pos = 0, cur = 0;   
		while (pos < str.length()) {   
			cur = str.indexOf("%", pos);   
			if (cur == pos) {   
				if (str.charAt(cur + 1) == 'u') {   
					sb.append(
							(char)Integer.parseInt(
									str.substring(cur + 2, cur + 6),
									16
							)
					);   
					pos = cur + 6;   
				} else {   
					sb.append(
							(char)Integer.parseInt(
									str.substring(cur + 1, cur + 3),
									16
							)
					);   
					pos = cur + 3;   
				}   
			} else {   
				if (cur == -1) {   
					sb.append(str.substring(pos));   
					pos = str.length();   
				} else {   
					sb.append(str.substring(pos, cur));   
					pos = cur;   
				}   
			}   
		}   
		return sb.toString();   
	}

	/**
	 * <p>Evaluates the argument string as JavaScript code and returns the result.</p>
	 * <p>In JavaScript, <tt>eval()</tt> is a global method that evaluates a string of 
	 * JavaScript code in the current lexical scope. If the code contains an expression, 
	 * eval evaluates the expression and returns its value. If the code contains a 
	 * JavaScript statement or statements, it executes those statements and returns the 
	 * value, if any, returned by the last statement. If the code does not return any 
	 * value, <tt>eval()</tt> returns undefined. Finally, if code throws an exception, 
	 * <tt>eval()</tt> passes that exception on to the caller.</p>
	 * <p>The global function <tt>eval()</tt> provides a very powerful capability to 
	 * the JavaScript language, but its use is infrequent in real-world programs. 
	 * Obvious uses are to write programs that act as recursive JavaScript interpreters 
	 * and to write programs that dynamically generate and evaluate JavaScript code.</p>
	 * <p>Most JavaScript functions and methods that expect string arguments accept 
	 * arguments of other types as well and simply convert those argument values to 
	 * strings before proceeding. <tt>eval()</tt> does not behave like this. If the 
	 * code argument is not a primitive string, it is simply returned unchanged. Be 
	 * careful, therefore, that you do not inadvertently pass a String object to 
	 * <tt>eval()</tt> when you intended to pass a primitive string value.</p>
	 * <p>For purposes of implementation efficiency, the ECMAScript v3 standard places 
	 * an unusual restriction on the use of <tt>eval()</tt>. An ECMAScript implementation 
	 * is allowed to throw an <tt>EvalError</tt> exception if you attempt to overwrite 
	 * the <tt>eval</tt> property or if you assign the <tt>eval()</tt> method to another 
	 * property and attempt to invoke it through that property.</p>
	 * @param s A string of JavaScript code.
	 * @return The return value of the evaluated code, if any.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> if the argument string 
	 * does not contain legal JavaScript, a <tt>EvalError</tt> if the <tt>eval</tt> function 
	 * was called illegally, through an identifier other than "eval", or other JavaScript error 
	 * generated by the code passed. See {@link Js#err(Object)}, {@link js.core.JsSyntaxError}, 
	 * {@link js.core.JsEvalError}, and {@link js.core.JsError} for JS Simulation.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	public Object eval(Object s) {
		return Js.core().eval(s);
	}

	/**
	 * <p>Tests whether a value is a finite number.</p>
	 * @param v The number to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) a finite 
	 * number, or <tt>false</tt> if <tt>v</tt> is <tt>NaN</tt> (not a number) 
	 * or positive or negative infinity.
	 * @see Js#isFinite(Object)
	 * @see jsx.client.Global#isFinite(Object)
	 * @see jsx.client.Client#isFinite(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected boolean isFinite(Object v) {
		return false;
	}

	/**
	 * <p>Tests whether a value is the not-a-number value.</p>
	 * <p>In JavaScript, This function tests its argument to determine whether it is the 
	 * value <tt>NaN</tt>, which represents an illegal number (such as the result of 
	 * division by zero). This function is required because comparing a <tt>NaN</tt> 
	 * with any value, including itself, always returns <tt>false</tt>, so it is not 
	 * possible to test for <tt>NaN</tt> with the == or === operators.</p>
	 * <p>A common use in JavaScript of this function is to test the results of {@link #parseFloat(Object)} 
	 * and {@link #parseInt(Object)} to determine if they represent legal numbers. You can 
	 * also use {@link #isNaN(Object)} to check for arithmetic errors, such as division by 
	 * zero</p>
	 * @param v The value to be tested.
	 * @return <tt>true</tt> if <tt>v</tt> is (or can be converted to) the special 
	 * not-a-number value; <tt>false</tt> if <tt>v</tt> is any other value.
	 * @see Js#isNaN(Object)
	 * @see jsx.client.Global#isNaN(Object)
	 * @see jsx.client.Client#isNaN(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected boolean isNaN(Object v) {
		return false;
	}

	/**
	 * <p>Parses an integer from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * @param value The string to be parsed.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @see #parseFloat(Object)
	 * @see #parseInt(Object, int)
	 * @see Js#parseInt(Object)
	 * @see jsx.client.Global#parseInt(Object)
	 * @see jsx.client.Client#parseInt(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Integer parseInt(Object value) {
		String s = Js.toString(value);
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException nfe) {
			return null;
		}
	}

	/**
	 * <p>Parses an integer from a string in a base specified.</p>
	 * <p>In JavaScript, this function parses and returns the first number (with an 
	 * optional leading minus sign) that occurs in <tt>value</tt>. Parsing stops, and 
	 * the value is returned, when it encounters a character in <tt>value</tt> that is 
	 * not a valid digit for the specified radix. If <tt>value</tt> does not begin with 
	 * a number that it can parse, the function returns the not-a-number value <tt>NaN</tt>. 
	 * Use the {@link #isNaN(Object)} function to test for this return value.</p>
	 * <p>The <tt>radix</tt> argument specifies the base of the number to be parsed. 
	 * Specifying 10 makes this function parse a decimal number. The value 8 specifies that 
	 * an octal number (using digits 0 through 7) is to be parsed. The value 16 specifies 
	 * a hexadecimal value, using digits 0 through 9 and letters A through F. <tt>radix</tt> 
	 * can be any value between 2 and 36.</p>
	 * <p>If <tt>radix</tt> is 0 or is undefined, this function tries to determine the 
	 * radix of the number from <tt>value</tt>. If <tt>value</tt> begins (after an 
	 * optional minus sign) with 0x, it parses the remainder of <tt>value</tt> as a 
	 * hexadecimal number. If <tt>value</tt> begins with a 0, the ECMAScript v3 standard 
	 * allows an implementation of this function to interpret the following characters as 
	 * an octal number or as a decimal number. Otherwise, if <tt>value</tt> begins with 
	 * a digit from 1 through 9, it parses it as a decimal number</p>
	 * @param value The string to be parsed.
	 * @param radix An optional integer argument that represents the radix (or base) of the 
	 * number to be parsed. If this argument is undefined or is 0, the number is parsed in 
	 * base 10 or in base 16 if it begins with 0x or 0X. If this argument is less than 2 or 
	 * greater than 36, <tt>NaN</tt> is returned.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin with 
	 * a valid integer. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when it cannot parse <tt>value</tt>.
	 * @see #parseInt(Object)
	 * @see Js#parseInt(Object, int)
	 * @see jsx.client.Global#parseInt(Object, int)
	 * @see jsx.client.Client#parseInt(Object, int)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Integer parseInt(Object value, int radix) {
		String s = Js.toString(value);
		try {
			return Integer.parseInt(s, radix);
		} catch (NumberFormatException nfe) {
			return null;
		}
	}

	/**
	 * <p>Parses a number from a string.</p>
	 * <p>In JavaScript, this function parses and returns the first number that occurs in 
	 * <tt>value</tt>. Parsing stops, and the value is returned, when it encounters a 
	 * character in <tt>value</tt> that is not a valid part of the number. If <tt>value</tt> 
	 * does not begin with a number that it can parse, the function returns the not-a-number 
	 * value <tt>NaN</tt>. Test for this return value with the {@link #isNaN(Object)} 
	 * function. If you want to parse only the integer portion of a number, use {@link #parseInt(Object)} 
	 * or {@link #parseInt(Object, int)} instead of this one.</p>
	 * @param value The string to be parsed and converted to a number.
	 * @return The parsed number, or <tt>NaN</tt> if <tt>value</tt> does not begin 
	 * with a valid number. In JavaScript 1.0, this function returns 0 instead of <tt>NaN</tt> 
	 * when <tt>value</tt> cannot be parsed as a number.
	 * @see #parseInt(Object)
	 * @see Js#parseFloat(Object)
	 * @see jsx.client.Global#parseFloat(Object)
	 * @see jsx.client.Client#parseFloat(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Double parseFloat(Object value) {
		String s = Js.toString(value);
		try {
			return Double.parseDouble(s);
		} catch (NumberFormatException nfe) {
			return null;
		}
	}

	/**
	 * <p>Returns an instance of XMLHttpRequest in Java version.</p>
	 * @return The instance of XMLHttpRequest in Java version.
	 * @see js.dom.DOM.XMLHttpRequest#create()
	 * @see js.dom.DOM.XMLHttpRequest#invoke()
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsXMLHttpRequest http() {
		return Browser.isIE ? null : new SimXMLHttpRequest();
	}

	/**
	 * <p>Creates an OLE Automation (ActiveX) object for Internet Explorer.</p>
	 * @param cls The class of the OLE Automation (ActiveX) object being created.
	 * @return The newly created OLE Automation (ActiveX) object.
	 * @see js.dom.DOM.ActiveXObject#create(Object)
	 * @see js.dom.DOM.ActiveXObject#create(String)
	 * @see js.dom.DOM.ActiveXObject#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected JsObject activeX(String cls) {
		if (Browser.isIE) {
			if ("MSXML2.XMLHTTP.5.0".equals(cls) ||
			    "MSXML2.XMLHTTP.4.0".equals(cls) ||
			    "MSXML2.XMLHTTP.3.0".equals(cls) ||
			    "MSXML2.XMLHTTP"    .equals(cls) ||
			    "Microsoft.XMLHTTP" .equals(cls)) {
				return new SimXMLHttpRequest();
			}
		}
		return null;
	}

	/**
	 * <p>Gets the list of the property names of an object.</p>
	 * @param o The object.
	 * @return The list of the property names of the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected abstract ArrayLike<String> keys(JsObject o);

	/**
	 * <p>Gets an iterator of members of an object.</p>
	 * @param o The object.
	 * @return An {@link Iterator} of the {@link js.Var.Mid} of the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	public final Iterator<Mid> iterator(ObjectLike o) {
		return ((SimObjectLike)o).iterator();
	}

	/**
	 * <p>Gets the list of the property names of an object.</p>
	 * @param o The object.
	 * @return The list of the property names of the object.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<String> keys(ObjectLike o) {
		if (o instanceof SimObjectLike) {
			ArrayLike<String> ret = new Vars<String>().var();
			Iterator<Mid> it = iterator((SimObjectLike)o);
			while (it.hasNext()) {
				ret.push(it.next().toString());
			}
			return ret;
		}
		return keys((JsObject)o);
	}

	/**
	 * <p>Copies all the properties of <tt>a</tt> to <tt>o</tt>.</p>
	 * @param o The object that the properties being copied to.
	 * @param a The object that the properties being copied from.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected abstract void apply(JsObject o, ObjectLike a);

	/**
	 * <p>Copies all the properties of <tt>a</tt> to <tt>o</tt>.</p>
	 * @param o The object that the properties being copied to.
	 * @param a The object that the properties being copied from.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected void apply(ObjectLike o, ObjectLike a) {
		if (isCore() || o instanceof SimObjectLike) {
			ArrayLike<String> keys = Js.keys(a);
			for (int i = 0, len = ArrayLikes.length(keys); i < len; i++) {
				String k = keys.get(i);
				o.var(k, a.var(k));
			}
		} else {
			apply((JsObject)o, a);
		}
	}

	/**
	 * <p>Creates and return a <tt>Cases</tt> cache.</p>
	 * @return The newly created <tt>Cases</tt> cache.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final Cases cases() {
		return new SimCases();
	}

	/**
	 * <p>Creates an empty array.</p>
	 * @return The empty array.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array()
	 * @see Vars#var()
	 * @see js.core.JsArray#JsArray()
	 * @see js.core.JsGlobal.Array#create()
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> ArrayLike<T> array() {
		return new SimArrayLike<T>(new SimArrayList<T>());
	}

	/**
	 * <p>Gets the array-like representation of a generic array.</p>
	 * @param a A generic array
	 * @return The array-like representation.
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(Object[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsArray#JsArray(Object[])
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T> ArrayLike<T> array(T[] a) {
		return new SimArrayLike<T>(new SimArrayObject<T>(a));
	}

	/**
	 * <p>Gets the array-like representation of a boolean array.</p>
	 * @param a A boolean array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(boolean[])
	 * @see js.core.JsArray#JsArray(boolean[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Boolean> array(boolean[] a) {
		return new SimArrayLike<Boolean>(new SimArrayBoolean(a));
	}

	/**
	 * <p>Gets the array-like representation of a byte array.</p>
	 * @param a A byte array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(byte[])
	 * @see js.core.JsArray#JsArray(byte[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Byte> array(byte[] a) {
		return new SimArrayLike<Byte>(new SimArrayByte(a));
	}

	/**
	 * <p>Gets the array-like representation of a char array.</p>
	 * @param a A char array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(char[])
	 * @see js.core.JsArray#JsArray(char[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Character> array(char[] a) {
		return new SimArrayLike<Character>(new SimArrayCharacter(a));
	}

	/**
	 * <p>Gets the array-like representation of a short array.</p>
	 * @param a A short array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(short[])
	 * @see js.core.JsArray#JsArray(short[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Short> array(short[] a) {
		return new SimArrayLike<Short>(new SimArrayShort(a));
	}

	/**
	 * <p>Gets the array-like representation of an int array.</p>
	 * @param a An int array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(int[])
	 * @see js.core.JsArray#JsArray(int[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Integer> array(int[] a) {
		return new SimArrayLike<Integer>(new SimArrayInteger(a));
	}

	/**
	 * <p>Gets the array-like representation of a long array.</p>
	 * @param a A long array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(float[])
	 * @see #array(double[])
	 * @see Js#array(long[])
	 * @see js.core.JsArray#JsArray(long[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Long> array(long[] a) {
		return new SimArrayLike<Long>(new SimArrayLong(a));
	}

	/**
	 * <p>Gets the array-like representation of a float array.</p>
	 * @param a A float array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(double[])
	 * @see Js#array(float[])
	 * @see js.core.JsArray#JsArray(float[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Float> array(float[] a) {
		return new SimArrayLike<Float>(new SimArrayFloat(a));
	}

	/**
	 * <p>Gets the array-like representation of a double array.</p>
	 * @param a A double array
	 * @return The array-like representation.
	 * @see #array(Object[])
	 * @see #array(boolean[])
	 * @see #array(byte[])
	 * @see #array(char[])
	 * @see #array(short[])
	 * @see #array(int[])
	 * @see #array(long[])
	 * @see #array(float[])
	 * @see Js#array(double[])
	 * @see js.core.JsArray#JsArray(double[])
	 * @see js.core.JsArray#JsArray(js.core.JsObject)
	 * @see js.core.JsGlobal.Array#create(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ArrayLike<Double> array(double[] a) {
		return new SimArrayLike<Double>(new SimArrayDouble(a));
	}

	/**
	 * <p>Creates a date object set to the current system date and time.</p>
	 * @return The newly created date object.
	 * @see #date(Number)
	 * @see #date(String)
	 * @see Js#date()
	 * @see js.core.JsGlobal.Date#create()
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected DateLike date() {
		return new SimDateLike();
	}
	/**
	 * <p>Creates a date object from a numeric representation in milliseconds.</p>
	 * @param n A numeric representation of date in milliseconds.
	 * @return The newly created date object.
	 * @see #date()
	 * @see #date(String)
	 * @see Js#date(Number)
	 * @see js.core.JsDate#JsDate(Number)
	 * @see js.core.JsDate#JsDate(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Number)
	 * @see js.core.JsGlobal.Date#create(NumberLike)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected DateLike date(Number n) {
		return new SimDateLike(n);
	}
	/**
	 * <p>Creates a date object from a string representation.</p>
	 * @param s A string representation of date.
	 * @return The newly created date object.
	 * @see #date()
	 * @see #date(Number)
	 * @see Js#date(String)
	 * @see js.core.JsDate#JsDate(String)
	 * @see js.core.JsDate#JsDate(StringLike)
	 * @see js.core.JsGlobal.Date#create(Object)
	 * @see js.core.JsGlobal.Date#create(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected DateLike date(String s) {
		return new SimDateLike(s);
	}

	/**
	 * <p>Returns the math-like object.</p>
	 * @return The math-like object.
	 * @see Js#math()
	 * @see js.core.JsGlobal.Math
	 * @see jsx.core.Maths
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected MathLike math() {
		return SimMathLike.get();
	}

	/**
	 * <p>Creates and returns a newly created object.</p>
	 * @return The newly created object.
	 * @see #object(Object)
	 * @see Js#object()
	 * @see Initializer#var()
	 * @see js.core.JsObject#JsObject()
	 * @see js.core.JsGlobal.Object#create()
	 * @see js.core.JsGlobal.Object#invoke()
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ObjectLike object() {
		return new SimObjectLike();
	}

	/**
	 * <p>Converts a value to an object and returns it.</p>
	 * @param o A value to be converted to object. If this argument is a primitive value, 
	 * this method creates a corresponding object for it. Otherwise, the method returns 
	 * the object itself.
	 * @return The converted or created object. If the argument is a primitive value, 
	 * this method returns a corresponding object for it. Otherwise, the method returns 
	 * the object argument itself.
	 * @see #object()
	 * @see Js#object(Object)
	 * @see js.core.JsObject#JsObject(JsObject)
	 * @see js.core.JsGlobal.Object#create(Boolean)
	 * @see js.core.JsGlobal.Object#create(JsBoolean)
	 * @see js.core.JsGlobal.Object#create(Value)
	 * @see js.core.JsGlobal.Object#create(Number)
	 * @see js.core.JsGlobal.Object#create(NumberLike)
	 * @see js.core.JsGlobal.Object#create(String)
	 * @see js.core.JsGlobal.Object#create(StringLike)
	 * @see js.core.JsGlobal.Object#invoke(Boolean)
	 * @see js.core.JsGlobal.Object#invoke(JsBoolean)
	 * @see js.core.JsGlobal.Object#invoke(Value)
	 * @see js.core.JsGlobal.Object#invoke(Number)
	 * @see js.core.JsGlobal.Object#invoke(NumberLike)
	 * @see js.core.JsGlobal.Object#invoke(String)
	 * @see js.core.JsGlobal.Object#invoke(StringLike)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected ObjectLike object(Object o) {
		if (o == null) {
			return null;
		} else if (o instanceof ObjectLike) {
			return (ObjectLike)o;
		} else if (o instanceof Var<?>) {
			return object(((Var<?>)o).var());
		} else {
			return JsGlobal.Object.with().invoke(o);
		}
	}

	/**
	 * <p>Creates a regular expression with the specified pattern.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @return A new regular expression object, with the specified pattern.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression. See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} 
	 * for JS Simulation.
	 * @see #re(String, String)
	 * @see Js#re(String)
	 * @see js.core.JsRegExp#JsRegExp(String)
	 * @see js.core.JsGlobal.RegExp#create(Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected RegExpLike re(String regex) {
		return new SimRegExpLike(regex);
	}

	/**
	 * <p>Creates a regular expression with the specified pattern and flags.</p>
	 * @param regex A string that specifies the pattern of the regular expression.
	 * @param flags An optional string containing any of the "g", "i", and "m" attributes 
	 * that specify global, case-insensitive, and multiline matches, respectively. The "m" 
	 * attribute is not available prior to ECMAScript standardization.
	 * @return A new regular expression object, with the specified pattern and flags.
	 * @throws RuntimeException JavaScript throws a <tt>SyntaxError</tt> If <tt>regex</tt> 
	 * is not a legal regular expression, or if <tt>flags</tt> contains characters other than 
	 * "g", "i", and "m". See {@link Js#err(Object)} and {@link js.core.JsSyntaxError} for 
	 * JS Simulation.
	 * @see #re(String)
	 * @see Js#re(String, String)
	 * @see js.core.JsRegExp#JsRegExp(String, String)
	 * @see js.core.JsGlobal.RegExp#create(Object, Object)
	 * @see js.core.JsGlobal.RegExp#create(Vars)
	 * @see js.core.JsGlobal.RegExp#invoke(Object, Object)
	 * @see js.core.JsGlobal.RegExp#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected RegExpLike re(String regex, String flags) {
		return new SimRegExpLike(regex, flags);
	}

	/**
	 * <p>Converts a numeric value to a number object and returns it.</p>
	 * @param n A numeric value to be converted to number object.
	 * @return The number object.
	 * @see js.core.JsNumber#JsNumber(Number)
	 * @see js.core.JsNumber#JsNumber(Value)
	 * @see js.core.JsGlobal.Number#create(Object)
	 * @see js.core.JsGlobal.Number#create(Vars)
	 * @see js.core.JsGlobal.Number#invoke(Object)
	 * @see js.core.JsGlobal.Number#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected <T extends Number> NumberLike<T> numberLike(T n) {
		return new SimNumberLike<T>(n);
	}

	/**
	 * <p>Converts a string value to a string object and returns it.</p>
	 * @param s A string value to be converted to string object.
	 * @return The string object.
	 * @see js.core.JsString#JsString(String)
	 * @see js.core.JsString#JsString(Var)
	 * @see js.core.JsGlobal.String#create(Object)
	 * @see js.core.JsGlobal.String#create(Vars)
	 * @see js.core.JsGlobal.String#invoke(Object)
	 * @see js.core.JsGlobal.String#invoke(Vars)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected StringLike stringLike(String s) {
		return new SimStringLike(s);
	}

	/**
	 * <p>Connects to a Java class in an applet and returns a LiveConnect class.</p>
	 * @param applet The applet ID where the Java class is to be connected to.
	 * @param cls The Java class to be connected to.
	 * @return The LiveConnect class connected to the Java class.
	 * @see #connect(Object)
	 * @see Js#connect(String, String)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected LiveClass connect(String applet, String cls) {
		try {
			return new SimLiveClass(cls);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * <p>Connects to a Java object and returns a LiveConnect object.</p>
	 * @param obj The Java object to be connected to.
	 * @return The LiveConnect object connected to the Java object.
	 * @see #connect(String, String)
	 * @see Js#connect(Object)
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected LiveObject connect(Object obj) {
		return new SimLiveObject(obj);
	}

	final static Class<?>[] aTypes(Vars<String> atypes) {
		ArrayLike<String> a = atypes.var();
		int len = a.length();
		Class<?>[] ret = new Class<?>[len];
		for (int i = 0; i < len; i++) {
			try {
				ret[i] = Class.forName(a.get(i));
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}
		return ret;
	}

	final static Object[] args(Vars<?> args) {
		ArrayLike<?> arr = args.var();
		int len = arr.length();
		Object[] ret = new Object[len];
		for (int i = 0; i < len; i++) {
			ret[i] = Js.valueOf(arr.get(i));
		}
		return ret;
	}

	/**
	 * <p>Creates an integer literal.</p>
	 * <p>This method is used to create formatted integer literal in re-compiled JavaScript 
	 * code. A re-compiler leaves the literal as it is without even parsing check but JS 
	 * Simulations parse it to an integer and throws RuntimeException if it is malformatted.</p>
	 * @param s The literal text of an integer.
	 * @return The integer literal.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected int integer(String s) {
		s = s.trim();
		if (s.startsWith("0x") || s.startsWith("0X")) {
			return Integer.parseInt(s.substring(2), 16);
		} else {
			return Integer.parseInt(s);
		}
	}

	/**
	 * <p>Creates a number literal.</p>
	 * <p>This method is used to create formatted number literal in re-compiled JavaScript 
	 * code. A re-compiler leaves the literal as it is without even parsing check but JS 
	 * Simulations parse it to a number and throws RuntimeException if it is malformatted.</p>
	 * @param s The literal text of a number.
	 * @return The numberer literal.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number number(String s) {
		s = s.trim();
		if (s.startsWith("0x") || s.startsWith("0X")) {
			s = s.substring(2);
			try {
				return Byte.parseByte(s, 16);
			} catch(NumberFormatException e) {
			}
			try {
				return Short.parseShort(s, 16);
			} catch(NumberFormatException e) {
			}
			try {
				return Integer.parseInt(s, 16);
			} catch(NumberFormatException e) {
			}
			return Long.parseLong(s, 16);
		} else {
			try {
				return Byte.parseByte(s);
			} catch(NumberFormatException e) {
			}
			try {
				return Short.parseShort(s);
			} catch(NumberFormatException e) {
			}
			try {
				return Integer.parseInt(s);
			} catch(NumberFormatException e) {
			}
			try {
				return Long.parseLong(s);
			} catch(NumberFormatException e) {
			}
			try {
				return Float.parseFloat(s);
			} catch(NumberFormatException e) {
			}
			return Double.parseDouble(s);
		}
	}

	/**
	 * <p>Gets the number representation of the argument if it is numeric.</p>
	 * @param var Any variable
	 * @return the number representation of the argument.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number getNumber(Object var) {
		var = var instanceof Var<?> ? ((Var<?>)var).var() : var;
		var = Js.valueOf(var);
		return var instanceof String ? number((String)var) : SimUtil.getNumber(var);
	}

	/**
	 * <p>Performs unary negation, resembling the unary minus operator in JavaScript.</p>
	 * <p>This operation converts a positive value to an equivalently negative value, and 
	 * vice versa. If the operand is not a number, it attempts to convert it to one.</p>
	 * @param var Any numeric value.
	 * @return The negation of the numeric value.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number neg(Number var) {
		return SimUtil.neg(var);
	}

	/**
	 * <p>Adds numeric operands, resembling the addition operator in JavaScript.</p>
	 * <p>Object operands are converted to numbers. The conversion is performed by the 
	 * {@link Js#valueOf(Object)} operation on the object.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The sum of the two numeric values.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number add(Number var, Number other) {
		return SimUtil.add(var, other);
	}

	/**
	 * <p>Computes the first operand modulo the second operand, resembling the modulo 
	 * operator in JavaScript.</p>
	 * <p>The operation returns the remainder when the first operand is divided by the 
	 * second operand a certain number of times. If used with non-numeric operands, the 
	 * operation attempts to convert them to numbers. The sign of the result is the same 
	 * as the sign of the first operand.</p>
	 * <p>This operation is typically used with integer operands, it also works for 
	 * floating-point values.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The remainder.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number mod(Number var, Number other) {
		return SimUtil.mod(var, other);
	}

	/**
	 * <p>Multiplies the two operands, resembling the multiplication operator in JavaScript.</p>
	 * <p>If used with non-numeric operands, this operation attempts to convert them to 
	 * numbers.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The product of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number mul(Number var, Number other) {
		return SimUtil.mul(var, other);
	}

	/**
	 * <p>Divides the first operand by the second, resembling the multiplication operator 
	 * in JavaScript.</p>
	 * <p>Used with non-numeric operands, this operation attempts to convert them to 
	 * numbers. If you are used to programming languages that distinguish between integer 
	 * and floating-point numbers, you might expect to get an integer result when you 
	 * divide one integer by another. In JavaScript, however, all numbers are floating-point, 
	 * so all division operations have floating-point results. Division by zero yields positive 
	 * or negative infinity, while <tt>0/0</tt> evaluates to <tt>NaN</tt>.</p>
	 * @param var Any numeric value.
	 * @param other Any numeric value.
	 * @return The quotient of the two operands.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected Number div(Number var, Number other) {
		return SimUtil.div(var, other);
	}

	/**
	 * <p>Less-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the first operand is less than the second operand; otherwise it evaluates to 
	 * <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param v A value or object.
	 * @param o A value or object.
	 * @return <tt>true</tt> if the first operand is less than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean lt(Object v, Object o) {
		v = Js.valueOf(v);
		o = Js.valueOf(o);
		if (Js.undefined(v) || Js.undefined(o)) {
			return false;
		}
		if (v instanceof String && o instanceof String) {
			return ((String)v).compareTo((String)o) < 0;
		}
		try {
			return getNumber(v).doubleValue() < getNumber(o).doubleValue();
		} catch (Exception e1) {
			return Js.toString(v).compareTo(Js.toString(o)) < 0;
		}
	}

	/**
	 * <p>Greater-than operation, resembling that of JavaScript, evaluates to <tt>true</tt> if 
	 * the first operand is greater than the second operand; otherwise it evaluates to 
	 * <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param v A value or object.
	 * @param o A value or object.
	 * @return <tt>true</tt> if the first operand is greater than the second operand; 
	 * otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean gt(Object v, Object o) {
		v = Js.valueOf(v);
		o = Js.valueOf(o);
		if (Js.undefined(v) || Js.undefined(o)) {
			return false;
		}
		if (v instanceof String && o instanceof String) {
			return ((String)v).compareTo((String)o) > 0;
		}
		try {
			return getNumber(v).doubleValue() > getNumber(o).doubleValue();
		} catch (Exception e1) {
			return Js.toString(v).compareTo(Js.toString(o)) > 0;
		}
	}

	/**
	 * <p>Less-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the first operand is less than or equal to the second operand; 
	 * otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param v A value or object.
	 * @param o A value or object.
	 * @return <tt>true</tt> if the first operand is less than or equal to the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean lte(Object v, Object o) {
		v = Js.valueOf(v);
		o = Js.valueOf(o);
		if (Js.undefined(v) || Js.undefined(o)) {
			return false;
		}
		if (v instanceof String && o instanceof String) {
			return ((String)v).compareTo((String)o) <= 0;
		}
		try {
			return !(getNumber(v).doubleValue() > getNumber(o).doubleValue());
		} catch (Exception e1) {
			return Js.toString(v).compareTo(Js.toString(o)) <= 0;
		}
	}

	/**
	 * <p>Greater-than-or-equal operation, resembling that of JavaScript, evaluates to 
	 * <tt>true</tt> if the first operand is greater than or equal to the second operand; 
	 * otherwise it evaluates to <tt>false</tt>.</p>
	 * <p>The operands of this operation may be of any type. Comparison can be performed 
	 * only on numbers and strings, however, so operands that are not numbers or strings 
	 * are converted. Comparison and conversion occur as follows:</p>
	 * <ul>
	 * <li>If both operands are numbers, or if both convert to numbers, they are compared 
	 * numerically.</li>
	 * <li>If both operands are strings or convert to strings, they are compared as 
	 * strings.</li>
	 * <li>If one operand is or converts to a string, and one is or converts to a number, 
	 * the operation attempts to convert the string to a number and performs a numerical 
	 * comparison. If the string does not represent a number, it converts to <tt>NaN</tt>, 
	 * and the comparison is <tt>false</tt>. In JavaScript 1.1, the string-to-number 
	 * conversion causes an error instead of yielding <tt>NaN</tt>.</li>
	 * <li>If an object can be converted to either a number or a string, JavaScript performs 
	 * the numerical conversion. This means, for example, that Date objects are compared 
	 * numerically, and it is meaningful to compare two dates to see whether one is earlier 
	 * than the other.</li>
	 * <li>If the operands of the comparison operations cannot both be successfully converted 
	 * to numbers or to strings, these operations always return <tt>false</tt>.</li>
	 * <li>If either operand is or converts to <tt>NaN</tt>, the comparison operation always 
	 * yields <tt>false</tt>.</li>
	 * </ul>
	 * <p>Keep in mind that string comparison is done on a strict character-by-character 
	 * basis using the numerical value of each character from the Unicode encoding. Although 
	 * in some cases the Unicode standard allows equivalent strings to be encoded using 
	 * different sequences of characters, the JavaScript comparison operations do not 
	 * detect these encoding differences; they assume that all strings are expressed in 
	 * normalized form. Note in particular that string comparison is case-sensitive, and 
	 * in the Unicode encoding (at least for the ASCII subset), all capital letters are 
	 * "less than" all lowercase letters. This rule can cause confusing results if you do 
	 * not expect it.</p>
	 * <p>For a more robust string-comparison algorithm, see the {@link StringLike#localeCompare(Object)} 
	 * method, which also takes locale-specific definitions of alphabetical order into account. 
	 * For case-insensitive comparisons, you must first convert the strings to all lowercase or 
	 * all uppercase using {@link StringLike#toLowerCase()} or {@link StringLike#toUpperCase()}.</p>
	 * <p>The less-than-or-equal and greater-than-or-equal operations do not rely on the 
	 * equality or identity operations for determining whether two values are "equal." 
	 * Instead, the less-than-or-equal operator is simply defined as "not greater than", 
	 * and the greater-than-or-equal operator is defined as "not less than". The one 
	 * exception occurs when either operand is (or converts to) <tt>NaN</tt>, in which case 
	 * all comparison operations return <tt>false</tt>.</p>
	 * @param v A value or object.
	 * @param o A value or object.
	 * @return <tt>true</tt> if the first operand is greater than or equal to the second 
	 * operand; otherwise <tt>false</tt>.
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	@Override
	protected final boolean gte(Object v, Object o) {
		v = Js.valueOf(v);
		o = Js.valueOf(o);
		if (Js.undefined(v) || Js.undefined(o)) {
			return false;
		}
		if (v instanceof String && o instanceof String) {
			return ((String)v).compareTo((String)o) >= 0;
		}
		try {
			return !(getNumber(v).doubleValue() < getNumber(o).doubleValue());
		} catch (Exception e1) {
			return Js.toString(v).compareTo(Js.toString(o)) >= 0;
		}
	}

	private static final boolean isNumerical(Object o) {
		return o instanceof Number || o instanceof Character;
	}

	/**
	 * <p>Checks whether the two operands are "equal" using a more relaxed definition of 
	 * sameness that allows type conversions, resembling the equality operator in 
	 * JavaScript.</p>
	 * <p>The equality and identity operations check whether two values are the same, using 
	 * two different definitions of sameness. Both operations accept operands of any type, 
	 * and both return <tt>true</tt> if their operands are the same and <tt>false</tt> 
	 * if they are different. The identity operation checks whether its two operands are 
	 * "identical" using a strict definition of sameness. The equality operation checks 
	 * whether its two operands are "equal" using a more relaxed definition of sameness 
	 * that allows type conversions.</p>
	 * <p>The identity operation is standardized by ECMAScript v3 and implemented in 
	 * JavaScript 1.3 and later. Be sure you understand the differences between the 
	 * assignment, equality, and identity operations, and be careful to use the correct one 
	 * when coding! Although it is tempting to call all three operations "equals," it may 
	 * help to reduce confusion if you read "gets or is assigned" for assignment operation, 
	 * "is equal to" for equality operation, and "is identical to" for identity operation.</p>
	 * <p>In JavaScript, numbers, strings, and boolean values are compared by value. In this 
	 * case, two separate values are involved, and the equality and identity operations 
	 * check that these two values are identical. This means that two variables are equal 
	 * or identical only if they contain the same value. For example, two strings are equal 
	 * only if they each contain exactly the same characters.</p>
	 * <p>On the other hand, objects, arrays, and functions are compared by reference. This 
	 * means that two variables are equal only if they refer to the same object. Two 
	 * separate arrays are never equal or identical, even if they contain equal or identical 
	 * elements. Two variables that contain references to objects, arrays, or functions are 
	 * equal only if they refer to the same object, array, or function. If you want to test 
	 * that two distinct objects contain the same properties or that two distinct arrays 
	 * contain the same elements, you'll have to check the properties or elements individually 
	 * for equality or identity. And, if any of the properties or elements are themselves 
	 * objects or arrays, you'll have to decide how deep you want the comparison to go.</p>
	 * <p>The following rules determine whether two values are equal according to the 
	 * equality operation:
	 * <ul>
	 * <li>If the two values have the same type, test them for identity. If the values are 
	 * identical, they are equal; if they are not identical, they are not equal.</li>
	 * <li>If the two values do not have the same type, they may still be equal. Use the 
	 * following rules and type conversions to check for equality:</li>
	 * <ul>
	 * <li>If one value is null and the other is undefined, they are equal.</li>
	 * <li>If one value is a number and the other is a string, convert the string to a 
	 * number and try the comparison again, using the converted value.</li>
	 * <li>If either value is <tt>true</tt>, convert it to 1 and try the comparison 
	 * again. If either value is <tt>false</tt>, convert it to 0 and try the comparison 
	 * again.</li>
	 * <li>If one value is an object and the other is a number or string, convert the 
	 * object to a primitive and try the comparison again. An object is converted to a 
	 * primitive value by either its <tt>toString()</tt> method or its <tt>valueOf()</tt> 
	 * method. The built-in classes of core JavaScript attempt <tt>valueOf()</tt> 
	 * conversion before <tt>toString()</tt> conversion, except for the Date class, 
	 * which performs <tt>toString()</tt> conversion. Objects that are not part of core 
	 * JavaScript may convert themselves to primitive values in an implementation-defined 
	 * way.</li>
	 * <li>Any other combinations of values are not equal.</li>
	 * </ul>
	 * </ul>
	 * @param v Any value or object.
	 * @param o Any value or object.
	 * @return <tt>true</tt> if the first operand equals the second; <tt>false</tt>, 
	 * otherwise;
	 * @since 1.0
	 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> method. 
	 */
	protected final boolean eqv(Object v, Object o) {
		if (v.getClass() == o.getClass()) {
			return v.equals(o);
		} else if (isNumerical(v) && o instanceof String) {
			try {
				return eqv(v, Double.parseDouble((String)o));
			} catch (NumberFormatException nfe) {
				return false;
			}
		} else if (v instanceof String && isNumerical(o)) {
			try {
				return eqv(Double.parseDouble((String)v), o);
			} catch (NumberFormatException nfe) {
				return false;
			}
		} else if (isNumerical(v) && isNumerical(o)) {
			return SimUtil.getNumber(v).doubleValue() ==
			       SimUtil.getNumber(o).doubleValue();
		} else if (v instanceof Boolean) {
			boolean b = (Boolean)v;
			return eqv(b ? 1 : 0, o);
		} else if (o instanceof Boolean) {
			boolean b = (Boolean)o;
			return eqv(v, b ? 1 : 0);
		} else if (v instanceof String) {
			return eqv(v, Js.toString(o));
		} else if (o instanceof String) {
			return eqv(Js.toString(v), o);
		} else {
			return false;
		}
	}
}
