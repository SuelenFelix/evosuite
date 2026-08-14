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

public class TaxRule_getbSquareFactor_129177043813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31657;

    public TaxRule_getbSquareFactor_129177043813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31658 = new Long(2105697925603985714L);
        Long term31680 = new Long(-589167249491619196L);
        Long term31738 = new Long(5990686118620195001L);
        Object term31737 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31737, term31737.getClass(), "id", term31738);
        setField(term31737, term31737.getClass(), "taxCode", null);
        setBooleanField(term31737, term31737.getClass(), "isLinear", true);
        setIntField(term31737, term31737.getClass(), "aFactor", 93344937);
        setIntField(term31737, term31737.getClass(), "bFactor", 1426545044);
        setBooleanField(term31737, term31737.getClass(), "isSquare", false);
        setIntField(term31737, term31737.getClass(), "aSquareFactor", -2114135536);
        setIntField(term31737, term31737.getClass(), "bSquareFactor", -1934156754);
        setIntField(term31737, term31737.getClass(), "cSuqreFactor", -2122545415);
        setField(term31737, term31737.getClass(), "taxConfig", null);
        ArrayList term31735 = new ArrayList();
        ((ArrayList) term31735).add(term31737);
        term31657 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term31679 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term31718 = newInstance(Class.forName("java.time.Instant"));
        setField(term31657, term31657.getClass(), "id", term31658);
        setField(term31657, term31657.getClass(), "taxCode", "DYzWJljbaE");
        setBooleanField(term31657, term31657.getClass(), "isLinear", false);
        setIntField(term31657, term31657.getClass(), "aFactor", 1013816325);
        setIntField(term31657, term31657.getClass(), "bFactor", -756785345);
        setBooleanField(term31657, term31657.getClass(), "isSquare", true);
        setIntField(term31657, term31657.getClass(), "aSquareFactor", -1077451707);
        setIntField(term31657, term31657.getClass(), "bSquareFactor", -580180892);
        setIntField(term31657, term31657.getClass(), "cSuqreFactor", 862135498);
        setField(term31679, term31679.getClass(), "id", term31680);
        setField(term31679, term31679.getClass(), "description", "idwbHVHUcz");
        setField(term31679, term31679.getClass(), "countryReason", "sWJHIWZMuX");
        setField(term31679, term31679.getClass(), "countryCode", "PwMdJRwzDW");
        setLongField(term31718, term31718.getClass(), "seconds", 1427529790L);
        setIntField(term31718, term31718.getClass(), "nanos", 204000000);
        setField(term31679, term31679.getClass(), "lastModifiedDate", term31718);
        setField(term31679, term31679.getClass(), "modifiedBy", "sMiHxgXUuN");
        setIntField(term31679, term31679.getClass(), "currentRulesCount", -1640521852);
        setIntField(term31679, term31679.getClass(), "maxRulesCount", 1999560627);
        setField(term31679, term31679.getClass(), "taxRules", term31735);
        setField(term31657, term31657.getClass(), "taxConfig", term31679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getbSquareFactor", argTypes, term31657, args);
    }

};


