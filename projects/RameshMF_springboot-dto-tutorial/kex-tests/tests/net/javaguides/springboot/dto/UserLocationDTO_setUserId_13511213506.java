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
import java.lang.Long;

public class UserLocationDTO_setUserId_13511213506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term269;

    public UserLocationDTO_setUserId_13511213506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = newInstance(Class.forName("net.javaguides.springboot.dto.UserLocationDTO"));
        setLongField(term241, term241.getClass(), "userId", 7411271909051562686L);
        setField(term241, term241.getClass(), "email", "NRdvgJlhkX");
        setField(term241, term241.getClass(), "place", "uuaPigETmJ");
        setDoubleField(term241, term241.getClass(), "longitude", 0.8474802076607362);
        setDoubleField(term241, term241.getClass(), "latitude", 0.5183269973490326);
        term269 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.dto.UserLocationDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term269;
        callMethod(klass, "setUserId", argTypes, term241, args);
    }

};


