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

public class ForexRate_setTimestamp_5440352038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25291;
     Object term25323;

    public ForexRate_setTimestamp_5440352038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25319 = new Double(0.5644914462415626);
        Double term25321 = new Double(0.509895859167191);
        term25291 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25292 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25292, term25292.getClass(), "seconds", 1597352397L);
        setIntField(term25292, term25292.getClass(), "nanos", 295000000);
        setField(term25291, term25291.getClass(), "timestamp", term25292);
        setField(term25291, term25291.getClass(), "baseCurrency", "NTWMiBEaDF");
        setField(term25291, term25291.getClass(), "counterCurrency", "SPBstwKFVr");
        setField(term25291, term25291.getClass(), "buyRate", term25319);
        setField(term25291, term25291.getClass(), "sellRate", term25321);
        term25323 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25323, term25323.getClass(), "seconds", 1713891155L);
        setIntField(term25323, term25323.getClass(), "nanos", 263000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term25323;
        callMethod(klass, "setTimestamp", argTypes, term25291, args);
    }

};


