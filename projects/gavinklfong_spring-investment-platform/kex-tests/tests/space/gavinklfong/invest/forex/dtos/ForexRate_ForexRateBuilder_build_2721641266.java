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

public class ForexRate_ForexRateBuilder_build_2721641266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13721;

    public ForexRate_ForexRateBuilder_build_2721641266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13749 = new Double(0.37161417339133307);
        Double term13751 = new Double(0.6805867182029153);
        term13721 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13722 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13722, term13722.getClass(), "seconds", 1429023851L);
        setIntField(term13722, term13722.getClass(), "nanos", 389000000);
        setField(term13721, term13721.getClass(), "timestamp", term13722);
        setField(term13721, term13721.getClass(), "baseCurrency", "ZzIujlwVsw");
        setField(term13721, term13721.getClass(), "counterCurrency", "LWyEaeIyAo");
        setField(term13721, term13721.getClass(), "buyRate", term13749);
        setField(term13721, term13721.getClass(), "sellRate", term13751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term13721, args);
    }

};


