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

public class ForexRate_getBaseCurrency_9945911704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25083;

    public ForexRate_getBaseCurrency_9945911704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25111 = new Double(0.16988691727397487);
        Double term25113 = new Double(0.39286935532362843);
        term25083 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25084 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25084, term25084.getClass(), "seconds", 1597233967L);
        setIntField(term25084, term25084.getClass(), "nanos", 116000000);
        setField(term25083, term25083.getClass(), "timestamp", term25084);
        setField(term25083, term25083.getClass(), "baseCurrency", "vLerpqavFM");
        setField(term25083, term25083.getClass(), "counterCurrency", "qnvxzwuGKX");
        setField(term25083, term25083.getClass(), "buyRate", term25111);
        setField(term25083, term25083.getClass(), "sellRate", term25113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCurrency", argTypes, term25083, args);
    }

};


