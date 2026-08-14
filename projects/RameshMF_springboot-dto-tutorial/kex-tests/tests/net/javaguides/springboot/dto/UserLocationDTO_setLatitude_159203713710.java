package net.javaguides.springboot.dto;

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
import static net.javaguides.springboot.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class UserLocationDTO_setLatitude_159203713710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;
     Object term509;

    public UserLocationDTO_setLatitude_159203713710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term481, term481.getClass(), "userId", -2813493605142626659L);
        setField(term481, term481.getClass(), "email", "hNxWaHcfhY");
        setField(term481, term481.getClass(), "place", "RkybSrpybU");
        setDoubleField(term481, term481.getClass(), "longitude", 0.7332741045694002);
        setDoubleField(term481, term481.getClass(), "latitude", 0.4569171842750229);
        term509 = new Double(0.8598297828918529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term509;
        callMethod(klass, "setLatitude", argTypes, term481, args);
    }

};


