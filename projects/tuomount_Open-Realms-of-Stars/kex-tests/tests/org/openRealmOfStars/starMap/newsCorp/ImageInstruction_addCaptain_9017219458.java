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
import java.lang.Integer;

public class ImageInstruction_addCaptain_9017219458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715921;
     Object term715954;

    public ImageInstruction_addCaptain_9017219458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715921 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction"));
        Object term715922 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term715923 = (byte[]) newByteArray(16);
        setField(term715922, term715922.getClass(), "value", term715923);
        setByteField(term715922, term715922.getClass(), "coder", (byte) 0);
        setIntField(term715922, term715922.getClass(), "count", 0);
        setField(term715921, term715921.getClass(), "sb", term715922);
        term715954 = new Integer(-1849199934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "dISObAbSPf";
        args[1] = term715954;
        callMethod(klass, "addCaptain", argTypes, term715921, args);
    }

};


