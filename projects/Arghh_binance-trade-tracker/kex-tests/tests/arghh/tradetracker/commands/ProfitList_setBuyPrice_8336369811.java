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

public class ProfitList_setBuyPrice_8336369811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3144;

    public ProfitList_setBuyPrice_8336369811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3144 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term3157 = newInstance(Class.forName("java.util.Date"));
        Object term3196 = newInstance(Class.forName("java.util.Date"));
        setField(term3144, term3144.getClass(), "buyPrice", "PtirvZmsGt");
        setLongField(term3157, term3157.getClass(), "fastTime", 1550698994689L);
        setField(term3157, term3157.getClass(), "cdate", null);
        setField(term3144, term3144.getClass(), "buyTime", term3157);
        setLongField(term3144, term3144.getClass(), "id", -2813493605142626659L);
        setField(term3144, term3144.getClass(), "profit", "HWkpTmtlrc");
        setField(term3144, term3144.getClass(), "quantity", "hMmaoREuCK");
        setField(term3144, term3144.getClass(), "sellPrice", "VeDtgDzGAN");
        setLongField(term3196, term3196.getClass(), "fastTime", 1804998087131L);
        setField(term3196, term3196.getClass(), "cdate", null);
        setField(term3144, term3144.getClass(), "sellTime", term3196);
        setField(term3144, term3144.getClass(), "symbol", "aWYOWZFyaX");
        setField(term3144, term3144.getClass(), "timeDifference", "BRIVNtfUWU");
        setField(term3144, term3144.getClass(), "totalProfit", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WzFopsaDuG";
        callMethod(klass, "setBuyPrice", argTypes, term3144, args);
    }

};


