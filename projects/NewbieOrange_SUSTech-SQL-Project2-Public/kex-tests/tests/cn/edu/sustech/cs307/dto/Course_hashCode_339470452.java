package cn.edu.sustech.cs307.dto;

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
import static cn.edu.sustech.cs307.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Course_hashCode_339470452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;

    public Course_hashCode_339470452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term743 = Class.forName((String) "cn.edu.sustech.cs307.dto.Course$CourseGrading");
        Field term742 = ((Class) term743).getDeclaredField((String) "PASS_OR_FAIL");
        ((Field) term742).setAccessible(true);
        Object enum1 = ((Field) term742).get((Object) null);
        term679 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.Course"));
        setField(term679, term679.getClass(), "id", "NRdvgJlhkX");
        setField(term679, term679.getClass(), "name", "uuaPigETmJ");
        setIntField(term679, term679.getClass(), "credit", -1955890973);
        setIntField(term679, term679.getClass(), "classHour", -2038273078);
        setField(term679, term679.getClass(), "grading", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term679, args);
    }

};


