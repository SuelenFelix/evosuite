package com.pd.algorithms;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.pd.algorithms.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class SearchWordInMatrix_dfs_4151582712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;
     Object term165;
     Object term223;
     Object term225;
     Object term227;

    public SearchWordInMatrix_dfs_4151582712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164 = newInstance(Class.forName("com.pd.algorithms.SearchWordInMatrix"));
        term165 = (Object[]) newArray("[C", 8);
        char[] term166 = (char[]) newCharArray(6);
        char[] term173 = (char[]) newCharArray(2);
        char[] term176 = (char[]) newCharArray(1);
        char[] term178 = (char[]) newCharArray(9);
        char[] term188 = (char[]) newCharArray(3);
        char[] term192 = (char[]) newCharArray(5);
        char[] term198 = (char[]) newCharArray(6);
        char[] term205 = (char[]) newCharArray(5);
        setCharElement(term166, 0, 'T');
        setCharElement(term166, 1, 'D');
        setCharElement(term166, 2, 's');
        setCharElement(term166, 3, 'j');
        setCharElement(term166, 4, 'l');
        setCharElement(term166, 5, 'J');
        setElement(term165, 0, term166);
        setCharElement(term173, 0, 'A');
        setCharElement(term173, 1, 'E');
        setElement(term165, 1, term173);
        setCharElement(term176, 0, 't');
        setElement(term165, 2, term176);
        setCharElement(term178, 0, 'R');
        setCharElement(term178, 1, 'r');
        setCharElement(term178, 2, 'b');
        setCharElement(term178, 3, 'M');
        setCharElement(term178, 4, 'u');
        setCharElement(term178, 5, 'L');
        setCharElement(term178, 6, 'c');
        setCharElement(term178, 7, 'g');
        setCharElement(term178, 8, 'Q');
        setElement(term165, 3, term178);
        setCharElement(term188, 0, 'H');
        setCharElement(term188, 1, 'g');
        setCharElement(term188, 2, 'q');
        setElement(term165, 4, term188);
        setCharElement(term192, 0, 'z');
        setCharElement(term192, 1, 'x');
        setCharElement(term192, 2, 'x');
        setCharElement(term192, 3, 't');
        setCharElement(term192, 4, 'l');
        setElement(term165, 5, term192);
        setCharElement(term198, 0, 'P');
        setCharElement(term198, 1, 'w');
        setCharElement(term198, 2, 'D');
        setCharElement(term198, 3, 'Y');
        setCharElement(term198, 4, 'F');
        setCharElement(term198, 5, 's');
        setElement(term165, 6, term198);
        setCharElement(term205, 0, 'j');
        setCharElement(term205, 1, 'J');
        setCharElement(term205, 2, 'C');
        setCharElement(term205, 3, 'Z');
        setCharElement(term205, 4, 'p');
        setElement(term165, 7, term205);
        term223 = new Integer(-1016503459);
        term225 = new Integer(-1968847291);
        term227 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pd.algorithms.SearchWordInMatrix");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term165;
        args[1] = "sjlJAEtRrb";
        args[2] = term223;
        args[3] = term225;
        args[4] = term227;
        callMethod(klass, "dfs", argTypes, term164, args);
    }

};


