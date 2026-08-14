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
import java.lang.Long;

public class ProfitList_setId_139681973313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3488;
     Object term3578;

    public ProfitList_setId_139681973313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3488 = newInstance(Class.forName("arghh.tradetracker.commands.ProfitList"));
        Object term3501 = newInstance(Class.forName("java.util.Date"));
        Object term3540 = newInstance(Class.forName("java.util.Date"));
        setField(term3488, term3488.getClass(), "buyPrice", "zUlRdimJtU");
        setLongField(term3501, term3501.getClass(), "fastTime", 1502158153899L);
        setField(term3501, term3501.getClass(), "cdate", null);
        setField(term3488, term3488.getClass(), "buyTime", term3501);
        setLongField(term3488, term3488.getClass(), "id", -4325723315152823407L);
        setField(term3488, term3488.getClass(), "profit", "vwbEQQNQrx");
        setField(term3488, term3488.getClass(), "quantity", "xtftXXMbem");
        setField(term3488, term3488.getClass(), "sellPrice", "cudZvLMQon");
        setLongField(term3540, term3540.getClass(), "fastTime", 1630952644759L);
        setField(term3540, term3540.getClass(), "cdate", null);
        setField(term3488, term3488.getClass(), "sellTime", term3540);
        setField(term3488, term3488.getClass(), "symbol", "lihXWlGDxk");
        setField(term3488, term3488.getClass(), "timeDifference", "JmcmxoGhIK");
        setField(term3488, term3488.getClass(), "totalProfit", "jXzmYyrnnT");
        term3578 = new Long(2535595959091595249L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.commands.ProfitList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3578;
        callMethod(klass, "setId", argTypes, term3488, args);
    }

};


