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

public class ThirdUserPO_equals_2856124550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14437;
     Object term14606;

    public ThirdUserPO_equals_2856124550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14566 = new Integer(1922684808);
        Integer term14568 = new Integer(-2005784375);
        Integer term14596 = new Integer(-288604325);
        Integer term14598 = new Integer(-1268314569);
        Integer term14600 = new Integer(877649659);
        Integer term14602 = new Integer(-1332748804);
        Integer term14604 = new Integer(1774507971);
        term14437 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term14534 = newInstance(Class.forName("java.util.Date"));
        Object term14536 = newInstance(Class.forName("java.util.Date"));
        Object term14562 = newInstance(Class.forName("java.util.Date"));
        Object term14564 = newInstance(Class.forName("java.util.Date"));
        Object term14594 = newInstance(Class.forName("java.util.Date"));
        setField(term14437, term14437.getClass(), "pkUserId", "ndAITnOsny");
        setField(term14437, term14437.getClass(), "thirdUserId", "CVZnTiJucs");
        setField(term14437, term14437.getClass(), "thirdType", "ecHEQufXoq");
        setField(term14437, term14437.getClass(), "unionId", "btBLMvHzJg");
        setField(term14437, term14437.getClass(), "name", "JdOMfNWgLP");
        setField(term14437, term14437.getClass(), "nickName", "uWqXrwAsDU");
        setField(term14437, term14437.getClass(), "phoneNumber", "hgFbWAUtsu");
        setField(term14437, term14437.getClass(), "registrationChannel", "HqoTWlkbwF");
        setLongField(term14534, term14534.getClass(), "fastTime", 1418905725858L);
        setField(term14534, term14534.getClass(), "cdate", null);
        setField(term14437, term14437.getClass(), "registrationTime", term14534);
        setLongField(term14536, term14536.getClass(), "fastTime", 1837509436971L);
        setField(term14536, term14536.getClass(), "cdate", null);
        setField(term14437, term14437.getClass(), "logoutTime", term14536);
        setField(term14437, term14437.getClass(), "status", "CwNELDTAPP");
        setField(term14437, term14437.getClass(), "tenantId", "GSzQdbHLHw");
        setLongField(term14562, term14562.getClass(), "fastTime", 1732178131235L);
        setField(term14562, term14562.getClass(), "cdate", null);
        setField(term14437, term14437.getClass(), "createTime", term14562);
        setLongField(term14564, term14564.getClass(), "fastTime", 1498615326814L);
        setField(term14564, term14564.getClass(), "cdate", null);
        setField(term14437, term14437.getClass(), "updateTime", term14564);
        setField(term14437, term14437.getClass(), "deleted", term14566);
        setField(term14437, term14437.getClass(), "version", term14568);
        setField(term14437, term14437.getClass(), "createBy", "IkfarsYNJO");
        setField(term14437, term14437.getClass(), "updateBy", "aZKOWhHMEh");
        setLongField(term14594, term14594.getClass(), "fastTime", 1578543231879L);
        setField(term14594, term14594.getClass(), "cdate", null);
        setField(term14437, term14437.getClass(), "firstRechargeTime", term14594);
        setField(term14437, term14437.getClass(), "totalRechargeAmount", term14596);
        setField(term14437, term14437.getClass(), "totalGiftAmount", term14598);
        setField(term14437, term14437.getClass(), "walletBalance", term14600);
        setField(term14437, term14437.getClass(), "frozenAmount", term14602);
        setField(term14437, term14437.getClass(), "totalRefund", term14604);
        term14606 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14606;
        callMethod(klass, "equals", argTypes, term14437, args);
    }

};


