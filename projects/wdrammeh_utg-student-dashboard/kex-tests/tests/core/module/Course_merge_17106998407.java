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

public class Course_merge_17106998407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29185;

    public Course_merge_17106998407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29185 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29185, term29185.getClass(), "score", 0.37773193782763337);
        setField(term29185, term29185.getClass(), "code", "iNwOJRBEjp");
        setField(term29185, term29185.getClass(), "name", "XylxrMBraH");
        setField(term29185, term29185.getClass(), "year", "pORebkoRdD");
        setField(term29185, term29185.getClass(), "semester", "mXGCWJDOqA");
        setField(term29185, term29185.getClass(), "lecturer", "dpNsDgfPso");
        setBooleanField(term29185, term29185.getClass(), "isLecturerEditable", true);
        setField(term29185, term29185.getClass(), "campus", "hCWPJQKpdc");
        setField(term29185, term29185.getClass(), "room", "WzMEhMXkKx");
        setField(term29185, term29185.getClass(), "day", "XOiDvlDhdc");
        setField(term29185, term29185.getClass(), "time", "AdxvLJhNLe");
        setField(term29185, term29185.getClass(), "requirement", "lHfTrWKMPk");
        setIntField(term29185, term29185.getClass(), "creditHours", 96566506);
        setBooleanField(term29185, term29185.getClass(), "isConfirmed", true);
        setField(term29185, term29185.getClass(), "status", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Module");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term29185, args);
    }

};


