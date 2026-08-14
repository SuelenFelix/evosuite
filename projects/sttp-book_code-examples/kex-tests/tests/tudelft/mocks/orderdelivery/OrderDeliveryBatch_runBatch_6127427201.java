package tudelft.mocks.orderdelivery;

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
import static tudelft.mocks.orderdelivery.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrderDeliveryBatch_runBatch_6127427201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public OrderDeliveryBatch_runBatch_6127427201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("tudelft.mocks.orderdelivery.OrderDeliveryBatch"));
        setField(term137, term137.getClass(), "orders", null);
        setField(term137, term137.getClass(), "delivery", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tudelft.mocks.orderdelivery.OrderDeliveryBatch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "runBatch", argTypes, term137, args);
    }

};


