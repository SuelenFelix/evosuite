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
import java.lang.Object;

public class User_getEmail_1303172351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public User_getEmail_1303172351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term189 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term139, term139.getClass(), "id", -8257434502486459194L);
        setField(term139, term139.getClass(), "email", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "firstName", "MjGYSRKTNF");
        setField(term139, term139.getClass(), "lastName", "hRNSzYYIrc");
        setField(term139, term139.getClass(), "password", "RMFIsYGgne");
        setLongField(term189, term189.getClass(), "id", -8400487765614892086L);
        setField(term189, term189.getClass(), "place", "NRdvgJlhkX");
        setField(term189, term189.getClass(), "description", "uuaPigETmJ");
        setDoubleField(term189, term189.getClass(), "longitude", 0.5523635872663106);
        setDoubleField(term189, term189.getClass(), "latitude", 0.544608645520025);
        setField(term139, term139.getClass(), "location", term189);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term139, args);
    }

};


