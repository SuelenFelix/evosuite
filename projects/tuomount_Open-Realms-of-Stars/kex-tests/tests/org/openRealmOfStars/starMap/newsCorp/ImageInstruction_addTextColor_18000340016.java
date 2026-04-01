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

public class ImageInstruction_addTextColor_18000340016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715803;

    public ImageInstruction_addTextColor_18000340016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715803 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction"));
        Object term715804 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term715805 = (byte[]) newByteArray(16);
        setField(term715804, term715804.getClass(), "value", term715805);
        setByteField(term715804, term715804.getClass(), "coder", (byte) 0);
        setIntField(term715804, term715804.getClass(), "count", 0);
        setField(term715803, term715803.getClass(), "sb", term715804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lKhrBzPxHY";
        callMethod(klass, "addTextColor", argTypes, term715803, args);
    }

};


