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

public class ProfitList_setSellPrice_185177741016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4014;

    public ProfitList_setSellPrice_185177741016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4014 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term4027 = newInstance(Class.forName("java.util.Date"));
        Object term4066 = newInstance(Class.forName("java.util.Date"));
        setField(term4014, term4014.getClass(), "buyPrice", "PgPzMSEjjX");
        setLongField(term4027, term4027.getClass(), "fastTime", 1691868468367L);
        setField(term4027, term4027.getClass(), "cdate", null);
        setField(term4014, term4014.getClass(), "buyTime", term4027);
        setLongField(term4014, term4014.getClass(), "id", -316468845751588286L);
        setField(term4014, term4014.getClass(), "profit", "wzsPSPcRdj");
        setField(term4014, term4014.getClass(), "quantity", "kGMQdqJYyB");
        setField(term4014, term4014.getClass(), "sellPrice", "XJJNClzHRf");
        setLongField(term4066, term4066.getClass(), "fastTime", 1442370534632L);
        setField(term4066, term4066.getClass(), "cdate", null);
        setField(term4014, term4014.getClass(), "sellTime", term4066);
        setField(term4014, term4014.getClass(), "symbol", "HDaezxQfQR");
        setField(term4014, term4014.getClass(), "timeDifference", "iikZEapDlu");
        setField(term4014, term4014.getClass(), "totalProfit", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZkMALXpEAZ";
        callMethod(klass, "setSellPrice", argTypes, term4014, args);
    }

};


