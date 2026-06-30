package de.schauderhaft.beyond.bidiinternal;

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
import static de.schauderhaft.beyond.bidiinternal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Toy_sayHello_2306797993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191;

    public Toy_sayHello_2306797993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term191 = newInstance(Class.forName("de.schauderhaft.beyond.bidiinternal.Toy"));
        setField(term191, term191.getClass(), "name", null);
        setField(term191, term191.getClass(), "minion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.schauderhaft.beyond.bidiinternal.Toy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sayHello", argTypes, term191, args);
    }

};


