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

public class CourseSearchEntry_hashCode_15554678775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2099;

    public CourseSearchEntry_hashCode_15554678775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2099 = newInstance(Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry"));
        setField(term2099, term2099.getClass(), "course", null);
        setField(term2099, term2099.getClass(), "section", null);
        setField(term2099, term2099.getClass(), "sectionClasses", null);
        setField(term2099, term2099.getClass(), "conflictCourseNames", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("cn.edu.sustech.cs307.dto.CourseSearchEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2099, args);
    }

};


