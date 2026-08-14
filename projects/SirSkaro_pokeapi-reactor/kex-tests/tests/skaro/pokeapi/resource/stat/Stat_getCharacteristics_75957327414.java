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

public class Stat_getCharacteristics_75957327414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131366;

    public Stat_getCharacteristics_75957327414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term131367 = new Integer(1200772934);
        Integer term131381 = new Integer(-639549660);
        Boolean term131383 = new Boolean(false);
        Integer term131389 = new Integer(-92008992);
        Object term131388 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131388, term131388.getClass(), "change", term131389);
        setField(term131388, term131388.getClass(), "move", null);
        Integer term131392 = new Integer(-1867096385);
        Object term131391 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131391, term131391.getClass(), "change", term131392);
        setField(term131391, term131391.getClass(), "move", null);
        Integer term131395 = new Integer(1228854608);
        Object term131394 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131394, term131394.getClass(), "change", term131395);
        setField(term131394, term131394.getClass(), "move", null);
        Integer term131398 = new Integer(-1210488188);
        Object term131397 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131397, term131397.getClass(), "change", term131398);
        setField(term131397, term131397.getClass(), "move", null);
        Integer term131401 = new Integer(-529430973);
        Object term131400 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131400, term131400.getClass(), "change", term131401);
        setField(term131400, term131400.getClass(), "move", null);
        Integer term131404 = new Integer(1735280371);
        Object term131403 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131403, term131403.getClass(), "change", term131404);
        setField(term131403, term131403.getClass(), "move", null);
        Integer term131407 = new Integer(2014178265);
        Object term131406 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131406, term131406.getClass(), "change", term131407);
        setField(term131406, term131406.getClass(), "move", null);
        Integer term131410 = new Integer(650318106);
        Object term131409 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131409, term131409.getClass(), "change", term131410);
        setField(term131409, term131409.getClass(), "move", null);
        Integer term131413 = new Integer(361184580);
        Object term131412 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131412, term131412.getClass(), "change", term131413);
        setField(term131412, term131412.getClass(), "move", null);
        ArrayList term131386 = new ArrayList();
        ((ArrayList) term131386).add(term131388);
        ((ArrayList) term131386).add(term131391);
        ((ArrayList) term131386).add(term131394);
        ((ArrayList) term131386).add(term131397);
        ((ArrayList) term131386).add(term131400);
        ((ArrayList) term131386).add(term131403);
        ((ArrayList) term131386).add(term131406);
        ((ArrayList) term131386).add(term131409);
        ((ArrayList) term131386).add(term131412);
        Integer term131420 = new Integer(-1132844305);
        Object term131419 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffect"));
        setField(term131419, term131419.getClass(), "change", term131420);
        setField(term131419, term131419.getClass(), "move", null);
        ArrayList term131417 = new ArrayList();
        ((ArrayList) term131417).add(term131419);
        ((ArrayList) term131417).add(term131409);
        ((ArrayList) term131417).add(term131412);
        ((ArrayList) term131417).add(term131388);
        ArrayList term131425 = new ArrayList();
        ArrayList term131429 = new ArrayList();
        ArrayList term131433 = new ArrayList();
        ArrayList term131462 = new ArrayList();
        term131366 = newInstance(Class.forName("skaro.pokeapi.resource.stat.Stat"));
        Object term131385 = newInstance(Class.forName("skaro.pokeapi.resource.stat.MoveStatAffectSets"));
        Object term131424 = newInstance(Class.forName("skaro.pokeapi.resource.stat.NatureStatAffectSets"));
        Object term131437 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term131366, term131366.getClass(), "id", term131367);
        setField(term131366, term131366.getClass(), "name", "MlSrJQvckt");
        setField(term131366, term131366.getClass(), "gameIndex", term131381);
        setField(term131366, term131366.getClass(), "isBattleOnly", term131383);
        setField(term131385, term131385.getClass(), "increase", term131386);
        setField(term131385, term131385.getClass(), "decrease", term131417);
        setField(term131366, term131366.getClass(), "affectingMoves", term131385);
        setField(term131424, term131424.getClass(), "increase", term131425);
        setField(term131424, term131424.getClass(), "decrease", term131429);
        setField(term131366, term131366.getClass(), "affectingNatures", term131424);
        setField(term131366, term131366.getClass(), "characteristics", term131433);
        setField(term131437, term131437.getClass(), "name", "kvZJyxFJGQ");
        setField(term131437, term131437.getClass(), "url", "uawoPCEBic");
        setField(term131366, term131366.getClass(), "moveDamageClass", term131437);
        setField(term131366, term131366.getClass(), "names", term131462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.stat.Stat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacteristics", argTypes, term131366, args);
    }

};


