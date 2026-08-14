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

public class ThirdUserPO_setTotalGiftAmount_136074394143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12406;
     Object term12575;

    public ThirdUserPO_setTotalGiftAmount_136074394143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12535 = new Integer(1901317214);
        Integer term12537 = new Integer(1166710220);
        Integer term12565 = new Integer(-1070592289);
        Integer term12567 = new Integer(-1464172784);
        Integer term12569 = new Integer(32185364);
        Integer term12571 = new Integer(1768204942);
        Integer term12573 = new Integer(1252951645);
        term12406 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term12503 = newInstance(Class.forName("java.util.Date"));
        Object term12505 = newInstance(Class.forName("java.util.Date"));
        Object term12531 = newInstance(Class.forName("java.util.Date"));
        Object term12533 = newInstance(Class.forName("java.util.Date"));
        Object term12563 = newInstance(Class.forName("java.util.Date"));
        setField(term12406, term12406.getClass(), "pkUserId", "LrqwfrKKtS");
        setField(term12406, term12406.getClass(), "thirdUserId", "ZUdnQXfzCI");
        setField(term12406, term12406.getClass(), "thirdType", "EULDrUNQvw");
        setField(term12406, term12406.getClass(), "unionId", "BtvAvsJSei");
        setField(term12406, term12406.getClass(), "name", "vqnBkkxoIa");
        setField(term12406, term12406.getClass(), "nickName", "bycpZjxXFn");
        setField(term12406, term12406.getClass(), "phoneNumber", "jQWttOAiwL");
        setField(term12406, term12406.getClass(), "registrationChannel", "DzKFxEuEEC");
        setLongField(term12503, term12503.getClass(), "fastTime", 1337283931231L);
        setField(term12503, term12503.getClass(), "cdate", null);
        setField(term12406, term12406.getClass(), "registrationTime", term12503);
        setLongField(term12505, term12505.getClass(), "fastTime", 1291742269425L);
        setField(term12505, term12505.getClass(), "cdate", null);
        setField(term12406, term12406.getClass(), "logoutTime", term12505);
        setField(term12406, term12406.getClass(), "status", "CAMnvfDLJL");
        setField(term12406, term12406.getClass(), "tenantId", "mfHtgSbdjD");
        setLongField(term12531, term12531.getClass(), "fastTime", 1372844831512L);
        setField(term12531, term12531.getClass(), "cdate", null);
        setField(term12406, term12406.getClass(), "createTime", term12531);
        setLongField(term12533, term12533.getClass(), "fastTime", 1854285818602L);
        setField(term12533, term12533.getClass(), "cdate", null);
        setField(term12406, term12406.getClass(), "updateTime", term12533);
        setField(term12406, term12406.getClass(), "deleted", term12535);
        setField(term12406, term12406.getClass(), "version", term12537);
        setField(term12406, term12406.getClass(), "createBy", "cmuaUiHMVL");
        setField(term12406, term12406.getClass(), "updateBy", "xjoSGPWUgu");
        setLongField(term12563, term12563.getClass(), "fastTime", 1330527043188L);
        setField(term12563, term12563.getClass(), "cdate", null);
        setField(term12406, term12406.getClass(), "firstRechargeTime", term12563);
        setField(term12406, term12406.getClass(), "totalRechargeAmount", term12565);
        setField(term12406, term12406.getClass(), "totalGiftAmount", term12567);
        setField(term12406, term12406.getClass(), "walletBalance", term12569);
        setField(term12406, term12406.getClass(), "frozenAmount", term12571);
        setField(term12406, term12406.getClass(), "totalRefund", term12573);
        term12575 = new Integer(574481092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term12575;
        callMethod(klass, "setTotalGiftAmount", argTypes, term12406, args);
    }

};


