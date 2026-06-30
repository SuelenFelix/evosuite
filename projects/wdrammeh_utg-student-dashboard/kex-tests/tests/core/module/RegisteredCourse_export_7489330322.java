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

public class RegisteredCourse_export_7489330322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91625;

    public RegisteredCourse_export_7489330322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91625 = newInstance(Class.forName("core.module.RegisteredCourse"));
        setField(term91625, term91625.getClass(), "code", "WaEcyVlcIx");
        setField(term91625, term91625.getClass(), "name", "ONcbPCQnHd");
        setField(term91625, term91625.getClass(), "year", "AobDaplFLl");
        setField(term91625, term91625.getClass(), "semester", "pDkMNnAGgv");
        setField(term91625, term91625.getClass(), "lecturer", "PaCpFXGzdX");
        setBooleanField(term91625, term91625.getClass(), "isLecturerEditable", true);
        setField(term91625, term91625.getClass(), "campus", "FftYCNbnks");
        setField(term91625, term91625.getClass(), "room", "lJoltmsadS");
        setField(term91625, term91625.getClass(), "day", "mvfDtZNEHr");
        setField(term91625, term91625.getClass(), "time", "bvSgmFUDOU");
        setField(term91625, term91625.getClass(), "requirement", "XMHwbfiHRl");
        setIntField(term91625, term91625.getClass(), "creditHours", -1967153290);
        setBooleanField(term91625, term91625.getClass(), "isConfirmed", true);
        setField(term91625, term91625.getClass(), "status", "bucTnYicnp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.RegisteredCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "export", argTypes, term91625, args);
    }

};


