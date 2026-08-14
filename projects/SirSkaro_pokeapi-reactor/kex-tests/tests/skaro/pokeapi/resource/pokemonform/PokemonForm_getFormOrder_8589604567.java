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

public class PokemonForm_getFormOrder_8589604567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2431;

    public PokemonForm_getFormOrder_8589604567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2432 = new Integer(-655067527);
        Integer term2446 = new Integer(-6029667);
        Integer term2448 = new Integer(-2068769794);
        Boolean term2450 = new Boolean(false);
        Boolean term2452 = new Boolean(true);
        Object term2567 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2569 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2567, term2567.getClass(), "name", "");
        setField(term2569, term2569.getClass(), "name", null);
        setField(term2569, term2569.getClass(), "url", null);
        setField(term2567, term2567.getClass(), "language", term2569);
        Object term2570 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2572 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2570, term2570.getClass(), "name", "");
        setField(term2572, term2572.getClass(), "name", null);
        setField(term2572, term2572.getClass(), "url", null);
        setField(term2570, term2570.getClass(), "language", term2572);
        Object term2573 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2575 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2573, term2573.getClass(), "name", "");
        setField(term2575, term2575.getClass(), "name", null);
        setField(term2575, term2575.getClass(), "url", null);
        setField(term2573, term2573.getClass(), "language", term2575);
        Object term2576 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2578 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2576, term2576.getClass(), "name", "");
        setField(term2578, term2578.getClass(), "name", null);
        setField(term2578, term2578.getClass(), "url", null);
        setField(term2576, term2576.getClass(), "language", term2578);
        Object term2579 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2581 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2579, term2579.getClass(), "name", "");
        setField(term2581, term2581.getClass(), "name", null);
        setField(term2581, term2581.getClass(), "url", null);
        setField(term2579, term2579.getClass(), "language", term2581);
        ArrayList term2565 = new ArrayList();
        ((ArrayList) term2565).add(term2567);
        ((ArrayList) term2565).add(term2570);
        ((ArrayList) term2565).add(term2573);
        ((ArrayList) term2565).add(term2576);
        ((ArrayList) term2565).add(term2579);
        Object term2586 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2588 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2586, term2586.getClass(), "name", "");
        setField(term2588, term2588.getClass(), "name", null);
        setField(term2588, term2588.getClass(), "url", null);
        setField(term2586, term2586.getClass(), "language", term2588);
        Object term2589 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2591 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2589, term2589.getClass(), "name", "");
        setField(term2591, term2591.getClass(), "name", null);
        setField(term2591, term2591.getClass(), "url", null);
        setField(term2589, term2589.getClass(), "language", term2591);
        ArrayList term2584 = new ArrayList();
        ((ArrayList) term2584).add(term2586);
        ((ArrayList) term2584).add(term2589);
        term2431 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term2466 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2491 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term2540 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2431, term2431.getClass(), "id", term2432);
        setField(term2431, term2431.getClass(), "name", "IpQuOGMgmj");
        setField(term2431, term2431.getClass(), "order", term2446);
        setField(term2431, term2431.getClass(), "formOrder", term2448);
        setField(term2431, term2431.getClass(), "isDefault", term2450);
        setField(term2431, term2431.getClass(), "isBattleOnly", term2452);
        setField(term2431, term2431.getClass(), "formName", "pJbnHTYrxn");
        setField(term2466, term2466.getClass(), "name", "iIRsCSYqXH");
        setField(term2466, term2466.getClass(), "url", "nghfqDXyCG");
        setField(term2431, term2431.getClass(), "pokemon", term2466);
        setField(term2491, term2491.getClass(), "frontDefault", "WBAOTqErtm");
        setField(term2491, term2491.getClass(), "frontShiny", "PqtVXXZMqK");
        setField(term2491, term2491.getClass(), "backDefault", "rYbtIDVdnd");
        setField(term2491, term2491.getClass(), "backShiny", "UKAReurpHG");
        setField(term2431, term2431.getClass(), "sprites", term2491);
        setField(term2540, term2540.getClass(), "name", "WVRMUmrljA");
        setField(term2540, term2540.getClass(), "url", "NTlKJDDWlk");
        setField(term2431, term2431.getClass(), "versionGroup", term2540);
        setField(term2431, term2431.getClass(), "names", term2565);
        setField(term2431, term2431.getClass(), "formNames", term2584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormOrder", argTypes, term2431, args);
    }

};


