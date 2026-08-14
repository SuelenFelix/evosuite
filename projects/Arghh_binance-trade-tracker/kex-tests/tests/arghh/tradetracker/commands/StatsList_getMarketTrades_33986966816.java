package arghh.tradetracker.commands;

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
import static arghh.tradetracker.commands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StatsList_getMarketTrades_33986966816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534;

    public StatsList_getMarketTrades_33986966816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1534, term1534.getClass(), "tradeCount", null);
        setField(term1534, term1534.getClass(), "profitsGained", null);
        setField(term1534, term1534.getClass(), "profitsLost", null);
        setField(term1534, term1534.getClass(), "marketTrades", null);
        setField(term1534, term1534.getClass(), "marketProfits", null);
        setField(term1534, term1534.getClass(), "coinFees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMarketTrades", argTypes, term1534, args);
    }

};


