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

public class PaymentEvent_PaymentEventBuilder_rails_205941968315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3073;

    public PaymentEvent_PaymentEventBuilder_rails_205941968315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3073 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term3073, term3073.getClass(), "paymentId", null);
        setField(term3073, term3073.getClass(), "amount", null);
        setField(term3073, term3073.getClass(), "currency", null);
        setField(term3073, term3073.getClass(), "toAccount", null);
        setField(term3073, term3073.getClass(), "fromAccount", null);
        setField(term3073, term3073.getClass(), "rails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "rails", argTypes, term3073, args);
    }

};


