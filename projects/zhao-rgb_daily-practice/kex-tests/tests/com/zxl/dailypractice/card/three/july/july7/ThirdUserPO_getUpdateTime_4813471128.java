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

public class ThirdUserPO_getUpdateTime_4813471128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8017;

    public ThirdUserPO_getUpdateTime_4813471128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8146 = new Integer(-506958186);
        Integer term8148 = new Integer(-507387516);
        Integer term8176 = new Integer(-1970452551);
        Integer term8178 = new Integer(-1896376975);
        Integer term8180 = new Integer(729658803);
        Integer term8182 = new Integer(114754804);
        Integer term8184 = new Integer(1687361082);
        term8017 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term8114 = newInstance(Class.forName("java.util.Date"));
        Object term8116 = newInstance(Class.forName("java.util.Date"));
        Object term8142 = newInstance(Class.forName("java.util.Date"));
        Object term8144 = newInstance(Class.forName("java.util.Date"));
        Object term8174 = newInstance(Class.forName("java.util.Date"));
        setField(term8017, term8017.getClass(), "pkUserId", "iuCxnHGMoW");
        setField(term8017, term8017.getClass(), "thirdUserId", "GPSEWEDSTo");
        setField(term8017, term8017.getClass(), "thirdType", "RCOqfVsRHt");
        setField(term8017, term8017.getClass(), "unionId", "TSyCeEZPaT");
        setField(term8017, term8017.getClass(), "name", "JeZFtaqkzW");
        setField(term8017, term8017.getClass(), "nickName", "vOVuNSCCLe");
        setField(term8017, term8017.getClass(), "phoneNumber", "fzeqPnzpnt");
        setField(term8017, term8017.getClass(), "registrationChannel", "RxbhrFBjkO");
        setLongField(term8114, term8114.getClass(), "fastTime", 1518785790701L);
        setField(term8114, term8114.getClass(), "cdate", null);
        setField(term8017, term8017.getClass(), "registrationTime", term8114);
        setLongField(term8116, term8116.getClass(), "fastTime", 1563503265459L);
        setField(term8116, term8116.getClass(), "cdate", null);
        setField(term8017, term8017.getClass(), "logoutTime", term8116);
        setField(term8017, term8017.getClass(), "status", "aanyiAOJCl");
        setField(term8017, term8017.getClass(), "tenantId", "VDokbsCuqq");
        setLongField(term8142, term8142.getClass(), "fastTime", 1416726423958L);
        setField(term8142, term8142.getClass(), "cdate", null);
        setField(term8017, term8017.getClass(), "createTime", term8142);
        setLongField(term8144, term8144.getClass(), "fastTime", 1650014053723L);
        setField(term8144, term8144.getClass(), "cdate", null);
        setField(term8017, term8017.getClass(), "updateTime", term8144);
        setField(term8017, term8017.getClass(), "deleted", term8146);
        setField(term8017, term8017.getClass(), "version", term8148);
        setField(term8017, term8017.getClass(), "createBy", "xClUIcPECX");
        setField(term8017, term8017.getClass(), "updateBy", "avhRaGZaBF");
        setLongField(term8174, term8174.getClass(), "fastTime", 1537221086922L);
        setField(term8174, term8174.getClass(), "cdate", null);
        setField(term8017, term8017.getClass(), "firstRechargeTime", term8174);
        setField(term8017, term8017.getClass(), "totalRechargeAmount", term8176);
        setField(term8017, term8017.getClass(), "totalGiftAmount", term8178);
        setField(term8017, term8017.getClass(), "walletBalance", term8180);
        setField(term8017, term8017.getClass(), "frozenAmount", term8182);
        setField(term8017, term8017.getClass(), "totalRefund", term8184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateTime", argTypes, term8017, args);
    }

};


