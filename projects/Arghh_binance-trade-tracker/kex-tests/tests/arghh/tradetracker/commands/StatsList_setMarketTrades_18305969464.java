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
import java.util.LinkedHashMap;

public class StatsList_setMarketTrades_18305969464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;
     Object term409;

    public StatsList_setMarketTrades_18305969464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term372 = new HashMap();
        HashMap term383 = new HashMap();
        HashMap term396 = new HashMap();
        term335 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term335, term335.getClass(), "tradeCount", "pCTimMblYc");
        setField(term335, term335.getClass(), "profitsGained", "hNxWaHcfhY");
        setField(term335, term335.getClass(), "profitsLost", "RkybSrpybU");
        setField(term335, term335.getClass(), "marketTrades", term372);
        setField(term335, term335.getClass(), "marketProfits", term383);
        setField(term335, term335.getClass(), "coinFees", term396);
        term409 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term409;
        callMethod(klass, "setMarketTrades", argTypes, term335, args);
    }

};


