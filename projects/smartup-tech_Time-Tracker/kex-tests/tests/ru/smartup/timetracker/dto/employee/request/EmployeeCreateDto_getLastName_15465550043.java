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

public class EmployeeCreateDto_getLastName_15465550043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15695;

    public EmployeeCreateDto_getLastName_15465550043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15818 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term15817 = ((Class) term15818).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term15817).setAccessible(true);
        Object enum36 =  ((Field) term15817).get((Object) null);
        Class<? extends Object> term16170 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term16169 = ((Class) term16170).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term16169).setAccessible(true);
        Object enum37 =  ((Field) term16169).get((Object) null);
        ArrayList term15757 = new ArrayList();
        ((ArrayList) term15757).add(enum36);
        ((ArrayList) term15757).add(enum37);
        ((ArrayList) term15757).add(enum36);
        ((ArrayList) term15757).add(enum36);
        ((ArrayList) term15757).add(enum36);
        ((ArrayList) term15757).add(enum37);
        ((ArrayList) term15757).add(enum37);
        ((ArrayList) term15757).add(enum37);
        term15695 = newInstance(Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto"));
        setField(term15695, term15695.getClass(), "firstName", "qxSDVejjiY");
        setField(term15695, term15695.getClass(), "middleName", "xBsXSDjXYK");
        setField(term15695, term15695.getClass(), "lastName", "sEnIVFtZuQ");
        setField(term15695, term15695.getClass(), "email", "ZVecLZMLHF");
        setField(term15695, term15695.getClass(), "password", "fztQhjqwdP");
        setIntField(term15695, term15695.getClass(), "positionId", -6029667);
        setField(term15695, term15695.getClass(), "roles", term15757);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.employee.request.EmployeeCreateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term15695, args);
    }

};


