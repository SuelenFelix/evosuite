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

public class NoticeEmployee_equals_4671273613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12460;
     Object term12508;

    public NoticeEmployee_equals_4671273613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12461 = new Integer(1134449235);
        Class<? extends Object> term12530 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term12529 = ((Class) term12530).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term12529).setAccessible(true);
        Object enum32 =  ((Field) term12529).get((Object) null);
        Class<? extends Object> term12912 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term12911 = ((Class) term12912).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term12911).setAccessible(true);
        Object enum33 =  ((Field) term12911).get((Object) null);
        ArrayList term12487 = new ArrayList();
        ((ArrayList) term12487).add(enum32);
        ((ArrayList) term12487).add(enum33);
        Class<? extends Object> term13294 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term13293 = ((Class) term13294).getDeclaredField((String) "MANAGER");
        ((Field) term13293).setAccessible(true);
        Object enum34 = ((Field) term13293).get((Object) null);
        term12460 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term12460, term12460.getClass(), "id", term12461);
        setField(term12460, term12460.getClass(), "firstName", "kuTXqwMtDB");
        setField(term12460, term12460.getClass(), "lastName", "Ghbwtircqb");
        setField(term12460, term12460.getClass(), "roles", term12487);
        setField(term12460, term12460.getClass(), "projectRole", enum34);
        term12508 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term12508;
        callMethod(klass, "equals", argTypes, term12460, args);
    }

};


