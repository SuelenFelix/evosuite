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

public class WorkSheet_fonts_10689976612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40131;

    public WorkSheet_fonts_10689976612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40131 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term40132 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40165 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40198 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40231 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40264 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40297 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40330 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40363 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40396 = (Object[]) newArray("java.lang.String", 8);
        Object[] term40429 = (Object[]) newArray("java.lang.String", 8);
        int[] term40474 = (int[]) newIntArray(6);
        Object[] term40481 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term40482 = (Object[]) newArray("java.lang.String", 2);
        setElement(term40132, 0, "  ");
        setElement(term40132, 1, "  ");
        setElement(term40132, 2, "  ");
        setElement(term40132, 3, "  ");
        setElement(term40132, 4, "  ");
        setElement(term40132, 5, "  ");
        setElement(term40132, 6, "  ");
        setElement(term40132, 7, "  ");
        setField(term40131, term40131.getClass(), "row_1_Border", term40132);
        setElement(term40165, 0, "  ");
        setElement(term40165, 1, "  ");
        setElement(term40165, 2, "  ");
        setElement(term40165, 3, "  ");
        setElement(term40165, 4, "  ");
        setElement(term40165, 5, "  ");
        setElement(term40165, 6, "  ");
        setElement(term40165, 7, "  ");
        setField(term40131, term40131.getClass(), "row_1_Align_", term40165);
        setElement(term40198, 0, "  ");
        setElement(term40198, 1, "  ");
        setElement(term40198, 2, "  ");
        setElement(term40198, 3, "  ");
        setElement(term40198, 4, "  ");
        setElement(term40198, 5, "  ");
        setElement(term40198, 6, "  ");
        setElement(term40198, 7, "  ");
        setField(term40131, term40131.getClass(), "row_2_Border", term40198);
        setElement(term40231, 0, "  ");
        setElement(term40231, 1, "  ");
        setElement(term40231, 2, "  ");
        setElement(term40231, 3, "  ");
        setElement(term40231, 4, "  ");
        setElement(term40231, 5, "  ");
        setElement(term40231, 6, "  ");
        setElement(term40231, 7, "  ");
        setField(term40131, term40131.getClass(), "row_2_Align_", term40231);
        setElement(term40264, 0, "  ");
        setElement(term40264, 1, "  ");
        setElement(term40264, 2, "  ");
        setElement(term40264, 3, "  ");
        setElement(term40264, 4, "  ");
        setElement(term40264, 5, "  ");
        setElement(term40264, 6, "  ");
        setElement(term40264, 7, "  ");
        setField(term40131, term40131.getClass(), "row_3_Border", term40264);
        setElement(term40297, 0, "  ");
        setElement(term40297, 1, "  ");
        setElement(term40297, 2, "  ");
        setElement(term40297, 3, "  ");
        setElement(term40297, 4, "  ");
        setElement(term40297, 5, "  ");
        setElement(term40297, 6, "  ");
        setElement(term40297, 7, "  ");
        setField(term40131, term40131.getClass(), "row_3_Align_", term40297);
        setElement(term40330, 0, "  ");
        setElement(term40330, 1, "  ");
        setElement(term40330, 2, "  ");
        setElement(term40330, 3, "  ");
        setElement(term40330, 4, "  ");
        setElement(term40330, 5, "  ");
        setElement(term40330, 6, "  ");
        setElement(term40330, 7, "  ");
        setField(term40131, term40131.getClass(), "label_Border", term40330);
        setElement(term40363, 0, "  ");
        setElement(term40363, 1, "  ");
        setElement(term40363, 2, "  ");
        setElement(term40363, 3, "  ");
        setElement(term40363, 4, "  ");
        setElement(term40363, 5, "  ");
        setElement(term40363, 6, "  ");
        setElement(term40363, 7, "  ");
        setField(term40131, term40131.getClass(), "label_Align_", term40363);
        setElement(term40396, 0, "  ");
        setElement(term40396, 1, "  ");
        setElement(term40396, 2, "  ");
        setElement(term40396, 3, "  ");
        setElement(term40396, 4, "  ");
        setElement(term40396, 5, "  ");
        setElement(term40396, 6, "  ");
        setElement(term40396, 7, "  ");
        setField(term40131, term40131.getClass(), "data__Border", term40396);
        setElement(term40429, 0, "  ");
        setElement(term40429, 1, "  ");
        setElement(term40429, 2, "  ");
        setElement(term40429, 3, "  ");
        setElement(term40429, 4, "  ");
        setElement(term40429, 5, "  ");
        setElement(term40429, 6, "  ");
        setElement(term40429, 7, "  ");
        setField(term40131, term40131.getClass(), "data__Align_", term40429);
        setField(term40131, term40131.getClass(), "sheet_Name", "EkgprvqZlM");
        setIntElement(term40474, 0, -1731761810);
        setIntElement(term40474, 1, 197109649);
        setIntElement(term40474, 2, -1239406390);
        setIntElement(term40474, 3, 1557431527);
        setIntElement(term40474, 4, -1504890659);
        setIntElement(term40474, 5, 1358829571);
        setField(term40131, term40131.getClass(), "column_Width", term40474);
        setElement(term40482, 0, "fbnKvthhOz");
        setElement(term40482, 1, "PGfCDJTBek");
        setElement(term40481, 0, term40482);
        setField(term40131, term40131.getClass(), "value_Data", term40481);
        setIntField(term40131, term40131.getClass(), "print_Scale", 100);
        setBooleanField(term40131, term40131.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "fonts", argTypes, term40131, args);
    }

};


