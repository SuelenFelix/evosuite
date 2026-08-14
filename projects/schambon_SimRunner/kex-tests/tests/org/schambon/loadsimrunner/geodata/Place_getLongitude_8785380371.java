package org.schambon.loadsimrunner.geodata;

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
import static org.schambon.loadsimrunner.geodata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Place_getLongitude_8785380371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;

    public Place_getLongitude_8785380371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = newInstance(Class.forName("org.schambon.loadsimrunner.geodata.Place"));
        setDoubleField(term49, term49.getClass(), "longitude", 0.5523635872663106);
        setDoubleField(term49, term49.getClass(), "latitude", 0.544608645520025);
        setField(term49, term49.getClass(), "name", "MuLcgQHgqz");
        setField(term49, term49.getClass(), "country", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.geodata.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongitude", argTypes, term49, args);
    }

};


