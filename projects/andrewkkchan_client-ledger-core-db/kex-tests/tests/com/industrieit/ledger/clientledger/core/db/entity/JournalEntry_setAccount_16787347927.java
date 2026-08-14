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

public class JournalEntry_setAccount_16787347927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5719;
     Object term5849;

    public JournalEntry_setAccount_16787347927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5813 = new Long(0L);
        Integer term5815 = new Integer(0);
        term5719 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term5744 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term5757 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5796 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5797 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5799 = (int[]) newIntArray(6);
        Object term5829 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5832 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5833 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5835 = (int[]) newIntArray(6);
        setField(term5719, term5719.getClass(), "id", "BjugTaMcxJ");
        setField(term5719, term5719.getClass(), "requestId", "vGiuZVPJNH");
        setField(term5744, term5744.getClass(), "id", "tlzpzIjMib");
        setIntField(term5757, term5757.getClass(), "nanos", 666000000);
        setLongField(term5757, term5757.getClass(), "fastTime", 1395468691000L);
        setField(term5757, term5757.getClass(), "cdate", null);
        setField(term5744, term5744.getClass(), "createTime", term5757);
        setField(term5744, term5744.getClass(), "currency", "AZdLeSugwv");
        setField(term5744, term5744.getClass(), "accountName", "RMsXuyzKJV");
        setField(term5744, term5744.getClass(), "accountGroup", "FwPbDZcHmB");
        setIntField(term5797, term5797.getClass(), "signum", 1);
        setIntElement(term5799, 0, 465);
        setIntElement(term5799, 1, -1390153706);
        setIntElement(term5799, 2, -2072151250);
        setIntElement(term5799, 3, -351773634);
        setIntElement(term5799, 4, -2080264737);
        setIntElement(term5799, 5, -362538513);
        setField(term5797, term5797.getClass(), "mag", term5799);
        setIntField(term5797, term5797.getClass(), "bitCountPlusOne", 0);
        setIntField(term5797, term5797.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5797, term5797.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5797, term5797.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5796, term5796.getClass(), "intVal", term5797);
        setIntField(term5796, term5796.getClass(), "scale", 51);
        setIntField(term5796, term5796.getClass(), "precision", 0);
        setField(term5796, term5796.getClass(), "stringCache", null);
        setLongField(term5796, term5796.getClass(), "intCompact", -9223372036854775808L);
        setField(term5744, term5744.getClass(), "balance", term5796);
        setField(term5744, term5744.getClass(), "kafkaOffset", term5813);
        setField(term5744, term5744.getClass(), "kafkaPartition", term5815);
        setField(term5719, term5719.getClass(), "account", term5744);
        setField(term5719, term5719.getClass(), "currency", "hOncybyCAH");
        setIntField(term5829, term5829.getClass(), "nanos", 289000000);
        setLongField(term5829, term5829.getClass(), "fastTime", 1465997919000L);
        setField(term5829, term5829.getClass(), "cdate", null);
        setField(term5719, term5719.getClass(), "createTime", term5829);
        setIntField(term5833, term5833.getClass(), "signum", 1);
        setIntElement(term5835, 0, 19519);
        setIntElement(term5835, 1, -1182278371);
        setIntElement(term5835, 2, -1767261549);
        setIntElement(term5835, 3, 1466667712);
        setIntElement(term5835, 4, 124168962);
        setIntElement(term5835, 5, -1752295351);
        setField(term5833, term5833.getClass(), "mag", term5835);
        setIntField(term5833, term5833.getClass(), "bitCountPlusOne", 0);
        setIntField(term5833, term5833.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5833, term5833.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5833, term5833.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5832, term5832.getClass(), "intVal", term5833);
        setIntField(term5832, term5832.getClass(), "scale", 53);
        setIntField(term5832, term5832.getClass(), "precision", 0);
        setField(term5832, term5832.getClass(), "stringCache", null);
        setLongField(term5832, term5832.getClass(), "intCompact", -9223372036854775808L);
        setField(term5719, term5719.getClass(), "amount", term5832);
        Long term5918 = new Long(0L);
        Integer term5920 = new Integer(0);
        term5849 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term5862 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5901 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5902 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5904 = (int[]) newIntArray(6);
        setField(term5849, term5849.getClass(), "id", "QduALnDSVo");
        setIntField(term5862, term5862.getClass(), "nanos", 65000000);
        setLongField(term5862, term5862.getClass(), "fastTime", 1535827649000L);
        setField(term5862, term5862.getClass(), "cdate", null);
        setField(term5849, term5849.getClass(), "createTime", term5862);
        setField(term5849, term5849.getClass(), "currency", "izPpKDErnQ");
        setField(term5849, term5849.getClass(), "accountName", "NnpwZBUTvx");
        setField(term5849, term5849.getClass(), "accountGroup", "tlQSNgTkQX");
        setIntField(term5902, term5902.getClass(), "signum", 1);
        setIntElement(term5904, 0, 43112);
        setIntElement(term5904, 1, 702459169);
        setIntElement(term5904, 2, 1058217529);
        setIntElement(term5904, 3, -393994438);
        setIntElement(term5904, 4, 1792052543);
        setIntElement(term5904, 5, 196757249);
        setField(term5902, term5902.getClass(), "mag", term5904);
        setIntField(term5902, term5902.getClass(), "bitCountPlusOne", 0);
        setIntField(term5902, term5902.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5902, term5902.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5902, term5902.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5901, term5901.getClass(), "intVal", term5902);
        setIntField(term5901, term5901.getClass(), "scale", 53);
        setIntField(term5901, term5901.getClass(), "precision", 0);
        setField(term5901, term5901.getClass(), "stringCache", null);
        setLongField(term5901, term5901.getClass(), "intCompact", -9223372036854775808L);
        setField(term5849, term5849.getClass(), "balance", term5901);
        setField(term5849, term5849.getClass(), "kafkaOffset", term5918);
        setField(term5849, term5849.getClass(), "kafkaPartition", term5920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Object[] args = new Object[1];
        args[0] = term5849;
        callMethod(klass, "setAccount", argTypes, term5719, args);
    }

};


