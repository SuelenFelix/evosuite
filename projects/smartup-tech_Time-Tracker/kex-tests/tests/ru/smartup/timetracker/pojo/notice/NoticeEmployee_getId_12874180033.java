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

public class NoticeEmployee_getId_12874180033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;

    public NoticeEmployee_getId_12874180033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term678 = new Integer(1162663216);
        Class<? extends Object> term804 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term803 = ((Class) term804).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term803).setAccessible(true);
        Object enum1 =  ((Field) term803).get((Object) null);
        Class<? extends Object> term1186 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1185 = ((Class) term1186).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term1185).setAccessible(true);
        Object enum2 =  ((Field) term1185).get((Object) null);
        Class<? extends Object> term1547 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term1546 = ((Class) term1547).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1546).setAccessible(true);
        Object enum3 =  ((Field) term1546).get((Object) null);
        ArrayList term704 = new ArrayList();
        ((ArrayList) term704).add(enum1);
        ((ArrayList) term704).add(enum2);
        ((ArrayList) term704).add(enum1);
        ((ArrayList) term704).add(enum2);
        ((ArrayList) term704).add(enum3);
        Class<? extends Object> term1899 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term1898 = ((Class) term1899).getDeclaredField((String) "MANAGER");
        ((Field) term1898).setAccessible(true);
        Object enum4 = ((Field) term1898).get((Object) null);
        term677 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term677, term677.getClass(), "id", term678);
        setField(term677, term677.getClass(), "firstName", "MxlszYVzRf");
        setField(term677, term677.getClass(), "lastName", "LQFpaHEwXR");
        setField(term677, term677.getClass(), "roles", term704);
        setField(term677, term677.getClass(), "projectRole", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term677, args);
    }

};


