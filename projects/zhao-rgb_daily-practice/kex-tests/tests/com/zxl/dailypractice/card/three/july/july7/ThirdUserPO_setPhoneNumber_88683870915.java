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

public class ThirdUserPO_setPhoneNumber_88683870915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4166;

    public ThirdUserPO_setPhoneNumber_88683870915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4295 = new Integer(-344842608);
        Integer term4297 = new Integer(941650513);
        Integer term4325 = new Integer(444029505);
        Integer term4327 = new Integer(-1034506028);
        Integer term4329 = new Integer(-1263114719);
        Integer term4331 = new Integer(-894662986);
        Integer term4333 = new Integer(304775596);
        term4166 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term4263 = newInstance(Class.forName("java.util.Date"));
        Object term4265 = newInstance(Class.forName("java.util.Date"));
        Object term4291 = newInstance(Class.forName("java.util.Date"));
        Object term4293 = newInstance(Class.forName("java.util.Date"));
        Object term4323 = newInstance(Class.forName("java.util.Date"));
        setField(term4166, term4166.getClass(), "pkUserId", "xtftXXMbem");
        setField(term4166, term4166.getClass(), "thirdUserId", "cudZvLMQon");
        setField(term4166, term4166.getClass(), "thirdType", "lihXWlGDxk");
        setField(term4166, term4166.getClass(), "unionId", "JmcmxoGhIK");
        setField(term4166, term4166.getClass(), "name", "jXzmYyrnnT");
        setField(term4166, term4166.getClass(), "nickName", "igCAtimmYB");
        setField(term4166, term4166.getClass(), "phoneNumber", "DyiXbeYIaN");
        setField(term4166, term4166.getClass(), "registrationChannel", "VGizxZnyHX");
        setLongField(term4263, term4263.getClass(), "fastTime", 1597352397295L);
        setField(term4263, term4263.getClass(), "cdate", null);
        setField(term4166, term4166.getClass(), "registrationTime", term4263);
        setLongField(term4265, term4265.getClass(), "fastTime", 1713891155263L);
        setField(term4265, term4265.getClass(), "cdate", null);
        setField(term4166, term4166.getClass(), "logoutTime", term4265);
        setField(term4166, term4166.getClass(), "status", "kVEZMHmRtR");
        setField(term4166, term4166.getClass(), "tenantId", "ekxGuOYIwi");
        setLongField(term4291, term4291.getClass(), "fastTime", 1663413767651L);
        setField(term4291, term4291.getClass(), "cdate", null);
        setField(term4166, term4166.getClass(), "createTime", term4291);
        setLongField(term4293, term4293.getClass(), "fastTime", 1263744156294L);
        setField(term4293, term4293.getClass(), "cdate", null);
        setField(term4166, term4166.getClass(), "updateTime", term4293);
        setField(term4166, term4166.getClass(), "deleted", term4295);
        setField(term4166, term4166.getClass(), "version", term4297);
        setField(term4166, term4166.getClass(), "createBy", "RbVQXSpxXy");
        setField(term4166, term4166.getClass(), "updateBy", "YpJbIgJWWv");
        setLongField(term4323, term4323.getClass(), "fastTime", 1490956290070L);
        setField(term4323, term4323.getClass(), "cdate", null);
        setField(term4166, term4166.getClass(), "firstRechargeTime", term4323);
        setField(term4166, term4166.getClass(), "totalRechargeAmount", term4325);
        setField(term4166, term4166.getClass(), "totalGiftAmount", term4327);
        setField(term4166, term4166.getClass(), "walletBalance", term4329);
        setField(term4166, term4166.getClass(), "frozenAmount", term4331);
        setField(term4166, term4166.getClass(), "totalRefund", term4333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        callMethod(klass, "setPhoneNumber", argTypes, term4166, args);
    }

};


