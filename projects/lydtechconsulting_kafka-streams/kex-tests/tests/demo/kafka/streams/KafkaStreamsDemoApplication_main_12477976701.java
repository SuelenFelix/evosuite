package demo.kafka.streams;

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
import static demo.kafka.streams.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KafkaStreamsDemoApplication_main_12477976701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3506;

    public KafkaStreamsDemoApplication_main_12477976701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3506 = (Object[]) newArray("java.lang.String", 5);
        setElement(term3506, 0, "jJCZpVmanW");
        setElement(term3506, 1, "EGtDIRbSSb");
        setElement(term3506, 2, "SzjVpOQTyS");
        setElement(term3506, 3, "MjGYSRKTNF");
        setElement(term3506, 4, "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("demo.kafka.streams.KafkaStreamsDemoApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3506;
        callMethod(klass, "main", argTypes, null, args);
    }

};


