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

public class Course_export_5277779947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29426;

    public Course_export_5277779947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29426 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29426, term29426.getClass(), "score", 0.8474802076607362);
        setField(term29426, term29426.getClass(), "code", "mLUZFTfjle");
        setField(term29426, term29426.getClass(), "name", "xIeFjkHkOe");
        setField(term29426, term29426.getClass(), "year", "SdCKLMIYnX");
        setField(term29426, term29426.getClass(), "semester", "OJJtVNPyKZ");
        setField(term29426, term29426.getClass(), "lecturer", "AKNapTAfmD");
        setBooleanField(term29426, term29426.getClass(), "isLecturerEditable", true);
        setField(term29426, term29426.getClass(), "campus", "xJgPlLxpgC");
        setField(term29426, term29426.getClass(), "room", "EYtfuJaxiM");
        setField(term29426, term29426.getClass(), "day", "gCWtLVKVVe");
        setField(term29426, term29426.getClass(), "time", "fWKJoSoCwE");
        setField(term29426, term29426.getClass(), "requirement", "wfaXBpWAUH");
        setIntField(term29426, term29426.getClass(), "creditHours", -343325701);
        setBooleanField(term29426, term29426.getClass(), "isConfirmed", true);
        setField(term29426, term29426.getClass(), "status", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term29426, args);
    }

};


