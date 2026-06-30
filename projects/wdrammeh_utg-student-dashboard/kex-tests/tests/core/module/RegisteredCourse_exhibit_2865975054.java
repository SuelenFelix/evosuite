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

public class RegisteredCourse_exhibit_2865975054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91893;

    public RegisteredCourse_exhibit_2865975054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91893 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term91893, term91893.getClass(), "code", "fbnKvthhOz");
        setField(term91893, term91893.getClass(), "name", "PGfCDJTBek");
        setField(term91893, term91893.getClass(), "year", "ZwjARhAtHC");
        setField(term91893, term91893.getClass(), "semester", "XXvscsYBWv");
        setField(term91893, term91893.getClass(), "lecturer", "uePedtiAfL");
        setBooleanField(term91893, term91893.getClass(), "isLecturerEditable", true);
        setField(term91893, term91893.getClass(), "campus", "AdSHvysxQB");
        setField(term91893, term91893.getClass(), "room", "jlraKkBWFA");
        setField(term91893, term91893.getClass(), "day", "mRBtFTxVdE");
        setField(term91893, term91893.getClass(), "time", "IVacFDAZcj");
        setField(term91893, term91893.getClass(), "requirement", "EEYmuwyVDP");
        setIntField(term91893, term91893.getClass(), "creditHours", -1397251956);
        setBooleanField(term91893, term91893.getClass(), "isConfirmed", true);
        setField(term91893, term91893.getClass(), "status", "EWFbEDAVrE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exhibit", argTypes, term91893, args);
    }

};


