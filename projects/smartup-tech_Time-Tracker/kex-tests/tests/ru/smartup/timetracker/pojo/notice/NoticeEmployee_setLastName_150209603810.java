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

public class NoticeEmployee_setLastName_150209603810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8620;

    public NoticeEmployee_setLastName_150209603810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8621 = new Integer(-1339778481);
        Class<? extends Object> term8701 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term8700 = ((Class) term8701).getDeclaredField((String) "ROLE_EMPLOYEE");
        ((Field) term8700).setAccessible(true);
        Object enum22 =  ((Field) term8700).get((Object) null);
        Class<? extends Object> term9062 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term9061 = ((Class) term9062).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term9061).setAccessible(true);
        Object enum23 =  ((Field) term9061).get((Object) null);
        ArrayList term8647 = new ArrayList();
        ((ArrayList) term8647).add(enum22);
        ((ArrayList) term8647).add(enum23);
        ((ArrayList) term8647).add(enum23);
        Class<? extends Object> term9444 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9443 = ((Class) term9444).getDeclaredField((String) "MANAGER");
        ((Field) term9443).setAccessible(true);
        Object enum24 = ((Field) term9443).get((Object) null);
        term8620 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term8620, term8620.getClass(), "id", term8621);
        setField(term8620, term8620.getClass(), "firstName", "OclPbYPkcH");
        setField(term8620, term8620.getClass(), "lastName", "IoAlmYsBwc");
        setField(term8620, term8620.getClass(), "roles", term8647);
        setField(term8620, term8620.getClass(), "projectRole", enum24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TEParAifyi";
        callMethod(klass, "setLastName", argTypes, term8620, args);
    }

};


