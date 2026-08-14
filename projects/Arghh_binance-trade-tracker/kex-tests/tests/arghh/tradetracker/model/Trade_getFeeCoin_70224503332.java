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

public class Trade_getFeeCoin_70224503332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28062;

    public Trade_getFeeCoin_70224503332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28062 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28062, term28062.getClass(), "id", null);
        setField(term28062, term28062.getClass(), "symbol", null);
        setBooleanField(term28062, term28062.getClass(), "buy", false);
        setField(term28062, term28062.getClass(), "price", null);
        setField(term28062, term28062.getClass(), "quantity", null);
        setField(term28062, term28062.getClass(), "fee", null);
        setField(term28062, term28062.getClass(), "feeCoin", null);
        setField(term28062, term28062.getClass(), "total", null);
        setField(term28062, term28062.getClass(), "tradeTime", null);
        setField(term28062, term28062.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeeCoin", argTypes, term28062, args);
    }

};


