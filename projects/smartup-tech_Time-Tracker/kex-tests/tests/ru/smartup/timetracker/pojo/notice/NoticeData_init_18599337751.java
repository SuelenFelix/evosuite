package ru.smartup.timetracker.pojo.notice;

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
import static ru.smartup.timetracker.pojo.notice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class NoticeData_init_18599337751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18338;

    public NoticeData_init_18599337751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term18339 = new Integer(865208305);
        Class<? extends Object> term18411 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term18410 = ((Class) term18411).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term18410).setAccessible(true);
        Object enum44 =  ((Field) term18410).get((Object) null);
        Class<? extends Object> term18793 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term18792 = ((Class) term18793).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term18792).setAccessible(true);
        Object enum45 =  ((Field) term18792).get((Object) null);
        Class<? extends Object> term19175 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term19174 = ((Class) term19175).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term19174).setAccessible(true);
        Object enum46 =  ((Field) term19174).get((Object) null);
        ArrayList term18365 = new ArrayList();
        ((ArrayList) term18365).add(enum44);
        ((ArrayList) term18365).add(enum45);
        ((ArrayList) term18365).add(enum46);
        ((ArrayList) term18365).add(enum45);
        ((ArrayList) term18365).add(enum46);
        ((ArrayList) term18365).add(enum46);
        ((ArrayList) term18365).add(enum46);
        Class<? extends Object> term19557 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term19556 = ((Class) term19557).getDeclaredField((String) "EMPLOYEE");
        ((Field) term19556).setAccessible(true);
        Object enum47 = ((Field) term19556).get((Object) null);
        term18338 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term18338, term18338.getClass(), "id", term18339);
        setField(term18338, term18338.getClass(), "firstName", "eqJfYWRaEL");
        setField(term18338, term18338.getClass(), "lastName", "fhkbdRViHi");
        setField(term18338, term18338.getClass(), "roles", term18365);
        setField(term18338, term18338.getClass(), "projectRole", enum47);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Object[] args = new Object[1];
        args[0] = term18338;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


