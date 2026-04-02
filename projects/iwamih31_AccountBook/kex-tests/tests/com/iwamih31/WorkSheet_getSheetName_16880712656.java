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

public class WorkSheet_getSheetName_16880712656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43062;

    public WorkSheet_getSheetName_16880712656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43062 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term43063 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43096 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43129 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43162 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43195 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43228 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43261 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43294 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43327 = (Object[]) newArray("java.lang.String", 8);
        Object[] term43360 = (Object[]) newArray("java.lang.String", 8);
        int[] term43405 = (int[]) newIntArray(5);
        Object[] term43411 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term43412 = (Object[]) newArray("java.lang.String", 2);
        setElement(term43063, 0, "  ");
        setElement(term43063, 1, "  ");
        setElement(term43063, 2, "  ");
        setElement(term43063, 3, "  ");
        setElement(term43063, 4, "  ");
        setElement(term43063, 5, "  ");
        setElement(term43063, 6, "  ");
        setElement(term43063, 7, "  ");
        setField(term43062, term43062.getClass(), "row_1_Border", term43063);
        setElement(term43096, 0, "  ");
        setElement(term43096, 1, "  ");
        setElement(term43096, 2, "  ");
        setElement(term43096, 3, "  ");
        setElement(term43096, 4, "  ");
        setElement(term43096, 5, "  ");
        setElement(term43096, 6, "  ");
        setElement(term43096, 7, "  ");
        setField(term43062, term43062.getClass(), "row_1_Align_", term43096);
        setElement(term43129, 0, "  ");
        setElement(term43129, 1, "  ");
        setElement(term43129, 2, "  ");
        setElement(term43129, 3, "  ");
        setElement(term43129, 4, "  ");
        setElement(term43129, 5, "  ");
        setElement(term43129, 6, "  ");
        setElement(term43129, 7, "  ");
        setField(term43062, term43062.getClass(), "row_2_Border", term43129);
        setElement(term43162, 0, "  ");
        setElement(term43162, 1, "  ");
        setElement(term43162, 2, "  ");
        setElement(term43162, 3, "  ");
        setElement(term43162, 4, "  ");
        setElement(term43162, 5, "  ");
        setElement(term43162, 6, "  ");
        setElement(term43162, 7, "  ");
        setField(term43062, term43062.getClass(), "row_2_Align_", term43162);
        setElement(term43195, 0, "  ");
        setElement(term43195, 1, "  ");
        setElement(term43195, 2, "  ");
        setElement(term43195, 3, "  ");
        setElement(term43195, 4, "  ");
        setElement(term43195, 5, "  ");
        setElement(term43195, 6, "  ");
        setElement(term43195, 7, "  ");
        setField(term43062, term43062.getClass(), "row_3_Border", term43195);
        setElement(term43228, 0, "  ");
        setElement(term43228, 1, "  ");
        setElement(term43228, 2, "  ");
        setElement(term43228, 3, "  ");
        setElement(term43228, 4, "  ");
        setElement(term43228, 5, "  ");
        setElement(term43228, 6, "  ");
        setElement(term43228, 7, "  ");
        setField(term43062, term43062.getClass(), "row_3_Align_", term43228);
        setElement(term43261, 0, "  ");
        setElement(term43261, 1, "  ");
        setElement(term43261, 2, "  ");
        setElement(term43261, 3, "  ");
        setElement(term43261, 4, "  ");
        setElement(term43261, 5, "  ");
        setElement(term43261, 6, "  ");
        setElement(term43261, 7, "  ");
        setField(term43062, term43062.getClass(), "label_Border", term43261);
        setElement(term43294, 0, "  ");
        setElement(term43294, 1, "  ");
        setElement(term43294, 2, "  ");
        setElement(term43294, 3, "  ");
        setElement(term43294, 4, "  ");
        setElement(term43294, 5, "  ");
        setElement(term43294, 6, "  ");
        setElement(term43294, 7, "  ");
        setField(term43062, term43062.getClass(), "label_Align_", term43294);
        setElement(term43327, 0, "  ");
        setElement(term43327, 1, "  ");
        setElement(term43327, 2, "  ");
        setElement(term43327, 3, "  ");
        setElement(term43327, 4, "  ");
        setElement(term43327, 5, "  ");
        setElement(term43327, 6, "  ");
        setElement(term43327, 7, "  ");
        setField(term43062, term43062.getClass(), "data__Border", term43327);
        setElement(term43360, 0, "  ");
        setElement(term43360, 1, "  ");
        setElement(term43360, 2, "  ");
        setElement(term43360, 3, "  ");
        setElement(term43360, 4, "  ");
        setElement(term43360, 5, "  ");
        setElement(term43360, 6, "  ");
        setElement(term43360, 7, "  ");
        setField(term43062, term43062.getClass(), "data__Align_", term43360);
        setField(term43062, term43062.getClass(), "sheet_Name", "xmzSoVgiED");
        setIntElement(term43405, 0, 1152356969);
        setIntElement(term43405, 1, -1667990367);
        setIntElement(term43405, 2, -1214628358);
        setIntElement(term43405, 3, 1102721075);
        setIntElement(term43405, 4, -426764678);
        setField(term43062, term43062.getClass(), "column_Width", term43405);
        setElement(term43412, 0, "pdSvedKgPq");
        setElement(term43412, 1, "epPTwvcoyb");
        setElement(term43411, 0, term43412);
        setField(term43062, term43062.getClass(), "value_Data", term43411);
        setIntField(term43062, term43062.getClass(), "print_Scale", 100);
        setBooleanField(term43062, term43062.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSheet_Name", argTypes, term43062, args);
    }

};


