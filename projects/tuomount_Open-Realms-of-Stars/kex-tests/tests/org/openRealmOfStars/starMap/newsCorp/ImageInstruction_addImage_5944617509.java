package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ImageInstruction_addImage_5944617509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715982;

    public ImageInstruction_addImage_5944617509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715982 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction"));
        Object term715983 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term715984 = (byte[]) newByteArray(16);
        setField(term715983, term715983.getClass(), "value", term715984);
        setByteField(term715983, term715983.getClass(), "coder", (byte) 0);
        setIntField(term715983, term715983.getClass(), "count", 0);
        setField(term715982, term715982.getClass(), "sb", term715983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qeLSUDOUMx";
        callMethod(klass, "addImage", argTypes, term715982, args);
    }

};


