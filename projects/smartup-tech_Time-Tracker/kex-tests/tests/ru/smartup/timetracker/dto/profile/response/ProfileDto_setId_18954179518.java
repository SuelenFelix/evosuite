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
import java.lang.Integer;

public class ProfileDto_setId_18954179518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term865;

    public ProfileDto_setId_18954179518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term846 = new HashMap();
        Set<Object> term907 =  ((Map) term846).keySet();
        HashSet term845 = new HashSet((Collection<? extends Object>) term907);
        HashMap term857 = new HashMap();
        Set<Object> term908 =  ((Map) term857).keySet();
        HashSet term856 = new HashSet((Collection<? extends Object>) term908);
        term795 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term795, term795.getClass(), "id", -2038273078);
        setField(term795, term795.getClass(), "firstName", "IoAlmYsBwc");
        setField(term795, term795.getClass(), "middleName", "TEParAifyi");
        setField(term795, term795.getClass(), "lastName", "OWDIEULEFu");
        setField(term795, term795.getClass(), "email", "dWRymuLBtr");
        setField(term795, term795.getClass(), "roles", term845);
        setField(term795, term795.getClass(), "projectRoles", term856);
        term865 = new Integer(1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term865;
        callMethod(klass, "setId", argTypes, term795, args);
    }

};


