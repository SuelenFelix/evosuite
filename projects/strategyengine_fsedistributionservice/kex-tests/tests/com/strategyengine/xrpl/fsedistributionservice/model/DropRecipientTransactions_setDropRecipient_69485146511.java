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

public class DropRecipientTransactions_setDropRecipient_69485146511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85295;
     Object term85417;

    public DropRecipientTransactions_setDropRecipient_69485146511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term85297 = new Long(-1677189124507026637L);
        Class<? extends Object> term85511 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term85510 = ((Class) term85511).getDeclaredField((String) "VERIFIED");
        ((Field) term85510).setAccessible(true);
        Object enum150 = ((Field) term85510).get((Object) null);
        Integer term85351 = new Integer(1090617576);
        Long term85353 = new Long(4795660804170399986L);
        Long term85405 = new Long(-4030863184426321096L);
        Object term85393 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term85394 = newInstance(Class.forName("java.util.Date"));
        Object term85396 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term85394, term85394.getClass(), "fastTime", 1330527043188L);
        setField(term85394, term85394.getClass(), "cdate", null);
        setField(term85393, term85393.getClass(), "transactionDate", term85394);
        setField(term85396, term85396.getClass(), "intVal", null);
        setIntField(term85396, term85396.getClass(), "scale", 50);
        setIntField(term85396, term85396.getClass(), "precision", 0);
        setField(term85396, term85396.getClass(), "stringCache", null);
        setLongField(term85396, term85396.getClass(), "intCompact", -9223372036854775808L);
        setField(term85393, term85393.getClass(), "amount", term85396);
        setField(term85393, term85393.getClass(), "toAddress", "");
        setField(term85393, term85393.getClass(), "fromAddress", "");
        setField(term85393, term85393.getClass(), "currency", "");
        setField(term85393, term85393.getClass(), "issuerAddress", "");
        setField(term85393, term85393.getClass(), "transactionType", "");
        setField(term85393, term85393.getClass(), "ledgerIndex", term85405);
        setField(term85393, term85393.getClass(), "transactionHash", "");
        setField(term85393, term85393.getClass(), "resultCode", "");
        setField(term85393, term85393.getClass(), "reason", "");
        ArrayList term85391 = new ArrayList();
        ((ArrayList) term85391).add(term85393);
        ArrayList term85412 = new ArrayList();
        term85295 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        Object term85296 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term85311 = newInstance(Class.forName("java.util.Date"));
        Object term85313 = newInstance(Class.forName("java.util.Date"));
        setField(term85296, term85296.getClass(), "id", term85297);
        setField(term85296, term85296.getClass(), "address", "wNndrIQDbr");
        setLongField(term85311, term85311.getClass(), "fastTime", 1372844831512L);
        setField(term85311, term85311.getClass(), "cdate", null);
        setField(term85296, term85296.getClass(), "createDate", term85311);
        setLongField(term85313, term85313.getClass(), "fastTime", 1854285818602L);
        setField(term85313, term85313.getClass(), "cdate", null);
        setField(term85296, term85296.getClass(), "updateDate", term85313);
        setField(term85296, term85296.getClass(), "status", enum150);
        setField(term85296, term85296.getClass(), "failReason", "JiSIFtJnYv");
        setField(term85296, term85296.getClass(), "code", "wxAHQRVgKc");
        setField(term85296, term85296.getClass(), "retryAttempt", term85351);
        setField(term85296, term85296.getClass(), "dropRequestId", term85353);
        setField(term85296, term85296.getClass(), "snapshotBalance", "bYsZEHeoeV");
        setField(term85296, term85296.getClass(), "payAmount", "IwvwrQylib");
        setField(term85296, term85296.getClass(), "ownedNftId", "ZWJgSttNjg");
        setField(term85295, term85295.getClass(), "dropRecipient", term85296);
        setField(term85295, term85295.getClass(), "transactions", term85391);
        setField(term85295, term85295.getClass(), "transactionsFromMap", term85412);
        setBooleanField(term85295, term85295.getClass(), "didReceive", true);
        Long term85418 = new Long(-8010214112439224349L);
        Integer term85460 = new Integer(-1547384488);
        Long term85462 = new Long(-6673920710396545553L);
        term85417 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term85432 = newInstance(Class.forName("java.util.Date"));
        Object term85434 = newInstance(Class.forName("java.util.Date"));
        setField(term85417, term85417.getClass(), "id", term85418);
        setField(term85417, term85417.getClass(), "address", "EteTxkDxin");
        setLongField(term85432, term85432.getClass(), "fastTime", 1755133084362L);
        setField(term85432, term85432.getClass(), "cdate", null);
        setField(term85417, term85417.getClass(), "createDate", term85432);
        setLongField(term85434, term85434.getClass(), "fastTime", 1879103408714L);
        setField(term85434, term85434.getClass(), "cdate", null);
        setField(term85417, term85417.getClass(), "updateDate", term85434);
        setField(term85417, term85417.getClass(), "status", enum150);
        setField(term85417, term85417.getClass(), "failReason", "mKgLwPdYbY");
        setField(term85417, term85417.getClass(), "code", "zqykonsLIo");
        setField(term85417, term85417.getClass(), "retryAttempt", term85460);
        setField(term85417, term85417.getClass(), "dropRequestId", term85462);
        setField(term85417, term85417.getClass(), "snapshotBalance", "KoPzTuvIeK");
        setField(term85417, term85417.getClass(), "payAmount", "SMoWUILIhn");
        setField(term85417, term85417.getClass(), "ownedNftId", "SvSKSCjgTM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Object[] args = new Object[1];
        args[0] = term85417;
        callMethod(klass, "setDropRecipient", argTypes, term85295, args);
    }

};


