package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AsyncEngineEntry_getId_14959521388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;

    public AsyncEngineEntry_getId_14959521388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = newInstance(Class.forName("com.scaleguard.server.db.AsyncEngineEntry"));
        setField(term991, term991.getClass(), "id", "BndsHwAFMv");
        setField(term991, term991.getClass(), "name", "GzFkzHGYFt");
        setField(term991, term991.getClass(), "description", "tShwQLRGNe");
        setField(term991, term991.getClass(), "payload", "LvtrsXUliU");
        setField(term991, term991.getClass(), "type", "xLbjWUgOIL");
        setLongField(term991, term991.getClass(), "mts", -4325723315152823407L);
        setLongField(term991, term991.getClass(), "uts", 2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.AsyncEngineEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term991, args);
    }

};


