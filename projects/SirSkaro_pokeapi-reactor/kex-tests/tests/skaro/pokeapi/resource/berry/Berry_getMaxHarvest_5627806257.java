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

public class Berry_getMaxHarvest_5627806257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1175;

    public Berry_getMaxHarvest_5627806257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1176 = new Integer(-93135961);
        Integer term1190 = new Integer(-112921587);
        Integer term1192 = new Integer(933028652);
        Integer term1194 = new Integer(287287233);
        Integer term1196 = new Integer(962840079);
        Integer term1198 = new Integer(1540719661);
        Integer term1200 = new Integer(1265463001);
        Integer term1230 = new Integer(335112684);
        Object term1229 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1232 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1229, term1229.getClass(), "potency", term1230);
        setField(term1232, term1232.getClass(), "name", null);
        setField(term1232, term1232.getClass(), "url", null);
        setField(term1229, term1229.getClass(), "flavor", term1232);
        Integer term1234 = new Integer(1551099402);
        Object term1233 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term1236 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1233, term1233.getClass(), "potency", term1234);
        setField(term1236, term1236.getClass(), "name", null);
        setField(term1236, term1236.getClass(), "url", null);
        setField(term1233, term1233.getClass(), "flavor", term1236);
        ArrayList term1227 = new ArrayList();
        ((ArrayList) term1227).add(term1229);
        ((ArrayList) term1227).add(term1233);
        term1175 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term1202 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1239 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1175, term1175.getClass(), "id", term1176);
        setField(term1175, term1175.getClass(), "name", "jSpAteRute");
        setField(term1175, term1175.getClass(), "growthTime", term1190);
        setField(term1175, term1175.getClass(), "maxHarvest", term1192);
        setField(term1175, term1175.getClass(), "naturalGiftPower", term1194);
        setField(term1175, term1175.getClass(), "size", term1196);
        setField(term1175, term1175.getClass(), "smoothness", term1198);
        setField(term1175, term1175.getClass(), "soilDryness", term1200);
        setField(term1202, term1202.getClass(), "name", "swZVeJAxjt");
        setField(term1202, term1202.getClass(), "url", "xOcJIiQQDu");
        setField(term1175, term1175.getClass(), "firmness", term1202);
        setField(term1175, term1175.getClass(), "flavors", term1227);
        setField(term1239, term1239.getClass(), "name", "XqgfKFvPSD");
        setField(term1239, term1239.getClass(), "url", "JiVRgTZvKc");
        setField(term1175, term1175.getClass(), "item", term1239);
        setField(term1264, term1264.getClass(), "name", "XPKmummaqg");
        setField(term1264, term1264.getClass(), "url", "BKLfkLiZTH");
        setField(term1175, term1175.getClass(), "naturalGiftType", term1264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxHarvest", argTypes, term1175, args);
    }

};


