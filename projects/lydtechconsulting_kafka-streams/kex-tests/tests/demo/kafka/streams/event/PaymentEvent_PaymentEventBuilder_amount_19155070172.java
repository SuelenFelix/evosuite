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

public class PaymentEvent_PaymentEventBuilder_amount_19155070172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2187;
     Object term2250;

    public PaymentEvent_PaymentEventBuilder_amount_19155070172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2200 = new Long(-4920224193275732920L);
        term2187 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2187, term2187.getClass(), "paymentId", "XqgfKFvPSD");
        setField(term2187, term2187.getClass(), "amount", term2200);
        setField(term2187, term2187.getClass(), "currency", "JiVRgTZvKc");
        setField(term2187, term2187.getClass(), "toAccount", "XPKmummaqg");
        setField(term2187, term2187.getClass(), "fromAccount", "BKLfkLiZTH");
        setField(term2187, term2187.getClass(), "rails", "SPpkrGcPRr");
        term2250 = new Long(8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2250;
        callMethod(klass, "amount", argTypes, term2187, args);
    }

};


