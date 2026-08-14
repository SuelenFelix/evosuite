package dev.zevolution.netflixhexaarch;

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
import static dev.zevolution.netflixhexaarch.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Application_main_6531643341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35635;

    public Application_main_6531643341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35635 = (Object[]) newArray("java.lang.String", 5);
        setElement(term35635, 0, "mOulGkUjOk");
        setElement(term35635, 1, "hNWRuNEgOf");
        setElement(term35635, 2, "CEtjGBplmv");
        setElement(term35635, 3, "XosDTAzIAT");
        setElement(term35635, 4, "lcCEhCpiZM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.Application");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term35635;
        callMethod(klass, "main", argTypes, null, args);
    }

};


