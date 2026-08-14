package demo.kafka.streams.properties;

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
import static demo.kafka.streams.properties.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KafkaStreamsDemoProperties_getPaymentInboundTopic_207909830011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;

    public KafkaStreamsDemoProperties_getPaymentInboundTopic_207909830011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term802 = newInstance(Class.forName("demo.kafka.streams.properties.KafkaStreamsDemoProperties"));
        setField(term802, term802.getClass(), "id", null);
        setField(term802, term802.getClass(), "paymentInboundTopic", null);
        setField(term802, term802.getClass(), "railsFooOutboundTopic", null);
        setField(term802, term802.getClass(), "railsBarOutboundTopic", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.properties.KafkaStreamsDemoProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPaymentInboundTopic", argTypes, term802, args);
    }

};


