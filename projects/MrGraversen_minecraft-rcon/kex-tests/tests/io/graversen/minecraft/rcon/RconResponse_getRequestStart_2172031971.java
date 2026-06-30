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

public class RconResponse_getRequestStart_2172031971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1486;

    public RconResponse_getRequestStart_2172031971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1486 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1486, term1486.getClass(), "requestStart", 5270370404989704783L);
        setLongField(term1486, term1486.getClass(), "requestEnd", 7411271909051562686L);
        setLongField(term1486, term1486.getClass(), "requestDuration", 4872422362414183754L);
        setIntField(term1486, term1486.getClass(), "requestCounter", 1484323161);
        setIntField(term1486, term1486.getClass(), "responseId", 391863371);
        setField(term1486, term1486.getClass(), "responseString", "QduALnDSVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestStart", argTypes, term1486, args);
    }

};


