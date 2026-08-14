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

public class Berry_setSmoothness_64245827314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;
     Object term2655;

    public Berry_setSmoothness_64245827314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2542 = new Integer(98922530);
        Integer term2556 = new Integer(-1388471422);
        Integer term2558 = new Integer(-1498296052);
        Integer term2560 = new Integer(2098647989);
        Integer term2562 = new Integer(1598895173);
        Integer term2564 = new Integer(1830648570);
        Integer term2566 = new Integer(-227365013);
        Integer term2596 = new Integer(11724947);
        Object term2595 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2598 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2595, term2595.getClass(), "potency", term2596);
        setField(term2598, term2598.getClass(), "name", null);
        setField(term2598, term2598.getClass(), "url", null);
        setField(term2595, term2595.getClass(), "flavor", term2598);
        Integer term2600 = new Integer(1953277050);
        Object term2599 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2602 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2599, term2599.getClass(), "potency", term2600);
        setField(term2602, term2602.getClass(), "name", null);
        setField(term2602, term2602.getClass(), "url", null);
        setField(term2599, term2599.getClass(), "flavor", term2602);
        ArrayList term2593 = new ArrayList();
        ((ArrayList) term2593).add(term2595);
        ((ArrayList) term2593).add(term2599);
        term2541 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term2568 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2605 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2630 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2541, term2541.getClass(), "id", term2542);
        setField(term2541, term2541.getClass(), "name", "ZkMALXpEAZ");
        setField(term2541, term2541.getClass(), "growthTime", term2556);
        setField(term2541, term2541.getClass(), "maxHarvest", term2558);
        setField(term2541, term2541.getClass(), "naturalGiftPower", term2560);
        setField(term2541, term2541.getClass(), "size", term2562);
        setField(term2541, term2541.getClass(), "smoothness", term2564);
        setField(term2541, term2541.getClass(), "soilDryness", term2566);
        setField(term2568, term2568.getClass(), "name", "tXfQjSqDzN");
        setField(term2568, term2568.getClass(), "url", "BjugTaMcxJ");
        setField(term2541, term2541.getClass(), "firmness", term2568);
        setField(term2541, term2541.getClass(), "flavors", term2593);
        setField(term2605, term2605.getClass(), "name", "FwPbDZcHmB");
        setField(term2605, term2605.getClass(), "url", "hOncybyCAH");
        setField(term2541, term2541.getClass(), "item", term2605);
        setField(term2630, term2630.getClass(), "name", "QduALnDSVo");
        setField(term2630, term2630.getClass(), "url", "izPpKDErnQ");
        setField(term2541, term2541.getClass(), "naturalGiftType", term2630);
        term2655 = new Integer(1283079251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2655;
        callMethod(klass, "setSmoothness", argTypes, term2541, args);
    }

};


