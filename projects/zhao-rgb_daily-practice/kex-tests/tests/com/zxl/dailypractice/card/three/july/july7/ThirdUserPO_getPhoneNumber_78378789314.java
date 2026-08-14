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

public class ThirdUserPO_getPhoneNumber_78378789314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3877;

    public ThirdUserPO_getPhoneNumber_78378789314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4006 = new Integer(-1547384488);
        Integer term4008 = new Integer(1442160736);
        Integer term4036 = new Integer(1114000454);
        Integer term4038 = new Integer(-556405712);
        Integer term4040 = new Integer(-1772434990);
        Integer term4042 = new Integer(-1845499264);
        Integer term4044 = new Integer(-505439934);
        term3877 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term3974 = newInstance(Class.forName("java.util.Date"));
        Object term3976 = newInstance(Class.forName("java.util.Date"));
        Object term4002 = newInstance(Class.forName("java.util.Date"));
        Object term4004 = newInstance(Class.forName("java.util.Date"));
        Object term4034 = newInstance(Class.forName("java.util.Date"));
        setField(term3877, term3877.getClass(), "pkUserId", "BRIVNtfUWU");
        setField(term3877, term3877.getClass(), "thirdUserId", "DbiCVtPPCT");
        setField(term3877, term3877.getClass(), "thirdType", "WzFopsaDuG");
        setField(term3877, term3877.getClass(), "unionId", "PapWxkhEWe");
        setField(term3877, term3877.getClass(), "name", "smnHEqRFRx");
        setField(term3877, term3877.getClass(), "nickName", "XYtryyobou");
        setField(term3877, term3877.getClass(), "phoneNumber", "OYbzXylRWW");
        setField(term3877, term3877.getClass(), "registrationChannel", "DSNsTGYXDF");
        setLongField(term3974, term3974.getClass(), "fastTime", 1332871705432L);
        setField(term3974, term3974.getClass(), "cdate", null);
        setField(term3877, term3877.getClass(), "registrationTime", term3974);
        setLongField(term3976, term3976.getClass(), "fastTime", 1597233967116L);
        setField(term3976, term3976.getClass(), "cdate", null);
        setField(term3877, term3877.getClass(), "logoutTime", term3976);
        setField(term3877, term3877.getClass(), "status", "sQvGcVjdEx");
        setField(term3877, term3877.getClass(), "tenantId", "rLHAoqXgPh");
        setLongField(term4002, term4002.getClass(), "fastTime", 1276505397937L);
        setField(term4002, term4002.getClass(), "cdate", null);
        setField(term3877, term3877.getClass(), "createTime", term4002);
        setLongField(term4004, term4004.getClass(), "fastTime", 1278177575793L);
        setField(term4004, term4004.getClass(), "cdate", null);
        setField(term3877, term3877.getClass(), "updateTime", term4004);
        setField(term3877, term3877.getClass(), "deleted", term4006);
        setField(term3877, term3877.getClass(), "version", term4008);
        setField(term3877, term3877.getClass(), "createBy", "zUlRdimJtU");
        setField(term3877, term3877.getClass(), "updateBy", "vwbEQQNQrx");
        setLongField(term4034, term4034.getClass(), "fastTime", 1272776321768L);
        setField(term4034, term4034.getClass(), "cdate", null);
        setField(term3877, term3877.getClass(), "firstRechargeTime", term4034);
        setField(term3877, term3877.getClass(), "totalRechargeAmount", term4036);
        setField(term3877, term3877.getClass(), "totalGiftAmount", term4038);
        setField(term3877, term3877.getClass(), "walletBalance", term4040);
        setField(term3877, term3877.getClass(), "frozenAmount", term4042);
        setField(term3877, term3877.getClass(), "totalRefund", term4044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhoneNumber", argTypes, term3877, args);
    }

};


