package com.bridgelabz.lib;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class BLStdOut {

    // force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }
    
    public static void print(Object x) {
        out.print(x);
        out.flush();
    }
    
    /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() {
        out.println();
    }
    
    /**
     * Prints an object to this output stream and then terminates the line.
     *
     * @param x the object to print
     */
    public static void println(Object x) {
        out.println(x);
    }
    
    /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments, and then flushes standard output.
     *
     *
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
