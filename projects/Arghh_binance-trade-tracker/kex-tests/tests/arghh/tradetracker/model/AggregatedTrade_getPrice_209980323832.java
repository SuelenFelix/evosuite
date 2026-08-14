package arghh.tradetracker.model;

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
import static arghh.tradetracker.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AggregatedTrade_getPrice_209980323832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16654;

    public AggregatedTrade_getPrice_209980323832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16654 = newInstance(Class.forName("arghh.tradetracker.model.AggregatedTrade"));
        setField(term16654, term16654.getClass(), "id", null);
        setField(term16654, term16654.getClass(), "symbol", null);
        setBooleanField(term16654, term16654.getClass(), "buy", false);
        setField(term16654, term16654.getClass(), "binanceId", null);
        setField(term16654, term16654.getClass(), "price", null);
        setField(term16654, term16654.getClass(), "quantity", null);
        setField(term16654, term16654.getClass(), "fee", null);
        setField(term16654, term16654.getClass(), "feeCoin", null);
        setField(term16654, term16654.getClass(), "total", null);
        setField(term16654, term16654.getClass(), "tradeTime", null);
        setField(term16654, term16654.getClass(), "profit", null);
        setField(term16654, term16654.getClass(), "trade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.AggregatedTrade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term16654, args);
    }

};


