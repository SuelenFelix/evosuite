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

public class TaxConfig_setDescription_18578550532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19281;

    public TaxConfig_setDescription_18578550532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19282 = new Long(1729206737148270563L);
        Long term19340 = new Long(-932981811228171529L);
        Long term19351 = new Long(5817794709356277010L);
        Object term19339 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19350 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19339, term19339.getClass(), "id", term19340);
        setField(term19339, term19339.getClass(), "taxCode", "");
        setBooleanField(term19339, term19339.getClass(), "isLinear", false);
        setIntField(term19339, term19339.getClass(), "aFactor", -2060535464);
        setIntField(term19339, term19339.getClass(), "bFactor", -1242946317);
        setBooleanField(term19339, term19339.getClass(), "isSquare", true);
        setIntField(term19339, term19339.getClass(), "aSquareFactor", -1541566235);
        setIntField(term19339, term19339.getClass(), "bSquareFactor", -189738995);
        setIntField(term19339, term19339.getClass(), "cSuqreFactor", 1943019963);
        setField(term19350, term19350.getClass(), "id", term19351);
        setField(term19350, term19350.getClass(), "description", null);
        setField(term19350, term19350.getClass(), "countryReason", null);
        setField(term19350, term19350.getClass(), "countryCode", null);
        setField(term19350, term19350.getClass(), "lastModifiedDate", null);
        setField(term19350, term19350.getClass(), "modifiedBy", null);
        setIntField(term19350, term19350.getClass(), "currentRulesCount", 186472650);
        setIntField(term19350, term19350.getClass(), "maxRulesCount", 279675992);
        setField(term19350, term19350.getClass(), "taxRules", null);
        setField(term19339, term19339.getClass(), "taxConfig", term19350);
        Long term19356 = new Long(132446939133186077L);
        Long term19367 = new Long(-1234885562462779381L);
        Object term19355 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19366 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19355, term19355.getClass(), "id", term19356);
        setField(term19355, term19355.getClass(), "taxCode", "");
        setBooleanField(term19355, term19355.getClass(), "isLinear", true);
        setIntField(term19355, term19355.getClass(), "aFactor", -1341357647);
        setIntField(term19355, term19355.getClass(), "bFactor", 138447019);
        setBooleanField(term19355, term19355.getClass(), "isSquare", false);
        setIntField(term19355, term19355.getClass(), "aSquareFactor", 114915275);
        setIntField(term19355, term19355.getClass(), "bSquareFactor", 338519695);
        setIntField(term19355, term19355.getClass(), "cSuqreFactor", 2025566580);
        setField(term19366, term19366.getClass(), "id", term19367);
        setField(term19366, term19366.getClass(), "description", null);
        setField(term19366, term19366.getClass(), "countryReason", null);
        setField(term19366, term19366.getClass(), "countryCode", null);
        setField(term19366, term19366.getClass(), "lastModifiedDate", null);
        setField(term19366, term19366.getClass(), "modifiedBy", null);
        setIntField(term19366, term19366.getClass(), "currentRulesCount", 1180687854);
        setIntField(term19366, term19366.getClass(), "maxRulesCount", 328631288);
        setField(term19366, term19366.getClass(), "taxRules", null);
        setField(term19355, term19355.getClass(), "taxConfig", term19366);
        Long term19372 = new Long(-4069312743655862444L);
        Long term19383 = new Long(3233502115953753827L);
        Object term19371 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19382 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19371, term19371.getClass(), "id", term19372);
        setField(term19371, term19371.getClass(), "taxCode", "");
        setBooleanField(term19371, term19371.getClass(), "isLinear", false);
        setIntField(term19371, term19371.getClass(), "aFactor", 940896043);
        setIntField(term19371, term19371.getClass(), "bFactor", -1156002984);
        setBooleanField(term19371, term19371.getClass(), "isSquare", false);
        setIntField(term19371, term19371.getClass(), "aSquareFactor", 1676254730);
        setIntField(term19371, term19371.getClass(), "bSquareFactor", -1661200819);
        setIntField(term19371, term19371.getClass(), "cSuqreFactor", -235039141);
        setField(term19382, term19382.getClass(), "id", term19383);
        setField(term19382, term19382.getClass(), "description", null);
        setField(term19382, term19382.getClass(), "countryReason", null);
        setField(term19382, term19382.getClass(), "countryCode", null);
        setField(term19382, term19382.getClass(), "lastModifiedDate", null);
        setField(term19382, term19382.getClass(), "modifiedBy", null);
        setIntField(term19382, term19382.getClass(), "currentRulesCount", -1414233013);
        setIntField(term19382, term19382.getClass(), "maxRulesCount", -1174440096);
        setField(term19382, term19382.getClass(), "taxRules", null);
        setField(term19371, term19371.getClass(), "taxConfig", term19382);
        Long term19388 = new Long(-308461294344616496L);
        Object term19387 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term19398 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term19387, term19387.getClass(), "id", term19388);
        setField(term19387, term19387.getClass(), "taxCode", "");
        setBooleanField(term19387, term19387.getClass(), "isLinear", true);
        setIntField(term19387, term19387.getClass(), "aFactor", -679614653);
        setIntField(term19387, term19387.getClass(), "bFactor", -561851867);
        setBooleanField(term19387, term19387.getClass(), "isSquare", true);
        setIntField(term19387, term19387.getClass(), "aSquareFactor", -1809928454);
        setIntField(term19387, term19387.getClass(), "bSquareFactor", -191639503);
        setIntField(term19387, term19387.getClass(), "cSuqreFactor", -1563700756);
        setField(term19398, term19398.getClass(), "id", null);
        setField(term19398, term19398.getClass(), "description", null);
        setField(term19398, term19398.getClass(), "countryReason", null);
        setField(term19398, term19398.getClass(), "countryCode", null);
        setField(term19398, term19398.getClass(), "lastModifiedDate", null);
        setField(term19398, term19398.getClass(), "modifiedBy", null);
        setIntField(term19398, term19398.getClass(), "currentRulesCount", 0);
        setIntField(term19398, term19398.getClass(), "maxRulesCount", 0);
        setField(term19398, term19398.getClass(), "taxRules", null);
        setField(term19387, term19387.getClass(), "taxConfig", term19398);
        ArrayList term19337 = new ArrayList();
        ((ArrayList) term19337).add(term19339);
        ((ArrayList) term19337).add(term19355);
        ((ArrayList) term19337).add(term19355);
        ((ArrayList) term19337).add(term19371);
        ((ArrayList) term19337).add(term19387);
        term19281 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term19320 = newInstance(Class.forName("java.time.Instant"));
        setField(term19281, term19281.getClass(), "id", term19282);
        setField(term19281, term19281.getClass(), "description", "mNgDshwZNc");
        setField(term19281, term19281.getClass(), "countryReason", "pDqgDbJoFw");
        setField(term19281, term19281.getClass(), "countryCode", "iVOvTzOxwt");
        setLongField(term19320, term19320.getClass(), "seconds", 1335719982L);
        setIntField(term19320, term19320.getClass(), "nanos", 731000000);
        setField(term19281, term19281.getClass(), "lastModifiedDate", term19320);
        setField(term19281, term19281.getClass(), "modifiedBy", "BjZQdecXvB");
        setIntField(term19281, term19281.getClass(), "currentRulesCount", -1261824381);
        setIntField(term19281, term19281.getClass(), "maxRulesCount", 1594426218);
        setField(term19281, term19281.getClass(), "taxRules", term19337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fRujHWvXjJ";
        callMethod(klass, "setDescription", argTypes, term19281, args);
    }

};


