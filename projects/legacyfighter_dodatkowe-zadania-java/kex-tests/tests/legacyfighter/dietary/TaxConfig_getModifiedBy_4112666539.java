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

public class TaxConfig_getModifiedBy_4112666539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20448;

    public TaxConfig_getModifiedBy_4112666539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20449 = new Long(-7873197993099724563L);
        Long term20507 = new Long(-4539648422466320845L);
        Long term20518 = new Long(369988508829037253L);
        Object term20506 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20517 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20506, term20506.getClass(), "id", term20507);
        setField(term20506, term20506.getClass(), "taxCode", "");
        setBooleanField(term20506, term20506.getClass(), "isLinear", true);
        setIntField(term20506, term20506.getClass(), "aFactor", 1286440081);
        setIntField(term20506, term20506.getClass(), "bFactor", -928538452);
        setBooleanField(term20506, term20506.getClass(), "isSquare", true);
        setIntField(term20506, term20506.getClass(), "aSquareFactor", -1313207353);
        setIntField(term20506, term20506.getClass(), "bSquareFactor", 402612318);
        setIntField(term20506, term20506.getClass(), "cSuqreFactor", -1628481565);
        setField(term20517, term20517.getClass(), "id", term20518);
        setField(term20517, term20517.getClass(), "description", null);
        setField(term20517, term20517.getClass(), "countryReason", null);
        setField(term20517, term20517.getClass(), "countryCode", null);
        setField(term20517, term20517.getClass(), "lastModifiedDate", null);
        setField(term20517, term20517.getClass(), "modifiedBy", null);
        setIntField(term20517, term20517.getClass(), "currentRulesCount", -217226756);
        setIntField(term20517, term20517.getClass(), "maxRulesCount", 1608000247);
        setField(term20517, term20517.getClass(), "taxRules", null);
        setField(term20506, term20506.getClass(), "taxConfig", term20517);
        Long term20523 = new Long(2124275424075254005L);
        Object term20522 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20533 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20522, term20522.getClass(), "id", term20523);
        setField(term20522, term20522.getClass(), "taxCode", "");
        setBooleanField(term20522, term20522.getClass(), "isLinear", true);
        setIntField(term20522, term20522.getClass(), "aFactor", 30837706);
        setIntField(term20522, term20522.getClass(), "bFactor", 379523101);
        setBooleanField(term20522, term20522.getClass(), "isSquare", false);
        setIntField(term20522, term20522.getClass(), "aSquareFactor", 1017354215);
        setIntField(term20522, term20522.getClass(), "bSquareFactor", 695330987);
        setIntField(term20522, term20522.getClass(), "cSuqreFactor", -267289967);
        setField(term20533, term20533.getClass(), "id", null);
        setField(term20533, term20533.getClass(), "description", null);
        setField(term20533, term20533.getClass(), "countryReason", null);
        setField(term20533, term20533.getClass(), "countryCode", null);
        setField(term20533, term20533.getClass(), "lastModifiedDate", null);
        setField(term20533, term20533.getClass(), "modifiedBy", null);
        setIntField(term20533, term20533.getClass(), "currentRulesCount", 0);
        setIntField(term20533, term20533.getClass(), "maxRulesCount", 0);
        setField(term20533, term20533.getClass(), "taxRules", null);
        setField(term20522, term20522.getClass(), "taxConfig", term20533);
        Long term20537 = new Long(-9057998854977924783L);
        Long term20548 = new Long(8015201292704898322L);
        Object term20536 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20547 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20536, term20536.getClass(), "id", term20537);
        setField(term20536, term20536.getClass(), "taxCode", "");
        setBooleanField(term20536, term20536.getClass(), "isLinear", false);
        setIntField(term20536, term20536.getClass(), "aFactor", 1203107925);
        setIntField(term20536, term20536.getClass(), "bFactor", 1825448944);
        setBooleanField(term20536, term20536.getClass(), "isSquare", true);
        setIntField(term20536, term20536.getClass(), "aSquareFactor", 1769496642);
        setIntField(term20536, term20536.getClass(), "bSquareFactor", -947460705);
        setIntField(term20536, term20536.getClass(), "cSuqreFactor", -1435758764);
        setField(term20547, term20547.getClass(), "id", term20548);
        setField(term20547, term20547.getClass(), "description", null);
        setField(term20547, term20547.getClass(), "countryReason", null);
        setField(term20547, term20547.getClass(), "countryCode", null);
        setField(term20547, term20547.getClass(), "lastModifiedDate", null);
        setField(term20547, term20547.getClass(), "modifiedBy", null);
        setIntField(term20547, term20547.getClass(), "currentRulesCount", 752858379);
        setIntField(term20547, term20547.getClass(), "maxRulesCount", -370819357);
        setField(term20547, term20547.getClass(), "taxRules", null);
        setField(term20536, term20536.getClass(), "taxConfig", term20547);
        ArrayList term20504 = new ArrayList();
        ((ArrayList) term20504).add(term20506);
        ((ArrayList) term20504).add(term20522);
        ((ArrayList) term20504).add(term20536);
        term20448 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20487 = newInstance(Class.forName("java.time.Instant"));
        setField(term20448, term20448.getClass(), "id", term20449);
        setField(term20448, term20448.getClass(), "description", "szGicGyWDL");
        setField(term20448, term20448.getClass(), "countryReason", "lkdvUiYwRq");
        setField(term20448, term20448.getClass(), "countryCode", "XuxkPrpfND");
        setLongField(term20487, term20487.getClass(), "seconds", 1439706159L);
        setIntField(term20487, term20487.getClass(), "nanos", 917000000);
        setField(term20448, term20448.getClass(), "lastModifiedDate", term20487);
        setField(term20448, term20448.getClass(), "modifiedBy", "OxNXeKMDje");
        setIntField(term20448, term20448.getClass(), "currentRulesCount", 1422430512);
        setIntField(term20448, term20448.getClass(), "maxRulesCount", 1796581482);
        setField(term20448, term20448.getClass(), "taxRules", term20504);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiedBy", argTypes, term20448, args);
    }

};


