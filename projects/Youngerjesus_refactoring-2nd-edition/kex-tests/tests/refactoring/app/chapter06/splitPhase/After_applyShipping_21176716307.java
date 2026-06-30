package refactoring.app.chapter06.splitPhase;

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
import static refactoring.app.chapter06.splitPhase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class After_applyShipping_21176716307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public After_applyShipping_21176716307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.After"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.After");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.PriceData");
        argTypes[1] = Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "applyShipping", argTypes, term48, args);
    }

};


