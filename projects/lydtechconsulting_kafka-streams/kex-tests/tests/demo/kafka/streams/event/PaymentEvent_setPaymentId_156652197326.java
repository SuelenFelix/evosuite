package demo.kafka.streams.event;

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
import static demo.kafka.streams.event.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PaymentEvent_setPaymentId_156652197326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2042;

    public PaymentEvent_setPaymentId_156652197326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2042 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term2042, term2042.getClass(), "paymentId", null);
        setField(term2042, term2042.getClass(), "amount", null);
        setField(term2042, term2042.getClass(), "currency", null);
        setField(term2042, term2042.getClass(), "toAccount", null);
        setField(term2042, term2042.getClass(), "fromAccount", null);
        setField(term2042, term2042.getClass(), "rails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPaymentId", argTypes, term2042, args);
    }

};


