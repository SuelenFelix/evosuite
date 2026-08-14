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

public class StatsList_setMarketProfits_7337331666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term670;

    public StatsList_setMarketProfits_7337331666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term633 = new HashMap();
        HashMap term644 = new HashMap();
        HashMap term657 = new HashMap();
        term596 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term596, term596.getClass(), "tradeCount", "xrwlQZdwCp");
        setField(term596, term596.getClass(), "profitsGained", "IDCWpPLRkE");
        setField(term596, term596.getClass(), "profitsLost", "nyiiPDVjAc");
        setField(term596, term596.getClass(), "marketTrades", term633);
        setField(term596, term596.getClass(), "marketProfits", term644);
        setField(term596, term596.getClass(), "coinFees", term657);
        term670 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term670;
        callMethod(klass, "setMarketProfits", argTypes, term596, args);
    }

};


