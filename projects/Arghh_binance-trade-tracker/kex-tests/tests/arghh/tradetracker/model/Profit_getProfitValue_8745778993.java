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

public class Profit_getProfitValue_8745778993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;

    public Profit_getProfitValue_8745778993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term637 = new Long(-8400487765614892086L);
        Class<? extends Object> term705 = Class.forName((String) "arghh.tradetracker.services.BaseCurrency");
        Field term704 = ((Class) term705).getDeclaredField((String) "ETH");
        ((Field) term704).setAccessible(true);
        Object enum2 = ((Field) term704).get((Object) null);
        ArrayList term698 = new ArrayList();
        term636 = newInstance(Class.forName("arghh.tradetracker.model.Profit"));
        Object term646 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term647 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term649 = (int[]) newIntArray(6);
        Object term663 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term664 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term666 = (int[]) newIntArray(6);
        Object term680 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term681 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term683 = (int[]) newIntArray(6);
        Object term702 = newInstance(Class.forName("java.util.Date"));
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "baseCurrency", enum2);
        setIntField(term647, term647.getClass(), "signum", 1);
        setIntElement(term649, 0, 1807);
        setIntElement(term649, 1, 1210968587);
        setIntElement(term649, 2, -857410878);
        setIntElement(term649, 3, 520383771);
        setIntElement(term649, 4, 2106706510);
        setIntElement(term649, 5, 1731185477);
        setField(term647, term647.getClass(), "mag", term649);
        setIntField(term647, term647.getClass(), "bitCountPlusOne", 0);
        setIntField(term647, term647.getClass(), "bitLengthPlusOne", 0);
        setIntField(term647, term647.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term647, term647.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term646, term646.getClass(), "intVal", term647);
        setIntField(term646, term646.getClass(), "scale", 52);
        setIntField(term646, term646.getClass(), "precision", 0);
        setField(term646, term646.getClass(), "stringCache", null);
        setLongField(term646, term646.getClass(), "intCompact", -9223372036854775808L);
        setField(term636, term636.getClass(), "profitValue", term646);
        setIntField(term664, term664.getClass(), "signum", 1);
        setIntElement(term666, 0, 25264);
        setIntElement(term666, 1, 13306318);
        setIntElement(term666, 2, 145344007);
        setIntElement(term666, 3, -1015263393);
        setIntElement(term666, 4, -1366378930);
        setIntElement(term666, 5, 983206517);
        setField(term664, term664.getClass(), "mag", term666);
        setIntField(term664, term664.getClass(), "bitCountPlusOne", 0);
        setIntField(term664, term664.getClass(), "bitLengthPlusOne", 0);
        setIntField(term664, term664.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term664, term664.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term663, term663.getClass(), "intVal", term664);
        setIntField(term663, term663.getClass(), "scale", 53);
        setIntField(term663, term663.getClass(), "precision", 0);
        setField(term663, term663.getClass(), "stringCache", null);
        setLongField(term663, term663.getClass(), "intCompact", -9223372036854775808L);
        setField(term636, term636.getClass(), "quantity", term663);
        setIntField(term681, term681.getClass(), "signum", 1);
        setIntElement(term683, 0, 4157);
        setIntElement(term683, 1, -1258399411);
        setIntElement(term683, 2, -1445096589);
        setIntElement(term683, 3, 1602721280);
        setIntElement(term683, 4, 1738795194);
        setIntElement(term683, 5, -481877419);
        setField(term681, term681.getClass(), "mag", term683);
        setIntField(term681, term681.getClass(), "bitCountPlusOne", 0);
        setIntField(term681, term681.getClass(), "bitLengthPlusOne", 0);
        setIntField(term681, term681.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term681, term681.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term680, term680.getClass(), "intVal", term681);
        setIntField(term680, term680.getClass(), "scale", 52);
        setIntField(term680, term680.getClass(), "precision", 0);
        setField(term680, term680.getClass(), "stringCache", null);
        setLongField(term680, term680.getClass(), "intCompact", -9223372036854775808L);
        setField(term636, term636.getClass(), "priceDifference", term680);
        setLongField(term636, term636.getClass(), "timeDifference", -8257434502486459194L);
        setField(term636, term636.getClass(), "aggregatedTrade", term698);
        setLongField(term702, term702.getClass(), "fastTime", 1610940182830L);
        setField(term702, term702.getClass(), "cdate", null);
        setField(term636, term636.getClass(), "sellTime", term702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("arghh.tradetracker.model.Profit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProfitValue", argTypes, term636, args);
    }

};


