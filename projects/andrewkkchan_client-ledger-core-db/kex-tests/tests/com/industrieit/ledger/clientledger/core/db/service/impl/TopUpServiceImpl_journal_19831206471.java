package com.industrieit.ledger.clientledger.core.db.service.impl;

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
import static com.industrieit.ledger.clientledger.core.db.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class TopUpServiceImpl_journal_19831206471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;
     Object term68;
     Object term70;

    public TopUpServiceImpl_journal_19831206471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.TopUpServiceImpl"));
        setField(term1, term1.getClass(), "validator", null);
        setField(term1, term1.getClass(), "committer", null);
        term14 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term51 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term52 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term54 = (int[]) newIntArray(6);
        setField(term14, term14.getClass(), "currency", "sjlJAEtRrb");
        setField(term14, term14.getClass(), "topUpAccount", "MuLcgQHgqz");
        setField(term14, term14.getClass(), "settlementAccount", "xxtlPwDYFs");
        setIntField(term52, term52.getClass(), "signum", 1);
        setIntElement(term54, 0, 9058);
        setIntElement(term54, 1, 1365043541);
        setIntElement(term54, 2, 1239861896);
        setIntElement(term54, 3, -1338148297);
        setIntElement(term54, 4, -418263970);
        setIntElement(term54, 5, -265097411);
        setField(term52, term52.getClass(), "mag", term54);
        setIntField(term52, term52.getClass(), "bitCountPlusOne", 0);
        setIntField(term52, term52.getClass(), "bitLengthPlusOne", 0);
        setIntField(term52, term52.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term52, term52.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term51, term51.getClass(), "intVal", term52);
        setIntField(term51, term51.getClass(), "scale", 53);
        setIntField(term51, term51.getClass(), "precision", 0);
        setField(term51, term51.getClass(), "stringCache", null);
        setLongField(term51, term51.getClass(), "intCompact", -9223372036854775808L);
        setField(term14, term14.getClass(), "amount", term51);
        term68 = new Long(2442117782898005296L);
        term70 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.TopUpServiceImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = term14;
        args[2] = term68;
        args[3] = term70;
        callMethod(klass, "journal", argTypes, term1, args);
    }

};


