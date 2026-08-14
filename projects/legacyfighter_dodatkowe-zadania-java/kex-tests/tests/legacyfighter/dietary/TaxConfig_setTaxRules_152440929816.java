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
import java.util.LinkedList;

public class TaxConfig_setTaxRules_152440929816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21542;
     Object term21689;

    public TaxConfig_setTaxRules_152440929816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21543 = new Long(3415381732664403599L);
        Long term21601 = new Long(3853271903861685327L);
        Long term21612 = new Long(9105566407535624519L);
        Object term21600 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21611 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21600, term21600.getClass(), "id", term21601);
        setField(term21600, term21600.getClass(), "taxCode", "");
        setBooleanField(term21600, term21600.getClass(), "isLinear", false);
        setIntField(term21600, term21600.getClass(), "aFactor", -1378885614);
        setIntField(term21600, term21600.getClass(), "bFactor", -1408615666);
        setBooleanField(term21600, term21600.getClass(), "isSquare", true);
        setIntField(term21600, term21600.getClass(), "aSquareFactor", -502299598);
        setIntField(term21600, term21600.getClass(), "bSquareFactor", -516287593);
        setIntField(term21600, term21600.getClass(), "cSuqreFactor", -187311406);
        setField(term21611, term21611.getClass(), "id", term21612);
        setField(term21611, term21611.getClass(), "description", null);
        setField(term21611, term21611.getClass(), "countryReason", null);
        setField(term21611, term21611.getClass(), "countryCode", null);
        setField(term21611, term21611.getClass(), "lastModifiedDate", null);
        setField(term21611, term21611.getClass(), "modifiedBy", null);
        setIntField(term21611, term21611.getClass(), "currentRulesCount", 1496632406);
        setIntField(term21611, term21611.getClass(), "maxRulesCount", 1858277277);
        setField(term21611, term21611.getClass(), "taxRules", null);
        setField(term21600, term21600.getClass(), "taxConfig", term21611);
        Long term21617 = new Long(732331270654896650L);
        Object term21616 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21627 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21616, term21616.getClass(), "id", term21617);
        setField(term21616, term21616.getClass(), "taxCode", "");
        setBooleanField(term21616, term21616.getClass(), "isLinear", true);
        setIntField(term21616, term21616.getClass(), "aFactor", -1347618079);
        setIntField(term21616, term21616.getClass(), "bFactor", 1510246255);
        setBooleanField(term21616, term21616.getClass(), "isSquare", true);
        setIntField(term21616, term21616.getClass(), "aSquareFactor", -515631808);
        setIntField(term21616, term21616.getClass(), "bSquareFactor", 1546701347);
        setIntField(term21616, term21616.getClass(), "cSuqreFactor", -111931851);
        setField(term21627, term21627.getClass(), "id", null);
        setField(term21627, term21627.getClass(), "description", null);
        setField(term21627, term21627.getClass(), "countryReason", null);
        setField(term21627, term21627.getClass(), "countryCode", null);
        setField(term21627, term21627.getClass(), "lastModifiedDate", null);
        setField(term21627, term21627.getClass(), "modifiedBy", null);
        setIntField(term21627, term21627.getClass(), "currentRulesCount", 0);
        setIntField(term21627, term21627.getClass(), "maxRulesCount", 0);
        setField(term21627, term21627.getClass(), "taxRules", null);
        setField(term21616, term21616.getClass(), "taxConfig", term21627);
        Long term21631 = new Long(-5787975575293098129L);
        Long term21642 = new Long(-2214621750590649821L);
        Object term21630 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21641 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21630, term21630.getClass(), "id", term21631);
        setField(term21630, term21630.getClass(), "taxCode", "");
        setBooleanField(term21630, term21630.getClass(), "isLinear", true);
        setIntField(term21630, term21630.getClass(), "aFactor", -2117930201);
        setIntField(term21630, term21630.getClass(), "bFactor", 1839150896);
        setBooleanField(term21630, term21630.getClass(), "isSquare", false);
        setIntField(term21630, term21630.getClass(), "aSquareFactor", -1487860516);
        setIntField(term21630, term21630.getClass(), "bSquareFactor", 784631129);
        setIntField(term21630, term21630.getClass(), "cSuqreFactor", 658285959);
        setField(term21641, term21641.getClass(), "id", term21642);
        setField(term21641, term21641.getClass(), "description", null);
        setField(term21641, term21641.getClass(), "countryReason", null);
        setField(term21641, term21641.getClass(), "countryCode", null);
        setField(term21641, term21641.getClass(), "lastModifiedDate", null);
        setField(term21641, term21641.getClass(), "modifiedBy", null);
        setIntField(term21641, term21641.getClass(), "currentRulesCount", -89362706);
        setIntField(term21641, term21641.getClass(), "maxRulesCount", 341388367);
        setField(term21641, term21641.getClass(), "taxRules", null);
        setField(term21630, term21630.getClass(), "taxConfig", term21641);
        Long term21647 = new Long(682045578778432659L);
        Object term21646 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term21646, term21646.getClass(), "id", term21647);
        setField(term21646, term21646.getClass(), "taxCode", "");
        setBooleanField(term21646, term21646.getClass(), "isLinear", true);
        setIntField(term21646, term21646.getClass(), "aFactor", -958207893);
        setIntField(term21646, term21646.getClass(), "bFactor", 674390543);
        setBooleanField(term21646, term21646.getClass(), "isSquare", true);
        setIntField(term21646, term21646.getClass(), "aSquareFactor", 1472100258);
        setIntField(term21646, term21646.getClass(), "bSquareFactor", 12681987);
        setIntField(term21646, term21646.getClass(), "cSuqreFactor", -1987364934);
        setField(term21646, term21646.getClass(), "taxConfig", term21627);
        Long term21658 = new Long(5874242482849721868L);
        Object term21657 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21668 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21657, term21657.getClass(), "id", term21658);
        setField(term21657, term21657.getClass(), "taxCode", "");
        setBooleanField(term21657, term21657.getClass(), "isLinear", false);
        setIntField(term21657, term21657.getClass(), "aFactor", 1359973218);
        setIntField(term21657, term21657.getClass(), "bFactor", -218759803);
        setBooleanField(term21657, term21657.getClass(), "isSquare", false);
        setIntField(term21657, term21657.getClass(), "aSquareFactor", 1288936083);
        setIntField(term21657, term21657.getClass(), "bSquareFactor", 4086209);
        setIntField(term21657, term21657.getClass(), "cSuqreFactor", 300964556);
        setField(term21668, term21668.getClass(), "id", null);
        setField(term21668, term21668.getClass(), "description", null);
        setField(term21668, term21668.getClass(), "countryReason", null);
        setField(term21668, term21668.getClass(), "countryCode", null);
        setField(term21668, term21668.getClass(), "lastModifiedDate", null);
        setField(term21668, term21668.getClass(), "modifiedBy", null);
        setIntField(term21668, term21668.getClass(), "currentRulesCount", 0);
        setIntField(term21668, term21668.getClass(), "maxRulesCount", 0);
        setField(term21668, term21668.getClass(), "taxRules", null);
        setField(term21657, term21657.getClass(), "taxConfig", term21668);
        Long term21672 = new Long(8850312777693707693L);
        Long term21683 = new Long(1038272501243892514L);
        Object term21671 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21682 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21671, term21671.getClass(), "id", term21672);
        setField(term21671, term21671.getClass(), "taxCode", "");
        setBooleanField(term21671, term21671.getClass(), "isLinear", false);
        setIntField(term21671, term21671.getClass(), "aFactor", 2145928130);
        setIntField(term21671, term21671.getClass(), "bFactor", -1095947031);
        setBooleanField(term21671, term21671.getClass(), "isSquare", true);
        setIntField(term21671, term21671.getClass(), "aSquareFactor", 1504187156);
        setIntField(term21671, term21671.getClass(), "bSquareFactor", -1713723083);
        setIntField(term21671, term21671.getClass(), "cSuqreFactor", -1337690242);
        setField(term21682, term21682.getClass(), "id", term21683);
        setField(term21682, term21682.getClass(), "description", null);
        setField(term21682, term21682.getClass(), "countryReason", null);
        setField(term21682, term21682.getClass(), "countryCode", null);
        setField(term21682, term21682.getClass(), "lastModifiedDate", null);
        setField(term21682, term21682.getClass(), "modifiedBy", null);
        setIntField(term21682, term21682.getClass(), "currentRulesCount", 264872152);
        setIntField(term21682, term21682.getClass(), "maxRulesCount", 1645751151);
        setField(term21682, term21682.getClass(), "taxRules", null);
        setField(term21671, term21671.getClass(), "taxConfig", term21682);
        ArrayList term21598 = new ArrayList();
        ((ArrayList) term21598).add(term21600);
        ((ArrayList) term21598).add(term21616);
        ((ArrayList) term21598).add(term21630);
        ((ArrayList) term21598).add(term21646);
        ((ArrayList) term21598).add(term21657);
        ((ArrayList) term21598).add(term21671);
        term21542 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21581 = newInstance(Class.forName("java.time.Instant"));
        setField(term21542, term21542.getClass(), "id", term21543);
        setField(term21542, term21542.getClass(), "description", "dPHtrzKWgf");
        setField(term21542, term21542.getClass(), "countryReason", "olmFxfIVeh");
        setField(term21542, term21542.getClass(), "countryCode", "iSPirUEhXs");
        setLongField(term21581, term21581.getClass(), "seconds", 1526982178L);
        setIntField(term21581, term21581.getClass(), "nanos", 232000000);
        setField(term21542, term21542.getClass(), "lastModifiedDate", term21581);
        setField(term21542, term21542.getClass(), "modifiedBy", "WWyLFmYpAy");
        setIntField(term21542, term21542.getClass(), "currentRulesCount", 720814309);
        setIntField(term21542, term21542.getClass(), "maxRulesCount", 964137425);
        setField(term21542, term21542.getClass(), "taxRules", term21598);
        term21689 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term21689;
        callMethod(klass, "setTaxRules", argTypes, term21542, args);
    }

};


