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

public class WorkSheet_array_10901379944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41786;

    public WorkSheet_array_10901379944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41786 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term41787 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41820 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41853 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41886 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41919 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41952 = (Object[]) newArray("java.lang.String", 8);
        Object[] term41985 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42018 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42051 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42084 = (Object[]) newArray("java.lang.String", 8);
        int[] term42129 = (int[]) newIntArray(2);
        Object[] term42132 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0);
        setElement(term41787, 0, "  ");
        setElement(term41787, 1, "  ");
        setElement(term41787, 2, "  ");
        setElement(term41787, 3, "  ");
        setElement(term41787, 4, "  ");
        setElement(term41787, 5, "  ");
        setElement(term41787, 6, "  ");
        setElement(term41787, 7, "  ");
        setField(term41786, term41786.getClass(), "row_1_Border", term41787);
        setElement(term41820, 0, "  ");
        setElement(term41820, 1, "  ");
        setElement(term41820, 2, "  ");
        setElement(term41820, 3, "  ");
        setElement(term41820, 4, "  ");
        setElement(term41820, 5, "  ");
        setElement(term41820, 6, "  ");
        setElement(term41820, 7, "  ");
        setField(term41786, term41786.getClass(), "row_1_Align_", term41820);
        setElement(term41853, 0, "  ");
        setElement(term41853, 1, "  ");
        setElement(term41853, 2, "  ");
        setElement(term41853, 3, "  ");
        setElement(term41853, 4, "  ");
        setElement(term41853, 5, "  ");
        setElement(term41853, 6, "  ");
        setElement(term41853, 7, "  ");
        setField(term41786, term41786.getClass(), "row_2_Border", term41853);
        setElement(term41886, 0, "  ");
        setElement(term41886, 1, "  ");
        setElement(term41886, 2, "  ");
        setElement(term41886, 3, "  ");
        setElement(term41886, 4, "  ");
        setElement(term41886, 5, "  ");
        setElement(term41886, 6, "  ");
        setElement(term41886, 7, "  ");
        setField(term41786, term41786.getClass(), "row_2_Align_", term41886);
        setElement(term41919, 0, "  ");
        setElement(term41919, 1, "  ");
        setElement(term41919, 2, "  ");
        setElement(term41919, 3, "  ");
        setElement(term41919, 4, "  ");
        setElement(term41919, 5, "  ");
        setElement(term41919, 6, "  ");
        setElement(term41919, 7, "  ");
        setField(term41786, term41786.getClass(), "row_3_Border", term41919);
        setElement(term41952, 0, "  ");
        setElement(term41952, 1, "  ");
        setElement(term41952, 2, "  ");
        setElement(term41952, 3, "  ");
        setElement(term41952, 4, "  ");
        setElement(term41952, 5, "  ");
        setElement(term41952, 6, "  ");
        setElement(term41952, 7, "  ");
        setField(term41786, term41786.getClass(), "row_3_Align_", term41952);
        setElement(term41985, 0, "  ");
        setElement(term41985, 1, "  ");
        setElement(term41985, 2, "  ");
        setElement(term41985, 3, "  ");
        setElement(term41985, 4, "  ");
        setElement(term41985, 5, "  ");
        setElement(term41985, 6, "  ");
        setElement(term41985, 7, "  ");
        setField(term41786, term41786.getClass(), "label_Border", term41985);
        setElement(term42018, 0, "  ");
        setElement(term42018, 1, "  ");
        setElement(term42018, 2, "  ");
        setElement(term42018, 3, "  ");
        setElement(term42018, 4, "  ");
        setElement(term42018, 5, "  ");
        setElement(term42018, 6, "  ");
        setElement(term42018, 7, "  ");
        setField(term41786, term41786.getClass(), "label_Align_", term42018);
        setElement(term42051, 0, "  ");
        setElement(term42051, 1, "  ");
        setElement(term42051, 2, "  ");
        setElement(term42051, 3, "  ");
        setElement(term42051, 4, "  ");
        setElement(term42051, 5, "  ");
        setElement(term42051, 6, "  ");
        setElement(term42051, 7, "  ");
        setField(term41786, term41786.getClass(), "data__Border", term42051);
        setElement(term42084, 0, "  ");
        setElement(term42084, 1, "  ");
        setElement(term42084, 2, "  ");
        setElement(term42084, 3, "  ");
        setElement(term42084, 4, "  ");
        setElement(term42084, 5, "  ");
        setElement(term42084, 6, "  ");
        setElement(term42084, 7, "  ");
        setField(term41786, term41786.getClass(), "data__Align_", term42084);
        setField(term41786, term41786.getClass(), "sheet_Name", "btBLMvHzJg");
        setIntElement(term42129, 0, 729658803);
        setIntElement(term42129, 1, 114754804);
        setField(term41786, term41786.getClass(), "column_Width", term42129);
        setField(term41786, term41786.getClass(), "value_Data", term42132);
        setIntField(term41786, term41786.getClass(), "print_Scale", 100);
        setBooleanField(term41786, term41786.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JdOMfNWgLP";
        callMethod(klass, "array", argTypes, term41786, args);
    }

};


