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

public class CurrencyReaderConverter_createCurrencyList_4965859352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public CurrencyReaderConverter_createCurrencyList_4965859352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter"));
        setField(term1, term1.getClass(), "currencies", null);
        term2 = (Object[]) newArray("java.lang.String", 5);
        setElement(term2, 0, "PAEBtnZtTD");
        setElement(term2, 1, "sjlJAEtRrb");
        setElement(term2, 2, "MuLcgQHgqz");
        setElement(term2, 3, "xxtlPwDYFs");
        setElement(term2, 4, "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.javamoney.jakarta.validator.CurrencyReaderConverter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "createCurrencyList", argTypes, term1, args);
    }

};


