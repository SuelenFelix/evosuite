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
import java.lang.Long;

public class PaymentEvent_PaymentEventBuilder_fromAccount_15689050555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2572;

    public PaymentEvent_PaymentEventBuilder_fromAccount_15689050555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2585 = new Long(-4365849114644724155L);
        term2572 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2572, term2572.getClass(), "paymentId", "RYdKCNNMBR");
        setField(term2572, term2572.getClass(), "amount", term2585);
        setField(term2572, term2572.getClass(), "currency", "yGtHPyvYiQ");
        setField(term2572, term2572.getClass(), "toAccount", "MvRIxilFMJ");
        setField(term2572, term2572.getClass(), "fromAccount", "iNwOJRBEjp");
        setField(term2572, term2572.getClass(), "rails", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "fromAccount", argTypes, term2572, args);
    }

};


