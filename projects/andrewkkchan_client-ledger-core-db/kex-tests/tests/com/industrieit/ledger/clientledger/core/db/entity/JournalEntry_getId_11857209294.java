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

public class JournalEntry_getId_11857209294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5061;

    public JournalEntry_getId_11857209294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5155 = new Long(0L);
        Integer term5157 = new Integer(0);
        term5061 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term5086 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term5099 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5138 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5139 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5141 = (int[]) newIntArray(6);
        Object term5171 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5174 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5175 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5177 = (int[]) newIntArray(6);
        setField(term5061, term5061.getClass(), "id", "kVEZMHmRtR");
        setField(term5061, term5061.getClass(), "requestId", "ekxGuOYIwi");
        setField(term5086, term5086.getClass(), "id", "RbVQXSpxXy");
        setIntField(term5099, term5099.getClass(), "nanos", 628000000);
        setLongField(term5099, term5099.getClass(), "fastTime", 1795925537000L);
        setField(term5099, term5099.getClass(), "cdate", null);
        setField(term5086, term5086.getClass(), "createTime", term5099);
        setField(term5086, term5086.getClass(), "currency", "YpJbIgJWWv");
        setField(term5086, term5086.getClass(), "accountName", "JppkknKVOw");
        setField(term5086, term5086.getClass(), "accountGroup", "iljANwuEjk");
        setIntField(term5139, term5139.getClass(), "signum", 1);
        setIntElement(term5141, 0, 26001);
        setIntElement(term5141, 1, 1123266030);
        setIntElement(term5141, 2, 1277036849);
        setIntElement(term5141, 3, 2128028609);
        setIntElement(term5141, 4, -171954480);
        setIntElement(term5141, 5, -1359520521);
        setField(term5139, term5139.getClass(), "mag", term5141);
        setIntField(term5139, term5139.getClass(), "bitCountPlusOne", 0);
        setIntField(term5139, term5139.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5139, term5139.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5139, term5139.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5138, term5138.getClass(), "intVal", term5139);
        setIntField(term5138, term5138.getClass(), "scale", 53);
        setIntField(term5138, term5138.getClass(), "precision", 0);
        setField(term5138, term5138.getClass(), "stringCache", null);
        setLongField(term5138, term5138.getClass(), "intCompact", -9223372036854775808L);
        setField(term5086, term5086.getClass(), "balance", term5138);
        setField(term5086, term5086.getClass(), "kafkaOffset", term5155);
        setField(term5086, term5086.getClass(), "kafkaPartition", term5157);
        setField(term5061, term5061.getClass(), "account", term5086);
        setField(term5061, term5061.getClass(), "currency", "kNqaJKIATy");
        setIntField(term5171, term5171.getClass(), "nanos", 545000000);
        setLongField(term5171, term5171.getClass(), "fastTime", 1802984633000L);
        setField(term5171, term5171.getClass(), "cdate", null);
        setField(term5061, term5061.getClass(), "createTime", term5171);
        setIntField(term5175, term5175.getClass(), "signum", 1);
        setIntElement(term5177, 0, 3996);
        setIntElement(term5177, 1, 1627046923);
        setIntElement(term5177, 2, -1280614629);
        setIntElement(term5177, 3, 917260100);
        setIntElement(term5177, 4, -74841886);
        setIntElement(term5177, 5, 597293319);
        setField(term5175, term5175.getClass(), "mag", term5177);
        setIntField(term5175, term5175.getClass(), "bitCountPlusOne", 0);
        setIntField(term5175, term5175.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5175, term5175.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5175, term5175.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5174, term5174.getClass(), "intVal", term5175);
        setIntField(term5174, term5174.getClass(), "scale", 52);
        setIntField(term5174, term5174.getClass(), "precision", 0);
        setField(term5174, term5174.getClass(), "stringCache", null);
        setLongField(term5174, term5174.getClass(), "intCompact", -9223372036854775808L);
        setField(term5061, term5061.getClass(), "amount", term5174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5061, args);
    }

};


