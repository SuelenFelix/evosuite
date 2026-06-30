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

public class RconResponse_getResponseId_16963637006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1626;

    public RconResponse_getResponseId_16963637006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1626 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1626, term1626.getClass(), "requestStart", -4920224193275732920L);
        setLongField(term1626, term1626.getClass(), "requestEnd", 8428634514691209827L);
        setLongField(term1626, term1626.getClass(), "requestDuration", -2585684163342970173L);
        setIntField(term1626, term1626.getClass(), "requestCounter", 1134449235);
        setIntField(term1626, term1626.getClass(), "responseId", -883034806);
        setField(term1626, term1626.getClass(), "responseString", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseId", argTypes, term1626, args);
    }

};


