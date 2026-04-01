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
import java.lang.Integer;
import java.lang.Object;

public class IntHashMap_Entry_init_17632559970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129160;
     Object term129162;
     Object term129164;
     Object term129166;

    public IntHashMap_Entry_init_17632559970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129160 = new Integer(275854548);
        term129162 = new Integer(-1407954490);
        term129164 = new Integer(765186263);
        term129166 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term129170 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term129174 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term129178 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        Object term129182 = newInstance(Class.forName("org.graph4j.util.IntHashMap$Entry"));
        setIntField(term129166, term129166.getClass(), "hash", 2141645226);
        setIntField(term129166, term129166.getClass(), "key", 1391245502);
        setIntField(term129166, term129166.getClass(), "value", -427719081);
        setIntField(term129170, term129170.getClass(), "hash", -124387312);
        setIntField(term129170, term129170.getClass(), "key", 2055675770);
        setIntField(term129170, term129170.getClass(), "value", 1223723655);
        setIntField(term129174, term129174.getClass(), "hash", 831915664);
        setIntField(term129174, term129174.getClass(), "key", 637683364);
        setIntField(term129174, term129174.getClass(), "value", 722470445);
        setIntField(term129178, term129178.getClass(), "hash", -1885225159);
        setIntField(term129178, term129178.getClass(), "key", -1815881485);
        setIntField(term129178, term129178.getClass(), "value", 1382562999);
        setIntField(term129182, term129182.getClass(), "hash", 2123421042);
        setIntField(term129182, term129182.getClass(), "key", 316313675);
        setIntField(term129182, term129182.getClass(), "value", 1809519697);
        setField(term129182, term129182.getClass(), "next", null);
        setField(term129178, term129178.getClass(), "next", term129182);
        setField(term129174, term129174.getClass(), "next", term129178);
        setField(term129170, term129170.getClass(), "next", term129174);
        setField(term129166, term129166.getClass(), "next", term129170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.IntHashMap$Entry");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.graph4j.util.IntHashMap$Entry");
        Object[] args = new Object[4];
        args[0] = term129160;
        args[1] = term129162;
        args[2] = term129164;
        args[3] = term129166;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


