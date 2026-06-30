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
     Object term42329;
     Object term42793;

    public WorkSheet_array_9378829495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42329 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term42330 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42363 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42396 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42429 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42462 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42495 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42528 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42561 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42594 = (Object[]) newArray("java.lang.String", 8);
        Object[] term42627 = (Object[]) newArray("java.lang.String", 8);
        int[] term42672 = (int[]) newIntArray(7);
        Object[] term42680 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 2);
        Object[] term42681 = (Object[]) newArray("java.lang.String", 0);
        Object[] term42682 = (Object[]) newArray("java.lang.String", 9);
        setElement(term42330, 0, "  ");
        setElement(term42330, 1, "  ");
        setElement(term42330, 2, "  ");
        setElement(term42330, 3, "  ");
        setElement(term42330, 4, "  ");
        setElement(term42330, 5, "  ");
        setElement(term42330, 6, "  ");
        setElement(term42330, 7, "  ");
        setField(term42329, term42329.getClass(), "row_1_Border", term42330);
        setElement(term42363, 0, "  ");
        setElement(term42363, 1, "  ");
        setElement(term42363, 2, "  ");
        setElement(term42363, 3, "  ");
        setElement(term42363, 4, "  ");
        setElement(term42363, 5, "  ");
        setElement(term42363, 6, "  ");
        setElement(term42363, 7, "  ");
        setField(term42329, term42329.getClass(), "row_1_Align_", term42363);
        setElement(term42396, 0, "  ");
        setElement(term42396, 1, "  ");
        setElement(term42396, 2, "  ");
        setElement(term42396, 3, "  ");
        setElement(term42396, 4, "  ");
        setElement(term42396, 5, "  ");
        setElement(term42396, 6, "  ");
        setElement(term42396, 7, "  ");
        setField(term42329, term42329.getClass(), "row_2_Border", term42396);
        setElement(term42429, 0, "  ");
        setElement(term42429, 1, "  ");
        setElement(term42429, 2, "  ");
        setElement(term42429, 3, "  ");
        setElement(term42429, 4, "  ");
        setElement(term42429, 5, "  ");
        setElement(term42429, 6, "  ");
        setElement(term42429, 7, "  ");
        setField(term42329, term42329.getClass(), "row_2_Align_", term42429);
        setElement(term42462, 0, "  ");
        setElement(term42462, 1, "  ");
        setElement(term42462, 2, "  ");
        setElement(term42462, 3, "  ");
        setElement(term42462, 4, "  ");
        setElement(term42462, 5, "  ");
        setElement(term42462, 6, "  ");
        setElement(term42462, 7, "  ");
        setField(term42329, term42329.getClass(), "row_3_Border", term42462);
        setElement(term42495, 0, "  ");
        setElement(term42495, 1, "  ");
        setElement(term42495, 2, "  ");
        setElement(term42495, 3, "  ");
        setElement(term42495, 4, "  ");
        setElement(term42495, 5, "  ");
        setElement(term42495, 6, "  ");
        setElement(term42495, 7, "  ");
        setField(term42329, term42329.getClass(), "row_3_Align_", term42495);
        setElement(term42528, 0, "  ");
        setElement(term42528, 1, "  ");
        setElement(term42528, 2, "  ");
        setElement(term42528, 3, "  ");
        setElement(term42528, 4, "  ");
        setElement(term42528, 5, "  ");
        setElement(term42528, 6, "  ");
        setElement(term42528, 7, "  ");
        setField(term42329, term42329.getClass(), "label_Border", term42528);
        setElement(term42561, 0, "  ");
        setElement(term42561, 1, "  ");
        setElement(term42561, 2, "  ");
        setElement(term42561, 3, "  ");
        setElement(term42561, 4, "  ");
        setElement(term42561, 5, "  ");
        setElement(term42561, 6, "  ");
        setElement(term42561, 7, "  ");
        setField(term42329, term42329.getClass(), "label_Align_", term42561);
        setElement(term42594, 0, "  ");
        setElement(term42594, 1, "  ");
        setElement(term42594, 2, "  ");
        setElement(term42594, 3, "  ");
        setElement(term42594, 4, "  ");
        setElement(term42594, 5, "  ");
        setElement(term42594, 6, "  ");
        setElement(term42594, 7, "  ");
        setField(term42329, term42329.getClass(), "data__Border", term42594);
        setElement(term42627, 0, "  ");
        setElement(term42627, 1, "  ");
        setElement(term42627, 2, "  ");
        setElement(term42627, 3, "  ");
        setElement(term42627, 4, "  ");
        setElement(term42627, 5, "  ");
        setElement(term42627, 6, "  ");
        setElement(term42627, 7, "  ");
        setField(term42329, term42329.getClass(), "data__Align_", term42627);
        setField(term42329, term42329.getClass(), "sheet_Name", "uWqXrwAsDU");
        setIntElement(term42672, 0, 1687361082);
        setIntElement(term42672, 1, 584893196);
        setIntElement(term42672, 2, 497269071);
        setIntElement(term42672, 3, -1899301124);
        setIntElement(term42672, 4, -1882480155);
        setIntElement(term42672, 5, -1410220680);
        setIntElement(term42672, 6, 389427431);
        setField(term42329, term42329.getClass(), "column_Width", term42672);
        setElement(term42680, 0, term42681);
        setElement(term42682, 0, "hgFbWAUtsu");
        setElement(term42682, 1, "HqoTWlkbwF");
        setElement(term42682, 2, "CwNELDTAPP");
        setElement(term42682, 3, "GSzQdbHLHw");
        setElement(term42682, 4, "IkfarsYNJO");
        setElement(term42682, 5, "aZKOWhHMEh");
        setElement(term42682, 6, "YfkhviKZwl");
        setElement(term42682, 7, "DcOhhAfJTI");
        setElement(term42682, 8, "gYTIkBFOoS");
        setElement(term42680, 1, term42682);
        setField(term42329, term42329.getClass(), "value_Data", term42680);
        setIntField(term42329, term42329.getClass(), "print_Scale", 100);
        setBooleanField(term42329, term42329.getClass(), "printSetup", false);
        term42793 = new Integer(-1945706126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42793;
        callMethod(klass, "array", argTypes, term42329, args);
    }

};


