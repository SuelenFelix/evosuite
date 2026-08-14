package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class WorkSheet_getColumnWidth_17121058388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41040;

    public WorkSheet_getColumnWidth_17121058388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41040 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term41041 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41074 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41107 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41140 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41173 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41206 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41239 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41272 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41305 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41338 = (Object[]) newArray("java.lang.String", 8);
        int[] term41383 = (int[]) newIntArray(3);
        Object[] term41387 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term41388 = (Object[]) newArray("java.lang.String", 9);
        Object[] term41497 = (Object[]) newArray("java.lang.String", 4);
        Object[] term41546 = (Object[]) newArray("java.lang.String", 6);
        Object[] term41619 = (Object[]) newArray("java.lang.String", 4);
        setElement(term41041, 0, "  ");
        setElement(term41041, 1, "  ");
        setElement(term41041, 2, "  ");
        setElement(term41041, 3, "  ");
        setElement(term41041, 4, "  ");
        setElement(term41041, 5, "  ");
        setElement(term41041, 6, "  ");
        setElement(term41041, 7, "  ");
        setField(term41040, term41040.getClass(), "row_1_Border", term41041);
        setElement(term41074, 0, "  ");
        setElement(term41074, 1, "  ");
        setElement(term41074, 2, "  ");
        setElement(term41074, 3, "  ");
        setElement(term41074, 4, "  ");
        setElement(term41074, 5, "  ");
        setElement(term41074, 6, "  ");
        setElement(term41074, 7, "  ");
        setField(term41040, term41040.getClass(), "row_1_Align_", term41074);
        setElement(term41107, 0, "  ");
        setElement(term41107, 1, "  ");
        setElement(term41107, 2, "  ");
        setElement(term41107, 3, "  ");
        setElement(term41107, 4, "  ");
        setElement(term41107, 5, "  ");
        setElement(term41107, 6, "  ");
        setElement(term41107, 7, "  ");
        setField(term41040, term41040.getClass(), "row_2_Border", term41107);
        setElement(term41140, 0, "  ");
        setElement(term41140, 1, "  ");
        setElement(term41140, 2, "  ");
        setElement(term41140, 3, "  ");
        setElement(term41140, 4, "  ");
        setElement(term41140, 5, "  ");
        setElement(term41140, 6, "  ");
        setElement(term41140, 7, "  ");
        setField(term41040, term41040.getClass(), "row_2_Align_", term41140);
        setElement(term41173, 0, "  ");
        setElement(term41173, 1, "  ");
        setElement(term41173, 2, "  ");
        setElement(term41173, 3, "  ");
        setElement(term41173, 4, "  ");
        setElement(term41173, 5, "  ");
        setElement(term41173, 6, "  ");
        setElement(term41173, 7, "  ");
        setField(term41040, term41040.getClass(), "row_3_Border", term41173);
        setElement(term41206, 0, "  ");
        setElement(term41206, 1, "  ");
        setElement(term41206, 2, "  ");
        setElement(term41206, 3, "  ");
        setElement(term41206, 4, "  ");
        setElement(term41206, 5, "  ");
        setElement(term41206, 6, "  ");
        setElement(term41206, 7, "  ");
        setField(term41040, term41040.getClass(), "row_3_Align_", term41206);
        setElement(term41239, 0, "  ");
        setElement(term41239, 1, "  ");
        setElement(term41239, 2, "  ");
        setElement(term41239, 3, "  ");
        setElement(term41239, 4, "  ");
        setElement(term41239, 5, "  ");
        setElement(term41239, 6, "  ");
        setElement(term41239, 7, "  ");
        setField(term41040, term41040.getClass(), "label_Border", term41239);
        setElement(term41272, 0, "  ");
        setElement(term41272, 1, "  ");
        setElement(term41272, 2, "  ");
        setElement(term41272, 3, "  ");
        setElement(term41272, 4, "  ");
        setElement(term41272, 5, "  ");
        setElement(term41272, 6, "  ");
        setElement(term41272, 7, "  ");
        setField(term41040, term41040.getClass(), "label_Align_", term41272);
        setElement(term41305, 0, "  ");
        setElement(term41305, 1, "  ");
        setElement(term41305, 2, "  ");
        setElement(term41305, 3, "  ");
        setElement(term41305, 4, "  ");
        setElement(term41305, 5, "  ");
        setElement(term41305, 6, "  ");
        setElement(term41305, 7, "  ");
        setField(term41040, term41040.getClass(), "data__Border", term41305);
        setElement(term41338, 0, "  ");
        setElement(term41338, 1, "  ");
        setElement(term41338, 2, "  ");
        setElement(term41338, 3, "  ");
        setElement(term41338, 4, "  ");
        setElement(term41338, 5, "  ");
        setElement(term41338, 6, "  ");
        setElement(term41338, 7, "  ");
        setField(term41040, term41040.getClass(), "data__Align_", term41338);
        setField(term41040, term41040.getClass(), "sheet_Name", "IWNJVfvTuw");
        setIntElement(term41383, 0, 1107176718);
        setIntElement(term41383, 1, 480137250);
        setIntElement(term41383, 2, -341152642);
        setField(term41040, term41040.getClass(), "column_Width", term41383);
        setElement(term41388, 0, "DLpKfwPpvr");
        setElement(term41388, 1, "DLFXidLbuT");
        setElement(term41388, 2, "FjkxfTXGIH");
        setElement(term41388, 3, "KJkWSFFnmR");
        setElement(term41388, 4, "FBYRIDZvmW");
        setElement(term41388, 5, "IyjLfrDZrV");
        setElement(term41388, 6, "BRMTHqqoRg");
        setElement(term41388, 7, "nOElYZBeyU");
        setElement(term41388, 8, "eUXPtGmoNg");
        setElement(term41387, 0, term41388);
        setElement(term41497, 0, "ZjqXyUmAJY");
        setElement(term41497, 1, "pjEERkBbYo");
        setElement(term41497, 2, "FQPqmjhWog");
        setElement(term41497, 3, "sYtJsiIiSX");
        setElement(term41387, 1, term41497);
        setElement(term41546, 0, "KgfsAwTFFn");
        setElement(term41546, 1, "hFnFlgThhp");
        setElement(term41546, 2, "aEZAnHuGSR");
        setElement(term41546, 3, "uMzGGnJFYF");
        setElement(term41546, 4, "iAIRLRjFkP");
        setElement(term41546, 5, "cdXvvxXVTz");
        setElement(term41387, 2, term41546);
        setElement(term41619, 0, "tXsfWIqIPn");
        setElement(term41619, 1, "tDmfqEyHaN");
        setElement(term41619, 2, "mTSMXFkWRr");
        setElement(term41619, 3, "qdIiMKwfzT");
        setElement(term41387, 3, term41619);
        setField(term41040, term41040.getClass(), "value_Data", term41387);
        setBooleanField(term41040, term41040.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumn_Width", argTypes, term41040, args);
    }

};


