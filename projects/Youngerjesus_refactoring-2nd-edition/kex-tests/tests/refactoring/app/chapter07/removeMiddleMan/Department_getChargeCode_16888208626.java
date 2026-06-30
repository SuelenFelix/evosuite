package refactoring.app.chapter07.removeMiddleMan;

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
import static refactoring.app.chapter07.removeMiddleMan.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Department_getChargeCode_16888208626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;

    public Department_getChargeCode_16888208626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("refactoring.app.chapter07.removeMiddleMan.Department"));
        setIntField(term178, term178.getClass(), "chargeCode", 0);
        setField(term178, term178.getClass(), "manager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.removeMiddleMan.Department");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChargeCode", argTypes, term178, args);
    }

};


