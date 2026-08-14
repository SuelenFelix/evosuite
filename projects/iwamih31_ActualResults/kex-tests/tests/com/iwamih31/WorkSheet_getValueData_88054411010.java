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

public class WorkSheet_getValueData_88054411010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42611;

    public WorkSheet_getValueData_88054411010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42611 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term42612 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42645 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42678 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42711 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42744 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42777 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42810 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42843 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42876 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42909 = (Object[]) newArray("java.lang.String", 8);
        int[] term42954 = (int[]) newIntArray(0);
        Object[] term42955 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 2);
        Object[] term42956 = (Object[]) newArray("java.lang.String", 6);
        Object[] term43029 = (Object[]) newArray("java.lang.String", 2);
        setElement(term42612, 0, "  ");
        setElement(term42612, 1, "  ");
        setElement(term42612, 2, "  ");
        setElement(term42612, 3, "  ");
        setElement(term42612, 4, "  ");
        setElement(term42612, 5, "  ");
        setElement(term42612, 6, "  ");
        setElement(term42612, 7, "  ");
        setField(term42611, term42611.getClass(), "row_1_Border", term42612);
        setElement(term42645, 0, "  ");
        setElement(term42645, 1, "  ");
        setElement(term42645, 2, "  ");
        setElement(term42645, 3, "  ");
        setElement(term42645, 4, "  ");
        setElement(term42645, 5, "  ");
        setElement(term42645, 6, "  ");
        setElement(term42645, 7, "  ");
        setField(term42611, term42611.getClass(), "row_1_Align_", term42645);
        setElement(term42678, 0, "  ");
        setElement(term42678, 1, "  ");
        setElement(term42678, 2, "  ");
        setElement(term42678, 3, "  ");
        setElement(term42678, 4, "  ");
        setElement(term42678, 5, "  ");
        setElement(term42678, 6, "  ");
        setElement(term42678, 7, "  ");
        setField(term42611, term42611.getClass(), "row_2_Border", term42678);
        setElement(term42711, 0, "  ");
        setElement(term42711, 1, "  ");
        setElement(term42711, 2, "  ");
        setElement(term42711, 3, "  ");
        setElement(term42711, 4, "  ");
        setElement(term42711, 5, "  ");
        setElement(term42711, 6, "  ");
        setElement(term42711, 7, "  ");
        setField(term42611, term42611.getClass(), "row_2_Align_", term42711);
        setElement(term42744, 0, "  ");
        setElement(term42744, 1, "  ");
        setElement(term42744, 2, "  ");
        setElement(term42744, 3, "  ");
        setElement(term42744, 4, "  ");
        setElement(term42744, 5, "  ");
        setElement(term42744, 6, "  ");
        setElement(term42744, 7, "  ");
        setField(term42611, term42611.getClass(), "row_3_Border", term42744);
        setElement(term42777, 0, "  ");
        setElement(term42777, 1, "  ");
        setElement(term42777, 2, "  ");
        setElement(term42777, 3, "  ");
        setElement(term42777, 4, "  ");
        setElement(term42777, 5, "  ");
        setElement(term42777, 6, "  ");
        setElement(term42777, 7, "  ");
        setField(term42611, term42611.getClass(), "row_3_Align_", term42777);
        setElement(term42810, 0, "  ");
        setElement(term42810, 1, "  ");
        setElement(term42810, 2, "  ");
        setElement(term42810, 3, "  ");
        setElement(term42810, 4, "  ");
        setElement(term42810, 5, "  ");
        setElement(term42810, 6, "  ");
        setElement(term42810, 7, "  ");
        setField(term42611, term42611.getClass(), "label_Border", term42810);
        setElement(term42843, 0, "  ");
        setElement(term42843, 1, "  ");
        setElement(term42843, 2, "  ");
        setElement(term42843, 3, "  ");
        setElement(term42843, 4, "  ");
        setElement(term42843, 5, "  ");
        setElement(term42843, 6, "  ");
        setElement(term42843, 7, "  ");
        setField(term42611, term42611.getClass(), "label_Align_", term42843);
        setElement(term42876, 0, "  ");
        setElement(term42876, 1, "  ");
        setElement(term42876, 2, "  ");
        setElement(term42876, 3, "  ");
        setElement(term42876, 4, "  ");
        setElement(term42876, 5, "  ");
        setElement(term42876, 6, "  ");
        setElement(term42876, 7, "  ");
        setField(term42611, term42611.getClass(), "data__Border", term42876);
        setElement(term42909, 0, "  ");
        setElement(term42909, 1, "  ");
        setElement(term42909, 2, "  ");
        setElement(term42909, 3, "  ");
        setElement(term42909, 4, "  ");
        setElement(term42909, 5, "  ");
        setElement(term42909, 6, "  ");
        setElement(term42909, 7, "  ");
        setField(term42611, term42611.getClass(), "data__Align_", term42909);
        setField(term42611, term42611.getClass(), "sheet_Name", "SeWCUkXfZv");
        setField(term42611, term42611.getClass(), "column_Width", term42954);
        setElement(term42956, 0, "woQcQRYwNH");
        setElement(term42956, 1, "uQjzusifTg");
        setElement(term42956, 2, "mOulGkUjOk");
        setElement(term42956, 3, "hNWRuNEgOf");
        setElement(term42956, 4, "CEtjGBplmv");
        setElement(term42956, 5, "XosDTAzIAT");
        setElement(term42955, 0, term42956);
        setElement(term43029, 0, "lcCEhCpiZM");
        setElement(term43029, 1, "OPJlqMJxdq");
        setElement(term42955, 1, term43029);
        setField(term42611, term42611.getClass(), "value_Data", term42955);
        setBooleanField(term42611, term42611.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue_Data", argTypes, term42611, args);
    }

};


