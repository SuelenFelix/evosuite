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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Boolean;

public class DropRecipientTransactions_init_94668325710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84172;
     Object term84265;
     Object term84538;
     Object term84653;

    public DropRecipientTransactions_init_94668325710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term84173 = new Long(4616440478358528406L);
        Class<? extends Object> term84666 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term84665 = ((Class) term84666).getDeclaredField((String) "QUEUED");
        ((Field) term84665).setAccessible(true);
        Object enum149 = ((Field) term84665).get((Object) null);
        Integer term84225 = new Integer(-1465035361);
        Long term84227 = new Long(3427570961451840069L);
        term84172 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term84187 = newInstance(Class.forName("java.util.Date"));
        Object term84189 = newInstance(Class.forName("java.util.Date"));
        setField(term84172, term84172.getClass(), "id", term84173);
        setField(term84172, term84172.getClass(), "address", "FLLklaMZvg");
        setLongField(term84187, term84187.getClass(), "fastTime", 1384837537981L);
        setField(term84187, term84187.getClass(), "cdate", null);
        setField(term84172, term84172.getClass(), "createDate", term84187);
        setLongField(term84189, term84189.getClass(), "fastTime", 1444705856246L);
        setField(term84189, term84189.getClass(), "cdate", null);
        setField(term84172, term84172.getClass(), "updateDate", term84189);
        setField(term84172, term84172.getClass(), "status", enum149);
        setField(term84172, term84172.getClass(), "failReason", "jRDZpkFkoD");
        setField(term84172, term84172.getClass(), "code", "wwSknqIBIO");
        setField(term84172, term84172.getClass(), "retryAttempt", term84225);
        setField(term84172, term84172.getClass(), "dropRequestId", term84227);
        setField(term84172, term84172.getClass(), "snapshotBalance", "zQPAxUFaeX");
        setField(term84172, term84172.getClass(), "payAmount", "cKNHUkrYfK");
        setField(term84172, term84172.getClass(), "ownedNftId", "crMeWqJOCQ");
        Long term84341 = new Long(4502292577098212311L);
        Object term84268 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term84269 = newInstance(Class.forName("java.util.Date"));
        Object term84271 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term84272 = newInstance(Class.forName("java.math.BigInteger"));
        setLongField(term84269, term84269.getClass(), "fastTime", 1758154207110L);
        setField(term84269, term84269.getClass(), "cdate", null);
        setField(term84268, term84268.getClass(), "transactionDate", term84269);
        setIntField(term84272, term84272.getClass(), "signum", 1);
        setField(term84272, term84272.getClass(), "mag", null);
        setIntField(term84272, term84272.getClass(), "bitCountPlusOne", 0);
        setIntField(term84272, term84272.getClass(), "bitLengthPlusOne", 0);
        setIntField(term84272, term84272.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term84272, term84272.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term84271, term84271.getClass(), "intVal", term84272);
        setIntField(term84271, term84271.getClass(), "scale", 53);
        setIntField(term84271, term84271.getClass(), "precision", 0);
        setField(term84271, term84271.getClass(), "stringCache", null);
        setLongField(term84271, term84271.getClass(), "intCompact", -9223372036854775808L);
        setField(term84268, term84268.getClass(), "amount", term84271);
        setField(term84268, term84268.getClass(), "toAddress", "VUVgiQvSYa");
        setField(term84268, term84268.getClass(), "fromAddress", "sEGgJJplmE");
        setField(term84268, term84268.getClass(), "currency", "jyexiarswN");
        setField(term84268, term84268.getClass(), "issuerAddress", "ZBLFNFVEHD");
        setField(term84268, term84268.getClass(), "transactionType", "miNxpUfOyL");
        setField(term84268, term84268.getClass(), "ledgerIndex", term84341);
        setField(term84268, term84268.getClass(), "transactionHash", "BAPTojeHRU");
        setField(term84268, term84268.getClass(), "resultCode", "uqDEIRoVVf");
        setField(term84268, term84268.getClass(), "reason", "HnLeZhnLzz");
        Long term84392 = new Long(-3730936709704460408L);
        Object term84380 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term84381 = newInstance(Class.forName("java.util.Date"));
        Object term84383 = newInstance(Class.forName("java.math.BigDecimal"));
        setLongField(term84381, term84381.getClass(), "fastTime", 1374840193140L);
        setField(term84381, term84381.getClass(), "cdate", null);
        setField(term84380, term84380.getClass(), "transactionDate", term84381);
        setField(term84383, term84383.getClass(), "intVal", null);
        setIntField(term84383, term84383.getClass(), "scale", 51);
        setIntField(term84383, term84383.getClass(), "precision", 0);
        setField(term84383, term84383.getClass(), "stringCache", null);
        setLongField(term84383, term84383.getClass(), "intCompact", -9223372036854775808L);
        setField(term84380, term84380.getClass(), "amount", term84383);
        setField(term84380, term84380.getClass(), "toAddress", "");
        setField(term84380, term84380.getClass(), "fromAddress", "");
        setField(term84380, term84380.getClass(), "currency", "");
        setField(term84380, term84380.getClass(), "issuerAddress", "");
        setField(term84380, term84380.getClass(), "transactionType", "");
        setField(term84380, term84380.getClass(), "ledgerIndex", term84392);
        setField(term84380, term84380.getClass(), "transactionHash", "");
        setField(term84380, term84380.getClass(), "resultCode", "");
        setField(term84380, term84380.getClass(), "reason", "");
        Long term84399 = new Long(-8614778293741404325L);
        Object term84398 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        setField(term84398, term84398.getClass(), "transactionDate", null);
        setField(term84398, term84398.getClass(), "amount", null);
        setField(term84398, term84398.getClass(), "toAddress", null);
        setField(term84398, term84398.getClass(), "fromAddress", null);
        setField(term84398, term84398.getClass(), "currency", null);
        setField(term84398, term84398.getClass(), "issuerAddress", null);
        setField(term84398, term84398.getClass(), "transactionType", null);
        setField(term84398, term84398.getClass(), "ledgerIndex", term84399);
        setField(term84398, term84398.getClass(), "transactionHash", null);
        setField(term84398, term84398.getClass(), "resultCode", null);
        setField(term84398, term84398.getClass(), "reason", null);
        term84265 = new LinkedList();
        ((LinkedList) term84265).add(term84268);
        ((LinkedList) term84265).add(term84380);
        ((LinkedList) term84265).add(term84398);
        ((LinkedList) term84265).add((Object)null);
        ((LinkedList) term84265).add((Object)null);
        ((LinkedList) term84265).add((Object)null);
        ((LinkedList) term84265).add((Object)null);
        ((LinkedList) term84265).add((Object)null);
        ((LinkedList) term84265).add((Object)null);
        Long term84614 = new Long(3090901538358721367L);
        Object term84541 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term84542 = newInstance(Class.forName("java.util.Date"));
        Object term84544 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term84545 = newInstance(Class.forName("java.math.BigInteger"));
        setLongField(term84542, term84542.getClass(), "fastTime", 1291742269425L);
        setField(term84542, term84542.getClass(), "cdate", null);
        setField(term84541, term84541.getClass(), "transactionDate", term84542);
        setIntField(term84545, term84545.getClass(), "signum", 1);
        setField(term84545, term84545.getClass(), "mag", null);
        setIntField(term84545, term84545.getClass(), "bitCountPlusOne", 0);
        setIntField(term84545, term84545.getClass(), "bitLengthPlusOne", 0);
        setIntField(term84545, term84545.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term84545, term84545.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term84544, term84544.getClass(), "intVal", term84545);
        setIntField(term84544, term84544.getClass(), "scale", 53);
        setIntField(term84544, term84544.getClass(), "precision", 0);
        setField(term84544, term84544.getClass(), "stringCache", null);
        setLongField(term84544, term84544.getClass(), "intCompact", -9223372036854775808L);
        setField(term84541, term84541.getClass(), "amount", term84544);
        setField(term84541, term84541.getClass(), "toAddress", "vLrTnQTIPg");
        setField(term84541, term84541.getClass(), "fromAddress", "GsXvLZCFtf");
        setField(term84541, term84541.getClass(), "currency", "JqSCTBGSUs");
        setField(term84541, term84541.getClass(), "issuerAddress", "bZrrPiMnsr");
        setField(term84541, term84541.getClass(), "transactionType", "IeromvfDmz");
        setField(term84541, term84541.getClass(), "ledgerIndex", term84614);
        setField(term84541, term84541.getClass(), "transactionHash", "xJLHPTRSqe");
        setField(term84541, term84541.getClass(), "resultCode", "OIFZYdbUZz");
        setField(term84541, term84541.getClass(), "reason", "FPablxseTr");
        term84538 = new LinkedList();
        ((LinkedList) term84538).add(term84541);
        term84653 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.DropRecipientTransactions");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term84172;
        args[1] = term84265;
        args[2] = term84538;
        args[3] = term84653;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


