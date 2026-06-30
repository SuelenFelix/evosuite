package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RegisteredCourse_merge_19318548781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91379;

    public RegisteredCourse_merge_19318548781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91379 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term91379, term91379.getClass(), "code", "VBUahCvyxC");
        setField(term91379, term91379.getClass(), "name", "MlzTkzKMCX");
        setField(term91379, term91379.getClass(), "year", "UqKUbMyPMJ");
        setField(term91379, term91379.getClass(), "semester", "QpYltHAdyY");
        setField(term91379, term91379.getClass(), "lecturer", "lbmSGBwIiV");
        setBooleanField(term91379, term91379.getClass(), "isLecturerEditable", false);
        setField(term91379, term91379.getClass(), "campus", "DAxyHoTLzZ");
        setField(term91379, term91379.getClass(), "room", "fhZgTouhCC");
        setField(term91379, term91379.getClass(), "day", "wrikqJwXvL");
        setField(term91379, term91379.getClass(), "time", "UiWhvbypdr");
        setField(term91379, term91379.getClass(), "requirement", "CgleElJNje");
        setIntField(term91379, term91379.getClass(), "creditHours", 1059930704);
        setBooleanField(term91379, term91379.getClass(), "isConfirmed", true);
        setField(term91379, term91379.getClass(), "status", "ZrchvNGMtd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Module");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term91379, args);
    }

};


