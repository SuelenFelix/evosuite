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

public class UserGradeStatus_canEqual_19812489569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term394;

    public UserGradeStatus_canEqual_19812489569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus"));
        setIntField(term389, term389.getClass(), "gradeVersion", 1962444399);
        setIntField(term389, term389.getClass(), "gradeLevel", 767834723);
        setIntField(term389, term389.getClass(), "gradeSubLevel", -602026508);
        setIntField(term389, term389.getClass(), "gradeMaxId", -157887805);
        term394 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term394;
        callMethod(klass, "canEqual", argTypes, term389, args);
    }

};


