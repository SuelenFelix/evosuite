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

public class ThirdUserPO_getThirdUserId_1480084914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;

    public ThirdUserPO_getThirdUserId_1480084914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1006 = new Integer(-1685132342);
        Integer term1008 = new Integer(-1456670397);
        Integer term1036 = new Integer(1622346318);
        Integer term1038 = new Integer(1048535127);
        Integer term1040 = new Integer(-655067527);
        Integer term1042 = new Integer(-6029667);
        Integer term1044 = new Integer(-2068769794);
        term877 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term974 = newInstance(Class.forName("java.util.Date"));
        Object term976 = newInstance(Class.forName("java.util.Date"));
        Object term1002 = newInstance(Class.forName("java.util.Date"));
        Object term1004 = newInstance(Class.forName("java.util.Date"));
        Object term1034 = newInstance(Class.forName("java.util.Date"));
        setField(term877, term877.getClass(), "pkUserId", "IDCWpPLRkE");
        setField(term877, term877.getClass(), "thirdUserId", "nyiiPDVjAc");
        setField(term877, term877.getClass(), "thirdType", "aKnKipADSo");
        setField(term877, term877.getClass(), "unionId", "wSQxaModmm");
        setField(term877, term877.getClass(), "name", "UlajhuVLaP");
        setField(term877, term877.getClass(), "nickName", "gGSMzuGICf");
        setField(term877, term877.getClass(), "phoneNumber", "hxCBltsObl");
        setField(term877, term877.getClass(), "registrationChannel", "BndsHwAFMv");
        setLongField(term974, term974.getClass(), "fastTime", 1706078172457L);
        setField(term974, term974.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "registrationTime", term974);
        setLongField(term976, term976.getClass(), "fastTime", 1863631094992L);
        setField(term976, term976.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "logoutTime", term976);
        setField(term877, term877.getClass(), "status", "GzFkzHGYFt");
        setField(term877, term877.getClass(), "tenantId", "tShwQLRGNe");
        setLongField(term1002, term1002.getClass(), "fastTime", 1882638884364L);
        setField(term1002, term1002.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "createTime", term1002);
        setLongField(term1004, term1004.getClass(), "fastTime", 1437757323580L);
        setField(term1004, term1004.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "updateTime", term1004);
        setField(term877, term877.getClass(), "deleted", term1006);
        setField(term877, term877.getClass(), "version", term1008);
        setField(term877, term877.getClass(), "createBy", "LvtrsXUliU");
        setField(term877, term877.getClass(), "updateBy", "xLbjWUgOIL");
        setLongField(term1034, term1034.getClass(), "fastTime", 1668569229825L);
        setField(term1034, term1034.getClass(), "cdate", null);
        setField(term877, term877.getClass(), "firstRechargeTime", term1034);
        setField(term877, term877.getClass(), "totalRechargeAmount", term1036);
        setField(term877, term877.getClass(), "totalGiftAmount", term1038);
        setField(term877, term877.getClass(), "walletBalance", term1040);
        setField(term877, term877.getClass(), "frozenAmount", term1042);
        setField(term877, term877.getClass(), "totalRefund", term1044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getThirdUserId", argTypes, term877, args);
    }

};


