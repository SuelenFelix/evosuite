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

public class Trade_getPrice_191706124724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28046;

    public Trade_getPrice_191706124724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28046 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28046, term28046.getClass(), "id", null);
        setField(term28046, term28046.getClass(), "symbol", null);
        setBooleanField(term28046, term28046.getClass(), "buy", false);
        setField(term28046, term28046.getClass(), "price", null);
        setField(term28046, term28046.getClass(), "quantity", null);
        setField(term28046, term28046.getClass(), "fee", null);
        setField(term28046, term28046.getClass(), "feeCoin", null);
        setField(term28046, term28046.getClass(), "total", null);
        setField(term28046, term28046.getClass(), "tradeTime", null);
        setField(term28046, term28046.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term28046, args);
    }

};


