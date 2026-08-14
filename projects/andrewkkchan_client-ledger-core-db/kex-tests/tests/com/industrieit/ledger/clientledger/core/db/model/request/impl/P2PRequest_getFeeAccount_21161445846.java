package com.industrieit.ledger.clientledger.core.db.model.request.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.request.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class P2PRequest_getFeeAccount_21161445846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1534;

    public P2PRequest_getFeeAccount_21161445846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1534 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term1595 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1596 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1598 = (int[]) newIntArray(6);
        Object term1612 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1613 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1615 = (int[]) newIntArray(6);
        Object term1629 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1630 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1632 = (int[]) newIntArray(6);
        setField(term1534, term1534.getClass(), "currency", "GzFkzHGYFt");
        setField(term1534, term1534.getClass(), "fromCustomerAccount", "tShwQLRGNe");
        setField(term1534, term1534.getClass(), "toCustomerAccount", "LvtrsXUliU");
        setField(term1534, term1534.getClass(), "feeAccount", "xLbjWUgOIL");
        setField(term1534, term1534.getClass(), "taxAccount", "jDtqGUpnZN");
        setIntField(term1596, term1596.getClass(), "signum", 1);
        setIntElement(term1598, 0, 5222);
        setIntElement(term1598, 1, -454284340);
        setIntElement(term1598, 2, -1412298361);
        setIntElement(term1598, 3, -225970664);
        setIntElement(term1598, 4, -1354448185);
        setIntElement(term1598, 5, -1168679607);
        setField(term1596, term1596.getClass(), "mag", term1598);
        setIntField(term1596, term1596.getClass(), "bitCountPlusOne", 0);
        setIntField(term1596, term1596.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1596, term1596.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1596, term1596.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1595, term1595.getClass(), "intVal", term1596);
        setIntField(term1595, term1595.getClass(), "scale", 52);
        setIntField(term1595, term1595.getClass(), "precision", 0);
        setField(term1595, term1595.getClass(), "stringCache", null);
        setLongField(term1595, term1595.getClass(), "intCompact", -9223372036854775808L);
        setField(term1534, term1534.getClass(), "amount", term1595);
        setIntField(term1613, term1613.getClass(), "signum", 1);
        setIntElement(term1615, 0, 92);
        setIntElement(term1615, 1, 1034738575);
        setIntElement(term1615, 2, -1456630577);
        setIntElement(term1615, 3, -1449292938);
        setIntElement(term1615, 4, -1319116780);
        setIntElement(term1615, 5, 1851590535);
        setField(term1613, term1613.getClass(), "mag", term1615);
        setIntField(term1613, term1613.getClass(), "bitCountPlusOne", 0);
        setIntField(term1613, term1613.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1613, term1613.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1613, term1613.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1612, term1612.getClass(), "intVal", term1613);
        setIntField(term1612, term1612.getClass(), "scale", 51);
        setIntField(term1612, term1612.getClass(), "precision", 0);
        setField(term1612, term1612.getClass(), "stringCache", null);
        setLongField(term1612, term1612.getClass(), "intCompact", -9223372036854775808L);
        setField(term1534, term1534.getClass(), "fee", term1612);
        setIntField(term1630, term1630.getClass(), "signum", 1);
        setIntElement(term1632, 0, 26001);
        setIntElement(term1632, 1, 1123266030);
        setIntElement(term1632, 2, 1277036849);
        setIntElement(term1632, 3, 2128028609);
        setIntElement(term1632, 4, -171954480);
        setIntElement(term1632, 5, -1359520521);
        setField(term1630, term1630.getClass(), "mag", term1632);
        setIntField(term1630, term1630.getClass(), "bitCountPlusOne", 0);
        setIntField(term1630, term1630.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1630, term1630.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1630, term1630.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1629, term1629.getClass(), "intVal", term1630);
        setIntField(term1629, term1629.getClass(), "scale", 53);
        setIntField(term1629, term1629.getClass(), "precision", 0);
        setField(term1629, term1629.getClass(), "stringCache", null);
        setLongField(term1629, term1629.getClass(), "intCompact", -9223372036854775808L);
        setField(term1534, term1534.getClass(), "tax", term1629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeeAccount", argTypes, term1534, args);
    }

};


