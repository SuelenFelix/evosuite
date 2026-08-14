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
import java.util.LinkedList;

public class Stat_setCharacteristics_55418228016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2411;
     Object term2511;

    public Stat_setCharacteristics_55418228016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2412 = new Integer(-1504890659);
        Integer term2426 = new Integer(1358829571);
        Boolean term2428 = new Boolean(false);
        Integer term2434 = new Integer(991356662);
        Object term2433 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2433, term2433.getClass(), "change", term2434);
        setField(term2433, term2433.getClass(), "move", null);
        Integer term2437 = new Integer(-506958186);
        Object term2436 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2436, term2436.getClass(), "change", term2437);
        setField(term2436, term2436.getClass(), "move", null);
        Integer term2440 = new Integer(-507387516);
        Object term2439 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2439, term2439.getClass(), "change", term2440);
        setField(term2439, term2439.getClass(), "move", null);
        Integer term2443 = new Integer(-1970452551);
        Object term2442 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2442, term2442.getClass(), "change", term2443);
        setField(term2442, term2442.getClass(), "move", null);
        ArrayList term2431 = new ArrayList();
        ((ArrayList) term2431).add(term2433);
        ((ArrayList) term2431).add(term2436);
        ((ArrayList) term2431).add(term2439);
        ((ArrayList) term2431).add(term2442);
        Integer term2450 = new Integer(-1896376975);
        Object term2449 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2449, term2449.getClass(), "change", term2450);
        setField(term2449, term2449.getClass(), "move", null);
        Integer term2453 = new Integer(729658803);
        Object term2452 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2452, term2452.getClass(), "change", term2453);
        setField(term2452, term2452.getClass(), "move", null);
        Integer term2456 = new Integer(114754804);
        Object term2455 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2455, term2455.getClass(), "change", term2456);
        setField(term2455, term2455.getClass(), "move", null);
        Integer term2459 = new Integer(1687361082);
        Object term2458 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2458, term2458.getClass(), "change", term2459);
        setField(term2458, term2458.getClass(), "move", null);
        Integer term2462 = new Integer(584893196);
        Object term2461 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2461, term2461.getClass(), "change", term2462);
        setField(term2461, term2461.getClass(), "move", null);
        Integer term2465 = new Integer(497269071);
        Object term2464 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term2464, term2464.getClass(), "change", term2465);
        setField(term2464, term2464.getClass(), "move", null);
        ArrayList term2447 = new ArrayList();
        ((ArrayList) term2447).add(term2449);
        ((ArrayList) term2447).add(term2452);
        ((ArrayList) term2447).add(term2455);
        ((ArrayList) term2447).add(term2458);
        ((ArrayList) term2447).add(term2461);
        ((ArrayList) term2447).add(term2464);
        ((ArrayList) term2447).add(term2458);
        ((ArrayList) term2447).add(term2461);
        ArrayList term2470 = new ArrayList();
        ArrayList term2474 = new ArrayList();
        ArrayList term2478 = new ArrayList();
        ArrayList term2507 = new ArrayList();
        term2411 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term2430 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term2469 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term2482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2411, term2411.getClass(), "id", term2412);
        setField(term2411, term2411.getClass(), "name", "VUkRVwROTl");
        setField(term2411, term2411.getClass(), "gameIndex", term2426);
        setField(term2411, term2411.getClass(), "isBattleOnly", term2428);
        setField(term2430, term2430.getClass(), "increase", term2431);
        setField(term2430, term2430.getClass(), "decrease", term2447);
        setField(term2411, term2411.getClass(), "affectingMoves", term2430);
        setField(term2469, term2469.getClass(), "increase", term2470);
        setField(term2469, term2469.getClass(), "decrease", term2474);
        setField(term2411, term2411.getClass(), "affectingNatures", term2469);
        setField(term2411, term2411.getClass(), "characteristics", term2478);
        setField(term2482, term2482.getClass(), "name", "UDlkdccCRn");
        setField(term2482, term2482.getClass(), "url", "McpzErOcYb");
        setField(term2411, term2411.getClass(), "moveDamageClass", term2482);
        setField(term2411, term2411.getClass(), "names", term2507);
        Object term2514 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term2514, term2514.getClass(), "url", "wsysQLGFnl");
        Object term2528 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term2528, term2528.getClass(), "url", "");
        Object term2531 = newInstance(Class.forName("skaro.pokeapi.resource.ApiResource"));
        setField(term2531, term2531.getClass(), "url", null);
        term2511 = new LinkedList();
        ((LinkedList) term2511).add(term2514);
        ((LinkedList) term2511).add(term2528);
        ((LinkedList) term2511).add(term2531);
        ((LinkedList) term2511).add((Object)null);
        ((LinkedList) term2511).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2511;
        callMethod(klass, "setCharacteristics", argTypes, term2411, args);
    }

};


