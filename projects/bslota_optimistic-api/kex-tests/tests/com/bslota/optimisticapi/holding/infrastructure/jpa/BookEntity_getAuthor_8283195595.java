package com.bslota.optimisticapi.holding.infrastructure.jpa;

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
import static com.bslota.optimisticapi.holding.infrastructure.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BookEntity_getAuthor_8283195595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1415;

    public BookEntity_getAuthor_8283195595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1503 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term1502 = ((Class) term1503).getDeclaredField((String) "AVAILABLE");
        ((Field) term1502).setAccessible(true);
        Object enum3 = ((Field) term1502).get((Object) null);
        term1415 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term1416 = newInstance(Class.forName("java.util.UUID"));
        Object term1455 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1416, term1416.getClass(), "mostSigBits", -4325723315152823407L);
        setLongField(term1416, term1416.getClass(), "leastSigBits", 2535595959091595249L);
        setField(term1415, term1415.getClass(), "id", term1416);
        setField(term1415, term1415.getClass(), "title", "RMFIsYGgne");
        setField(term1415, term1415.getClass(), "author", "NRdvgJlhkX");
        setField(term1415, term1415.getClass(), "isbn", "uuaPigETmJ");
        setLongField(term1455, term1455.getClass(), "mostSigBits", -5476826692763582090L);
        setLongField(term1455, term1455.getClass(), "leastSigBits", -872011222785455006L);
        setField(term1415, term1415.getClass(), "patronId", term1455);
        setField(term1415, term1415.getClass(), "status", enum3);
        setLongField(term1415, term1415.getClass(), "version", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthor", argTypes, term1415, args);
    }

};


