package arghh.tradetracker.model;

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
import static arghh.tradetracker.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Profit_setTimeDifference_138506715714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4508;
     Object term4576;

    public Profit_setTimeDifference_138506715714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4509 = new Long(2120084523938730454L);
        Class<? extends Object> term4579 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term4578 = ((Class) term4579).getDeclaredField((String) "BTC");
        ((Field) term4578).setAccessible(true);
        Object enum14 = ((Field) term4578).get((Object) null);
        ArrayList term4570 = new ArrayList();
        term4508 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term4518 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4519 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4521 = (int[]) newIntArray(6);
        Object term4535 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4536 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4538 = (int[]) newIntArray(6);
        Object term4552 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4553 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4555 = (int[]) newIntArray(6);
        Object term4574 = newInstance(Class.forName("java.util.Date"));
        setField(term4508, term4508.getClass(), "id", term4509);
        setField(term4508, term4508.getClass(), "baseCurrency", enum14);
        setIntField(term4519, term4519.getClass(), "signum", 1);
        setIntElement(term4521, 0, 3343);
        setIntElement(term4521, 1, 1456376648);
        setIntElement(term4521, 2, 1910233449);
        setIntElement(term4521, 3, 263192112);
        setIntElement(term4521, 4, -1531392990);
        setIntElement(term4521, 5, -213663359);
        setField(term4519, term4519.getClass(), "mag", term4521);
        setIntField(term4519, term4519.getClass(), "bitCountPlusOne", 0);
        setIntField(term4519, term4519.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4519, term4519.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4519, term4519.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4518, term4518.getClass(), "intVal", term4519);
        setIntField(term4518, term4518.getClass(), "scale", 52);
        setIntField(term4518, term4518.getClass(), "precision", 0);
        setField(term4518, term4518.getClass(), "stringCache", null);
        setLongField(term4518, term4518.getClass(), "intCompact", -9223372036854775808L);
        setField(term4508, term4508.getClass(), "profitValue", term4518);
        setIntField(term4536, term4536.getClass(), "signum", 1);
        setIntElement(term4538, 0, 29163);
        setIntElement(term4538, 1, -367943220);
        setIntElement(term4538, 2, -1268770484);
        setIntElement(term4538, 3, -1631757095);
        setIntElement(term4538, 4, 1946902054);
        setIntElement(term4538, 5, 285170999);
        setField(term4536, term4536.getClass(), "mag", term4538);
        setIntField(term4536, term4536.getClass(), "bitCountPlusOne", 0);
        setIntField(term4536, term4536.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4536, term4536.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4536, term4536.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4535, term4535.getClass(), "intVal", term4536);
        setIntField(term4535, term4535.getClass(), "scale", 53);
        setIntField(term4535, term4535.getClass(), "precision", 0);
        setField(term4535, term4535.getClass(), "stringCache", null);
        setLongField(term4535, term4535.getClass(), "intCompact", -9223372036854775808L);
        setField(term4508, term4508.getClass(), "quantity", term4535);
        setIntField(term4553, term4553.getClass(), "signum", 1);
        setIntElement(term4555, 0, 186);
        setIntElement(term4555, 1, -904763891);
        setIntElement(term4555, 2, 1070176067);
        setIntElement(term4555, 3, 1699334566);
        setIntElement(term4555, 4, 706694897);
        setIntElement(term4555, 5, -870914817);
        setField(term4553, term4553.getClass(), "mag", term4555);
        setIntField(term4553, term4553.getClass(), "bitCountPlusOne", 0);
        setIntField(term4553, term4553.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4553, term4553.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4553, term4553.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4552, term4552.getClass(), "intVal", term4553);
        setIntField(term4552, term4552.getClass(), "scale", 53);
        setIntField(term4552, term4552.getClass(), "precision", 0);
        setField(term4552, term4552.getClass(), "stringCache", null);
        setLongField(term4552, term4552.getClass(), "intCompact", -9223372036854775808L);
        setField(term4508, term4508.getClass(), "priceDifference", term4552);
        setLongField(term4508, term4508.getClass(), "timeDifference", -6573104506744284592L);
        setField(term4508, term4508.getClass(), "aggregatedTrade", term4570);
        setLongField(term4574, term4574.getClass(), "fastTime", 1744090065937L);
        setField(term4574, term4574.getClass(), "cdate", null);
        setField(term4508, term4508.getClass(), "sellTime", term4574);
        term4576 = new Long(-4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4576;
        callMethod(klass, "setTimeDifference", argTypes, term4508, args);
    }

};


