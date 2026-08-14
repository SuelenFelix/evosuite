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

public class ThirdUserPO_setStatus_175828676423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6526;

    public ThirdUserPO_setStatus_175828676423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6655 = new Integer(-430151637);
        Integer term6657 = new Integer(-1697741339);
        Integer term6685 = new Integer(98922530);
        Integer term6687 = new Integer(-1388471422);
        Integer term6689 = new Integer(-1498296052);
        Integer term6691 = new Integer(2098647989);
        Integer term6693 = new Integer(1598895173);
        term6526 = newInstance(Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO"));
        Object term6623 = newInstance(Class.forName("java.util.Date"));
        Object term6625 = newInstance(Class.forName("java.util.Date"));
        Object term6651 = newInstance(Class.forName("java.util.Date"));
        Object term6653 = newInstance(Class.forName("java.util.Date"));
        Object term6683 = newInstance(Class.forName("java.util.Date"));
        setField(term6526, term6526.getClass(), "pkUserId", "GBOEuByOfr");
        setField(term6526, term6526.getClass(), "thirdUserId", "NHbOFFjyVK");
        setField(term6526, term6526.getClass(), "thirdType", "zaloBqlrSo");
        setField(term6526, term6526.getClass(), "unionId", "vvoLrMGCoN");
        setField(term6526, term6526.getClass(), "name", "pXdglvyrQe");
        setField(term6526, term6526.getClass(), "nickName", "OcfNzHYdki");
        setField(term6526, term6526.getClass(), "phoneNumber", "uPuCVuZYOI");
        setField(term6526, term6526.getClass(), "registrationChannel", "TweMFhxNdj");
        setLongField(term6623, term6623.getClass(), "fastTime", 1870028835492L);
        setField(term6623, term6623.getClass(), "cdate", null);
        setField(term6526, term6526.getClass(), "registrationTime", term6623);
        setLongField(term6625, term6625.getClass(), "fastTime", 1655668811013L);
        setField(term6625, term6625.getClass(), "cdate", null);
        setField(term6526, term6526.getClass(), "logoutTime", term6625);
        setField(term6526, term6526.getClass(), "status", "NBrvVzvQHe");
        setField(term6526, term6526.getClass(), "tenantId", "FjOiNAfBOc");
        setLongField(term6651, term6651.getClass(), "fastTime", 1319355084958L);
        setField(term6651, term6651.getClass(), "cdate", null);
        setField(term6526, term6526.getClass(), "createTime", term6651);
        setLongField(term6653, term6653.getClass(), "fastTime", 1676471642491L);
        setField(term6653, term6653.getClass(), "cdate", null);
        setField(term6526, term6526.getClass(), "updateTime", term6653);
        setField(term6526, term6526.getClass(), "deleted", term6655);
        setField(term6526, term6526.getClass(), "version", term6657);
        setField(term6526, term6526.getClass(), "createBy", "iCCsaLHohG");
        setField(term6526, term6526.getClass(), "updateBy", "NJhGgctbdj");
        setLongField(term6683, term6683.getClass(), "fastTime", 1724960506464L);
        setField(term6683, term6683.getClass(), "cdate", null);
        setField(term6526, term6526.getClass(), "firstRechargeTime", term6683);
        setField(term6526, term6526.getClass(), "totalRechargeAmount", term6685);
        setField(term6526, term6526.getClass(), "totalGiftAmount", term6687);
        setField(term6526, term6526.getClass(), "walletBalance", term6689);
        setField(term6526, term6526.getClass(), "frozenAmount", term6691);
        setField(term6526, term6526.getClass(), "totalRefund", term6693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.card.three.july.july7.ThirdUserPO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MYWYUeLGOp";
        callMethod(klass, "setStatus", argTypes, term6526, args);
    }

};


