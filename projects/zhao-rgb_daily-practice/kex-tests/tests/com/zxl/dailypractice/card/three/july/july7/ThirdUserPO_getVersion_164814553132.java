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

public class ThirdUserPO_getVersion_164814553132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9177;

    public ThirdUserPO_getVersion_164814553132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9306 = new Integer(-749861210);
        Integer term9308 = new Integer(1694224101);
        Integer term9336 = new Integer(937859191);
        Integer term9338 = new Integer(-916584829);
        Integer term9340 = new Integer(-2131181468);
        Integer term9342 = new Integer(282916351);
        Integer term9344 = new Integer(880977281);
        term9177 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term9274 = newInstance(Class.forName("java.util.Date"));
        Object term9276 = newInstance(Class.forName("java.util.Date"));
        Object term9302 = newInstance(Class.forName("java.util.Date"));
        Object term9304 = newInstance(Class.forName("java.util.Date"));
        Object term9334 = newInstance(Class.forName("java.util.Date"));
        setField(term9177, term9177.getClass(), "pkUserId", "NFlvfJCVPO");
        setField(term9177, term9177.getClass(), "thirdUserId", "KarbTXFmUU");
        setField(term9177, term9177.getClass(), "thirdType", "jiUSjqwSIQ");
        setField(term9177, term9177.getClass(), "unionId", "MgLCedQfoj");
        setField(term9177, term9177.getClass(), "name", "zgKiINdgNu");
        setField(term9177, term9177.getClass(), "nickName", "zLMTXDQHYH");
        setField(term9177, term9177.getClass(), "phoneNumber", "PqywFWJlpE");
        setField(term9177, term9177.getClass(), "registrationChannel", "OzXRsFGTIp");
        setLongField(term9274, term9274.getClass(), "fastTime", 1840780783490L);
        setField(term9274, term9274.getClass(), "cdate", null);
        setField(term9177, term9177.getClass(), "registrationTime", term9274);
        setLongField(term9276, term9276.getClass(), "fastTime", 1402603630583L);
        setField(term9276, term9276.getClass(), "cdate", null);
        setField(term9177, term9177.getClass(), "logoutTime", term9276);
        setField(term9177, term9177.getClass(), "status", "TjWpyghUWN");
        setField(term9177, term9177.getClass(), "tenantId", "dkZFDZxcde");
        setLongField(term9302, term9302.getClass(), "fastTime", 1303219614891L);
        setField(term9302, term9302.getClass(), "cdate", null);
        setField(term9177, term9177.getClass(), "createTime", term9302);
        setLongField(term9304, term9304.getClass(), "fastTime", 1798212749741L);
        setField(term9304, term9304.getClass(), "cdate", null);
        setField(term9177, term9177.getClass(), "updateTime", term9304);
        setField(term9177, term9177.getClass(), "deleted", term9306);
        setField(term9177, term9177.getClass(), "version", term9308);
        setField(term9177, term9177.getClass(), "createBy", "WXcZEtUKlI");
        setField(term9177, term9177.getClass(), "updateBy", "IkpjUOuWQU");
        setLongField(term9334, term9334.getClass(), "fastTime", 1408294742367L);
        setField(term9334, term9334.getClass(), "cdate", null);
        setField(term9177, term9177.getClass(), "firstRechargeTime", term9334);
        setField(term9177, term9177.getClass(), "totalRechargeAmount", term9336);
        setField(term9177, term9177.getClass(), "totalGiftAmount", term9338);
        setField(term9177, term9177.getClass(), "walletBalance", term9340);
        setField(term9177, term9177.getClass(), "frozenAmount", term9342);
        setField(term9177, term9177.getClass(), "totalRefund", term9344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term9177, args);
    }

};


