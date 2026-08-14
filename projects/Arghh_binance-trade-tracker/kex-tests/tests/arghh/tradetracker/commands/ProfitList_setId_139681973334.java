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
import java.lang.Long;

public class ProfitList_setId_139681973334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4928;
     Object term4930;

    public ProfitList_setId_139681973334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4928 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        setField(term4928, term4928.getClass(), "buyPrice", null);
        setField(term4928, term4928.getClass(), "buyTime", null);
        setLongField(term4928, term4928.getClass(), "id", 0L);
        setField(term4928, term4928.getClass(), "profit", null);
        setField(term4928, term4928.getClass(), "quantity", null);
        setField(term4928, term4928.getClass(), "sellPrice", null);
        setField(term4928, term4928.getClass(), "sellTime", null);
        setField(term4928, term4928.getClass(), "symbol", null);
        setField(term4928, term4928.getClass(), "timeDifference", null);
        setField(term4928, term4928.getClass(), "totalProfit", null);
        term4930 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4930;
        callMethod(klass, "setId", argTypes, term4928, args);
    }

};


