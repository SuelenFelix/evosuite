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

public class NoticeData_init_17021420072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19897;
     Object term19912;

    public NoticeData_init_17021420072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19898 = new Integer(-1275173084);
        term19897 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject"));
        setField(term19897, term19897.getClass(), "id", term19898);
        setField(term19897, term19897.getClass(), "name", "uWHnvSvaPl");
        Integer term19913 = new Integer(-244121226);
        Class<? extends Object> term19995 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term19994 = ((Class) term19995).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term19994).setAccessible(true);
        Object enum48 =  ((Field) term19994).get((Object) null);
        Class<? extends Object> term20347 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term20346 = ((Class) term20347).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term20346).setAccessible(true);
        Object enum49 =  ((Field) term20346).get((Object) null);
        Class<? extends Object> term20729 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term20728 = ((Class) term20729).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term20728).setAccessible(true);
        Object enum50 =  ((Field) term20728).get((Object) null);
        ArrayList term19939 = new ArrayList();
        ((ArrayList) term19939).add(enum48);
        ((ArrayList) term19939).add(enum48);
        ((ArrayList) term19939).add(enum48);
        ((ArrayList) term19939).add(enum48);
        ((ArrayList) term19939).add(enum49);
        ((ArrayList) term19939).add(enum49);
        ((ArrayList) term19939).add(enum50);
        Class<? extends Object> term21090 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term21089 = ((Class) term21090).getDeclaredField((String) "EMPLOYEE");
        ((Field) term21089).setAccessible(true);
        Object enum51 = ((Field) term21089).get((Object) null);
        term19912 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term19912, term19912.getClass(), "id", term19913);
        setField(term19912, term19912.getClass(), "firstName", "kBdSllIBVz");
        setField(term19912, term19912.getClass(), "lastName", "TJmVBGfTML");
        setField(term19912, term19912.getClass(), "roles", term19939);
        setField(term19912, term19912.getClass(), "projectRole", enum51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeProject");
        argTypes[1] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Object[] args = new Object[2];
        args[0] = term19897;
        args[1] = term19912;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


