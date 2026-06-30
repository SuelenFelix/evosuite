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

public class ThirdUserPO_getThirdType_10821883836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;

    public ThirdUserPO_getThirdType_10821883836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1606 = new Integer(-203030934);
        Integer term1608 = new Integer(-1179120542);
        Integer term1636 = new Integer(-73683645);
        Integer term1638 = new Integer(-226514366);
        Integer term1640 = new Integer(1193880199);
        Integer term1642 = new Integer(-1087774327);
        Integer term1644 = new Integer(-1530420153);
        term1477 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term1574 = newInstance(Class.forName("java.util.Date"));
        Object term1576 = newInstance(Class.forName("java.util.Date"));
        Object term1602 = newInstance(Class.forName("java.util.Date"));
        Object term1604 = newInstance(Class.forName("java.util.Date"));
        Object term1634 = newInstance(Class.forName("java.util.Date"));
        setField(term1477, term1477.getClass(), "pkUserId", "hoicvmsovO");
        setField(term1477, term1477.getClass(), "thirdUserId", "eqJfYWRaEL");
        setField(term1477, term1477.getClass(), "thirdType", "fhkbdRViHi");
        setField(term1477, term1477.getClass(), "unionId", "uWHnvSvaPl");
        setField(term1477, term1477.getClass(), "name", "kBdSllIBVz");
        setField(term1477, term1477.getClass(), "nickName", "TJmVBGfTML");
        setField(term1477, term1477.getClass(), "phoneNumber", "tPlsykYBqO");
        setField(term1477, term1477.getClass(), "registrationChannel", "bLPjGVBhlX");
        setLongField(term1574, term1574.getClass(), "fastTime", 1347400561385L);
        setField(term1574, term1574.getClass(), "cdate", null);
        setField(term1477, term1477.getClass(), "registrationTime", term1574);
        setLongField(term1576, term1576.getClass(), "fastTime", 1502158153899L);
        setField(term1576, term1576.getClass(), "cdate", null);
        setField(term1477, term1477.getClass(), "logoutTime", term1576);
        setField(term1477, term1477.getClass(), "status", "whBvTVIIlC");
        setField(term1477, term1477.getClass(), "tenantId", "IgRJUzaCwW");
        setLongField(term1602, term1602.getClass(), "fastTime", 1630952644759L);
        setField(term1602, term1602.getClass(), "cdate", null);
        setField(term1477, term1477.getClass(), "createTime", term1602);
        setLongField(term1604, term1604.getClass(), "fastTime", 1739417792956L);
        setField(term1604, term1604.getClass(), "cdate", null);
        setField(term1477, term1477.getClass(), "updateTime", term1604);
        setField(term1477, term1477.getClass(), "deleted", term1606);
        setField(term1477, term1477.getClass(), "version", term1608);
        setField(term1477, term1477.getClass(), "createBy", "JUmudUmaaV");
        setField(term1477, term1477.getClass(), "updateBy", "KoyGrUJeJW");
        setLongField(term1634, term1634.getClass(), "fastTime", 1329640267573L);
        setField(term1634, term1634.getClass(), "cdate", null);
        setField(term1477, term1477.getClass(), "firstRechargeTime", term1634);
        setField(term1477, term1477.getClass(), "totalRechargeAmount", term1636);
        setField(term1477, term1477.getClass(), "totalGiftAmount", term1638);
        setField(term1477, term1477.getClass(), "walletBalance", term1640);
        setField(term1477, term1477.getClass(), "frozenAmount", term1642);
        setField(term1477, term1477.getClass(), "totalRefund", term1644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThirdType", argTypes, term1477, args);
    }

};


