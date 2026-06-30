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
     Object term29995;

    public SummerHandler_add_5404649281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29995 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29995, term29995.getClass(), "score", 0.7655020693602768);
        setField(term29995, term29995.getClass(), "code", "jwsfVjMoJT");
        setField(term29995, term29995.getClass(), "name", "ZfdXfCCFDf");
        setField(term29995, term29995.getClass(), "year", "MwwjNtdOFT");
        setField(term29995, term29995.getClass(), "semester", "VYkqXKVlAJ");
        setField(term29995, term29995.getClass(), "lecturer", "XkIoWJRNwN");
        setBooleanField(term29995, term29995.getClass(), "isLecturerEditable", false);
        setField(term29995, term29995.getClass(), "campus", "aNWLJdrZMq");
        setField(term29995, term29995.getClass(), "room", "HHmNoYxIGj");
        setField(term29995, term29995.getClass(), "day", "PtirvZmsGt");
        setField(term29995, term29995.getClass(), "time", "HWkpTmtlrc");
        setField(term29995, term29995.getClass(), "requirement", "hMmaoREuCK");
        setIntField(term29995, term29995.getClass(), "creditHours", -1963464809);
        setBooleanField(term29995, term29995.getClass(), "isConfirmed", true);
        setField(term29995, term29995.getClass(), "status", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term29995;
        callMethod(klass, "add", argTypes, null, args);
    }

};


