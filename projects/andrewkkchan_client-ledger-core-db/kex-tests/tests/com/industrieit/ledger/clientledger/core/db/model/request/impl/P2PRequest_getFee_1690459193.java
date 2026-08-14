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

public class P2PRequest_getFee_1690459193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term994;

    public P2PRequest_getFee_1690459193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term994 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term1055 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1056 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1058 = (int[]) newIntArray(6);
        Object term1072 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1073 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1075 = (int[]) newIntArray(6);
        Object term1089 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1090 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1092 = (int[]) newIntArray(6);
        setField(term994, term994.getClass(), "currency", "OWDIEULEFu");
        setField(term994, term994.getClass(), "fromCustomerAccount", "dWRymuLBtr");
        setField(term994, term994.getClass(), "toCustomerAccount", "AijpHYOFuy");
        setField(term994, term994.getClass(), "feeAccount", "SbAoxhfrkn");
        setField(term994, term994.getClass(), "taxAccount", "kuTXqwMtDB");
        setIntField(term1056, term1056.getClass(), "signum", 1);
        setIntElement(term1058, 0, 48108);
        setIntElement(term1058, 1, 419671270);
        setIntElement(term1058, 2, 909082732);
        setIntElement(term1058, 3, 2078883588);
        setIntElement(term1058, 4, 1670017529);
        setIntElement(term1058, 5, -2116499193);
        setField(term1056, term1056.getClass(), "mag", term1058);
        setIntField(term1056, term1056.getClass(), "bitCountPlusOne", 0);
        setIntField(term1056, term1056.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1056, term1056.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1056, term1056.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1055, term1055.getClass(), "intVal", term1056);
        setIntField(term1055, term1055.getClass(), "scale", 53);
        setIntField(term1055, term1055.getClass(), "precision", 0);
        setField(term1055, term1055.getClass(), "stringCache", null);
        setLongField(term1055, term1055.getClass(), "intCompact", -9223372036854775808L);
        setField(term994, term994.getClass(), "amount", term1055);
        setIntField(term1073, term1073.getClass(), "signum", 1);
        setIntElement(term1075, 0, 65188);
        setIntElement(term1075, 1, 1319681440);
        setIntElement(term1075, 2, -739534113);
        setIntElement(term1075, 3, -1337808284);
        setIntElement(term1075, 4, 786647436);
        setIntElement(term1075, 5, -1827169985);
        setField(term1073, term1073.getClass(), "mag", term1075);
        setIntField(term1073, term1073.getClass(), "bitCountPlusOne", 0);
        setIntField(term1073, term1073.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1073, term1073.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1073, term1073.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1072, term1072.getClass(), "intVal", term1073);
        setIntField(term1072, term1072.getClass(), "scale", 53);
        setIntField(term1072, term1072.getClass(), "precision", 0);
        setField(term1072, term1072.getClass(), "stringCache", null);
        setLongField(term1072, term1072.getClass(), "intCompact", -9223372036854775808L);
        setField(term994, term994.getClass(), "fee", term1072);
        setIntField(term1090, term1090.getClass(), "signum", 1);
        setIntElement(term1092, 0, 6724);
        setIntElement(term1092, 1, -459858691);
        setIntElement(term1092, 2, -950374219);
        setIntElement(term1092, 3, -1430160029);
        setIntElement(term1092, 4, 1532735250);
        setIntElement(term1092, 5, 890914777);
        setField(term1090, term1090.getClass(), "mag", term1092);
        setIntField(term1090, term1090.getClass(), "bitCountPlusOne", 0);
        setIntField(term1090, term1090.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1090, term1090.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1090, term1090.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1089, term1089.getClass(), "intVal", term1090);
        setIntField(term1089, term1089.getClass(), "scale", 52);
        setIntField(term1089, term1089.getClass(), "precision", 0);
        setField(term1089, term1089.getClass(), "stringCache", null);
        setLongField(term1089, term1089.getClass(), "intCompact", -9223372036854775808L);
        setField(term994, term994.getClass(), "tax", term1089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFee", argTypes, term994, args);
    }

};


