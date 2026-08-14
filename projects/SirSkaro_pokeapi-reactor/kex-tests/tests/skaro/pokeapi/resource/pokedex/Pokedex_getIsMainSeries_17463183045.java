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

public class Pokedex_getIsMainSeries_17463183045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628;

    public Pokedex_getIsMainSeries_17463183045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term629 = new Integer(-1007160944);
        Boolean term643 = new Boolean(true);
        ArrayList term645 = new ArrayList();
        Object term651 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term653 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term651, term651.getClass(), "name", "");
        setField(term653, term653.getClass(), "name", null);
        setField(term653, term653.getClass(), "url", null);
        setField(term651, term651.getClass(), "language", term653);
        Object term654 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term656 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term654, term654.getClass(), "name", "");
        setField(term656, term656.getClass(), "name", null);
        setField(term656, term656.getClass(), "url", null);
        setField(term654, term654.getClass(), "language", term656);
        ArrayList term649 = new ArrayList();
        ((ArrayList) term649).add(term651);
        ((ArrayList) term649).add(term654);
        Integer term662 = new Integer(1135664017);
        Object term661 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term664 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term661, term661.getClass(), "entryNumber", term662);
        setField(term664, term664.getClass(), "name", null);
        setField(term664, term664.getClass(), "url", null);
        setField(term661, term661.getClass(), "pokemonSpecies", term664);
        Integer term666 = new Integer(590364439);
        Object term665 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term668 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term665, term665.getClass(), "entryNumber", term666);
        setField(term668, term668.getClass(), "name", null);
        setField(term668, term668.getClass(), "url", null);
        setField(term665, term665.getClass(), "pokemonSpecies", term668);
        Integer term670 = new Integer(865208305);
        Object term669 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term672 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term669, term669.getClass(), "entryNumber", term670);
        setField(term672, term672.getClass(), "name", null);
        setField(term672, term672.getClass(), "url", null);
        setField(term669, term669.getClass(), "pokemonSpecies", term672);
        Integer term674 = new Integer(-1275173084);
        Object term673 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term676 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term673, term673.getClass(), "entryNumber", term674);
        setField(term676, term676.getClass(), "name", null);
        setField(term676, term676.getClass(), "url", null);
        setField(term673, term673.getClass(), "pokemonSpecies", term676);
        Integer term678 = new Integer(-244121226);
        Object term677 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term680 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term677, term677.getClass(), "entryNumber", term678);
        setField(term680, term680.getClass(), "name", null);
        setField(term680, term680.getClass(), "url", null);
        setField(term677, term677.getClass(), "pokemonSpecies", term680);
        Integer term682 = new Integer(-203030934);
        Object term681 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term684 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term681, term681.getClass(), "entryNumber", term682);
        setField(term684, term684.getClass(), "name", null);
        setField(term684, term684.getClass(), "url", null);
        setField(term681, term681.getClass(), "pokemonSpecies", term684);
        Integer term686 = new Integer(-1179120542);
        Object term685 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term688 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term685, term685.getClass(), "entryNumber", term686);
        setField(term688, term688.getClass(), "name", null);
        setField(term688, term688.getClass(), "url", null);
        setField(term685, term685.getClass(), "pokemonSpecies", term688);
        Integer term690 = new Integer(-73683645);
        Object term689 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term692 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term689, term689.getClass(), "entryNumber", term690);
        setField(term692, term692.getClass(), "name", null);
        setField(term692, term692.getClass(), "url", null);
        setField(term689, term689.getClass(), "pokemonSpecies", term692);
        ArrayList term659 = new ArrayList();
        ((ArrayList) term659).add(term661);
        ((ArrayList) term659).add(term665);
        ((ArrayList) term659).add(term669);
        ((ArrayList) term659).add(term673);
        ((ArrayList) term659).add(term677);
        ((ArrayList) term659).add(term681);
        ((ArrayList) term659).add(term685);
        ((ArrayList) term659).add(term689);
        ArrayList term695 = new ArrayList();
        term628 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term628, term628.getClass(), "id", term629);
        setField(term628, term628.getClass(), "name", "xIeFjkHkOe");
        setField(term628, term628.getClass(), "isMainSeries", term643);
        setField(term628, term628.getClass(), "descriptions", term645);
        setField(term628, term628.getClass(), "names", term649);
        setField(term628, term628.getClass(), "pokemonEntries", term659);
        setField(term628, term628.getClass(), "region", term684);
        setField(term628, term628.getClass(), "versionGroups", term695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsMainSeries", argTypes, term628, args);
    }

};


