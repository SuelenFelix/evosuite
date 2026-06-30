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

public class UserGradeStatus_setGradeSubLevel_12847262406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;
     Object term374;

    public UserGradeStatus_setGradeSubLevel_12847262406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus"));
        setIntField(term369, term369.getClass(), "gradeVersion", 590364439);
        setIntField(term369, term369.getClass(), "gradeLevel", 865208305);
        setIntField(term369, term369.getClass(), "gradeSubLevel", -1275173084);
        setIntField(term369, term369.getClass(), "gradeMaxId", -244121226);
        term374 = new Integer(-203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.UserGradeStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term374;
        callMethod(klass, "setGradeSubLevel", argTypes, term369, args);
    }

};


