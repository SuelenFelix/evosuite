package ru.smartup.timetracker.dto.employee.response;

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
import static ru.smartup.timetracker.dto.employee.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class EmployeeShortDto_setArchived_36810475213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;
     Object term1260;

    public EmployeeShortDto_setArchived_36810475213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1207 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto"));
        Object term1258 = newInstance(Class.forName("java.util.ImmutableCollections$ListN"));
        Object[] term1259 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term1207, term1207.getClass(), "id", -883034806);
        setField(term1207, term1207.getClass(), "firstName", "UoYtihxVaS");
        setField(term1207, term1207.getClass(), "middleName", "JDswTTCZHV");
        setField(term1207, term1207.getClass(), "lastName", "onpbIeEKoi");
        setField(term1207, term1207.getClass(), "email", "YRHGsAkhxb");
        setBooleanField(term1207, term1207.getClass(), "isArchived", false);
        setField(term1258, term1258.getClass(), "elements", term1259);
        setField(term1207, term1207.getClass(), "roles", term1258);
        term1260 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.response.EmployeeShortDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1260;
        callMethod(klass, "setArchived", argTypes, term1207, args);
    }

};


