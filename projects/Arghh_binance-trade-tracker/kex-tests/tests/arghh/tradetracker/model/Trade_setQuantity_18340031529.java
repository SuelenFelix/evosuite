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

public class Trade_setQuantity_18340031529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28056;

    public Trade_setQuantity_18340031529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28056 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28056, term28056.getClass(), "id", null);
        setField(term28056, term28056.getClass(), "symbol", null);
        setBooleanField(term28056, term28056.getClass(), "buy", false);
        setField(term28056, term28056.getClass(), "price", null);
        setField(term28056, term28056.getClass(), "quantity", null);
        setField(term28056, term28056.getClass(), "fee", null);
        setField(term28056, term28056.getClass(), "feeCoin", null);
        setField(term28056, term28056.getClass(), "total", null);
        setField(term28056, term28056.getClass(), "tradeTime", null);
        setField(term28056, term28056.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setQuantity", argTypes, term28056, args);
    }

};


