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

public class Berry_setSize_7177801112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;
     Object term2273;

    public Berry_setSize_7177801112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2148 = new Integer(-375014958);
        Integer term2162 = new Integer(1107176718);
        Integer term2164 = new Integer(480137250);
        Integer term2166 = new Integer(-341152642);
        Integer term2168 = new Integer(-2015854073);
        Integer term2170 = new Integer(538259104);
        Integer term2172 = new Integer(96566506);
        Integer term2202 = new Integer(-343325701);
        Object term2201 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2204 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2201, term2201.getClass(), "potency", term2202);
        setField(term2204, term2204.getClass(), "name", null);
        setField(term2204, term2204.getClass(), "url", null);
        setField(term2201, term2201.getClass(), "flavor", term2204);
        Integer term2206 = new Integer(107945604);
        Object term2205 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2208 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2205, term2205.getClass(), "potency", term2206);
        setField(term2208, term2208.getClass(), "name", null);
        setField(term2208, term2208.getClass(), "url", null);
        setField(term2205, term2205.getClass(), "flavor", term2208);
        Integer term2210 = new Integer(-1963464809);
        Object term2209 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2212 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2209, term2209.getClass(), "potency", term2210);
        setField(term2212, term2212.getClass(), "name", null);
        setField(term2212, term2212.getClass(), "url", null);
        setField(term2209, term2209.getClass(), "flavor", term2212);
        Integer term2214 = new Integer(71190297);
        Object term2213 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2216 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2213, term2213.getClass(), "potency", term2214);
        setField(term2216, term2216.getClass(), "name", null);
        setField(term2216, term2216.getClass(), "url", null);
        setField(term2213, term2213.getClass(), "flavor", term2216);
        Integer term2218 = new Integer(1202361360);
        Object term2217 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term2220 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2217, term2217.getClass(), "potency", term2218);
        setField(term2220, term2220.getClass(), "name", null);
        setField(term2220, term2220.getClass(), "url", null);
        setField(term2217, term2217.getClass(), "flavor", term2220);
        ArrayList term2199 = new ArrayList();
        ((ArrayList) term2199).add(term2201);
        ((ArrayList) term2199).add(term2205);
        ((ArrayList) term2199).add(term2209);
        ((ArrayList) term2199).add(term2213);
        ((ArrayList) term2199).add(term2217);
        term2147 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term2174 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2223 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2248 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2147, term2147.getClass(), "id", term2148);
        setField(term2147, term2147.getClass(), "name", "OYbzXylRWW");
        setField(term2147, term2147.getClass(), "growthTime", term2162);
        setField(term2147, term2147.getClass(), "maxHarvest", term2164);
        setField(term2147, term2147.getClass(), "naturalGiftPower", term2166);
        setField(term2147, term2147.getClass(), "size", term2168);
        setField(term2147, term2147.getClass(), "smoothness", term2170);
        setField(term2147, term2147.getClass(), "soilDryness", term2172);
        setField(term2174, term2174.getClass(), "name", "DSNsTGYXDF");
        setField(term2174, term2174.getClass(), "url", "sQvGcVjdEx");
        setField(term2147, term2147.getClass(), "firmness", term2174);
        setField(term2147, term2147.getClass(), "flavors", term2199);
        setField(term2223, term2223.getClass(), "name", "VGizxZnyHX");
        setField(term2223, term2223.getClass(), "url", "kVEZMHmRtR");
        setField(term2147, term2147.getClass(), "item", term2223);
        setField(term2248, term2248.getClass(), "name", "ekxGuOYIwi");
        setField(term2248, term2248.getClass(), "url", "RbVQXSpxXy");
        setField(term2147, term2147.getClass(), "naturalGiftType", term2248);
        term2273 = new Integer(-2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2273;
        callMethod(klass, "setSize", argTypes, term2147, args);
    }

};


