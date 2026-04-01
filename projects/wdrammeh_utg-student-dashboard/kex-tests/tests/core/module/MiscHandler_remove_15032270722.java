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

public class MiscHandler_remove_15032270722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120409;

    public MiscHandler_remove_15032270722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120409 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term120409, term120409.getClass(), "score", 0.6436713023569729);
        setField(term120409, term120409.getClass(), "code", "UqgLPaaAHi");
        setField(term120409, term120409.getClass(), "name", "xypryEkUPF");
        setField(term120409, term120409.getClass(), "year", "zyZTzHNjQr");
        setField(term120409, term120409.getClass(), "semester", "YSrFKQQwXE");
        setField(term120409, term120409.getClass(), "lecturer", "qxhOsmyyjm");
        setBooleanField(term120409, term120409.getClass(), "isLecturerEditable", true);
        setField(term120409, term120409.getClass(), "campus", "DuKcNfVVYR");
        setField(term120409, term120409.getClass(), "room", "fRujHWvXjJ");
        setField(term120409, term120409.getClass(), "day", "EAIAAStlTz");
        setField(term120409, term120409.getClass(), "time", "yIWXcOQTgy");
        setField(term120409, term120409.getClass(), "requirement", "xAWekqanqc");
        setIntField(term120409, term120409.getClass(), "creditHours", -1288536479);
        setBooleanField(term120409, term120409.getClass(), "isConfirmed", true);
        setField(term120409, term120409.getClass(), "status", "GSOWFHMlbF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term120409;
        callMethod(klass, "remove", argTypes, null, args);
    }

};


