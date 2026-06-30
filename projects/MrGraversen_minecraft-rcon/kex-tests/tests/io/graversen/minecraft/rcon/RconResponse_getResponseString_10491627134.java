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

public class RconResponse_getResponseString_10491627134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1570;

    public RconResponse_getResponseString_10491627134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1570 = newInstance(Class.forName("io.graversen.minecraft.rcon.RconResponse"));
        setLongField(term1570, term1570.getClass(), "requestStart", 2535595959091595249L);
        setLongField(term1570, term1570.getClass(), "requestEnd", -5476826692763582090L);
        setLongField(term1570, term1570.getClass(), "requestDuration", -872011222785455006L);
        setIntField(term1570, term1570.getClass(), "requestCounter", 1227103734);
        setIntField(term1570, term1570.getClass(), "responseId", -1339778481);
        setField(term1570, term1570.getClass(), "responseString", "tlQSNgTkQX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.graversen.minecraft.rcon.RconResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseString", argTypes, term1570, args);
    }

};


