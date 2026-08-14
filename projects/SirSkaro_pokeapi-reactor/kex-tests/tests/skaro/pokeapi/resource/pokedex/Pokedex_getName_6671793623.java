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

public class Pokedex_getName_6671793623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;

    public Pokedex_getName_6671793623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term444 = new Integer(-883034806);
        Boolean term458 = new Boolean(false);
        Object term462 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term464 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term462, term462.getClass(), "description", "");
        setField(term464, term464.getClass(), "name", null);
        setField(term464, term464.getClass(), "url", null);
        setField(term462, term462.getClass(), "language", term464);
        Object term465 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term467 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term465, term465.getClass(), "description", "");
        setField(term467, term467.getClass(), "name", null);
        setField(term467, term467.getClass(), "url", null);
        setField(term465, term465.getClass(), "language", term467);
        Object term468 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term470 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term468, term468.getClass(), "description", "");
        setField(term470, term470.getClass(), "name", null);
        setField(term470, term470.getClass(), "url", null);
        setField(term468, term468.getClass(), "language", term470);
        Object term471 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term473 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term471, term471.getClass(), "description", "");
        setField(term473, term473.getClass(), "name", null);
        setField(term473, term473.getClass(), "url", null);
        setField(term471, term471.getClass(), "language", term473);
        Object term474 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term476 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term474, term474.getClass(), "description", "");
        setField(term476, term476.getClass(), "name", null);
        setField(term476, term476.getClass(), "url", null);
        setField(term474, term474.getClass(), "language", term476);
        Object term477 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term479 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term477, term477.getClass(), "description", "");
        setField(term479, term479.getClass(), "name", null);
        setField(term479, term479.getClass(), "url", null);
        setField(term477, term477.getClass(), "language", term479);
        Object term480 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term480, term480.getClass(), "description", "");
        setField(term482, term482.getClass(), "name", null);
        setField(term482, term482.getClass(), "url", null);
        setField(term480, term480.getClass(), "language", term482);
        ArrayList term460 = new ArrayList();
        ((ArrayList) term460).add(term462);
        ((ArrayList) term460).add(term465);
        ((ArrayList) term460).add(term468);
        ((ArrayList) term460).add(term471);
        ((ArrayList) term460).add(term474);
        ((ArrayList) term460).add(term477);
        ((ArrayList) term460).add(term480);
        Object term487 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term489 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term487, term487.getClass(), "name", "");
        setField(term489, term489.getClass(), "name", null);
        setField(term489, term489.getClass(), "url", null);
        setField(term487, term487.getClass(), "language", term489);
        ArrayList term485 = new ArrayList();
        ((ArrayList) term485).add(term487);
        Integer term495 = new Integer(1585847225);
        Object term494 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term497 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term494, term494.getClass(), "entryNumber", term495);
        setField(term497, term497.getClass(), "name", null);
        setField(term497, term497.getClass(), "url", null);
        setField(term494, term494.getClass(), "pokemonSpecies", term497);
        Integer term499 = new Integer(597278769);
        Object term498 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term501 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term498, term498.getClass(), "entryNumber", term499);
        setField(term501, term501.getClass(), "name", null);
        setField(term501, term501.getClass(), "url", null);
        setField(term498, term498.getClass(), "pokemonSpecies", term501);
        Integer term503 = new Integer(-1685132342);
        Object term502 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term502, term502.getClass(), "entryNumber", term503);
        setField(term502, term502.getClass(), "pokemonSpecies", term489);
        Integer term506 = new Integer(-1456670397);
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term505, term505.getClass(), "entryNumber", term506);
        setField(term505, term505.getClass(), "pokemonSpecies", term497);
        Integer term509 = new Integer(1622346318);
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term508, term508.getClass(), "entryNumber", term509);
        setField(term508, term508.getClass(), "pokemonSpecies", term464);
        Integer term512 = new Integer(1048535127);
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term511, term511.getClass(), "entryNumber", term512);
        setField(term511, term511.getClass(), "pokemonSpecies", term479);
        ArrayList term492 = new ArrayList();
        ((ArrayList) term492).add(term494);
        ((ArrayList) term492).add(term498);
        ((ArrayList) term492).add(term502);
        ((ArrayList) term492).add(term505);
        ((ArrayList) term492).add(term508);
        ((ArrayList) term492).add(term511);
        ArrayList term516 = new ArrayList();
        term443 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term443, term443.getClass(), "id", term444);
        setField(term443, term443.getClass(), "name", "whBvTVIIlC");
        setField(term443, term443.getClass(), "isMainSeries", term458);
        setField(term443, term443.getClass(), "descriptions", term460);
        setField(term443, term443.getClass(), "names", term485);
        setField(term443, term443.getClass(), "pokemonEntries", term492);
        setField(term443, term443.getClass(), "region", term473);
        setField(term443, term443.getClass(), "versionGroups", term516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term443, args);
    }

};


