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

public class TaxConfig_getCurrentRulesCount_71264269111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20792;

    public TaxConfig_getCurrentRulesCount_71264269111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20793 = new Long(-2752058965354731489L);
        Long term20851 = new Long(-4723024480537897669L);
        Long term20862 = new Long(-8609587218393726408L);
        Object term20850 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20861 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20850, term20850.getClass(), "id", term20851);
        setField(term20850, term20850.getClass(), "taxCode", "");
        setBooleanField(term20850, term20850.getClass(), "isLinear", true);
        setIntField(term20850, term20850.getClass(), "aFactor", -1510967747);
        setIntField(term20850, term20850.getClass(), "bFactor", -2014792457);
        setBooleanField(term20850, term20850.getClass(), "isSquare", false);
        setIntField(term20850, term20850.getClass(), "aSquareFactor", 1957633116);
        setIntField(term20850, term20850.getClass(), "bSquareFactor", 1428598210);
        setIntField(term20850, term20850.getClass(), "cSuqreFactor", 1071776561);
        setField(term20861, term20861.getClass(), "id", term20862);
        setField(term20861, term20861.getClass(), "description", null);
        setField(term20861, term20861.getClass(), "countryReason", null);
        setField(term20861, term20861.getClass(), "countryCode", null);
        setField(term20861, term20861.getClass(), "lastModifiedDate", null);
        setField(term20861, term20861.getClass(), "modifiedBy", null);
        setIntField(term20861, term20861.getClass(), "currentRulesCount", 1846399918);
        setIntField(term20861, term20861.getClass(), "maxRulesCount", 35388821);
        setField(term20861, term20861.getClass(), "taxRules", null);
        setField(term20850, term20850.getClass(), "taxConfig", term20861);
        Long term20867 = new Long(-7010338441819086776L);
        Object term20866 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20877 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20866, term20866.getClass(), "id", term20867);
        setField(term20866, term20866.getClass(), "taxCode", "");
        setBooleanField(term20866, term20866.getClass(), "isLinear", false);
        setIntField(term20866, term20866.getClass(), "aFactor", -1702355599);
        setIntField(term20866, term20866.getClass(), "bFactor", -1477091217);
        setBooleanField(term20866, term20866.getClass(), "isSquare", false);
        setIntField(term20866, term20866.getClass(), "aSquareFactor", 2023226154);
        setIntField(term20866, term20866.getClass(), "bSquareFactor", 2111611214);
        setIntField(term20866, term20866.getClass(), "cSuqreFactor", -2031129784);
        setField(term20877, term20877.getClass(), "id", null);
        setField(term20877, term20877.getClass(), "description", null);
        setField(term20877, term20877.getClass(), "countryReason", null);
        setField(term20877, term20877.getClass(), "countryCode", null);
        setField(term20877, term20877.getClass(), "lastModifiedDate", null);
        setField(term20877, term20877.getClass(), "modifiedBy", null);
        setIntField(term20877, term20877.getClass(), "currentRulesCount", 0);
        setIntField(term20877, term20877.getClass(), "maxRulesCount", 0);
        setField(term20877, term20877.getClass(), "taxRules", null);
        setField(term20866, term20866.getClass(), "taxConfig", term20877);
        Long term20881 = new Long(4133412897876628646L);
        Long term20892 = new Long(-4233021136506075526L);
        Object term20880 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20891 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20880, term20880.getClass(), "id", term20881);
        setField(term20880, term20880.getClass(), "taxCode", "");
        setBooleanField(term20880, term20880.getClass(), "isLinear", false);
        setIntField(term20880, term20880.getClass(), "aFactor", -598803400);
        setIntField(term20880, term20880.getClass(), "bFactor", 25560022);
        setBooleanField(term20880, term20880.getClass(), "isSquare", true);
        setIntField(term20880, term20880.getClass(), "aSquareFactor", -1090136985);
        setIntField(term20880, term20880.getClass(), "bSquareFactor", -355574894);
        setIntField(term20880, term20880.getClass(), "cSuqreFactor", 1866941633);
        setField(term20891, term20891.getClass(), "id", term20892);
        setField(term20891, term20891.getClass(), "description", null);
        setField(term20891, term20891.getClass(), "countryReason", null);
        setField(term20891, term20891.getClass(), "countryCode", null);
        setField(term20891, term20891.getClass(), "lastModifiedDate", null);
        setField(term20891, term20891.getClass(), "modifiedBy", null);
        setIntField(term20891, term20891.getClass(), "currentRulesCount", 1697296048);
        setIntField(term20891, term20891.getClass(), "maxRulesCount", 1302075623);
        setField(term20891, term20891.getClass(), "taxRules", null);
        setField(term20880, term20880.getClass(), "taxConfig", term20891);
        Long term20897 = new Long(-2937192447508714837L);
        Object term20896 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20907 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20896, term20896.getClass(), "id", term20897);
        setField(term20896, term20896.getClass(), "taxCode", "");
        setBooleanField(term20896, term20896.getClass(), "isLinear", true);
        setIntField(term20896, term20896.getClass(), "aFactor", -1343269854);
        setIntField(term20896, term20896.getClass(), "bFactor", -731459309);
        setBooleanField(term20896, term20896.getClass(), "isSquare", false);
        setIntField(term20896, term20896.getClass(), "aSquareFactor", -913468095);
        setIntField(term20896, term20896.getClass(), "bSquareFactor", 38489871);
        setIntField(term20896, term20896.getClass(), "cSuqreFactor", -1667787735);
        setField(term20907, term20907.getClass(), "id", null);
        setField(term20907, term20907.getClass(), "description", null);
        setField(term20907, term20907.getClass(), "countryReason", null);
        setField(term20907, term20907.getClass(), "countryCode", null);
        setField(term20907, term20907.getClass(), "lastModifiedDate", null);
        setField(term20907, term20907.getClass(), "modifiedBy", null);
        setIntField(term20907, term20907.getClass(), "currentRulesCount", 0);
        setIntField(term20907, term20907.getClass(), "maxRulesCount", 0);
        setField(term20907, term20907.getClass(), "taxRules", null);
        setField(term20896, term20896.getClass(), "taxConfig", term20907);
        Long term20911 = new Long(-5317408542996378156L);
        Object term20910 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20921 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20910, term20910.getClass(), "id", term20911);
        setField(term20910, term20910.getClass(), "taxCode", "");
        setBooleanField(term20910, term20910.getClass(), "isLinear", false);
        setIntField(term20910, term20910.getClass(), "aFactor", 1246505552);
        setIntField(term20910, term20910.getClass(), "bFactor", -1456497810);
        setBooleanField(term20910, term20910.getClass(), "isSquare", true);
        setIntField(term20910, term20910.getClass(), "aSquareFactor", 61954667);
        setIntField(term20910, term20910.getClass(), "bSquareFactor", -919022885);
        setIntField(term20910, term20910.getClass(), "cSuqreFactor", -1836286878);
        setField(term20921, term20921.getClass(), "id", null);
        setField(term20921, term20921.getClass(), "description", null);
        setField(term20921, term20921.getClass(), "countryReason", null);
        setField(term20921, term20921.getClass(), "countryCode", null);
        setField(term20921, term20921.getClass(), "lastModifiedDate", null);
        setField(term20921, term20921.getClass(), "modifiedBy", null);
        setIntField(term20921, term20921.getClass(), "currentRulesCount", 0);
        setIntField(term20921, term20921.getClass(), "maxRulesCount", 0);
        setField(term20921, term20921.getClass(), "taxRules", null);
        setField(term20910, term20910.getClass(), "taxConfig", term20921);
        Long term20925 = new Long(3345606904545902400L);
        Object term20924 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        setField(term20924, term20924.getClass(), "id", term20925);
        setField(term20924, term20924.getClass(), "taxCode", "");
        setBooleanField(term20924, term20924.getClass(), "isLinear", false);
        setIntField(term20924, term20924.getClass(), "aFactor", 276336694);
        setIntField(term20924, term20924.getClass(), "bFactor", 1627938506);
        setBooleanField(term20924, term20924.getClass(), "isSquare", false);
        setIntField(term20924, term20924.getClass(), "aSquareFactor", 386284750);
        setIntField(term20924, term20924.getClass(), "bSquareFactor", 906856023);
        setIntField(term20924, term20924.getClass(), "cSuqreFactor", 198857801);
        setField(term20924, term20924.getClass(), "taxConfig", term20907);
        ArrayList term20848 = new ArrayList();
        ((ArrayList) term20848).add(term20850);
        ((ArrayList) term20848).add(term20866);
        ((ArrayList) term20848).add(term20866);
        ((ArrayList) term20848).add(term20880);
        ((ArrayList) term20848).add(term20896);
        ((ArrayList) term20848).add(term20896);
        ((ArrayList) term20848).add(term20910);
        ((ArrayList) term20848).add(term20924);
        term20792 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20831 = newInstance(Class.forName("java.time.Instant"));
        setField(term20792, term20792.getClass(), "id", term20793);
        setField(term20792, term20792.getClass(), "description", "plWlgdgIhn");
        setField(term20792, term20792.getClass(), "countryReason", "RZaKVKWtND");
        setField(term20792, term20792.getClass(), "countryCode", "vXiaNiquft");
        setLongField(term20831, term20831.getClass(), "seconds", 1602136919L);
        setIntField(term20831, term20831.getClass(), "nanos", 2000000);
        setField(term20792, term20792.getClass(), "lastModifiedDate", term20831);
        setField(term20792, term20792.getClass(), "modifiedBy", "lucCeiVnYe");
        setIntField(term20792, term20792.getClass(), "currentRulesCount", -1702132549);
        setIntField(term20792, term20792.getClass(), "maxRulesCount", -1786136772);
        setField(term20792, term20792.getClass(), "taxRules", term20848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentRulesCount", argTypes, term20792, args);
    }

};


