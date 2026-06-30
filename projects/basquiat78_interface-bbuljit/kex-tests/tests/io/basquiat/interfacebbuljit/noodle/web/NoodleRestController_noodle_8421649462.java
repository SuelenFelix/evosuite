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

public class NoodleRestController_noodle_8421649462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;

    public NoodleRestController_noodle_8421649462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.web.NoodleRestController"));
        setField(term577, term577.getClass(), "noodleService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.web.NoodleRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "noodle", argTypes, term577, args);
    }

};


