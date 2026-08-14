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

public class Profit_setSellTime_26231810816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5118;
     Object term5187;

    public Profit_setSellTime_26231810816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5119 = new Long(-5892135042702373494L);
        Class<? extends Object> term5190 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term5189 = ((Class) term5190).getDeclaredField((String) "USDT");
        ((Field) term5189).setAccessible(true);
        Object enum16 = ((Field) term5189).get((Object) null);
        ArrayList term5181 = new ArrayList();
        term5118 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term5129 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5130 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5132 = (int[]) newIntArray(6);
        Object term5146 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5147 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5149 = (int[]) newIntArray(6);
        Object term5163 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5164 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5166 = (int[]) newIntArray(6);
        Object term5185 = newInstance(Class.forName("java.util.Date"));
        setField(term5118, term5118.getClass(), "id", term5119);
        setField(term5118, term5118.getClass(), "baseCurrency", enum16);
        setIntField(term5130, term5130.getClass(), "signum", 1);
        setIntElement(term5132, 0, 22057);
        setIntElement(term5132, 1, -716778402);
        setIntElement(term5132, 2, 987820395);
        setIntElement(term5132, 3, 841089094);
        setIntElement(term5132, 4, 1231499164);
        setIntElement(term5132, 5, -164218385);
        setField(term5130, term5130.getClass(), "mag", term5132);
        setIntField(term5130, term5130.getClass(), "bitCountPlusOne", 0);
        setIntField(term5130, term5130.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5130, term5130.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5130, term5130.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5129, term5129.getClass(), "intVal", term5130);
        setIntField(term5129, term5129.getClass(), "scale", 53);
        setIntField(term5129, term5129.getClass(), "precision", 0);
        setField(term5129, term5129.getClass(), "stringCache", null);
        setLongField(term5129, term5129.getClass(), "intCompact", -9223372036854775808L);
        setField(term5118, term5118.getClass(), "profitValue", term5129);
        setIntField(term5147, term5147.getClass(), "signum", 1);
        setIntElement(term5149, 0, 36328);
        setIntElement(term5149, 1, -1170174767);
        setIntElement(term5149, 2, 655972142);
        setIntElement(term5149, 3, 462471887);
        setIntElement(term5149, 4, 119631125);
        setIntElement(term5149, 5, 1339467919);
        setField(term5147, term5147.getClass(), "mag", term5149);
        setIntField(term5147, term5147.getClass(), "bitCountPlusOne", 0);
        setIntField(term5147, term5147.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5147, term5147.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5147, term5147.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5146, term5146.getClass(), "intVal", term5147);
        setIntField(term5146, term5146.getClass(), "scale", 53);
        setIntField(term5146, term5146.getClass(), "precision", 0);
        setField(term5146, term5146.getClass(), "stringCache", null);
        setLongField(term5146, term5146.getClass(), "intCompact", -9223372036854775808L);
        setField(term5118, term5118.getClass(), "quantity", term5146);
        setIntField(term5164, term5164.getClass(), "signum", 1);
        setIntElement(term5166, 0, 10019);
        setIntElement(term5166, 1, 1068910244);
        setIntElement(term5166, 2, -144922776);
        setIntElement(term5166, 3, 1698242623);
        setIntElement(term5166, 4, -217106671);
        setIntElement(term5166, 5, 25951329);
        setField(term5164, term5164.getClass(), "mag", term5166);
        setIntField(term5164, term5164.getClass(), "bitCountPlusOne", 0);
        setIntField(term5164, term5164.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5164, term5164.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5164, term5164.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5163, term5163.getClass(), "intVal", term5164);
        setIntField(term5163, term5163.getClass(), "scale", 53);
        setIntField(term5163, term5163.getClass(), "precision", 0);
        setField(term5163, term5163.getClass(), "stringCache", null);
        setLongField(term5163, term5163.getClass(), "intCompact", -9223372036854775808L);
        setField(term5118, term5118.getClass(), "priceDifference", term5163);
        setLongField(term5118, term5118.getClass(), "timeDifference", -2585684163342970173L);
        setField(term5118, term5118.getClass(), "aggregatedTrade", term5181);
        setLongField(term5185, term5185.getClass(), "fastTime", 1502158153899L);
        setField(term5185, term5185.getClass(), "cdate", null);
        setField(term5118, term5118.getClass(), "sellTime", term5185);
        term5187 = newInstance(Class.forName("java.util.Date"));
        setLongField(term5187, term5187.getClass(), "fastTime", 1630952644759L);
        setField(term5187, term5187.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term5187;
        callMethod(klass, "setSellTime", argTypes, term5118, args);
    }

};


