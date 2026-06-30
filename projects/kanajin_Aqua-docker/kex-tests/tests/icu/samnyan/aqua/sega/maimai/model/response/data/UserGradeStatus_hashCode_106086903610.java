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

public class UserGradeStatus_hashCode_106086903610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public UserGradeStatus_hashCode_106086903610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus"));
        setIntField(term395, term395.getClass(), "gradeVersion", 1876565163);
        setIntField(term395, term395.getClass(), "gradeLevel", -817164822);
        setIntField(term395, term395.getClass(), "gradeSubLevel", -1016503459);
        setIntField(term395, term395.getClass(), "gradeMaxId", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term395, args);
    }

};


