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

public class PaymentEvent_canEqual_146662912814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1583;
     Object term1646;

    public PaymentEvent_canEqual_146662912814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1596 = new Long(-5476826692763582090L);
        term1583 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1583, term1583.getClass(), "paymentId", "whBvTVIIlC");
        setField(term1583, term1583.getClass(), "amount", term1596);
        setField(term1583, term1583.getClass(), "currency", "IgRJUzaCwW");
        setField(term1583, term1583.getClass(), "toAccount", "JUmudUmaaV");
        setField(term1583, term1583.getClass(), "fromAccount", "KoyGrUJeJW");
        setField(term1583, term1583.getClass(), "rails", "HqBOwkVqjD");
        term1646 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1646;
        callMethod(klass, "canEqual", argTypes, term1583, args);
    }

};


