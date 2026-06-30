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

public class NoticeEmployee_setId_2661121658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7433;
     Object term7476;

    public NoticeEmployee_setId_2661121658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7434 = new Integer(-1955890973);
        ArrayList term7460 = new ArrayList();
        Class<? extends Object> term7499 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term7498 = ((Class) term7499).getDeclaredField((String) "EMPLOYEE");
        ((Field) term7498).setAccessible(true);
        Object enum19 = ((Field) term7498).get((Object) null);
        term7433 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term7433, term7433.getClass(), "id", term7434);
        setField(term7433, term7433.getClass(), "firstName", "xOEqzGAmDU");
        setField(term7433, term7433.getClass(), "lastName", "eZFUvlxvGV");
        setField(term7433, term7433.getClass(), "roles", term7460);
        setField(term7433, term7433.getClass(), "projectRole", enum19);
        term7476 = new Integer(-2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term7476;
        callMethod(klass, "setId", argTypes, term7433, args);
    }

};


