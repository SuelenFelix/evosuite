package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class BerryFlavor_getName_17608891944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140215;

    public BerryFlavor_getName_17608891944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140216 = new Integer(-1700296410);
        Integer term140233 = new Integer(-1568191258);
        Object term140232 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140235 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140232, term140232.getClass(), "potency", term140233);
        setField(term140235, term140235.getClass(), "name", null);
        setField(term140235, term140235.getClass(), "url", null);
        setField(term140232, term140232.getClass(), "berry", term140235);
        Integer term140237 = new Integer(1561855050);
        Object term140236 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140239 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140236, term140236.getClass(), "potency", term140237);
        setField(term140239, term140239.getClass(), "name", null);
        setField(term140239, term140239.getClass(), "url", null);
        setField(term140236, term140236.getClass(), "berry", term140239);
        Integer term140241 = new Integer(-2098601979);
        Object term140240 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140240, term140240.getClass(), "potency", term140241);
        setField(term140243, term140243.getClass(), "name", null);
        setField(term140243, term140243.getClass(), "url", null);
        setField(term140240, term140240.getClass(), "berry", term140243);
        ArrayList term140230 = new ArrayList();
        ((ArrayList) term140230).add(term140232);
        ((ArrayList) term140230).add(term140236);
        ((ArrayList) term140230).add(term140240);
        Object term140273 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140275 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140273, term140273.getClass(), "name", "");
        setField(term140275, term140275.getClass(), "name", null);
        setField(term140275, term140275.getClass(), "url", null);
        setField(term140273, term140273.getClass(), "language", term140275);
        Object term140276 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140278 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140276, term140276.getClass(), "name", "");
        setField(term140278, term140278.getClass(), "name", null);
        setField(term140278, term140278.getClass(), "url", null);
        setField(term140276, term140276.getClass(), "language", term140278);
        Object term140279 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140281 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140279, term140279.getClass(), "name", "");
        setField(term140281, term140281.getClass(), "name", null);
        setField(term140281, term140281.getClass(), "url", null);
        setField(term140279, term140279.getClass(), "language", term140281);
        Object term140282 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140284 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140282, term140282.getClass(), "name", "");
        setField(term140284, term140284.getClass(), "name", null);
        setField(term140284, term140284.getClass(), "url", null);
        setField(term140282, term140282.getClass(), "language", term140284);
        Object term140285 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140287 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140285, term140285.getClass(), "name", "");
        setField(term140287, term140287.getClass(), "name", null);
        setField(term140287, term140287.getClass(), "url", null);
        setField(term140285, term140285.getClass(), "language", term140287);
        Object term140288 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140288, term140288.getClass(), "name", "");
        setField(term140290, term140290.getClass(), "name", null);
        setField(term140290, term140290.getClass(), "url", null);
        setField(term140288, term140288.getClass(), "language", term140290);
        ArrayList term140271 = new ArrayList();
        ((ArrayList) term140271).add(term140273);
        ((ArrayList) term140271).add(term140276);
        ((ArrayList) term140271).add(term140279);
        ((ArrayList) term140271).add(term140282);
        ((ArrayList) term140271).add(term140285);
        ((ArrayList) term140271).add(term140288);
        term140215 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140246 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140215, term140215.getClass(), "id", term140216);
        setField(term140215, term140215.getClass(), "name", "ABDyAGGrjt");
        setField(term140215, term140215.getClass(), "barries", term140230);
        setField(term140246, term140246.getClass(), "name", "eflbyqLKgY");
        setField(term140246, term140246.getClass(), "url", "MdNACmjIeA");
        setField(term140215, term140215.getClass(), "contestType", term140246);
        setField(term140215, term140215.getClass(), "names", term140271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term140215, args);
    }

};


