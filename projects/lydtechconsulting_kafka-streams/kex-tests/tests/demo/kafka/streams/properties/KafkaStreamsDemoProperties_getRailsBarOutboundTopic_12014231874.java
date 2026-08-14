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

public class KafkaStreamsDemoProperties_getRailsBarOutboundTopic_12014231874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;

    public KafkaStreamsDemoProperties_getRailsBarOutboundTopic_12014231874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = newInstance(Class.forName("demo.kafka.streams.properties.KafkaStreamsDemoProperties"));
        setField(term268, term268.getClass(), "id", "MxlszYVzRf");
        setField(term268, term268.getClass(), "paymentInboundTopic", "LQFpaHEwXR");
        setField(term268, term268.getClass(), "railsFooOutboundTopic", "oVcInYnLWB");
        setField(term268, term268.getClass(), "railsBarOutboundTopic", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.properties.KafkaStreamsDemoProperties");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRailsBarOutboundTopic", argTypes, term268, args);
    }

};


