package skaro.pokeapi.resource.region;

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
import static skaro.pokeapi.resource.region.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Region_setPokedexes_170136540412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184;
     Object term1258;

    public Region_setPokedexes_170136540412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1185 = new Integer(1134449235);
        ArrayList term1187 = new ArrayList();
        Object term1205 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1207 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1205, term1205.getClass(), "name", "");
        setField(term1207, term1207.getClass(), "name", null);
        setField(term1207, term1207.getClass(), "url", null);
        setField(term1205, term1205.getClass(), "language", term1207);
        Object term1208 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1210 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1208, term1208.getClass(), "name", "");
        setField(term1210, term1210.getClass(), "name", null);
        setField(term1210, term1210.getClass(), "url", null);
        setField(term1208, term1208.getClass(), "language", term1210);
        Object term1211 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1213 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1211, term1211.getClass(), "name", "");
        setField(term1213, term1213.getClass(), "name", null);
        setField(term1213, term1213.getClass(), "url", null);
        setField(term1211, term1211.getClass(), "language", term1213);
        Object term1214 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1216 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1214, term1214.getClass(), "name", "");
        setField(term1216, term1216.getClass(), "name", null);
        setField(term1216, term1216.getClass(), "url", null);
        setField(term1214, term1214.getClass(), "language", term1216);
        Object term1217 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1219 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1217, term1217.getClass(), "name", "");
        setField(term1219, term1219.getClass(), "name", null);
        setField(term1219, term1219.getClass(), "url", null);
        setField(term1217, term1217.getClass(), "language", term1219);
        Object term1220 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1222 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1220, term1220.getClass(), "name", "");
        setField(term1222, term1222.getClass(), "name", null);
        setField(term1222, term1222.getClass(), "url", null);
        setField(term1220, term1220.getClass(), "language", term1222);
        ArrayList term1203 = new ArrayList();
        ((ArrayList) term1203).add(term1205);
        ((ArrayList) term1203).add(term1208);
        ((ArrayList) term1203).add(term1211);
        ((ArrayList) term1203).add(term1214);
        ((ArrayList) term1203).add(term1217);
        ((ArrayList) term1203).add(term1220);
        ArrayList term1250 = new ArrayList();
        ArrayList term1254 = new ArrayList();
        term1184 = newInstance(Class.forName("skaro.pokeapi.resource.region.Region"));
        Object term1225 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1184, term1184.getClass(), "id", term1185);
        setField(term1184, term1184.getClass(), "locations", term1187);
        setField(term1184, term1184.getClass(), "name", "WzFopsaDuG");
        setField(term1184, term1184.getClass(), "names", term1203);
        setField(term1225, term1225.getClass(), "name", "ekxGuOYIwi");
        setField(term1225, term1225.getClass(), "url", "RbVQXSpxXy");
        setField(term1184, term1184.getClass(), "mainGeneration", term1225);
        setField(term1184, term1184.getClass(), "pokedexes", term1250);
        setField(term1184, term1184.getClass(), "versionGroups", term1254);
        term1258 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.region.Region");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1258;
        callMethod(klass, "setPokedexes", argTypes, term1184, args);
    }

};


