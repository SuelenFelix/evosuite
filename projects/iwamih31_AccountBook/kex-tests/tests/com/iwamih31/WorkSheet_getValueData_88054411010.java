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
     Object term47907;

    public WorkSheet_getValueData_88054411010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47907 = newInstance(Class.forName("com.iwamih31.WorkSheet"));
        Object[] term47908 = (Object[]) newArray("java.lang.String", 8);
        Object[] term47941 = (Object[]) newArray("java.lang.String", 8);
        Object[] term47974 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48007 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48040 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48073 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48106 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48139 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48172 = (Object[]) newArray("java.lang.String", 8);
        Object[] term48205 = (Object[]) newArray("java.lang.String", 8);
        int[] term48250 = (int[]) newIntArray(5);
        Object[] term48256 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 2);
        Object[] term48257 = (Object[]) newArray("java.lang.String", 3);
        Object[] term48294 = (Object[]) newArray("java.lang.String", 1);
        setElement(term47908, 0, "  ");
        setElement(term47908, 1, "  ");
        setElement(term47908, 2, "  ");
        setElement(term47908, 3, "  ");
        setElement(term47908, 4, "  ");
        setElement(term47908, 5, "  ");
        setElement(term47908, 6, "  ");
        setElement(term47908, 7, "  ");
        setField(term47907, term47907.getClass(), "row_1_Border", term47908);
        setElement(term47941, 0, "  ");
        setElement(term47941, 1, "  ");
        setElement(term47941, 2, "  ");
        setElement(term47941, 3, "  ");
        setElement(term47941, 4, "  ");
        setElement(term47941, 5, "  ");
        setElement(term47941, 6, "  ");
        setElement(term47941, 7, "  ");
        setField(term47907, term47907.getClass(), "row_1_Align_", term47941);
        setElement(term47974, 0, "  ");
        setElement(term47974, 1, "  ");
        setElement(term47974, 2, "  ");
        setElement(term47974, 3, "  ");
        setElement(term47974, 4, "  ");
        setElement(term47974, 5, "  ");
        setElement(term47974, 6, "  ");
        setElement(term47974, 7, "  ");
        setField(term47907, term47907.getClass(), "row_2_Border", term47974);
        setElement(term48007, 0, "  ");
        setElement(term48007, 1, "  ");
        setElement(term48007, 2, "  ");
        setElement(term48007, 3, "  ");
        setElement(term48007, 4, "  ");
        setElement(term48007, 5, "  ");
        setElement(term48007, 6, "  ");
        setElement(term48007, 7, "  ");
        setField(term47907, term47907.getClass(), "row_2_Align_", term48007);
        setElement(term48040, 0, "  ");
        setElement(term48040, 1, "  ");
        setElement(term48040, 2, "  ");
        setElement(term48040, 3, "  ");
        setElement(term48040, 4, "  ");
        setElement(term48040, 5, "  ");
        setElement(term48040, 6, "  ");
        setElement(term48040, 7, "  ");
        setField(term47907, term47907.getClass(), "row_3_Border", term48040);
        setElement(term48073, 0, "  ");
        setElement(term48073, 1, "  ");
        setElement(term48073, 2, "  ");
        setElement(term48073, 3, "  ");
        setElement(term48073, 4, "  ");
        setElement(term48073, 5, "  ");
        setElement(term48073, 6, "  ");
        setElement(term48073, 7, "  ");
        setField(term47907, term47907.getClass(), "row_3_Align_", term48073);
        setElement(term48106, 0, "  ");
        setElement(term48106, 1, "  ");
        setElement(term48106, 2, "  ");
        setElement(term48106, 3, "  ");
        setElement(term48106, 4, "  ");
        setElement(term48106, 5, "  ");
        setElement(term48106, 6, "  ");
        setElement(term48106, 7, "  ");
        setField(term47907, term47907.getClass(), "label_Border", term48106);
        setElement(term48139, 0, "  ");
        setElement(term48139, 1, "  ");
        setElement(term48139, 2, "  ");
        setElement(term48139, 3, "  ");
        setElement(term48139, 4, "  ");
        setElement(term48139, 5, "  ");
        setElement(term48139, 6, "  ");
        setElement(term48139, 7, "  ");
        setField(term47907, term47907.getClass(), "label_Align_", term48139);
        setElement(term48172, 0, "  ");
        setElement(term48172, 1, "  ");
        setElement(term48172, 2, "  ");
        setElement(term48172, 3, "  ");
        setElement(term48172, 4, "  ");
        setElement(term48172, 5, "  ");
        setElement(term48172, 6, "  ");
        setElement(term48172, 7, "  ");
        setField(term47907, term47907.getClass(), "data__Border", term48172);
        setElement(term48205, 0, "  ");
        setElement(term48205, 1, "  ");
        setElement(term48205, 2, "  ");
        setElement(term48205, 3, "  ");
        setElement(term48205, 4, "  ");
        setElement(term48205, 5, "  ");
        setElement(term48205, 6, "  ");
        setElement(term48205, 7, "  ");
        setField(term47907, term47907.getClass(), "data__Align_", term48205);
        setField(term47907, term47907.getClass(), "sheet_Name", "utCuuVCKqE");
        setIntElement(term48250, 0, -75206835);
        setIntElement(term48250, 1, -1618206977);
        setIntElement(term48250, 2, -1747406163);
        setIntElement(term48250, 3, 388157121);
        setIntElement(term48250, 4, 1684998508);
        setField(term47907, term47907.getClass(), "column_Width", term48250);
        setElement(term48257, 0, "zSfoqzJbPT");
        setElement(term48257, 1, "QUymMnsCIj");
        setElement(term48257, 2, "ikTtOgdVYS");
        setElement(term48256, 0, term48257);
        setElement(term48294, 0, "JptuwlirlS");
        setElement(term48256, 1, term48294);
        setField(term47907, term47907.getClass(), "value_Data", term48256);
        setIntField(term47907, term47907.getClass(), "print_Scale", 100);
        setBooleanField(term47907, term47907.getClass(), "printSetup", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.WorkSheet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue_Data", argTypes, term47907, args);
    }

};


