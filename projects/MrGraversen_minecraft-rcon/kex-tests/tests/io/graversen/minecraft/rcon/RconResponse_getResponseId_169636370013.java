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

public class RconResponse_getResponseId_169636370013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1692;

    public RconResponse_getResponseId_169636370013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1692 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1692, term1692.getClass(), "requestStart", 0L);
        setLongField(term1692, term1692.getClass(), "requestEnd", 0L);
        setLongField(term1692, term1692.getClass(), "requestDuration", 0L);
        setIntField(term1692, term1692.getClass(), "requestCounter", 0);
        setIntField(term1692, term1692.getClass(), "responseId", 0);
        setField(term1692, term1692.getClass(), "responseString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseId", argTypes, term1692, args);
    }

};


