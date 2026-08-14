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

public class PaymentEvent_PaymentEventBuilder_amount_191550701711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3069;

    public PaymentEvent_PaymentEventBuilder_amount_191550701711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3069 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term3069, term3069.getClass(), "paymentId", null);
        setField(term3069, term3069.getClass(), "amount", null);
        setField(term3069, term3069.getClass(), "currency", null);
        setField(term3069, term3069.getClass(), "toAccount", null);
        setField(term3069, term3069.getClass(), "fromAccount", null);
        setField(term3069, term3069.getClass(), "rails", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "amount", argTypes, term3069, args);
    }

};


