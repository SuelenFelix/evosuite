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

public class NoticeEmployee_setFirstName_641506609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7839;

    public NoticeEmployee_setFirstName_641506609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7840 = new Integer(1227103734);
        Class<? extends Object> term7918 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term7917 = ((Class) term7918).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term7917).setAccessible(true);
        Object enum20 =  ((Field) term7917).get((Object) null);
        ArrayList term7866 = new ArrayList();
        ((ArrayList) term7866).add(enum20);
        Class<? extends Object> term8270 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term8269 = ((Class) term8270).getDeclaredField((String) "EMPLOYEE");
        ((Field) term8269).setAccessible(true);
        Object enum21 = ((Field) term8269).get((Object) null);
        term7839 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term7839, term7839.getClass(), "id", term7840);
        setField(term7839, term7839.getClass(), "firstName", "BYqFIqCKAV");
        setField(term7839, term7839.getClass(), "lastName", "vrQLuWIDJX");
        setField(term7839, term7839.getClass(), "roles", term7866);
        setField(term7839, term7839.getClass(), "projectRole", enum21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setFirstName", argTypes, term7839, args);
    }

};


