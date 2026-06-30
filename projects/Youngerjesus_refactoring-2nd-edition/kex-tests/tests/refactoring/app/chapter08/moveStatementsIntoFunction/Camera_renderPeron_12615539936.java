package refactoring.app.chapter08.moveStatementsIntoFunction;

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
import static refactoring.app.chapter08.moveStatementsIntoFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Camera_renderPeron_12615539936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248;

    public Camera_renderPeron_12615539936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248 = newInstance(Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Camera");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = Class.forName("refactoring.app.chapter08.moveStatementsIntoFunction.Person");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "renderPeron", argTypes, term248, args);
    }

};


