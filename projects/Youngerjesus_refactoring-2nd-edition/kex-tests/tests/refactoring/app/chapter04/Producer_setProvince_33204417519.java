package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Producer_setProvince_33204417519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2059;

    public Producer_setProvince_33204417519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2059 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term2059, term2059.getClass(), "name", null);
        setIntField(term2059, term2059.getClass(), "cost", 0);
        setIntField(term2059, term2059.getClass(), "production", 0);
        setField(term2059, term2059.getClass(), "province", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Producer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter04.Province");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProvince", argTypes, term2059, args);
    }

};


