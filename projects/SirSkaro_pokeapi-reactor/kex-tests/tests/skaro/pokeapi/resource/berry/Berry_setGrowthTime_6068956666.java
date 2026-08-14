package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_setGrowthTime_6068956666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;
     Object term1103;

    public Berry_setGrowthTime_6068956666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term974 = new Integer(2055867847);
        Integer term988 = new Integer(-1048298087);
        Integer term990 = new Integer(292681826);
        Integer term992 = new Integer(458147407);
        Integer term994 = new Integer(-184153539);
        Integer term996 = new Integer(493620644);
        Integer term998 = new Integer(1328271830);
        Integer term1028 = new Integer(1596070772);
        Object term1027 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1030 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1027, term1027.getClass(), "potency", term1028);
        setField(term1030, term1030.getClass(), "name", null);
        setField(term1030, term1030.getClass(), "url", null);
        setField(term1027, term1027.getClass(), "flavor", term1030);
        Integer term1032 = new Integer(97029295);
        Object term1031 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1034 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1031, term1031.getClass(), "potency", term1032);
        setField(term1034, term1034.getClass(), "name", null);
        setField(term1034, term1034.getClass(), "url", null);
        setField(term1031, term1031.getClass(), "flavor", term1034);
        Integer term1036 = new Integer(-1371869594);
        Object term1035 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1038 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1035, term1035.getClass(), "potency", term1036);
        setField(term1038, term1038.getClass(), "name", null);
        setField(term1038, term1038.getClass(), "url", null);
        setField(term1035, term1035.getClass(), "flavor", term1038);
        Integer term1040 = new Integer(-2095575670);
        Object term1039 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1042 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1039, term1039.getClass(), "potency", term1040);
        setField(term1042, term1042.getClass(), "name", null);
        setField(term1042, term1042.getClass(), "url", null);
        setField(term1039, term1039.getClass(), "flavor", term1042);
        Integer term1044 = new Integer(1225272962);
        Object term1043 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1046 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1043, term1043.getClass(), "potency", term1044);
        setField(term1046, term1046.getClass(), "name", null);
        setField(term1046, term1046.getClass(), "url", null);
        setField(term1043, term1043.getClass(), "flavor", term1046);
        Integer term1048 = new Integer(1324040357);
        Object term1047 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1050 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1047, term1047.getClass(), "potency", term1048);
        setField(term1050, term1050.getClass(), "name", null);
        setField(term1050, term1050.getClass(), "url", null);
        setField(term1047, term1047.getClass(), "flavor", term1050);
        ArrayList term1025 = new ArrayList();
        ((ArrayList) term1025).add(term1027);
        ((ArrayList) term1025).add(term1031);
        ((ArrayList) term1025).add(term1035);
        ((ArrayList) term1025).add(term1039);
        ((ArrayList) term1025).add(term1043);
        ((ArrayList) term1025).add(term1047);
        term973 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term1000 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1053 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1078 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term973, term973.getClass(), "id", term974);
        setField(term973, term973.getClass(), "name", "whBvTVIIlC");
        setField(term973, term973.getClass(), "growthTime", term988);
        setField(term973, term973.getClass(), "maxHarvest", term990);
        setField(term973, term973.getClass(), "naturalGiftPower", term992);
        setField(term973, term973.getClass(), "size", term994);
        setField(term973, term973.getClass(), "smoothness", term996);
        setField(term973, term973.getClass(), "soilDryness", term998);
        setField(term1000, term1000.getClass(), "name", "IgRJUzaCwW");
        setField(term1000, term1000.getClass(), "url", "JUmudUmaaV");
        setField(term973, term973.getClass(), "firmness", term1000);
        setField(term973, term973.getClass(), "flavors", term1025);
        setField(term1053, term1053.getClass(), "name", "LvJFtLBaxj");
        setField(term1053, term1053.getClass(), "url", "PHvxnGHptP");
        setField(term973, term973.getClass(), "item", term1053);
        setField(term1078, term1078.getClass(), "name", "TimdotUuNC");
        setField(term1078, term1078.getClass(), "url", "PkWMRdJcBb");
        setField(term973, term973.getClass(), "naturalGiftType", term1078);
        term1103 = new Integer(-1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1103;
        callMethod(klass, "setGrowthTime", argTypes, term973, args);
    }

};


