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

public class MonthlyWorkSheet_getSheetName_66884991416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39358;

    public MonthlyWorkSheet_getSheetName_66884991416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39358 = newInstance(Class.forName("com.iwamih31.MonthlyWorkSheet"));
        setField(term39358, term39358.getClass(), "row_1_Border", null);
        setField(term39358, term39358.getClass(), "row_1_Align_", null);
        setField(term39358, term39358.getClass(), "row_2_Border", null);
        setField(term39358, term39358.getClass(), "row_2_Align_", null);
        setField(term39358, term39358.getClass(), "label_Border", null);
        setField(term39358, term39358.getClass(), "label_Align_", null);
        setField(term39358, term39358.getClass(), "row_4_Border", null);
        setField(term39358, term39358.getClass(), "row_4_Align_", null);
        setField(term39358, term39358.getClass(), "foot_1_Border", null);
        setField(term39358, term39358.getClass(), "foot_1_Align_", null);
        setField(term39358, term39358.getClass(), "foot_2_Border", null);
        setField(term39358, term39358.getClass(), "foot_2_Align_", null);
        setField(term39358, term39358.getClass(), "data__Border", null);
        setField(term39358, term39358.getClass(), "data__Align_", null);
        setField(term39358, term39358.getClass(), "row_3_Border", null);
        setField(term39358, term39358.getClass(), "row_3_Align_", null);
        setField(term39358, term39358.getClass(), "sheet_Name", null);
        setField(term39358, term39358.getClass(), "column_Width", null);
        setField(term39358, term39358.getClass(), "value_Data", null);
        setIntField(term39358, term39358.getClass(), "print_Scale", 0);
        setBooleanField(term39358, term39358.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.MonthlyWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSheet_Name", argTypes, term39358, args);
    }

};


