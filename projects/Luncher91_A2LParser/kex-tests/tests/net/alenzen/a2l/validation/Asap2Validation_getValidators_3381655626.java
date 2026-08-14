package net.alenzen.a2l.validation;

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
import static net.alenzen.a2l.validation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Asap2Validation_getValidators_3381655626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27292;

    public Asap2Validation_getValidators_3381655626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27292 = newInstance(Class.forName("net.alenzen.a2l.validation.Asap2Validation"));
        setField(term27292, term27292.getClass(), "file", null);
        setField(term27292, term27292.getClass(), "validators", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.alenzen.a2l.validation.Asap2Validation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValidators", argTypes, term27292, args);
    }

};


