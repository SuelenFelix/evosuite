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
import java.lang.Integer;

public class WorkSheet_array_9378829495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38090;
     Object term38611;

    public WorkSheet_array_9378829495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38090 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term38091 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38124 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38157 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38190 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38223 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38256 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38289 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38322 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38355 = (Object[]) newArray("java.lang.String", 8);
        Object[] term38388 = (Object[]) newArray("java.lang.String", 8);
        int[] term38433 = (int[]) newIntArray(2);
        Object[] term38436 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 5);
        Object[] term38437 = (Object[]) newArray("java.lang.String", 2);
        Object[] term38462 = (Object[]) newArray("java.lang.String", 0);
        Object[] term38463 = (Object[]) newArray("java.lang.String", 5);
        Object[] term38524 = (Object[]) newArray("java.lang.String", 4);
        Object[] term38573 = (Object[]) newArray("java.lang.String", 3);
        setElement(term38091, 0, "  ");
        setElement(term38091, 1, "  ");
        setElement(term38091, 2, "  ");
        setElement(term38091, 3, "  ");
        setElement(term38091, 4, "  ");
        setElement(term38091, 5, "  ");
        setElement(term38091, 6, "  ");
        setElement(term38091, 7, "  ");
        setField(term38090, term38090.getClass(), "row_1_Border", term38091);
        setElement(term38124, 0, "  ");
        setElement(term38124, 1, "  ");
        setElement(term38124, 2, "  ");
        setElement(term38124, 3, "  ");
        setElement(term38124, 4, "  ");
        setElement(term38124, 5, "  ");
        setElement(term38124, 6, "  ");
        setElement(term38124, 7, "  ");
        setField(term38090, term38090.getClass(), "row_1_Align_", term38124);
        setElement(term38157, 0, "  ");
        setElement(term38157, 1, "  ");
        setElement(term38157, 2, "  ");
        setElement(term38157, 3, "  ");
        setElement(term38157, 4, "  ");
        setElement(term38157, 5, "  ");
        setElement(term38157, 6, "  ");
        setElement(term38157, 7, "  ");
        setField(term38090, term38090.getClass(), "row_2_Border", term38157);
        setElement(term38190, 0, "  ");
        setElement(term38190, 1, "  ");
        setElement(term38190, 2, "  ");
        setElement(term38190, 3, "  ");
        setElement(term38190, 4, "  ");
        setElement(term38190, 5, "  ");
        setElement(term38190, 6, "  ");
        setElement(term38190, 7, "  ");
        setField(term38090, term38090.getClass(), "row_2_Align_", term38190);
        setElement(term38223, 0, "  ");
        setElement(term38223, 1, "  ");
        setElement(term38223, 2, "  ");
        setElement(term38223, 3, "  ");
        setElement(term38223, 4, "  ");
        setElement(term38223, 5, "  ");
        setElement(term38223, 6, "  ");
        setElement(term38223, 7, "  ");
        setField(term38090, term38090.getClass(), "row_3_Border", term38223);
        setElement(term38256, 0, "  ");
        setElement(term38256, 1, "  ");
        setElement(term38256, 2, "  ");
        setElement(term38256, 3, "  ");
        setElement(term38256, 4, "  ");
        setElement(term38256, 5, "  ");
        setElement(term38256, 6, "  ");
        setElement(term38256, 7, "  ");
        setField(term38090, term38090.getClass(), "row_3_Align_", term38256);
        setElement(term38289, 0, "  ");
        setElement(term38289, 1, "  ");
        setElement(term38289, 2, "  ");
        setElement(term38289, 3, "  ");
        setElement(term38289, 4, "  ");
        setElement(term38289, 5, "  ");
        setElement(term38289, 6, "  ");
        setElement(term38289, 7, "  ");
        setField(term38090, term38090.getClass(), "label_Border", term38289);
        setElement(term38322, 0, "  ");
        setElement(term38322, 1, "  ");
        setElement(term38322, 2, "  ");
        setElement(term38322, 3, "  ");
        setElement(term38322, 4, "  ");
        setElement(term38322, 5, "  ");
        setElement(term38322, 6, "  ");
        setElement(term38322, 7, "  ");
        setField(term38090, term38090.getClass(), "label_Align_", term38322);
        setElement(term38355, 0, "  ");
        setElement(term38355, 1, "  ");
        setElement(term38355, 2, "  ");
        setElement(term38355, 3, "  ");
        setElement(term38355, 4, "  ");
        setElement(term38355, 5, "  ");
        setElement(term38355, 6, "  ");
        setElement(term38355, 7, "  ");
        setField(term38090, term38090.getClass(), "data__Border", term38355);
        setElement(term38388, 0, "  ");
        setElement(term38388, 1, "  ");
        setElement(term38388, 2, "  ");
        setElement(term38388, 3, "  ");
        setElement(term38388, 4, "  ");
        setElement(term38388, 5, "  ");
        setElement(term38388, 6, "  ");
        setElement(term38388, 7, "  ");
        setField(term38090, term38090.getClass(), "data__Align_", term38388);
        setField(term38090, term38090.getClass(), "sheet_Name", "rawiXxuyRn");
        setIntElement(term38433, 0, -1963434938);
        setIntElement(term38433, 1, 906181092);
        setField(term38090, term38090.getClass(), "column_Width", term38433);
        setElement(term38437, 0, "ZyAecZGope");
        setElement(term38437, 1, "uYnmxkwLfB");
        setElement(term38436, 0, term38437);
        setElement(term38436, 1, term38462);
        setElement(term38463, 0, "RVZTQxYOUO");
        setElement(term38463, 1, "tydPpKxAbv");
        setElement(term38463, 2, "CJxQpJUfLJ");
        setElement(term38463, 3, "NUUjAyqOva");
        setElement(term38463, 4, "EoAMIIUdDX");
        setElement(term38436, 2, term38463);
        setElement(term38524, 0, "OATNwRncsv");
        setElement(term38524, 1, "rACmzcmIPm");
        setElement(term38524, 2, "OCtePrLDhe");
        setElement(term38524, 3, "yqEphNxUPZ");
        setElement(term38436, 3, term38524);
        setElement(term38573, 0, "mJJxTuZuKO");
        setElement(term38573, 1, "anSZCikKpS");
        setElement(term38573, 2, "zvMQGbTtsV");
        setElement(term38436, 4, term38573);
        setField(term38090, term38090.getClass(), "value_Data", term38436);
        setBooleanField(term38090, term38090.getClass(), "printSetup", true);
        term38611 = new Integer(1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38611;
        callMethod(klass, "array", argTypes, term38090, args);
    }

};


