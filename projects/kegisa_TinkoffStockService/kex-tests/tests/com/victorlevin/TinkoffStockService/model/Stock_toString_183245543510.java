package com.victorlevin.TinkoffStockService.model;

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
import static com.victorlevin.TinkoffStockService.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Stock_toString_183245543510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7960;

    public Stock_toString_183245543510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8074 = Class.forName((String) "com.victorlevin.TinkoffStockService.model.Currency");
        Field term8073 = ((Class) term8074).getDeclaredField((String) "TRY");
        ((Field) term8073).setAccessible(true);
        Object enum20 = ((Field) term8073).get((Object) null);
        term7960 = newInstance(Class.forName("com.victorlevin.TinkoffStockService.model.Stock"));
        setField(term7960, term7960.getClass(), "ticker", "hOncybyCAH");
        setField(term7960, term7960.getClass(), "figi", "QduALnDSVo");
        setField(term7960, term7960.getClass(), "name", "izPpKDErnQ");
        setField(term7960, term7960.getClass(), "type", "NnpwZBUTvx");
        setField(term7960, term7960.getClass(), "currency", enum20);
        setField(term7960, term7960.getClass(), "source", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.victorlevin.TinkoffStockService.model.Stock");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7960, args);
    }

};


