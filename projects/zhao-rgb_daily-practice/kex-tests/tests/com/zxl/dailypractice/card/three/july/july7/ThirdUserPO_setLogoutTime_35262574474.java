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

public class ThirdUserPO_setLogoutTime_35262574474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15324;

    public ThirdUserPO_setLogoutTime_35262574474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15324 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        setField(term15324, term15324.getClass(), "pkUserId", null);
        setField(term15324, term15324.getClass(), "thirdUserId", null);
        setField(term15324, term15324.getClass(), "thirdType", null);
        setField(term15324, term15324.getClass(), "unionId", null);
        setField(term15324, term15324.getClass(), "name", null);
        setField(term15324, term15324.getClass(), "nickName", null);
        setField(term15324, term15324.getClass(), "phoneNumber", null);
        setField(term15324, term15324.getClass(), "registrationChannel", null);
        setField(term15324, term15324.getClass(), "registrationTime", null);
        setField(term15324, term15324.getClass(), "logoutTime", null);
        setField(term15324, term15324.getClass(), "status", null);
        setField(term15324, term15324.getClass(), "tenantId", null);
        setField(term15324, term15324.getClass(), "createTime", null);
        setField(term15324, term15324.getClass(), "updateTime", null);
        setField(term15324, term15324.getClass(), "deleted", null);
        setField(term15324, term15324.getClass(), "version", null);
        setField(term15324, term15324.getClass(), "createBy", null);
        setField(term15324, term15324.getClass(), "updateBy", null);
        setField(term15324, term15324.getClass(), "firstRechargeTime", null);
        setField(term15324, term15324.getClass(), "totalRechargeAmount", null);
        setField(term15324, term15324.getClass(), "totalGiftAmount", null);
        setField(term15324, term15324.getClass(), "walletBalance", null);
        setField(term15324, term15324.getClass(), "frozenAmount", null);
        setField(term15324, term15324.getClass(), "totalRefund", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLogoutTime", argTypes, term15324, args);
    }

};


