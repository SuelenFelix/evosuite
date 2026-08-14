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

public class StatsList_setCoinFees_20618546898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term1004;

    public StatsList_setCoinFees_20618546898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term967 = new HashMap();
        HashMap term978 = new HashMap();
        HashMap term991 = new HashMap();
        term930 = newInstance(Class.forName("arghh.tradetracker.commands.StatsList"));
        setField(term930, term930.getClass(), "tradeCount", "onpbIeEKoi");
        setField(term930, term930.getClass(), "profitsGained", "YRHGsAkhxb");
        setField(term930, term930.getClass(), "profitsLost", "ffYhPOzlUs");
        setField(term930, term930.getClass(), "marketTrades", term967);
        setField(term930, term930.getClass(), "marketProfits", term978);
        setField(term930, term930.getClass(), "coinFees", term991);
        term1004 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.StatsList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term1004;
        callMethod(klass, "setCoinFees", argTypes, term930, args);
    }

};


