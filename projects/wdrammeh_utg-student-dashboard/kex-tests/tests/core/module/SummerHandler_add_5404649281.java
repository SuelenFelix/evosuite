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

public class SummerHandler_add_5404649281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36279;

    public SummerHandler_add_5404649281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36279 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term36279, term36279.getClass(), "score", 0.7655020693602768);
        setField(term36279, term36279.getClass(), "code", "zUlRdimJtU");
        setField(term36279, term36279.getClass(), "name", "vwbEQQNQrx");
        setField(term36279, term36279.getClass(), "year", "xtftXXMbem");
        setField(term36279, term36279.getClass(), "semester", "cudZvLMQon");
        setField(term36279, term36279.getClass(), "lecturer", "lihXWlGDxk");
        setBooleanField(term36279, term36279.getClass(), "isLecturerEditable", true);
        setField(term36279, term36279.getClass(), "campus", "JmcmxoGhIK");
        setField(term36279, term36279.getClass(), "room", "jXzmYyrnnT");
        setField(term36279, term36279.getClass(), "day", "igCAtimmYB");
        setField(term36279, term36279.getClass(), "time", "DyiXbeYIaN");
        setField(term36279, term36279.getClass(), "requirement", "VGizxZnyHX");
        setIntField(term36279, term36279.getClass(), "creditHours", -1896376975);
        setBooleanField(term36279, term36279.getClass(), "isConfirmed", false);
        setField(term36279, term36279.getClass(), "status", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term36279;
        callMethod(klass, "add", argTypes, null, args);
    }

};


