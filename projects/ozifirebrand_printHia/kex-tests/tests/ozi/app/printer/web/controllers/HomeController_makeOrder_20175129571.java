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

public class HomeController_makeOrder_20175129571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public HomeController_makeOrder_20175129571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ozi.app.printer.web.controllers.HomeController"));
        setField(term1, term1.getClass(), "orderServices", null);
        term2 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest"));
        setField(term2, term2.getClass(), "imageUrl", "PAEBtnZtTD");
        setDoubleField(term2, term2.getClass(), "size", 0.13238746331190498);
        setIntField(term2, term2.getClass(), "quantity", 568599855);
        setField(term2, term2.getClass(), "userId", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.web.controllers.HomeController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "makeOrder", argTypes, term1, args);
    }

};


