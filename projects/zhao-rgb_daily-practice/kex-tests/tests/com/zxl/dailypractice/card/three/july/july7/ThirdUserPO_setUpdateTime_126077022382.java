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

public class ThirdUserPO_setUpdateTime_126077022382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15332;

    public ThirdUserPO_setUpdateTime_126077022382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15332 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15332, term15332.getClass(), "pkUserId", null);
        setField(term15332, term15332.getClass(), "thirdUserId", null);
        setField(term15332, term15332.getClass(), "thirdType", null);
        setField(term15332, term15332.getClass(), "unionId", null);
        setField(term15332, term15332.getClass(), "name", null);
        setField(term15332, term15332.getClass(), "nickName", null);
        setField(term15332, term15332.getClass(), "phoneNumber", null);
        setField(term15332, term15332.getClass(), "registrationChannel", null);
        setField(term15332, term15332.getClass(), "registrationTime", null);
        setField(term15332, term15332.getClass(), "logoutTime", null);
        setField(term15332, term15332.getClass(), "status", null);
        setField(term15332, term15332.getClass(), "tenantId", null);
        setField(term15332, term15332.getClass(), "createTime", null);
        setField(term15332, term15332.getClass(), "updateTime", null);
        setField(term15332, term15332.getClass(), "deleted", null);
        setField(term15332, term15332.getClass(), "version", null);
        setField(term15332, term15332.getClass(), "createBy", null);
        setField(term15332, term15332.getClass(), "updateBy", null);
        setField(term15332, term15332.getClass(), "firstRechargeTime", null);
        setField(term15332, term15332.getClass(), "totalRechargeAmount", null);
        setField(term15332, term15332.getClass(), "totalGiftAmount", null);
        setField(term15332, term15332.getClass(), "walletBalance", null);
        setField(term15332, term15332.getClass(), "frozenAmount", null);
        setField(term15332, term15332.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdateTime", argTypes, term15332, args);
    }

};


