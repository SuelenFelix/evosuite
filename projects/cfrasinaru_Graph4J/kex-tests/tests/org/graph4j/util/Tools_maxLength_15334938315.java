package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Tools_maxLength_15334938315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184843;

    public Tools_maxLength_15334938315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184843 = (Object[]) newArray("[I", 9);
        int[] term184844 = (int[]) newIntArray(4);
        int[] term184849 = (int[]) newIntArray(1);
        int[] term184851 = (int[]) newIntArray(1);
        int[] term184853 = (int[]) newIntArray(5);
        int[] term184859 = (int[]) newIntArray(9);
        int[] term184869 = (int[]) newIntArray(0);
        int[] term184870 = (int[]) newIntArray(5);
        int[] term184876 = (int[]) newIntArray(4);
        int[] term184881 = (int[]) newIntArray(9);
        setIntElement(term184844, 0, 237880729);
        setIntElement(term184844, 1, 595063205);
        setIntElement(term184844, 2, -589482837);
        setIntElement(term184844, 3, -475747013);
        setElement(term184843, 0, term184844);
        setIntElement(term184849, 0, 871704758);
        setElement(term184843, 1, term184849);
        setIntElement(term184851, 0, 799785721);
        setElement(term184843, 2, term184851);
        setIntElement(term184853, 0, 1567302275);
        setIntElement(term184853, 1, -2087366011);
        setIntElement(term184853, 2, -1090911547);
        setIntElement(term184853, 3, -426495161);
        setIntElement(term184853, 4, 208374433);
        setElement(term184843, 3, term184853);
        setIntElement(term184859, 0, -1618753507);
        setIntElement(term184859, 1, -1628459606);
        setIntElement(term184859, 2, -1182484212);
        setIntElement(term184859, 3, 321697855);
        setIntElement(term184859, 4, 245501273);
        setIntElement(term184859, 5, 1850398879);
        setIntElement(term184859, 6, -1693848904);
        setIntElement(term184859, 7, -1177143745);
        setIntElement(term184859, 8, 866628204);
        setElement(term184843, 4, term184859);
        setElement(term184843, 5, term184869);
        setIntElement(term184870, 0, -99630559);
        setIntElement(term184870, 1, 515466129);
        setIntElement(term184870, 2, 1958878266);
        setIntElement(term184870, 3, 1300734439);
        setIntElement(term184870, 4, 804625707);
        setElement(term184843, 6, term184870);
        setIntElement(term184876, 0, 253792982);
        setIntElement(term184876, 1, 1987418328);
        setIntElement(term184876, 2, 1207598723);
        setIntElement(term184876, 3, -1572956762);
        setElement(term184843, 7, term184876);
        setIntElement(term184881, 0, 1471076648);
        setIntElement(term184881, 1, 1860652385);
        setIntElement(term184881, 2, 657103133);
        setIntElement(term184881, 3, 581380127);
        setIntElement(term184881, 4, -145123291);
        setIntElement(term184881, 5, -459845996);
        setIntElement(term184881, 6, 588956417);
        setIntElement(term184881, 7, -1664696134);
        setIntElement(term184881, 8, -343992234);
        setElement(term184843, 8, term184881);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term184843;
        callMethod(klass, "maxLength", argTypes, null, args);
    }

};


