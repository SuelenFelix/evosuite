package refactoring.app.chapter07.inlineClass;

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
import static refactoring.app.chapter07.inlineClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Shipment_getShippingCompany_794225658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;

    public Shipment_getShippingCompany_794225658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("refactoring.app.chapter07.inlineClass.Shipment"));
        setField(term271, term271.getClass(), "shippingCompany", null);
        setField(term271, term271.getClass(), "trackingNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter07.inlineClass.Shipment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShippingCompany", argTypes, term271, args);
    }

};


