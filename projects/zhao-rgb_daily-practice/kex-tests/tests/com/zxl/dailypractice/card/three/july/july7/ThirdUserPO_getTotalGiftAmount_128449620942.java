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

public class ThirdUserPO_getTotalGiftAmount_128449620942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12117;

    public ThirdUserPO_getTotalGiftAmount_128449620942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12246 = new Integer(-916335264);
        Integer term12248 = new Integer(-919416536);
        Integer term12276 = new Integer(-43417861);
        Integer term12278 = new Integer(-1533843432);
        Integer term12280 = new Integer(-123338791);
        Integer term12282 = new Integer(-1467089634);
        Integer term12284 = new Integer(413548937);
        term12117 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term12214 = newInstance(Class.forName("java.util.Date"));
        Object term12216 = newInstance(Class.forName("java.util.Date"));
        Object term12242 = newInstance(Class.forName("java.util.Date"));
        Object term12244 = newInstance(Class.forName("java.util.Date"));
        Object term12274 = newInstance(Class.forName("java.util.Date"));
        setField(term12117, term12117.getClass(), "pkUserId", "OirVUQhauU");
        setField(term12117, term12117.getClass(), "thirdUserId", "GLbyDfbNZI");
        setField(term12117, term12117.getClass(), "thirdType", "oNLcCYDAsO");
        setField(term12117, term12117.getClass(), "unionId", "CNqMxLvtcJ");
        setField(term12117, term12117.getClass(), "name", "ktbqerIaKW");
        setField(term12117, term12117.getClass(), "nickName", "VoghngXfsK");
        setField(term12117, term12117.getClass(), "phoneNumber", "GbahCBMvct");
        setField(term12117, term12117.getClass(), "registrationChannel", "iiHBhsNFgk");
        setLongField(term12214, term12214.getClass(), "fastTime", 1608183479074L);
        setField(term12214, term12214.getClass(), "cdate", null);
        setField(term12117, term12117.getClass(), "registrationTime", term12214);
        setLongField(term12216, term12216.getClass(), "fastTime", 1482204276107L);
        setField(term12216, term12216.getClass(), "cdate", null);
        setField(term12117, term12117.getClass(), "logoutTime", term12216);
        setField(term12117, term12117.getClass(), "status", "HknsTajwxJ");
        setField(term12117, term12117.getClass(), "tenantId", "XtiurrVYKw");
        setLongField(term12242, term12242.getClass(), "fastTime", 1268671677540L);
        setField(term12242, term12242.getClass(), "cdate", null);
        setField(term12117, term12117.getClass(), "createTime", term12242);
        setLongField(term12244, term12244.getClass(), "fastTime", 1630055567491L);
        setField(term12244, term12244.getClass(), "cdate", null);
        setField(term12117, term12117.getClass(), "updateTime", term12244);
        setField(term12117, term12117.getClass(), "deleted", term12246);
        setField(term12117, term12117.getClass(), "version", term12248);
        setField(term12117, term12117.getClass(), "createBy", "rsumfoDNHa");
        setField(term12117, term12117.getClass(), "updateBy", "ceCWHUTQUM");
        setLongField(term12274, term12274.getClass(), "fastTime", 1335719982731L);
        setField(term12274, term12274.getClass(), "cdate", null);
        setField(term12117, term12117.getClass(), "firstRechargeTime", term12274);
        setField(term12117, term12117.getClass(), "totalRechargeAmount", term12276);
        setField(term12117, term12117.getClass(), "totalGiftAmount", term12278);
        setField(term12117, term12117.getClass(), "walletBalance", term12280);
        setField(term12117, term12117.getClass(), "frozenAmount", term12282);
        setField(term12117, term12117.getClass(), "totalRefund", term12284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalGiftAmount", argTypes, term12117, args);
    }

};


