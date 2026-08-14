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

public class ProfitList_setSymbol_24357453118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4358;

    public ProfitList_setSymbol_24357453118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4358 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term4371 = newInstance(Class.forName("java.util.Date"));
        Object term4410 = newInstance(Class.forName("java.util.Date"));
        setField(term4358, term4358.getClass(), "buyPrice", "hOncybyCAH");
        setLongField(term4371, term4371.getClass(), "fastTime", 1488725902101L);
        setField(term4371, term4371.getClass(), "cdate", null);
        setField(term4358, term4358.getClass(), "buyTime", term4371);
        setLongField(term4358, term4358.getClass(), "id", -6573104506744284592L);
        setField(term4358, term4358.getClass(), "profit", "QduALnDSVo");
        setField(term4358, term4358.getClass(), "quantity", "izPpKDErnQ");
        setField(term4358, term4358.getClass(), "sellPrice", "NnpwZBUTvx");
        setLongField(term4410, term4410.getClass(), "fastTime", 1311560117361L);
        setField(term4410, term4410.getClass(), "cdate", null);
        setField(term4358, term4358.getClass(), "sellTime", term4410);
        setField(term4358, term4358.getClass(), "symbol", "tlQSNgTkQX");
        setField(term4358, term4358.getClass(), "timeDifference", "PCipZnmBOF");
        setField(term4358, term4358.getClass(), "totalProfit", "zcorEihhLK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GrqozDKFOk";
        callMethod(klass, "setSymbol", argTypes, term4358, args);
    }

};


