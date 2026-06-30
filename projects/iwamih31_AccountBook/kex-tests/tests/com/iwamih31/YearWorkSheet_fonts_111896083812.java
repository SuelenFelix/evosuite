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

public class YearWorkSheet_fonts_111896083812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12735;

    public YearWorkSheet_fonts_111896083812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12735 = newInstance(Class.forName("com.iwamih31.YearWorkSheet"));
        setField(term12735, term12735.getClass(), "row_1_Border", null);
        setField(term12735, term12735.getClass(), "row_1_Align_", null);
        setField(term12735, term12735.getClass(), "row_2_Border", null);
        setField(term12735, term12735.getClass(), "row_2_Align_", null);
        setField(term12735, term12735.getClass(), "label_Border", null);
        setField(term12735, term12735.getClass(), "label_Align_", null);
        setField(term12735, term12735.getClass(), "row_4_Border", null);
        setField(term12735, term12735.getClass(), "row_4_Align_", null);
        setField(term12735, term12735.getClass(), "foot_1_Border", null);
        setField(term12735, term12735.getClass(), "foot_1_Align_", null);
        setField(term12735, term12735.getClass(), "foot_2_Border", null);
        setField(term12735, term12735.getClass(), "foot_2_Align_", null);
        setField(term12735, term12735.getClass(), "data__Border", null);
        setField(term12735, term12735.getClass(), "data__Align_", null);
        setField(term12735, term12735.getClass(), "row_3_Border", null);
        setField(term12735, term12735.getClass(), "row_3_Align_", null);
        setField(term12735, term12735.getClass(), "sheet_Name", null);
        setField(term12735, term12735.getClass(), "column_Width", null);
        setField(term12735, term12735.getClass(), "value_Data", null);
        setIntField(term12735, term12735.getClass(), "print_Scale", 0);
        setBooleanField(term12735, term12735.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.YearWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fonts", argTypes, term12735, args);
    }

};


