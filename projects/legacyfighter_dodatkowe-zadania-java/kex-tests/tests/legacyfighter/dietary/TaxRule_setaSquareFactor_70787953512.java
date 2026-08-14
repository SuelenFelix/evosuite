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

public class TaxRule_setaSquareFactor_70787953512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31485;
     Object term31605;

    public TaxRule_setaSquareFactor_70787953512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31486 = new Long(1429711781003863063L);
        Long term31508 = new Long(-1033267581061931547L);
        Long term31566 = new Long(8918321414047974185L);
        Object term31565 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31565, term31565.getClass(), "id", term31566);
        setField(term31565, term31565.getClass(), "taxCode", null);
        setBooleanField(term31565, term31565.getClass(), "isLinear", true);
        setIntField(term31565, term31565.getClass(), "aFactor", -714618793);
        setIntField(term31565, term31565.getClass(), "bFactor", 1350743761);
        setBooleanField(term31565, term31565.getClass(), "isSquare", true);
        setIntField(term31565, term31565.getClass(), "aSquareFactor", -2100246850);
        setIntField(term31565, term31565.getClass(), "bSquareFactor", 174682854);
        setIntField(term31565, term31565.getClass(), "cSuqreFactor", -1618786023);
        setField(term31565, term31565.getClass(), "taxConfig", null);
        Object term31575 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31575, term31575.getClass(), "id", null);
        setField(term31575, term31575.getClass(), "taxCode", null);
        setBooleanField(term31575, term31575.getClass(), "isLinear", false);
        setIntField(term31575, term31575.getClass(), "aFactor", 0);
        setIntField(term31575, term31575.getClass(), "bFactor", 0);
        setBooleanField(term31575, term31575.getClass(), "isSquare", false);
        setIntField(term31575, term31575.getClass(), "aSquareFactor", 0);
        setIntField(term31575, term31575.getClass(), "bSquareFactor", 0);
        setIntField(term31575, term31575.getClass(), "cSuqreFactor", 0);
        setField(term31575, term31575.getClass(), "taxConfig", null);
        Long term31584 = new Long(-8614603287624597112L);
        Object term31583 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31583, term31583.getClass(), "id", term31584);
        setField(term31583, term31583.getClass(), "taxCode", null);
        setBooleanField(term31583, term31583.getClass(), "isLinear", true);
        setIntField(term31583, term31583.getClass(), "aFactor", -537204050);
        setIntField(term31583, term31583.getClass(), "bFactor", 549083285);
        setBooleanField(term31583, term31583.getClass(), "isSquare", false);
        setIntField(term31583, term31583.getClass(), "aSquareFactor", 110630919);
        setIntField(term31583, term31583.getClass(), "bSquareFactor", 2002558305);
        setIntField(term31583, term31583.getClass(), "cSuqreFactor", -1729207675);
        setField(term31583, term31583.getClass(), "taxConfig", null);
        Long term31594 = new Long(-57359230242997736L);
        Object term31593 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term31593, term31593.getClass(), "id", term31594);
        setField(term31593, term31593.getClass(), "taxCode", null);
        setBooleanField(term31593, term31593.getClass(), "isLinear", false);
        setIntField(term31593, term31593.getClass(), "aFactor", 600214846);
        setIntField(term31593, term31593.getClass(), "bFactor", 697208850);
        setBooleanField(term31593, term31593.getClass(), "isSquare", true);
        setIntField(term31593, term31593.getClass(), "aSquareFactor", -973142506);
        setIntField(term31593, term31593.getClass(), "bSquareFactor", -15011809);
        setIntField(term31593, term31593.getClass(), "cSuqreFactor", -482193296);
        setField(term31593, term31593.getClass(), "taxConfig", null);
        ArrayList term31563 = new ArrayList();
        ((ArrayList) term31563).add(term31565);
        ((ArrayList) term31563).add(term31575);
        ((ArrayList) term31563).add(term31575);
        ((ArrayList) term31563).add(term31583);
        ((ArrayList) term31563).add(term31593);
        term31485 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term31507 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term31546 = newInstance(Class.forName("java.time.Instant"));
        setField(term31485, term31485.getClass(), "id", term31486);
        setField(term31485, term31485.getClass(), "taxCode", "IvYxGwWoVu");
        setBooleanField(term31485, term31485.getClass(), "isLinear", true);
        setIntField(term31485, term31485.getClass(), "aFactor", -21975974);
        setIntField(term31485, term31485.getClass(), "bFactor", -862969915);
        setBooleanField(term31485, term31485.getClass(), "isSquare", false);
        setIntField(term31485, term31485.getClass(), "aSquareFactor", -1289681614);
        setIntField(term31485, term31485.getClass(), "bSquareFactor", 496461454);
        setIntField(term31485, term31485.getClass(), "cSuqreFactor", -697047947);
        setField(term31507, term31507.getClass(), "id", term31508);
        setField(term31507, term31507.getClass(), "description", "XnZHOhTfxL");
        setField(term31507, term31507.getClass(), "countryReason", "oFBhNamtAs");
        setField(term31507, term31507.getClass(), "countryCode", "YURcpRjwSt");
        setLongField(term31546, term31546.getClass(), "seconds", 1859322280L);
        setIntField(term31546, term31546.getClass(), "nanos", 808000000);
        setField(term31507, term31507.getClass(), "lastModifiedDate", term31546);
        setField(term31507, term31507.getClass(), "modifiedBy", "SXMdNSGPog");
        setIntField(term31507, term31507.getClass(), "currentRulesCount", 505327656);
        setIntField(term31507, term31507.getClass(), "maxRulesCount", 1779734830);
        setField(term31507, term31507.getClass(), "taxRules", term31563);
        setField(term31485, term31485.getClass(), "taxConfig", term31507);
        term31605 = new Integer(1497396124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31605;
        callMethod(klass, "setaSquareFactor", argTypes, term31485, args);
    }

};


