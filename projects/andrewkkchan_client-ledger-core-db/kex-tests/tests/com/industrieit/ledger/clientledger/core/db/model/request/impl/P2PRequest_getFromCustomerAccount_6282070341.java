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

public class P2PRequest_getFromCustomerAccount_6282070341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634;

    public P2PRequest_getFromCustomerAccount_6282070341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term695 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term696 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term698 = (int[]) newIntArray(6);
        Object term712 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term713 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term715 = (int[]) newIntArray(6);
        Object term729 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term730 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term732 = (int[]) newIntArray(6);
        setField(term634, term634.getClass(), "currency", "hNxWaHcfhY");
        setField(term634, term634.getClass(), "fromCustomerAccount", "RkybSrpybU");
        setField(term634, term634.getClass(), "toCustomerAccount", "xOEqzGAmDU");
        setField(term634, term634.getClass(), "feeAccount", "eZFUvlxvGV");
        setField(term634, term634.getClass(), "taxAccount", "BYqFIqCKAV");
        setIntField(term696, term696.getClass(), "signum", 1);
        setIntElement(term698, 0, 4157);
        setIntElement(term698, 1, -1258399411);
        setIntElement(term698, 2, -1445096589);
        setIntElement(term698, 3, 1602721280);
        setIntElement(term698, 4, 1738795194);
        setIntElement(term698, 5, -481877419);
        setField(term696, term696.getClass(), "mag", term698);
        setIntField(term696, term696.getClass(), "bitCountPlusOne", 0);
        setIntField(term696, term696.getClass(), "bitLengthPlusOne", 0);
        setIntField(term696, term696.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term696, term696.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term695, term695.getClass(), "intVal", term696);
        setIntField(term695, term695.getClass(), "scale", 52);
        setIntField(term695, term695.getClass(), "precision", 0);
        setField(term695, term695.getClass(), "stringCache", null);
        setLongField(term695, term695.getClass(), "intCompact", -9223372036854775808L);
        setField(term634, term634.getClass(), "amount", term695);
        setIntField(term713, term713.getClass(), "signum", 1);
        setIntElement(term715, 0, 2584);
        setIntElement(term715, 1, -1946484122);
        setIntElement(term715, 2, 1992026795);
        setIntElement(term715, 3, 1045205752);
        setIntElement(term715, 4, 613377469);
        setIntElement(term715, 5, -1848020175);
        setField(term713, term713.getClass(), "mag", term715);
        setIntField(term713, term713.getClass(), "bitCountPlusOne", 0);
        setIntField(term713, term713.getClass(), "bitLengthPlusOne", 0);
        setIntField(term713, term713.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term713, term713.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term712, term712.getClass(), "intVal", term713);
        setIntField(term712, term712.getClass(), "scale", 52);
        setIntField(term712, term712.getClass(), "precision", 0);
        setField(term712, term712.getClass(), "stringCache", null);
        setLongField(term712, term712.getClass(), "intCompact", -9223372036854775808L);
        setField(term634, term634.getClass(), "fee", term712);
        setIntField(term730, term730.getClass(), "signum", 1);
        setIntElement(term732, 0, 579);
        setIntElement(term732, 1, -560540333);
        setIntElement(term732, 2, 1014435409);
        setIntElement(term732, 3, -1248929007);
        setIntElement(term732, 4, -42206956);
        setIntElement(term732, 5, 1817231305);
        setField(term730, term730.getClass(), "mag", term732);
        setIntField(term730, term730.getClass(), "bitCountPlusOne", 0);
        setIntField(term730, term730.getClass(), "bitLengthPlusOne", 0);
        setIntField(term730, term730.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term730, term730.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term729, term729.getClass(), "intVal", term730);
        setIntField(term729, term729.getClass(), "scale", 51);
        setIntField(term729, term729.getClass(), "precision", 0);
        setField(term729, term729.getClass(), "stringCache", null);
        setLongField(term729, term729.getClass(), "intCompact", -9223372036854775808L);
        setField(term634, term634.getClass(), "tax", term729);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromCustomerAccount", argTypes, term634, args);
    }

};


