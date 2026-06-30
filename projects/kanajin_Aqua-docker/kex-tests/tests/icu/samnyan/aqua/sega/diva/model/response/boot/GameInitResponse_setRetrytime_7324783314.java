package icu.samnyan.aqua.sega.diva.model.response.boot;

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
import static icu.samnyan.aqua.sega.diva.model.response.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameInitResponse_setRetrytime_7324783314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1836;

    public GameInitResponse_setRetrytime_7324783314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1836 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse"));
        setField(term1836, term1836.getClass(), "db_close", "OWKQODBLzb");
        setField(term1836, term1836.getClass(), "retry_time", "wGmYcqUkgE");
        setField(term1836, term1836.getClass(), "cmd", "idgaQsnJpQ");
        setField(term1836, term1836.getClass(), "req_id", "VgZnGoIFwQ");
        setField(term1836, term1836.getClass(), "stat", "jUbSRrkrYZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.boot.GameInitResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bWWfajKbEX";
        callMethod(klass, "setRetry_time", argTypes, term1836, args);
    }

};


