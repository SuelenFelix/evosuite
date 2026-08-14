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

public class StatsList_getProfitsLost_36799570311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1302;

    public StatsList_getProfitsLost_36799570311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1339 = new HashMap();
        HashMap term1350 = new HashMap();
        HashMap term1363 = new HashMap();
        term1302 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term1302, term1302.getClass(), "tradeCount", "HqBOwkVqjD");
        setField(term1302, term1302.getClass(), "profitsGained", "MAcUBcBckh");
        setField(term1302, term1302.getClass(), "profitsLost", "oVgzLbrsFr");
        setField(term1302, term1302.getClass(), "marketTrades", term1339);
        setField(term1302, term1302.getClass(), "marketProfits", term1350);
        setField(term1302, term1302.getClass(), "coinFees", term1363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfitsLost", argTypes, term1302, args);
    }

};


