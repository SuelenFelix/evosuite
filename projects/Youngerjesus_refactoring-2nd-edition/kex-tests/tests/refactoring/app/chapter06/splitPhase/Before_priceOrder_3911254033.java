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
import java.lang.Integer;

public class Before_priceOrder_3911254033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term13;

    public Before_priceOrder_3911254033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.Before"));
        term13 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.Before");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.Product");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term13;
        args[2] = null;
        callMethod(klass, "priceOrder", argTypes, term12, args);
    }

};


