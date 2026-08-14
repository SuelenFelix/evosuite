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

public class Trade_getAggregatedTrade_196945318140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28080;

    public Trade_getAggregatedTrade_196945318140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28080 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28080, term28080.getClass(), "id", null);
        setField(term28080, term28080.getClass(), "symbol", null);
        setBooleanField(term28080, term28080.getClass(), "buy", false);
        setField(term28080, term28080.getClass(), "price", null);
        setField(term28080, term28080.getClass(), "quantity", null);
        setField(term28080, term28080.getClass(), "fee", null);
        setField(term28080, term28080.getClass(), "feeCoin", null);
        setField(term28080, term28080.getClass(), "total", null);
        setField(term28080, term28080.getClass(), "tradeTime", null);
        setField(term28080, term28080.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAggregatedTrade", argTypes, term28080, args);
    }

};


