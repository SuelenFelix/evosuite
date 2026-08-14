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

public class PaymentEvent_hashCode_157548886415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1697;

    public PaymentEvent_hashCode_157548886415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1710 = new Long(-872011222785455006L);
        term1697 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1697, term1697.getClass(), "paymentId", "MAcUBcBckh");
        setField(term1697, term1697.getClass(), "amount", term1710);
        setField(term1697, term1697.getClass(), "currency", "oVgzLbrsFr");
        setField(term1697, term1697.getClass(), "toAccount", "vQVyKLdtaz");
        setField(term1697, term1697.getClass(), "fromAccount", "OWKQODBLzb");
        setField(term1697, term1697.getClass(), "rails", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1697, args);
    }

};


