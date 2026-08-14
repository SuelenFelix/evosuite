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

public class PaymentEvent_setRails_87651298112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1334;

    public PaymentEvent_setRails_87651298112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1347 = new Long(-4325723315152823407L);
        term1334 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent"));
        setField(term1334, term1334.getClass(), "paymentId", "nHXjMycHlU");
        setField(term1334, term1334.getClass(), "amount", term1347);
        setField(term1334, term1334.getClass(), "currency", "ieCtQFdkii");
        setField(term1334, term1334.getClass(), "toAccount", "dEnhdmILtU");
        setField(term1334, term1334.getClass(), "fromAccount", "hoicvmsovO");
        setField(term1334, term1334.getClass(), "rails", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setRails", argTypes, term1334, args);
    }

};


