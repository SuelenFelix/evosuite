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

public class ProfitList_setTimeDifference_184734237919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4540;

    public ProfitList_setTimeDifference_184734237919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4540 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term4553 = newInstance(Class.forName("java.util.Date"));
        Object term4592 = newInstance(Class.forName("java.util.Date"));
        setField(term4540, term4540.getClass(), "buyPrice", "CFyoseFGLF");
        setLongField(term4553, term4553.getClass(), "fastTime", 1595517583842L);
        setField(term4553, term4553.getClass(), "cdate", null);
        setField(term4540, term4540.getClass(), "buyTime", term4553);
        setLongField(term4540, term4540.getClass(), "id", -4920224193275732920L);
        setField(term4540, term4540.getClass(), "profit", "SFqCrhEWLm");
        setField(term4540, term4540.getClass(), "quantity", "GZdcJyZntS");
        setField(term4540, term4540.getClass(), "sellPrice", "OIHoJeysUi");
        setLongField(term4592, term4592.getClass(), "fastTime", 1464421789888L);
        setField(term4592, term4592.getClass(), "cdate", null);
        setField(term4540, term4540.getClass(), "sellTime", term4592);
        setField(term4540, term4540.getClass(), "symbol", "WXMWFDGcLB");
        setField(term4540, term4540.getClass(), "timeDifference", "wKWbJssZuG");
        setField(term4540, term4540.getClass(), "totalProfit", "NzBMMhkhpT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qCpEbQDHdF";
        callMethod(klass, "setTimeDifference", argTypes, term4540, args);
    }

};


