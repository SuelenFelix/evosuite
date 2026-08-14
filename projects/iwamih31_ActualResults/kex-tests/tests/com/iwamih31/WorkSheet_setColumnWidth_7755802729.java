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

public class WorkSheet_setColumnWidth_7755802729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42072;
     Object term42423;

    public WorkSheet_setColumnWidth_7755802729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42072 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term42073 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42106 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42139 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42172 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42205 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42238 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42271 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42304 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42337 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42370 = (Object[]) newArray("java.lang.String", 8);
        int[] term42415 = (int[]) newIntArray(5);
        Object[] term42421 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0);
        setElement(term42073, 0, "  ");
        setElement(term42073, 1, "  ");
        setElement(term42073, 2, "  ");
        setElement(term42073, 3, "  ");
        setElement(term42073, 4, "  ");
        setElement(term42073, 5, "  ");
        setElement(term42073, 6, "  ");
        setElement(term42073, 7, "  ");
        setField(term42072, term42072.getClass(), "row_1_Border", term42073);
        setElement(term42106, 0, "  ");
        setElement(term42106, 1, "  ");
        setElement(term42106, 2, "  ");
        setElement(term42106, 3, "  ");
        setElement(term42106, 4, "  ");
        setElement(term42106, 5, "  ");
        setElement(term42106, 6, "  ");
        setElement(term42106, 7, "  ");
        setField(term42072, term42072.getClass(), "row_1_Align_", term42106);
        setElement(term42139, 0, "  ");
        setElement(term42139, 1, "  ");
        setElement(term42139, 2, "  ");
        setElement(term42139, 3, "  ");
        setElement(term42139, 4, "  ");
        setElement(term42139, 5, "  ");
        setElement(term42139, 6, "  ");
        setElement(term42139, 7, "  ");
        setField(term42072, term42072.getClass(), "row_2_Border", term42139);
        setElement(term42172, 0, "  ");
        setElement(term42172, 1, "  ");
        setElement(term42172, 2, "  ");
        setElement(term42172, 3, "  ");
        setElement(term42172, 4, "  ");
        setElement(term42172, 5, "  ");
        setElement(term42172, 6, "  ");
        setElement(term42172, 7, "  ");
        setField(term42072, term42072.getClass(), "row_2_Align_", term42172);
        setElement(term42205, 0, "  ");
        setElement(term42205, 1, "  ");
        setElement(term42205, 2, "  ");
        setElement(term42205, 3, "  ");
        setElement(term42205, 4, "  ");
        setElement(term42205, 5, "  ");
        setElement(term42205, 6, "  ");
        setElement(term42205, 7, "  ");
        setField(term42072, term42072.getClass(), "row_3_Border", term42205);
        setElement(term42238, 0, "  ");
        setElement(term42238, 1, "  ");
        setElement(term42238, 2, "  ");
        setElement(term42238, 3, "  ");
        setElement(term42238, 4, "  ");
        setElement(term42238, 5, "  ");
        setElement(term42238, 6, "  ");
        setElement(term42238, 7, "  ");
        setField(term42072, term42072.getClass(), "row_3_Align_", term42238);
        setElement(term42271, 0, "  ");
        setElement(term42271, 1, "  ");
        setElement(term42271, 2, "  ");
        setElement(term42271, 3, "  ");
        setElement(term42271, 4, "  ");
        setElement(term42271, 5, "  ");
        setElement(term42271, 6, "  ");
        setElement(term42271, 7, "  ");
        setField(term42072, term42072.getClass(), "label_Border", term42271);
        setElement(term42304, 0, "  ");
        setElement(term42304, 1, "  ");
        setElement(term42304, 2, "  ");
        setElement(term42304, 3, "  ");
        setElement(term42304, 4, "  ");
        setElement(term42304, 5, "  ");
        setElement(term42304, 6, "  ");
        setElement(term42304, 7, "  ");
        setField(term42072, term42072.getClass(), "label_Align_", term42304);
        setElement(term42337, 0, "  ");
        setElement(term42337, 1, "  ");
        setElement(term42337, 2, "  ");
        setElement(term42337, 3, "  ");
        setElement(term42337, 4, "  ");
        setElement(term42337, 5, "  ");
        setElement(term42337, 6, "  ");
        setElement(term42337, 7, "  ");
        setField(term42072, term42072.getClass(), "data__Border", term42337);
        setElement(term42370, 0, "  ");
        setElement(term42370, 1, "  ");
        setElement(term42370, 2, "  ");
        setElement(term42370, 3, "  ");
        setElement(term42370, 4, "  ");
        setElement(term42370, 5, "  ");
        setElement(term42370, 6, "  ");
        setElement(term42370, 7, "  ");
        setField(term42072, term42072.getClass(), "data__Align_", term42370);
        setField(term42072, term42072.getClass(), "sheet_Name", "qrmUWIxufo");
        setIntElement(term42415, 0, -2015854073);
        setIntElement(term42415, 1, 538259104);
        setIntElement(term42415, 2, 96566506);
        setIntElement(term42415, 3, -343325701);
        setIntElement(term42415, 4, 107945604);
        setField(term42072, term42072.getClass(), "column_Width", term42415);
        setField(term42072, term42072.getClass(), "value_Data", term42421);
        setBooleanField(term42072, term42072.getClass(), "printSetup", false);
        term42423 = (int[]) newIntArray(6);
        setIntElement(term42423, 0, -1963464809);
        setIntElement(term42423, 1, 71190297);
        setIntElement(term42423, 2, 1202361360);
        setIntElement(term42423, 3, -2015048153);
        setIntElement(term42423, 4, -2063457669);
        setIntElement(term42423, 5, -1222006000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term42423;
        callMethod(klass, "setColumn_Width", argTypes, term42072, args);
    }

};


