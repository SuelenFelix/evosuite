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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_initialbalance_7087607598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444762;
     Object term444880;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_initialbalance_7087607598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444763 = new Long(6722117607141885589L);
        Integer term444777 = new Integer(-860131894);
        Long term444846 = new Long(-6209056926999752933L);
        Boolean term444861 = new Boolean(false);
        Boolean term444876 = new Boolean(false);
        Boolean term444878 = new Boolean(true);
        term444762 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term444827 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term444828 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term444830 = (int[]) newIntArray(6);
        Object term444844 = newInstance(Class.forName("java.util.Date"));
        Object term444848 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term444863 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term444762, term444762.getClass(), "sequence", term444763);
        setField(term444762, term444762.getClass(), "xrpBalance", "TvgFLUmwwW");
        setField(term444762, term444762.getClass(), "ownerCount", term444777);
        setField(term444762, term444762.getClass(), "previousAffectingTransactionID", "LrNiWJYyTG");
        setField(term444762, term444762.getClass(), "previousAffectingTransactionLedgerVersion", "ELrjumEBLg");
        setField(term444762, term444762.getClass(), "account", "xbmZKVroup");
        setField(term444762, term444762.getClass(), "parent", "LZMAvggNMe");
        setIntField(term444828, term444828.getClass(), "signum", 1);
        setIntElement(term444830, 0, 6251);
        setIntElement(term444830, 1, -2089382194);
        setIntElement(term444830, 2, 108979853);
        setIntElement(term444830, 3, -1512241849);
        setIntElement(term444830, 4, 924695156);
        setIntElement(term444830, 5, -1853169295);
        setField(term444828, term444828.getClass(), "mag", term444830);
        setIntField(term444828, term444828.getClass(), "bitCountPlusOne", 0);
        setIntField(term444828, term444828.getClass(), "bitLengthPlusOne", 0);
        setIntField(term444828, term444828.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term444828, term444828.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term444827, term444827.getClass(), "intVal", term444828);
        setIntField(term444827, term444827.getClass(), "scale", 52);
        setIntField(term444827, term444827.getClass(), "precision", 0);
        setField(term444827, term444827.getClass(), "stringCache", null);
        setLongField(term444827, term444827.getClass(), "intCompact", -9223372036854775808L);
        setField(term444762, term444762.getClass(), "initial_balance", term444827);
        setLongField(term444844, term444844.getClass(), "fastTime", 1292184809157L);
        setField(term444844, term444844.getClass(), "cdate", null);
        setField(term444762, term444762.getClass(), "inception", term444844);
        setField(term444762, term444762.getClass(), "ledger_index", term444846);
        setField(term444848, term444848.getClass(), "issuer", "vnpnXFWzvr");
        setField(term444848, term444848.getClass(), "kyc", term444861);
        setField(term444762, term444762.getClass(), "accountName", term444848);
        setField(term444863, term444863.getClass(), "issuer", "cbudVbeXed");
        setField(term444863, term444863.getClass(), "kyc", term444876);
        setField(term444762, term444762.getClass(), "parentName", term444863);
        setField(term444762, term444762.getClass(), "kycApproved", term444878);
        term444880 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term444881 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term444883 = (int[]) newIntArray(6);
        setIntField(term444881, term444881.getClass(), "signum", 1);
        setIntElement(term444883, 0, 256);
        setIntElement(term444883, 1, 98594422);
        setIntElement(term444883, 2, -1442587441);
        setIntElement(term444883, 3, 1360770213);
        setIntElement(term444883, 4, 1509833096);
        setIntElement(term444883, 5, 1701228933);
        setField(term444881, term444881.getClass(), "mag", term444883);
        setIntField(term444881, term444881.getClass(), "bitCountPlusOne", 0);
        setIntField(term444881, term444881.getClass(), "bitLengthPlusOne", 0);
        setIntField(term444881, term444881.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term444881, term444881.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term444880, term444880.getClass(), "intVal", term444881);
        setIntField(term444880, term444880.getClass(), "scale", 51);
        setIntField(term444880, term444880.getClass(), "precision", 0);
        setField(term444880, term444880.getClass(), "stringCache", null);
        setLongField(term444880, term444880.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term444880;
        callMethod(klass, "initial_balance", argTypes, term444762, args);
    }

};


