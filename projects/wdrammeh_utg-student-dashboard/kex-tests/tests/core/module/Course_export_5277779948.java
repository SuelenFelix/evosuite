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

public class Course_export_5277779948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29432;

    public Course_export_5277779948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29432 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29432, term29432.getClass(), "score", 0.8474802076607362);
        setField(term29432, term29432.getClass(), "code", "mLUZFTfjle");
        setField(term29432, term29432.getClass(), "name", "xIeFjkHkOe");
        setField(term29432, term29432.getClass(), "year", "SdCKLMIYnX");
        setField(term29432, term29432.getClass(), "semester", "OJJtVNPyKZ");
        setField(term29432, term29432.getClass(), "lecturer", "AKNapTAfmD");
        setBooleanField(term29432, term29432.getClass(), "isLecturerEditable", true);
        setField(term29432, term29432.getClass(), "campus", "xJgPlLxpgC");
        setField(term29432, term29432.getClass(), "room", "EYtfuJaxiM");
        setField(term29432, term29432.getClass(), "day", "gCWtLVKVVe");
        setField(term29432, term29432.getClass(), "time", "fWKJoSoCwE");
        setField(term29432, term29432.getClass(), "requirement", "wfaXBpWAUH");
        setIntField(term29432, term29432.getClass(), "creditHours", -343325701);
        setBooleanField(term29432, term29432.getClass(), "isConfirmed", true);
        setField(term29432, term29432.getClass(), "status", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term29432, args);
    }

};


