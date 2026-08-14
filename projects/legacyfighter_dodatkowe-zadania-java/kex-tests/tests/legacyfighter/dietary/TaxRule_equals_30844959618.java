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

public class TaxRule_equals_30844959618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32519;
     Object term32649;

    public TaxRule_equals_30844959618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term32520 = new Long(1770574028303523867L);
        Long term32542 = new Long(6434856191210114702L);
        Long term32600 = new Long(1306769240431962876L);
        Object term32599 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32599, term32599.getClass(), "id", term32600);
        setField(term32599, term32599.getClass(), "taxCode", null);
        setBooleanField(term32599, term32599.getClass(), "isLinear", false);
        setIntField(term32599, term32599.getClass(), "aFactor", -172607907);
        setIntField(term32599, term32599.getClass(), "bFactor", 182656750);
        setBooleanField(term32599, term32599.getClass(), "isSquare", true);
        setIntField(term32599, term32599.getClass(), "aSquareFactor", -51407538);
        setIntField(term32599, term32599.getClass(), "bSquareFactor", -465783748);
        setIntField(term32599, term32599.getClass(), "cSuqreFactor", 1780832439);
        setField(term32599, term32599.getClass(), "taxConfig", null);
        Object term32609 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32609, term32609.getClass(), "id", null);
        setField(term32609, term32609.getClass(), "taxCode", null);
        setBooleanField(term32609, term32609.getClass(), "isLinear", false);
        setIntField(term32609, term32609.getClass(), "aFactor", 0);
        setIntField(term32609, term32609.getClass(), "bFactor", 0);
        setBooleanField(term32609, term32609.getClass(), "isSquare", false);
        setIntField(term32609, term32609.getClass(), "aSquareFactor", 0);
        setIntField(term32609, term32609.getClass(), "bSquareFactor", 0);
        setIntField(term32609, term32609.getClass(), "cSuqreFactor", 0);
        setField(term32609, term32609.getClass(), "taxConfig", null);
        Long term32618 = new Long(-3581079819917173688L);
        Object term32617 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32617, term32617.getClass(), "id", term32618);
        setField(term32617, term32617.getClass(), "taxCode", null);
        setBooleanField(term32617, term32617.getClass(), "isLinear", false);
        setIntField(term32617, term32617.getClass(), "aFactor", -1044762733);
        setIntField(term32617, term32617.getClass(), "bFactor", 446184231);
        setBooleanField(term32617, term32617.getClass(), "isSquare", true);
        setIntField(term32617, term32617.getClass(), "aSquareFactor", 1313599240);
        setIntField(term32617, term32617.getClass(), "bSquareFactor", 1889501733);
        setIntField(term32617, term32617.getClass(), "cSuqreFactor", 1316243148);
        setField(term32617, term32617.getClass(), "taxConfig", null);
        Long term32628 = new Long(-4019650338948804968L);
        Object term32627 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32627, term32627.getClass(), "id", term32628);
        setField(term32627, term32627.getClass(), "taxCode", null);
        setBooleanField(term32627, term32627.getClass(), "isLinear", true);
        setIntField(term32627, term32627.getClass(), "aFactor", -1829672767);
        setIntField(term32627, term32627.getClass(), "bFactor", -311098933);
        setBooleanField(term32627, term32627.getClass(), "isSquare", false);
        setIntField(term32627, term32627.getClass(), "aSquareFactor", -1778687889);
        setIntField(term32627, term32627.getClass(), "bSquareFactor", -1827662352);
        setIntField(term32627, term32627.getClass(), "cSuqreFactor", -1292290537);
        setField(term32627, term32627.getClass(), "taxConfig", null);
        Long term32638 = new Long(-3033236171719733686L);
        Object term32637 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term32637, term32637.getClass(), "id", term32638);
        setField(term32637, term32637.getClass(), "taxCode", null);
        setBooleanField(term32637, term32637.getClass(), "isLinear", true);
        setIntField(term32637, term32637.getClass(), "aFactor", 1613936898);
        setIntField(term32637, term32637.getClass(), "bFactor", -406599151);
        setBooleanField(term32637, term32637.getClass(), "isSquare", true);
        setIntField(term32637, term32637.getClass(), "aSquareFactor", -1421272179);
        setIntField(term32637, term32637.getClass(), "bSquareFactor", -2019439660);
        setIntField(term32637, term32637.getClass(), "cSuqreFactor", 1037621714);
        setField(term32637, term32637.getClass(), "taxConfig", null);
        ArrayList term32597 = new ArrayList();
        ((ArrayList) term32597).add(term32599);
        ((ArrayList) term32597).add(term32609);
        ((ArrayList) term32597).add(term32609);
        ((ArrayList) term32597).add(term32617);
        ((ArrayList) term32597).add(term32627);
        ((ArrayList) term32597).add(term32627);
        ((ArrayList) term32597).add(term32599);
        ((ArrayList) term32597).add(term32637);
        term32519 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term32541 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term32580 = newInstance(Class.forName("java.time.Instant"));
        setField(term32519, term32519.getClass(), "id", term32520);
        setField(term32519, term32519.getClass(), "taxCode", "zSMUNzRRyM");
        setBooleanField(term32519, term32519.getClass(), "isLinear", true);
        setIntField(term32519, term32519.getClass(), "aFactor", -125626789);
        setIntField(term32519, term32519.getClass(), "bFactor", -309827965);
        setBooleanField(term32519, term32519.getClass(), "isSquare", true);
        setIntField(term32519, term32519.getClass(), "aSquareFactor", -1534471014);
        setIntField(term32519, term32519.getClass(), "bSquareFactor", -468720148);
        setIntField(term32519, term32519.getClass(), "cSuqreFactor", 164755425);
        setField(term32541, term32541.getClass(), "id", term32542);
        setField(term32541, term32541.getClass(), "description", "aKwJiIZSjJ");
        setField(term32541, term32541.getClass(), "countryReason", "lYbeaINKud");
        setField(term32541, term32541.getClass(), "countryCode", "BrwuUkkatt");
        setLongField(term32580, term32580.getClass(), "seconds", 1697943529L);
        setIntField(term32580, term32580.getClass(), "nanos", 518000000);
        setField(term32541, term32541.getClass(), "lastModifiedDate", term32580);
        setField(term32541, term32541.getClass(), "modifiedBy", "NjmSJhbVEM");
        setIntField(term32541, term32541.getClass(), "currentRulesCount", 205469595);
        setIntField(term32541, term32541.getClass(), "maxRulesCount", -638606539);
        setField(term32541, term32541.getClass(), "taxRules", term32597);
        setField(term32519, term32519.getClass(), "taxConfig", term32541);
        term32649 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term32649;
        callMethod(klass, "equals", argTypes, term32519, args);
    }

};


