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
import java.lang.Boolean;

public class AirdropStatus_setNewTrustlinesOnly_90599099850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251697;
     Object term251990;

    public AirdropStatus_setNewTrustlinesOnly_90599099850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term251701 = new Long(8931772176819893873L);
        Class<? extends Object> term251993 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term251992 = ((Class) term251993).getDeclaredField((String) "QUEUED");
        ((Field) term251992).setAccessible(true);
        Object enum502 = ((Field) term251992).get((Object) null);
        Object term251700 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251700, term251700.getClass(), "id", term251701);
        setField(term251700, term251700.getClass(), "responseCode", "");
        setField(term251700, term251700.getClass(), "reason", "");
        setField(term251700, term251700.getClass(), "classicAddress", "");
        setField(term251700, term251700.getClass(), "status", enum502);
        setField(term251700, term251700.getClass(), "paymentAmount", "");
        setField(term251700, term251700.getClass(), "snapshotBalance", "");
        setField(term251700, term251700.getClass(), "nftOwned", "");
        Long term251712 = new Long(-4370635295110591519L);
        Object term251711 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251711, term251711.getClass(), "id", term251712);
        setField(term251711, term251711.getClass(), "responseCode", "");
        setField(term251711, term251711.getClass(), "reason", "");
        setField(term251711, term251711.getClass(), "classicAddress", "");
        setField(term251711, term251711.getClass(), "status", enum502);
        setField(term251711, term251711.getClass(), "paymentAmount", "");
        setField(term251711, term251711.getClass(), "snapshotBalance", "");
        setField(term251711, term251711.getClass(), "nftOwned", "");
        Long term251721 = new Long(-1325109462577461208L);
        Class<? extends Object> term252413 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term252412 = ((Class) term252413).getDeclaredField((String) "SENDING");
        ((Field) term252412).setAccessible(true);
        Object enum503 = ((Field) term252412).get((Object) null);
        Object term251720 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251720, term251720.getClass(), "id", term251721);
        setField(term251720, term251720.getClass(), "responseCode", "");
        setField(term251720, term251720.getClass(), "reason", "");
        setField(term251720, term251720.getClass(), "classicAddress", "");
        setField(term251720, term251720.getClass(), "status", enum503);
        setField(term251720, term251720.getClass(), "paymentAmount", "");
        setField(term251720, term251720.getClass(), "snapshotBalance", "");
        setField(term251720, term251720.getClass(), "nftOwned", "");
        Long term251732 = new Long(-7181112149072926893L);
        Object term251731 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251731, term251731.getClass(), "id", term251732);
        setField(term251731, term251731.getClass(), "responseCode", "");
        setField(term251731, term251731.getClass(), "reason", "");
        setField(term251731, term251731.getClass(), "classicAddress", "");
        setField(term251731, term251731.getClass(), "status", enum503);
        setField(term251731, term251731.getClass(), "paymentAmount", "");
        setField(term251731, term251731.getClass(), "snapshotBalance", "");
        setField(term251731, term251731.getClass(), "nftOwned", "");
        Long term251741 = new Long(-5850316381591949820L);
        Class<? extends Object> term252836 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term252835 = ((Class) term252836).getDeclaredField((String) "SENDING");
        ((Field) term252835).setAccessible(true);
        Object enum504 = ((Field) term252835).get((Object) null);
        Object term251740 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251740, term251740.getClass(), "id", term251741);
        setField(term251740, term251740.getClass(), "responseCode", "");
        setField(term251740, term251740.getClass(), "reason", "");
        setField(term251740, term251740.getClass(), "classicAddress", "");
        setField(term251740, term251740.getClass(), "status", enum504);
        setField(term251740, term251740.getClass(), "paymentAmount", "");
        setField(term251740, term251740.getClass(), "snapshotBalance", "");
        setField(term251740, term251740.getClass(), "nftOwned", "");
        Long term251752 = new Long(5857854340777182167L);
        Object term251751 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term251751, term251751.getClass(), "id", term251752);
        setField(term251751, term251751.getClass(), "responseCode", "");
        setField(term251751, term251751.getClass(), "reason", "");
        setField(term251751, term251751.getClass(), "classicAddress", "");
        setField(term251751, term251751.getClass(), "status", enum504);
        setField(term251751, term251751.getClass(), "paymentAmount", "");
        setField(term251751, term251751.getClass(), "snapshotBalance", "");
        setField(term251751, term251751.getClass(), "nftOwned", "");
        ArrayList term251698 = new ArrayList();
        ((ArrayList) term251698).add(term251700);
        ((ArrayList) term251698).add(term251711);
        ((ArrayList) term251698).add(term251720);
        ((ArrayList) term251698).add(term251731);
        ((ArrayList) term251698).add(term251740);
        ((ArrayList) term251698).add(term251751);
        Long term251762 = new Long(3660520943100987842L);
        Class<? extends Object> term253259 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term253258 = ((Class) term253259).getDeclaredField((String) "DAILY");
        ((Field) term253258).setAccessible(true);
        Object enum505 = ((Field) term253258).get((Object) null);
        Class<? extends Object> term253646 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term253645 = ((Class) term253646).getDeclaredField((String) "REJECTED");
        ((Field) term253645).setAccessible(true);
        Object enum506 = ((Field) term253645).get((Object) null);
        Integer term251855 = new Integer(-2015048153);
        Class<? extends Object> term254112 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term254111 = ((Class) term254112).getDeclaredField((String) "TRUSTLINE");
        ((Field) term254111).setAccessible(true);
        Object enum507 = ((Field) term254111).get((Object) null);
        Long term251906 = new Long(-8211240904293846981L);
        Long term251920 = new Long(3535528164828723056L);
        Class<? extends Object> term254526 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term254525 = ((Class) term254526).getDeclaredField((String) "FLAT");
        ((Field) term254525).setAccessible(true);
        Object enum508 = ((Field) term254525).get((Object) null);
        Class<? extends Object> term254940 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term254939 = ((Class) term254940).getDeclaredField((String) "ACTIVE");
        ((Field) term254939).setAccessible(true);
        Object enum509 = ((Field) term254939).get((Object) null);
        Long term251988 = new Long(4036794646678680547L);
        term251697 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term251764 = newInstance(Class.forName("java.util.Date"));
        Object term251766 = newInstance(Class.forName("java.util.Date"));
        Object term251768 = newInstance(Class.forName("java.util.Date"));
        Object term251770 = newInstance(Class.forName("java.util.Date"));
        setField(term251697, term251697.getClass(), "results", term251698);
        setField(term251697, term251697.getClass(), "id", term251762);
        setLongField(term251764, term251764.getClass(), "fastTime", 1636637874191L);
        setField(term251764, term251764.getClass(), "cdate", null);
        setField(term251697, term251697.getClass(), "createDate", term251764);
        setLongField(term251766, term251766.getClass(), "fastTime", 1732865834801L);
        setField(term251766, term251766.getClass(), "cdate", null);
        setField(term251697, term251697.getClass(), "updateDate", term251766);
        setLongField(term251768, term251768.getClass(), "fastTime", 1859322280808L);
        setField(term251768, term251768.getClass(), "cdate", null);
        setField(term251697, term251697.getClass(), "startTime", term251768);
        setLongField(term251770, term251770.getClass(), "fastTime", 1872938547611L);
        setField(term251770, term251770.getClass(), "cdate", null);
        setField(term251697, term251697.getClass(), "repeatUntilDate", term251770);
        setField(term251697, term251697.getClass(), "frequency", enum505);
        setField(term251697, term251697.getClass(), "status", enum506);
        setField(term251697, term251697.getClass(), "fromClassicAddress", "AavZwxppSr");
        setField(term251697, term251697.getClass(), "trustlineIssuerClassicAddress", "bozHpjFCmy");
        setField(term251697, term251697.getClass(), "currencyName", "fufOvYOUme");
        setField(term251697, term251697.getClass(), "currencyNameForProcess", "hFUzxlerfo");
        setField(term251697, term251697.getClass(), "amount", "SSClrWPMGg");
        setBooleanField(term251697, term251697.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term251697, term251697.getClass(), "useBlacklist", false);
        setField(term251697, term251697.getClass(), "maximumTrustlines", term251855);
        setField(term251697, term251697.getClass(), "dropType", enum507);
        setField(term251697, term251697.getClass(), "failReason", "pWwlfpmeFT");
        setField(term251697, term251697.getClass(), "minBalance", "PKwVSkPPMv");
        setField(term251697, term251697.getClass(), "maxBalance", "DpAnlOynPS");
        setField(term251697, term251697.getClass(), "totalBlacklisted", term251906);
        setField(term251697, term251697.getClass(), "maxXrpFeePerTransaction", "CyKngDoFFr");
        setField(term251697, term251697.getClass(), "totalRecipients", term251920);
        setField(term251697, term251697.getClass(), "paymentType", enum508);
        setField(term251697, term251697.getClass(), "snapshotTrustlineIssuerClassicAddress", "eXHygaZKkI");
        setField(term251697, term251697.getClass(), "snapshotCurrencyName", "exVBhDpyTv");
        setField(term251697, term251697.getClass(), "nftIssuingAddress", "HIROkhxmYq");
        setField(term251697, term251697.getClass(), "nftTaxon", "IOCISrBpxa");
        setField(term251697, term251697.getClass(), "scheduleStatus", enum509);
        setField(term251697, term251697.getClass(), "fromScheduleId", term251988);
        term251990 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term251990;
        callMethod(klass, "setNewTrustlinesOnly", argTypes, term251697, args);
    }

};


