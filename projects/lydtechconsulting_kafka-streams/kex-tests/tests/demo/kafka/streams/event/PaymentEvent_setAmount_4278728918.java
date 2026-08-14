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

public class PaymentEvent_setAmount_4278728918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;
     Object term877;

    public PaymentEvent_setAmount_4278728918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term827 = new Long(6811161968424632369L);
        term814 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term814, term814.getClass(), "paymentId", "xrwlQZdwCp");
        setField(term814, term814.getClass(), "amount", term827);
        setField(term814, term814.getClass(), "currency", "IDCWpPLRkE");
        setField(term814, term814.getClass(), "toAccount", "nyiiPDVjAc");
        setField(term814, term814.getClass(), "fromAccount", "aKnKipADSo");
        setField(term814, term814.getClass(), "rails", "wSQxaModmm");
        term877 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term877;
        callMethod(klass, "setAmount", argTypes, term814, args);
    }

};


