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

public class Trade_isBuy_116536297736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28070;

    public Trade_isBuy_116536297736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28070 = newInstance(Class.forName("arghh.tradetracker.model.Trade"));
        setField(term28070, term28070.getClass(), "id", null);
        setField(term28070, term28070.getClass(), "symbol", null);
        setBooleanField(term28070, term28070.getClass(), "buy", false);
        setField(term28070, term28070.getClass(), "price", null);
        setField(term28070, term28070.getClass(), "quantity", null);
        setField(term28070, term28070.getClass(), "fee", null);
        setField(term28070, term28070.getClass(), "feeCoin", null);
        setField(term28070, term28070.getClass(), "total", null);
        setField(term28070, term28070.getClass(), "tradeTime", null);
        setField(term28070, term28070.getClass(), "aggregatedTrade", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Trade");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBuy", argTypes, term28070, args);
    }

};


