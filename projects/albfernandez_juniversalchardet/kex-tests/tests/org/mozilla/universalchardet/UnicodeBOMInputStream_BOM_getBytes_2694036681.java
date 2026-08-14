package org.mozilla.universalchardet;

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
import static org.mozilla.universalchardet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnicodeBOMInputStream_BOM_getBytes_2694036681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406238;

    public UnicodeBOMInputStream_BOM_getBytes_2694036681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406238 = newInstance(Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM"));
        byte[] term406239 = (byte[]) newByteArray(1);
        setByteElement(term406239, 0, (byte) 81);
        setField(term406238, term406238.getClass(), "bytes", term406239);
        setField(term406238, term406238.getClass(), "description", "UoYtihxVaS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.UnicodeBOMInputStream$BOM");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBytes", argTypes, term406238, args);
    }

};


