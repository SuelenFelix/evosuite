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
     Object term309597;

    public RegisteredCourse_merge_19318548781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309597 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term309597, term309597.getClass(), "code", "XMhUDGKSWO");
        setField(term309597, term309597.getClass(), "name", "jLgzxtuvVo");
        setField(term309597, term309597.getClass(), "year", "wmmxjOkPnH");
        setField(term309597, term309597.getClass(), "semester", "jgRohUQWxJ");
        setField(term309597, term309597.getClass(), "lecturer", "CJlAiZDIQO");
        setBooleanField(term309597, term309597.getClass(), "isLecturerEditable", true);
        setField(term309597, term309597.getClass(), "campus", "osgWaTBVoE");
        setField(term309597, term309597.getClass(), "room", "mvkMYcgAod");
        setField(term309597, term309597.getClass(), "day", "esbhDGQDgF");
        setField(term309597, term309597.getClass(), "time", "tKlyiBloWu");
        setField(term309597, term309597.getClass(), "requirement", "uIgRFcwqLd");
        setIntField(term309597, term309597.getClass(), "creditHours", 147387583);
        setBooleanField(term309597, term309597.getClass(), "isConfirmed", true);
        setField(term309597, term309597.getClass(), "status", "AvdsiEyCve");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Module");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term309597, args);
    }

};


