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

public class PaymentEvent_PaymentEventBuilder_paymentId_2787075871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2052;

    public PaymentEvent_PaymentEventBuilder_paymentId_2787075871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2065 = new Long(-6573104506744284592L);
        term2052 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2052, term2052.getClass(), "paymentId", "swZVeJAxjt");
        setField(term2052, term2052.getClass(), "amount", term2065);
        setField(term2052, term2052.getClass(), "currency", "xOcJIiQQDu");
        setField(term2052, term2052.getClass(), "toAccount", "GVizqqzXpy");
        setField(term2052, term2052.getClass(), "fromAccount", "JqXGgAhZPl");
        setField(term2052, term2052.getClass(), "rails", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DfISiziTgG";
        callMethod(klass, "paymentId", argTypes, term2052, args);
    }

};


