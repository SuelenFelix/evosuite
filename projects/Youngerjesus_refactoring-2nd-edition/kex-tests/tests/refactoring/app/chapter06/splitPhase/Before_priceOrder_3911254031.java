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

public class Before_priceOrder_3911254031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term6;
     Object term8;

    public Before_priceOrder_3911254031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.Before"));
        term2 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.Product"));
        setIntField(term2, term2.getClass(), "basePrice", 568599855);
        setIntField(term2, term2.getClass(), "discountRate", 1162663216);
        setIntField(term2, term2.getClass(), "discountThreshold", 1484323161);
        term6 = new Integer(391863371);
        term8 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod"));
        setIntField(term8, term8.getClass(), "discountThreshold", -1922583790);
        setIntField(term8, term8.getClass(), "discountFee", -616727354);
        setIntField(term8, term8.getClass(), "feePerCase", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.Before");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.Product");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod");
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term6;
        args[2] = term8;
        callMethod(klass, "priceOrder", argTypes, term1, args);
    }

};


