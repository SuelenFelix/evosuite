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

public class ThirdUserPO_getName_206264285910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2677;

    public ThirdUserPO_getName_206264285910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2806 = new Integer(493620644);
        Integer term2808 = new Integer(1328271830);
        Integer term2836 = new Integer(1596070772);
        Integer term2838 = new Integer(97029295);
        Integer term2840 = new Integer(-1371869594);
        Integer term2842 = new Integer(-2095575670);
        Integer term2844 = new Integer(1225272962);
        term2677 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term2774 = newInstance(Class.forName("java.util.Date"));
        Object term2776 = newInstance(Class.forName("java.util.Date"));
        Object term2802 = newInstance(Class.forName("java.util.Date"));
        Object term2804 = newInstance(Class.forName("java.util.Date"));
        Object term2834 = newInstance(Class.forName("java.util.Date"));
        setField(term2677, term2677.getClass(), "pkUserId", "OEXDRUKcFl");
        setField(term2677, term2677.getClass(), "thirdUserId", "RYdKCNNMBR");
        setField(term2677, term2677.getClass(), "thirdType", "yGtHPyvYiQ");
        setField(term2677, term2677.getClass(), "unionId", "MvRIxilFMJ");
        setField(term2677, term2677.getClass(), "name", "iNwOJRBEjp");
        setField(term2677, term2677.getClass(), "nickName", "XylxrMBraH");
        setField(term2677, term2677.getClass(), "phoneNumber", "pORebkoRdD");
        setField(term2677, term2677.getClass(), "registrationChannel", "mXGCWJDOqA");
        setLongField(term2774, term2774.getClass(), "fastTime", 1426018874434L);
        setField(term2774, term2774.getClass(), "cdate", null);
        setField(term2677, term2677.getClass(), "registrationTime", term2774);
        setLongField(term2776, term2776.getClass(), "fastTime", 1633004775487L);
        setField(term2776, term2776.getClass(), "cdate", null);
        setField(term2677, term2677.getClass(), "logoutTime", term2776);
        setField(term2677, term2677.getClass(), "status", "dpNsDgfPso");
        setField(term2677, term2677.getClass(), "tenantId", "hCWPJQKpdc");
        setLongField(term2802, term2802.getClass(), "fastTime", 1819191638549L);
        setField(term2802, term2802.getClass(), "cdate", null);
        setField(term2677, term2677.getClass(), "createTime", term2802);
        setLongField(term2804, term2804.getClass(), "fastTime", 1400691778698L);
        setField(term2804, term2804.getClass(), "cdate", null);
        setField(term2677, term2677.getClass(), "updateTime", term2804);
        setField(term2677, term2677.getClass(), "deleted", term2806);
        setField(term2677, term2677.getClass(), "version", term2808);
        setField(term2677, term2677.getClass(), "createBy", "WzMEhMXkKx");
        setField(term2677, term2677.getClass(), "updateBy", "XOiDvlDhdc");
        setLongField(term2834, term2834.getClass(), "fastTime", 1741444563811L);
        setField(term2834, term2834.getClass(), "cdate", null);
        setField(term2677, term2677.getClass(), "firstRechargeTime", term2834);
        setField(term2677, term2677.getClass(), "totalRechargeAmount", term2836);
        setField(term2677, term2677.getClass(), "totalGiftAmount", term2838);
        setField(term2677, term2677.getClass(), "walletBalance", term2840);
        setField(term2677, term2677.getClass(), "frozenAmount", term2842);
        setField(term2677, term2677.getClass(), "totalRefund", term2844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2677, args);
    }

};


