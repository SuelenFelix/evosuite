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

public class ForexRate_setCounterCurrency_184586387310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25420;

    public ForexRate_setCounterCurrency_184586387310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term25448 = new Double(0.12764449157430724);
        Double term25450 = new Double(0.39446728256884744);
        term25420 = newInstance(Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate"));
        Object term25421 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term25421, term25421.getClass(), "seconds", 1263744156L);
        setIntField(term25421, term25421.getClass(), "nanos", 294000000);
        setField(term25420, term25420.getClass(), "timestamp", term25421);
        setField(term25420, term25420.getClass(), "baseCurrency", "GEJABPlHSI");
        setField(term25420, term25420.getClass(), "counterCurrency", "aQFUvuaYxd");
        setField(term25420, term25420.getClass(), "buyRate", term25448);
        setField(term25420, term25420.getClass(), "sellRate", term25450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.invest.forex.dtos.ForexRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNFLXMifnS";
        callMethod(klass, "setCounterCurrency", argTypes, term25420, args);
    }

};


