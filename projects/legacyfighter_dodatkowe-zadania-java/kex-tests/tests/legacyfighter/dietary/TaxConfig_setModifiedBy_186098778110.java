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

public class TaxConfig_setModifiedBy_186098778110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20594;

    public TaxConfig_setModifiedBy_186098778110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20595 = new Long(4486175312218543930L);
        Long term20653 = new Long(-5866516262253090421L);
        Long term20664 = new Long(-4336769198128902991L);
        Object term20652 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20663 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20652, term20652.getClass(), "id", term20653);
        setField(term20652, term20652.getClass(), "taxCode", "");
        setBooleanField(term20652, term20652.getClass(), "isLinear", false);
        setIntField(term20652, term20652.getClass(), "aFactor", 383244929);
        setIntField(term20652, term20652.getClass(), "bFactor", -2114034003);
        setBooleanField(term20652, term20652.getClass(), "isSquare", false);
        setIntField(term20652, term20652.getClass(), "aSquareFactor", 207213904);
        setIntField(term20652, term20652.getClass(), "bSquareFactor", -484303394);
        setIntField(term20652, term20652.getClass(), "cSuqreFactor", -31125530);
        setField(term20663, term20663.getClass(), "id", term20664);
        setField(term20663, term20663.getClass(), "description", null);
        setField(term20663, term20663.getClass(), "countryReason", null);
        setField(term20663, term20663.getClass(), "countryCode", null);
        setField(term20663, term20663.getClass(), "lastModifiedDate", null);
        setField(term20663, term20663.getClass(), "modifiedBy", null);
        setIntField(term20663, term20663.getClass(), "currentRulesCount", 1909773180);
        setIntField(term20663, term20663.getClass(), "maxRulesCount", -970417907);
        setField(term20663, term20663.getClass(), "taxRules", null);
        setField(term20652, term20652.getClass(), "taxConfig", term20663);
        Long term20669 = new Long(6975846341920664143L);
        Object term20668 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20679 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20668, term20668.getClass(), "id", term20669);
        setField(term20668, term20668.getClass(), "taxCode", "");
        setBooleanField(term20668, term20668.getClass(), "isLinear", true);
        setIntField(term20668, term20668.getClass(), "aFactor", 1919079331);
        setIntField(term20668, term20668.getClass(), "bFactor", 144872711);
        setBooleanField(term20668, term20668.getClass(), "isSquare", true);
        setIntField(term20668, term20668.getClass(), "aSquareFactor", -720037395);
        setIntField(term20668, term20668.getClass(), "bSquareFactor", 1232105469);
        setIntField(term20668, term20668.getClass(), "cSuqreFactor", -1547322575);
        setField(term20679, term20679.getClass(), "id", null);
        setField(term20679, term20679.getClass(), "description", null);
        setField(term20679, term20679.getClass(), "countryReason", null);
        setField(term20679, term20679.getClass(), "countryCode", null);
        setField(term20679, term20679.getClass(), "lastModifiedDate", null);
        setField(term20679, term20679.getClass(), "modifiedBy", null);
        setIntField(term20679, term20679.getClass(), "currentRulesCount", 0);
        setIntField(term20679, term20679.getClass(), "maxRulesCount", 0);
        setField(term20679, term20679.getClass(), "taxRules", null);
        setField(term20668, term20668.getClass(), "taxConfig", term20679);
        Long term20683 = new Long(-921066654455496205L);
        Long term20694 = new Long(7622401904339010124L);
        Object term20682 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20693 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20682, term20682.getClass(), "id", term20683);
        setField(term20682, term20682.getClass(), "taxCode", "");
        setBooleanField(term20682, term20682.getClass(), "isLinear", true);
        setIntField(term20682, term20682.getClass(), "aFactor", 646610000);
        setIntField(term20682, term20682.getClass(), "bFactor", 2003399396);
        setBooleanField(term20682, term20682.getClass(), "isSquare", true);
        setIntField(term20682, term20682.getClass(), "aSquareFactor", 1223703911);
        setIntField(term20682, term20682.getClass(), "bSquareFactor", -1824905298);
        setIntField(term20682, term20682.getClass(), "cSuqreFactor", -2062724184);
        setField(term20693, term20693.getClass(), "id", term20694);
        setField(term20693, term20693.getClass(), "description", null);
        setField(term20693, term20693.getClass(), "countryReason", null);
        setField(term20693, term20693.getClass(), "countryCode", null);
        setField(term20693, term20693.getClass(), "lastModifiedDate", null);
        setField(term20693, term20693.getClass(), "modifiedBy", null);
        setIntField(term20693, term20693.getClass(), "currentRulesCount", -716654499);
        setIntField(term20693, term20693.getClass(), "maxRulesCount", 1641117123);
        setField(term20693, term20693.getClass(), "taxRules", null);
        setField(term20682, term20682.getClass(), "taxConfig", term20693);
        Long term20699 = new Long(-758819117507836512L);
        Long term20710 = new Long(-1855660992126411308L);
        Object term20698 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20709 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20698, term20698.getClass(), "id", term20699);
        setField(term20698, term20698.getClass(), "taxCode", "");
        setBooleanField(term20698, term20698.getClass(), "isLinear", false);
        setIntField(term20698, term20698.getClass(), "aFactor", -1350380769);
        setIntField(term20698, term20698.getClass(), "bFactor", -1432215030);
        setBooleanField(term20698, term20698.getClass(), "isSquare", true);
        setIntField(term20698, term20698.getClass(), "aSquareFactor", 1233186320);
        setIntField(term20698, term20698.getClass(), "bSquareFactor", -1303269101);
        setIntField(term20698, term20698.getClass(), "cSuqreFactor", 1435572720);
        setField(term20709, term20709.getClass(), "id", term20710);
        setField(term20709, term20709.getClass(), "description", null);
        setField(term20709, term20709.getClass(), "countryReason", null);
        setField(term20709, term20709.getClass(), "countryCode", null);
        setField(term20709, term20709.getClass(), "lastModifiedDate", null);
        setField(term20709, term20709.getClass(), "modifiedBy", null);
        setIntField(term20709, term20709.getClass(), "currentRulesCount", 1437618365);
        setIntField(term20709, term20709.getClass(), "maxRulesCount", 1122535239);
        setField(term20709, term20709.getClass(), "taxRules", null);
        setField(term20698, term20698.getClass(), "taxConfig", term20709);
        Long term20715 = new Long(-1435639144971145612L);
        Object term20714 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20725 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20714, term20714.getClass(), "id", term20715);
        setField(term20714, term20714.getClass(), "taxCode", "");
        setBooleanField(term20714, term20714.getClass(), "isLinear", false);
        setIntField(term20714, term20714.getClass(), "aFactor", -750603024);
        setIntField(term20714, term20714.getClass(), "bFactor", 1255234202);
        setBooleanField(term20714, term20714.getClass(), "isSquare", false);
        setIntField(term20714, term20714.getClass(), "aSquareFactor", -223786928);
        setIntField(term20714, term20714.getClass(), "bSquareFactor", 1703103733);
        setIntField(term20714, term20714.getClass(), "cSuqreFactor", 1057562436);
        setField(term20725, term20725.getClass(), "id", null);
        setField(term20725, term20725.getClass(), "description", null);
        setField(term20725, term20725.getClass(), "countryReason", null);
        setField(term20725, term20725.getClass(), "countryCode", null);
        setField(term20725, term20725.getClass(), "lastModifiedDate", null);
        setField(term20725, term20725.getClass(), "modifiedBy", null);
        setIntField(term20725, term20725.getClass(), "currentRulesCount", 0);
        setIntField(term20725, term20725.getClass(), "maxRulesCount", 0);
        setField(term20725, term20725.getClass(), "taxRules", null);
        setField(term20714, term20714.getClass(), "taxConfig", term20725);
        ArrayList term20650 = new ArrayList();
        ((ArrayList) term20650).add(term20652);
        ((ArrayList) term20650).add(term20668);
        ((ArrayList) term20650).add(term20682);
        ((ArrayList) term20650).add(term20698);
        ((ArrayList) term20650).add(term20714);
        ((ArrayList) term20650).add(term20668);
        term20594 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20633 = newInstance(Class.forName("java.time.Instant"));
        setField(term20594, term20594.getClass(), "id", term20595);
        setField(term20594, term20594.getClass(), "description", "eKcEJRxNSu");
        setField(term20594, term20594.getClass(), "countryReason", "NTXQPWFYSA");
        setField(term20594, term20594.getClass(), "countryCode", "fOuOhBpldm");
        setLongField(term20633, term20633.getClass(), "seconds", 1407926618L);
        setIntField(term20633, term20633.getClass(), "nanos", 924000000);
        setField(term20594, term20594.getClass(), "lastModifiedDate", term20633);
        setField(term20594, term20594.getClass(), "modifiedBy", "qQQRKGPyIM");
        setIntField(term20594, term20594.getClass(), "currentRulesCount", 335681723);
        setIntField(term20594, term20594.getClass(), "maxRulesCount", -773707674);
        setField(term20594, term20594.getClass(), "taxRules", term20650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ccnotFfPXt";
        callMethod(klass, "setModifiedBy", argTypes, term20594, args);
    }

};


