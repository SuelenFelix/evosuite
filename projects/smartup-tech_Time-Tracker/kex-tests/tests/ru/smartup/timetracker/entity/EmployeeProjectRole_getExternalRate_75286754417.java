package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmployeeProjectRole_getExternalRate_75286754417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20293;

    public EmployeeProjectRole_getExternalRate_75286754417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20293 = newInstance(Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole"));
        setIntField(term20293, term20293.getClass(), "employeeId", 0);
        setIntField(term20293, term20293.getClass(), "projectId", 0);
        setField(term20293, term20293.getClass(), "projectRoleId", null);
        setField(term20293, term20293.getClass(), "externalRate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.EmployeeProjectRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term20293, args);
    }

};


