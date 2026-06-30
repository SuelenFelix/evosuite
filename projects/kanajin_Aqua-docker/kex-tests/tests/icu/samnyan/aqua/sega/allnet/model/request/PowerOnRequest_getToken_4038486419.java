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

public class PowerOnRequest_getToken_4038486419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1990;

    public PowerOnRequest_getToken_4038486419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1990 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest"));
        setField(term1990, term1990.getClass(), "game_id", "swZVeJAxjt");
        setField(term1990, term1990.getClass(), "ver", "xOcJIiQQDu");
        setField(term1990, term1990.getClass(), "serial", "GVizqqzXpy");
        setField(term1990, term1990.getClass(), "ip", "JqXGgAhZPl");
        setField(term1990, term1990.getClass(), "firm_ver", "jiKYgYHqIS");
        setField(term1990, term1990.getClass(), "boot_ver", "DfISiziTgG");
        setField(term1990, term1990.getClass(), "encode", "XqgfKFvPSD");
        setField(term1990, term1990.getClass(), "format_ver", "JiVRgTZvKc");
        setField(term1990, term1990.getClass(), "hops", "XPKmummaqg");
        setField(term1990, term1990.getClass(), "token", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.request.PowerOnRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term1990, args);
    }

};


