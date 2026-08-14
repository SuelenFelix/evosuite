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
import java.lang.Object;

public class CurrencyReaderConverter_createCurrencyListFromLocale_19821426754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;
     Object term204;

    public CurrencyReaderConverter_createCurrencyListFromLocale_19821426754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter"));
        setField(term203, term203.getClass(), "currencies", null);
        term204 = (Object[]) newArray("java.lang.String", 3);
        setElement(term204, 0, "RMFIsYGgne");
        setElement(term204, 1, "NRdvgJlhkX");
        setElement(term204, 2, "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term204;
        callMethod(klass, "createCurrencyListFromLocale", argTypes, term203, args);
    }

};


