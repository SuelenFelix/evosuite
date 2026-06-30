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
import java.util.LinkedList;

public class AirdropStatus_AirdropStatusBuilder_results_13249438791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446879;
     Object term447141;

    public AirdropStatus_AirdropStatusBuilder_results_13249438791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term446880 = new ArrayList();
        Long term446884 = new Long(7207062884131909895L);
        Class<? extends Object> term447334 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term447333 = ((Class) term447334).getDeclaredField((String) "ANNUALLY");
        ((Field) term447333).setAccessible(true);
        Object enum826 = ((Field) term447333).get((Object) null);
        Class<? extends Object> term447730 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term447729 = ((Class) term447730).getDeclaredField((String) "SCHEDULED");
        ((Field) term447729).setAccessible(true);
        Object enum827 = ((Field) term447729).get((Object) null);
        Integer term446981 = new Integer(-209654048);
        Class<? extends Object> term448199 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term448198 = ((Class) term448199).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term448198).setAccessible(true);
        Object enum828 = ((Field) term448198).get((Object) null);
        Long term447049 = new Long(9005525882295990505L);
        Long term447063 = new Long(-604910205679247392L);
        Class<? extends Object> term448664 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term448663 = ((Class) term448664).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term448663).setAccessible(true);
        Object enum829 = ((Field) term448663).get((Object) null);
        Class<? extends Object> term449102 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term449101 = ((Class) term449102).getDeclaredField((String) "ACTIVE");
        ((Field) term449101).setAccessible(true);
        Object enum830 = ((Field) term449101).get((Object) null);
        Long term447139 = new Long(2280240558714436788L);
        term446879 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term446886 = newInstance(Class.forName("java.util.Date"));
        Object term446888 = newInstance(Class.forName("java.util.Date"));
        Object term446890 = newInstance(Class.forName("java.util.Date"));
        Object term446892 = newInstance(Class.forName("java.util.Date"));
        setField(term446879, term446879.getClass(), "results", term446880);
        setField(term446879, term446879.getClass(), "id", term446884);
        setLongField(term446886, term446886.getClass(), "fastTime", 1797905845672L);
        setField(term446886, term446886.getClass(), "cdate", null);
        setField(term446879, term446879.getClass(), "createDate", term446886);
        setLongField(term446888, term446888.getClass(), "fastTime", 1478324694357L);
        setField(term446888, term446888.getClass(), "cdate", null);
        setField(term446879, term446879.getClass(), "updateDate", term446888);
        setLongField(term446890, term446890.getClass(), "fastTime", 1588892423008L);
        setField(term446890, term446890.getClass(), "cdate", null);
        setField(term446879, term446879.getClass(), "startTime", term446890);
        setLongField(term446892, term446892.getClass(), "fastTime", 1363165584208L);
        setField(term446892, term446892.getClass(), "cdate", null);
        setField(term446879, term446879.getClass(), "repeatUntilDate", term446892);
        setField(term446879, term446879.getClass(), "frequency", enum826);
        setField(term446879, term446879.getClass(), "status", enum827);
        setField(term446879, term446879.getClass(), "fromClassicAddress", "FTSegVMXzZ");
        setField(term446879, term446879.getClass(), "trustlineIssuerClassicAddress", "YdclkiqKLw");
        setField(term446879, term446879.getClass(), "currencyName", "HjnANDAraH");
        setField(term446879, term446879.getClass(), "currencyNameForProcess", "ArRbkfOXUU");
        setField(term446879, term446879.getClass(), "amount", "usMwphyYRn");
        setBooleanField(term446879, term446879.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term446879, term446879.getClass(), "useBlacklist", false);
        setField(term446879, term446879.getClass(), "maximumTrustlines", term446981);
        setField(term446879, term446879.getClass(), "dropType", enum828);
        setField(term446879, term446879.getClass(), "failReason", "cSIISDBvFn");
        setField(term446879, term446879.getClass(), "minBalance", "UeVnwmFLjY");
        setField(term446879, term446879.getClass(), "maxBalance", "IIlFHyBACX");
        setField(term446879, term446879.getClass(), "totalBlacklisted", term447049);
        setField(term446879, term446879.getClass(), "maxXrpFeePerTransaction", "KYRCFppeJM");
        setField(term446879, term446879.getClass(), "totalRecipients", term447063);
        setField(term446879, term446879.getClass(), "paymentType", enum829);
        setField(term446879, term446879.getClass(), "snapshotTrustlineIssuerClassicAddress", "LFMqdKgGfW");
        setField(term446879, term446879.getClass(), "snapshotCurrencyName", "aXKRWiZtNa");
        setField(term446879, term446879.getClass(), "nftIssuingAddress", "IvhFSqXGWI");
        setField(term446879, term446879.getClass(), "nftTaxon", "XtSNlvtLvB");
        setField(term446879, term446879.getClass(), "scheduleStatus", enum830);
        setField(term446879, term446879.getClass(), "fromScheduleId", term447139);
        Long term447145 = new Long(9164041864010757052L);
        Class<? extends Object> term449547 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term449546 = ((Class) term449547).getDeclaredField((String) "FAILED");
        ((Field) term449546).setAccessible(true);
        Object enum831 = ((Field) term449546).get((Object) null);
        Object term447144 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term447144, term447144.getClass(), "id", term447145);
        setField(term447144, term447144.getClass(), "responseCode", "fNoIbYHFer");
        setField(term447144, term447144.getClass(), "reason", "NbXrtSHLKQ");
        setField(term447144, term447144.getClass(), "classicAddress", "FLAHyvDmcn");
        setField(term447144, term447144.getClass(), "status", enum831);
        setField(term447144, term447144.getClass(), "paymentAmount", "ykqmQraXZT");
        setField(term447144, term447144.getClass(), "snapshotBalance", "yuvIUIQCMR");
        setField(term447144, term447144.getClass(), "nftOwned", "UiwzhuXDvB");
        Long term447224 = new Long(-4710087184100544875L);
        Class<? extends Object> term449997 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term449996 = ((Class) term449997).getDeclaredField((String) "SENDING");
        ((Field) term449996).setAccessible(true);
        Object enum832 = ((Field) term449996).get((Object) null);
        Object term447223 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term447223, term447223.getClass(), "id", term447224);
        setField(term447223, term447223.getClass(), "responseCode", "");
        setField(term447223, term447223.getClass(), "reason", "");
        setField(term447223, term447223.getClass(), "classicAddress", "");
        setField(term447223, term447223.getClass(), "status", enum832);
        setField(term447223, term447223.getClass(), "paymentAmount", "");
        setField(term447223, term447223.getClass(), "snapshotBalance", "");
        setField(term447223, term447223.getClass(), "nftOwned", "");
        Long term447236 = new Long(8351267378333718210L);
        Object term447235 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term447235, term447235.getClass(), "id", term447236);
        setField(term447235, term447235.getClass(), "responseCode", null);
        setField(term447235, term447235.getClass(), "reason", null);
        setField(term447235, term447235.getClass(), "classicAddress", null);
        setField(term447235, term447235.getClass(), "status", enum832);
        setField(term447235, term447235.getClass(), "paymentAmount", null);
        setField(term447235, term447235.getClass(), "snapshotBalance", null);
        setField(term447235, term447235.getClass(), "nftOwned", null);
        term447141 = new LinkedList();
        ((LinkedList) term447141).add(term447144);
        ((LinkedList) term447141).add(term447223);
        ((LinkedList) term447141).add(term447235);
        ((LinkedList) term447141).add((Object)null);
        ((LinkedList) term447141).add((Object)null);
        ((LinkedList) term447141).add((Object)null);
        ((LinkedList) term447141).add((Object)null);
        ((LinkedList) term447141).add((Object)null);
        ((LinkedList) term447141).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term447141;
        callMethod(klass, "results", argTypes, term446879, args);
    }

};


