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
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_getCreateDate_17796216497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107991;

    public AirdropStatus_getCreateDate_17796216497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107995 = new Long(2209808079059619773L);
        Class<? extends Object> term108267 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term108266 = ((Class) term108267).getDeclaredField((String) "VERIFIED");
        ((Field) term108266).setAccessible(true);
        Object enum195 = ((Field) term108266).get((Object) null);
        Object term107994 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term107994, term107994.getClass(), "id", term107995);
        setField(term107994, term107994.getClass(), "responseCode", "");
        setField(term107994, term107994.getClass(), "reason", "");
        setField(term107994, term107994.getClass(), "classicAddress", "");
        setField(term107994, term107994.getClass(), "status", enum195);
        setField(term107994, term107994.getClass(), "paymentAmount", "");
        setField(term107994, term107994.getClass(), "snapshotBalance", "");
        setField(term107994, term107994.getClass(), "nftOwned", "");
        Long term108006 = new Long(8403492202041709902L);
        Object term108005 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term108005, term108005.getClass(), "id", term108006);
        setField(term108005, term108005.getClass(), "responseCode", "");
        setField(term108005, term108005.getClass(), "reason", "");
        setField(term108005, term108005.getClass(), "classicAddress", "");
        setField(term108005, term108005.getClass(), "status", enum195);
        setField(term108005, term108005.getClass(), "paymentAmount", "");
        setField(term108005, term108005.getClass(), "snapshotBalance", "");
        setField(term108005, term108005.getClass(), "nftOwned", "");
        ArrayList term107992 = new ArrayList();
        ((ArrayList) term107992).add(term107994);
        ((ArrayList) term107992).add(term108005);
        Long term108016 = new Long(-113028659747841511L);
        Class<? extends Object> term108693 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term108692 = ((Class) term108693).getDeclaredField((String) "DAILY");
        ((Field) term108692).setAccessible(true);
        Object enum196 = ((Field) term108692).get((Object) null);
        Class<? extends Object> term109080 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term109079 = ((Class) term109080).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term109079).setAccessible(true);
        Object enum197 = ((Field) term109079).get((Object) null);
        Integer term108112 = new Integer(-1034506028);
        Class<? extends Object> term109555 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term109554 = ((Class) term109555).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term109554).setAccessible(true);
        Object enum198 = ((Field) term109554).get((Object) null);
        Long term108180 = new Long(7271112616766426991L);
        Long term108194 = new Long(-8514728180792822493L);
        Class<? extends Object> term110020 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term110019 = ((Class) term110020).getDeclaredField((String) "FLAT");
        ((Field) term110019).setAccessible(true);
        Object enum199 = ((Field) term110019).get((Object) null);
        Class<? extends Object> term110434 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term110433 = ((Class) term110434).getDeclaredField((String) "REJECTED");
        ((Field) term110433).setAccessible(true);
        Object enum200 = ((Field) term110433).get((Object) null);
        Long term108264 = new Long(5315236285592892506L);
        term107991 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term108018 = newInstance(Class.forName("java.util.Date"));
        Object term108020 = newInstance(Class.forName("java.util.Date"));
        Object term108022 = newInstance(Class.forName("java.util.Date"));
        Object term108024 = newInstance(Class.forName("java.util.Date"));
        setField(term107991, term107991.getClass(), "results", term107992);
        setField(term107991, term107991.getClass(), "id", term108016);
        setLongField(term108018, term108018.getClass(), "fastTime", 1349082575966L);
        setField(term108018, term108018.getClass(), "cdate", null);
        setField(term107991, term107991.getClass(), "createDate", term108018);
        setLongField(term108020, term108020.getClass(), "fastTime", 1713532939227L);
        setField(term108020, term108020.getClass(), "cdate", null);
        setField(term107991, term107991.getClass(), "updateDate", term108020);
        setLongField(term108022, term108022.getClass(), "fastTime", 1263138252859L);
        setField(term108022, term108022.getClass(), "cdate", null);
        setField(term107991, term107991.getClass(), "startTime", term108022);
        setLongField(term108024, term108024.getClass(), "fastTime", 1603415189333L);
        setField(term108024, term108024.getClass(), "cdate", null);
        setField(term107991, term107991.getClass(), "repeatUntilDate", term108024);
        setField(term107991, term107991.getClass(), "frequency", enum196);
        setField(term107991, term107991.getClass(), "status", enum197);
        setField(term107991, term107991.getClass(), "fromClassicAddress", "nlvRWrTxvz");
        setField(term107991, term107991.getClass(), "trustlineIssuerClassicAddress", "isMKwgUmka");
        setField(term107991, term107991.getClass(), "currencyName", "pDIyzhDtTy");
        setField(term107991, term107991.getClass(), "currencyNameForProcess", "wXiUlhXQoC");
        setField(term107991, term107991.getClass(), "amount", "gKhmgJzimH");
        setBooleanField(term107991, term107991.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term107991, term107991.getClass(), "useBlacklist", true);
        setField(term107991, term107991.getClass(), "maximumTrustlines", term108112);
        setField(term107991, term107991.getClass(), "dropType", enum198);
        setField(term107991, term107991.getClass(), "failReason", "OzRiWLVXNx");
        setField(term107991, term107991.getClass(), "minBalance", "pktmgYsknu");
        setField(term107991, term107991.getClass(), "maxBalance", "SsMHzYNeji");
        setField(term107991, term107991.getClass(), "totalBlacklisted", term108180);
        setField(term107991, term107991.getClass(), "maxXrpFeePerTransaction", "wzAFLFdaEQ");
        setField(term107991, term107991.getClass(), "totalRecipients", term108194);
        setField(term107991, term107991.getClass(), "paymentType", enum199);
        setField(term107991, term107991.getClass(), "snapshotTrustlineIssuerClassicAddress", "IcbBNUXJqX");
        setField(term107991, term107991.getClass(), "snapshotCurrencyName", "LONFjqAsUp");
        setField(term107991, term107991.getClass(), "nftIssuingAddress", "tAhydlbSMf");
        setField(term107991, term107991.getClass(), "nftTaxon", "wNYtcPFyIe");
        setField(term107991, term107991.getClass(), "scheduleStatus", enum200);
        setField(term107991, term107991.getClass(), "fromScheduleId", term108264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term107991, args);
    }

};


