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

public class NoticeEmployee_canEqual_85087536514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13631;
     Object term13683;

    public NoticeEmployee_canEqual_85087536514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13632 = new Integer(-883034806);
        Class<? extends Object> term13705 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term13704 = ((Class) term13705).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term13704).setAccessible(true);
        Object enum35 =  ((Field) term13704).get((Object) null);
        Class<? extends Object> term14087 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term14086 = ((Class) term14087).getDeclaredField((String) "ROLE_REPORT_RECEIVER");
        ((Field) term14086).setAccessible(true);
        Object enum36 =  ((Field) term14086).get((Object) null);
        Class<? extends Object> term14469 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term14468 = ((Class) term14469).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term14468).setAccessible(true);
        Object enum37 =  ((Field) term14468).get((Object) null);
        ArrayList term13658 = new ArrayList();
        ((ArrayList) term13658).add(enum35);
        ((ArrayList) term13658).add(enum36);
        ((ArrayList) term13658).add(enum37);
        ((ArrayList) term13658).add(enum36);
        ((ArrayList) term13658).add(enum37);
        ((ArrayList) term13658).add(enum35);
        ((ArrayList) term13658).add(enum36);
        ((ArrayList) term13658).add(enum36);
        ((ArrayList) term13658).add(enum35);
        Class<? extends Object> term14821 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term14820 = ((Class) term14821).getDeclaredField((String) "EMPLOYEE");
        ((Field) term14820).setAccessible(true);
        Object enum38 = ((Field) term14820).get((Object) null);
        term13631 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term13631, term13631.getClass(), "id", term13632);
        setField(term13631, term13631.getClass(), "firstName", "xrwlQZdwCp");
        setField(term13631, term13631.getClass(), "lastName", "IDCWpPLRkE");
        setField(term13631, term13631.getClass(), "roles", term13658);
        setField(term13631, term13631.getClass(), "projectRole", enum38);
        term13683 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13683;
        callMethod(klass, "canEqual", argTypes, term13631, args);
    }

};


