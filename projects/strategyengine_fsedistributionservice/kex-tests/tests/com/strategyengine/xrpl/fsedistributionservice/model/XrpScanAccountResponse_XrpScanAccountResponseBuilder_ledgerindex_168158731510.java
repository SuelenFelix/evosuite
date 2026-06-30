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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_ledgerindex_168158731510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445175;
     Object term445293;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_ledgerindex_168158731510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term445176 = new Long(-3702098864254881563L);
        Integer term445190 = new Integer(1045547089);
        Long term445259 = new Long(1787205862282614159L);
        Boolean term445274 = new Boolean(true);
        Boolean term445289 = new Boolean(false);
        Boolean term445291 = new Boolean(false);
        term445175 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term445240 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term445241 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term445243 = (int[]) newIntArray(6);
        Object term445257 = newInstance(Class.forName("java.util.Date"));
        Object term445261 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term445276 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445175, term445175.getClass(), "sequence", term445176);
        setField(term445175, term445175.getClass(), "xrpBalance", "rZQVdeAYlM");
        setField(term445175, term445175.getClass(), "ownerCount", term445190);
        setField(term445175, term445175.getClass(), "previousAffectingTransactionID", "miQpwHDBxH");
        setField(term445175, term445175.getClass(), "previousAffectingTransactionLedgerVersion", "SDiMckZWSA");
        setField(term445175, term445175.getClass(), "account", "lBtaWtPHWf");
        setField(term445175, term445175.getClass(), "parent", "ebaQRypTcS");
        setIntField(term445241, term445241.getClass(), "signum", 1);
        setIntElement(term445243, 0, 146);
        setIntElement(term445243, 1, 2143117993);
        setIntElement(term445243, 2, -304859128);
        setIntElement(term445243, 3, 1272248797);
        setIntElement(term445243, 4, -1727134374);
        setIntElement(term445243, 5, -978617037);
        setField(term445241, term445241.getClass(), "mag", term445243);
        setIntField(term445241, term445241.getClass(), "bitCountPlusOne", 0);
        setIntField(term445241, term445241.getClass(), "bitLengthPlusOne", 0);
        setIntField(term445241, term445241.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term445241, term445241.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term445240, term445240.getClass(), "intVal", term445241);
        setIntField(term445240, term445240.getClass(), "scale", 52);
        setIntField(term445240, term445240.getClass(), "precision", 0);
        setField(term445240, term445240.getClass(), "stringCache", null);
        setLongField(term445240, term445240.getClass(), "intCompact", -9223372036854775808L);
        setField(term445175, term445175.getClass(), "initial_balance", term445240);
        setLongField(term445257, term445257.getClass(), "fastTime", 1854188130552L);
        setField(term445257, term445257.getClass(), "cdate", null);
        setField(term445175, term445175.getClass(), "inception", term445257);
        setField(term445175, term445175.getClass(), "ledger_index", term445259);
        setField(term445261, term445261.getClass(), "issuer", "acbKooiVyt");
        setField(term445261, term445261.getClass(), "kyc", term445274);
        setField(term445175, term445175.getClass(), "accountName", term445261);
        setField(term445276, term445276.getClass(), "issuer", "MdFuelPZIq");
        setField(term445276, term445276.getClass(), "kyc", term445289);
        setField(term445175, term445175.getClass(), "parentName", term445276);
        setField(term445175, term445175.getClass(), "kycApproved", term445291);
        term445293 = new Long(-7876013692629304244L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term445293;
        callMethod(klass, "ledger_index", argTypes, term445175, args);
    }

};


