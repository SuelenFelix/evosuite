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

public class ProfitList_setBuyTime_194981950512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term3416;

    public ProfitList_setBuyTime_194981950512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3326 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term3339 = newInstance(Class.forName("java.util.Date"));
        Object term3378 = newInstance(Class.forName("java.util.Date"));
        setField(term3326, term3326.getClass(), "buyPrice", "PapWxkhEWe");
        setLongField(term3339, term3339.getClass(), "fastTime", 1538078916394L);
        setField(term3339, term3339.getClass(), "cdate", null);
        setField(term3326, term3326.getClass(), "buyTime", term3339);
        setLongField(term3326, term3326.getClass(), "id", -8885298608300233488L);
        setField(term3326, term3326.getClass(), "profit", "smnHEqRFRx");
        setField(term3326, term3326.getClass(), "quantity", "XYtryyobou");
        setField(term3326, term3326.getClass(), "sellPrice", "OYbzXylRWW");
        setLongField(term3378, term3378.getClass(), "fastTime", 1744090065937L);
        setField(term3378, term3378.getClass(), "cdate", null);
        setField(term3326, term3326.getClass(), "sellTime", term3378);
        setField(term3326, term3326.getClass(), "symbol", "DSNsTGYXDF");
        setField(term3326, term3326.getClass(), "timeDifference", "sQvGcVjdEx");
        setField(term3326, term3326.getClass(), "totalProfit", "rLHAoqXgPh");
        term3416 = newInstance(Class.forName("java.util.Date"));
        setLongField(term3416, term3416.getClass(), "fastTime", 1347400561385L);
        setField(term3416, term3416.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term3416;
        callMethod(klass, "setBuyTime", argTypes, term3326, args);
    }

};


