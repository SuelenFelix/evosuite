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

public class ThirdUserPO_getName_206264285963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15313;

    public ThirdUserPO_getName_206264285963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15313 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15313, term15313.getClass(), "pkUserId", null);
        setField(term15313, term15313.getClass(), "thirdUserId", null);
        setField(term15313, term15313.getClass(), "thirdType", null);
        setField(term15313, term15313.getClass(), "unionId", null);
        setField(term15313, term15313.getClass(), "name", null);
        setField(term15313, term15313.getClass(), "nickName", null);
        setField(term15313, term15313.getClass(), "phoneNumber", null);
        setField(term15313, term15313.getClass(), "registrationChannel", null);
        setField(term15313, term15313.getClass(), "registrationTime", null);
        setField(term15313, term15313.getClass(), "logoutTime", null);
        setField(term15313, term15313.getClass(), "status", null);
        setField(term15313, term15313.getClass(), "tenantId", null);
        setField(term15313, term15313.getClass(), "createTime", null);
        setField(term15313, term15313.getClass(), "updateTime", null);
        setField(term15313, term15313.getClass(), "deleted", null);
        setField(term15313, term15313.getClass(), "version", null);
        setField(term15313, term15313.getClass(), "createBy", null);
        setField(term15313, term15313.getClass(), "updateBy", null);
        setField(term15313, term15313.getClass(), "firstRechargeTime", null);
        setField(term15313, term15313.getClass(), "totalRechargeAmount", null);
        setField(term15313, term15313.getClass(), "totalGiftAmount", null);
        setField(term15313, term15313.getClass(), "walletBalance", null);
        setField(term15313, term15313.getClass(), "frozenAmount", null);
        setField(term15313, term15313.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term15313, args);
    }

};


