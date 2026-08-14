package org.graph4j.converters;

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
import static org.graph4j.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PruferTreeDecoder_createTree_4217845591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;

    public PruferTreeDecoder_createTree_4217845591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.graph4j.converters.PruferTreeDecoder"));
        int[] term13 = (int[]) newIntArray(4);
        int[] term18 = (int[]) newIntArray(3);
        setIntElement(term13, 0, -616727354);
        setIntElement(term13, 1, -1955890973);
        setIntElement(term13, 2, -2038273078);
        setIntElement(term13, 3, 1227103734);
        setField(term12, term12.getClass(), "pruferCode", term13);
        setIntElement(term18, 0, -1339778481);
        setIntElement(term18, 1, 1725571209);
        setIntElement(term18, 2, -522618178);
        setField(term12, term12.getClass(), "degrees", term18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeDecoder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTree", argTypes, term12, args);
    }

};


