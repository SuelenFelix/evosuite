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

public class PaymentEvent_PaymentEventBuilder_toAccount_11871365944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2437;

    public PaymentEvent_PaymentEventBuilder_toAccount_11871365944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2450 = new Long(8059786003080744426L);
        term2437 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2437, term2437.getClass(), "paymentId", "sEnIVFtZuQ");
        setField(term2437, term2437.getClass(), "amount", term2450);
        setField(term2437, term2437.getClass(), "currency", "ZVecLZMLHF");
        setField(term2437, term2437.getClass(), "toAccount", "fztQhjqwdP");
        setField(term2437, term2437.getClass(), "fromAccount", "eVpkWxjuki");
        setField(term2437, term2437.getClass(), "rails", "SJiQaLvSKv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OEXDRUKcFl";
        callMethod(klass, "toAccount", argTypes, term2437, args);
    }

};


