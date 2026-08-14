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

public class ProfitList_getSellPrice_201453485027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4914;

    public ProfitList_getSellPrice_201453485027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4914 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        setField(term4914, term4914.getClass(), "buyPrice", null);
        setField(term4914, term4914.getClass(), "buyTime", null);
        setLongField(term4914, term4914.getClass(), "id", 0L);
        setField(term4914, term4914.getClass(), "profit", null);
        setField(term4914, term4914.getClass(), "quantity", null);
        setField(term4914, term4914.getClass(), "sellPrice", null);
        setField(term4914, term4914.getClass(), "sellTime", null);
        setField(term4914, term4914.getClass(), "symbol", null);
        setField(term4914, term4914.getClass(), "timeDifference", null);
        setField(term4914, term4914.getClass(), "totalProfit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSellPrice", argTypes, term4914, args);
    }

};


