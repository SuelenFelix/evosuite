package com.industrieit.ledger.clientledger.core.db.model.ledger.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.ledger.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class TopUpItemizable_getRequestId_18256680742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2383;

    public TopUpItemizable_getRequestId_18256680742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2453 = new Long(0L);
        Integer term2455 = new Integer(0);
        Long term2526 = new Long(0L);
        Integer term2528 = new Integer(0);
        term2383 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable"));
        Object term2384 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2397 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2436 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2437 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2439 = (int[]) newIntArray(6);
        Object term2457 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2470 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2509 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2510 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2512 = (int[]) newIntArray(6);
        Object term2530 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2531 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2533 = (int[]) newIntArray(6);
        setField(term2384, term2384.getClass(), "id", "HqBOwkVqjD");
        setIntField(term2397, term2397.getClass(), "nanos", 364000000);
        setLongField(term2397, term2397.getClass(), "fastTime", 1882628084000L);
        setField(term2397, term2397.getClass(), "cdate", null);
        setField(term2384, term2384.getClass(), "createTime", term2397);
        setField(term2384, term2384.getClass(), "currency", "MAcUBcBckh");
        setField(term2384, term2384.getClass(), "accountName", "oVgzLbrsFr");
        setField(term2384, term2384.getClass(), "accountGroup", "vQVyKLdtaz");
        setIntField(term2437, term2437.getClass(), "signum", 1);
        setIntElement(term2439, 0, 51722);
        setIntElement(term2439, 1, 1822015379);
        setIntElement(term2439, 2, 1030733959);
        setIntElement(term2439, 3, 1299891196);
        setIntElement(term2439, 4, 1679751767);
        setIntElement(term2439, 5, -572989409);
        setField(term2437, term2437.getClass(), "mag", term2439);
        setIntField(term2437, term2437.getClass(), "bitCountPlusOne", 0);
        setIntField(term2437, term2437.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2437, term2437.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2437, term2437.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2436, term2436.getClass(), "intVal", term2437);
        setIntField(term2436, term2436.getClass(), "scale", 53);
        setIntField(term2436, term2436.getClass(), "precision", 0);
        setField(term2436, term2436.getClass(), "stringCache", null);
        setLongField(term2436, term2436.getClass(), "intCompact", -9223372036854775808L);
        setField(term2384, term2384.getClass(), "balance", term2436);
        setField(term2384, term2384.getClass(), "kafkaOffset", term2453);
        setField(term2384, term2384.getClass(), "kafkaPartition", term2455);
        setField(term2383, term2383.getClass(), "topUp", term2384);
        setField(term2457, term2457.getClass(), "id", "OWKQODBLzb");
        setIntField(term2470, term2470.getClass(), "nanos", 580000000);
        setLongField(term2470, term2470.getClass(), "fastTime", 1437746523000L);
        setField(term2470, term2470.getClass(), "cdate", null);
        setField(term2457, term2457.getClass(), "createTime", term2470);
        setField(term2457, term2457.getClass(), "currency", "wGmYcqUkgE");
        setField(term2457, term2457.getClass(), "accountName", "idgaQsnJpQ");
        setField(term2457, term2457.getClass(), "accountGroup", "VgZnGoIFwQ");
        setIntField(term2510, term2510.getClass(), "signum", 1);
        setIntElement(term2512, 0, 7298);
        setIntElement(term2512, 1, -1245459431);
        setIntElement(term2512, 2, 154872706);
        setIntElement(term2512, 3, -869635639);
        setIntElement(term2512, 4, 1023248111);
        setIntElement(term2512, 5, 1345698053);
        setField(term2510, term2510.getClass(), "mag", term2512);
        setIntField(term2510, term2510.getClass(), "bitCountPlusOne", 0);
        setIntField(term2510, term2510.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2510, term2510.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2510, term2510.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2509, term2509.getClass(), "intVal", term2510);
        setIntField(term2509, term2509.getClass(), "scale", 53);
        setIntField(term2509, term2509.getClass(), "precision", 0);
        setField(term2509, term2509.getClass(), "stringCache", null);
        setLongField(term2509, term2509.getClass(), "intCompact", -9223372036854775808L);
        setField(term2457, term2457.getClass(), "balance", term2509);
        setField(term2457, term2457.getClass(), "kafkaOffset", term2526);
        setField(term2457, term2457.getClass(), "kafkaPartition", term2528);
        setField(term2383, term2383.getClass(), "settlement", term2457);
        setIntField(term2531, term2531.getClass(), "signum", 1);
        setIntElement(term2533, 0, 786);
        setIntElement(term2533, 1, 1645098337);
        setIntElement(term2533, 2, -1661047007);
        setIntElement(term2533, 3, 638909622);
        setIntElement(term2533, 4, 5733837);
        setIntElement(term2533, 5, 1325345559);
        setField(term2531, term2531.getClass(), "mag", term2533);
        setIntField(term2531, term2531.getClass(), "bitCountPlusOne", 0);
        setIntField(term2531, term2531.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2531, term2531.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2531, term2531.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2530, term2530.getClass(), "intVal", term2531);
        setIntField(term2530, term2530.getClass(), "scale", 52);
        setIntField(term2530, term2530.getClass(), "precision", 0);
        setField(term2530, term2530.getClass(), "stringCache", null);
        setLongField(term2530, term2530.getClass(), "intCompact", -9223372036854775808L);
        setField(term2383, term2383.getClass(), "amount", term2530);
        setField(term2383, term2383.getClass(), "currency", "jUbSRrkrYZ");
        setField(term2383, term2383.getClass(), "requestId", "bWWfajKbEX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestId", argTypes, term2383, args);
    }

};


