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

public class ThirdUserPO_setLogoutTime_35262574421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5946;
     Object term6115;

    public ThirdUserPO_setLogoutTime_35262574421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6075 = new Integer(-1963464809);
        Integer term6077 = new Integer(71190297);
        Integer term6105 = new Integer(1202361360);
        Integer term6107 = new Integer(-2015048153);
        Integer term6109 = new Integer(-2063457669);
        Integer term6111 = new Integer(-1222006000);
        Integer term6113 = new Integer(2095798786);
        term5946 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term6043 = newInstance(Class.forName("java.util.Date"));
        Object term6045 = newInstance(Class.forName("java.util.Date"));
        Object term6071 = newInstance(Class.forName("java.util.Date"));
        Object term6073 = newInstance(Class.forName("java.util.Date"));
        Object term6103 = newInstance(Class.forName("java.util.Date"));
        setField(term5946, term5946.getClass(), "pkUserId", "vOuMEpOQAg");
        setField(term5946, term5946.getClass(), "thirdUserId", "SIODFGaQhr");
        setField(term5946, term5946.getClass(), "thirdType", "qYzsiuXOgS");
        setField(term5946, term5946.getClass(), "unionId", "bxrCBbrrct");
        setField(term5946, term5946.getClass(), "name", "CKWpJaaaxX");
        setField(term5946, term5946.getClass(), "nickName", "UBRmXJmfrt");
        setField(term5946, term5946.getClass(), "phoneNumber", "WZzvmIHhzZ");
        setField(term5946, term5946.getClass(), "registrationChannel", "doQLHkjpNm");
        setLongField(term6043, term6043.getClass(), "fastTime", 1714975302670L);
        setField(term6043, term6043.getClass(), "cdate", null);
        setField(term5946, term5946.getClass(), "registrationTime", term6043);
        setLongField(term6045, term6045.getClass(), "fastTime", 1830753077357L);
        setField(term6045, term6045.getClass(), "cdate", null);
        setField(term5946, term5946.getClass(), "logoutTime", term6045);
        setField(term5946, term5946.getClass(), "status", "lCyLIcSuom");
        setField(term5946, term5946.getClass(), "tenantId", "CGOpQSZZwI");
        setLongField(term6071, term6071.getClass(), "fastTime", 1618594705278L);
        setField(term6071, term6071.getClass(), "cdate", null);
        setField(term5946, term5946.getClass(), "createTime", term6071);
        setLongField(term6073, term6073.getClass(), "fastTime", 1584136591305L);
        setField(term6073, term6073.getClass(), "cdate", null);
        setField(term5946, term5946.getClass(), "updateTime", term6073);
        setField(term5946, term5946.getClass(), "deleted", term6075);
        setField(term5946, term5946.getClass(), "version", term6077);
        setField(term5946, term5946.getClass(), "createBy", "ypEdrstygY");
        setField(term5946, term5946.getClass(), "updateBy", "sNQFlATEeQ");
        setLongField(term6103, term6103.getClass(), "fastTime", 1309132342717L);
        setField(term6103, term6103.getClass(), "cdate", null);
        setField(term5946, term5946.getClass(), "firstRechargeTime", term6103);
        setField(term5946, term5946.getClass(), "totalRechargeAmount", term6105);
        setField(term5946, term5946.getClass(), "totalGiftAmount", term6107);
        setField(term5946, term5946.getClass(), "walletBalance", term6109);
        setField(term5946, term5946.getClass(), "frozenAmount", term6111);
        setField(term5946, term5946.getClass(), "totalRefund", term6113);
        term6115 = newInstance(Class.forName("java.util.Date"));
        setLongField(term6115, term6115.getClass(), "fastTime", 1695470381249L);
        setField(term6115, term6115.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term6115;
        callMethod(klass, "setLogoutTime", argTypes, term5946, args);
    }

};


