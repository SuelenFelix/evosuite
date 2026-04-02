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
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.LinkedList;

public class AridropSummaryServiceImpl_convertWithTotals_20647242827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1887;
     Object term2180;

    public AridropSummaryServiceImpl_convertWithTotals_20647242827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1888 = new Long(5270370404989704783L);
        Class<? extends Object> term2229 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term2228 = ((Class) term2229).getDeclaredField((String) "REJECTED");
        ((Field) term2228).setAccessible(true);
        Object enum3 = ((Field) term2228).get((Object) null);
        Class<? extends Object> term2735 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term2734 = ((Class) term2735).getDeclaredField((String) "FLAT");
        ((Field) term2734).setAccessible(true);
        Object enum4 = ((Field) term2734).get((Object) null);
        Boolean term2048 = new Boolean(false);
        Boolean term2050 = new Boolean(true);
        Integer term2052 = new Integer(1162663216);
        Class<? extends Object> term3109 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term3108 = ((Class) term3109).getDeclaredField((String) "GLOBALID");
        ((Field) term3108).setAccessible(true);
        Object enum5 = ((Field) term3108).get((Object) null);
        Long term2138 = new Long(7411271909051562686L);
        Long term2152 = new Long(4872422362414183754L);
        Boolean term2166 = new Boolean(true);
        term1887 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term1914 = newInstance(Class.forName("java.util.Date"));
        Object term1916 = newInstance(Class.forName("java.util.Date"));
        Object term1918 = newInstance(Class.forName("java.util.Date"));
        setField(term1887, term1887.getClass(), "id", term1888);
        setField(term1887, term1887.getClass(), "environment", "RkybSrpybU");
        setField(term1887, term1887.getClass(), "populateEnvironment", "xOEqzGAmDU");
        setLongField(term1914, term1914.getClass(), "fastTime", 1606045635837L);
        setField(term1914, term1914.getClass(), "cdate", null);
        setField(term1887, term1887.getClass(), "createDate", term1914);
        setLongField(term1916, term1916.getClass(), "fastTime", 1442639565302L);
        setField(term1916, term1916.getClass(), "cdate", null);
        setField(term1887, term1887.getClass(), "updateDate", term1916);
        setLongField(term1918, term1918.getClass(), "fastTime", 1515890130018L);
        setField(term1918, term1918.getClass(), "cdate", null);
        setField(term1887, term1887.getClass(), "startTime", term1918);
        setField(term1887, term1887.getClass(), "status", enum3);
        setField(term1887, term1887.getClass(), "fromClassicAddress", "eZFUvlxvGV");
        setField(term1887, term1887.getClass(), "fromSigningPublicKey", "BYqFIqCKAV");
        setField(term1887, term1887.getClass(), "fromPrivateKey", "vrQLuWIDJX");
        setField(term1887, term1887.getClass(), "trustlineIssuerClassicAddress", "flxyYxBRtu");
        setField(term1887, term1887.getClass(), "currencyName", "OclPbYPkcH");
        setField(term1887, term1887.getClass(), "snapshotTrustlineIssuerClassicAddress", "IoAlmYsBwc");
        setField(term1887, term1887.getClass(), "snapshotCurrencyName", "TEParAifyi");
        setField(term1887, term1887.getClass(), "currencyNameForProcess", "OWDIEULEFu");
        setField(term1887, term1887.getClass(), "amount", "dWRymuLBtr");
        setField(term1887, term1887.getClass(), "paymentType", enum4);
        setField(term1887, term1887.getClass(), "newTrustlinesOnly", term2048);
        setField(term1887, term1887.getClass(), "useBlacklist", term2050);
        setField(term1887, term1887.getClass(), "maximumTrustlines", term2052);
        setField(term1887, term1887.getClass(), "dropType", enum5);
        setField(term1887, term1887.getClass(), "lockUuid", "AijpHYOFuy");
        setField(term1887, term1887.getClass(), "failReason", "SbAoxhfrkn");
        setField(term1887, term1887.getClass(), "feesPaid", "kuTXqwMtDB");
        setField(term1887, term1887.getClass(), "minBalance", "Ghbwtircqb");
        setField(term1887, term1887.getClass(), "maxBalance", "xrwlQZdwCp");
        setField(term1887, term1887.getClass(), "maxXrpFeePerTransaction", "IDCWpPLRkE");
        setField(term1887, term1887.getClass(), "retryOfId", term2138);
        setField(term1887, term1887.getClass(), "nftIssuerAddress", "nyiiPDVjAc");
        setField(term1887, term1887.getClass(), "nftTaxon", term2152);
        setField(term1887, term1887.getClass(), "contactEmail", "aKnKipADSo");
        setField(term1887, term1887.getClass(), "autoApprove", term2166);
        setField(term1887, term1887.getClass(), "memo", "wSQxaModmm");
        Long term2184 = new Long(6811161968424632369L);
        Long term2186 = new Long(-7237588299778557629L);
        Object term2183 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult"));
        setField(term2183, term2183.getClass(), "id", term2184);
        setField(term2183, term2183.getClass(), "count", term2186);
        Long term2190 = new Long(6967924379644551255L);
        Long term2192 = new Long(-2813493605142626659L);
        Object term2189 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult"));
        setField(term2189, term2189.getClass(), "id", term2190);
        setField(term2189, term2189.getClass(), "count", term2192);
        Long term2196 = new Long(-8885298608300233488L);
        Long term2198 = new Long(-4325723315152823407L);
        Object term2195 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult"));
        setField(term2195, term2195.getClass(), "id", term2196);
        setField(term2195, term2195.getClass(), "count", term2198);
        term2180 = new LinkedList();
        ((LinkedList) term2180).add(term2183);
        ((LinkedList) term2180).add(term2189);
        ((LinkedList) term2180).add(term2195);
        ((LinkedList) term2180).add((Object)null);
        ((LinkedList) term2180).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AridropSummaryServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term1887;
        args[1] = term2180;
        callMethod(klass, "convertWithTotals", argTypes, null, args);
    }

};


