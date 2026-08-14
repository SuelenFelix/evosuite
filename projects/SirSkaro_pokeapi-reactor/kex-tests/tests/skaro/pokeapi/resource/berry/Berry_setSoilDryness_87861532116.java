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

public class Berry_setSoilDryness_87861532116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2915;
     Object term3025;

    public Berry_setSoilDryness_87861532116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2916 = new Integer(-1274456137);
        Integer term2930 = new Integer(1041916673);
        Integer term2932 = new Integer(-601863069);
        Integer term2934 = new Integer(663292551);
        Integer term2936 = new Integer(-1885090354);
        Integer term2938 = new Integer(-2066804303);
        Integer term2940 = new Integer(-1731761810);
        Integer term2970 = new Integer(197109649);
        Object term2969 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2969, term2969.getClass(), "potency", term2970);
        setField(term2972, term2972.getClass(), "name", null);
        setField(term2972, term2972.getClass(), "url", null);
        setField(term2969, term2969.getClass(), "flavor", term2972);
        ArrayList term2967 = new ArrayList();
        ((ArrayList) term2967).add(term2969);
        term2915 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term2942 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2975 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3000 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2915, term2915.getClass(), "id", term2916);
        setField(term2915, term2915.getClass(), "name", "AHbZyFOmlo");
        setField(term2915, term2915.getClass(), "growthTime", term2930);
        setField(term2915, term2915.getClass(), "maxHarvest", term2932);
        setField(term2915, term2915.getClass(), "naturalGiftPower", term2934);
        setField(term2915, term2915.getClass(), "size", term2936);
        setField(term2915, term2915.getClass(), "smoothness", term2938);
        setField(term2915, term2915.getClass(), "soilDryness", term2940);
        setField(term2942, term2942.getClass(), "name", "TwfWVQGiIj");
        setField(term2942, term2942.getClass(), "url", "gUvcueTURF");
        setField(term2915, term2915.getClass(), "firmness", term2942);
        setField(term2915, term2915.getClass(), "flavors", term2967);
        setField(term2975, term2975.getClass(), "name", "xvkbvaEGYd");
        setField(term2975, term2975.getClass(), "url", "HBGNxdNURv");
        setField(term2915, term2915.getClass(), "item", term2975);
        setField(term3000, term3000.getClass(), "name", "mfCpTPPQQm");
        setField(term3000, term3000.getClass(), "url", "OcJCIDNIXA");
        setField(term2915, term2915.getClass(), "naturalGiftType", term3000);
        term3025 = new Integer(-1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3025;
        callMethod(klass, "setSoilDryness", argTypes, term2915, args);
    }

};


