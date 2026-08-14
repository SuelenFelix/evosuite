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
import java.lang.Integer;

public class TaxConfig_setMaxRulesCount_107717205614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21294;
     Object term21384;

    public TaxConfig_setMaxRulesCount_107717205614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21295 = new Long(-2213998544405629464L);
        Long term21353 = new Long(226516165063797489L);
        Long term21364 = new Long(-5055043026089632641L);
        Object term21352 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21363 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21352, term21352.getClass(), "id", term21353);
        setField(term21352, term21352.getClass(), "taxCode", "");
        setBooleanField(term21352, term21352.getClass(), "isLinear", false);
        setIntField(term21352, term21352.getClass(), "aFactor", -1226802566);
        setIntField(term21352, term21352.getClass(), "bFactor", 1162813858);
        setBooleanField(term21352, term21352.getClass(), "isSquare", false);
        setIntField(term21352, term21352.getClass(), "aSquareFactor", 494596414);
        setIntField(term21352, term21352.getClass(), "bSquareFactor", 1226377461);
        setIntField(term21352, term21352.getClass(), "cSuqreFactor", -1540486514);
        setField(term21363, term21363.getClass(), "id", term21364);
        setField(term21363, term21363.getClass(), "description", null);
        setField(term21363, term21363.getClass(), "countryReason", null);
        setField(term21363, term21363.getClass(), "countryCode", null);
        setField(term21363, term21363.getClass(), "lastModifiedDate", null);
        setField(term21363, term21363.getClass(), "modifiedBy", null);
        setIntField(term21363, term21363.getClass(), "currentRulesCount", 1471031478);
        setIntField(term21363, term21363.getClass(), "maxRulesCount", -334716487);
        setField(term21363, term21363.getClass(), "taxRules", null);
        setField(term21352, term21352.getClass(), "taxConfig", term21363);
        Long term21369 = new Long(-6049958218605558734L);
        Object term21368 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term21379 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term21368, term21368.getClass(), "id", term21369);
        setField(term21368, term21368.getClass(), "taxCode", "");
        setBooleanField(term21368, term21368.getClass(), "isLinear", false);
        setIntField(term21368, term21368.getClass(), "aFactor", -888855662);
        setIntField(term21368, term21368.getClass(), "bFactor", -1483966656);
        setBooleanField(term21368, term21368.getClass(), "isSquare", false);
        setIntField(term21368, term21368.getClass(), "aSquareFactor", -334260786);
        setIntField(term21368, term21368.getClass(), "bSquareFactor", -765890956);
        setIntField(term21368, term21368.getClass(), "cSuqreFactor", -214452542);
        setField(term21379, term21379.getClass(), "id", null);
        setField(term21379, term21379.getClass(), "description", null);
        setField(term21379, term21379.getClass(), "countryReason", null);
        setField(term21379, term21379.getClass(), "countryCode", null);
        setField(term21379, term21379.getClass(), "lastModifiedDate", null);
        setField(term21379, term21379.getClass(), "modifiedBy", null);
        setIntField(term21379, term21379.getClass(), "currentRulesCount", 0);
        setIntField(term21379, term21379.getClass(), "maxRulesCount", 0);
        setField(term21379, term21379.getClass(), "taxRules", null);
        setField(term21368, term21368.getClass(), "taxConfig", term21379);
        ArrayList term21350 = new ArrayList();
        ((ArrayList) term21350).add(term21352);
        ((ArrayList) term21350).add(term21368);
        term21294 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term21333 = newInstance(Class.forName("java.time.Instant"));
        setField(term21294, term21294.getClass(), "id", term21295);
        setField(term21294, term21294.getClass(), "description", "pZbbwCURge");
        setField(term21294, term21294.getClass(), "countryReason", "RsOfgdMCMv");
        setField(term21294, term21294.getClass(), "countryCode", "nsofCJqJOR");
        setLongField(term21333, term21333.getClass(), "seconds", 1873152234L);
        setIntField(term21333, term21333.getClass(), "nanos", 138000000);
        setField(term21294, term21294.getClass(), "lastModifiedDate", term21333);
        setField(term21294, term21294.getClass(), "modifiedBy", "CitJiZwsjF");
        setIntField(term21294, term21294.getClass(), "currentRulesCount", -1613074612);
        setIntField(term21294, term21294.getClass(), "maxRulesCount", 1054908502);
        setField(term21294, term21294.getClass(), "taxRules", term21350);
        term21384 = new Integer(-571931590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21384;
        callMethod(klass, "setMaxRulesCount", argTypes, term21294, args);
    }

};


