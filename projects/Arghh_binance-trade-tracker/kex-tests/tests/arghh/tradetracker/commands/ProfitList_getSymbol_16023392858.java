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

public class ProfitList_getSymbol_16023392858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2664;

    public ProfitList_getSymbol_16023392858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2664 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term2677 = newInstance(Class.forName("java.util.Date"));
        Object term2716 = newInstance(Class.forName("java.util.Date"));
        setField(term2664, term2664.getClass(), "buyPrice", "wfaXBpWAUH");
        setLongField(term2677, term2677.getClass(), "fastTime", 1706078172457L);
        setField(term2677, term2677.getClass(), "cdate", null);
        setField(term2664, term2664.getClass(), "buyTime", term2677);
        setLongField(term2664, term2664.getClass(), "id", 6811161968424632369L);
        setField(term2664, term2664.getClass(), "profit", "VMeAzAHwZj");
        setField(term2664, term2664.getClass(), "quantity", "PznxWXsZME");
        setField(term2664, term2664.getClass(), "sellPrice", "ZzIujlwVsw");
        setLongField(term2716, term2716.getClass(), "fastTime", 1863631094992L);
        setField(term2716, term2716.getClass(), "cdate", null);
        setField(term2664, term2664.getClass(), "sellTime", term2716);
        setField(term2664, term2664.getClass(), "symbol", "LWyEaeIyAo");
        setField(term2664, term2664.getClass(), "timeDifference", "yVMkkQhvmN");
        setField(term2664, term2664.getClass(), "totalProfit", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSymbol", argTypes, term2664, args);
    }

};


