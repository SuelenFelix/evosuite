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

public class NoticeEmployee_toString_91273362916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15916;

    public NoticeEmployee_toString_91273362916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15917 = new Integer(597278769);
        Class<? extends Object> term15985 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term15984 = ((Class) term15985).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term15984).setAccessible(true);
        Object enum41 =  ((Field) term15984).get((Object) null);
        Class<? extends Object> term16346 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term16345 = ((Class) term16346).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term16345).setAccessible(true);
        Object enum42 =  ((Field) term16345).get((Object) null);
        ArrayList term15943 = new ArrayList();
        ((ArrayList) term15943).add(enum41);
        ((ArrayList) term15943).add(enum42);
        ((ArrayList) term15943).add(enum41);
        ((ArrayList) term15943).add(enum42);
        ((ArrayList) term15943).add(enum41);
        Class<? extends Object> term16728 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term16727 = ((Class) term16728).getDeclaredField((String) "MANAGER");
        ((Field) term16727).setAccessible(true);
        Object enum43 = ((Field) term16727).get((Object) null);
        term15916 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term15916, term15916.getClass(), "id", term15917);
        setField(term15916, term15916.getClass(), "firstName", "wSQxaModmm");
        setField(term15916, term15916.getClass(), "lastName", "UlajhuVLaP");
        setField(term15916, term15916.getClass(), "roles", term15943);
        setField(term15916, term15916.getClass(), "projectRole", enum43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15916, args);
    }

};


