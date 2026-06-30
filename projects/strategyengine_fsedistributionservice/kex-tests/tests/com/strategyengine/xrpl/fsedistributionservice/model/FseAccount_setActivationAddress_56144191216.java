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
import java.util.ArrayList;
import java.lang.Boolean;

public class FseAccount_setActivationAddress_56144191216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339819;

    public FseAccount_setActivationAddress_56144191216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339851 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339851, term339851.getClass(), "classicAddress", "");
        setField(term339851, term339851.getClass(), "currency", "");
        setField(term339851, term339851.getClass(), "balance", "");
        setField(term339851, term339851.getClass(), "limit", "");
        Object term339856 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339856, term339856.getClass(), "classicAddress", "");
        setField(term339856, term339856.getClass(), "currency", "");
        setField(term339856, term339856.getClass(), "balance", "");
        setField(term339856, term339856.getClass(), "limit", "");
        Object term339861 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339861, term339861.getClass(), "classicAddress", "");
        setField(term339861, term339861.getClass(), "currency", "");
        setField(term339861, term339861.getClass(), "balance", "");
        setField(term339861, term339861.getClass(), "limit", "");
        Object term339866 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339866, term339866.getClass(), "classicAddress", "");
        setField(term339866, term339866.getClass(), "currency", "");
        setField(term339866, term339866.getClass(), "balance", "");
        setField(term339866, term339866.getClass(), "limit", "");
        Object term339871 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339871, term339871.getClass(), "classicAddress", "");
        setField(term339871, term339871.getClass(), "currency", "");
        setField(term339871, term339871.getClass(), "balance", "");
        setField(term339871, term339871.getClass(), "limit", "");
        Object term339876 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339876, term339876.getClass(), "classicAddress", "");
        setField(term339876, term339876.getClass(), "currency", "");
        setField(term339876, term339876.getClass(), "balance", "");
        setField(term339876, term339876.getClass(), "limit", "");
        Object term339881 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339881, term339881.getClass(), "classicAddress", "");
        setField(term339881, term339881.getClass(), "currency", "");
        setField(term339881, term339881.getClass(), "balance", "");
        setField(term339881, term339881.getClass(), "limit", "");
        ArrayList term339849 = new ArrayList();
        ((ArrayList) term339849).add(term339851);
        ((ArrayList) term339849).add(term339856);
        ((ArrayList) term339849).add(term339861);
        ((ArrayList) term339849).add(term339866);
        ((ArrayList) term339849).add(term339871);
        ((ArrayList) term339849).add(term339876);
        ((ArrayList) term339849).add(term339881);
        Boolean term339900 = new Boolean(true);
        term339819 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339832 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339833 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339835 = (int[]) newIntArray(6);
        setField(term339819, term339819.getClass(), "classicAddress", "QecEdGoJpa");
        setIntField(term339833, term339833.getClass(), "signum", 1);
        setIntElement(term339835, 0, 17788);
        setIntElement(term339835, 1, 407886619);
        setIntElement(term339835, 2, -1208397652);
        setIntElement(term339835, 3, 882950086);
        setIntElement(term339835, 4, -1697313110);
        setIntElement(term339835, 5, 320717107);
        setField(term339833, term339833.getClass(), "mag", term339835);
        setIntField(term339833, term339833.getClass(), "bitCountPlusOne", 0);
        setIntField(term339833, term339833.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339833, term339833.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339833, term339833.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339832, term339832.getClass(), "intVal", term339833);
        setIntField(term339832, term339832.getClass(), "scale", 53);
        setIntField(term339832, term339832.getClass(), "precision", 0);
        setField(term339832, term339832.getClass(), "stringCache", null);
        setLongField(term339832, term339832.getClass(), "intCompact", -9223372036854775808L);
        setField(term339819, term339819.getClass(), "xrpBalance", term339832);
        setField(term339819, term339819.getClass(), "trustLines", term339849);
        setField(term339819, term339819.getClass(), "activationAddress", "xcAalPvMas");
        setField(term339819, term339819.getClass(), "blackholed", term339900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CUcmZFIqJn";
        callMethod(klass, "setActivationAddress", argTypes, term339819, args);
    }

};


