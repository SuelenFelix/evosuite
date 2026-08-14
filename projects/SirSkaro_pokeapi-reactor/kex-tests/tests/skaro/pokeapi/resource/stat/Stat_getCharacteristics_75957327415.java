package skaro.pokeapi.resource.stat;

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
import static skaro.pokeapi.resource.stat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class Stat_getCharacteristics_75957327415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2272;

    public Stat_getCharacteristics_75957327415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2273 = new Integer(1296895584);
        Integer term2287 = new Integer(628918458);
        Boolean term2289 = new Boolean(true);
        Integer term2295 = new Integer(-1274456137);
        Object term2294 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2294, term2294.getClass(), "change", term2295);
        setField(term2294, term2294.getClass(), "move", null);
        Integer term2298 = new Integer(1041916673);
        Object term2297 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2297, term2297.getClass(), "change", term2298);
        setField(term2297, term2297.getClass(), "move", null);
        Integer term2301 = new Integer(-601863069);
        Object term2300 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2300, term2300.getClass(), "change", term2301);
        setField(term2300, term2300.getClass(), "move", null);
        ArrayList term2292 = new ArrayList();
        ((ArrayList) term2292).add(term2294);
        ((ArrayList) term2292).add(term2297);
        ((ArrayList) term2292).add(term2300);
        Integer term2308 = new Integer(663292551);
        Object term2307 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2307, term2307.getClass(), "change", term2308);
        setField(term2307, term2307.getClass(), "move", null);
        Integer term2311 = new Integer(-1885090354);
        Object term2310 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2310, term2310.getClass(), "change", term2311);
        setField(term2310, term2310.getClass(), "move", null);
        Integer term2314 = new Integer(-2066804303);
        Object term2313 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2313, term2313.getClass(), "change", term2314);
        setField(term2313, term2313.getClass(), "move", null);
        Integer term2317 = new Integer(-1731761810);
        Object term2316 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2316, term2316.getClass(), "change", term2317);
        setField(term2316, term2316.getClass(), "move", null);
        Integer term2320 = new Integer(197109649);
        Object term2319 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2319, term2319.getClass(), "change", term2320);
        setField(term2319, term2319.getClass(), "move", null);
        Integer term2323 = new Integer(-1239406390);
        Object term2322 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2322, term2322.getClass(), "change", term2323);
        setField(term2322, term2322.getClass(), "move", null);
        Integer term2326 = new Integer(1557431527);
        Object term2325 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2325, term2325.getClass(), "change", term2326);
        setField(term2325, term2325.getClass(), "move", null);
        ArrayList term2305 = new ArrayList();
        ((ArrayList) term2305).add(term2307);
        ((ArrayList) term2305).add(term2310);
        ((ArrayList) term2305).add(term2313);
        ((ArrayList) term2305).add(term2316);
        ((ArrayList) term2305).add(term2319);
        ((ArrayList) term2305).add(term2322);
        ((ArrayList) term2305).add(term2325);
        ((ArrayList) term2305).add(term2319);
        ((ArrayList) term2305).add(term2322);
        ArrayList term2331 = new ArrayList();
        ArrayList term2335 = new ArrayList();
        ArrayList term2339 = new ArrayList();
        Object term2370 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2372 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2370, term2370.getClass(), "name", "");
        setField(term2372, term2372.getClass(), "name", null);
        setField(term2372, term2372.getClass(), "url", null);
        setField(term2370, term2370.getClass(), "language", term2372);
        Object term2373 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2375 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2373, term2373.getClass(), "name", "");
        setField(term2375, term2375.getClass(), "name", null);
        setField(term2375, term2375.getClass(), "url", null);
        setField(term2373, term2373.getClass(), "language", term2375);
        Object term2376 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2378 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2376, term2376.getClass(), "name", "");
        setField(term2378, term2378.getClass(), "name", null);
        setField(term2378, term2378.getClass(), "url", null);
        setField(term2376, term2376.getClass(), "language", term2378);
        ArrayList term2368 = new ArrayList();
        ((ArrayList) term2368).add(term2370);
        ((ArrayList) term2368).add(term2373);
        ((ArrayList) term2368).add(term2376);
        term2272 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term2291 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term2330 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term2343 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2272, term2272.getClass(), "id", term2273);
        setField(term2272, term2272.getClass(), "name", "KtuuNAqGCQ");
        setField(term2272, term2272.getClass(), "gameIndex", term2287);
        setField(term2272, term2272.getClass(), "isBattleOnly", term2289);
        setField(term2291, term2291.getClass(), "increase", term2292);
        setField(term2291, term2291.getClass(), "decrease", term2305);
        setField(term2272, term2272.getClass(), "affectingMoves", term2291);
        setField(term2330, term2330.getClass(), "increase", term2331);
        setField(term2330, term2330.getClass(), "decrease", term2335);
        setField(term2272, term2272.getClass(), "affectingNatures", term2330);
        setField(term2272, term2272.getClass(), "characteristics", term2339);
        setField(term2343, term2343.getClass(), "name", "OGQsfjmReM");
        setField(term2343, term2343.getClass(), "url", "YsUtbngnRO");
        setField(term2272, term2272.getClass(), "moveDamageClass", term2343);
        setField(term2272, term2272.getClass(), "names", term2368);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacteristics", argTypes, term2272, args);
    }

};


