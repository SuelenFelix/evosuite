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

public class ProfitList_getSellPrice_20145348506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2344;

    public ProfitList_getSellPrice_20145348506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2344 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2357 = newInstance(Class.forName("java.util.Date"));
        Object term2396 = newInstance(Class.forName("java.util.Date"));
        setField(term2344, term2344.getClass(), "buyPrice", "WzMEhMXkKx");
        setLongField(term2357, term2357.getClass(), "fastTime", 1797203628025L);
        setField(term2357, term2357.getClass(), "cdate", null);
        setField(term2344, term2344.getClass(), "buyTime", term2357);
        setLongField(term2344, term2344.getClass(), "id", 7411271909051562686L);
        setField(term2344, term2344.getClass(), "profit", "XOiDvlDhdc");
        setField(term2344, term2344.getClass(), "quantity", "AdxvLJhNLe");
        setField(term2344, term2344.getClass(), "sellPrice", "lHfTrWKMPk");
        setLongField(term2396, term2396.getClass(), "fastTime", 1589457921030L);
        setField(term2396, term2396.getClass(), "cdate", null);
        setField(term2344, term2344.getClass(), "sellTime", term2396);
        setField(term2344, term2344.getClass(), "symbol", "JDaAnsVTGV");
        setField(term2344, term2344.getClass(), "timeDifference", "mLUZFTfjle");
        setField(term2344, term2344.getClass(), "totalProfit", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSellPrice", argTypes, term2344, args);
    }

};


