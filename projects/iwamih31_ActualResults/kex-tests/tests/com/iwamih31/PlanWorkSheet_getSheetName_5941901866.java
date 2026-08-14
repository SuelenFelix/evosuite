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

public class PlanWorkSheet_getSheetName_5941901866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51804;

    public PlanWorkSheet_getSheetName_5941901866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51804 = newInstance(Class.forName("com.iwamih31.PlanWorkSheet"));
        Object[] term52135 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52168 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52201 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52234 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52267 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52300 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52333 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52366 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52399 = (Object[]) newArray("java.lang.String", 8);
        Object[] term52432 = (Object[]) newArray("java.lang.String", 8);
        int[] term52477 = (int[]) newIntArray(1);
        Object[] term52479 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term52480 = (Object[]) newArray("java.lang.String", 8);
        setElement(term52135, 0, "  ");
        setElement(term52135, 1, "  ");
        setElement(term52135, 2, "  ");
        setElement(term52135, 3, "  ");
        setElement(term52135, 4, "  ");
        setElement(term52135, 5, "  ");
        setElement(term52135, 6, "  ");
        setElement(term52135, 7, "  ");
        setField(term51804, term51804.getClass(), "row_1_Border", term52135);
        setElement(term52168, 0, "  ");
        setElement(term52168, 1, "  ");
        setElement(term52168, 2, "  ");
        setElement(term52168, 3, "  ");
        setElement(term52168, 4, "  ");
        setElement(term52168, 5, "  ");
        setElement(term52168, 6, "  ");
        setElement(term52168, 7, "  ");
        setField(term51804, term51804.getClass(), "row_1_Align_", term52168);
        setElement(term52201, 0, "  ");
        setElement(term52201, 1, "  ");
        setElement(term52201, 2, "  ");
        setElement(term52201, 3, "  ");
        setElement(term52201, 4, "  ");
        setElement(term52201, 5, "  ");
        setElement(term52201, 6, "  ");
        setElement(term52201, 7, "  ");
        setField(term51804, term51804.getClass(), "row_2_Border", term52201);
        setElement(term52234, 0, "  ");
        setElement(term52234, 1, "  ");
        setElement(term52234, 2, "  ");
        setElement(term52234, 3, "  ");
        setElement(term52234, 4, "  ");
        setElement(term52234, 5, "  ");
        setElement(term52234, 6, "  ");
        setElement(term52234, 7, "  ");
        setField(term51804, term51804.getClass(), "row_2_Align_", term52234);
        setElement(term52267, 0, "  ");
        setElement(term52267, 1, "  ");
        setElement(term52267, 2, "  ");
        setElement(term52267, 3, "  ");
        setElement(term52267, 4, "  ");
        setElement(term52267, 5, "  ");
        setElement(term52267, 6, "  ");
        setElement(term52267, 7, "  ");
        setField(term51804, term51804.getClass(), "row_3_Border", term52267);
        setElement(term52300, 0, "  ");
        setElement(term52300, 1, "  ");
        setElement(term52300, 2, "  ");
        setElement(term52300, 3, "  ");
        setElement(term52300, 4, "  ");
        setElement(term52300, 5, "  ");
        setElement(term52300, 6, "  ");
        setElement(term52300, 7, "  ");
        setField(term51804, term51804.getClass(), "row_3_Align_", term52300);
        setElement(term52333, 0, "  ");
        setElement(term52333, 1, "  ");
        setElement(term52333, 2, "  ");
        setElement(term52333, 3, "  ");
        setElement(term52333, 4, "  ");
        setElement(term52333, 5, "  ");
        setElement(term52333, 6, "  ");
        setElement(term52333, 7, "  ");
        setField(term51804, term51804.getClass(), "label_Border", term52333);
        setElement(term52366, 0, "  ");
        setElement(term52366, 1, "  ");
        setElement(term52366, 2, "  ");
        setElement(term52366, 3, "  ");
        setElement(term52366, 4, "  ");
        setElement(term52366, 5, "  ");
        setElement(term52366, 6, "  ");
        setElement(term52366, 7, "  ");
        setField(term51804, term51804.getClass(), "label_Align_", term52366);
        setElement(term52399, 0, "  ");
        setElement(term52399, 1, "  ");
        setElement(term52399, 2, "  ");
        setElement(term52399, 3, "  ");
        setElement(term52399, 4, "  ");
        setElement(term52399, 5, "  ");
        setElement(term52399, 6, "  ");
        setElement(term52399, 7, "  ");
        setField(term51804, term51804.getClass(), "data__Border", term52399);
        setElement(term52432, 0, "  ");
        setElement(term52432, 1, "  ");
        setElement(term52432, 2, "  ");
        setElement(term52432, 3, "  ");
        setElement(term52432, 4, "  ");
        setElement(term52432, 5, "  ");
        setElement(term52432, 6, "  ");
        setElement(term52432, 7, "  ");
        setField(term51804, term51804.getClass(), "data__Align_", term52432);
        setField(term51804, term51804.getClass(), "sheet_Name", "PqduvNFXXw");
        setIntElement(term52477, 0, -461771056);
        setField(term51804, term51804.getClass(), "column_Width", term52477);
        setElement(term52480, 0, "bMQrxvaBAI");
        setElement(term52480, 1, "StFtysZlWm");
        setElement(term52480, 2, "CoqUcmjnkF");
        setElement(term52480, 3, "oOrXvGaFwa");
        setElement(term52480, 4, "KJSTLGsSvO");
        setElement(term52480, 5, "kSkiIpaepq");
        setElement(term52480, 6, "FzJhDecyvI");
        setElement(term52480, 7, "zOxseYMSdY");
        setElement(term52479, 0, term52480);
        setField(term51804, term51804.getClass(), "value_Data", term52479);
        setBooleanField(term51804, term51804.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.PlanWorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSheet_Name", argTypes, term51804, args);
    }

};


