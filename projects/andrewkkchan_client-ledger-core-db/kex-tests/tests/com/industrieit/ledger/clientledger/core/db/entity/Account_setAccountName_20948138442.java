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

public class Account_setAccountName_20948138442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1277;

    public Account_setAccountName_20948138442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1346 = new Long(0L);
        Integer term1348 = new Integer(0);
        term1277 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1290 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1329 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1330 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1332 = (int[]) newIntArray(6);
        setField(term1277, term1277.getClass(), "id", "jDtqGUpnZN");
        setIntField(term1290, term1290.getClass(), "nanos", 364000000);
        setLongField(term1290, term1290.getClass(), "fastTime", 1882628084000L);
        setField(term1290, term1290.getClass(), "cdate", null);
        setField(term1277, term1277.getClass(), "createTime", term1290);
        setField(term1277, term1277.getClass(), "currency", "nGKItKLYNC");
        setField(term1277, term1277.getClass(), "accountName", "UiUYnPrcCi");
        setField(term1277, term1277.getClass(), "accountGroup", "UoYtihxVaS");
        setIntField(term1330, term1330.getClass(), "signum", 1);
        setIntElement(term1332, 0, 2364);
        setIntElement(term1332, 1, -1446584625);
        setIntElement(term1332, 2, 1957600567);
        setIntElement(term1332, 3, -336418707);
        setIntElement(term1332, 4, -1905211145);
        setIntElement(term1332, 5, 86968353);
        setField(term1330, term1330.getClass(), "mag", term1332);
        setIntField(term1330, term1330.getClass(), "bitCountPlusOne", 0);
        setIntField(term1330, term1330.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1330, term1330.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1330, term1330.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1329, term1329.getClass(), "intVal", term1330);
        setIntField(term1329, term1329.getClass(), "scale", 52);
        setIntField(term1329, term1329.getClass(), "precision", 0);
        setField(term1329, term1329.getClass(), "stringCache", null);
        setLongField(term1329, term1329.getClass(), "intCompact", -9223372036854775808L);
        setField(term1277, term1277.getClass(), "balance", term1329);
        setField(term1277, term1277.getClass(), "kafkaOffset", term1346);
        setField(term1277, term1277.getClass(), "kafkaPartition", term1348);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "setAccountName", argTypes, term1277, args);
    }

};


