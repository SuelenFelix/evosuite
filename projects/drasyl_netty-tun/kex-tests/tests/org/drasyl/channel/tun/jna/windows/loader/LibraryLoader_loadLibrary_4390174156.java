package org.drasyl.channel.tun.jna.windows.loader;

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
import static org.drasyl.channel.tun.jna.windows.loader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LibraryLoader_loadLibrary_4390174156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;

    public LibraryLoader_loadLibrary_4390174156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250 = newInstance(Class.forName("org.drasyl.channel.tun.jna.windows.loader.LibraryLoader"));
        setField(term250, term250.getClass(), "clazz", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.drasyl.channel.tun.jna.windows.loader.LibraryLoader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = "MxlszYVzRf";
        callMethod(klass, "loadLibrary", argTypes, term250, args);
    }

};


