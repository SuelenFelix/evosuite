package com.industrieit.ledger.clientledger.core.db.ledger.validator.impl;

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
import static com.industrieit.ledger.clientledger.core.db.ledger.validator.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class P2PValidator_validate_17146487550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public P2PValidator_validate_17146487550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term74 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term75 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term77 = (int[]) newIntArray(6);
        Object term91 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term92 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term94 = (int[]) newIntArray(6);
        Object term108 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term109 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term111 = (int[]) newIntArray(6);
        setField(term13, term13.getClass(), "currency", "sjlJAEtRrb");
        setField(term13, term13.getClass(), "fromCustomerAccount", "MuLcgQHgqz");
        setField(term13, term13.getClass(), "toCustomerAccount", "xxtlPwDYFs");
        setField(term13, term13.getClass(), "feeAccount", "jJCZpVmanW");
        setField(term13, term13.getClass(), "taxAccount", "EGtDIRbSSb");
        setIntField(term75, term75.getClass(), "signum", 1);
        setIntElement(term77, 0, 9058);
        setIntElement(term77, 1, 1365043541);
        setIntElement(term77, 2, 1239861896);
        setIntElement(term77, 3, -1338148297);
        setIntElement(term77, 4, -418263970);
        setIntElement(term77, 5, -265097411);
        setField(term75, term75.getClass(), "mag", term77);
        setIntField(term75, term75.getClass(), "bitCountPlusOne", 0);
        setIntField(term75, term75.getClass(), "bitLengthPlusOne", 0);
        setIntField(term75, term75.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term75, term75.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term74, term74.getClass(), "intVal", term75);
        setIntField(term74, term74.getClass(), "scale", 53);
        setIntField(term74, term74.getClass(), "precision", 0);
        setField(term74, term74.getClass(), "stringCache", null);
        setLongField(term74, term74.getClass(), "intCompact", -9223372036854775808L);
        setField(term13, term13.getClass(), "amount", term74);
        setIntField(term92, term92.getClass(), "signum", 1);
        setIntElement(term94, 0, 2364);
        setIntElement(term94, 1, -1446584625);
        setIntElement(term94, 2, 1957600567);
        setIntElement(term94, 3, -336418707);
        setIntElement(term94, 4, -1905211145);
        setIntElement(term94, 5, 86968353);
        setField(term92, term92.getClass(), "mag", term94);
        setIntField(term92, term92.getClass(), "bitCountPlusOne", 0);
        setIntField(term92, term92.getClass(), "bitLengthPlusOne", 0);
        setIntField(term92, term92.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term92, term92.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term91, term91.getClass(), "intVal", term92);
        setIntField(term91, term91.getClass(), "scale", 52);
        setIntField(term91, term91.getClass(), "precision", 0);
        setField(term91, term91.getClass(), "stringCache", null);
        setLongField(term91, term91.getClass(), "intCompact", -9223372036854775808L);
        setField(term13, term13.getClass(), "fee", term91);
        setIntField(term109, term109.getClass(), "signum", 1);
        setIntElement(term111, 0, 3779);
        setIntElement(term111, 1, 1825499203);
        setIntElement(term111, 2, 189827582);
        setIntElement(term111, 3, 731025545);
        setIntElement(term111, 4, -475097163);
        setIntElement(term111, 5, 890127363);
        setField(term109, term109.getClass(), "mag", term111);
        setIntField(term109, term109.getClass(), "bitCountPlusOne", 0);
        setIntField(term109, term109.getClass(), "bitLengthPlusOne", 0);
        setIntField(term109, term109.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term109, term109.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term108, term108.getClass(), "intVal", term109);
        setIntField(term108, term108.getClass(), "scale", 52);
        setIntField(term108, term108.getClass(), "precision", 0);
        setField(term108, term108.getClass(), "stringCache", null);
        setLongField(term108, term108.getClass(), "intCompact", -9223372036854775808L);
        setField(term13, term13.getClass(), "tax", term108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.ledger.validator.impl.P2PValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


