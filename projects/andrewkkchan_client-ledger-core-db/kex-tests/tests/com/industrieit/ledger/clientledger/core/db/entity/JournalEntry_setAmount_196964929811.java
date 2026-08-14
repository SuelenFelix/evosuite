package com.industrieit.ledger.clientledger.core.db.entity;

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
import static com.industrieit.ledger.clientledger.core.db.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class JournalEntry_setAmount_196964929811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6683;
     Object term6813;

    public JournalEntry_setAmount_196964929811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6777 = new Long(0L);
        Integer term6779 = new Integer(0);
        term6683 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term6708 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term6721 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6760 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6761 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6763 = (int[]) newIntArray(6);
        Object term6793 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6796 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6797 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6799 = (int[]) newIntArray(6);
        setField(term6683, term6683.getClass(), "id", "MHGKyEnwKc");
        setField(term6683, term6683.getClass(), "requestId", "ShIELyuULw");
        setField(term6708, term6708.getClass(), "id", "IpQuOGMgmj");
        setIntField(term6721, term6721.getClass(), "nanos", 295000000);
        setLongField(term6721, term6721.getClass(), "fastTime", 1597341597000L);
        setField(term6721, term6721.getClass(), "cdate", null);
        setField(term6708, term6708.getClass(), "createTime", term6721);
        setField(term6708, term6708.getClass(), "currency", "pJbnHTYrxn");
        setField(term6708, term6708.getClass(), "accountName", "iIRsCSYqXH");
        setField(term6708, term6708.getClass(), "accountGroup", "nghfqDXyCG");
        setIntField(term6761, term6761.getClass(), "signum", 1);
        setIntElement(term6763, 0, 15498);
        setIntElement(term6763, 1, -1390712929);
        setIntElement(term6763, 2, 1617799219);
        setIntElement(term6763, 3, -903553597);
        setIntElement(term6763, 4, -1997977581);
        setIntElement(term6763, 5, -2052139129);
        setField(term6761, term6761.getClass(), "mag", term6763);
        setIntField(term6761, term6761.getClass(), "bitCountPlusOne", 0);
        setIntField(term6761, term6761.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6761, term6761.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6761, term6761.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6760, term6760.getClass(), "intVal", term6761);
        setIntField(term6760, term6760.getClass(), "scale", 53);
        setIntField(term6760, term6760.getClass(), "precision", 0);
        setField(term6760, term6760.getClass(), "stringCache", null);
        setLongField(term6760, term6760.getClass(), "intCompact", -9223372036854775808L);
        setField(term6708, term6708.getClass(), "balance", term6760);
        setField(term6708, term6708.getClass(), "kafkaOffset", term6777);
        setField(term6708, term6708.getClass(), "kafkaPartition", term6779);
        setField(term6683, term6683.getClass(), "account", term6708);
        setField(term6683, term6683.getClass(), "currency", "WBAOTqErtm");
        setIntField(term6793, term6793.getClass(), "nanos", 263000000);
        setLongField(term6793, term6793.getClass(), "fastTime", 1713880355000L);
        setField(term6793, term6793.getClass(), "cdate", null);
        setField(term6683, term6683.getClass(), "createTime", term6793);
        setIntField(term6797, term6797.getClass(), "signum", 1);
        setIntElement(term6799, 0, 6075);
        setIntElement(term6799, 1, 643134713);
        setIntElement(term6799, 2, 1498303159);
        setIntElement(term6799, 3, 2100111685);
        setIntElement(term6799, 4, -716193830);
        setIntElement(term6799, 5, -101865319);
        setField(term6797, term6797.getClass(), "mag", term6799);
        setIntField(term6797, term6797.getClass(), "bitCountPlusOne", 0);
        setIntField(term6797, term6797.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6797, term6797.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6797, term6797.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6796, term6796.getClass(), "intVal", term6797);
        setIntField(term6796, term6796.getClass(), "scale", 52);
        setIntField(term6796, term6796.getClass(), "precision", 0);
        setField(term6796, term6796.getClass(), "stringCache", null);
        setLongField(term6796, term6796.getClass(), "intCompact", -9223372036854775808L);
        setField(term6683, term6683.getClass(), "amount", term6796);
        term6813 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6814 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6816 = (int[]) newIntArray(6);
        setIntField(term6814, term6814.getClass(), "signum", 1);
        setIntElement(term6816, 0, 45083);
        setIntElement(term6816, 1, 1788905768);
        setIntElement(term6816, 2, 372010598);
        setIntElement(term6816, 3, 225971366);
        setIntElement(term6816, 4, -1505336223);
        setIntElement(term6816, 5, 707279667);
        setField(term6814, term6814.getClass(), "mag", term6816);
        setIntField(term6814, term6814.getClass(), "bitCountPlusOne", 0);
        setIntField(term6814, term6814.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6814, term6814.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6814, term6814.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6813, term6813.getClass(), "intVal", term6814);
        setIntField(term6813, term6813.getClass(), "scale", 53);
        setIntField(term6813, term6813.getClass(), "precision", 0);
        setField(term6813, term6813.getClass(), "stringCache", null);
        setLongField(term6813, term6813.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term6813;
        callMethod(klass, "setAmount", argTypes, term6683, args);
    }

};


