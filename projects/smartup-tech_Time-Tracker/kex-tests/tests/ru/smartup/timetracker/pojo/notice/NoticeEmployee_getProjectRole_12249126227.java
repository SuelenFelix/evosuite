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

public class NoticeEmployee_getProjectRole_12249126227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6319;

    public NoticeEmployee_getProjectRole_12249126227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6320 = new Integer(-616727354);
        Class<? extends Object> term6389 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term6388 = ((Class) term6389).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term6388).setAccessible(true);
        Object enum16 =  ((Field) term6388).get((Object) null);
        Class<? extends Object> term6741 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term6740 = ((Class) term6741).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term6740).setAccessible(true);
        Object enum17 =  ((Field) term6740).get((Object) null);
        ArrayList term6346 = new ArrayList();
        ((ArrayList) term6346).add(enum16);
        ((ArrayList) term6346).add(enum17);
        ((ArrayList) term6346).add(enum17);
        Class<? extends Object> term7093 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term7092 = ((Class) term7093).getDeclaredField((String) "EMPLOYEE");
        ((Field) term7092).setAccessible(true);
        Object enum18 = ((Field) term7092).get((Object) null);
        term6319 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term6319, term6319.getClass(), "id", term6320);
        setField(term6319, term6319.getClass(), "firstName", "hNxWaHcfhY");
        setField(term6319, term6319.getClass(), "lastName", "RkybSrpybU");
        setField(term6319, term6319.getClass(), "roles", term6346);
        setField(term6319, term6319.getClass(), "projectRole", enum18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectRole", argTypes, term6319, args);
    }

};


