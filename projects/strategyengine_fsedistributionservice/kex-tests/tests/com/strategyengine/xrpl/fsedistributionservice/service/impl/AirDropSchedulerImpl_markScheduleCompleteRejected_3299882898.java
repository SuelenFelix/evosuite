package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;

public class AirDropSchedulerImpl_markScheduleCompleteRejected_3299882898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20362;
     Object term20406;
     Object term20729;

    public AirDropSchedulerImpl_markScheduleCompleteRejected_3299882898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20363 = new Long(5953383087795962419L);
        Class<? extends Object> term20999 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term20998 = ((Class) term20999).getDeclaredField((String) "MONTHLY");
        ((Field) term20998).setAccessible(true);
        Object enum36 = ((Field) term20998).get((Object) null);
        Class<? extends Object> term21402 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term21401 = ((Class) term21402).getDeclaredField((String) "COMPLETE");
        ((Field) term21401).setAccessible(true);
        Object enum37 = ((Field) term21401).get((Object) null);
        Long term20404 = new Long(7994303628307559416L);
        term20362 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term20376 = newInstance(Class.forName("java.util.Date"));
        Object term20378 = newInstance(Class.forName("java.util.Date"));
        setField(term20362, term20362.getClass(), "id", term20363);
        setField(term20362, term20362.getClass(), "frequency", enum36);
        setLongField(term20376, term20376.getClass(), "fastTime", 1819191638549L);
        setField(term20376, term20376.getClass(), "cdate", null);
        setField(term20362, term20362.getClass(), "repeatUntilDate", term20376);
        setLongField(term20378, term20378.getClass(), "fastTime", 1400691778698L);
        setField(term20378, term20378.getClass(), "cdate", null);
        setField(term20362, term20362.getClass(), "createDate", term20378);
        setField(term20362, term20362.getClass(), "lockUuid", "ypEdrstygY");
        setField(term20362, term20362.getClass(), "dropScheduleStatus", enum37);
        setField(term20362, term20362.getClass(), "dropRequestId", term20404);
        Long term20408 = new Long(2443640364875054177L);
        Class<? extends Object> term21843 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term21842 = ((Class) term21843).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term21842).setAccessible(true);
        Object enum38 = ((Field) term21842).get((Object) null);
        Class<? extends Object> term22358 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term22357 = ((Class) term22358).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term22357).setAccessible(true);
        Object enum39 = ((Field) term22357).get((Object) null);
        Boolean term20579 = new Boolean(false);
        Boolean term20581 = new Boolean(false);
        Integer term20583 = new Integer(-883034806);
        Class<? extends Object> term22756 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term22755 = ((Class) term22756).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term22755).setAccessible(true);
        Object enum40 = ((Field) term22755).get((Object) null);
        Long term20687 = new Long(-1610676979013636850L);
        Long term20701 = new Long(2062173786000223358L);
        Boolean term20715 = new Boolean(true);
        term20406 = newInstance(Class.forName("java.util.Optional"));
        Object term20407 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term20434 = newInstance(Class.forName("java.util.Date"));
        Object term20436 = newInstance(Class.forName("java.util.Date"));
        Object term20438 = newInstance(Class.forName("java.util.Date"));
        setField(term20407, term20407.getClass(), "id", term20408);
        setField(term20407, term20407.getClass(), "environment", "sNQFlATEeQ");
        setField(term20407, term20407.getClass(), "populateEnvironment", "ZKMLioamsY");
        setLongField(term20434, term20434.getClass(), "fastTime", 1741444563811L);
        setField(term20434, term20434.getClass(), "cdate", null);
        setField(term20407, term20407.getClass(), "createDate", term20434);
        setLongField(term20436, term20436.getClass(), "fastTime", 1761994701322L);
        setField(term20436, term20436.getClass(), "cdate", null);
        setField(term20407, term20407.getClass(), "updateDate", term20436);
        setLongField(term20438, term20438.getClass(), "fastTime", 1695425269458L);
        setField(term20438, term20438.getClass(), "cdate", null);
        setField(term20407, term20407.getClass(), "startTime", term20438);
        setField(term20407, term20407.getClass(), "status", enum38);
        setField(term20407, term20407.getClass(), "fromClassicAddress", "WVbxuoDBcn");
        setField(term20407, term20407.getClass(), "fromSigningPublicKey", "pvDEABOxLt");
        setField(term20407, term20407.getClass(), "fromPrivateKey", "beAMpkroCQ");
        setField(term20407, term20407.getClass(), "trustlineIssuerClassicAddress", "uSUvKAyuvd");
        setField(term20407, term20407.getClass(), "currencyName", "onQLVONGuf");
        setField(term20407, term20407.getClass(), "snapshotTrustlineIssuerClassicAddress", "SOrEHbcbmn");
        setField(term20407, term20407.getClass(), "snapshotCurrencyName", "bnsyeQXFdu");
        setField(term20407, term20407.getClass(), "currencyNameForProcess", "BwtdjiefJn");
        setField(term20407, term20407.getClass(), "amount", "jDmhBrIoDa");
        setField(term20407, term20407.getClass(), "paymentType", enum39);
        setField(term20407, term20407.getClass(), "newTrustlinesOnly", term20579);
        setField(term20407, term20407.getClass(), "useBlacklist", term20581);
        setField(term20407, term20407.getClass(), "maximumTrustlines", term20583);
        setField(term20407, term20407.getClass(), "dropType", enum40);
        setField(term20407, term20407.getClass(), "lockUuid", "SPtPatHeOm");
        setField(term20407, term20407.getClass(), "failReason", "ywmcuThdfL");
        setField(term20407, term20407.getClass(), "feesPaid", "GBOEuByOfr");
        setField(term20407, term20407.getClass(), "minBalance", "NHbOFFjyVK");
        setField(term20407, term20407.getClass(), "maxBalance", "zaloBqlrSo");
        setField(term20407, term20407.getClass(), "maxXrpFeePerTransaction", "vvoLrMGCoN");
        setField(term20407, term20407.getClass(), "retryOfId", term20687);
        setField(term20407, term20407.getClass(), "nftIssuerAddress", "pXdglvyrQe");
        setField(term20407, term20407.getClass(), "nftTaxon", term20701);
        setField(term20407, term20407.getClass(), "contactEmail", "OcfNzHYdki");
        setField(term20407, term20407.getClass(), "autoApprove", term20715);
        setField(term20407, term20407.getClass(), "memo", "uPuCVuZYOI");
        setField(term20406, term20406.getClass(), "value", term20407);
        Long term20730 = new Long(-8658027316505137504L);
        Class<? extends Object> term23381 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term23380 = ((Class) term23381).getDeclaredField((String) "FLAT");
        ((Field) term23380).setAccessible(true);
        Object enum41 = ((Field) term23380).get((Object) null);
        Boolean term20878 = new Boolean(true);
        Boolean term20880 = new Boolean(true);
        Integer term20882 = new Integer(1585847225);
        Long term20956 = new Long(414749984815662075L);
        Long term20970 = new Long(463622836963501975L);
        Boolean term20984 = new Boolean(true);
        term20729 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term20756 = newInstance(Class.forName("java.util.Date"));
        Object term20758 = newInstance(Class.forName("java.util.Date"));
        Object term20760 = newInstance(Class.forName("java.util.Date"));
        setField(term20729, term20729.getClass(), "id", term20730);
        setField(term20729, term20729.getClass(), "environment", "TweMFhxNdj");
        setField(term20729, term20729.getClass(), "populateEnvironment", "NBrvVzvQHe");
        setLongField(term20756, term20756.getClass(), "fastTime", 1362780563394L);
        setField(term20756, term20756.getClass(), "cdate", null);
        setField(term20729, term20729.getClass(), "createDate", term20756);
        setLongField(term20758, term20758.getClass(), "fastTime", 1853963979281L);
        setField(term20758, term20758.getClass(), "cdate", null);
        setField(term20729, term20729.getClass(), "updateDate", term20758);
        setLongField(term20760, term20760.getClass(), "fastTime", 1795936337628L);
        setField(term20760, term20760.getClass(), "cdate", null);
        setField(term20729, term20729.getClass(), "startTime", term20760);
        setField(term20729, term20729.getClass(), "status", enum38);
        setField(term20729, term20729.getClass(), "fromClassicAddress", "FjOiNAfBOc");
        setField(term20729, term20729.getClass(), "fromSigningPublicKey", "iCCsaLHohG");
        setField(term20729, term20729.getClass(), "fromPrivateKey", "NJhGgctbdj");
        setField(term20729, term20729.getClass(), "trustlineIssuerClassicAddress", "MYWYUeLGOp");
        setField(term20729, term20729.getClass(), "currencyName", "tsTGdgQYUL");
        setField(term20729, term20729.getClass(), "snapshotTrustlineIssuerClassicAddress", "TtGbVmKcnX");
        setField(term20729, term20729.getClass(), "snapshotCurrencyName", "GJVkUrCVdD");
        setField(term20729, term20729.getClass(), "currencyNameForProcess", "zNdorvdUgu");
        setField(term20729, term20729.getClass(), "amount", "oPxuZbkYio");
        setField(term20729, term20729.getClass(), "paymentType", enum41);
        setField(term20729, term20729.getClass(), "newTrustlinesOnly", term20878);
        setField(term20729, term20729.getClass(), "useBlacklist", term20880);
        setField(term20729, term20729.getClass(), "maximumTrustlines", term20882);
        setField(term20729, term20729.getClass(), "dropType", enum40);
        setField(term20729, term20729.getClass(), "lockUuid", "vKitydDVnM");
        setField(term20729, term20729.getClass(), "failReason", "urCiQnUFBM");
        setField(term20729, term20729.getClass(), "feesPaid", "EKjQdtKxAM");
        setField(term20729, term20729.getClass(), "minBalance", "TXZAIPQJHt");
        setField(term20729, term20729.getClass(), "maxBalance", "DIbeDHICho");
        setField(term20729, term20729.getClass(), "maxXrpFeePerTransaction", "dJGPlmSRnz");
        setField(term20729, term20729.getClass(), "retryOfId", term20956);
        setField(term20729, term20729.getClass(), "nftIssuerAddress", "DPskuFUobI");
        setField(term20729, term20729.getClass(), "nftTaxon", term20970);
        setField(term20729, term20729.getClass(), "contactEmail", "wBGfLpNNiZ");
        setField(term20729, term20729.getClass(), "autoApprove", term20984);
        setField(term20729, term20729.getClass(), "memo", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        argTypes[1] = Class.forName("java.util.Optional");
        argTypes[2] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[3];
        args[0] = term20362;
        args[1] = term20406;
        args[2] = term20729;
        callMethod(klass, "markScheduleCompleteRejected", argTypes, null, args);
    }

};


