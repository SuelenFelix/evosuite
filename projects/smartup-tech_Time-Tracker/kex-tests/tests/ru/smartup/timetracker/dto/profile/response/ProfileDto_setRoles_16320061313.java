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

public class ProfileDto_setRoles_16320061313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1446;
     Object term1520;

    public ProfileDto_setRoles_16320061313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1497 = new HashMap();
        Set<Object> term1566 =  ((Map) term1497).keySet();
        HashSet term1496 = new HashSet((Collection<? extends Object>) term1566);
        HashMap term1510 = new HashMap();
        Set<Object> term1567 =  ((Map) term1510).keySet();
        HashSet term1509 = new HashSet((Collection<? extends Object>) term1567);
        term1446 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term1446, term1446.getClass(), "id", -883034806);
        setField(term1446, term1446.getClass(), "firstName", "UoYtihxVaS");
        setField(term1446, term1446.getClass(), "middleName", "JDswTTCZHV");
        setField(term1446, term1446.getClass(), "lastName", "onpbIeEKoi");
        setField(term1446, term1446.getClass(), "email", "YRHGsAkhxb");
        setField(term1446, term1446.getClass(), "roles", term1496);
        setField(term1446, term1446.getClass(), "projectRoles", term1509);
        HashMap term1521 = new HashMap();
        Set<Object> term1568 =  ((Map) term1521).keySet();
        term1520 = new HashSet((Collection<? extends Object>) term1568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1520;
        callMethod(klass, "setRoles", argTypes, term1446, args);
    }

};


