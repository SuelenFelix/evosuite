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

public class Pokedex_setIsMainSeries_3959458626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;
     Object term785;

    public Pokedex_setIsMainSeries_3959458626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term710 = new Integer(-226514366);
        Boolean term724 = new Boolean(true);
        Object term728 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term730 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term728, term728.getClass(), "description", "");
        setField(term730, term730.getClass(), "name", null);
        setField(term730, term730.getClass(), "url", null);
        setField(term728, term728.getClass(), "language", term730);
        Object term731 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term733 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term731, term731.getClass(), "description", "");
        setField(term733, term733.getClass(), "name", null);
        setField(term733, term733.getClass(), "url", null);
        setField(term731, term731.getClass(), "language", term733);
        ArrayList term726 = new ArrayList();
        ((ArrayList) term726).add(term728);
        ((ArrayList) term726).add(term731);
        Object term738 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term740 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term738, term738.getClass(), "name", "");
        setField(term740, term740.getClass(), "name", null);
        setField(term740, term740.getClass(), "url", null);
        setField(term738, term738.getClass(), "language", term740);
        ArrayList term736 = new ArrayList();
        ((ArrayList) term736).add(term738);
        Integer term746 = new Integer(1193880199);
        Object term745 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term748 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term745, term745.getClass(), "entryNumber", term746);
        setField(term748, term748.getClass(), "name", null);
        setField(term748, term748.getClass(), "url", null);
        setField(term745, term745.getClass(), "pokemonSpecies", term748);
        Integer term750 = new Integer(-1087774327);
        Object term749 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term752 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term749, term749.getClass(), "entryNumber", term750);
        setField(term752, term752.getClass(), "name", null);
        setField(term752, term752.getClass(), "url", null);
        setField(term749, term749.getClass(), "pokemonSpecies", term752);
        Integer term754 = new Integer(-1530420153);
        Object term753 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term756 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term753, term753.getClass(), "entryNumber", term754);
        setField(term756, term756.getClass(), "name", null);
        setField(term756, term756.getClass(), "url", null);
        setField(term753, term753.getClass(), "pokemonSpecies", term756);
        Integer term758 = new Integer(-469968304);
        Object term757 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term760 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term757, term757.getClass(), "entryNumber", term758);
        setField(term760, term760.getClass(), "name", null);
        setField(term760, term760.getClass(), "url", null);
        setField(term757, term757.getClass(), "pokemonSpecies", term760);
        Integer term762 = new Integer(-1145578966);
        Object term761 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term764 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term761, term761.getClass(), "entryNumber", term762);
        setField(term764, term764.getClass(), "name", null);
        setField(term764, term764.getClass(), "url", null);
        setField(term761, term761.getClass(), "pokemonSpecies", term764);
        Integer term766 = new Integer(679763016);
        Object term765 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term768 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term765, term765.getClass(), "entryNumber", term766);
        setField(term768, term768.getClass(), "name", null);
        setField(term768, term768.getClass(), "url", null);
        setField(term765, term765.getClass(), "pokemonSpecies", term768);
        Integer term770 = new Integer(1962444399);
        Object term769 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term772 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term769, term769.getClass(), "entryNumber", term770);
        setField(term772, term772.getClass(), "name", null);
        setField(term772, term772.getClass(), "url", null);
        setField(term769, term769.getClass(), "pokemonSpecies", term772);
        Integer term774 = new Integer(767834723);
        Object term773 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term773, term773.getClass(), "entryNumber", term774);
        setField(term773, term773.getClass(), "pokemonSpecies", term764);
        Integer term777 = new Integer(-602026508);
        Object term776 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term776, term776.getClass(), "entryNumber", term777);
        setField(term776, term776.getClass(), "pokemonSpecies", term768);
        ArrayList term743 = new ArrayList();
        ((ArrayList) term743).add(term745);
        ((ArrayList) term743).add(term749);
        ((ArrayList) term743).add(term753);
        ((ArrayList) term743).add(term757);
        ((ArrayList) term743).add(term761);
        ((ArrayList) term743).add(term765);
        ((ArrayList) term743).add(term769);
        ((ArrayList) term743).add(term773);
        ((ArrayList) term743).add(term776);
        ArrayList term781 = new ArrayList();
        term709 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term709, term709.getClass(), "id", term710);
        setField(term709, term709.getClass(), "name", "ZfdXfCCFDf");
        setField(term709, term709.getClass(), "isMainSeries", term724);
        setField(term709, term709.getClass(), "descriptions", term726);
        setField(term709, term709.getClass(), "names", term736);
        setField(term709, term709.getClass(), "pokemonEntries", term743);
        setField(term709, term709.getClass(), "region", term730);
        setField(term709, term709.getClass(), "versionGroups", term781);
        term785 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term785;
        callMethod(klass, "setIsMainSeries", argTypes, term709, args);
    }

};


