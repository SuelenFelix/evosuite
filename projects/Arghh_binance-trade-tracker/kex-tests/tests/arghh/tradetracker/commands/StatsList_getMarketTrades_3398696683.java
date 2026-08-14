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
import java.util.HashMap;

public class StatsList_getMarketTrades_3398696683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;

    public StatsList_getMarketTrades_3398696683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term268 = new HashMap();
        HashMap term279 = new HashMap();
        HashMap term292 = new HashMap();
        term231 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term231, term231.getClass(), "tradeCount", "LQFpaHEwXR");
        setField(term231, term231.getClass(), "profitsGained", "oVcInYnLWB");
        setField(term231, term231.getClass(), "profitsLost", "aJlieCFVtF");
        setField(term231, term231.getClass(), "marketTrades", term268);
        setField(term231, term231.getClass(), "marketProfits", term279);
        setField(term231, term231.getClass(), "coinFees", term292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMarketTrades", argTypes, term231, args);
    }

};


