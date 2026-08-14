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

public class ProfitList_setSellPrice_185177741037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4936;

    public ProfitList_setSellPrice_185177741037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4936 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        setField(term4936, term4936.getClass(), "buyPrice", null);
        setField(term4936, term4936.getClass(), "buyTime", null);
        setLongField(term4936, term4936.getClass(), "id", 0L);
        setField(term4936, term4936.getClass(), "profit", null);
        setField(term4936, term4936.getClass(), "quantity", null);
        setField(term4936, term4936.getClass(), "sellPrice", null);
        setField(term4936, term4936.getClass(), "sellTime", null);
        setField(term4936, term4936.getClass(), "symbol", null);
        setField(term4936, term4936.getClass(), "timeDifference", null);
        setField(term4936, term4936.getClass(), "totalProfit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSellPrice", argTypes, term4936, args);
    }

};


