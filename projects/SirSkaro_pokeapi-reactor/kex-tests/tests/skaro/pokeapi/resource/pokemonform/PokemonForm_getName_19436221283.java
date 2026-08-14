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

public class PokemonForm_getName_19436221283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1342;

    public PokemonForm_getName_19436221283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1343 = new Integer(-2038273078);
        Integer term1357 = new Integer(1227103734);
        Integer term1359 = new Integer(-1339778481);
        Boolean term1361 = new Boolean(true);
        Boolean term1363 = new Boolean(true);
        Object term1478 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1480 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1478, term1478.getClass(), "name", "");
        setField(term1480, term1480.getClass(), "name", null);
        setField(term1480, term1480.getClass(), "url", null);
        setField(term1478, term1478.getClass(), "language", term1480);
        ArrayList term1476 = new ArrayList();
        ((ArrayList) term1476).add(term1478);
        Object term1485 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1487 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1485, term1485.getClass(), "name", "");
        setField(term1487, term1487.getClass(), "name", null);
        setField(term1487, term1487.getClass(), "url", null);
        setField(term1485, term1485.getClass(), "language", term1487);
        Object term1488 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1490 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1488, term1488.getClass(), "name", "");
        setField(term1490, term1490.getClass(), "name", null);
        setField(term1490, term1490.getClass(), "url", null);
        setField(term1488, term1488.getClass(), "language", term1490);
        Object term1491 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1493 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1491, term1491.getClass(), "name", "");
        setField(term1493, term1493.getClass(), "name", null);
        setField(term1493, term1493.getClass(), "url", null);
        setField(term1491, term1491.getClass(), "language", term1493);
        Object term1494 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1496 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1494, term1494.getClass(), "name", "");
        setField(term1496, term1496.getClass(), "name", null);
        setField(term1496, term1496.getClass(), "url", null);
        setField(term1494, term1494.getClass(), "language", term1496);
        Object term1497 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1499 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1497, term1497.getClass(), "name", "");
        setField(term1499, term1499.getClass(), "name", null);
        setField(term1499, term1499.getClass(), "url", null);
        setField(term1497, term1497.getClass(), "language", term1499);
        Object term1500 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1502 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1500, term1500.getClass(), "name", "");
        setField(term1502, term1502.getClass(), "name", null);
        setField(term1502, term1502.getClass(), "url", null);
        setField(term1500, term1500.getClass(), "language", term1502);
        ArrayList term1483 = new ArrayList();
        ((ArrayList) term1483).add(term1485);
        ((ArrayList) term1483).add(term1488);
        ((ArrayList) term1483).add(term1491);
        ((ArrayList) term1483).add(term1494);
        ((ArrayList) term1483).add(term1497);
        ((ArrayList) term1483).add(term1500);
        term1342 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term1377 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1402 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term1451 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1342, term1342.getClass(), "id", term1343);
        setField(term1342, term1342.getClass(), "name", "AWRooQKkdW");
        setField(term1342, term1342.getClass(), "order", term1357);
        setField(term1342, term1342.getClass(), "formOrder", term1359);
        setField(term1342, term1342.getClass(), "isDefault", term1361);
        setField(term1342, term1342.getClass(), "isBattleOnly", term1363);
        setField(term1342, term1342.getClass(), "formName", "vjxIhXHxGR");
        setField(term1377, term1377.getClass(), "name", "QXzGXbEXMu");
        setField(term1377, term1377.getClass(), "url", "qxSDVejjiY");
        setField(term1342, term1342.getClass(), "pokemon", term1377);
        setField(term1402, term1402.getClass(), "frontDefault", "xBsXSDjXYK");
        setField(term1402, term1402.getClass(), "frontShiny", "sEnIVFtZuQ");
        setField(term1402, term1402.getClass(), "backDefault", "ZVecLZMLHF");
        setField(term1402, term1402.getClass(), "backShiny", "fztQhjqwdP");
        setField(term1342, term1342.getClass(), "sprites", term1402);
        setField(term1451, term1451.getClass(), "name", "eVpkWxjuki");
        setField(term1451, term1451.getClass(), "url", "SJiQaLvSKv");
        setField(term1342, term1342.getClass(), "versionGroup", term1451);
        setField(term1342, term1342.getClass(), "names", term1476);
        setField(term1342, term1342.getClass(), "formNames", term1483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1342, args);
    }

};


