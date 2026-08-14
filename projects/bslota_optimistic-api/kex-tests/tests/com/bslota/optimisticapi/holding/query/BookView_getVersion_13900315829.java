package com.bslota.optimisticapi.holding.query;

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
import static com.bslota.optimisticapi.holding.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BookView_getVersion_13900315829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2229;

    public BookView_getVersion_13900315829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2229 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term2229, term2229.getClass(), "id", "LvtrsXUliU");
        setField(term2229, term2229.getClass(), "author", "xLbjWUgOIL");
        setField(term2229, term2229.getClass(), "title", "jDtqGUpnZN");
        setField(term2229, term2229.getClass(), "isbn", "nGKItKLYNC");
        setField(term2229, term2229.getClass(), "patronId", "UiUYnPrcCi");
        setField(term2229, term2229.getClass(), "status", "UoYtihxVaS");
        setLongField(term2229, term2229.getClass(), "version", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term2229, args);
    }

};


