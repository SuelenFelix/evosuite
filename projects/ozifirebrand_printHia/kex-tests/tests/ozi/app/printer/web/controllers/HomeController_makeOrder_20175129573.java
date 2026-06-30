package ozi.app.printer.web.controllers;

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
import static ozi.app.printer.web.controllers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HomeController_makeOrder_20175129573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public HomeController_makeOrder_20175129573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("ozi.app.printer.web.controllers.HomeController"));
        setField(term49, term49.getClass(), "orderServices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.web.controllers.HomeController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "makeOrder", argTypes, term49, args);
    }

};


