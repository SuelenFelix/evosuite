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

public class PowerOnRequest_getEncode_8025731126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public PowerOnRequest_getEncode_8025731126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1327, term1327.getClass(), "game_id", "ieCtQFdkii");
        setField(term1327, term1327.getClass(), "ver", "dEnhdmILtU");
        setField(term1327, term1327.getClass(), "serial", "hoicvmsovO");
        setField(term1327, term1327.getClass(), "ip", "eqJfYWRaEL");
        setField(term1327, term1327.getClass(), "firm_ver", "fhkbdRViHi");
        setField(term1327, term1327.getClass(), "boot_ver", "uWHnvSvaPl");
        setField(term1327, term1327.getClass(), "encode", "kBdSllIBVz");
        setField(term1327, term1327.getClass(), "format_ver", "TJmVBGfTML");
        setField(term1327, term1327.getClass(), "hops", "tPlsykYBqO");
        setField(term1327, term1327.getClass(), "token", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncode", argTypes, term1327, args);
    }

};


