package ru.smartup.timetracker.dto.employee.request;

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
import static ru.smartup.timetracker.dto.employee.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class EmployeeUpdateDto_setEmail_167040908011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7789;

    public EmployeeUpdateDto_setEmail_167040908011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7924 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term7923 = ((Class) term7924).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term7923).setAccessible(true);
        Object enum18 =  ((Field) term7923).get((Object) null);
        Class<? extends Object> term8306 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term8305 = ((Class) term8306).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term8305).setAccessible(true);
        Object enum19 =  ((Field) term8305).get((Object) null);
        ArrayList term7851 = new ArrayList();
        ((ArrayList) term7851).add(enum18);
        ((ArrayList) term7851).add(enum19);
        ((ArrayList) term7851).add(enum18);
        ((ArrayList) term7851).add(enum19);
        ((ArrayList) term7851).add(enum19);
        ((ArrayList) term7851).add(enum19);
        term7789 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto"));
        setField(term7789, term7789.getClass(), "firstName", "JDswTTCZHV");
        setField(term7789, term7789.getClass(), "middleName", "onpbIeEKoi");
        setField(term7789, term7789.getClass(), "lastName", "YRHGsAkhxb");
        setField(term7789, term7789.getClass(), "email", "ffYhPOzlUs");
        setField(term7789, term7789.getClass(), "password", "MLqYREekMl");
        setIntField(term7789, term7789.getClass(), "positionId", 1725571209);
        setField(term7789, term7789.getClass(), "roles", term7851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setEmail", argTypes, term7789, args);
    }

};


