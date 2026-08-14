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

public class BookView_getTitle_4532289634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;

    public BookView_getTitle_4532289634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term403 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term403, term403.getClass(), "id", "HyxfbSQYBe");
        setField(term403, term403.getClass(), "author", "pCTimMblYc");
        setField(term403, term403.getClass(), "title", "hNxWaHcfhY");
        setField(term403, term403.getClass(), "isbn", "RkybSrpybU");
        setField(term403, term403.getClass(), "patronId", "xOEqzGAmDU");
        setField(term403, term403.getClass(), "status", "eZFUvlxvGV");
        setLongField(term403, term403.getClass(), "version", -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term403, args);
    }

};


