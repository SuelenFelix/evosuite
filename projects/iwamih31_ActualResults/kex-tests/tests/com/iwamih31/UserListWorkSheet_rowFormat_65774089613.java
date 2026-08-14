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

public class UserListWorkSheet_rowFormat_65774089613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31324;
     Object term31326;

    public UserListWorkSheet_rowFormat_65774089613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31324 = newInstance(Class.forName("com.iwamih31.UserListWorkSheet"));
        setField(term31324, term31324.getClass(), "row_1_Border", null);
        setField(term31324, term31324.getClass(), "row_1_Align_", null);
        setField(term31324, term31324.getClass(), "row_2_Border", null);
        setField(term31324, term31324.getClass(), "row_2_Align_", null);
        setField(term31324, term31324.getClass(), "row_3_Border", null);
        setField(term31324, term31324.getClass(), "row_3_Align_", null);
        setField(term31324, term31324.getClass(), "label_Border", null);
        setField(term31324, term31324.getClass(), "label_Align_", null);
        setField(term31324, term31324.getClass(), "data__Border", null);
        setField(term31324, term31324.getClass(), "data__Align_", null);
        setField(term31324, term31324.getClass(), "sheet_Name", null);
        setField(term31324, term31324.getClass(), "column_Width", null);
        setField(term31324, term31324.getClass(), "value_Data", null);
        setBooleanField(term31324, term31324.getClass(), "printSetup", false);
        term31326 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.UserListWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31326;
        callMethod(klass, "row_Format", argTypes, term31324, args);
    }

};


