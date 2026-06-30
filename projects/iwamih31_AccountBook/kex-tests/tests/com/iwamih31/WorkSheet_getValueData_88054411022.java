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

public class WorkSheet_getValueData_88054411022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49959;

    public WorkSheet_getValueData_88054411022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49959 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        setField(term49959, term49959.getClass(), "row_1_Border", null);
        setField(term49959, term49959.getClass(), "row_1_Align_", null);
        setField(term49959, term49959.getClass(), "row_2_Border", null);
        setField(term49959, term49959.getClass(), "row_2_Align_", null);
        setField(term49959, term49959.getClass(), "row_3_Border", null);
        setField(term49959, term49959.getClass(), "row_3_Align_", null);
        setField(term49959, term49959.getClass(), "label_Border", null);
        setField(term49959, term49959.getClass(), "label_Align_", null);
        setField(term49959, term49959.getClass(), "data__Border", null);
        setField(term49959, term49959.getClass(), "data__Align_", null);
        setField(term49959, term49959.getClass(), "sheet_Name", null);
        setField(term49959, term49959.getClass(), "column_Width", null);
        setField(term49959, term49959.getClass(), "value_Data", null);
        setIntField(term49959, term49959.getClass(), "print_Scale", 0);
        setBooleanField(term49959, term49959.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue_Data", argTypes, term49959, args);
    }

};


