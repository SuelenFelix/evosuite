package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class TaxRule_getTaxConfig_16968786921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29551;

    public TaxRule_getTaxConfig_16968786921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29552 = new Long(-604910205679247392L);
        Long term29574 = new Long(2280240558714436788L);
        Long term29632 = new Long(9164041864010757052L);
        Object term29631 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term29631, term29631.getClass(), "id", term29632);
        setField(term29631, term29631.getClass(), "taxCode", null);
        setBooleanField(term29631, term29631.getClass(), "isLinear", false);
        setIntField(term29631, term29631.getClass(), "aFactor", -2083858949);
        setIntField(term29631, term29631.getClass(), "bFactor", -1878319299);
        setBooleanField(term29631, term29631.getClass(), "isSquare", true);
        setIntField(term29631, term29631.getClass(), "aSquareFactor", -690862846);
        setIntField(term29631, term29631.getClass(), "bSquareFactor", 805027262);
        setIntField(term29631, term29631.getClass(), "cSuqreFactor", 717389178);
        setField(term29631, term29631.getClass(), "taxConfig", null);
        Long term29642 = new Long(4418899868035922058L);
        Object term29641 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term29641, term29641.getClass(), "id", term29642);
        setField(term29641, term29641.getClass(), "taxCode", null);
        setBooleanField(term29641, term29641.getClass(), "isLinear", false);
        setIntField(term29641, term29641.getClass(), "aFactor", 658684460);
        setIntField(term29641, term29641.getClass(), "bFactor", 2073367039);
        setBooleanField(term29641, term29641.getClass(), "isSquare", false);
        setIntField(term29641, term29641.getClass(), "aSquareFactor", -365877126);
        setIntField(term29641, term29641.getClass(), "bSquareFactor", 251018856);
        setIntField(term29641, term29641.getClass(), "cSuqreFactor", -1965331640);
        setField(term29641, term29641.getClass(), "taxConfig", null);
        Long term29652 = new Long(5467431248910278098L);
        Object term29651 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term29651, term29651.getClass(), "id", term29652);
        setField(term29651, term29651.getClass(), "taxCode", null);
        setBooleanField(term29651, term29651.getClass(), "isLinear", false);
        setIntField(term29651, term29651.getClass(), "aFactor", -1427059961);
        setIntField(term29651, term29651.getClass(), "bFactor", 1120685189);
        setBooleanField(term29651, term29651.getClass(), "isSquare", false);
        setIntField(term29651, term29651.getClass(), "aSquareFactor", 654585209);
        setIntField(term29651, term29651.getClass(), "bSquareFactor", -1661685401);
        setIntField(term29651, term29651.getClass(), "cSuqreFactor", 1427434947);
        setField(term29651, term29651.getClass(), "taxConfig", null);
        Object term29661 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term29661, term29661.getClass(), "id", null);
        setField(term29661, term29661.getClass(), "taxCode", null);
        setBooleanField(term29661, term29661.getClass(), "isLinear", false);
        setIntField(term29661, term29661.getClass(), "aFactor", 0);
        setIntField(term29661, term29661.getClass(), "bFactor", 0);
        setBooleanField(term29661, term29661.getClass(), "isSquare", false);
        setIntField(term29661, term29661.getClass(), "aSquareFactor", 0);
        setIntField(term29661, term29661.getClass(), "bSquareFactor", 0);
        setIntField(term29661, term29661.getClass(), "cSuqreFactor", 0);
        setField(term29661, term29661.getClass(), "taxConfig", null);
        Object term29669 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term29669, term29669.getClass(), "id", null);
        setField(term29669, term29669.getClass(), "taxCode", null);
        setBooleanField(term29669, term29669.getClass(), "isLinear", false);
        setIntField(term29669, term29669.getClass(), "aFactor", 0);
        setIntField(term29669, term29669.getClass(), "bFactor", 0);
        setBooleanField(term29669, term29669.getClass(), "isSquare", false);
        setIntField(term29669, term29669.getClass(), "aSquareFactor", 0);
        setIntField(term29669, term29669.getClass(), "bSquareFactor", 0);
        setIntField(term29669, term29669.getClass(), "cSuqreFactor", 0);
        setField(term29669, term29669.getClass(), "taxConfig", null);
        ArrayList term29629 = new ArrayList();
        ((ArrayList) term29629).add(term29631);
        ((ArrayList) term29629).add(term29641);
        ((ArrayList) term29629).add(term29641);
        ((ArrayList) term29629).add(term29651);
        ((ArrayList) term29629).add(term29661);
        ((ArrayList) term29629).add(term29641);
        ((ArrayList) term29629).add(term29669);
        term29551 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term29573 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term29612 = newInstance(Class.forName("java.time.Instant"));
        setField(term29551, term29551.getClass(), "id", term29552);
        setField(term29551, term29551.getClass(), "taxCode", "dUTYEKtTfQ");
        setBooleanField(term29551, term29551.getClass(), "isLinear", false);
        setIntField(term29551, term29551.getClass(), "aFactor", -1696192372);
        setIntField(term29551, term29551.getClass(), "bFactor", 1239525687);
        setBooleanField(term29551, term29551.getClass(), "isSquare", false);
        setIntField(term29551, term29551.getClass(), "aSquareFactor", 1496590861);
        setIntField(term29551, term29551.getClass(), "bSquareFactor", 1046957508);
        setIntField(term29551, term29551.getClass(), "cSuqreFactor", -553500478);
        setField(term29573, term29573.getClass(), "id", term29574);
        setField(term29573, term29573.getClass(), "description", "HUtbHklGel");
        setField(term29573, term29573.getClass(), "countryReason", "QbfKDAwhSB");
        setField(term29573, term29573.getClass(), "countryCode", "ckTRHEIcCK");
        setLongField(term29612, term29612.getClass(), "seconds", 1704114395L);
        setIntField(term29612, term29612.getClass(), "nanos", 126000000);
        setField(term29573, term29573.getClass(), "lastModifiedDate", term29612);
        setField(term29573, term29573.getClass(), "modifiedBy", "NYSBqIpNlD");
        setIntField(term29573, term29573.getClass(), "currentRulesCount", 841910530);
        setIntField(term29573, term29573.getClass(), "maxRulesCount", -1415371559);
        setField(term29573, term29573.getClass(), "taxRules", term29629);
        setField(term29551, term29551.getClass(), "taxConfig", term29573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaxConfig", argTypes, term29551, args);
    }

};


