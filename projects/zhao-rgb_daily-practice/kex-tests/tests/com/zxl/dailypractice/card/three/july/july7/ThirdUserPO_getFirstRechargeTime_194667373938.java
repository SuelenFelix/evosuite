package com.zxl.dailypractice.card.three.july.july7;

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
import static com.zxl.dailypractice.card.three.july.july7.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class ThirdUserPO_getFirstRechargeTime_194667373938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10957;

    public ThirdUserPO_getFirstRechargeTime_194667373938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11086 = new Integer(-420030135);
        Integer term11088 = new Integer(267763294);
        Integer term11116 = new Integer(-1497710478);
        Integer term11118 = new Integer(49950830);
        Integer term11120 = new Integer(-525257914);
        Integer term11122 = new Integer(147209682);
        Integer term11124 = new Integer(34470066);
        term10957 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term11054 = newInstance(Class.forName("java.util.Date"));
        Object term11056 = newInstance(Class.forName("java.util.Date"));
        Object term11082 = newInstance(Class.forName("java.util.Date"));
        Object term11084 = newInstance(Class.forName("java.util.Date"));
        Object term11114 = newInstance(Class.forName("java.util.Date"));
        setField(term10957, term10957.getClass(), "pkUserId", "VUkRVwROTl");
        setField(term10957, term10957.getClass(), "thirdUserId", "UDlkdccCRn");
        setField(term10957, term10957.getClass(), "thirdType", "McpzErOcYb");
        setField(term10957, term10957.getClass(), "unionId", "jqrVEUvYEz");
        setField(term10957, term10957.getClass(), "name", "QITgiBrmfj");
        setField(term10957, term10957.getClass(), "nickName", "pXxkiXgQnq");
        setField(term10957, term10957.getClass(), "phoneNumber", "tKmrUDURku");
        setField(term10957, term10957.getClass(), "registrationChannel", "JeZbrwZmsP");
        setLongField(term11054, term11054.getClass(), "fastTime", 1608545223416L);
        setField(term11054, term11054.getClass(), "cdate", null);
        setField(term10957, term10957.getClass(), "registrationTime", term11054);
        setLongField(term11056, term11056.getClass(), "fastTime", 1878650382291L);
        setField(term11056, term11056.getClass(), "cdate", null);
        setField(term10957, term10957.getClass(), "logoutTime", term11056);
        setField(term10957, term10957.getClass(), "status", "bxyfeicqrK");
        setField(term10957, term10957.getClass(), "tenantId", "vBnWPlsZMk");
        setLongField(term11082, term11082.getClass(), "fastTime", 1841966960256L);
        setField(term11082, term11082.getClass(), "cdate", null);
        setField(term10957, term10957.getClass(), "createTime", term11082);
        setLongField(term11084, term11084.getClass(), "fastTime", 1859223562093L);
        setField(term11084, term11084.getClass(), "cdate", null);
        setField(term10957, term10957.getClass(), "updateTime", term11084);
        setField(term10957, term10957.getClass(), "deleted", term11086);
        setField(term10957, term10957.getClass(), "version", term11088);
        setField(term10957, term10957.getClass(), "createBy", "fIZsWucfXz");
        setField(term10957, term10957.getClass(), "updateBy", "IApvtmfhnq");
        setLongField(term11114, term11114.getClass(), "fastTime", 1466697924839L);
        setField(term11114, term11114.getClass(), "cdate", null);
        setField(term10957, term10957.getClass(), "firstRechargeTime", term11114);
        setField(term10957, term10957.getClass(), "totalRechargeAmount", term11116);
        setField(term10957, term10957.getClass(), "totalGiftAmount", term11118);
        setField(term10957, term10957.getClass(), "walletBalance", term11120);
        setField(term10957, term10957.getClass(), "frozenAmount", term11122);
        setField(term10957, term10957.getClass(), "totalRefund", term11124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRechargeTime", argTypes, term10957, args);
    }

};


