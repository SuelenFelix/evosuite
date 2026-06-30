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

public class ThirdUserPO_setDeleted_108823531031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8886;
     Object term9055;

    public ThirdUserPO_setDeleted_108823531031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9015 = new Integer(-1310015129);
        Integer term9017 = new Integer(-2104981311);
        Integer term9045 = new Integer(-571169753);
        Integer term9047 = new Integer(318591690);
        Integer term9049 = new Integer(-165587447);
        Integer term9051 = new Integer(-1347358701);
        Integer term9053 = new Integer(806595993);
        term8886 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term8983 = newInstance(Class.forName("java.util.Date"));
        Object term8985 = newInstance(Class.forName("java.util.Date"));
        Object term9011 = newInstance(Class.forName("java.util.Date"));
        Object term9013 = newInstance(Class.forName("java.util.Date"));
        Object term9043 = newInstance(Class.forName("java.util.Date"));
        setField(term8886, term8886.getClass(), "pkUserId", "pFAfANnxup");
        setField(term8886, term8886.getClass(), "thirdUserId", "FbSIUZyBXZ");
        setField(term8886, term8886.getClass(), "thirdType", "mhQDwIyrRi");
        setField(term8886, term8886.getClass(), "unionId", "HpZXWDPhlg");
        setField(term8886, term8886.getClass(), "name", "lBOokzEPfe");
        setField(term8886, term8886.getClass(), "nickName", "dtGZCsKXbW");
        setField(term8886, term8886.getClass(), "phoneNumber", "bdyhHbDAmJ");
        setField(term8886, term8886.getClass(), "registrationChannel", "BBXiTNHqGE");
        setLongField(term8983, term8983.getClass(), "fastTime", 1380452861286L);
        setField(term8983, term8983.getClass(), "cdate", null);
        setField(term8886, term8886.getClass(), "registrationTime", term8983);
        setLongField(term8985, term8985.getClass(), "fastTime", 1599094543267L);
        setField(term8985, term8985.getClass(), "cdate", null);
        setField(term8886, term8886.getClass(), "logoutTime", term8985);
        setField(term8886, term8886.getClass(), "status", "IEYhJmgCVd");
        setField(term8886, term8886.getClass(), "tenantId", "KSJeYkkvpk");
        setLongField(term9011, term9011.getClass(), "fastTime", 1623687334907L);
        setField(term9011, term9011.getClass(), "cdate", null);
        setField(term8886, term8886.getClass(), "createTime", term9011);
        setLongField(term9013, term9013.getClass(), "fastTime", 1597517553085L);
        setField(term9013, term9013.getClass(), "cdate", null);
        setField(term8886, term8886.getClass(), "updateTime", term9013);
        setField(term8886, term8886.getClass(), "deleted", term9015);
        setField(term8886, term8886.getClass(), "version", term9017);
        setField(term8886, term8886.getClass(), "createBy", "qUtkFGMNUV");
        setField(term8886, term8886.getClass(), "updateBy", "mGRiYhnMcR");
        setLongField(term9043, term9043.getClass(), "fastTime", 1644421115303L);
        setField(term9043, term9043.getClass(), "cdate", null);
        setField(term8886, term8886.getClass(), "firstRechargeTime", term9043);
        setField(term8886, term8886.getClass(), "totalRechargeAmount", term9045);
        setField(term8886, term8886.getClass(), "totalGiftAmount", term9047);
        setField(term8886, term8886.getClass(), "walletBalance", term9049);
        setField(term8886, term8886.getClass(), "frozenAmount", term9051);
        setField(term8886, term8886.getClass(), "totalRefund", term9053);
        term9055 = new Integer(548228925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9055;
        callMethod(klass, "setDeleted", argTypes, term8886, args);
    }

};


