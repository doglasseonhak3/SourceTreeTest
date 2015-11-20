package com.example.ms_win.unittest;

// Comment test
/**
 * Created by MS_WIN on 2015-11-17.
 */
public abstract  class Calc
{
	public int delete(int a, int b);

    public int sum(int a, int b)
    {
        return a + b;
    }
    public abstract int multiply(int a, int b);
    public abstract int multiply2(int a, int b);

    public abstract int Sub(int a, int b);
    public abstract int Sub2(int a, int b);
	public abstract int Divide(int a, int b);
    public abstract int Divide2(int a, int b);
    public abstract int Rotate(int a, int b);
    public abstract int DoglasMethod(int a, int b);
    public abstract int MichealMethod(int a, int b);

	public abstract int ConflictMethod(int a, int b);
	public abstract int ConflictMethod2(int a, int b);

	public abstract int ConflictTool2(int a, int b);
}

// Add Sentence1