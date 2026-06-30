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

public class DropRecipientTransactions_equals_10687712671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78492;
     Object term78682;

    public DropRecipientTransactions_equals_10687712671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78494 = new Long(7247160664318067468L);
        Class<? extends Object> term78694 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term78693 = ((Class) term78694).getDeclaredField((String) "VERIFIED");
        ((Field) term78693).setAccessible(true);
        Object enum141 = ((Field) term78693).get((Object) null);
        Integer term78548 = new Integer(-2027534003);
        Long term78550 = new Long(2135754395358000892L);
        Long term78602 = new Long(-8085190702504231560L);
        Object term78590 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term78591 = newInstance(Class.forName("java.util.Date"));
        Object term78593 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term78591, term78591.getClass(), "fastTime", 1518551771568L);
        setField(term78591, term78591.getClass(), "cdate", null);
        setField(term78590, term78590.getClass(), "transactionDate", term78591);
        setField(term78593, term78593.getClass(), "intVal", null);
        setIntField(term78593, term78593.getClass(), "scale", 52);
        setIntField(term78593, term78593.getClass(), "precision", 0);
        setField(term78593, term78593.getClass(), "stringCache", null);
        setLongField(term78593, term78593.getClass(), "intCompact", -9223372036854775808L);
        setField(term78590, term78590.getClass(), "amount", term78593);
        setField(term78590, term78590.getClass(), "toAddress", "");
        setField(term78590, term78590.getClass(), "fromAddress", "");
        setField(term78590, term78590.getClass(), "currency", "");
        setField(term78590, term78590.getClass(), "issuerAddress", "");
        setField(term78590, term78590.getClass(), "transactionType", "");
        setField(term78590, term78590.getClass(), "ledgerIndex", term78602);
        setField(term78590, term78590.getClass(), "transactionHash", "");
        setField(term78590, term78590.getClass(), "resultCode", "");
        setField(term78590, term78590.getClass(), "reason", "");
        Long term78619 = new Long(1672578078364590450L);
        Object term78607 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term78608 = newInstance(Class.forName("java.util.Date"));
        Object term78610 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term78608, term78608.getClass(), "fastTime", 1496476439025L);
        setField(term78608, term78608.getClass(), "cdate", null);
        setField(term78607, term78607.getClass(), "transactionDate", term78608);
        setField(term78610, term78610.getClass(), "intVal", null);
        setIntField(term78610, term78610.getClass(), "scale", 52);
        setIntField(term78610, term78610.getClass(), "precision", 0);
        setField(term78610, term78610.getClass(), "stringCache", null);
        setLongField(term78610, term78610.getClass(), "intCompact", -9223372036854775808L);
        setField(term78607, term78607.getClass(), "amount", term78610);
        setField(term78607, term78607.getClass(), "toAddress", "");
        setField(term78607, term78607.getClass(), "fromAddress", "");
        setField(term78607, term78607.getClass(), "currency", "");
        setField(term78607, term78607.getClass(), "issuerAddress", "");
        setField(term78607, term78607.getClass(), "transactionType", "");
        setField(term78607, term78607.getClass(), "ledgerIndex", term78619);
        setField(term78607, term78607.getClass(), "transactionHash", "");
        setField(term78607, term78607.getClass(), "resultCode", "");
        setField(term78607, term78607.getClass(), "reason", "");
        Long term78636 = new Long(4949335493504695457L);
        Object term78624 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term78625 = newInstance(Class.forName("java.util.Date"));
        Object term78627 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term78625, term78625.getClass(), "fastTime", 1755788577674L);
        setField(term78625, term78625.getClass(), "cdate", null);
        setField(term78624, term78624.getClass(), "transactionDate", term78625);
        setField(term78627, term78627.getClass(), "intVal", null);
        setIntField(term78627, term78627.getClass(), "scale", 51);
        setIntField(term78627, term78627.getClass(), "precision", 0);
        setField(term78627, term78627.getClass(), "stringCache", null);
        setLongField(term78627, term78627.getClass(), "intCompact", -9223372036854775808L);
        setField(term78624, term78624.getClass(), "amount", term78627);
        setField(term78624, term78624.getClass(), "toAddress", "");
        setField(term78624, term78624.getClass(), "fromAddress", "");
        setField(term78624, term78624.getClass(), "currency", "");
        setField(term78624, term78624.getClass(), "issuerAddress", "");
        setField(term78624, term78624.getClass(), "transactionType", "");
        setField(term78624, term78624.getClass(), "ledgerIndex", term78636);
        setField(term78624, term78624.getClass(), "transactionHash", "");
        setField(term78624, term78624.getClass(), "resultCode", "");
        setField(term78624, term78624.getClass(), "reason", "");
        Long term78653 = new Long(-5216789073301458893L);
        Object term78641 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term78642 = newInstance(Class.forName("java.util.Date"));
        Object term78644 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term78642, term78642.getClass(), "fastTime", 1291600397937L);
        setField(term78642, term78642.getClass(), "cdate", null);
        setField(term78641, term78641.getClass(), "transactionDate", term78642);
        setField(term78644, term78644.getClass(), "intVal", null);
        setIntField(term78644, term78644.getClass(), "scale", 53);
        setIntField(term78644, term78644.getClass(), "precision", 0);
        setField(term78644, term78644.getClass(), "stringCache", null);
        setLongField(term78644, term78644.getClass(), "intCompact", -9223372036854775808L);
        setField(term78641, term78641.getClass(), "amount", term78644);
        setField(term78641, term78641.getClass(), "toAddress", "");
        setField(term78641, term78641.getClass(), "fromAddress", "");
        setField(term78641, term78641.getClass(), "currency", "");
        setField(term78641, term78641.getClass(), "issuerAddress", "");
        setField(term78641, term78641.getClass(), "transactionType", "");
        setField(term78641, term78641.getClass(), "ledgerIndex", term78653);
        setField(term78641, term78641.getClass(), "transactionHash", "");
        setField(term78641, term78641.getClass(), "resultCode", "");
        setField(term78641, term78641.getClass(), "reason", "");
        ArrayList term78588 = new ArrayList();
        ((ArrayList) term78588).add(term78590);
        ((ArrayList) term78588).add(term78607);
        ((ArrayList) term78588).add(term78624);
        ((ArrayList) term78588).add(term78641);
        Long term78674 = new Long(-1832940336320585644L);
        Object term78662 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term78663 = newInstance(Class.forName("java.util.Date"));
        Object term78665 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term78663, term78663.getClass(), "fastTime", 1838150926204L);
        setField(term78663, term78663.getClass(), "cdate", null);
        setField(term78662, term78662.getClass(), "transactionDate", term78663);
        setField(term78665, term78665.getClass(), "intVal", null);
        setIntField(term78665, term78665.getClass(), "scale", 51);
        setIntField(term78665, term78665.getClass(), "precision", 0);
        setField(term78665, term78665.getClass(), "stringCache", null);
        setLongField(term78665, term78665.getClass(), "intCompact", -9223372036854775808L);
        setField(term78662, term78662.getClass(), "amount", term78665);
        setField(term78662, term78662.getClass(), "toAddress", "");
        setField(term78662, term78662.getClass(), "fromAddress", "");
        setField(term78662, term78662.getClass(), "currency", "");
        setField(term78662, term78662.getClass(), "issuerAddress", "");
        setField(term78662, term78662.getClass(), "transactionType", "");
        setField(term78662, term78662.getClass(), "ledgerIndex", term78674);
        setField(term78662, term78662.getClass(), "transactionHash", "");
        setField(term78662, term78662.getClass(), "resultCode", "");
        setField(term78662, term78662.getClass(), "reason", "");
        ArrayList term78660 = new ArrayList();
        ((ArrayList) term78660).add(term78662);
        term78492 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions"));
        Object term78493 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term78508 = newInstance(Class.forName("java.util.Date"));
        Object term78510 = newInstance(Class.forName("java.util.Date"));
        setField(term78493, term78493.getClass(), "id", term78494);
        setField(term78493, term78493.getClass(), "address", "EhlWSobaco");
        setLongField(term78508, term78508.getClass(), "fastTime", 1816279347222L);
        setField(term78508, term78508.getClass(), "cdate", null);
        setField(term78493, term78493.getClass(), "createDate", term78508);
        setLongField(term78510, term78510.getClass(), "fastTime", 1267380225974L);
        setField(term78510, term78510.getClass(), "cdate", null);
        setField(term78493, term78493.getClass(), "updateDate", term78510);
        setField(term78493, term78493.getClass(), "status", enum141);
        setField(term78493, term78493.getClass(), "failReason", "hEuycunsSe");
        setField(term78493, term78493.getClass(), "code", "IMFzXhpNCx");
        setField(term78493, term78493.getClass(), "retryAttempt", term78548);
        setField(term78493, term78493.getClass(), "dropRequestId", term78550);
        setField(term78493, term78493.getClass(), "snapshotBalance", "xAtFmANjwD");
        setField(term78493, term78493.getClass(), "payAmount", "ICysuFllEZ");
        setField(term78493, term78493.getClass(), "ownedNftId", "cGQJTTxcXr");
        setField(term78492, term78492.getClass(), "dropRecipient", term78493);
        setField(term78492, term78492.getClass(), "transactions", term78588);
        setField(term78492, term78492.getClass(), "transactionsFromMap", term78660);
        setBooleanField(term78492, term78492.getClass(), "didReceive", true);
        term78682 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78682;
        callMethod(klass, "equals", argTypes, term78492, args);
    }

};


