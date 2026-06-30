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

public class DropRecipientTransactions_toString_20282176324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80518;

    public DropRecipientTransactions_toString_20282176324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term80520 = new Long(-4393710401270724527L);
        Class<? extends Object> term80718 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term80717 = ((Class) term80718).getDeclaredField((String) "SENDING");
        ((Field) term80717).setAccessible(true);
        Object enum144 = ((Field) term80717).get((Object) null);
        Integer term80573 = new Integer(-478195677);
        Long term80575 = new Long(-4822736661741380518L);
        Long term80627 = new Long(-5386201758403679145L);
        Object term80615 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80616 = newInstance(Class.forName("java.util.Date"));
        Object term80618 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80616, term80616.getClass(), "fastTime", 1380452861286L);
        setField(term80616, term80616.getClass(), "cdate", null);
        setField(term80615, term80615.getClass(), "transactionDate", term80616);
        setField(term80618, term80618.getClass(), "intVal", null);
        setIntField(term80618, term80618.getClass(), "scale", 52);
        setIntField(term80618, term80618.getClass(), "precision", 0);
        setField(term80618, term80618.getClass(), "stringCache", null);
        setLongField(term80618, term80618.getClass(), "intCompact", -9223372036854775808L);
        setField(term80615, term80615.getClass(), "amount", term80618);
        setField(term80615, term80615.getClass(), "toAddress", "");
        setField(term80615, term80615.getClass(), "fromAddress", "");
        setField(term80615, term80615.getClass(), "currency", "");
        setField(term80615, term80615.getClass(), "issuerAddress", "");
        setField(term80615, term80615.getClass(), "transactionType", "");
        setField(term80615, term80615.getClass(), "ledgerIndex", term80627);
        setField(term80615, term80615.getClass(), "transactionHash", "");
        setField(term80615, term80615.getClass(), "resultCode", "");
        setField(term80615, term80615.getClass(), "reason", "");
        Long term80644 = new Long(-7268507582722666254L);
        Object term80632 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80633 = newInstance(Class.forName("java.util.Date"));
        Object term80635 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80633, term80633.getClass(), "fastTime", 1599094543267L);
        setField(term80633, term80633.getClass(), "cdate", null);
        setField(term80632, term80632.getClass(), "transactionDate", term80633);
        setField(term80635, term80635.getClass(), "intVal", null);
        setIntField(term80635, term80635.getClass(), "scale", 51);
        setIntField(term80635, term80635.getClass(), "precision", 0);
        setField(term80635, term80635.getClass(), "stringCache", null);
        setLongField(term80635, term80635.getClass(), "intCompact", -9223372036854775808L);
        setField(term80632, term80632.getClass(), "amount", term80635);
        setField(term80632, term80632.getClass(), "toAddress", "");
        setField(term80632, term80632.getClass(), "fromAddress", "");
        setField(term80632, term80632.getClass(), "currency", "");
        setField(term80632, term80632.getClass(), "issuerAddress", "");
        setField(term80632, term80632.getClass(), "transactionType", "");
        setField(term80632, term80632.getClass(), "ledgerIndex", term80644);
        setField(term80632, term80632.getClass(), "transactionHash", "");
        setField(term80632, term80632.getClass(), "resultCode", "");
        setField(term80632, term80632.getClass(), "reason", "");
        ArrayList term80613 = new ArrayList();
        ((ArrayList) term80613).add(term80615);
        ((ArrayList) term80613).add(term80632);
        Long term80665 = new Long(5671808784468963649L);
        Object term80653 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80654 = newInstance(Class.forName("java.util.Date"));
        Object term80656 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80654, term80654.getClass(), "fastTime", 1623687334907L);
        setField(term80654, term80654.getClass(), "cdate", null);
        setField(term80653, term80653.getClass(), "transactionDate", term80654);
        setField(term80656, term80656.getClass(), "intVal", null);
        setIntField(term80656, term80656.getClass(), "scale", 53);
        setIntField(term80656, term80656.getClass(), "precision", 0);
        setField(term80656, term80656.getClass(), "stringCache", null);
        setLongField(term80656, term80656.getClass(), "intCompact", -9223372036854775808L);
        setField(term80653, term80653.getClass(), "amount", term80656);
        setField(term80653, term80653.getClass(), "toAddress", "");
        setField(term80653, term80653.getClass(), "fromAddress", "");
        setField(term80653, term80653.getClass(), "currency", "");
        setField(term80653, term80653.getClass(), "issuerAddress", "");
        setField(term80653, term80653.getClass(), "transactionType", "");
        setField(term80653, term80653.getClass(), "ledgerIndex", term80665);
        setField(term80653, term80653.getClass(), "transactionHash", "");
        setField(term80653, term80653.getClass(), "resultCode", "");
        setField(term80653, term80653.getClass(), "reason", "");
        Long term80682 = new Long(2297097306706899827L);
        Object term80670 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80671 = newInstance(Class.forName("java.util.Date"));
        Object term80673 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80671, term80671.getClass(), "fastTime", 1597517553085L);
        setField(term80671, term80671.getClass(), "cdate", null);
        setField(term80670, term80670.getClass(), "transactionDate", term80671);
        setField(term80673, term80673.getClass(), "intVal", null);
        setIntField(term80673, term80673.getClass(), "scale", 52);
        setIntField(term80673, term80673.getClass(), "precision", 0);
        setField(term80673, term80673.getClass(), "stringCache", null);
        setLongField(term80673, term80673.getClass(), "intCompact", -9223372036854775808L);
        setField(term80670, term80670.getClass(), "amount", term80673);
        setField(term80670, term80670.getClass(), "toAddress", "");
        setField(term80670, term80670.getClass(), "fromAddress", "");
        setField(term80670, term80670.getClass(), "currency", "");
        setField(term80670, term80670.getClass(), "issuerAddress", "");
        setField(term80670, term80670.getClass(), "transactionType", "");
        setField(term80670, term80670.getClass(), "ledgerIndex", term80682);
        setField(term80670, term80670.getClass(), "transactionHash", "");
        setField(term80670, term80670.getClass(), "resultCode", "");
        setField(term80670, term80670.getClass(), "reason", "");
        Long term80699 = new Long(-900457279156388404L);
        Object term80687 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term80688 = newInstance(Class.forName("java.util.Date"));
        Object term80690 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term80688, term80688.getClass(), "fastTime", 1644421115303L);
        setField(term80688, term80688.getClass(), "cdate", null);
        setField(term80687, term80687.getClass(), "transactionDate", term80688);
        setField(term80690, term80690.getClass(), "intVal", null);
        setIntField(term80690, term80690.getClass(), "scale", 53);
        setIntField(term80690, term80690.getClass(), "precision", 0);
        setField(term80690, term80690.getClass(), "stringCache", null);
        setLongField(term80690, term80690.getClass(), "intCompact", -9223372036854775808L);
        setField(term80687, term80687.getClass(), "amount", term80690);
        setField(term80687, term80687.getClass(), "toAddress", "");
        setField(term80687, term80687.getClass(), "fromAddress", "");
        setField(term80687, term80687.getClass(), "currency", "");
        setField(term80687, term80687.getClass(), "issuerAddress", "");
        setField(term80687, term80687.getClass(), "transactionType", "");
        setField(term80687, term80687.getClass(), "ledgerIndex", term80699);
        setField(term80687, term80687.getClass(), "transactionHash", "");
        setField(term80687, term80687.getClass(), "resultCode", "");
        setField(term80687, term80687.getClass(), "reason", "");
        ArrayList term80651 = new ArrayList();
        ((ArrayList) term80651).add(term80653);
        ((ArrayList) term80651).add(term80670);
        ((ArrayList) term80651).add(term80687);
        term80518 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        Object term80519 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term80534 = newInstance(Class.forName("java.util.Date"));
        Object term80536 = newInstance(Class.forName("java.util.Date"));
        setField(term80519, term80519.getClass(), "id", term80520);
        setField(term80519, term80519.getClass(), "address", "kadRHthQRD");
        setLongField(term80534, term80534.getClass(), "fastTime", 1744270719416L);
        setField(term80534, term80534.getClass(), "cdate", null);
        setField(term80519, term80519.getClass(), "createDate", term80534);
        setLongField(term80536, term80536.getClass(), "fastTime", 1312186139711L);
        setField(term80536, term80536.getClass(), "cdate", null);
        setField(term80519, term80519.getClass(), "updateDate", term80536);
        setField(term80519, term80519.getClass(), "status", enum144);
        setField(term80519, term80519.getClass(), "failReason", "cGbJSRSpNn");
        setField(term80519, term80519.getClass(), "code", "MzXzaqaiHW");
        setField(term80519, term80519.getClass(), "retryAttempt", term80573);
        setField(term80519, term80519.getClass(), "dropRequestId", term80575);
        setField(term80519, term80519.getClass(), "snapshotBalance", "jWOWtrhVkA");
        setField(term80519, term80519.getClass(), "payAmount", "IyOhWYyaDV");
        setField(term80519, term80519.getClass(), "ownedNftId", "omWrkCSFzy");
        setField(term80518, term80518.getClass(), "dropRecipient", term80519);
        setField(term80518, term80518.getClass(), "transactions", term80613);
        setField(term80518, term80518.getClass(), "transactionsFromMap", term80651);
        setBooleanField(term80518, term80518.getClass(), "didReceive", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term80518, args);
    }

};


