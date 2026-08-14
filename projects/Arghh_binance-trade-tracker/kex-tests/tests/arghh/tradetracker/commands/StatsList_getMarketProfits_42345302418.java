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

public class StatsList_getMarketProfits_42345302418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1536;

    public StatsList_getMarketProfits_42345302418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1536 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1536, term1536.getClass(), "tradeCount", null);
        setField(term1536, term1536.getClass(), "profitsGained", null);
        setField(term1536, term1536.getClass(), "profitsLost", null);
        setField(term1536, term1536.getClass(), "marketTrades", null);
        setField(term1536, term1536.getClass(), "marketProfits", null);
        setField(term1536, term1536.getClass(), "coinFees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMarketProfits", argTypes, term1536, args);
    }

};


