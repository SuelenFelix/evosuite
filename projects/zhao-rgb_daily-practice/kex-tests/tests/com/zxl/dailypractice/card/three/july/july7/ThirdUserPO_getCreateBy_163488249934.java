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

public class ThirdUserPO_getCreateBy_163488249934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9757;

    public ThirdUserPO_getCreateBy_163488249934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9886 = new Integer(-1476644457);
        Integer term9888 = new Integer(1270666529);
        Integer term9916 = new Integer(-1146679443);
        Integer term9918 = new Integer(-860131894);
        Integer term9920 = new Integer(-1022990421);
        Integer term9922 = new Integer(1045547089);
        Integer term9924 = new Integer(-1122880881);
        term9757 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term9854 = newInstance(Class.forName("java.util.Date"));
        Object term9856 = newInstance(Class.forName("java.util.Date"));
        Object term9882 = newInstance(Class.forName("java.util.Date"));
        Object term9884 = newInstance(Class.forName("java.util.Date"));
        Object term9914 = newInstance(Class.forName("java.util.Date"));
        setField(term9757, term9757.getClass(), "pkUserId", "UkKvaeJfEC");
        setField(term9757, term9757.getClass(), "thirdUserId", "WPxXsahPRq");
        setField(term9757, term9757.getClass(), "thirdType", "IENRuqmwUU");
        setField(term9757, term9757.getClass(), "unionId", "GsWxOwXvSu");
        setField(term9757, term9757.getClass(), "name", "bKBSncrMEZ");
        setField(term9757, term9757.getClass(), "nickName", "yeSXGqQExb");
        setField(term9757, term9757.getClass(), "phoneNumber", "uXYcXVYJZM");
        setField(term9757, term9757.getClass(), "registrationChannel", "BJhjdJUhkz");
        setLongField(term9854, term9854.getClass(), "fastTime", 1589208576171L);
        setField(term9854, term9854.getClass(), "cdate", null);
        setField(term9757, term9757.getClass(), "registrationTime", term9854);
        setLongField(term9856, term9856.getClass(), "fastTime", 1420265476195L);
        setField(term9856, term9856.getClass(), "cdate", null);
        setField(term9757, term9757.getClass(), "logoutTime", term9856);
        setField(term9757, term9757.getClass(), "status", "cdHYQDgUZR");
        setField(term9757, term9757.getClass(), "tenantId", "KAORSSPSeV");
        setLongField(term9882, term9882.getClass(), "fastTime", 1379588514567L);
        setField(term9882, term9882.getClass(), "cdate", null);
        setField(term9757, term9757.getClass(), "createTime", term9882);
        setLongField(term9884, term9884.getClass(), "fastTime", 1416359920111L);
        setField(term9884, term9884.getClass(), "cdate", null);
        setField(term9757, term9757.getClass(), "updateTime", term9884);
        setField(term9757, term9757.getClass(), "deleted", term9886);
        setField(term9757, term9757.getClass(), "version", term9888);
        setField(term9757, term9757.getClass(), "createBy", "UimMMORkzd");
        setField(term9757, term9757.getClass(), "updateBy", "huVIXUWLtI");
        setLongField(term9914, term9914.getClass(), "fastTime", 1765813478928L);
        setField(term9914, term9914.getClass(), "cdate", null);
        setField(term9757, term9757.getClass(), "firstRechargeTime", term9914);
        setField(term9757, term9757.getClass(), "totalRechargeAmount", term9916);
        setField(term9757, term9757.getClass(), "totalGiftAmount", term9918);
        setField(term9757, term9757.getClass(), "walletBalance", term9920);
        setField(term9757, term9757.getClass(), "frozenAmount", term9922);
        setField(term9757, term9757.getClass(), "totalRefund", term9924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateBy", argTypes, term9757, args);
    }

};


