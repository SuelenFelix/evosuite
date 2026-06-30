package icu.samnyan.aqua.spring.util;

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
import static icu.samnyan.aqua.spring.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AutoChecker_check_780474813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;

    public AutoChecker_check_780474813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("icu.samnyan.aqua.spring.util.AutoChecker"));
        setField(term220, term220.getClass(), "LINEBREAK", null);
        setField(term220, term220.getClass(), "SERVER_PORT", null);
        setField(term220, term220.getClass(), "ALLNET_HOST_OVERRIDE", null);
        setField(term220, term220.getClass(), "ALLNET_PORT_OVERRIDE", null);
        setField(term220, term220.getClass(), "AIMEDB_BIND", null);
        setIntField(term220, term220.getClass(), "AIMEDB_PORT", 0);
        setBooleanField(term220, term220.getClass(), "AIMEDB_ENABLED", false);
        setBooleanField(term220, term220.getClass(), "BILLING_ENABLED", false);
        setIntField(term220, term220.getClass(), "BILLING_PORT", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.spring.util.AutoChecker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "check", argTypes, term220, args);
    }

};


