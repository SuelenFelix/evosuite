package io.basquiat.interfacebbuljit.noodle.service;

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
import static io.basquiat.interfacebbuljit.noodle.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoodleService_routeNoodleRecipe_4829285292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1033;

    public NoodleService_routeNoodleRecipe_4829285292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1033 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.service.NoodleService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.code.NoodleType");
        argTypes[1] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "routeNoodleRecipe", argTypes, term1033, args);
    }

};


