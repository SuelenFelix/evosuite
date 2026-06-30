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
import java.lang.Integer;

public class DailyWorkSheet_array_123595004815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27272;
     Object term27275;

    public DailyWorkSheet_array_123595004815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27272 = newInstance(Class.forName("com.iwamih31.DailyWorkSheet"));
        setField(term27272, term27272.getClass(), "row_1_Border", null);
        setField(term27272, term27272.getClass(), "row_1_Align_", null);
        setField(term27272, term27272.getClass(), "row_2_Border", null);
        setField(term27272, term27272.getClass(), "row_2_Align_", null);
        setField(term27272, term27272.getClass(), "row_3_Border", null);
        setField(term27272, term27272.getClass(), "row_3_Align_", null);
        setField(term27272, term27272.getClass(), "label_Border", null);
        setField(term27272, term27272.getClass(), "label_Align_", null);
        setField(term27272, term27272.getClass(), "total_Border", null);
        setField(term27272, term27272.getClass(), "total_Align_", null);
        setField(term27272, term27272.getClass(), "foot_1_Border", null);
        setField(term27272, term27272.getClass(), "foot_1_Align_", null);
        setField(term27272, term27272.getClass(), "foot_2_Border", null);
        setField(term27272, term27272.getClass(), "foot_2_Align_", null);
        setField(term27272, term27272.getClass(), "data__Border", null);
        setField(term27272, term27272.getClass(), "data__Align_", null);
        setField(term27272, term27272.getClass(), "sheet_Name", null);
        setField(term27272, term27272.getClass(), "column_Width", null);
        setField(term27272, term27272.getClass(), "value_Data", null);
        setIntField(term27272, term27272.getClass(), "print_Scale", 0);
        setBooleanField(term27272, term27272.getClass(), "printSetup", false);
        term27275 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.DailyWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27275;
        callMethod(klass, "array", argTypes, term27272, args);
    }

};


