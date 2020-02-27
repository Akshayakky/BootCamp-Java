package com.bridgelabz.lib;

public class BLStats {
    
	// throw an IllegalArgumentException if x is null
    // (x is either of type double[] or int[])
    private static void validateNotNull(Object x) {
        if (x == null)
            throw new IllegalArgumentException("argument is null");
    }
    
    /**
     * Returns the minimum value in the specified array.
     *
     * @param  a the array
     * @return the minimum value in the array {@code a[]};
     *         {@code Double.POSITIVE_INFINITY} if no such value
     */
    public static double min(double[] a) {
        validateNotNull(a);

        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] < min) min = a[i];
        }
        return min;
    }
    
    /**
     * Returns the sample variance in the specified array.
     *
     * @param  a the array
     * @return the sample variance in the array {@code a[]};
     *         {@code Double.NaN} if no such value
     */
    public static double var(double[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
    }
    
    /**
     * Returns the sample standard deviation in the specified array.
     *
     * @param  a the array
     * @return the sample standard deviation in the array {@code a[]};
     *         {@code Double.NaN} if no such value
     */
    public static double stddev(double[] a) {
        validateNotNull(a);
        return Math.sqrt(var(a));
    }
    
    /**
     * Plots the points (0, <em>a</em><sub>0</sub>), (1, <em>a</em><sub>1</sub>), ...,
     * (<em>n</em>-1, <em>a</em><sub><em>n</em>-1</sub>) to standard draw.
     *
     * @param a the array of values
     */
    public static void plotPoints(double[] a) {
        validateNotNull(a);
        int n = a.length;
        BLDraw.setXscale(-1, n);
        BLDraw.setPenRadius(1.0 / (3.0 * n));
        for (int i = 0; i < n; i++) {
            BLDraw.point(i, a[i]);
        }
    }
    
    /**
     * Plots the line segments connecting 
     * (<em>i</em>, <em>a</em><sub><em>i</em></sub>) to
     * (<em>i</em>+1, <em>a</em><sub><em>i</em>+1</sub>) for 
     * each <em>i</em> to standard draw.
     *
     * @param a the array of values
     */
    public static void plotLines(double[] a) {
        validateNotNull(a);
        int n = a.length;
        BLDraw.setXscale(-1, n);
        BLDraw.setPenRadius();
        for (int i = 1; i < n; i++) {
            BLDraw.line(i-1, a[i-1], i, a[i]);
        }
    }
    
    /**
     * Plots bars from (0, <em>a</em><sub><em>i</em></sub>) to
     * (<em>a</em><sub><em>i</em></sub>) for each <em>i</em>
     * to standard draw.
     *
     * @param a the array of values
     */
    public static void plotBars(double[] a) {
        validateNotNull(a);
        int n = a.length;
        BLDraw.setXscale(-1, n);
        for (int i = 0; i < n; i++) {
            BLDraw.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
        }
    }
    /**
     * Returns the sum of all values in the specified array.
     *
     * @param  a the array
     * @return the sum of all values in the array {@code a[]};
     *         {@code 0.0} if no such value
     */
    private static double sum(double[] a) {
        validateNotNull(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    /**
     * Returns the average value in the specified array.
     *
     * @param  a the array
     * @return the average value in the array {@code a[]};
     *         {@code Double.NaN} if no such value
     */
    public static double mean(double[] a) {
        validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double sum = sum(a);
        return sum / a.length;
    }
    /**
     * Returns the maximum value in the specified array.
     *
     * @param  a the array
     * @return the maximum value in the array {@code a[]};
     *         {@code Double.NEGATIVE_INFINITY} if no such value
     */
    public static double max(double[] a) {
        validateNotNull(a);

        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (Double.isNaN(a[i])) return Double.NaN;
            if (a[i] > max) max = a[i];
        }
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
