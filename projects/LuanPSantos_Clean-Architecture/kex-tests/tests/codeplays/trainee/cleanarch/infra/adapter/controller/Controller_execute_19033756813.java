package codeplays.trainee.cleanarch.infra.adapter.controller;

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
import static codeplays.trainee.cleanarch.infra.adapter.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Controller_execute_19033756813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public Controller_execute_19033756813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("codeplays.trainee.cleanarch.infra.adapter.controller.Controller"));
        setField(term71, term71.getClass(), "useCase", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeplays.trainee.cleanarch.infra.adapter.controller.Controller");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeplays.trainee.cleanarch.infra.adapter.controller.Request");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "execute", argTypes, term71, args);
    }

};


