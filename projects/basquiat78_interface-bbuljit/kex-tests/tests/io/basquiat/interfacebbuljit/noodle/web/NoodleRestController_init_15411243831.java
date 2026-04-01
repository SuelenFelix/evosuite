package io.basquiat.interfacebbuljit.noodle.web;

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
import static io.basquiat.interfacebbuljit.noodle.web.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoodleRestController_init_15411243831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;

    public NoodleRestController_init_15411243831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.web.NoodleRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService");
        Object[] args = new Object[1];
        args[0] = term576;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


