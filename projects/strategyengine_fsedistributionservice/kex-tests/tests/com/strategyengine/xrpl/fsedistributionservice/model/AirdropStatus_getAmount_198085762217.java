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

public class AirdropStatus_getAmount_198085762217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143281;

    public AirdropStatus_getAmount_198085762217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term143285 = new Long(6150186973473930616L);
        Class<? extends Object> term143616 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term143615 = ((Class) term143616).getDeclaredField((String) "SENDING");
        ((Field) term143615).setAccessible(true);
        Object enum271 = ((Field) term143615).get((Object) null);
        Object term143284 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143284, term143284.getClass(), "id", term143285);
        setField(term143284, term143284.getClass(), "responseCode", "");
        setField(term143284, term143284.getClass(), "reason", "");
        setField(term143284, term143284.getClass(), "classicAddress", "");
        setField(term143284, term143284.getClass(), "status", enum271);
        setField(term143284, term143284.getClass(), "paymentAmount", "");
        setField(term143284, term143284.getClass(), "snapshotBalance", "");
        setField(term143284, term143284.getClass(), "nftOwned", "");
        Long term143296 = new Long(-3850323135468805420L);
        Class<? extends Object> term144039 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term144038 = ((Class) term144039).getDeclaredField((String) "QUEUED");
        ((Field) term144038).setAccessible(true);
        Object enum272 = ((Field) term144038).get((Object) null);
        Object term143295 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143295, term143295.getClass(), "id", term143296);
        setField(term143295, term143295.getClass(), "responseCode", "");
        setField(term143295, term143295.getClass(), "reason", "");
        setField(term143295, term143295.getClass(), "classicAddress", "");
        setField(term143295, term143295.getClass(), "status", enum272);
        setField(term143295, term143295.getClass(), "paymentAmount", "");
        setField(term143295, term143295.getClass(), "snapshotBalance", "");
        setField(term143295, term143295.getClass(), "nftOwned", "");
        Long term143307 = new Long(-5207216109884759743L);
        Object term143306 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143306, term143306.getClass(), "id", term143307);
        setField(term143306, term143306.getClass(), "responseCode", "");
        setField(term143306, term143306.getClass(), "reason", "");
        setField(term143306, term143306.getClass(), "classicAddress", "");
        setField(term143306, term143306.getClass(), "status", enum272);
        setField(term143306, term143306.getClass(), "paymentAmount", "");
        setField(term143306, term143306.getClass(), "snapshotBalance", "");
        setField(term143306, term143306.getClass(), "nftOwned", "");
        Long term143316 = new Long(8765880103547975810L);
        Class<? extends Object> term144459 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term144458 = ((Class) term144459).getDeclaredField((String) "VERIFIED");
        ((Field) term144458).setAccessible(true);
        Object enum273 = ((Field) term144458).get((Object) null);
        Object term143315 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143315, term143315.getClass(), "id", term143316);
        setField(term143315, term143315.getClass(), "responseCode", "");
        setField(term143315, term143315.getClass(), "reason", "");
        setField(term143315, term143315.getClass(), "classicAddress", "");
        setField(term143315, term143315.getClass(), "status", enum273);
        setField(term143315, term143315.getClass(), "paymentAmount", "");
        setField(term143315, term143315.getClass(), "snapshotBalance", "");
        setField(term143315, term143315.getClass(), "nftOwned", "");
        Long term143327 = new Long(4552367707739103094L);
        Object term143326 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143326, term143326.getClass(), "id", term143327);
        setField(term143326, term143326.getClass(), "responseCode", "");
        setField(term143326, term143326.getClass(), "reason", "");
        setField(term143326, term143326.getClass(), "classicAddress", "");
        setField(term143326, term143326.getClass(), "status", enum273);
        setField(term143326, term143326.getClass(), "paymentAmount", "");
        setField(term143326, term143326.getClass(), "snapshotBalance", "");
        setField(term143326, term143326.getClass(), "nftOwned", "");
        Long term143336 = new Long(-6001151456088965547L);
        Object term143335 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143335, term143335.getClass(), "id", term143336);
        setField(term143335, term143335.getClass(), "responseCode", "");
        setField(term143335, term143335.getClass(), "reason", "");
        setField(term143335, term143335.getClass(), "classicAddress", "");
        setField(term143335, term143335.getClass(), "status", enum272);
        setField(term143335, term143335.getClass(), "paymentAmount", "");
        setField(term143335, term143335.getClass(), "snapshotBalance", "");
        setField(term143335, term143335.getClass(), "nftOwned", "");
        Long term143345 = new Long(1740732617708040141L);
        Object term143344 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term143344, term143344.getClass(), "id", term143345);
        setField(term143344, term143344.getClass(), "responseCode", "");
        setField(term143344, term143344.getClass(), "reason", "");
        setField(term143344, term143344.getClass(), "classicAddress", "");
        setField(term143344, term143344.getClass(), "status", enum271);
        setField(term143344, term143344.getClass(), "paymentAmount", "");
        setField(term143344, term143344.getClass(), "snapshotBalance", "");
        setField(term143344, term143344.getClass(), "nftOwned", "");
        ArrayList term143282 = new ArrayList();
        ((ArrayList) term143282).add(term143284);
        ((ArrayList) term143282).add(term143295);
        ((ArrayList) term143282).add(term143306);
        ((ArrayList) term143282).add(term143315);
        ((ArrayList) term143282).add(term143326);
        ((ArrayList) term143282).add(term143335);
        ((ArrayList) term143282).add(term143344);
        Long term143355 = new Long(3472971833455746664L);
        Class<? extends Object> term144885 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term144884 = ((Class) term144885).getDeclaredField((String) "WEEKLY");
        ((Field) term144884).setAccessible(true);
        Object enum274 = ((Field) term144884).get((Object) null);
        Class<? extends Object> term145275 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term145274 = ((Class) term145275).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term145274).setAccessible(true);
        Object enum275 = ((Field) term145274).get((Object) null);
        Integer term143461 = new Integer(-663691365);
        Class<? extends Object> term145777 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term145776 = ((Class) term145777).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term145776).setAccessible(true);
        Object enum276 = ((Field) term145776).get((Object) null);
        Long term143529 = new Long(3731931947533293029L);
        Long term143543 = new Long(9214973322210954344L);
        Class<? extends Object> term146242 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term146241 = ((Class) term146242).getDeclaredField((String) "FLAT");
        ((Field) term146241).setAccessible(true);
        Object enum277 = ((Field) term146241).get((Object) null);
        Class<? extends Object> term146656 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term146655 = ((Class) term146656).getDeclaredField((String) "COMPLETE");
        ((Field) term146655).setAccessible(true);
        Object enum278 = ((Field) term146655).get((Object) null);
        Long term143613 = new Long(3662777917800385964L);
        term143281 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term143357 = newInstance(Class.forName("java.util.Date"));
        Object term143359 = newInstance(Class.forName("java.util.Date"));
        Object term143361 = newInstance(Class.forName("java.util.Date"));
        Object term143363 = newInstance(Class.forName("java.util.Date"));
        setField(term143281, term143281.getClass(), "results", term143282);
        setField(term143281, term143281.getClass(), "id", term143355);
        setLongField(term143357, term143357.getClass(), "fastTime", 1887042175557L);
        setField(term143357, term143357.getClass(), "cdate", null);
        setField(term143281, term143281.getClass(), "createDate", term143357);
        setLongField(term143359, term143359.getClass(), "fastTime", 1278344008475L);
        setField(term143359, term143359.getClass(), "cdate", null);
        setField(term143281, term143281.getClass(), "updateDate", term143359);
        setLongField(term143361, term143361.getClass(), "fastTime", 1403931113861L);
        setField(term143361, term143361.getClass(), "cdate", null);
        setField(term143281, term143281.getClass(), "startTime", term143361);
        setLongField(term143363, term143363.getClass(), "fastTime", 1460672232175L);
        setField(term143363, term143363.getClass(), "cdate", null);
        setField(term143281, term143281.getClass(), "repeatUntilDate", term143363);
        setField(term143281, term143281.getClass(), "frequency", enum274);
        setField(term143281, term143281.getClass(), "status", enum275);
        setField(term143281, term143281.getClass(), "fromClassicAddress", "WEgFuDZsxi");
        setField(term143281, term143281.getClass(), "trustlineIssuerClassicAddress", "kvcaSGNTHd");
        setField(term143281, term143281.getClass(), "currencyName", "opXkGeBDoI");
        setField(term143281, term143281.getClass(), "currencyNameForProcess", "UHxidCtatV");
        setField(term143281, term143281.getClass(), "amount", "LRzADDSjVT");
        setBooleanField(term143281, term143281.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term143281, term143281.getClass(), "useBlacklist", false);
        setField(term143281, term143281.getClass(), "maximumTrustlines", term143461);
        setField(term143281, term143281.getClass(), "dropType", enum276);
        setField(term143281, term143281.getClass(), "failReason", "lpFCMaAYxj");
        setField(term143281, term143281.getClass(), "minBalance", "fzHVMNSLii");
        setField(term143281, term143281.getClass(), "maxBalance", "TxymnVINZF");
        setField(term143281, term143281.getClass(), "totalBlacklisted", term143529);
        setField(term143281, term143281.getClass(), "maxXrpFeePerTransaction", "fkBfmixBEh");
        setField(term143281, term143281.getClass(), "totalRecipients", term143543);
        setField(term143281, term143281.getClass(), "paymentType", enum277);
        setField(term143281, term143281.getClass(), "snapshotTrustlineIssuerClassicAddress", "SWbairdDKL");
        setField(term143281, term143281.getClass(), "snapshotCurrencyName", "AibUFEALwF");
        setField(term143281, term143281.getClass(), "nftIssuingAddress", "eXOUrXTrdW");
        setField(term143281, term143281.getClass(), "nftTaxon", "aomDEETHep");
        setField(term143281, term143281.getClass(), "scheduleStatus", enum278);
        setField(term143281, term143281.getClass(), "fromScheduleId", term143613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term143281, args);
    }

};


