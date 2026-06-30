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

public class ThirdUserPO_getFrozenAmount_44222197746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13277;

    public ThirdUserPO_getFrozenAmount_44222197746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13406 = new Integer(1466373988);
        Integer term13408 = new Integer(-358526505);
        Integer term13436 = new Integer(1843268026);
        Integer term13438 = new Integer(954660603);
        Integer term13440 = new Integer(-1351605385);
        Integer term13442 = new Integer(278355793);
        Integer term13444 = new Integer(-310648604);
        term13277 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term13374 = newInstance(Class.forName("java.util.Date"));
        Object term13376 = newInstance(Class.forName("java.util.Date"));
        Object term13402 = newInstance(Class.forName("java.util.Date"));
        Object term13404 = newInstance(Class.forName("java.util.Date"));
        Object term13434 = newInstance(Class.forName("java.util.Date"));
        setField(term13277, term13277.getClass(), "pkUserId", "VBUahCvyxC");
        setField(term13277, term13277.getClass(), "thirdUserId", "MlzTkzKMCX");
        setField(term13277, term13277.getClass(), "thirdType", "UqKUbMyPMJ");
        setField(term13277, term13277.getClass(), "unionId", "QpYltHAdyY");
        setField(term13277, term13277.getClass(), "name", "lbmSGBwIiV");
        setField(term13277, term13277.getClass(), "nickName", "DAxyHoTLzZ");
        setField(term13277, term13277.getClass(), "phoneNumber", "fhZgTouhCC");
        setField(term13277, term13277.getClass(), "registrationChannel", "wrikqJwXvL");
        setLongField(term13374, term13374.getClass(), "fastTime", 1273578766014L);
        setField(term13374, term13374.getClass(), "cdate", null);
        setField(term13277, term13277.getClass(), "registrationTime", term13374);
        setLongField(term13376, term13376.getClass(), "fastTime", 1539725848213L);
        setField(term13376, term13376.getClass(), "cdate", null);
        setField(term13277, term13277.getClass(), "logoutTime", term13376);
        setField(term13277, term13277.getClass(), "status", "UiWhvbypdr");
        setField(term13277, term13277.getClass(), "tenantId", "CgleElJNje");
        setLongField(term13402, term13402.getClass(), "fastTime", 1623031057805L);
        setField(term13402, term13402.getClass(), "cdate", null);
        setField(term13277, term13277.getClass(), "createTime", term13402);
        setLongField(term13404, term13404.getClass(), "fastTime", 1667564808637L);
        setField(term13404, term13404.getClass(), "cdate", null);
        setField(term13277, term13277.getClass(), "updateTime", term13404);
        setField(term13277, term13277.getClass(), "deleted", term13406);
        setField(term13277, term13277.getClass(), "version", term13408);
        setField(term13277, term13277.getClass(), "createBy", "ZrchvNGMtd");
        setField(term13277, term13277.getClass(), "updateBy", "WaEcyVlcIx");
        setLongField(term13434, term13434.getClass(), "fastTime", 1263034920868L);
        setField(term13434, term13434.getClass(), "cdate", null);
        setField(term13277, term13277.getClass(), "firstRechargeTime", term13434);
        setField(term13277, term13277.getClass(), "totalRechargeAmount", term13436);
        setField(term13277, term13277.getClass(), "totalGiftAmount", term13438);
        setField(term13277, term13277.getClass(), "walletBalance", term13440);
        setField(term13277, term13277.getClass(), "frozenAmount", term13442);
        setField(term13277, term13277.getClass(), "totalRefund", term13444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrozenAmount", argTypes, term13277, args);
    }

};


