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

public class Course_getQualityPoint_4787918315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28932;

    public Course_getQualityPoint_4787918315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28932 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28932, term28932.getClass(), "score", 0.6076495596892013);
        setField(term28932, term28932.getClass(), "code", "qxSDVejjiY");
        setField(term28932, term28932.getClass(), "name", "xBsXSDjXYK");
        setField(term28932, term28932.getClass(), "year", "sEnIVFtZuQ");
        setField(term28932, term28932.getClass(), "semester", "ZVecLZMLHF");
        setField(term28932, term28932.getClass(), "lecturer", "fztQhjqwdP");
        setBooleanField(term28932, term28932.getClass(), "isLecturerEditable", false);
        setField(term28932, term28932.getClass(), "campus", "eVpkWxjuki");
        setField(term28932, term28932.getClass(), "room", "SJiQaLvSKv");
        setField(term28932, term28932.getClass(), "day", "OEXDRUKcFl");
        setField(term28932, term28932.getClass(), "time", "RYdKCNNMBR");
        setField(term28932, term28932.getClass(), "requirement", "yGtHPyvYiQ");
        setIntField(term28932, term28932.getClass(), "creditHours", 538259104);
        setBooleanField(term28932, term28932.getClass(), "isConfirmed", false);
        setField(term28932, term28932.getClass(), "status", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualityPoint", argTypes, term28932, args);
    }

};


