package skaro.pokeapi.resource.pokedex;

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
import static skaro.pokeapi.resource.pokedex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;

public class Pokedex_setName_19079113664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public Pokedex_setName_19079113664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term531 = new Integer(-655067527);
        Boolean term545 = new Boolean(false);
        Object term549 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term551 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term549, term549.getClass(), "description", "");
        setField(term551, term551.getClass(), "name", null);
        setField(term551, term551.getClass(), "url", null);
        setField(term549, term549.getClass(), "language", term551);
        Object term552 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term554 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term552, term552.getClass(), "description", "");
        setField(term554, term554.getClass(), "name", null);
        setField(term554, term554.getClass(), "url", null);
        setField(term552, term552.getClass(), "language", term554);
        Object term555 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term557 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term555, term555.getClass(), "description", "");
        setField(term557, term557.getClass(), "name", null);
        setField(term557, term557.getClass(), "url", null);
        setField(term555, term555.getClass(), "language", term557);
        Object term558 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term560 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term558, term558.getClass(), "description", "");
        setField(term560, term560.getClass(), "name", null);
        setField(term560, term560.getClass(), "url", null);
        setField(term558, term558.getClass(), "language", term560);
        Object term561 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term563 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term561, term561.getClass(), "description", "");
        setField(term563, term563.getClass(), "name", null);
        setField(term563, term563.getClass(), "url", null);
        setField(term561, term561.getClass(), "language", term563);
        ArrayList term547 = new ArrayList();
        ((ArrayList) term547).add(term549);
        ((ArrayList) term547).add(term552);
        ((ArrayList) term547).add(term555);
        ((ArrayList) term547).add(term558);
        ((ArrayList) term547).add(term561);
        Object term568 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term568, term568.getClass(), "name", "");
        setField(term570, term570.getClass(), "name", null);
        setField(term570, term570.getClass(), "url", null);
        setField(term568, term568.getClass(), "language", term570);
        Object term571 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term573 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term571, term571.getClass(), "name", "");
        setField(term573, term573.getClass(), "name", null);
        setField(term573, term573.getClass(), "url", null);
        setField(term571, term571.getClass(), "language", term573);
        ArrayList term566 = new ArrayList();
        ((ArrayList) term566).add(term568);
        ((ArrayList) term566).add(term571);
        Integer term579 = new Integer(-6029667);
        Object term578 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term581 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term578, term578.getClass(), "entryNumber", term579);
        setField(term581, term581.getClass(), "name", null);
        setField(term581, term581.getClass(), "url", null);
        setField(term578, term578.getClass(), "pokemonSpecies", term581);
        Integer term583 = new Integer(-2068769794);
        Object term582 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term585 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term582, term582.getClass(), "entryNumber", term583);
        setField(term585, term585.getClass(), "name", null);
        setField(term585, term585.getClass(), "url", null);
        setField(term582, term582.getClass(), "pokemonSpecies", term585);
        Integer term587 = new Integer(-117576464);
        Object term586 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term589 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term586, term586.getClass(), "entryNumber", term587);
        setField(term589, term589.getClass(), "name", null);
        setField(term589, term589.getClass(), "url", null);
        setField(term586, term586.getClass(), "pokemonSpecies", term589);
        ArrayList term576 = new ArrayList();
        ((ArrayList) term576).add(term578);
        ((ArrayList) term576).add(term582);
        ((ArrayList) term576).add(term586);
        ArrayList term592 = new ArrayList();
        term530 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term530, term530.getClass(), "id", term531);
        setField(term530, term530.getClass(), "name", "BKLfkLiZTH");
        setField(term530, term530.getClass(), "isMainSeries", term545);
        setField(term530, term530.getClass(), "descriptions", term547);
        setField(term530, term530.getClass(), "names", term566);
        setField(term530, term530.getClass(), "pokemonEntries", term576);
        setField(term530, term530.getClass(), "region", term581);
        setField(term530, term530.getClass(), "versionGroups", term592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLUZFTfjle";
        callMethod(klass, "setName", argTypes, term530, args);
    }

};


