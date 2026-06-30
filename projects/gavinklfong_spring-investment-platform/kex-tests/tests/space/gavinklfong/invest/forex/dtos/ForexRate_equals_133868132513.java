package space.gavinklfong.invest.forex.dtos;

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
import static space.gavinklfong.invest.forex.dtos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ForexRate_equals_133868132513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25602;
     Object term25634;

    public ForexRate_equals_133868132513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25630 = new Double(0.6561919196821765);
        Double term25632 = new Double(0.7330178886612495);
        term25602 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25603 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25603, term25603.getClass(), "seconds", 1643981113L);
        setIntField(term25603, term25603.getClass(), "nanos", 575000000);
        setField(term25602, term25602.getClass(), "timestamp", term25603);
        setField(term25602, term25602.getClass(), "baseCurrency", "nRvKihUSPj");
        setField(term25602, term25602.getClass(), "counterCurrency", "BbNeQJpYPr");
        setField(term25602, term25602.getClass(), "buyRate", term25630);
        setField(term25602, term25602.getClass(), "sellRate", term25632);
        term25634 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25634;
        callMethod(klass, "equals", argTypes, term25602, args);
    }

};


