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

public class NoticeEmployee_setProjectRole_22962929812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10997;
     Object enum31;

    public NoticeEmployee_setProjectRole_22962929812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10998 = new Integer(-522618178);
        Class<? extends Object> term11078 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term11077 = ((Class) term11078).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term11077).setAccessible(true);
        Object enum28 =  ((Field) term11077).get((Object) null);
        Class<? extends Object> term11430 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term11429 = ((Class) term11430).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term11429).setAccessible(true);
        Object enum29 =  ((Field) term11429).get((Object) null);
        ArrayList term11024 = new ArrayList();
        ((ArrayList) term11024).add(enum28);
        ((ArrayList) term11024).add(enum29);
        ((ArrayList) term11024).add(enum28);
        ((ArrayList) term11024).add(enum28);
        ((ArrayList) term11024).add(enum28);
        ((ArrayList) term11024).add(enum29);
        ((ArrayList) term11024).add(enum28);
        ((ArrayList) term11024).add(enum28);
        Class<? extends Object> term11782 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term11781 = ((Class) term11782).getDeclaredField((String) "MANAGER");
        ((Field) term11781).setAccessible(true);
        Object enum30 = ((Field) term11781).get((Object) null);
        term10997 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term10997, term10997.getClass(), "id", term10998);
        setField(term10997, term10997.getClass(), "firstName", "AijpHYOFuy");
        setField(term10997, term10997.getClass(), "lastName", "SbAoxhfrkn");
        setField(term10997, term10997.getClass(), "roles", term11024);
        setField(term10997, term10997.getClass(), "projectRole", enum30);
        Class<? extends Object> term12120 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term12119 = ((Class) term12120).getDeclaredField((String) "EMPLOYEE");
        ((Field) term12119).setAccessible(true);
        enum31 = ((Field) term12119).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Object[] args = new Object[1];
        args[0] = enum31;
        callMethod(klass, "setProjectRole", argTypes, term10997, args);
    }

};


