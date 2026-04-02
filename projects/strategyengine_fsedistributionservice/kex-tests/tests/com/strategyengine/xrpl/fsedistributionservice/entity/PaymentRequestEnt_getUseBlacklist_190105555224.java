package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_getUseBlacklist_190105555224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148760;

    public PaymentRequestEnt_getUseBlacklist_190105555224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term148761 = new Long(3453457027014743006L);
        Class<? extends Object> term149074 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term149073 = ((Class) term149074).getDeclaredField((String) "COMPLETE");
        ((Field) term149073).setAccessible(true);
        Object enum265 = ((Field) term149073).get((Object) null);
        Class<? extends Object> term149580 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term149579 = ((Class) term149580).getDeclaredField((String) "FLAT");
        ((Field) term149579).setAccessible(true);
        Object enum266 = ((Field) term149579).get((Object) null);
        Boolean term148921 = new Boolean(true);
        Boolean term148923 = new Boolean(false);
        Integer term148925 = new Integer(-1210583429);
        Class<? extends Object> term149954 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term149953 = ((Class) term149954).getDeclaredField((String) "GLOBALID");
        ((Field) term149953).setAccessible(true);
        Object enum267 = ((Field) term149953).get((Object) null);
        Long term149011 = new Long(3931473624300151730L);
        Long term149025 = new Long(661905373566913125L);
        Boolean term149039 = new Boolean(true);
        term148760 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term148787 = newInstance(Class.forName("java.util.Date"));
        Object term148789 = newInstance(Class.forName("java.util.Date"));
        Object term148791 = newInstance(Class.forName("java.util.Date"));
        setField(term148760, term148760.getClass(), "id", term148761);
        setField(term148760, term148760.getClass(), "environment", "ucTcadpUdW");
        setField(term148760, term148760.getClass(), "populateEnvironment", "AscVKZhCwm");
        setLongField(term148787, term148787.getClass(), "fastTime", 1715302849242L);
        setField(term148787, term148787.getClass(), "cdate", null);
        setField(term148760, term148760.getClass(), "createDate", term148787);
        setLongField(term148789, term148789.getClass(), "fastTime", 1562237802749L);
        setField(term148789, term148789.getClass(), "cdate", null);
        setField(term148760, term148760.getClass(), "updateDate", term148789);
        setLongField(term148791, term148791.getClass(), "fastTime", 1418073237580L);
        setField(term148791, term148791.getClass(), "cdate", null);
        setField(term148760, term148760.getClass(), "startTime", term148791);
        setField(term148760, term148760.getClass(), "status", enum265);
        setField(term148760, term148760.getClass(), "fromClassicAddress", "HCvSsQWjLn");
        setField(term148760, term148760.getClass(), "fromSigningPublicKey", "FTuOcSieav");
        setField(term148760, term148760.getClass(), "fromPrivateKey", "qSnwPXRuzC");
        setField(term148760, term148760.getClass(), "trustlineIssuerClassicAddress", "gqhqalMaKC");
        setField(term148760, term148760.getClass(), "currencyName", "qkMduZHBXR");
        setField(term148760, term148760.getClass(), "snapshotTrustlineIssuerClassicAddress", "jMQsCLYfKd");
        setField(term148760, term148760.getClass(), "snapshotCurrencyName", "dpcpGqEQLd");
        setField(term148760, term148760.getClass(), "currencyNameForProcess", "pButgbcWlR");
        setField(term148760, term148760.getClass(), "amount", "tPiZMhJIXj");
        setField(term148760, term148760.getClass(), "paymentType", enum266);
        setField(term148760, term148760.getClass(), "newTrustlinesOnly", term148921);
        setField(term148760, term148760.getClass(), "useBlacklist", term148923);
        setField(term148760, term148760.getClass(), "maximumTrustlines", term148925);
        setField(term148760, term148760.getClass(), "dropType", enum267);
        setField(term148760, term148760.getClass(), "lockUuid", "lrEkNimddJ");
        setField(term148760, term148760.getClass(), "failReason", "fkeYGEUxMA");
        setField(term148760, term148760.getClass(), "feesPaid", "aJUGPodUIW");
        setField(term148760, term148760.getClass(), "minBalance", "NpjPDfnDRd");
        setField(term148760, term148760.getClass(), "maxBalance", "SWMYovqYdk");
        setField(term148760, term148760.getClass(), "maxXrpFeePerTransaction", "TQuvAoQcBe");
        setField(term148760, term148760.getClass(), "retryOfId", term149011);
        setField(term148760, term148760.getClass(), "nftIssuerAddress", "nGYLfZrtWO");
        setField(term148760, term148760.getClass(), "nftTaxon", term149025);
        setField(term148760, term148760.getClass(), "contactEmail", "DBufEhhBCQ");
        setField(term148760, term148760.getClass(), "autoApprove", term149039);
        setField(term148760, term148760.getClass(), "memo", "GiNZRBZjgO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUseBlacklist", argTypes, term148760, args);
    }

};


