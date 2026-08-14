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

public class ThirdUserPO_setVersion_213663287933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9466;
     Object term9635;

    public ThirdUserPO_setVersion_213663287933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9595 = new Integer(371943306);
        Integer term9597 = new Integer(982388293);
        Integer term9625 = new Integer(-159494544);
        Integer term9627 = new Integer(-75206835);
        Integer term9629 = new Integer(-1618206977);
        Integer term9631 = new Integer(-1747406163);
        Integer term9633 = new Integer(388157121);
        term9466 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term9563 = newInstance(Class.forName("java.util.Date"));
        Object term9565 = newInstance(Class.forName("java.util.Date"));
        Object term9591 = newInstance(Class.forName("java.util.Date"));
        Object term9593 = newInstance(Class.forName("java.util.Date"));
        Object term9623 = newInstance(Class.forName("java.util.Date"));
        setField(term9466, term9466.getClass(), "pkUserId", "boSSpezHeU");
        setField(term9466, term9466.getClass(), "thirdUserId", "OUeBWNTQDh");
        setField(term9466, term9466.getClass(), "thirdType", "gltJarNuUk");
        setField(term9466, term9466.getClass(), "unionId", "ZwZIDwYcSW");
        setField(term9466, term9466.getClass(), "name", "sOdkipUKRu");
        setField(term9466, term9466.getClass(), "nickName", "oKwCDqywym");
        setField(term9466, term9466.getClass(), "phoneNumber", "zjZYTddemL");
        setField(term9466, term9466.getClass(), "registrationChannel", "QtrylgCLiF");
        setLongField(term9563, term9563.getClass(), "fastTime", 1643981144410L);
        setField(term9563, term9563.getClass(), "cdate", null);
        setField(term9466, term9466.getClass(), "registrationTime", term9563);
        setLongField(term9565, term9565.getClass(), "fastTime", 1615579184168L);
        setField(term9565, term9565.getClass(), "cdate", null);
        setField(term9466, term9466.getClass(), "logoutTime", term9565);
        setField(term9466, term9466.getClass(), "status", "orEuhCStGM");
        setField(term9466, term9466.getClass(), "tenantId", "HhEaSXWvrY");
        setLongField(term9591, term9591.getClass(), "fastTime", 1440882974759L);
        setField(term9591, term9591.getClass(), "cdate", null);
        setField(term9466, term9466.getClass(), "createTime", term9591);
        setLongField(term9593, term9593.getClass(), "fastTime", 1603614229871L);
        setField(term9593, term9593.getClass(), "cdate", null);
        setField(term9466, term9466.getClass(), "updateTime", term9593);
        setField(term9466, term9466.getClass(), "deleted", term9595);
        setField(term9466, term9466.getClass(), "version", term9597);
        setField(term9466, term9466.getClass(), "createBy", "CVRGEomOth");
        setField(term9466, term9466.getClass(), "updateBy", "vSeruUyNWX");
        setLongField(term9623, term9623.getClass(), "fastTime", 1861021148230L);
        setField(term9623, term9623.getClass(), "cdate", null);
        setField(term9466, term9466.getClass(), "firstRechargeTime", term9623);
        setField(term9466, term9466.getClass(), "totalRechargeAmount", term9625);
        setField(term9466, term9466.getClass(), "totalGiftAmount", term9627);
        setField(term9466, term9466.getClass(), "walletBalance", term9629);
        setField(term9466, term9466.getClass(), "frozenAmount", term9631);
        setField(term9466, term9466.getClass(), "totalRefund", term9633);
        term9635 = new Integer(1684998508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9635;
        callMethod(klass, "setVersion", argTypes, term9466, args);
    }

};


