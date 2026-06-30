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

public class ThirdUserPO_getCreateTime_186707258026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7437;

    public ThirdUserPO_getCreateTime_186707258026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7566 = new Integer(628918458);
        Integer term7568 = new Integer(-1274456137);
        Integer term7596 = new Integer(1041916673);
        Integer term7598 = new Integer(-601863069);
        Integer term7600 = new Integer(663292551);
        Integer term7602 = new Integer(-1885090354);
        Integer term7604 = new Integer(-2066804303);
        term7437 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term7534 = newInstance(Class.forName("java.util.Date"));
        Object term7536 = newInstance(Class.forName("java.util.Date"));
        Object term7562 = newInstance(Class.forName("java.util.Date"));
        Object term7564 = newInstance(Class.forName("java.util.Date"));
        Object term7594 = newInstance(Class.forName("java.util.Date"));
        setField(term7437, term7437.getClass(), "pkUserId", "WxYUTuqmIq");
        setField(term7437, term7437.getClass(), "thirdUserId", "OeQLvhVERT");
        setField(term7437, term7437.getClass(), "thirdType", "IlvgFINwIa");
        setField(term7437, term7437.getClass(), "unionId", "GEJABPlHSI");
        setField(term7437, term7437.getClass(), "name", "aQFUvuaYxd");
        setField(term7437, term7437.getClass(), "nickName", "zNFLXMifnS");
        setField(term7437, term7437.getClass(), "phoneNumber", "HHQcYMSBVc");
        setField(term7437, term7437.getClass(), "registrationChannel", "wdoqITnaAP");
        setLongField(term7534, term7534.getClass(), "fastTime", 1546769987439L);
        setField(term7534, term7534.getClass(), "cdate", null);
        setField(term7437, term7437.getClass(), "registrationTime", term7534);
        setLongField(term7536, term7536.getClass(), "fastTime", 1851896886282L);
        setField(term7536, term7536.getClass(), "cdate", null);
        setField(term7437, term7437.getClass(), "logoutTime", term7536);
        setField(term7437, term7437.getClass(), "status", "rIPMBcrNqB");
        setField(term7437, term7437.getClass(), "tenantId", "UDaboHZHhz");
        setLongField(term7562, term7562.getClass(), "fastTime", 1831742729790L);
        setField(term7562, term7562.getClass(), "cdate", null);
        setField(term7437, term7437.getClass(), "createTime", term7562);
        setLongField(term7564, term7564.getClass(), "fastTime", 1673375951909L);
        setField(term7564, term7564.getClass(), "cdate", null);
        setField(term7437, term7437.getClass(), "updateTime", term7564);
        setField(term7437, term7437.getClass(), "deleted", term7566);
        setField(term7437, term7437.getClass(), "version", term7568);
        setField(term7437, term7437.getClass(), "createBy", "nRvKihUSPj");
        setField(term7437, term7437.getClass(), "updateBy", "BbNeQJpYPr");
        setLongField(term7594, term7594.getClass(), "fastTime", 1816279347222L);
        setField(term7594, term7594.getClass(), "cdate", null);
        setField(term7437, term7437.getClass(), "firstRechargeTime", term7594);
        setField(term7437, term7437.getClass(), "totalRechargeAmount", term7596);
        setField(term7437, term7437.getClass(), "totalGiftAmount", term7598);
        setField(term7437, term7437.getClass(), "walletBalance", term7600);
        setField(term7437, term7437.getClass(), "frozenAmount", term7602);
        setField(term7437, term7437.getClass(), "totalRefund", term7604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term7437, args);
    }

};


