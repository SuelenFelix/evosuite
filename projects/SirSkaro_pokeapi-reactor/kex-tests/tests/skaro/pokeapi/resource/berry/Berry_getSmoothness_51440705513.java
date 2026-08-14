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

public class Berry_getSmoothness_51440705513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2345;

    public Berry_getSmoothness_51440705513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2346 = new Integer(-2063457669);
        Integer term2360 = new Integer(-1222006000);
        Integer term2362 = new Integer(2095798786);
        Integer term2364 = new Integer(-1565502840);
        Integer term2366 = new Integer(344323424);
        Integer term2368 = new Integer(9726679);
        Integer term2370 = new Integer(-25637976);
        Integer term2400 = new Integer(1555897383);
        Object term2399 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2402 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2399, term2399.getClass(), "potency", term2400);
        setField(term2402, term2402.getClass(), "name", null);
        setField(term2402, term2402.getClass(), "url", null);
        setField(term2399, term2399.getClass(), "flavor", term2402);
        Integer term2404 = new Integer(202001407);
        Object term2403 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2406 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2403, term2403.getClass(), "potency", term2404);
        setField(term2406, term2406.getClass(), "name", null);
        setField(term2406, term2406.getClass(), "url", null);
        setField(term2403, term2403.getClass(), "flavor", term2406);
        Integer term2408 = new Integer(158873461);
        Object term2407 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2410 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2407, term2407.getClass(), "potency", term2408);
        setField(term2410, term2410.getClass(), "name", null);
        setField(term2410, term2410.getClass(), "url", null);
        setField(term2407, term2407.getClass(), "flavor", term2410);
        Integer term2412 = new Integer(-430151637);
        Object term2411 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2414 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2411, term2411.getClass(), "potency", term2412);
        setField(term2414, term2414.getClass(), "name", null);
        setField(term2414, term2414.getClass(), "url", null);
        setField(term2411, term2411.getClass(), "flavor", term2414);
        Integer term2416 = new Integer(-1697741339);
        Object term2415 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2418 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2415, term2415.getClass(), "potency", term2416);
        setField(term2418, term2418.getClass(), "name", null);
        setField(term2418, term2418.getClass(), "url", null);
        setField(term2415, term2415.getClass(), "flavor", term2418);
        ArrayList term2397 = new ArrayList();
        ((ArrayList) term2397).add(term2399);
        ((ArrayList) term2397).add(term2403);
        ((ArrayList) term2397).add(term2407);
        ((ArrayList) term2397).add(term2411);
        ((ArrayList) term2397).add(term2415);
        term2345 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term2372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2421 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2446 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2345, term2345.getClass(), "id", term2346);
        setField(term2345, term2345.getClass(), "name", "YpJbIgJWWv");
        setField(term2345, term2345.getClass(), "growthTime", term2360);
        setField(term2345, term2345.getClass(), "maxHarvest", term2362);
        setField(term2345, term2345.getClass(), "naturalGiftPower", term2364);
        setField(term2345, term2345.getClass(), "size", term2366);
        setField(term2345, term2345.getClass(), "smoothness", term2368);
        setField(term2345, term2345.getClass(), "soilDryness", term2370);
        setField(term2372, term2372.getClass(), "name", "JppkknKVOw");
        setField(term2372, term2372.getClass(), "url", "iljANwuEjk");
        setField(term2345, term2345.getClass(), "firmness", term2372);
        setField(term2345, term2345.getClass(), "flavors", term2397);
        setField(term2421, term2421.getClass(), "name", "XJJNClzHRf");
        setField(term2421, term2421.getClass(), "url", "HDaezxQfQR");
        setField(term2345, term2345.getClass(), "item", term2421);
        setField(term2446, term2446.getClass(), "name", "iikZEapDlu");
        setField(term2446, term2446.getClass(), "url", "nhoHrZfnIN");
        setField(term2345, term2345.getClass(), "naturalGiftType", term2446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmoothness", argTypes, term2345, args);
    }

};


