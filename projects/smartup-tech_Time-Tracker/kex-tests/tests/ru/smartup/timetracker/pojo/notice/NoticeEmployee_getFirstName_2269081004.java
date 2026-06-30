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

public class NoticeEmployee_getFirstName_2269081004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2236;

    public NoticeEmployee_getFirstName_2269081004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2237 = new Integer(1484323161);
        Class<? extends Object> term2308 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term2307 = ((Class) term2308).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term2307).setAccessible(true);
        Object enum5 =  ((Field) term2307).get((Object) null);
        Class<? extends Object> term2660 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term2659 = ((Class) term2660).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term2659).setAccessible(true);
        Object enum6 =  ((Field) term2659).get((Object) null);
        Class<? extends Object> term3012 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term3011 = ((Class) term3012).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term3011).setAccessible(true);
        Object enum7 =  ((Field) term3011).get((Object) null);
        ArrayList term2263 = new ArrayList();
        ((ArrayList) term2263).add(enum5);
        ((ArrayList) term2263).add(enum6);
        ((ArrayList) term2263).add(enum7);
        ((ArrayList) term2263).add(enum7);
        Class<? extends Object> term3364 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term3363 = ((Class) term3364).getDeclaredField((String) "MANAGER");
        ((Field) term3363).setAccessible(true);
        Object enum8 = ((Field) term3363).get((Object) null);
        term2236 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term2236, term2236.getClass(), "id", term2237);
        setField(term2236, term2236.getClass(), "firstName", "oVcInYnLWB");
        setField(term2236, term2236.getClass(), "lastName", "aJlieCFVtF");
        setField(term2236, term2236.getClass(), "roles", term2263);
        setField(term2236, term2236.getClass(), "projectRole", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term2236, args);
    }

};


