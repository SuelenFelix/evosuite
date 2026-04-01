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

public class Course_getQualityPoint_4787918316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28938;

    public Course_getQualityPoint_4787918316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28938 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28938, term28938.getClass(), "score", 0.6076495596892013);
        setField(term28938, term28938.getClass(), "code", "qxSDVejjiY");
        setField(term28938, term28938.getClass(), "name", "xBsXSDjXYK");
        setField(term28938, term28938.getClass(), "year", "sEnIVFtZuQ");
        setField(term28938, term28938.getClass(), "semester", "ZVecLZMLHF");
        setField(term28938, term28938.getClass(), "lecturer", "fztQhjqwdP");
        setBooleanField(term28938, term28938.getClass(), "isLecturerEditable", false);
        setField(term28938, term28938.getClass(), "campus", "eVpkWxjuki");
        setField(term28938, term28938.getClass(), "room", "SJiQaLvSKv");
        setField(term28938, term28938.getClass(), "day", "OEXDRUKcFl");
        setField(term28938, term28938.getClass(), "time", "RYdKCNNMBR");
        setField(term28938, term28938.getClass(), "requirement", "yGtHPyvYiQ");
        setIntField(term28938, term28938.getClass(), "creditHours", 538259104);
        setBooleanField(term28938, term28938.getClass(), "isConfirmed", false);
        setField(term28938, term28938.getClass(), "status", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQualityPoint", argTypes, term28938, args);
    }

};


