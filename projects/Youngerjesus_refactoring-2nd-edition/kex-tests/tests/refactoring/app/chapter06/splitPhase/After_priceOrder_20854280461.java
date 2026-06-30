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

public class After_priceOrder_20854280461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term16;
     Object term20;
     Object term22;

    public After_priceOrder_20854280461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.After"));
        term16 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.Product"));
        setIntField(term16, term16.getClass(), "basePrice", -2038273078);
        setIntField(term16, term16.getClass(), "discountRate", 1227103734);
        setIntField(term16, term16.getClass(), "discountThreshold", -1339778481);
        term20 = new Integer(1725571209);
        term22 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod"));
        setIntField(term22, term22.getClass(), "discountThreshold", -522618178);
        setIntField(term22, term22.getClass(), "discountFee", 1134449235);
        setIntField(term22, term22.getClass(), "feePerCase", -883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.After");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.Product");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter06.splitPhase.ShippingMethod");
        Object[] args = new Object[3];
        args[0] = term16;
        args[1] = term20;
        args[2] = term22;
        callMethod(klass, "priceOrder", argTypes, term15, args);
    }

};


