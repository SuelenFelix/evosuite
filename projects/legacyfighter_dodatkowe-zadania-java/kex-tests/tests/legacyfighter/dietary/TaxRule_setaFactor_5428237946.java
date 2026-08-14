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

public class TaxRule_setaFactor_5428237946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30505;
     Object term30631;

    public TaxRule_setaFactor_5428237946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term30506 = new Long(-6376003179103732362L);
        Long term30528 = new Long(-2050936198165389315L);
        Long term30586 = new Long(-8751837616810275039L);
        Object term30585 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30585, term30585.getClass(), "id", term30586);
        setField(term30585, term30585.getClass(), "taxCode", null);
        setBooleanField(term30585, term30585.getClass(), "isLinear", false);
        setIntField(term30585, term30585.getClass(), "aFactor", -3085808);
        setIntField(term30585, term30585.getClass(), "bFactor", 1975783377);
        setBooleanField(term30585, term30585.getClass(), "isSquare", false);
        setIntField(term30585, term30585.getClass(), "aSquareFactor", -665938382);
        setIntField(term30585, term30585.getClass(), "bSquareFactor", 325391588);
        setIntField(term30585, term30585.getClass(), "cSuqreFactor", 1443046313);
        setField(term30585, term30585.getClass(), "taxConfig", null);
        Object term30595 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30595, term30595.getClass(), "id", null);
        setField(term30595, term30595.getClass(), "taxCode", null);
        setBooleanField(term30595, term30595.getClass(), "isLinear", false);
        setIntField(term30595, term30595.getClass(), "aFactor", 0);
        setIntField(term30595, term30595.getClass(), "bFactor", 0);
        setBooleanField(term30595, term30595.getClass(), "isSquare", false);
        setIntField(term30595, term30595.getClass(), "aSquareFactor", 0);
        setIntField(term30595, term30595.getClass(), "bSquareFactor", 0);
        setIntField(term30595, term30595.getClass(), "cSuqreFactor", 0);
        setField(term30595, term30595.getClass(), "taxConfig", null);
        Long term30604 = new Long(-6476891479972746312L);
        Object term30603 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30603, term30603.getClass(), "id", term30604);
        setField(term30603, term30603.getClass(), "taxCode", null);
        setBooleanField(term30603, term30603.getClass(), "isLinear", true);
        setIntField(term30603, term30603.getClass(), "aFactor", 530909877);
        setIntField(term30603, term30603.getClass(), "bFactor", -123945804);
        setBooleanField(term30603, term30603.getClass(), "isSquare", false);
        setIntField(term30603, term30603.getClass(), "aSquareFactor", 2133669766);
        setIntField(term30603, term30603.getClass(), "bSquareFactor", -1423215684);
        setIntField(term30603, term30603.getClass(), "cSuqreFactor", -1096652631);
        setField(term30603, term30603.getClass(), "taxConfig", null);
        Object term30613 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30613, term30613.getClass(), "id", null);
        setField(term30613, term30613.getClass(), "taxCode", null);
        setBooleanField(term30613, term30613.getClass(), "isLinear", false);
        setIntField(term30613, term30613.getClass(), "aFactor", 0);
        setIntField(term30613, term30613.getClass(), "bFactor", 0);
        setBooleanField(term30613, term30613.getClass(), "isSquare", false);
        setIntField(term30613, term30613.getClass(), "aSquareFactor", 0);
        setIntField(term30613, term30613.getClass(), "bSquareFactor", 0);
        setIntField(term30613, term30613.getClass(), "cSuqreFactor", 0);
        setField(term30613, term30613.getClass(), "taxConfig", null);
        Object term30621 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term30621, term30621.getClass(), "id", null);
        setField(term30621, term30621.getClass(), "taxCode", null);
        setBooleanField(term30621, term30621.getClass(), "isLinear", false);
        setIntField(term30621, term30621.getClass(), "aFactor", 0);
        setIntField(term30621, term30621.getClass(), "bFactor", 0);
        setBooleanField(term30621, term30621.getClass(), "isSquare", false);
        setIntField(term30621, term30621.getClass(), "aSquareFactor", 0);
        setIntField(term30621, term30621.getClass(), "bSquareFactor", 0);
        setIntField(term30621, term30621.getClass(), "cSuqreFactor", 0);
        setField(term30621, term30621.getClass(), "taxConfig", null);
        ArrayList term30583 = new ArrayList();
        ((ArrayList) term30583).add(term30585);
        ((ArrayList) term30583).add(term30595);
        ((ArrayList) term30583).add(term30595);
        ((ArrayList) term30583).add(term30603);
        ((ArrayList) term30583).add(term30613);
        ((ArrayList) term30583).add(term30595);
        ((ArrayList) term30583).add(term30621);
        term30505 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term30527 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term30566 = newInstance(Class.forName("java.time.Instant"));
        setField(term30505, term30505.getClass(), "id", term30506);
        setField(term30505, term30505.getClass(), "taxCode", "GwGUMPdvZq");
        setBooleanField(term30505, term30505.getClass(), "isLinear", true);
        setIntField(term30505, term30505.getClass(), "aFactor", -1833777337);
        setIntField(term30505, term30505.getClass(), "bFactor", -2068333492);
        setBooleanField(term30505, term30505.getClass(), "isSquare", true);
        setIntField(term30505, term30505.getClass(), "aSquareFactor", 1892862475);
        setIntField(term30505, term30505.getClass(), "bSquareFactor", -807914927);
        setIntField(term30505, term30505.getClass(), "cSuqreFactor", -313873930);
        setField(term30527, term30527.getClass(), "id", term30528);
        setField(term30527, term30527.getClass(), "description", "iXRAYcFyfS");
        setField(term30527, term30527.getClass(), "countryReason", "lokyclbLEz");
        setField(term30527, term30527.getClass(), "countryCode", "hAPmQGaxkI");
        setLongField(term30566, term30566.getClass(), "seconds", 1288081804L);
        setIntField(term30566, term30566.getClass(), "nanos", 912000000);
        setField(term30527, term30527.getClass(), "lastModifiedDate", term30566);
        setField(term30527, term30527.getClass(), "modifiedBy", "ojrnLnJZjT");
        setIntField(term30527, term30527.getClass(), "currentRulesCount", -1064231188);
        setIntField(term30527, term30527.getClass(), "maxRulesCount", 1631564781);
        setField(term30527, term30527.getClass(), "taxRules", term30583);
        setField(term30505, term30505.getClass(), "taxConfig", term30527);
        term30631 = new Integer(98801346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30631;
        callMethod(klass, "setaFactor", argTypes, term30505, args);
    }

};


