package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SquareInfo_writeSquareInfo_2752419931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4203674;
     Object term4203677;

    public SquareInfo_writeSquareInfo_2752419931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4203674 = newInstance(Class.forName("org.openRealmOfStars.starMap.SquareInfo"));
        setByteField(term4203674, term4203674.getClass(), "type", (byte) 51);
        setShortField(term4203674, term4203674.getClass(), "value", (short) 27386);
        term4203677 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term4203679 = (byte[]) newByteArray(8);
        byte[] term4203688 = (byte[]) newByteArray(3);
        Object term4203693 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4203677, term4203677.getClass(), "written", 1789794595);
        setByteElement(term4203679, 0, (byte) -14);
        setByteElement(term4203679, 1, (byte) -21);
        setByteElement(term4203679, 2, (byte) -9);
        setByteElement(term4203679, 3, (byte) -20);
        setByteElement(term4203679, 4, (byte) 115);
        setByteElement(term4203679, 5, (byte) 22);
        setByteElement(term4203679, 6, (byte) 64);
        setByteElement(term4203679, 7, (byte) -87);
        setField(term4203677, term4203677.getClass(), "bytearr", term4203679);
        setByteElement(term4203688, 0, (byte) -37);
        setByteElement(term4203688, 1, (byte) 29);
        setByteElement(term4203688, 2, (byte) 58);
        setField(term4203677, term4203677.getClass(), "writeBuffer", term4203688);
        setField(term4203677, term4203677.getClass(), "out", null);
        setBooleanField(term4203677, term4203677.getClass(), "closed", true);
        setField(term4203677, term4203677.getClass(), "closeLock", term4203693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.SquareInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        Object[] args = new Object[1];
        args[0] = term4203677;
        callMethod(klass, "writeSquareInfo", argTypes, term4203674, args);
    }

};


