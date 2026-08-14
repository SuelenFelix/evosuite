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

public class TaxRule_setTaxCode_24053662917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32321;

    public TaxRule_setTaxCode_24053662917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32322 = new Long(-1396670214756396961L);
        Long term32344 = new Long(1795641040165405529L);
        Long term32402 = new Long(6002848910891080375L);
        Object term32401 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32401, term32401.getClass(), "id", term32402);
        setField(term32401, term32401.getClass(), "taxCode", null);
        setBooleanField(term32401, term32401.getClass(), "isLinear", true);
        setIntField(term32401, term32401.getClass(), "aFactor", 428714196);
        setIntField(term32401, term32401.getClass(), "bFactor", 934939315);
        setBooleanField(term32401, term32401.getClass(), "isSquare", false);
        setIntField(term32401, term32401.getClass(), "aSquareFactor", -935897776);
        setIntField(term32401, term32401.getClass(), "bSquareFactor", 1370328728);
        setIntField(term32401, term32401.getClass(), "cSuqreFactor", 1126005767);
        setField(term32401, term32401.getClass(), "taxConfig", null);
        Object term32411 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32411, term32411.getClass(), "id", null);
        setField(term32411, term32411.getClass(), "taxCode", null);
        setBooleanField(term32411, term32411.getClass(), "isLinear", false);
        setIntField(term32411, term32411.getClass(), "aFactor", 0);
        setIntField(term32411, term32411.getClass(), "bFactor", 0);
        setBooleanField(term32411, term32411.getClass(), "isSquare", false);
        setIntField(term32411, term32411.getClass(), "aSquareFactor", 0);
        setIntField(term32411, term32411.getClass(), "bSquareFactor", 0);
        setIntField(term32411, term32411.getClass(), "cSuqreFactor", 0);
        setField(term32411, term32411.getClass(), "taxConfig", null);
        Object term32419 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32419, term32419.getClass(), "id", null);
        setField(term32419, term32419.getClass(), "taxCode", null);
        setBooleanField(term32419, term32419.getClass(), "isLinear", false);
        setIntField(term32419, term32419.getClass(), "aFactor", 0);
        setIntField(term32419, term32419.getClass(), "bFactor", 0);
        setBooleanField(term32419, term32419.getClass(), "isSquare", false);
        setIntField(term32419, term32419.getClass(), "aSquareFactor", 0);
        setIntField(term32419, term32419.getClass(), "bSquareFactor", 0);
        setIntField(term32419, term32419.getClass(), "cSuqreFactor", 0);
        setField(term32419, term32419.getClass(), "taxConfig", null);
        Object term32427 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32427, term32427.getClass(), "id", null);
        setField(term32427, term32427.getClass(), "taxCode", null);
        setBooleanField(term32427, term32427.getClass(), "isLinear", false);
        setIntField(term32427, term32427.getClass(), "aFactor", 0);
        setIntField(term32427, term32427.getClass(), "bFactor", 0);
        setBooleanField(term32427, term32427.getClass(), "isSquare", false);
        setIntField(term32427, term32427.getClass(), "aSquareFactor", 0);
        setIntField(term32427, term32427.getClass(), "bSquareFactor", 0);
        setIntField(term32427, term32427.getClass(), "cSuqreFactor", 0);
        setField(term32427, term32427.getClass(), "taxConfig", null);
        Long term32436 = new Long(-8272873308287230741L);
        Object term32435 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32435, term32435.getClass(), "id", term32436);
        setField(term32435, term32435.getClass(), "taxCode", null);
        setBooleanField(term32435, term32435.getClass(), "isLinear", false);
        setIntField(term32435, term32435.getClass(), "aFactor", -687531774);
        setIntField(term32435, term32435.getClass(), "bFactor", -1997574107);
        setBooleanField(term32435, term32435.getClass(), "isSquare", true);
        setIntField(term32435, term32435.getClass(), "aSquareFactor", 748487022);
        setIntField(term32435, term32435.getClass(), "bSquareFactor", -706230330);
        setIntField(term32435, term32435.getClass(), "cSuqreFactor", -926446006);
        setField(term32435, term32435.getClass(), "taxConfig", null);
        ArrayList term32399 = new ArrayList();
        ((ArrayList) term32399).add(term32401);
        ((ArrayList) term32399).add(term32401);
        ((ArrayList) term32399).add(term32411);
        ((ArrayList) term32399).add(term32411);
        ((ArrayList) term32399).add(term32419);
        ((ArrayList) term32399).add(term32427);
        ((ArrayList) term32399).add(term32435);
        ((ArrayList) term32399).add(term32411);
        term32321 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term32343 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term32382 = newInstance(Class.forName("java.time.Instant"));
        setField(term32321, term32321.getClass(), "id", term32322);
        setField(term32321, term32321.getClass(), "taxCode", "mDTRMwjBpc");
        setBooleanField(term32321, term32321.getClass(), "isLinear", false);
        setIntField(term32321, term32321.getClass(), "aFactor", 2140567451);
        setIntField(term32321, term32321.getClass(), "bFactor", -390400057);
        setBooleanField(term32321, term32321.getClass(), "isSquare", true);
        setIntField(term32321, term32321.getClass(), "aSquareFactor", -157273113);
        setIntField(term32321, term32321.getClass(), "bSquareFactor", 1497057438);
        setIntField(term32321, term32321.getClass(), "cSuqreFactor", 1526060255);
        setField(term32343, term32343.getClass(), "id", term32344);
        setField(term32343, term32343.getClass(), "description", "sCLAuKoiVL");
        setField(term32343, term32343.getClass(), "countryReason", "pFWiDEnVnU");
        setField(term32343, term32343.getClass(), "countryCode", "NeEetzFhTt");
        setLongField(term32382, term32382.getClass(), "seconds", 1751596639L);
        setIntField(term32382, term32382.getClass(), "nanos", 252000000);
        setField(term32343, term32343.getClass(), "lastModifiedDate", term32382);
        setField(term32343, term32343.getClass(), "modifiedBy", "UgvuvUxKed");
        setIntField(term32343, term32343.getClass(), "currentRulesCount", -833785119);
        setIntField(term32343, term32343.getClass(), "maxRulesCount", -1920705464);
        setField(term32343, term32343.getClass(), "taxRules", term32399);
        setField(term32321, term32321.getClass(), "taxConfig", term32343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "govbBrRstA";
        callMethod(klass, "setTaxCode", argTypes, term32321, args);
    }

};


