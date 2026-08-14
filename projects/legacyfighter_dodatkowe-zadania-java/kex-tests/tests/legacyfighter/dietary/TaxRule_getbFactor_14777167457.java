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

public class TaxRule_getbFactor_14777167457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30683;

    public TaxRule_getbFactor_14777167457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30684 = new Long(-7657074490059876332L);
        Long term30706 = new Long(-4773629433896348407L);
        Long term30764 = new Long(-5187796980288712037L);
        Object term30763 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30763, term30763.getClass(), "id", term30764);
        setField(term30763, term30763.getClass(), "taxCode", null);
        setBooleanField(term30763, term30763.getClass(), "isLinear", true);
        setIntField(term30763, term30763.getClass(), "aFactor", -785719854);
        setIntField(term30763, term30763.getClass(), "bFactor", -1542292796);
        setBooleanField(term30763, term30763.getClass(), "isSquare", false);
        setIntField(term30763, term30763.getClass(), "aSquareFactor", 1892295932);
        setIntField(term30763, term30763.getClass(), "bSquareFactor", 1028855301);
        setIntField(term30763, term30763.getClass(), "cSuqreFactor", -2075314038);
        setField(term30763, term30763.getClass(), "taxConfig", null);
        Object term30773 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30773, term30773.getClass(), "id", null);
        setField(term30773, term30773.getClass(), "taxCode", null);
        setBooleanField(term30773, term30773.getClass(), "isLinear", false);
        setIntField(term30773, term30773.getClass(), "aFactor", 0);
        setIntField(term30773, term30773.getClass(), "bFactor", 0);
        setBooleanField(term30773, term30773.getClass(), "isSquare", false);
        setIntField(term30773, term30773.getClass(), "aSquareFactor", 0);
        setIntField(term30773, term30773.getClass(), "bSquareFactor", 0);
        setIntField(term30773, term30773.getClass(), "cSuqreFactor", 0);
        setField(term30773, term30773.getClass(), "taxConfig", null);
        ArrayList term30761 = new ArrayList();
        ((ArrayList) term30761).add(term30763);
        ((ArrayList) term30761).add(term30773);
        ((ArrayList) term30761).add(term30773);
        term30683 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term30705 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term30744 = newInstance(Class.forName("java.time.Instant"));
        setField(term30683, term30683.getClass(), "id", term30684);
        setField(term30683, term30683.getClass(), "taxCode", "FSQpgxQnsH");
        setBooleanField(term30683, term30683.getClass(), "isLinear", true);
        setIntField(term30683, term30683.getClass(), "aFactor", 2133290622);
        setIntField(term30683, term30683.getClass(), "bFactor", -164869996);
        setBooleanField(term30683, term30683.getClass(), "isSquare", false);
        setIntField(term30683, term30683.getClass(), "aSquareFactor", 1415001538);
        setIntField(term30683, term30683.getClass(), "bSquareFactor", 1738077695);
        setIntField(term30683, term30683.getClass(), "cSuqreFactor", -1351117314);
        setField(term30705, term30705.getClass(), "id", term30706);
        setField(term30705, term30705.getClass(), "description", "LBPwnVMEpP");
        setField(term30705, term30705.getClass(), "countryReason", "cwALzyQVjH");
        setField(term30705, term30705.getClass(), "countryCode", "jlYNjpdkoz");
        setLongField(term30744, term30744.getClass(), "seconds", 1462334405L);
        setIntField(term30744, term30744.getClass(), "nanos", 893000000);
        setField(term30705, term30705.getClass(), "lastModifiedDate", term30744);
        setField(term30705, term30705.getClass(), "modifiedBy", "DZAGnhJkeU");
        setIntField(term30705, term30705.getClass(), "currentRulesCount", 1693588815);
        setIntField(term30705, term30705.getClass(), "maxRulesCount", 1272985537);
        setField(term30705, term30705.getClass(), "taxRules", term30761);
        setField(term30683, term30683.getClass(), "taxConfig", term30705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getbFactor", argTypes, term30683, args);
    }

};


