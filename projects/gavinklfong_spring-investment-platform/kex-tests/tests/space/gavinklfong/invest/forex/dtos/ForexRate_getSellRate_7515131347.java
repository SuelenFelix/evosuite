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

public class ForexRate_getSellRate_7515131347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25239;

    public ForexRate_getSellRate_7515131347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25267 = new Double(0.7171972879282721);
        Double term25269 = new Double(0.9006361024877096);
        term25239 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25240 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25240, term25240.getClass(), "seconds", 1272776321L);
        setIntField(term25240, term25240.getClass(), "nanos", 768000000);
        setField(term25239, term25239.getClass(), "timestamp", term25240);
        setField(term25239, term25239.getClass(), "baseCurrency", "QSrDQfEsTR");
        setField(term25239, term25239.getClass(), "counterCurrency", "PsqusYmejD");
        setField(term25239, term25239.getClass(), "buyRate", term25267);
        setField(term25239, term25239.getClass(), "sellRate", term25269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSellRate", argTypes, term25239, args);
    }

};


