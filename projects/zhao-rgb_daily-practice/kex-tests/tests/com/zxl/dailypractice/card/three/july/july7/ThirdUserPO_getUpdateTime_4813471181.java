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

public class ThirdUserPO_getUpdateTime_4813471181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15331;

    public ThirdUserPO_getUpdateTime_4813471181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15331 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15331, term15331.getClass(), "pkUserId", null);
        setField(term15331, term15331.getClass(), "thirdUserId", null);
        setField(term15331, term15331.getClass(), "thirdType", null);
        setField(term15331, term15331.getClass(), "unionId", null);
        setField(term15331, term15331.getClass(), "name", null);
        setField(term15331, term15331.getClass(), "nickName", null);
        setField(term15331, term15331.getClass(), "phoneNumber", null);
        setField(term15331, term15331.getClass(), "registrationChannel", null);
        setField(term15331, term15331.getClass(), "registrationTime", null);
        setField(term15331, term15331.getClass(), "logoutTime", null);
        setField(term15331, term15331.getClass(), "status", null);
        setField(term15331, term15331.getClass(), "tenantId", null);
        setField(term15331, term15331.getClass(), "createTime", null);
        setField(term15331, term15331.getClass(), "updateTime", null);
        setField(term15331, term15331.getClass(), "deleted", null);
        setField(term15331, term15331.getClass(), "version", null);
        setField(term15331, term15331.getClass(), "createBy", null);
        setField(term15331, term15331.getClass(), "updateBy", null);
        setField(term15331, term15331.getClass(), "firstRechargeTime", null);
        setField(term15331, term15331.getClass(), "totalRechargeAmount", null);
        setField(term15331, term15331.getClass(), "totalGiftAmount", null);
        setField(term15331, term15331.getClass(), "walletBalance", null);
        setField(term15331, term15331.getClass(), "frozenAmount", null);
        setField(term15331, term15331.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term15331, args);
    }

};


