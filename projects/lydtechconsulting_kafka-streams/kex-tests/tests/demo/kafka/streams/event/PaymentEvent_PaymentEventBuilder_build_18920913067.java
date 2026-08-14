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

public class PaymentEvent_PaymentEventBuilder_build_18920913067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2842;

    public PaymentEvent_PaymentEventBuilder_build_18920913067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2855 = new Long(7009926388951271268L);
        term2842 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2842, term2842.getClass(), "paymentId", "lHfTrWKMPk");
        setField(term2842, term2842.getClass(), "amount", term2855);
        setField(term2842, term2842.getClass(), "currency", "JDaAnsVTGV");
        setField(term2842, term2842.getClass(), "toAccount", "mLUZFTfjle");
        setField(term2842, term2842.getClass(), "fromAccount", "xIeFjkHkOe");
        setField(term2842, term2842.getClass(), "rails", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2842, args);
    }

};


