package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGradeStatus_getGradeLevel_66771162815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;

    public UserGradeStatus_getGradeLevel_66771162815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus"));
        setIntField(term418, term418.getClass(), "gradeVersion", 0);
        setIntField(term418, term418.getClass(), "gradeLevel", 0);
        setIntField(term418, term418.getClass(), "gradeSubLevel", 0);
        setIntField(term418, term418.getClass(), "gradeMaxId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeLevel", argTypes, term418, args);
    }

};


