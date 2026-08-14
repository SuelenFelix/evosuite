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
import java.lang.Long;

public class User_setId_2472744216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1806;
     Object term1884;

    public User_setId_2472744216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1806 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term1856 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term1806, term1806.getClass(), "id", 6855071767938501807L);
        setField(term1806, term1806.getClass(), "email", "HqBOwkVqjD");
        setField(term1806, term1806.getClass(), "firstName", "MAcUBcBckh");
        setField(term1806, term1806.getClass(), "lastName", "oVgzLbrsFr");
        setField(term1806, term1806.getClass(), "password", "vQVyKLdtaz");
        setLongField(term1856, term1856.getClass(), "id", -5892135042702373494L);
        setField(term1856, term1856.getClass(), "place", "OWKQODBLzb");
        setField(term1856, term1856.getClass(), "description", "wGmYcqUkgE");
        setDoubleField(term1856, term1856.getClass(), "longitude", 0.8823181080774973);
        setDoubleField(term1856, term1856.getClass(), "latitude", 0.2192450926212024);
        setField(term1806, term1806.getClass(), "location", term1856);
        term1884 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1884;
        callMethod(klass, "setId", argTypes, term1806, args);
    }

};


