package org.openRealmOfStars.utilities.FileIo;

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
import static org.openRealmOfStars.utilities.FileIo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IOUtilities_writeString_12155758309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;

    public IOUtilities_writeString_12155758309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term619 = (byte[]) newByteArray(7);
        byte[] term627 = (byte[]) newByteArray(1);
        Object term630 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term617, term617.getClass(), "written", -2068769794);
        setByteElement(term619, 0, (byte) 74);
        setByteElement(term619, 1, (byte) -71);
        setByteElement(term619, 2, (byte) 49);
        setByteElement(term619, 3, (byte) -54);
        setByteElement(term619, 4, (byte) 67);
        setByteElement(term619, 5, (byte) 78);
        setByteElement(term619, 6, (byte) 87);
        setField(term617, term617.getClass(), "bytearr", term619);
        setByteElement(term627, 0, (byte) 121);
        setField(term617, term617.getClass(), "writeBuffer", term627);
        setField(term617, term617.getClass(), "out", null);
        setBooleanField(term617, term617.getClass(), "closed", false);
        setField(term617, term617.getClass(), "closeLock", term630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.FileIo.IOUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term617;
        args[1] = "uuaPigETmJ";
        callMethod(klass, "writeString", argTypes, null, args);
    }

};


