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

public class After_applyShipping_21176716303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;
     Object term34;
     Object term38;

    public After_applyShipping_21176716303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.After"));
        term34 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.PriceData"));
        setIntField(term34, term34.getClass(), "basePrice", 1622346318);
        setIntField(term34, term34.getClass(), "quantity", 1048535127);
        setIntField(term34, term34.getClass(), "discount", -655067527);
        term38 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod"));
        setIntField(term38, term38.getClass(), "discountThreshold", -6029667);
        setIntField(term38, term38.getClass(), "discountFee", -2068769794);
        setIntField(term38, term38.getClass(), "feePerCase", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.After");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.PriceData");
        argTypes[1] = Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod");
        Object[] args = new Object[2];
        args[0] = term34;
        args[1] = term38;
        callMethod(klass, "applyShipping", argTypes, term33, args);
    }

};


