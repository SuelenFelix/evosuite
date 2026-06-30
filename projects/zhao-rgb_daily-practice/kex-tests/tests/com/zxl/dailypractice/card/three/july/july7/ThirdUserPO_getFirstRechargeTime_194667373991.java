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

public class ThirdUserPO_getFirstRechargeTime_194667373991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15341;

    public ThirdUserPO_getFirstRechargeTime_194667373991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15341 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15341, term15341.getClass(), "pkUserId", null);
        setField(term15341, term15341.getClass(), "thirdUserId", null);
        setField(term15341, term15341.getClass(), "thirdType", null);
        setField(term15341, term15341.getClass(), "unionId", null);
        setField(term15341, term15341.getClass(), "name", null);
        setField(term15341, term15341.getClass(), "nickName", null);
        setField(term15341, term15341.getClass(), "phoneNumber", null);
        setField(term15341, term15341.getClass(), "registrationChannel", null);
        setField(term15341, term15341.getClass(), "registrationTime", null);
        setField(term15341, term15341.getClass(), "logoutTime", null);
        setField(term15341, term15341.getClass(), "status", null);
        setField(term15341, term15341.getClass(), "tenantId", null);
        setField(term15341, term15341.getClass(), "createTime", null);
        setField(term15341, term15341.getClass(), "updateTime", null);
        setField(term15341, term15341.getClass(), "deleted", null);
        setField(term15341, term15341.getClass(), "version", null);
        setField(term15341, term15341.getClass(), "createBy", null);
        setField(term15341, term15341.getClass(), "updateBy", null);
        setField(term15341, term15341.getClass(), "firstRechargeTime", null);
        setField(term15341, term15341.getClass(), "totalRechargeAmount", null);
        setField(term15341, term15341.getClass(), "totalGiftAmount", null);
        setField(term15341, term15341.getClass(), "walletBalance", null);
        setField(term15341, term15341.getClass(), "frozenAmount", null);
        setField(term15341, term15341.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRechargeTime", argTypes, term15341, args);
    }

};


