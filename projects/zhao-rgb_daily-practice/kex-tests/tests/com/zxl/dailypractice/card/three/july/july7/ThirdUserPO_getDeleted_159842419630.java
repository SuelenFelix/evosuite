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

public class ThirdUserPO_getDeleted_159842419630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8597;

    public ThirdUserPO_getDeleted_159842419630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8726 = new Integer(1152356969);
        Integer term8728 = new Integer(-1667990367);
        Integer term8756 = new Integer(-1214628358);
        Integer term8758 = new Integer(1102721075);
        Integer term8760 = new Integer(-426764678);
        Integer term8762 = new Integer(-1222614956);
        Integer term8764 = new Integer(-1870495012);
        term8597 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term8694 = newInstance(Class.forName("java.util.Date"));
        Object term8696 = newInstance(Class.forName("java.util.Date"));
        Object term8722 = newInstance(Class.forName("java.util.Date"));
        Object term8724 = newInstance(Class.forName("java.util.Date"));
        Object term8754 = newInstance(Class.forName("java.util.Date"));
        setField(term8597, term8597.getClass(), "pkUserId", "GNEmuHPNcU");
        setField(term8597, term8597.getClass(), "thirdUserId", "IoSfuKDFRe");
        setField(term8597, term8597.getClass(), "thirdType", "AWYyZiNfsm");
        setField(term8597, term8597.getClass(), "unionId", "ITRRYiuDwH");
        setField(term8597, term8597.getClass(), "name", "llRfwANcVF");
        setField(term8597, term8597.getClass(), "nickName", "sUEeHQTWkA");
        setField(term8597, term8597.getClass(), "phoneNumber", "BDIRCxAWLA");
        setField(term8597, term8597.getClass(), "registrationChannel", "eOJfbiZLnb");
        setLongField(term8694, term8694.getClass(), "fastTime", 1267044489300L);
        setField(term8694, term8694.getClass(), "cdate", null);
        setField(term8597, term8597.getClass(), "registrationTime", term8694);
        setLongField(term8696, term8696.getClass(), "fastTime", 1446437953738L);
        setField(term8696, term8696.getClass(), "cdate", null);
        setField(term8597, term8597.getClass(), "logoutTime", term8696);
        setField(term8597, term8597.getClass(), "status", "nKZKnxWYCK");
        setField(term8597, term8597.getClass(), "tenantId", "JOqQxuzRuZ");
        setLongField(term8722, term8722.getClass(), "fastTime", 1847834235018L);
        setField(term8722, term8722.getClass(), "cdate", null);
        setField(term8597, term8597.getClass(), "createTime", term8722);
        setLongField(term8724, term8724.getClass(), "fastTime", 1744270719416L);
        setField(term8724, term8724.getClass(), "cdate", null);
        setField(term8597, term8597.getClass(), "updateTime", term8724);
        setField(term8597, term8597.getClass(), "deleted", term8726);
        setField(term8597, term8597.getClass(), "version", term8728);
        setField(term8597, term8597.getClass(), "createBy", "RSaoipUlsg");
        setField(term8597, term8597.getClass(), "updateBy", "cSHGbqKqlN");
        setLongField(term8754, term8754.getClass(), "fastTime", 1312186139711L);
        setField(term8754, term8754.getClass(), "cdate", null);
        setField(term8597, term8597.getClass(), "firstRechargeTime", term8754);
        setField(term8597, term8597.getClass(), "totalRechargeAmount", term8756);
        setField(term8597, term8597.getClass(), "totalGiftAmount", term8758);
        setField(term8597, term8597.getClass(), "walletBalance", term8760);
        setField(term8597, term8597.getClass(), "frozenAmount", term8762);
        setField(term8597, term8597.getClass(), "totalRefund", term8764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeleted", argTypes, term8597, args);
    }

};


