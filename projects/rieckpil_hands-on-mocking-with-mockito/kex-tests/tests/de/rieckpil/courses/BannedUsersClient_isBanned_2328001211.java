package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BannedUsersClient_isBanned_2328001211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1706;
     Object term1719;

    public BannedUsersClient_isBanned_2328001211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1706 = newInstance(Class.forName("de.rieckpil.courses.BannedUsersClient"));
        Integer term1744 = new Integer(-1456670397);
        term1719 = newInstance(Class.forName("de.rieckpil.courses.Address"));
        setField(term1719, term1719.getClass(), "country", "tPlsykYBqO");
        setField(term1719, term1719.getClass(), "city", "bLPjGVBhlX");
        setField(term1719, term1719.getClass(), "postalCode", term1744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.BannedUsersClient");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("de.rieckpil.courses.Address");
        Object[] args = new Object[2];
        args[0] = "TJmVBGfTML";
        args[1] = term1719;
        callMethod(klass, "isBanned", argTypes, term1706, args);
    }

};


