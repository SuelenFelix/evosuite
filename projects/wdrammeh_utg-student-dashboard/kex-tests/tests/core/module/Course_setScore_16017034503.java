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
import java.lang.Double;

public class Course_setScore_16017034503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28195;
     Object term28332;

    public Course_setScore_16017034503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28195 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28195, term28195.getClass(), "score", 0.28570734989730284);
        setField(term28195, term28195.getClass(), "code", "JUmudUmaaV");
        setField(term28195, term28195.getClass(), "name", "KoyGrUJeJW");
        setField(term28195, term28195.getClass(), "year", "HqBOwkVqjD");
        setField(term28195, term28195.getClass(), "semester", "MAcUBcBckh");
        setField(term28195, term28195.getClass(), "lecturer", "oVgzLbrsFr");
        setBooleanField(term28195, term28195.getClass(), "isLecturerEditable", false);
        setField(term28195, term28195.getClass(), "campus", "vQVyKLdtaz");
        setField(term28195, term28195.getClass(), "room", "OWKQODBLzb");
        setField(term28195, term28195.getClass(), "day", "wGmYcqUkgE");
        setField(term28195, term28195.getClass(), "time", "idgaQsnJpQ");
        setField(term28195, term28195.getClass(), "requirement", "VgZnGoIFwQ");
        setIntField(term28195, term28195.getClass(), "creditHours", 480137250);
        setBooleanField(term28195, term28195.getClass(), "isConfirmed", true);
        setField(term28195, term28195.getClass(), "status", "jUbSRrkrYZ");
        term28332 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term28332;
        callMethod(klass, "setScore", argTypes, term28195, args);
    }

};


