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

public class ThirdUserPO_getLogoutTime_166153067820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5657;

    public ThirdUserPO_getLogoutTime_166153067820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5786 = new Integer(480137250);
        Integer term5788 = new Integer(-341152642);
        Integer term5816 = new Integer(-2015854073);
        Integer term5818 = new Integer(538259104);
        Integer term5820 = new Integer(96566506);
        Integer term5822 = new Integer(-343325701);
        Integer term5824 = new Integer(107945604);
        term5657 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term5754 = newInstance(Class.forName("java.util.Date"));
        Object term5756 = newInstance(Class.forName("java.util.Date"));
        Object term5782 = newInstance(Class.forName("java.util.Date"));
        Object term5784 = newInstance(Class.forName("java.util.Date"));
        Object term5814 = newInstance(Class.forName("java.util.Date"));
        setField(term5657, term5657.getClass(), "pkUserId", "MHGKyEnwKc");
        setField(term5657, term5657.getClass(), "thirdUserId", "ShIELyuULw");
        setField(term5657, term5657.getClass(), "thirdType", "IpQuOGMgmj");
        setField(term5657, term5657.getClass(), "unionId", "pJbnHTYrxn");
        setField(term5657, term5657.getClass(), "name", "iIRsCSYqXH");
        setField(term5657, term5657.getClass(), "nickName", "nghfqDXyCG");
        setField(term5657, term5657.getClass(), "phoneNumber", "WBAOTqErtm");
        setField(term5657, term5657.getClass(), "registrationChannel", "PqtVXXZMqK");
        setLongField(term5754, term5754.getClass(), "fastTime", 1510275079351L);
        setField(term5754, term5754.getClass(), "cdate", null);
        setField(term5657, term5657.getClass(), "registrationTime", term5754);
        setLongField(term5756, term5756.getClass(), "fastTime", 1335389252058L);
        setField(term5756, term5756.getClass(), "cdate", null);
        setField(term5657, term5657.getClass(), "logoutTime", term5756);
        setField(term5657, term5657.getClass(), "status", "rYbtIDVdnd");
        setField(term5657, term5657.getClass(), "tenantId", "UKAReurpHG");
        setLongField(term5782, term5782.getClass(), "fastTime", 1616833468678L);
        setField(term5782, term5782.getClass(), "cdate", null);
        setField(term5657, term5657.getClass(), "createTime", term5782);
        setLongField(term5784, term5784.getClass(), "fastTime", 1319541754821L);
        setField(term5784, term5784.getClass(), "cdate", null);
        setField(term5657, term5657.getClass(), "updateTime", term5784);
        setField(term5657, term5657.getClass(), "deleted", term5786);
        setField(term5657, term5657.getClass(), "version", term5788);
        setField(term5657, term5657.getClass(), "createBy", "WVRMUmrljA");
        setField(term5657, term5657.getClass(), "updateBy", "NTlKJDDWlk");
        setLongField(term5814, term5814.getClass(), "fastTime", 1431655415283L);
        setField(term5814, term5814.getClass(), "cdate", null);
        setField(term5657, term5657.getClass(), "firstRechargeTime", term5814);
        setField(term5657, term5657.getClass(), "totalRechargeAmount", term5816);
        setField(term5657, term5657.getClass(), "totalGiftAmount", term5818);
        setField(term5657, term5657.getClass(), "walletBalance", term5820);
        setField(term5657, term5657.getClass(), "frozenAmount", term5822);
        setField(term5657, term5657.getClass(), "totalRefund", term5824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogoutTime", argTypes, term5657, args);
    }

};


