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

public class TaxConfig_getLastModifiedDate_4578091437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20125;

    public TaxConfig_getLastModifiedDate_4578091437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20126 = new Long(165312735504471081L);
        Long term20184 = new Long(7910323873668469704L);
        Long term20195 = new Long(-8034026767184380879L);
        Object term20183 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20194 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20183, term20183.getClass(), "id", term20184);
        setField(term20183, term20183.getClass(), "taxCode", "");
        setBooleanField(term20183, term20183.getClass(), "isLinear", false);
        setIntField(term20183, term20183.getClass(), "aFactor", 638046409);
        setIntField(term20183, term20183.getClass(), "bFactor", 427274898);
        setBooleanField(term20183, term20183.getClass(), "isSquare", false);
        setIntField(term20183, term20183.getClass(), "aSquareFactor", -1654552020);
        setIntField(term20183, term20183.getClass(), "bSquareFactor", -1049546692);
        setIntField(term20183, term20183.getClass(), "cSuqreFactor", 1397781598);
        setField(term20194, term20194.getClass(), "id", term20195);
        setField(term20194, term20194.getClass(), "description", null);
        setField(term20194, term20194.getClass(), "countryReason", null);
        setField(term20194, term20194.getClass(), "countryCode", null);
        setField(term20194, term20194.getClass(), "lastModifiedDate", null);
        setField(term20194, term20194.getClass(), "modifiedBy", null);
        setIntField(term20194, term20194.getClass(), "currentRulesCount", -44720365);
        setIntField(term20194, term20194.getClass(), "maxRulesCount", 1963632911);
        setField(term20194, term20194.getClass(), "taxRules", null);
        setField(term20183, term20183.getClass(), "taxConfig", term20194);
        Long term20200 = new Long(-1865079020076651952L);
        Long term20211 = new Long(-6255610460583667093L);
        Object term20199 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20210 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20199, term20199.getClass(), "id", term20200);
        setField(term20199, term20199.getClass(), "taxCode", "");
        setBooleanField(term20199, term20199.getClass(), "isLinear", true);
        setIntField(term20199, term20199.getClass(), "aFactor", -1100497683);
        setIntField(term20199, term20199.getClass(), "bFactor", 155423433);
        setBooleanField(term20199, term20199.getClass(), "isSquare", true);
        setIntField(term20199, term20199.getClass(), "aSquareFactor", -815471632);
        setIntField(term20199, term20199.getClass(), "bSquareFactor", -1469668708);
        setIntField(term20199, term20199.getClass(), "cSuqreFactor", 1796950482);
        setField(term20210, term20210.getClass(), "id", term20211);
        setField(term20210, term20210.getClass(), "description", null);
        setField(term20210, term20210.getClass(), "countryReason", null);
        setField(term20210, term20210.getClass(), "countryCode", null);
        setField(term20210, term20210.getClass(), "lastModifiedDate", null);
        setField(term20210, term20210.getClass(), "modifiedBy", null);
        setIntField(term20210, term20210.getClass(), "currentRulesCount", -945759470);
        setIntField(term20210, term20210.getClass(), "maxRulesCount", 657342039);
        setField(term20210, term20210.getClass(), "taxRules", null);
        setField(term20199, term20199.getClass(), "taxConfig", term20210);
        Long term20216 = new Long(-6246278604466261475L);
        Long term20227 = new Long(9113614356317836741L);
        Object term20215 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20226 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20215, term20215.getClass(), "id", term20216);
        setField(term20215, term20215.getClass(), "taxCode", "");
        setBooleanField(term20215, term20215.getClass(), "isLinear", false);
        setIntField(term20215, term20215.getClass(), "aFactor", -742178468);
        setIntField(term20215, term20215.getClass(), "bFactor", 694989162);
        setBooleanField(term20215, term20215.getClass(), "isSquare", true);
        setIntField(term20215, term20215.getClass(), "aSquareFactor", -65504209);
        setIntField(term20215, term20215.getClass(), "bSquareFactor", 1745199030);
        setIntField(term20215, term20215.getClass(), "cSuqreFactor", -1440013173);
        setField(term20226, term20226.getClass(), "id", term20227);
        setField(term20226, term20226.getClass(), "description", null);
        setField(term20226, term20226.getClass(), "countryReason", null);
        setField(term20226, term20226.getClass(), "countryCode", null);
        setField(term20226, term20226.getClass(), "lastModifiedDate", null);
        setField(term20226, term20226.getClass(), "modifiedBy", null);
        setIntField(term20226, term20226.getClass(), "currentRulesCount", -288126597);
        setIntField(term20226, term20226.getClass(), "maxRulesCount", -218831961);
        setField(term20226, term20226.getClass(), "taxRules", null);
        setField(term20215, term20215.getClass(), "taxConfig", term20226);
        Long term20232 = new Long(-5334920917680098031L);
        Object term20231 = newInstance(Class.forName("legacyfighter.dietary.TaxRule"));
        Object term20242 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        setField(term20231, term20231.getClass(), "id", term20232);
        setField(term20231, term20231.getClass(), "taxCode", "");
        setBooleanField(term20231, term20231.getClass(), "isLinear", false);
        setIntField(term20231, term20231.getClass(), "aFactor", 840704993);
        setIntField(term20231, term20231.getClass(), "bFactor", 1297035285);
        setBooleanField(term20231, term20231.getClass(), "isSquare", false);
        setIntField(term20231, term20231.getClass(), "aSquareFactor", -826239685);
        setIntField(term20231, term20231.getClass(), "bSquareFactor", -845551243);
        setIntField(term20231, term20231.getClass(), "cSuqreFactor", 370671198);
        setField(term20242, term20242.getClass(), "id", null);
        setField(term20242, term20242.getClass(), "description", null);
        setField(term20242, term20242.getClass(), "countryReason", null);
        setField(term20242, term20242.getClass(), "countryCode", null);
        setField(term20242, term20242.getClass(), "lastModifiedDate", null);
        setField(term20242, term20242.getClass(), "modifiedBy", null);
        setIntField(term20242, term20242.getClass(), "currentRulesCount", 0);
        setIntField(term20242, term20242.getClass(), "maxRulesCount", 0);
        setField(term20242, term20242.getClass(), "taxRules", null);
        setField(term20231, term20231.getClass(), "taxConfig", term20242);
        ArrayList term20181 = new ArrayList();
        ((ArrayList) term20181).add(term20183);
        ((ArrayList) term20181).add(term20199);
        ((ArrayList) term20181).add(term20215);
        ((ArrayList) term20181).add(term20231);
        term20125 = newInstance(Class.forName("legacyfighter.dietary.TaxConfig"));
        Object term20164 = newInstance(Class.forName("java.time.Instant"));
        setField(term20125, term20125.getClass(), "id", term20126);
        setField(term20125, term20125.getClass(), "description", "HqitWglYWX");
        setField(term20125, term20125.getClass(), "countryReason", "pOuFRlHmbK");
        setField(term20125, term20125.getClass(), "countryCode", "WrzdBkinqV");
        setLongField(term20164, term20164.getClass(), "seconds", 1368680124L);
        setIntField(term20164, term20164.getClass(), "nanos", 141000000);
        setField(term20125, term20125.getClass(), "lastModifiedDate", term20164);
        setField(term20125, term20125.getClass(), "modifiedBy", "vydWXHfFTw");
        setIntField(term20125, term20125.getClass(), "currentRulesCount", -1016478729);
        setIntField(term20125, term20125.getClass(), "maxRulesCount", -206889003);
        setField(term20125, term20125.getClass(), "taxRules", term20181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.TaxConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term20125, args);
    }

};


