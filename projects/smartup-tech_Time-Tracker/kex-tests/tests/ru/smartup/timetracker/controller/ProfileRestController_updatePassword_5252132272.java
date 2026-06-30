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

public class ProfileRestController_updatePassword_5252132272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;
     Object term635;

    public ProfileRestController_updatePassword_5252132272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term620 = new HashMap();
        Set<Object> term670 =  ((Map) term620).keySet();
        HashSet term619 = new HashSet((Collection<? extends Object>) term670);
        HashMap term630 = new HashMap();
        term605 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term605, term605.getClass(), "id", 1484323161);
        setField(term605, term605.getClass(), "email", "EGtDIRbSSb");
        setField(term605, term605.getClass(), "employeeRoles", term619);
        setField(term605, term605.getClass(), "projectIdsByProjectRoles", term630);
        term635 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto"));
        setField(term635, term635.getClass(), "oldPassword", "SzjVpOQTyS");
        setField(term635, term635.getClass(), "newPassword", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ProfileRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto");
        Object[] args = new Object[2];
        args[0] = term605;
        args[1] = term635;
        callMethod(klass, "updatePassword", argTypes, null, args);
    }

};


