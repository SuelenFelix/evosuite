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

public class Trade_getTradeTime_200515026034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28066;

    public Trade_getTradeTime_200515026034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28066 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28066, term28066.getClass(), "id", null);
        setField(term28066, term28066.getClass(), "symbol", null);
        setBooleanField(term28066, term28066.getClass(), "buy", false);
        setField(term28066, term28066.getClass(), "price", null);
        setField(term28066, term28066.getClass(), "quantity", null);
        setField(term28066, term28066.getClass(), "fee", null);
        setField(term28066, term28066.getClass(), "feeCoin", null);
        setField(term28066, term28066.getClass(), "total", null);
        setField(term28066, term28066.getClass(), "tradeTime", null);
        setField(term28066, term28066.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeTime", argTypes, term28066, args);
    }

};


