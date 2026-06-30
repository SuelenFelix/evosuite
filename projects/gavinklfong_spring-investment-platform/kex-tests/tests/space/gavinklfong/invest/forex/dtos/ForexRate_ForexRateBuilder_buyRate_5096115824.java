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

public class ForexRate_ForexRateBuilder_buyRate_5096115824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13613;
     Object term13645;

    public ForexRate_ForexRateBuilder_buyRate_5096115824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13641 = new Double(0.13481025392611334);
        Double term13643 = new Double(0.3800088629986428);
        term13613 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder"));
        Object term13614 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term13614, term13614.getClass(), "seconds", 1442639565L);
        setIntField(term13614, term13614.getClass(), "nanos", 302000000);
        setField(term13613, term13613.getClass(), "timestamp", term13614);
        setField(term13613, term13613.getClass(), "baseCurrency", "fWKJoSoCwE");
        setField(term13613, term13613.getClass(), "counterCurrency", "wfaXBpWAUH");
        setField(term13613, term13613.getClass(), "buyRate", term13641);
        setField(term13613, term13613.getClass(), "sellRate", term13643);
        term13645 = new Double(0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate$ForexRateBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term13645;
        callMethod(klass, "buyRate", argTypes, term13613, args);
    }

};


