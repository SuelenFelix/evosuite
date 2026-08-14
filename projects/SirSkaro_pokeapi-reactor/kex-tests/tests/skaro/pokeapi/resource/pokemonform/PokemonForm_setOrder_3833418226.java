package skaro.pokeapi.resource.pokemonform;

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
import static skaro.pokeapi.resource.pokemonform.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class PokemonForm_setOrder_3833418226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;
     Object term2329;

    public PokemonForm_setOrder_3833418226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2160 = new Integer(-1685132342);
        Integer term2174 = new Integer(-1456670397);
        Integer term2176 = new Integer(1622346318);
        Boolean term2178 = new Boolean(false);
        Boolean term2180 = new Boolean(true);
        Object term2295 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2297 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2295, term2295.getClass(), "name", "");
        setField(term2297, term2297.getClass(), "name", null);
        setField(term2297, term2297.getClass(), "url", null);
        setField(term2295, term2295.getClass(), "language", term2297);
        Object term2298 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2300 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2298, term2298.getClass(), "name", "");
        setField(term2300, term2300.getClass(), "name", null);
        setField(term2300, term2300.getClass(), "url", null);
        setField(term2298, term2298.getClass(), "language", term2300);
        Object term2301 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2303 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2301, term2301.getClass(), "name", "");
        setField(term2303, term2303.getClass(), "name", null);
        setField(term2303, term2303.getClass(), "url", null);
        setField(term2301, term2301.getClass(), "language", term2303);
        Object term2304 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2306 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2304, term2304.getClass(), "name", "");
        setField(term2306, term2306.getClass(), "name", null);
        setField(term2306, term2306.getClass(), "url", null);
        setField(term2304, term2304.getClass(), "language", term2306);
        Object term2307 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2307, term2307.getClass(), "name", "");
        setField(term2309, term2309.getClass(), "name", null);
        setField(term2309, term2309.getClass(), "url", null);
        setField(term2307, term2307.getClass(), "language", term2309);
        Object term2310 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2312 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2310, term2310.getClass(), "name", "");
        setField(term2312, term2312.getClass(), "name", null);
        setField(term2312, term2312.getClass(), "url", null);
        setField(term2310, term2310.getClass(), "language", term2312);
        ArrayList term2293 = new ArrayList();
        ((ArrayList) term2293).add(term2295);
        ((ArrayList) term2293).add(term2298);
        ((ArrayList) term2293).add(term2301);
        ((ArrayList) term2293).add(term2304);
        ((ArrayList) term2293).add(term2307);
        ((ArrayList) term2293).add(term2310);
        Object term2317 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2319 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2317, term2317.getClass(), "name", "");
        setField(term2319, term2319.getClass(), "name", null);
        setField(term2319, term2319.getClass(), "url", null);
        setField(term2317, term2317.getClass(), "language", term2319);
        Object term2320 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2322 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2320, term2320.getClass(), "name", "");
        setField(term2322, term2322.getClass(), "name", null);
        setField(term2322, term2322.getClass(), "url", null);
        setField(term2320, term2320.getClass(), "language", term2322);
        Object term2323 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term2323, term2323.getClass(), "name", "");
        setField(term2323, term2323.getClass(), "language", term2312);
        Object term2325 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term2325, term2325.getClass(), "name", "");
        setField(term2325, term2325.getClass(), "language", term2319);
        ArrayList term2315 = new ArrayList();
        ((ArrayList) term2315).add(term2317);
        ((ArrayList) term2315).add(term2320);
        ((ArrayList) term2315).add(term2323);
        ((ArrayList) term2315).add(term2325);
        ((ArrayList) term2315).add(term2295);
        term2159 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term2194 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2219 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term2268 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2159, term2159.getClass(), "id", term2160);
        setField(term2159, term2159.getClass(), "name", "ZkMALXpEAZ");
        setField(term2159, term2159.getClass(), "order", term2174);
        setField(term2159, term2159.getClass(), "formOrder", term2176);
        setField(term2159, term2159.getClass(), "isDefault", term2178);
        setField(term2159, term2159.getClass(), "isBattleOnly", term2180);
        setField(term2159, term2159.getClass(), "formName", "tXfQjSqDzN");
        setField(term2194, term2194.getClass(), "name", "BjugTaMcxJ");
        setField(term2194, term2194.getClass(), "url", "vGiuZVPJNH");
        setField(term2159, term2159.getClass(), "pokemon", term2194);
        setField(term2219, term2219.getClass(), "frontDefault", "tlzpzIjMib");
        setField(term2219, term2219.getClass(), "frontShiny", "AZdLeSugwv");
        setField(term2219, term2219.getClass(), "backDefault", "RMsXuyzKJV");
        setField(term2219, term2219.getClass(), "backShiny", "FwPbDZcHmB");
        setField(term2159, term2159.getClass(), "sprites", term2219);
        setField(term2268, term2268.getClass(), "name", "hOncybyCAH");
        setField(term2268, term2268.getClass(), "url", "QduALnDSVo");
        setField(term2159, term2159.getClass(), "versionGroup", term2268);
        setField(term2159, term2159.getClass(), "names", term2293);
        setField(term2159, term2159.getClass(), "formNames", term2315);
        term2329 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2329;
        callMethod(klass, "setOrder", argTypes, term2159, args);
    }

};


