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

public class ForexRate_ForexRateBuilder_counterCurrency_2049204713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13539;

    public ForexRate_ForexRateBuilder_counterCurrency_2049204713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13567 = new Double(0.43692187681405226);
        Double term13569 = new Double(0.7633268466829064);
        term13539 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13540 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13540, term13540.getClass(), "seconds", 1606045635L);
        setIntField(term13540, term13540.getClass(), "nanos", 837000000);
        setField(term13539, term13539.getClass(), "timestamp", term13540);
        setField(term13539, term13539.getClass(), "baseCurrency", "xJgPlLxpgC");
        setField(term13539, term13539.getClass(), "counterCurrency", "EYtfuJaxiM");
        setField(term13539, term13539.getClass(), "buyRate", term13567);
        setField(term13539, term13539.getClass(), "sellRate", term13569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gCWtLVKVVe";
        callMethod(klass, "counterCurrency", argTypes, term13539, args);
    }

};


