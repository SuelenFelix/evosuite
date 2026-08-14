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

public class WorkSheet_array_10901379944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37547;

    public WorkSheet_array_10901379944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37547 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term37548 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37581 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37614 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37647 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37680 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37713 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37746 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37779 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37812 = (Object[]) newArray("java.lang.String", 8);
        Object[] term37845 = (Object[]) newArray("java.lang.String", 8);
        int[] term37890 = (int[]) newIntArray(2);
        Object[] term37893 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 1);
        Object[] term37894 = (Object[]) newArray("java.lang.String", 0);
        setElement(term37548, 0, "  ");
        setElement(term37548, 1, "  ");
        setElement(term37548, 2, "  ");
        setElement(term37548, 3, "  ");
        setElement(term37548, 4, "  ");
        setElement(term37548, 5, "  ");
        setElement(term37548, 6, "  ");
        setElement(term37548, 7, "  ");
        setField(term37547, term37547.getClass(), "row_1_Border", term37548);
        setElement(term37581, 0, "  ");
        setElement(term37581, 1, "  ");
        setElement(term37581, 2, "  ");
        setElement(term37581, 3, "  ");
        setElement(term37581, 4, "  ");
        setElement(term37581, 5, "  ");
        setElement(term37581, 6, "  ");
        setElement(term37581, 7, "  ");
        setField(term37547, term37547.getClass(), "row_1_Align_", term37581);
        setElement(term37614, 0, "  ");
        setElement(term37614, 1, "  ");
        setElement(term37614, 2, "  ");
        setElement(term37614, 3, "  ");
        setElement(term37614, 4, "  ");
        setElement(term37614, 5, "  ");
        setElement(term37614, 6, "  ");
        setElement(term37614, 7, "  ");
        setField(term37547, term37547.getClass(), "row_2_Border", term37614);
        setElement(term37647, 0, "  ");
        setElement(term37647, 1, "  ");
        setElement(term37647, 2, "  ");
        setElement(term37647, 3, "  ");
        setElement(term37647, 4, "  ");
        setElement(term37647, 5, "  ");
        setElement(term37647, 6, "  ");
        setElement(term37647, 7, "  ");
        setField(term37547, term37547.getClass(), "row_2_Align_", term37647);
        setElement(term37680, 0, "  ");
        setElement(term37680, 1, "  ");
        setElement(term37680, 2, "  ");
        setElement(term37680, 3, "  ");
        setElement(term37680, 4, "  ");
        setElement(term37680, 5, "  ");
        setElement(term37680, 6, "  ");
        setElement(term37680, 7, "  ");
        setField(term37547, term37547.getClass(), "row_3_Border", term37680);
        setElement(term37713, 0, "  ");
        setElement(term37713, 1, "  ");
        setElement(term37713, 2, "  ");
        setElement(term37713, 3, "  ");
        setElement(term37713, 4, "  ");
        setElement(term37713, 5, "  ");
        setElement(term37713, 6, "  ");
        setElement(term37713, 7, "  ");
        setField(term37547, term37547.getClass(), "row_3_Align_", term37713);
        setElement(term37746, 0, "  ");
        setElement(term37746, 1, "  ");
        setElement(term37746, 2, "  ");
        setElement(term37746, 3, "  ");
        setElement(term37746, 4, "  ");
        setElement(term37746, 5, "  ");
        setElement(term37746, 6, "  ");
        setElement(term37746, 7, "  ");
        setField(term37547, term37547.getClass(), "label_Border", term37746);
        setElement(term37779, 0, "  ");
        setElement(term37779, 1, "  ");
        setElement(term37779, 2, "  ");
        setElement(term37779, 3, "  ");
        setElement(term37779, 4, "  ");
        setElement(term37779, 5, "  ");
        setElement(term37779, 6, "  ");
        setElement(term37779, 7, "  ");
        setField(term37547, term37547.getClass(), "label_Align_", term37779);
        setElement(term37812, 0, "  ");
        setElement(term37812, 1, "  ");
        setElement(term37812, 2, "  ");
        setElement(term37812, 3, "  ");
        setElement(term37812, 4, "  ");
        setElement(term37812, 5, "  ");
        setElement(term37812, 6, "  ");
        setElement(term37812, 7, "  ");
        setField(term37547, term37547.getClass(), "data__Border", term37812);
        setElement(term37845, 0, "  ");
        setElement(term37845, 1, "  ");
        setElement(term37845, 2, "  ");
        setElement(term37845, 3, "  ");
        setElement(term37845, 4, "  ");
        setElement(term37845, 5, "  ");
        setElement(term37845, 6, "  ");
        setElement(term37845, 7, "  ");
        setField(term37547, term37547.getClass(), "data__Align_", term37845);
        setField(term37547, term37547.getClass(), "sheet_Name", "NUqhsZprdZ");
        setIntElement(term37890, 0, 691577392);
        setIntElement(term37890, 1, -893623680);
        setField(term37547, term37547.getClass(), "column_Width", term37890);
        setElement(term37893, 0, term37894);
        setField(term37547, term37547.getClass(), "value_Data", term37893);
        setBooleanField(term37547, term37547.getClass(), "printSetup", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jkzgCqWJrA";
        callMethod(klass, "array", argTypes, term37547, args);
    }

};


