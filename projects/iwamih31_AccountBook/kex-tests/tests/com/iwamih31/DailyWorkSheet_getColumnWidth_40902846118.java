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

public class DailyWorkSheet_getColumnWidth_40902846118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27283;

    public DailyWorkSheet_getColumnWidth_40902846118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27283 = newInstance(Class.forName("com.iwamih31.DailyWorkSheet"));
        setField(term27283, term27283.getClass(), "row_1_Border", null);
        setField(term27283, term27283.getClass(), "row_1_Align_", null);
        setField(term27283, term27283.getClass(), "row_2_Border", null);
        setField(term27283, term27283.getClass(), "row_2_Align_", null);
        setField(term27283, term27283.getClass(), "row_3_Border", null);
        setField(term27283, term27283.getClass(), "row_3_Align_", null);
        setField(term27283, term27283.getClass(), "label_Border", null);
        setField(term27283, term27283.getClass(), "label_Align_", null);
        setField(term27283, term27283.getClass(), "total_Border", null);
        setField(term27283, term27283.getClass(), "total_Align_", null);
        setField(term27283, term27283.getClass(), "foot_1_Border", null);
        setField(term27283, term27283.getClass(), "foot_1_Align_", null);
        setField(term27283, term27283.getClass(), "foot_2_Border", null);
        setField(term27283, term27283.getClass(), "foot_2_Align_", null);
        setField(term27283, term27283.getClass(), "data__Border", null);
        setField(term27283, term27283.getClass(), "data__Align_", null);
        setField(term27283, term27283.getClass(), "sheet_Name", null);
        setField(term27283, term27283.getClass(), "column_Width", null);
        setField(term27283, term27283.getClass(), "value_Data", null);
        setIntField(term27283, term27283.getClass(), "print_Scale", 0);
        setBooleanField(term27283, term27283.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.DailyWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumn_Width", argTypes, term27283, args);
    }

};


