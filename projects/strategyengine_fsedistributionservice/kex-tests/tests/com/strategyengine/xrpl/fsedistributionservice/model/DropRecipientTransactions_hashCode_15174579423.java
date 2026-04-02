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
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;
import java.util.ArrayList;

public class DropRecipientTransactions_hashCode_15174579423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79893;

    public DropRecipientTransactions_hashCode_15174579423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79895 = new Long(-6950146046121430355L);
        Class<? extends Object> term80043 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term80042 = ((Class) term80043).getDeclaredField((String) "VERIFIED");
        ((Field) term80042).setAccessible(true);
        Object enum143 = ((Field) term80042).get((Object) null);
        Integer term79949 = new Integer(1375330971);
        Long term79951 = new Long(1667122142089513324L);
        Long term80003 = new Long(-6342139649364011743L);
        Object term79991 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term79992 = newInstance(Class.forName("java.util.Date"));
        Object term79994 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term79992, term79992.getClass(), "fastTime", 1446437953738L);
        setField(term79992, term79992.getClass(), "cdate", null);
        setField(term79991, term79991.getClass(), "transactionDate", term79992);
        setField(term79994, term79994.getClass(), "intVal", null);
        setIntField(term79994, term79994.getClass(), "scale", 52);
        setIntField(term79994, term79994.getClass(), "precision", 0);
        setField(term79994, term79994.getClass(), "stringCache", null);
        setLongField(term79994, term79994.getClass(), "intCompact", -9223372036854775808L);
        setField(term79991, term79991.getClass(), "amount", term79994);
        setField(term79991, term79991.getClass(), "toAddress", "");
        setField(term79991, term79991.getClass(), "fromAddress", "");
        setField(term79991, term79991.getClass(), "currency", "");
        setField(term79991, term79991.getClass(), "issuerAddress", "");
        setField(term79991, term79991.getClass(), "transactionType", "");
        setField(term79991, term79991.getClass(), "ledgerIndex", term80003);
        setField(term79991, term79991.getClass(), "transactionHash", "");
        setField(term79991, term79991.getClass(), "resultCode", "");
        setField(term79991, term79991.getClass(), "reason", "");
        ArrayList term79989 = new ArrayList();
        ((ArrayList) term79989).add(term79991);
        Long term80024 = new Long(-4924950707540628022L);
        Object term80012 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80013 = newInstance(Class.forName("java.util.Date"));
        Object term80015 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80013, term80013.getClass(), "fastTime", 1847834235018L);
        setField(term80013, term80013.getClass(), "cdate", null);
        setField(term80012, term80012.getClass(), "transactionDate", term80013);
        setField(term80015, term80015.getClass(), "intVal", null);
        setIntField(term80015, term80015.getClass(), "scale", 53);
        setIntField(term80015, term80015.getClass(), "precision", 0);
        setField(term80015, term80015.getClass(), "stringCache", null);
        setLongField(term80015, term80015.getClass(), "intCompact", -9223372036854775808L);
        setField(term80012, term80012.getClass(), "amount", term80015);
        setField(term80012, term80012.getClass(), "toAddress", "");
        setField(term80012, term80012.getClass(), "fromAddress", "");
        setField(term80012, term80012.getClass(), "currency", "");
        setField(term80012, term80012.getClass(), "issuerAddress", "");
        setField(term80012, term80012.getClass(), "transactionType", "");
        setField(term80012, term80012.getClass(), "ledgerIndex", term80024);
        setField(term80012, term80012.getClass(), "transactionHash", "");
        setField(term80012, term80012.getClass(), "resultCode", "");
        setField(term80012, term80012.getClass(), "reason", "");
        ArrayList term80010 = new ArrayList();
        ((ArrayList) term80010).add(term80012);
        term79893 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        Object term79894 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term79909 = newInstance(Class.forName("java.util.Date"));
        Object term79911 = newInstance(Class.forName("java.util.Date"));
        setField(term79894, term79894.getClass(), "id", term79895);
        setField(term79894, term79894.getClass(), "address", "XgJzBOYfQB");
        setLongField(term79909, term79909.getClass(), "fastTime", 1736141630618L);
        setField(term79909, term79909.getClass(), "cdate", null);
        setField(term79894, term79894.getClass(), "createDate", term79909);
        setLongField(term79911, term79911.getClass(), "fastTime", 1267044489300L);
        setField(term79911, term79911.getClass(), "cdate", null);
        setField(term79894, term79894.getClass(), "updateDate", term79911);
        setField(term79894, term79894.getClass(), "status", enum143);
        setField(term79894, term79894.getClass(), "failReason", "GAPGgDekVG");
        setField(term79894, term79894.getClass(), "code", "WmTogHwGLE");
        setField(term79894, term79894.getClass(), "retryAttempt", term79949);
        setField(term79894, term79894.getClass(), "dropRequestId", term79951);
        setField(term79894, term79894.getClass(), "snapshotBalance", "qYOIXsGycY");
        setField(term79894, term79894.getClass(), "payAmount", "sJNXNshRLe");
        setField(term79894, term79894.getClass(), "ownedNftId", "AYnbmgRCKr");
        setField(term79893, term79893.getClass(), "dropRecipient", term79894);
        setField(term79893, term79893.getClass(), "transactions", term79989);
        setField(term79893, term79893.getClass(), "transactionsFromMap", term80010);
        setBooleanField(term79893, term79893.getClass(), "didReceive", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term79893, args);
    }

};


