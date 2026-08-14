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

public class WorkSheet_setSheetName_2383501377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40230;

    public WorkSheet_setSheetName_2383501377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40230 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term40231 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40264 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40297 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40330 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40363 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40396 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40429 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40462 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40495 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40528 = (Object[]) newArray("java.lang.String", 8);
        int[] term40573 = (int[]) newIntArray(2);
        Object[] term40576 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 4);
        Object[] term40577 = (Object[]) newArray("java.lang.String", 2);
        Object[] term40602 = (Object[]) newArray("java.lang.String", 6);
        Object[] term40675 = (Object[]) newArray("java.lang.String", 4);
        Object[] term40724 = (Object[]) newArray("java.lang.String", 0);
        setElement(term40231, 0, "  ");
        setElement(term40231, 1, "  ");
        setElement(term40231, 2, "  ");
        setElement(term40231, 3, "  ");
        setElement(term40231, 4, "  ");
        setElement(term40231, 5, "  ");
        setElement(term40231, 6, "  ");
        setElement(term40231, 7, "  ");
        setField(term40230, term40230.getClass(), "row_1_Border", term40231);
        setElement(term40264, 0, "  ");
        setElement(term40264, 1, "  ");
        setElement(term40264, 2, "  ");
        setElement(term40264, 3, "  ");
        setElement(term40264, 4, "  ");
        setElement(term40264, 5, "  ");
        setElement(term40264, 6, "  ");
        setElement(term40264, 7, "  ");
        setField(term40230, term40230.getClass(), "row_1_Align_", term40264);
        setElement(term40297, 0, "  ");
        setElement(term40297, 1, "  ");
        setElement(term40297, 2, "  ");
        setElement(term40297, 3, "  ");
        setElement(term40297, 4, "  ");
        setElement(term40297, 5, "  ");
        setElement(term40297, 6, "  ");
        setElement(term40297, 7, "  ");
        setField(term40230, term40230.getClass(), "row_2_Border", term40297);
        setElement(term40330, 0, "  ");
        setElement(term40330, 1, "  ");
        setElement(term40330, 2, "  ");
        setElement(term40330, 3, "  ");
        setElement(term40330, 4, "  ");
        setElement(term40330, 5, "  ");
        setElement(term40330, 6, "  ");
        setElement(term40330, 7, "  ");
        setField(term40230, term40230.getClass(), "row_2_Align_", term40330);
        setElement(term40363, 0, "  ");
        setElement(term40363, 1, "  ");
        setElement(term40363, 2, "  ");
        setElement(term40363, 3, "  ");
        setElement(term40363, 4, "  ");
        setElement(term40363, 5, "  ");
        setElement(term40363, 6, "  ");
        setElement(term40363, 7, "  ");
        setField(term40230, term40230.getClass(), "row_3_Border", term40363);
        setElement(term40396, 0, "  ");
        setElement(term40396, 1, "  ");
        setElement(term40396, 2, "  ");
        setElement(term40396, 3, "  ");
        setElement(term40396, 4, "  ");
        setElement(term40396, 5, "  ");
        setElement(term40396, 6, "  ");
        setElement(term40396, 7, "  ");
        setField(term40230, term40230.getClass(), "row_3_Align_", term40396);
        setElement(term40429, 0, "  ");
        setElement(term40429, 1, "  ");
        setElement(term40429, 2, "  ");
        setElement(term40429, 3, "  ");
        setElement(term40429, 4, "  ");
        setElement(term40429, 5, "  ");
        setElement(term40429, 6, "  ");
        setElement(term40429, 7, "  ");
        setField(term40230, term40230.getClass(), "label_Border", term40429);
        setElement(term40462, 0, "  ");
        setElement(term40462, 1, "  ");
        setElement(term40462, 2, "  ");
        setElement(term40462, 3, "  ");
        setElement(term40462, 4, "  ");
        setElement(term40462, 5, "  ");
        setElement(term40462, 6, "  ");
        setElement(term40462, 7, "  ");
        setField(term40230, term40230.getClass(), "label_Align_", term40462);
        setElement(term40495, 0, "  ");
        setElement(term40495, 1, "  ");
        setElement(term40495, 2, "  ");
        setElement(term40495, 3, "  ");
        setElement(term40495, 4, "  ");
        setElement(term40495, 5, "  ");
        setElement(term40495, 6, "  ");
        setElement(term40495, 7, "  ");
        setField(term40230, term40230.getClass(), "data__Border", term40495);
        setElement(term40528, 0, "  ");
        setElement(term40528, 1, "  ");
        setElement(term40528, 2, "  ");
        setElement(term40528, 3, "  ");
        setElement(term40528, 4, "  ");
        setElement(term40528, 5, "  ");
        setElement(term40528, 6, "  ");
        setElement(term40528, 7, "  ");
        setField(term40230, term40230.getClass(), "data__Align_", term40528);
        setField(term40230, term40230.getClass(), "sheet_Name", "WnEAVdCxna");
        setIntElement(term40573, 0, 53410913);
        setIntElement(term40573, 1, -375014958);
        setField(term40230, term40230.getClass(), "column_Width", term40573);
        setElement(term40577, 0, "lnPIxHHyEK");
        setElement(term40577, 1, "unvQfYuBUz");
        setElement(term40576, 0, term40577);
        setElement(term40602, 0, "RqnYUpQBbG");
        setElement(term40602, 1, "sKnuhmcjCC");
        setElement(term40602, 2, "oCBbVNwMnb");
        setElement(term40602, 3, "miJxAzOVJy");
        setElement(term40602, 4, "kjqlBVaviD");
        setElement(term40602, 5, "iVRXRDCrcM");
        setElement(term40576, 1, term40602);
        setElement(term40675, 0, "WAZFhrxcSM");
        setElement(term40675, 1, "gCRUlTuVMX");
        setElement(term40675, 2, "tYBgGQtkhi");
        setElement(term40675, 3, "PhGPFLIMKH");
        setElement(term40576, 2, term40675);
        setElement(term40576, 3, term40724);
        setField(term40230, term40230.getClass(), "value_Data", term40576);
        setBooleanField(term40230, term40230.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pWCYcLhoms";
        callMethod(klass, "setSheet_Name", argTypes, term40230, args);
    }

};


