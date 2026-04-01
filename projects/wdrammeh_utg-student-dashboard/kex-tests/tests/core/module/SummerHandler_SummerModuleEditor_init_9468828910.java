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

public class SummerHandler_SummerModuleEditor_init_9468828910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term393624;

    public SummerHandler_SummerModuleEditor_init_9468828910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393624 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term393624, term393624.getClass(), "score", 0.2852810965221698);
        setField(term393624, term393624.getClass(), "code", "xHLlctEoGh");
        setField(term393624, term393624.getClass(), "name", "aqgUzcnqpE");
        setField(term393624, term393624.getClass(), "year", "yZDlWLIKEp");
        setField(term393624, term393624.getClass(), "semester", "dAEiXUxDrI");
        setField(term393624, term393624.getClass(), "lecturer", "AgQWngzXPH");
        setBooleanField(term393624, term393624.getClass(), "isLecturerEditable", true);
        setField(term393624, term393624.getClass(), "campus", "EZJmAIzdHM");
        setField(term393624, term393624.getClass(), "room", "LAOkeXXkDr");
        setField(term393624, term393624.getClass(), "day", "YkZqFgrgVM");
        setField(term393624, term393624.getClass(), "time", "QEJBgSNviH");
        setField(term393624, term393624.getClass(), "requirement", "bjigisSVNp");
        setIntField(term393624, term393624.getClass(), "creditHours", -2133180225);
        setBooleanField(term393624, term393624.getClass(), "isConfirmed", false);
        setField(term393624, term393624.getClass(), "status", "yJCCaWqQuK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$SummerModuleEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term393624;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


