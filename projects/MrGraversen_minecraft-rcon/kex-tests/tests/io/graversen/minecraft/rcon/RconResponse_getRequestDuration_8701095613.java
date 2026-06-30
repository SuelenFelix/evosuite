package io.graversen.minecraft.rcon;

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
import static io.graversen.minecraft.rcon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RconResponse_getRequestDuration_8701095613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;

    public RconResponse_getRequestDuration_8701095613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1542 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1542, term1542.getClass(), "requestStart", -2813493605142626659L);
        setLongField(term1542, term1542.getClass(), "requestEnd", -8885298608300233488L);
        setLongField(term1542, term1542.getClass(), "requestDuration", -4325723315152823407L);
        setIntField(term1542, term1542.getClass(), "requestCounter", -1955890973);
        setIntField(term1542, term1542.getClass(), "responseId", -2038273078);
        setField(term1542, term1542.getClass(), "responseString", "NnpwZBUTvx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestDuration", argTypes, term1542, args);
    }

};


