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
import java.lang.Integer;

public class UserGradeStatus_setGradeLevel_2466681505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;
     Object term367;

    public UserGradeStatus_setGradeLevel_2466681505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus"));
        setIntField(term362, term362.getClass(), "gradeVersion", -6029667);
        setIntField(term362, term362.getClass(), "gradeLevel", -2068769794);
        setIntField(term362, term362.getClass(), "gradeSubLevel", -117576464);
        setIntField(term362, term362.getClass(), "gradeMaxId", -1007160944);
        term367 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term367;
        callMethod(klass, "setGradeLevel", argTypes, term362, args);
    }

};


