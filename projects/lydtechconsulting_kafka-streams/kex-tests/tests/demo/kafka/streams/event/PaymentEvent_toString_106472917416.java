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

public class PaymentEvent_toString_106472917416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1810;

    public PaymentEvent_toString_106472917416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1823 = new Long(-316468845751588286L);
        term1810 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1810, term1810.getClass(), "paymentId", "idgaQsnJpQ");
        setField(term1810, term1810.getClass(), "amount", term1823);
        setField(term1810, term1810.getClass(), "currency", "VgZnGoIFwQ");
        setField(term1810, term1810.getClass(), "toAccount", "jUbSRrkrYZ");
        setField(term1810, term1810.getClass(), "fromAccount", "bWWfajKbEX");
        setField(term1810, term1810.getClass(), "rails", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1810, args);
    }

};


