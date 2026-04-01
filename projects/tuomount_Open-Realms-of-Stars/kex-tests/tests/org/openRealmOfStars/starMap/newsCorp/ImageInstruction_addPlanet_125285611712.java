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

public class ImageInstruction_addPlanet_125285611712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term716181;

    public ImageInstruction_addPlanet_125285611712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term716181 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction"));
        Object term716182 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term716183 = (byte[]) newByteArray(16);
        setField(term716182, term716182.getClass(), "value", term716183);
        setByteField(term716182, term716182.getClass(), "coder", (byte) 0);
        setIntField(term716182, term716182.getClass(), "count", 0);
        setField(term716181, term716181.getClass(), "sb", term716182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.ImageInstruction");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "kVmRLjrhGa";
        args[1] = "PeXHaOKkFm";
        args[2] = "xwqubFWXEn";
        callMethod(klass, "addPlanet", argTypes, term716181, args);
    }

};


