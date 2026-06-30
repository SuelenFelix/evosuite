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

public class DailyWorkSheet_rowFormat_171482806813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27264;
     Object term27267;

    public DailyWorkSheet_rowFormat_171482806813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27264 = newInstance(Class.forName("com.iwamih31.DailyWorkSheet"));
        setField(term27264, term27264.getClass(), "row_1_Border", null);
        setField(term27264, term27264.getClass(), "row_1_Align_", null);
        setField(term27264, term27264.getClass(), "row_2_Border", null);
        setField(term27264, term27264.getClass(), "row_2_Align_", null);
        setField(term27264, term27264.getClass(), "row_3_Border", null);
        setField(term27264, term27264.getClass(), "row_3_Align_", null);
        setField(term27264, term27264.getClass(), "label_Border", null);
        setField(term27264, term27264.getClass(), "label_Align_", null);
        setField(term27264, term27264.getClass(), "total_Border", null);
        setField(term27264, term27264.getClass(), "total_Align_", null);
        setField(term27264, term27264.getClass(), "foot_1_Border", null);
        setField(term27264, term27264.getClass(), "foot_1_Align_", null);
        setField(term27264, term27264.getClass(), "foot_2_Border", null);
        setField(term27264, term27264.getClass(), "foot_2_Align_", null);
        setField(term27264, term27264.getClass(), "data__Border", null);
        setField(term27264, term27264.getClass(), "data__Align_", null);
        setField(term27264, term27264.getClass(), "sheet_Name", null);
        setField(term27264, term27264.getClass(), "column_Width", null);
        setField(term27264, term27264.getClass(), "value_Data", null);
        setIntField(term27264, term27264.getClass(), "print_Scale", 0);
        setBooleanField(term27264, term27264.getClass(), "printSetup", false);
        term27267 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.DailyWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27267;
        callMethod(klass, "row_Format", argTypes, term27264, args);
    }

};


