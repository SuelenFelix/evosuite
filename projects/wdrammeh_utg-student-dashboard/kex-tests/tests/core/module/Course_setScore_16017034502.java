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

public class Course_setScore_16017034502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28189;
     Object term28326;

    public Course_setScore_16017034502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28189 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term28189, term28189.getClass(), "score", 0.28570734989730284);
        setField(term28189, term28189.getClass(), "code", "JUmudUmaaV");
        setField(term28189, term28189.getClass(), "name", "KoyGrUJeJW");
        setField(term28189, term28189.getClass(), "year", "HqBOwkVqjD");
        setField(term28189, term28189.getClass(), "semester", "MAcUBcBckh");
        setField(term28189, term28189.getClass(), "lecturer", "oVgzLbrsFr");
        setBooleanField(term28189, term28189.getClass(), "isLecturerEditable", false);
        setField(term28189, term28189.getClass(), "campus", "vQVyKLdtaz");
        setField(term28189, term28189.getClass(), "room", "OWKQODBLzb");
        setField(term28189, term28189.getClass(), "day", "wGmYcqUkgE");
        setField(term28189, term28189.getClass(), "time", "idgaQsnJpQ");
        setField(term28189, term28189.getClass(), "requirement", "VgZnGoIFwQ");
        setIntField(term28189, term28189.getClass(), "creditHours", 480137250);
        setBooleanField(term28189, term28189.getClass(), "isConfirmed", true);
        setField(term28189, term28189.getClass(), "status", "jUbSRrkrYZ");
        term28326 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term28326;
        callMethod(klass, "setScore", argTypes, term28189, args);
    }

};


