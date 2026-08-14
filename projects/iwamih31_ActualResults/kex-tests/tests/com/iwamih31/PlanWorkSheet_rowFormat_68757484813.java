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

public class PlanWorkSheet_rowFormat_68757484813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57268;
     Object term57270;

    public PlanWorkSheet_rowFormat_68757484813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57268 = newInstance(Class.forName("com.iwamih31.PlanWorkSheet"));
        setField(term57268, term57268.getClass(), "row_1_Border", null);
        setField(term57268, term57268.getClass(), "row_1_Align_", null);
        setField(term57268, term57268.getClass(), "row_2_Border", null);
        setField(term57268, term57268.getClass(), "row_2_Align_", null);
        setField(term57268, term57268.getClass(), "row_3_Border", null);
        setField(term57268, term57268.getClass(), "row_3_Align_", null);
        setField(term57268, term57268.getClass(), "label_Border", null);
        setField(term57268, term57268.getClass(), "label_Align_", null);
        setField(term57268, term57268.getClass(), "data__Border", null);
        setField(term57268, term57268.getClass(), "data__Align_", null);
        setField(term57268, term57268.getClass(), "sheet_Name", null);
        setField(term57268, term57268.getClass(), "column_Width", null);
        setField(term57268, term57268.getClass(), "value_Data", null);
        setBooleanField(term57268, term57268.getClass(), "printSetup", false);
        term57270 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.PlanWorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57270;
        callMethod(klass, "row_Format", argTypes, term57268, args);
    }

};


