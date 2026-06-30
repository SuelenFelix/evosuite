package ru.smartup.timetracker.dto.profile.response;

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
import static ru.smartup.timetracker.dto.profile.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProfileDto_equals_55840185015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1690;
     Object term1760;

    public ProfileDto_equals_55840185015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1741 = new HashMap();
        Set<Object> term1801 =  ((Map) term1741).keySet();
        HashSet term1740 = new HashSet((Collection<? extends Object>) term1801);
        HashMap term1750 = new HashMap();
        Set<Object> term1802 =  ((Map) term1750).keySet();
        HashSet term1749 = new HashSet((Collection<? extends Object>) term1802);
        term1690 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1690, term1690.getClass(), "id", 597278769);
        setField(term1690, term1690.getClass(), "firstName", "ieCtQFdkii");
        setField(term1690, term1690.getClass(), "middleName", "dEnhdmILtU");
        setField(term1690, term1690.getClass(), "lastName", "hoicvmsovO");
        setField(term1690, term1690.getClass(), "email", "eqJfYWRaEL");
        setField(term1690, term1690.getClass(), "roles", term1740);
        setField(term1690, term1690.getClass(), "projectRoles", term1749);
        term1760 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1760;
        callMethod(klass, "equals", argTypes, term1690, args);
    }

};


