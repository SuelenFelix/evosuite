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

public class ThirdUserPO_setTenantId_189722559325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7126;

    public ThirdUserPO_setTenantId_189722559325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7255 = new Integer(229204365);
        Integer term7257 = new Integer(-461771056);
        Integer term7285 = new Integer(-243422082);
        Integer term7287 = new Integer(1384592638);
        Integer term7289 = new Integer(-1002370457);
        Integer term7291 = new Integer(-2014576105);
        Integer term7293 = new Integer(1296895584);
        term7126 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term7223 = newInstance(Class.forName("java.util.Date"));
        Object term7225 = newInstance(Class.forName("java.util.Date"));
        Object term7251 = newInstance(Class.forName("java.util.Date"));
        Object term7253 = newInstance(Class.forName("java.util.Date"));
        Object term7283 = newInstance(Class.forName("java.util.Date"));
        setField(term7126, term7126.getClass(), "pkUserId", "wBGfLpNNiZ");
        setField(term7126, term7126.getClass(), "thirdUserId", "yUGCjlqgJE");
        setField(term7126, term7126.getClass(), "thirdType", "PXdVZyoJyC");
        setField(term7126, term7126.getClass(), "unionId", "vLerpqavFM");
        setField(term7126, term7126.getClass(), "name", "qnvxzwuGKX");
        setField(term7126, term7126.getClass(), "nickName", "EdPAvpluZg");
        setField(term7126, term7126.getClass(), "phoneNumber", "DzHVBMqWtE");
        setField(term7126, term7126.getClass(), "registrationChannel", "THZSpzBRYP");
        setLongField(term7223, term7223.getClass(), "fastTime", 1340909568660L);
        setField(term7223, term7223.getClass(), "cdate", null);
        setField(term7126, term7126.getClass(), "registrationTime", term7223);
        setLongField(term7225, term7225.getClass(), "fastTime", 1862657813973L);
        setField(term7225, term7225.getClass(), "cdate", null);
        setField(term7126, term7126.getClass(), "logoutTime", term7225);
        setField(term7126, term7126.getClass(), "status", "ZfBIVGBQOE");
        setField(term7126, term7126.getClass(), "tenantId", "QSrDQfEsTR");
        setLongField(term7251, term7251.getClass(), "fastTime", 1299431078379L);
        setField(term7251, term7251.getClass(), "cdate", null);
        setField(term7126, term7126.getClass(), "createTime", term7251);
        setLongField(term7253, term7253.getClass(), "fastTime", 1476970157231L);
        setField(term7253, term7253.getClass(), "cdate", null);
        setField(term7126, term7126.getClass(), "updateTime", term7253);
        setField(term7126, term7126.getClass(), "deleted", term7255);
        setField(term7126, term7126.getClass(), "version", term7257);
        setField(term7126, term7126.getClass(), "createBy", "PsqusYmejD");
        setField(term7126, term7126.getClass(), "updateBy", "NTWMiBEaDF");
        setLongField(term7283, term7283.getClass(), "fastTime", 1386180897453L);
        setField(term7283, term7283.getClass(), "cdate", null);
        setField(term7126, term7126.getClass(), "firstRechargeTime", term7283);
        setField(term7126, term7126.getClass(), "totalRechargeAmount", term7285);
        setField(term7126, term7126.getClass(), "totalGiftAmount", term7287);
        setField(term7126, term7126.getClass(), "walletBalance", term7289);
        setField(term7126, term7126.getClass(), "frozenAmount", term7291);
        setField(term7126, term7126.getClass(), "totalRefund", term7293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPBstwKFVr";
        callMethod(klass, "setTenantId", argTypes, term7126, args);
    }

};


