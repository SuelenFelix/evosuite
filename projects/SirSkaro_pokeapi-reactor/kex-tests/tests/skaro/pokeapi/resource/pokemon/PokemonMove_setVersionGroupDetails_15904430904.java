package skaro.pokeapi.resource.pokemon;

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
import static skaro.pokeapi.resource.pokemon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;

public class PokemonMove_setVersionGroupDetails_15904430904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133493;
     Object term133533;

    public PokemonMove_setVersionGroupDetails_15904430904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term133524 = new Integer(470207750);
        Object term133521 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term133522 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term133523 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133522, term133522.getClass(), "name", null);
        setField(term133522, term133522.getClass(), "url", null);
        setField(term133521, term133521.getClass(), "moveLearnMethod", term133522);
        setField(term133523, term133523.getClass(), "name", null);
        setField(term133523, term133523.getClass(), "url", null);
        setField(term133521, term133521.getClass(), "versionGroup", term133523);
        setField(term133521, term133521.getClass(), "levelLearnedAt", term133524);
        Integer term133529 = new Integer(-1220080582);
        Object term133526 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term133527 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term133528 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133527, term133527.getClass(), "name", null);
        setField(term133527, term133527.getClass(), "url", null);
        setField(term133526, term133526.getClass(), "moveLearnMethod", term133527);
        setField(term133528, term133528.getClass(), "name", null);
        setField(term133528, term133528.getClass(), "url", null);
        setField(term133526, term133526.getClass(), "versionGroup", term133528);
        setField(term133526, term133526.getClass(), "levelLearnedAt", term133529);
        ArrayList term133519 = new ArrayList();
        ((ArrayList) term133519).add(term133521);
        ((ArrayList) term133519).add(term133526);
        term133493 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove"));
        Object term133494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133494, term133494.getClass(), "name", "lTiXkUdRee");
        setField(term133494, term133494.getClass(), "url", "UEMNfyBcnJ");
        setField(term133493, term133493.getClass(), "move", term133494);
        setField(term133493, term133493.getClass(), "versionGroupDetails", term133519);
        Integer term133543 = new Integer(-607572941);
        Object term133536 = newInstance(Class.forName("skaro.pokeapi.resource.pokemon.PokemonMoveVersion"));
        Object term133537 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term133540 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term133537, term133537.getClass(), "name", "");
        setField(term133537, term133537.getClass(), "url", "");
        setField(term133536, term133536.getClass(), "moveLearnMethod", term133537);
        setField(term133540, term133540.getClass(), "name", "");
        setField(term133540, term133540.getClass(), "url", "");
        setField(term133536, term133536.getClass(), "versionGroup", term133540);
        setField(term133536, term133536.getClass(), "levelLearnedAt", term133543);
        term133533 = new LinkedList();
        ((LinkedList) term133533).add(term133536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemon.PokemonMove");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term133533;
        callMethod(klass, "setVersionGroupDetails", argTypes, term133493, args);
    }

};


