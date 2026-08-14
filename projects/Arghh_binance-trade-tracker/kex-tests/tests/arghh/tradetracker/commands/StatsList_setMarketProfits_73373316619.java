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

public class StatsList_setMarketProfits_73373316619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;

    public StatsList_setMarketProfits_73373316619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1537 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1537, term1537.getClass(), "tradeCount", null);
        setField(term1537, term1537.getClass(), "profitsGained", null);
        setField(term1537, term1537.getClass(), "profitsLost", null);
        setField(term1537, term1537.getClass(), "marketTrades", null);
        setField(term1537, term1537.getClass(), "marketProfits", null);
        setField(term1537, term1537.getClass(), "coinFees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMarketProfits", argTypes, term1537, args);
    }

};


