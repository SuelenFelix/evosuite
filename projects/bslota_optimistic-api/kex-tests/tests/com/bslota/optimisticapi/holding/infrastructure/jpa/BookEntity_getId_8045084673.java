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

public class BookEntity_getId_8045084673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;

    public BookEntity_getId_8045084673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term581 = Class.forName((String) "com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntityStatus");
        Field term580 = ((Class) term581).getDeclaredField((String) "AVAILABLE");
        ((Field) term580).setAccessible(true);
        Object enum1 = ((Field) term580).get((Object) null);
        term493 = newInstance(Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity"));
        Object term494 = newInstance(Class.forName("java.util.UUID"));
        Object term533 = newInstance(Class.forName("java.util.UUID"));
        setLongField(term494, term494.getClass(), "mostSigBits", 5270370404989704783L);
        setLongField(term494, term494.getClass(), "leastSigBits", 7411271909051562686L);
        setField(term493, term493.getClass(), "id", term494);
        setField(term493, term493.getClass(), "title", "xxtlPwDYFs");
        setField(term493, term493.getClass(), "author", "jJCZpVmanW");
        setField(term493, term493.getClass(), "isbn", "EGtDIRbSSb");
        setLongField(term533, term533.getClass(), "mostSigBits", 4872422362414183754L);
        setLongField(term533, term533.getClass(), "leastSigBits", 6811161968424632369L);
        setField(term493, term493.getClass(), "patronId", term533);
        setField(term493, term493.getClass(), "status", enum1);
        setLongField(term493, term493.getClass(), "version", 6375119433582206027L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.infrastructure.jpa.BookEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term493, args);
    }

};


