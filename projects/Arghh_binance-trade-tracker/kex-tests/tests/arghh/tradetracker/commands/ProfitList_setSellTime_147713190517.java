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
import java.lang.Object;

public class ProfitList_setSellTime_147713190517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4196;
     Object term4286;

    public ProfitList_setSellTime_147713190517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4196 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term4209 = newInstance(Class.forName("java.util.Date"));
        Object term4248 = newInstance(Class.forName("java.util.Date"));
        setField(term4196, term4196.getClass(), "buyPrice", "tXfQjSqDzN");
        setLongField(term4209, term4209.getClass(), "fastTime", 1659994192918L);
        setField(term4209, term4209.getClass(), "cdate", null);
        setField(term4196, term4196.getClass(), "buyTime", term4209);
        setLongField(term4196, term4196.getClass(), "id", 5127676408959197577L);
        setField(term4196, term4196.getClass(), "profit", "BjugTaMcxJ");
        setField(term4196, term4196.getClass(), "quantity", "vGiuZVPJNH");
        setField(term4196, term4196.getClass(), "sellPrice", "tlzpzIjMib");
        setLongField(term4248, term4248.getClass(), "fastTime", 1876872800559L);
        setField(term4248, term4248.getClass(), "cdate", null);
        setField(term4196, term4196.getClass(), "sellTime", term4248);
        setField(term4196, term4196.getClass(), "symbol", "AZdLeSugwv");
        setField(term4196, term4196.getClass(), "timeDifference", "RMsXuyzKJV");
        setField(term4196, term4196.getClass(), "totalProfit", "FwPbDZcHmB");
        term4286 = newInstance(Class.forName("java.util.Date"));
        setLongField(term4286, term4286.getClass(), "fastTime", 1304532099366L);
        setField(term4286, term4286.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term4286;
        callMethod(klass, "setSellTime", argTypes, term4196, args);
    }

};


