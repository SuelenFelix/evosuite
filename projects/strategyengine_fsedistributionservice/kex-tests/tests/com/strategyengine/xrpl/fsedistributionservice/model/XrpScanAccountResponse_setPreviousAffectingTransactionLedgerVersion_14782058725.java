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

public class XrpScanAccountResponse_setPreviousAffectingTransactionLedgerVersion_14782058725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412695;

    public XrpScanAccountResponse_setPreviousAffectingTransactionLedgerVersion_14782058725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412696 = new Long(3757985447600693853L);
        Integer term412710 = new Integer(-1896376975);
        Long term412779 = new Long(7118424169978013558L);
        Boolean term412794 = new Boolean(true);
        Boolean term412809 = new Boolean(true);
        Boolean term412811 = new Boolean(true);
        term412695 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term412760 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term412761 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412763 = (int[]) newIntArray(6);
        Object term412777 = newInstance(Class.forName("java.util.Date"));
        Object term412781 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term412796 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term412695, term412695.getClass(), "sequence", term412696);
        setField(term412695, term412695.getClass(), "xrpBalance", "CjawQhylQy");
        setField(term412695, term412695.getClass(), "ownerCount", term412710);
        setField(term412695, term412695.getClass(), "previousAffectingTransactionID", "lrsQRdihYy");
        setField(term412695, term412695.getClass(), "previousAffectingTransactionLedgerVersion", "hxShFHWmla");
        setField(term412695, term412695.getClass(), "account", "iNdFuJdkYh");
        setField(term412695, term412695.getClass(), "parent", "hnYavGDgbr");
        setIntField(term412761, term412761.getClass(), "signum", 1);
        setIntElement(term412763, 0, 12198);
        setIntElement(term412763, 1, -839826431);
        setIntElement(term412763, 2, -402773663);
        setIntElement(term412763, 3, 1390324455);
        setIntElement(term412763, 4, -2067354632);
        setIntElement(term412763, 5, -1772807621);
        setField(term412761, term412761.getClass(), "mag", term412763);
        setIntField(term412761, term412761.getClass(), "bitCountPlusOne", 0);
        setIntField(term412761, term412761.getClass(), "bitLengthPlusOne", 0);
        setIntField(term412761, term412761.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term412761, term412761.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term412760, term412760.getClass(), "intVal", term412761);
        setIntField(term412760, term412760.getClass(), "scale", 53);
        setIntField(term412760, term412760.getClass(), "precision", 0);
        setField(term412760, term412760.getClass(), "stringCache", null);
        setLongField(term412760, term412760.getClass(), "intCompact", -9223372036854775808L);
        setField(term412695, term412695.getClass(), "initial_balance", term412760);
        setLongField(term412777, term412777.getClass(), "fastTime", 1537372958861L);
        setField(term412777, term412777.getClass(), "cdate", null);
        setField(term412695, term412695.getClass(), "inception", term412777);
        setField(term412695, term412695.getClass(), "ledger_index", term412779);
        setField(term412781, term412781.getClass(), "issuer", "mcmQxsSItU");
        setField(term412781, term412781.getClass(), "kyc", term412794);
        setField(term412695, term412695.getClass(), "accountName", term412781);
        setField(term412796, term412796.getClass(), "issuer", "ppbAxYzNBY");
        setField(term412796, term412796.getClass(), "kyc", term412809);
        setField(term412695, term412695.getClass(), "parentName", term412796);
        setField(term412695, term412695.getClass(), "kycApproved", term412811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ihHWIriTVZ";
        callMethod(klass, "setPreviousAffectingTransactionLedgerVersion", argTypes, term412695, args);
    }

};


