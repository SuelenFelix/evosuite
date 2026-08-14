package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_toString_164610927113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4176;

    public Location_toString_164610927113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4176 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4176, term4176.getClass(), "id", 305759998609888272L);
        setField(term4176, term4176.getClass(), "place", "xtftXXMbem");
        setField(term4176, term4176.getClass(), "description", "cudZvLMQon");
        setDoubleField(term4176, term4176.getClass(), "longitude", 0.09067063848644474);
        setDoubleField(term4176, term4176.getClass(), "latitude", 0.268304014379393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4176, args);
    }

};


