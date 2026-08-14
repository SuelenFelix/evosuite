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

public class PaymentEvent_getRails_13001813976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566;

    public PaymentEvent_getRails_13001813976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term579 = new Long(7411271909051562686L);
        term566 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term566, term566.getClass(), "paymentId", "vrQLuWIDJX");
        setField(term566, term566.getClass(), "amount", term579);
        setField(term566, term566.getClass(), "currency", "flxyYxBRtu");
        setField(term566, term566.getClass(), "toAccount", "OclPbYPkcH");
        setField(term566, term566.getClass(), "fromAccount", "IoAlmYsBwc");
        setField(term566, term566.getClass(), "rails", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRails", argTypes, term566, args);
    }

};


