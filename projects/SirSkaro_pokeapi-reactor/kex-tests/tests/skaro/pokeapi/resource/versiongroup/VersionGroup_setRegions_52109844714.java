package skaro.pokeapi.resource.versiongroup;

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
import static skaro.pokeapi.resource.versiongroup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class VersionGroup_setRegions_52109844714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1222;
     Object term1280;

    public VersionGroup_setRegions_52109844714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1223 = new Integer(-1275173084);
        Integer term1237 = new Integer(-244121226);
        ArrayList term1264 = new ArrayList();
        ArrayList term1268 = new ArrayList();
        ArrayList term1272 = new ArrayList();
        ArrayList term1276 = new ArrayList();
        term1222 = newInstance(Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup"));
        Object term1239 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1222, term1222.getClass(), "id", term1223);
        setField(term1222, term1222.getClass(), "name", "BndsHwAFMv");
        setField(term1222, term1222.getClass(), "order", term1237);
        setField(term1239, term1239.getClass(), "name", "GzFkzHGYFt");
        setField(term1239, term1239.getClass(), "url", "tShwQLRGNe");
        setField(term1222, term1222.getClass(), "generation", term1239);
        setField(term1222, term1222.getClass(), "moveLearnMethods", term1264);
        setField(term1222, term1222.getClass(), "pokedexes", term1268);
        setField(term1222, term1222.getClass(), "regions", term1272);
        setField(term1222, term1222.getClass(), "versions", term1276);
        Object term1283 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1283, term1283.getClass(), "name", "jDtqGUpnZN");
        setField(term1283, term1283.getClass(), "url", "nGKItKLYNC");
        Object term1309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1309, term1309.getClass(), "name", "");
        setField(term1309, term1309.getClass(), "url", "");
        Object term1313 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1313, term1313.getClass(), "name", null);
        setField(term1313, term1313.getClass(), "url", null);
        term1280 = new LinkedList();
        ((LinkedList) term1280).add(term1283);
        ((LinkedList) term1280).add(term1309);
        ((LinkedList) term1280).add(term1313);
        ((LinkedList) term1280).add((Object)null);
        ((LinkedList) term1280).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.versiongroup.VersionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1280;
        callMethod(klass, "setRegions", argTypes, term1222, args);
    }

};


