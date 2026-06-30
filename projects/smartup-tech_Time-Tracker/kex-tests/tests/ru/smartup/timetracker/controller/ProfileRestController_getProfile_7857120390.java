package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProfileRestController_getProfile_7857120390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term452;

    public ProfileRestController_getProfile_7857120390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term467 = new HashMap();
        Set<Object> term494 =  ((Map) term467).keySet();
        HashSet term466 = new HashSet((Collection<? extends Object>) term494);
        HashMap term479 = new HashMap();
        term452 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term452, term452.getClass(), "id", 568599855);
        setField(term452, term452.getClass(), "email", "PAEBtnZtTD");
        setField(term452, term452.getClass(), "employeeRoles", term466);
        setField(term452, term452.getClass(), "projectIdsByProjectRoles", term479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ProfileRestController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        Object[] args = new Object[1];
        args[0] = term452;
        callMethod(klass, "getProfile", argTypes, null, args);
    }

};


