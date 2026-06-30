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
import java.util.LinkedList;

public class NoticeEmployee_setRoles_27318821911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9791;
     Object term9834;

    public NoticeEmployee_setRoles_27318821911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9792 = new Integer(1725571209);
        ArrayList term9818 = new ArrayList();
        Class<? extends Object> term9893 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term9892 = ((Class) term9893).getDeclaredField((String) "EMPLOYEE");
        ((Field) term9892).setAccessible(true);
        Object enum25 = ((Field) term9892).get((Object) null);
        term9791 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term9791, term9791.getClass(), "id", term9792);
        setField(term9791, term9791.getClass(), "firstName", "OWDIEULEFu");
        setField(term9791, term9791.getClass(), "lastName", "dWRymuLBtr");
        setField(term9791, term9791.getClass(), "roles", term9818);
        setField(term9791, term9791.getClass(), "projectRole", enum25);
        Class<? extends Object> term10234 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term10233 = ((Class) term10234).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term10233).setAccessible(true);
        Object enum26 =  ((Field) term10233).get((Object) null);
        Class<? extends Object> term10616 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term10615 = ((Class) term10616).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term10615).setAccessible(true);
        Object enum27 =  ((Field) term10615).get((Object) null);
        term9834 = new LinkedList();
        ((LinkedList) term9834).add(enum26);
        ((LinkedList) term9834).add(enum27);
        ((LinkedList) term9834).add(enum26);
        ((LinkedList) term9834).add(enum27);
        ((LinkedList) term9834).add((Object)null);
        ((LinkedList) term9834).add((Object)null);
        ((LinkedList) term9834).add((Object)null);
        ((LinkedList) term9834).add((Object)null);
        ((LinkedList) term9834).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9834;
        callMethod(klass, "setRoles", argTypes, term9791, args);
    }

};


