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

public class ForexRate_ForexRateBuilder_timestamp_16902836911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13410;
     Object term13442;

    public ForexRate_ForexRateBuilder_timestamp_16902836911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13438 = new Double(0.6436713023569729);
        Double term13440 = new Double(0.7332741045694002);
        term13410 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13411 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13411, term13411.getClass(), "seconds", 1345871412L);
        setIntField(term13411, term13411.getClass(), "nanos", 244000000);
        setField(term13410, term13410.getClass(), "timestamp", term13411);
        setField(term13410, term13410.getClass(), "baseCurrency", "mLUZFTfjle");
        setField(term13410, term13410.getClass(), "counterCurrency", "xIeFjkHkOe");
        setField(term13410, term13410.getClass(), "buyRate", term13438);
        setField(term13410, term13410.getClass(), "sellRate", term13440);
        term13442 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13442, term13442.getClass(), "seconds", 1480438351L);
        setIntField(term13442, term13442.getClass(), "nanos", 369000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term13442;
        callMethod(klass, "timestamp", argTypes, term13410, args);
    }

};


