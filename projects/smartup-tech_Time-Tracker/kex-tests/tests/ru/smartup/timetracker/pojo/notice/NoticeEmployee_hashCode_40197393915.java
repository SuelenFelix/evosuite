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

public class NoticeEmployee_hashCode_40197393915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15161;

    public NoticeEmployee_hashCode_40197393915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15162 = new Integer(1585847225);
        Class<? extends Object> term15227 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.EmployeeRoleEnum");
        Field term15226 = ((Class) term15227).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term15226).setAccessible(true);
        Object enum39 =  ((Field) term15226).get((Object) null);
        ArrayList term15188 = new ArrayList();
        ((ArrayList) term15188).add(enum39);
        Class<? extends Object> term15579 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProjectRoleEnum");
        Field term15578 = ((Class) term15579).getDeclaredField((String) "MANAGER");
        ((Field) term15578).setAccessible(true);
        Object enum40 = ((Field) term15578).get((Object) null);
        term15161 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee"));
        setField(term15161, term15161.getClass(), "id", term15162);
        setField(term15161, term15161.getClass(), "firstName", "nyiiPDVjAc");
        setField(term15161, term15161.getClass(), "lastName", "aKnKipADSo");
        setField(term15161, term15161.getClass(), "roles", term15188);
        setField(term15161, term15161.getClass(), "projectRole", enum40);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeEmployee");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term15161, args);
    }

};


