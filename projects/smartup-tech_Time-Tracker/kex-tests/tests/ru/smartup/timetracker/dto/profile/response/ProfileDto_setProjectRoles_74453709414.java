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

public class ProfileDto_setProjectRoles_74453709414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;
     Object term1641;

    public ProfileDto_setProjectRoles_74453709414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1620 = new HashMap();
        Set<Object> term1687 =  ((Map) term1620).keySet();
        HashSet term1619 = new HashSet((Collection<? extends Object>) term1687);
        HashMap term1631 = new HashMap();
        Set<Object> term1688 =  ((Map) term1631).keySet();
        HashSet term1630 = new HashSet((Collection<? extends Object>) term1688);
        term1569 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1569, term1569.getClass(), "id", 1585847225);
        setField(term1569, term1569.getClass(), "firstName", "ffYhPOzlUs");
        setField(term1569, term1569.getClass(), "middleName", "MLqYREekMl");
        setField(term1569, term1569.getClass(), "lastName", "ytSBIKXogI");
        setField(term1569, term1569.getClass(), "email", "nHXjMycHlU");
        setField(term1569, term1569.getClass(), "roles", term1619);
        setField(term1569, term1569.getClass(), "projectRoles", term1630);
        HashMap term1642 = new HashMap();
        Set<Object> term1689 =  ((Map) term1642).keySet();
        term1641 = new HashSet((Collection<? extends Object>) term1689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1641;
        callMethod(klass, "setProjectRoles", argTypes, term1569, args);
    }

};


