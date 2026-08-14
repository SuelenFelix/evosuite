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

public class UserListWorkSheet_getColumnWidth_64805871118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31338;

    public UserListWorkSheet_getColumnWidth_64805871118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31338 = newInstance(Class.forName("com.iwamih31.UserListWorkSheet"));
        setField(term31338, term31338.getClass(), "row_1_Border", null);
        setField(term31338, term31338.getClass(), "row_1_Align_", null);
        setField(term31338, term31338.getClass(), "row_2_Border", null);
        setField(term31338, term31338.getClass(), "row_2_Align_", null);
        setField(term31338, term31338.getClass(), "row_3_Border", null);
        setField(term31338, term31338.getClass(), "row_3_Align_", null);
        setField(term31338, term31338.getClass(), "label_Border", null);
        setField(term31338, term31338.getClass(), "label_Align_", null);
        setField(term31338, term31338.getClass(), "data__Border", null);
        setField(term31338, term31338.getClass(), "data__Align_", null);
        setField(term31338, term31338.getClass(), "sheet_Name", null);
        setField(term31338, term31338.getClass(), "column_Width", null);
        setField(term31338, term31338.getClass(), "value_Data", null);
        setBooleanField(term31338, term31338.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.UserListWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumn_Width", argTypes, term31338, args);
    }

};


