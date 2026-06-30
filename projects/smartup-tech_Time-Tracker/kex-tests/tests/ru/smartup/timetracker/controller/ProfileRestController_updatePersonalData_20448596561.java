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

public class ProfileRestController_updatePersonalData_20448596561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;
     Object term527;

    public ProfileRestController_updatePersonalData_20448596561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term510 = new HashMap();
        Set<Object> term574 =  ((Map) term510).keySet();
        HashSet term509 = new HashSet((Collection<? extends Object>) term574);
        HashMap term522 = new HashMap();
        term495 = newInstance(Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal"));
        setIntField(term495, term495.getClass(), "id", 1162663216);
        setField(term495, term495.getClass(), "email", "sjlJAEtRrb");
        setField(term495, term495.getClass(), "employeeRoles", term509);
        setField(term495, term495.getClass(), "projectIdsByProjectRoles", term522);
        term527 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto"));
        setField(term527, term527.getClass(), "firstName", "MuLcgQHgqz");
        setField(term527, term527.getClass(), "middleName", "xxtlPwDYFs");
        setField(term527, term527.getClass(), "lastName", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.ProfileRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.SessionEmployeePrincipal");
        argTypes[1] = Class.forName("ru.smartup.timetracker.dto.profile.request.PersonalDataUpdateDto");
        Object[] args = new Object[2];
        args[0] = term495;
        args[1] = term527;
        callMethod(klass, "updatePersonalData", argTypes, null, args);
    }

};


