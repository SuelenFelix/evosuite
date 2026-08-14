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

public class BookEntity_getIsbn_21286552186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1876;

    public BookEntity_getIsbn_21286552186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1969 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term1968 = ((Class) term1969).getDeclaredField((String) "PLACED_ON_HOLD");
        ((Field) term1968).setAccessible(true);
        Object enum4 = ((Field) term1968).get((Object) null);
        term1876 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term1877 = newInstance(Class.forName("java.util.UUID"));
        Object term1916 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term1877, term1877.getClass(), "mostSigBits", -316468845751588286L);
        setLongField(term1877, term1877.getClass(), "leastSigBits", 5127676408959197577L);
        setField(term1876, term1876.getClass(), "id", term1877);
        setField(term1876, term1876.getClass(), "title", "MxlszYVzRf");
        setField(term1876, term1876.getClass(), "author", "LQFpaHEwXR");
        setField(term1876, term1876.getClass(), "isbn", "oVcInYnLWB");
        setLongField(term1916, term1916.getClass(), "mostSigBits", -6573104506744284592L);
        setLongField(term1916, term1916.getClass(), "leastSigBits", -4920224193275732920L);
        setField(term1876, term1876.getClass(), "patronId", term1916);
        setField(term1876, term1876.getClass(), "status", enum4);
        setLongField(term1876, term1876.getClass(), "version", 5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsbn", argTypes, term1876, args);
    }

};


