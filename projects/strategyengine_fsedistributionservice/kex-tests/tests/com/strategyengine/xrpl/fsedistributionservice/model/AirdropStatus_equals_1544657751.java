package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_equals_1544657751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88618;
     Object term88854;

    public AirdropStatus_equals_1544657751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term88619 = new ArrayList();
        Long term88623 = new Long(3238645206498300107L);
        Class<? extends Object> term88856 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term88855 = ((Class) term88856).getDeclaredField((String) "WEEKLY");
        ((Field) term88855).setAccessible(true);
        Object enum154 = ((Field) term88855).get((Object) null);
        Class<? extends Object> term89350 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term89349 = ((Class) term89350).getDeclaredField((String) "COMPLETE");
        ((Field) term89349).setAccessible(true);
        Object enum155 = ((Field) term89349).get((Object) null);
        Integer term88717 = new Integer(-1772434990);
        Class<? extends Object> term89892 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term89891 = ((Class) term89892).getDeclaredField((String) "TRUSTLINE");
        ((Field) term89891).setAccessible(true);
        Object enum156 = ((Field) term89891).get((Object) null);
        Long term88768 = new Long(-1592696983130738594L);
        Long term88782 = new Long(6902365338255307910L);
        Class<? extends Object> term90306 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term90305 = ((Class) term90306).getDeclaredField((String) "FLAT");
        ((Field) term90305).setAccessible(true);
        Object enum157 = ((Field) term90305).get((Object) null);
        Class<? extends Object> term90754 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term90753 = ((Class) term90754).getDeclaredField((String) "COMPLETE");
        ((Field) term90753).setAccessible(true);
        Object enum158 = ((Field) term90753).get((Object) null);
        Long term88852 = new Long(-8019730974733786399L);
        term88618 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term88625 = newInstance(Class.forName("java.util.Date"));
        Object term88627 = newInstance(Class.forName("java.util.Date"));
        Object term88629 = newInstance(Class.forName("java.util.Date"));
        Object term88631 = newInstance(Class.forName("java.util.Date"));
        setField(term88618, term88618.getClass(), "results", term88619);
        setField(term88618, term88618.getClass(), "id", term88623);
        setLongField(term88625, term88625.getClass(), "fastTime", 1293737598443L);
        setField(term88625, term88625.getClass(), "cdate", null);
        setField(term88618, term88618.getClass(), "createDate", term88625);
        setLongField(term88627, term88627.getClass(), "fastTime", 1818617156349L);
        setField(term88627, term88627.getClass(), "cdate", null);
        setField(term88618, term88618.getClass(), "updateDate", term88627);
        setLongField(term88629, term88629.getClass(), "fastTime", 1560286398870L);
        setField(term88629, term88629.getClass(), "cdate", null);
        setField(term88618, term88618.getClass(), "startTime", term88629);
        setLongField(term88631, term88631.getClass(), "fastTime", 1791294437021L);
        setField(term88631, term88631.getClass(), "cdate", null);
        setField(term88618, term88618.getClass(), "repeatUntilDate", term88631);
        setField(term88618, term88618.getClass(), "frequency", enum154);
        setField(term88618, term88618.getClass(), "status", enum155);
        setField(term88618, term88618.getClass(), "fromClassicAddress", "MbsTNUmNqV");
        setField(term88618, term88618.getClass(), "trustlineIssuerClassicAddress", "VdDIonpedU");
        setField(term88618, term88618.getClass(), "currencyName", "VjtXZcUFNx");
        setField(term88618, term88618.getClass(), "currencyNameForProcess", "bOZSTccXbt");
        setField(term88618, term88618.getClass(), "amount", "MBSsxxeNUU");
        setBooleanField(term88618, term88618.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term88618, term88618.getClass(), "useBlacklist", false);
        setField(term88618, term88618.getClass(), "maximumTrustlines", term88717);
        setField(term88618, term88618.getClass(), "dropType", enum156);
        setField(term88618, term88618.getClass(), "failReason", "NmUhmPLSgG");
        setField(term88618, term88618.getClass(), "minBalance", "WJosrfBMfA");
        setField(term88618, term88618.getClass(), "maxBalance", "ttlGywalKc");
        setField(term88618, term88618.getClass(), "totalBlacklisted", term88768);
        setField(term88618, term88618.getClass(), "maxXrpFeePerTransaction", "rQFBspqBzf");
        setField(term88618, term88618.getClass(), "totalRecipients", term88782);
        setField(term88618, term88618.getClass(), "paymentType", enum157);
        setField(term88618, term88618.getClass(), "snapshotTrustlineIssuerClassicAddress", "FmWhAOGAMI");
        setField(term88618, term88618.getClass(), "snapshotCurrencyName", "GdjCkRsIrS");
        setField(term88618, term88618.getClass(), "nftIssuingAddress", "MJNyYzLhkh");
        setField(term88618, term88618.getClass(), "nftTaxon", "DEugGJIaYt");
        setField(term88618, term88618.getClass(), "scheduleStatus", enum158);
        setField(term88618, term88618.getClass(), "fromScheduleId", term88852);
        term88854 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term88854;
        callMethod(klass, "equals", argTypes, term88618, args);
    }

};


