package icu.samnyan.aqua.sega.allnet.model.request;

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
import static icu.samnyan.aqua.sega.allnet.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnRequest_setHops_190759330018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4155;

    public PowerOnRequest_setHops_190759330018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4155 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term4155, term4155.getClass(), "game_id", "kNqaJKIATy");
        setField(term4155, term4155.getClass(), "ver", "vKQukfbJUd");
        setField(term4155, term4155.getClass(), "serial", "lFRJFUMVbx");
        setField(term4155, term4155.getClass(), "ip", "sZdUNdggUW");
        setField(term4155, term4155.getClass(), "firm_ver", "OqbwYQfvAe");
        setField(term4155, term4155.getClass(), "boot_ver", "tRxZafjqIx");
        setField(term4155, term4155.getClass(), "encode", "DhjNLmRMCu");
        setField(term4155, term4155.getClass(), "format_ver", "PgPzMSEjjX");
        setField(term4155, term4155.getClass(), "hops", "wzsPSPcRdj");
        setField(term4155, term4155.getClass(), "token", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XJJNClzHRf";
        callMethod(klass, "setHops", argTypes, term4155, args);
    }

};


