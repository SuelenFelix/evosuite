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

public class P2PRequest_getTaxAccount_12125831017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1714;

    public P2PRequest_getTaxAccount_12125831017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1714 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term1775 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1776 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1778 = (int[]) newIntArray(6);
        Object term1792 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1793 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1795 = (int[]) newIntArray(6);
        Object term1809 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1810 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1812 = (int[]) newIntArray(6);
        setField(term1714, term1714.getClass(), "currency", "nGKItKLYNC");
        setField(term1714, term1714.getClass(), "fromCustomerAccount", "UiUYnPrcCi");
        setField(term1714, term1714.getClass(), "toCustomerAccount", "UoYtihxVaS");
        setField(term1714, term1714.getClass(), "feeAccount", "JDswTTCZHV");
        setField(term1714, term1714.getClass(), "taxAccount", "onpbIeEKoi");
        setIntField(term1776, term1776.getClass(), "signum", 1);
        setIntElement(term1778, 0, 3996);
        setIntElement(term1778, 1, 1627046923);
        setIntElement(term1778, 2, -1280614629);
        setIntElement(term1778, 3, 917260100);
        setIntElement(term1778, 4, -74841886);
        setIntElement(term1778, 5, 597293319);
        setField(term1776, term1776.getClass(), "mag", term1778);
        setIntField(term1776, term1776.getClass(), "bitCountPlusOne", 0);
        setIntField(term1776, term1776.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1776, term1776.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1776, term1776.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1775, term1775.getClass(), "intVal", term1776);
        setIntField(term1775, term1775.getClass(), "scale", 52);
        setIntField(term1775, term1775.getClass(), "precision", 0);
        setField(term1775, term1775.getClass(), "stringCache", null);
        setLongField(term1775, term1775.getClass(), "intCompact", -9223372036854775808L);
        setField(term1714, term1714.getClass(), "amount", term1775);
        setIntField(term1793, term1793.getClass(), "signum", 1);
        setIntElement(term1795, 0, 51722);
        setIntElement(term1795, 1, 1822015379);
        setIntElement(term1795, 2, 1030733959);
        setIntElement(term1795, 3, 1299891196);
        setIntElement(term1795, 4, 1679751767);
        setIntElement(term1795, 5, -572989409);
        setField(term1793, term1793.getClass(), "mag", term1795);
        setIntField(term1793, term1793.getClass(), "bitCountPlusOne", 0);
        setIntField(term1793, term1793.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1793, term1793.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1793, term1793.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1792, term1792.getClass(), "intVal", term1793);
        setIntField(term1792, term1792.getClass(), "scale", 53);
        setIntField(term1792, term1792.getClass(), "precision", 0);
        setField(term1792, term1792.getClass(), "stringCache", null);
        setLongField(term1792, term1792.getClass(), "intCompact", -9223372036854775808L);
        setField(term1714, term1714.getClass(), "fee", term1792);
        setIntField(term1810, term1810.getClass(), "signum", 1);
        setIntElement(term1812, 0, 7298);
        setIntElement(term1812, 1, -1245459431);
        setIntElement(term1812, 2, 154872706);
        setIntElement(term1812, 3, -869635639);
        setIntElement(term1812, 4, 1023248111);
        setIntElement(term1812, 5, 1345698053);
        setField(term1810, term1810.getClass(), "mag", term1812);
        setIntField(term1810, term1810.getClass(), "bitCountPlusOne", 0);
        setIntField(term1810, term1810.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1810, term1810.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1810, term1810.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1809, term1809.getClass(), "intVal", term1810);
        setIntField(term1809, term1809.getClass(), "scale", 53);
        setIntField(term1809, term1809.getClass(), "precision", 0);
        setField(term1809, term1809.getClass(), "stringCache", null);
        setLongField(term1809, term1809.getClass(), "intCompact", -9223372036854775808L);
        setField(term1714, term1714.getClass(), "tax", term1809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaxAccount", argTypes, term1714, args);
    }

};


