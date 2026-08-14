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

public class BookView_getStatus_1747572717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;

    public BookView_getStatus_1747572717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805 = newInstance(Class.forName("com.bslota.optimisticapi.holding.query.BookView"));
        setField(term805, term805.getClass(), "id", "xrwlQZdwCp");
        setField(term805, term805.getClass(), "author", "IDCWpPLRkE");
        setField(term805, term805.getClass(), "title", "nyiiPDVjAc");
        setField(term805, term805.getClass(), "isbn", "aKnKipADSo");
        setField(term805, term805.getClass(), "patronId", "wSQxaModmm");
        setField(term805, term805.getClass(), "status", "UlajhuVLaP");
        setLongField(term805, term805.getClass(), "version", 4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.query.BookView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term805, args);
    }

};


