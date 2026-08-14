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

public class UserListWorkSheet_init_4765610221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18902;
     Object term18910;

    public UserListWorkSheet_init_4765610221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18902 = (int[]) newIntArray(7);
        setIntElement(term18902, 0, 2055867847);
        setIntElement(term18902, 1, -1048298087);
        setIntElement(term18902, 2, 292681826);
        setIntElement(term18902, 3, 458147407);
        setIntElement(term18902, 4, -184153539);
        setIntElement(term18902, 5, 493620644);
        setIntElement(term18902, 6, 1328271830);
        term18910 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 9);
        Object[] term18911 = (Object[]) newArray("java.lang.String", 7);
        Object[] term18996 = (Object[]) newArray("java.lang.String", 1);
        Object[] term19009 = (Object[]) newArray("java.lang.String", 5);
        Object[] term19070 = (Object[]) newArray("java.lang.String", 2);
        Object[] term19095 = (Object[]) newArray("java.lang.String", 3);
        Object[] term19132 = (Object[]) newArray("java.lang.String", 1);
        Object[] term19145 = (Object[]) newArray("java.lang.String", 0);
        Object[] term19146 = (Object[]) newArray("java.lang.String", 0);
        Object[] term19147 = (Object[]) newArray("java.lang.String", 9);
        setElement(term18911, 0, "urlyLwPBVn");
        setElement(term18911, 1, "SPQVzOlOzZ");
        setElement(term18911, 2, "bOUAgAptAI");
        setElement(term18911, 3, "KSZfGbvzPE");
        setElement(term18911, 4, "YfgYGgzYER");
        setElement(term18911, 5, "IDClvDZuqE");
        setElement(term18911, 6, "cMvKxpZOvg");
        setElement(term18910, 0, term18911);
        setElement(term18996, 0, "WWBYemIuiK");
        setElement(term18910, 1, term18996);
        setElement(term19009, 0, "nHYQYkycCR");
        setElement(term19009, 1, "yBiVacDcZX");
        setElement(term19009, 2, "QrKfEgQeoy");
        setElement(term19009, 3, "oApgdbwnti");
        setElement(term19009, 4, "YcgHACNgyo");
        setElement(term18910, 2, term19009);
        setElement(term19070, 0, "MrUPJzBTEn");
        setElement(term19070, 1, "IaSymdfFGa");
        setElement(term18910, 3, term19070);
        setElement(term19095, 0, "FxSvJCIpul");
        setElement(term19095, 1, "HCjKwpexJj");
        setElement(term19095, 2, "sCpIHVPdfl");
        setElement(term18910, 4, term19095);
        setElement(term19132, 0, "lMUBBGRjfY");
        setElement(term18910, 5, term19132);
        setElement(term18910, 6, term19145);
        setElement(term18910, 7, term19146);
        setElement(term19147, 0, "olYpqbolWL");
        setElement(term19147, 1, "MCMCjxXzjw");
        setElement(term19147, 2, "pZbbwCURge");
        setElement(term19147, 3, "RsOfgdMCMv");
        setElement(term19147, 4, "nsofCJqJOR");
        setElement(term19147, 5, "CitJiZwsjF");
        setElement(term19147, 6, "ZiyMvLArWJ");
        setElement(term19147, 7, "MaeokjEfWD");
        setElement(term19147, 8, "ocZcumnXEz");
        setElement(term18910, 8, term19147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.UserListWorkSheet");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Array.newInstance(Class.forName("java.lang.String"), 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "xpbLKEsput";
        args[1] = term18902;
        args[2] = term18910;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


