package org.javamoney.jakarta.validator;

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
import static org.javamoney.jakarta.validator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CurrencyReaderConverter_createCurrencyListFromLocale_198214267510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public CurrencyReaderConverter_createCurrencyListFromLocale_198214267510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter"));
        setField(term274, term274.getClass(), "currencies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createCurrencyListFromLocale", argTypes, term274, args);
    }

};


