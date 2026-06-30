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

public class ThirdUserPO_setTotalRechargeAmount_89963840441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11826;
     Object term11995;

    public ThirdUserPO_setTotalRechargeAmount_89963840441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11955 = new Integer(1236004505);
        Integer term11957 = new Integer(1050765721);
        Integer term11985 = new Integer(474518942);
        Integer term11987 = new Integer(-1656687479);
        Integer term11989 = new Integer(-249614216);
        Integer term11991 = new Integer(1870727665);
        Integer term11993 = new Integer(-519881101);
        term11826 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term11923 = newInstance(Class.forName("java.util.Date"));
        Object term11925 = newInstance(Class.forName("java.util.Date"));
        Object term11951 = newInstance(Class.forName("java.util.Date"));
        Object term11953 = newInstance(Class.forName("java.util.Date"));
        Object term11983 = newInstance(Class.forName("java.util.Date"));
        setField(term11826, term11826.getClass(), "pkUserId", "MqICFYzDJj");
        setField(term11826, term11826.getClass(), "thirdUserId", "YgQvdcBQKw");
        setField(term11826, term11826.getClass(), "thirdType", "FiYYLuailz");
        setField(term11826, term11826.getClass(), "unionId", "XebAeSnCKZ");
        setField(term11826, term11826.getClass(), "name", "GeddnXjHGy");
        setField(term11826, term11826.getClass(), "nickName", "vLTbaoAxBm");
        setField(term11826, term11826.getClass(), "phoneNumber", "BXTjEyEZxD");
        setField(term11826, term11826.getClass(), "registrationChannel", "oKhVzOKUFW");
        setLongField(term11923, term11923.getClass(), "fastTime", 1384837537981L);
        setField(term11923, term11923.getClass(), "cdate", null);
        setField(term11826, term11826.getClass(), "registrationTime", term11923);
        setLongField(term11925, term11925.getClass(), "fastTime", 1444705856246L);
        setField(term11925, term11925.getClass(), "cdate", null);
        setField(term11826, term11826.getClass(), "logoutTime", term11925);
        setField(term11826, term11826.getClass(), "status", "mNHyqmOAFy");
        setField(term11826, term11826.getClass(), "tenantId", "UxgSdhxPCH");
        setLongField(term11951, term11951.getClass(), "fastTime", 1758154207110L);
        setField(term11951, term11951.getClass(), "cdate", null);
        setField(term11826, term11826.getClass(), "createTime", term11951);
        setLongField(term11953, term11953.getClass(), "fastTime", 1374840193140L);
        setField(term11953, term11953.getClass(), "cdate", null);
        setField(term11826, term11826.getClass(), "updateTime", term11953);
        setField(term11826, term11826.getClass(), "deleted", term11955);
        setField(term11826, term11826.getClass(), "version", term11957);
        setField(term11826, term11826.getClass(), "createBy", "DAujxZPHJC");
        setField(term11826, term11826.getClass(), "updateBy", "IlBhdrCvHq");
        setLongField(term11983, term11983.getClass(), "fastTime", 1374845329130L);
        setField(term11983, term11983.getClass(), "cdate", null);
        setField(term11826, term11826.getClass(), "firstRechargeTime", term11983);
        setField(term11826, term11826.getClass(), "totalRechargeAmount", term11985);
        setField(term11826, term11826.getClass(), "totalGiftAmount", term11987);
        setField(term11826, term11826.getClass(), "walletBalance", term11989);
        setField(term11826, term11826.getClass(), "frozenAmount", term11991);
        setField(term11826, term11826.getClass(), "totalRefund", term11993);
        term11995 = new Integer(-680920524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term11995;
        callMethod(klass, "setTotalRechargeAmount", argTypes, term11826, args);
    }

};


