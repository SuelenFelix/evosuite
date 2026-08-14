package com.bslota.optimisticapi.holding.domain;

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
import static com.bslota.optimisticapi.holding.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AvailableBook_id_10289239622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158;

    public AvailableBook_id_10289239622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1158 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook"));
        Object term1159 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.BookId"));
        Object term1160 = newInstance(Class.forName("java.util.UUID"));
        Object term1163 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Author"));
        Object term1176 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.Title"));
        Object term1189 = newInstance(Class.forName("com.bslota.optimisticapi.holding.domain.ISBN"));
        Object term1202 = newInstance(Class.forName("com.bslota.optimisticapi.holding.aggregate.Version"));
        setLongField(term1160, term1160.getClass(), "mostSigBits", -8708192233349544946L);
        setLongField(term1160, term1160.getClass(), "leastSigBits", 5907001541142728739L);
        setField(term1159, term1159.getClass(), "value", term1160);
        setField(term1158, term1158.getClass(), "id", term1159);
        setField(term1163, term1163.getClass(), "name", "GzFkzHGYFt");
        setField(term1158, term1158.getClass(), "author", term1163);
        setField(term1176, term1176.getClass(), "title", "tShwQLRGNe");
        setField(term1158, term1158.getClass(), "title", term1176);
        setField(term1189, term1189.getClass(), "value", "LvtrsXUliU");
        setField(term1158, term1158.getClass(), "isbn", term1189);
        setLongField(term1202, term1202.getClass(), "value", -8885298608300233488L);
        setField(term1158, term1158.getClass(), "version", term1202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.bslota.optimisticapi.holding.domain.AvailableBook");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "id", argTypes, term1158, args);
    }

};


