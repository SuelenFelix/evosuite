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

public class NoticeEmployee_getLastName_12065288185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3701;

    public NoticeEmployee_getLastName_12065288185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3702 = new Integer(391863371);
        Class<? extends Object> term3773 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term3772 = ((Class) term3773).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term3772).setAccessible(true);
        Object enum9 =  ((Field) term3772).get((Object) null);
        Class<? extends Object> term4155 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term4154 = ((Class) term4155).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term4154).setAccessible(true);
        Object enum10 =  ((Field) term4154).get((Object) null);
        Class<? extends Object> term4507 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term4506 = ((Class) term4507).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term4506).setAccessible(true);
        Object enum11 =  ((Field) term4506).get((Object) null);
        ArrayList term3728 = new ArrayList();
        ((ArrayList) term3728).add(enum9);
        ((ArrayList) term3728).add(enum10);
        ((ArrayList) term3728).add(enum9);
        ((ArrayList) term3728).add(enum10);
        ((ArrayList) term3728).add(enum9);
        ((ArrayList) term3728).add(enum11);
        Class<? extends Object> term4868 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term4867 = ((Class) term4868).getDeclaredField((String) "MANAGER");
        ((Field) term4867).setAccessible(true);
        Object enum12 = ((Field) term4867).get((Object) null);
        term3701 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term3701, term3701.getClass(), "id", term3702);
        setField(term3701, term3701.getClass(), "firstName", "ZiaGIbnzTs");
        setField(term3701, term3701.getClass(), "lastName", "tbcdzjIfER");
        setField(term3701, term3701.getClass(), "roles", term3728);
        setField(term3701, term3701.getClass(), "projectRole", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term3701, args);
    }

};


