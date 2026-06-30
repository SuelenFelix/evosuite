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

public class NoticeEmployee_getRoles_16794414316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5205;

    public NoticeEmployee_getRoles_16794414316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5206 = new Integer(-1922583790);
        Class<? extends Object> term5275 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term5274 = ((Class) term5275).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term5274).setAccessible(true);
        Object enum13 =  ((Field) term5274).get((Object) null);
        Class<? extends Object> term5627 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term5626 = ((Class) term5627).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term5626).setAccessible(true);
        Object enum14 =  ((Field) term5626).get((Object) null);
        ArrayList term5232 = new ArrayList();
        ((ArrayList) term5232).add(enum13);
        ((ArrayList) term5232).add(enum13);
        ((ArrayList) term5232).add(enum14);
        ((ArrayList) term5232).add(enum14);
        ((ArrayList) term5232).add(enum13);
        ((ArrayList) term5232).add(enum13);
        ((ArrayList) term5232).add(enum14);
        ((ArrayList) term5232).add(enum14);
        ((ArrayList) term5232).add(enum13);
        Class<? extends Object> term5979 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term5978 = ((Class) term5979).getDeclaredField((String) "EMPLOYEE");
        ((Field) term5978).setAccessible(true);
        Object enum15 = ((Field) term5978).get((Object) null);
        term5205 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term5205, term5205.getClass(), "id", term5206);
        setField(term5205, term5205.getClass(), "firstName", "HyxfbSQYBe");
        setField(term5205, term5205.getClass(), "lastName", "pCTimMblYc");
        setField(term5205, term5205.getClass(), "roles", term5232);
        setField(term5205, term5205.getClass(), "projectRole", enum15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term5205, args);
    }

};


