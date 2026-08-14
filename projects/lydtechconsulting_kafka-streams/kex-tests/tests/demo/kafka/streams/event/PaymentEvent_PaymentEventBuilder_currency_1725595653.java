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

public class PaymentEvent_PaymentEventBuilder_currency_1725595653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2302;

    public PaymentEvent_PaymentEventBuilder_currency_1725595653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2315 = new Long(-2585684163342970173L);
        term2302 = newInstance(Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder"));
        setField(term2302, term2302.getClass(), "paymentId", "sEccwbJKYE");
        setField(term2302, term2302.getClass(), "amount", term2315);
        setField(term2302, term2302.getClass(), "currency", "AWRooQKkdW");
        setField(term2302, term2302.getClass(), "toAccount", "vjxIhXHxGR");
        setField(term2302, term2302.getClass(), "fromAccount", "QXzGXbEXMu");
        setField(term2302, term2302.getClass(), "rails", "qxSDVejjiY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.event.PaymentEvent$PaymentEventBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "currency", argTypes, term2302, args);
    }

};


