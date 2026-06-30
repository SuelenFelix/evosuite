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

public class RconResponse_getRequestCounter_19382222755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;

    public RconResponse_getRequestCounter_19382222755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1598 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1598, term1598.getClass(), "requestStart", -316468845751588286L);
        setLongField(term1598, term1598.getClass(), "requestEnd", 5127676408959197577L);
        setLongField(term1598, term1598.getClass(), "requestDuration", -6573104506744284592L);
        setIntField(term1598, term1598.getClass(), "requestCounter", 1725571209);
        setIntField(term1598, term1598.getClass(), "responseId", -522618178);
        setField(term1598, term1598.getClass(), "responseString", "PCipZnmBOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestCounter", argTypes, term1598, args);
    }

};


