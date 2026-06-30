package de.wyraz.sml;

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
import static de.wyraz.sml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SMLPublicOpenResponse_setClientId_195274041617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;

    public SMLPublicOpenResponse_setClientId_195274041617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term699 = newInstance(Class.forName("de.wyraz.sml.SMLPublicOpenResponse"));
        setField(term699, term699.getClass(), "codepage", null);
        setField(term699, term699.getClass(), "clientId", null);
        setField(term699, term699.getClass(), "reqFileId", null);
        setField(term699, term699.getClass(), "serverId", null);
        setField(term699, term699.getClass(), "refTime", null);
        setField(term699, term699.getClass(), "smlVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.wyraz.sml.SMLPublicOpenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClientId", argTypes, term699, args);
    }

};


