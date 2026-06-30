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

public class RconResponse_getRequestEnd_18561786922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1514;

    public RconResponse_getRequestEnd_18561786922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1514 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1514, term1514.getClass(), "requestStart", 6811161968424632369L);
        setLongField(term1514, term1514.getClass(), "requestEnd", -7237588299778557629L);
        setLongField(term1514, term1514.getClass(), "requestDuration", 6967924379644551255L);
        setIntField(term1514, term1514.getClass(), "requestCounter", -1922583790);
        setIntField(term1514, term1514.getClass(), "responseId", -616727354);
        setField(term1514, term1514.getClass(), "responseString", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestEnd", argTypes, term1514, args);
    }

};


