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

public class TopUpItemizable_itemize_11377921761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2077;

    public TopUpItemizable_itemize_11377921761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2147 = new Long(0L);
        Integer term2149 = new Integer(0);
        Long term2220 = new Long(0L);
        Integer term2222 = new Integer(0);
        term2077 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable"));
        Object term2078 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2091 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2130 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2131 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2133 = (int[]) newIntArray(6);
        Object term2151 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2164 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2203 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2204 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2206 = (int[]) newIntArray(6);
        Object term2224 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2225 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2227 = (int[]) newIntArray(6);
        setField(term2078, term2078.getClass(), "id", "fhkbdRViHi");
        setIntField(term2091, term2091.getClass(), "nanos", 457000000);
        setLongField(term2091, term2091.getClass(), "fastTime", 1706067372000L);
        setField(term2091, term2091.getClass(), "cdate", null);
        setField(term2078, term2078.getClass(), "createTime", term2091);
        setField(term2078, term2078.getClass(), "currency", "uWHnvSvaPl");
        setField(term2078, term2078.getClass(), "accountName", "kBdSllIBVz");
        setField(term2078, term2078.getClass(), "accountGroup", "TJmVBGfTML");
        setIntField(term2131, term2131.getClass(), "signum", 1);
        setIntElement(term2133, 0, 92);
        setIntElement(term2133, 1, 1034738575);
        setIntElement(term2133, 2, -1456630577);
        setIntElement(term2133, 3, -1449292938);
        setIntElement(term2133, 4, -1319116780);
        setIntElement(term2133, 5, 1851590535);
        setField(term2131, term2131.getClass(), "mag", term2133);
        setIntField(term2131, term2131.getClass(), "bitCountPlusOne", 0);
        setIntField(term2131, term2131.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2131, term2131.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2131, term2131.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2130, term2130.getClass(), "intVal", term2131);
        setIntField(term2130, term2130.getClass(), "scale", 51);
        setIntField(term2130, term2130.getClass(), "precision", 0);
        setField(term2130, term2130.getClass(), "stringCache", null);
        setLongField(term2130, term2130.getClass(), "intCompact", -9223372036854775808L);
        setField(term2078, term2078.getClass(), "balance", term2130);
        setField(term2078, term2078.getClass(), "kafkaOffset", term2147);
        setField(term2078, term2078.getClass(), "kafkaPartition", term2149);
        setField(term2077, term2077.getClass(), "topUp", term2078);
        setField(term2151, term2151.getClass(), "id", "tPlsykYBqO");
        setIntField(term2164, term2164.getClass(), "nanos", 992000000);
        setLongField(term2164, term2164.getClass(), "fastTime", 1863620294000L);
        setField(term2164, term2164.getClass(), "cdate", null);
        setField(term2151, term2151.getClass(), "createTime", term2164);
        setField(term2151, term2151.getClass(), "currency", "bLPjGVBhlX");
        setField(term2151, term2151.getClass(), "accountName", "whBvTVIIlC");
        setField(term2151, term2151.getClass(), "accountGroup", "IgRJUzaCwW");
        setIntField(term2204, term2204.getClass(), "signum", 1);
        setIntElement(term2206, 0, 26001);
        setIntElement(term2206, 1, 1123266030);
        setIntElement(term2206, 2, 1277036849);
        setIntElement(term2206, 3, 2128028609);
        setIntElement(term2206, 4, -171954480);
        setIntElement(term2206, 5, -1359520521);
        setField(term2204, term2204.getClass(), "mag", term2206);
        setIntField(term2204, term2204.getClass(), "bitCountPlusOne", 0);
        setIntField(term2204, term2204.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2204, term2204.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2204, term2204.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2203, term2203.getClass(), "intVal", term2204);
        setIntField(term2203, term2203.getClass(), "scale", 53);
        setIntField(term2203, term2203.getClass(), "precision", 0);
        setField(term2203, term2203.getClass(), "stringCache", null);
        setLongField(term2203, term2203.getClass(), "intCompact", -9223372036854775808L);
        setField(term2151, term2151.getClass(), "balance", term2203);
        setField(term2151, term2151.getClass(), "kafkaOffset", term2220);
        setField(term2151, term2151.getClass(), "kafkaPartition", term2222);
        setField(term2077, term2077.getClass(), "settlement", term2151);
        setIntField(term2225, term2225.getClass(), "signum", 1);
        setIntElement(term2227, 0, 3996);
        setIntElement(term2227, 1, 1627046923);
        setIntElement(term2227, 2, -1280614629);
        setIntElement(term2227, 3, 917260100);
        setIntElement(term2227, 4, -74841886);
        setIntElement(term2227, 5, 597293319);
        setField(term2225, term2225.getClass(), "mag", term2227);
        setIntField(term2225, term2225.getClass(), "bitCountPlusOne", 0);
        setIntField(term2225, term2225.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2225, term2225.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2225, term2225.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2224, term2224.getClass(), "intVal", term2225);
        setIntField(term2224, term2224.getClass(), "scale", 52);
        setIntField(term2224, term2224.getClass(), "precision", 0);
        setField(term2224, term2224.getClass(), "stringCache", null);
        setLongField(term2224, term2224.getClass(), "intCompact", -9223372036854775808L);
        setField(term2077, term2077.getClass(), "amount", term2224);
        setField(term2077, term2077.getClass(), "currency", "JUmudUmaaV");
        setField(term2077, term2077.getClass(), "requestId", "KoyGrUJeJW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "itemize", argTypes, term2077, args);
    }

};


