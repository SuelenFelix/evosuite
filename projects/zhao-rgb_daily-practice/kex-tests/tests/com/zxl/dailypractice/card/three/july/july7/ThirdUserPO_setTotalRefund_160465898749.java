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

public class ThirdUserPO_setTotalRefund_160465898749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14146;
     Object term14315;

    public ThirdUserPO_setTotalRefund_160465898749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14275 = new Integer(-1127721881);
        Integer term14277 = new Integer(1074848808);
        Integer term14305 = new Integer(-146054762);
        Integer term14307 = new Integer(798043553);
        Integer term14309 = new Integer(533197381);
        Integer term14311 = new Integer(1048271679);
        Integer term14313 = new Integer(-1529797673);
        term14146 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term14243 = newInstance(Class.forName("java.util.Date"));
        Object term14245 = newInstance(Class.forName("java.util.Date"));
        Object term14271 = newInstance(Class.forName("java.util.Date"));
        Object term14273 = newInstance(Class.forName("java.util.Date"));
        Object term14303 = newInstance(Class.forName("java.util.Date"));
        setField(term14146, term14146.getClass(), "pkUserId", "aYLvcxZohT");
        setField(term14146, term14146.getClass(), "thirdUserId", "mnHyQbMyld");
        setField(term14146, term14146.getClass(), "thirdType", "KHtaDOIcJZ");
        setField(term14146, term14146.getClass(), "unionId", "vgdwrCZczl");
        setField(term14146, term14146.getClass(), "name", "gKMNrpKBpu");
        setField(term14146, term14146.getClass(), "nickName", "ZbHJVEqcoa");
        setField(term14146, term14146.getClass(), "phoneNumber", "awDQVEVIKi");
        setField(term14146, term14146.getClass(), "registrationChannel", "HJwNgUzZZR");
        setLongField(term14243, term14243.getClass(), "fastTime", 1390700341454L);
        setField(term14243, term14243.getClass(), "cdate", null);
        setField(term14146, term14146.getClass(), "registrationTime", term14243);
        setLongField(term14245, term14245.getClass(), "fastTime", 1325981376062L);
        setField(term14245, term14245.getClass(), "cdate", null);
        setField(term14146, term14146.getClass(), "logoutTime", term14245);
        setField(term14146, term14146.getClass(), "status", "FvUCZgTXhq");
        setField(term14146, term14146.getClass(), "tenantId", "wWWidPCHzx");
        setLongField(term14271, term14271.getClass(), "fastTime", 1638331931856L);
        setField(term14271, term14271.getClass(), "cdate", null);
        setField(term14146, term14146.getClass(), "createTime", term14271);
        setLongField(term14273, term14273.getClass(), "fastTime", 1891157798466L);
        setField(term14273, term14273.getClass(), "cdate", null);
        setField(term14146, term14146.getClass(), "updateTime", term14273);
        setField(term14146, term14146.getClass(), "deleted", term14275);
        setField(term14146, term14146.getClass(), "version", term14277);
        setField(term14146, term14146.getClass(), "createBy", "OwPIiBRuKK");
        setField(term14146, term14146.getClass(), "updateBy", "sgfGySMODT");
        setLongField(term14303, term14303.getClass(), "fastTime", 1460978610142L);
        setField(term14303, term14303.getClass(), "cdate", null);
        setField(term14146, term14146.getClass(), "firstRechargeTime", term14303);
        setField(term14146, term14146.getClass(), "totalRechargeAmount", term14305);
        setField(term14146, term14146.getClass(), "totalGiftAmount", term14307);
        setField(term14146, term14146.getClass(), "walletBalance", term14309);
        setField(term14146, term14146.getClass(), "frozenAmount", term14311);
        setField(term14146, term14146.getClass(), "totalRefund", term14313);
        term14315 = new Integer(-868676396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14315;
        callMethod(klass, "setTotalRefund", argTypes, term14146, args);
    }

};


