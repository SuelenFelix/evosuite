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

public class ProfitList_getSymbol_160233928529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4918;

    public ProfitList_getSymbol_160233928529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4918 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        setField(term4918, term4918.getClass(), "buyPrice", null);
        setField(term4918, term4918.getClass(), "buyTime", null);
        setLongField(term4918, term4918.getClass(), "id", 0L);
        setField(term4918, term4918.getClass(), "profit", null);
        setField(term4918, term4918.getClass(), "quantity", null);
        setField(term4918, term4918.getClass(), "sellPrice", null);
        setField(term4918, term4918.getClass(), "sellTime", null);
        setField(term4918, term4918.getClass(), "symbol", null);
        setField(term4918, term4918.getClass(), "timeDifference", null);
        setField(term4918, term4918.getClass(), "totalProfit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbol", argTypes, term4918, args);
    }

};


