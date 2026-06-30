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

public class ThirdUserPO_setThirdType_12449458237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1766;

    public ThirdUserPO_setThirdType_12449458237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1895 = new Integer(-469968304);
        Integer term1897 = new Integer(-1145578966);
        Integer term1925 = new Integer(679763016);
        Integer term1927 = new Integer(1962444399);
        Integer term1929 = new Integer(767834723);
        Integer term1931 = new Integer(-602026508);
        Integer term1933 = new Integer(-157887805);
        term1766 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term1863 = newInstance(Class.forName("java.util.Date"));
        Object term1865 = newInstance(Class.forName("java.util.Date"));
        Object term1891 = newInstance(Class.forName("java.util.Date"));
        Object term1893 = newInstance(Class.forName("java.util.Date"));
        Object term1923 = newInstance(Class.forName("java.util.Date"));
        setField(term1766, term1766.getClass(), "pkUserId", "HqBOwkVqjD");
        setField(term1766, term1766.getClass(), "thirdUserId", "MAcUBcBckh");
        setField(term1766, term1766.getClass(), "thirdType", "oVgzLbrsFr");
        setField(term1766, term1766.getClass(), "unionId", "vQVyKLdtaz");
        setField(term1766, term1766.getClass(), "name", "OWKQODBLzb");
        setField(term1766, term1766.getClass(), "nickName", "wGmYcqUkgE");
        setField(term1766, term1766.getClass(), "phoneNumber", "idgaQsnJpQ");
        setField(term1766, term1766.getClass(), "registrationChannel", "VgZnGoIFwQ");
        setLongField(term1863, term1863.getClass(), "fastTime", 1334853104718L);
        setField(term1863, term1863.getClass(), "cdate", null);
        setField(term1766, term1766.getClass(), "registrationTime", term1863);
        setLongField(term1865, term1865.getClass(), "fastTime", 1496859828764L);
        setField(term1865, term1865.getClass(), "cdate", null);
        setField(term1766, term1766.getClass(), "logoutTime", term1865);
        setField(term1766, term1766.getClass(), "status", "jUbSRrkrYZ");
        setField(term1766, term1766.getClass(), "tenantId", "bWWfajKbEX");
        setLongField(term1891, term1891.getClass(), "fastTime", 1691868468367L);
        setField(term1891, term1891.getClass(), "cdate", null);
        setField(term1766, term1766.getClass(), "createTime", term1891);
        setLongField(term1893, term1893.getClass(), "fastTime", 1442370534632L);
        setField(term1893, term1893.getClass(), "cdate", null);
        setField(term1766, term1766.getClass(), "updateTime", term1893);
        setField(term1766, term1766.getClass(), "deleted", term1895);
        setField(term1766, term1766.getClass(), "version", term1897);
        setField(term1766, term1766.getClass(), "createBy", "cAPeiZHKGJ");
        setField(term1766, term1766.getClass(), "updateBy", "LvJFtLBaxj");
        setLongField(term1923, term1923.getClass(), "fastTime", 1659994192918L);
        setField(term1923, term1923.getClass(), "cdate", null);
        setField(term1766, term1766.getClass(), "firstRechargeTime", term1923);
        setField(term1766, term1766.getClass(), "totalRechargeAmount", term1925);
        setField(term1766, term1766.getClass(), "totalGiftAmount", term1927);
        setField(term1766, term1766.getClass(), "walletBalance", term1929);
        setField(term1766, term1766.getClass(), "frozenAmount", term1931);
        setField(term1766, term1766.getClass(), "totalRefund", term1933);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setThirdType", argTypes, term1766, args);
    }

};


