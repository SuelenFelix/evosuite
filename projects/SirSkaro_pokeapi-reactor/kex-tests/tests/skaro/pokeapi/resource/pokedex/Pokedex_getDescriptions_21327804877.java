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

public class Pokedex_getDescriptions_21327804877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term797;

    public Pokedex_getDescriptions_21327804877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term798 = new Integer(-157887805);
        Boolean term812 = new Boolean(true);
        Object term816 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term818 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term816, term816.getClass(), "description", "");
        setField(term818, term818.getClass(), "name", null);
        setField(term818, term818.getClass(), "url", null);
        setField(term816, term816.getClass(), "language", term818);
        Object term819 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term821 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term819, term819.getClass(), "description", "");
        setField(term821, term821.getClass(), "name", null);
        setField(term821, term821.getClass(), "url", null);
        setField(term819, term819.getClass(), "language", term821);
        Object term822 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term824 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term822, term822.getClass(), "description", "");
        setField(term824, term824.getClass(), "name", null);
        setField(term824, term824.getClass(), "url", null);
        setField(term822, term822.getClass(), "language", term824);
        Object term825 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term827 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term825, term825.getClass(), "description", "");
        setField(term827, term827.getClass(), "name", null);
        setField(term827, term827.getClass(), "url", null);
        setField(term825, term825.getClass(), "language", term827);
        Object term828 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term830 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term828, term828.getClass(), "description", "");
        setField(term830, term830.getClass(), "name", null);
        setField(term830, term830.getClass(), "url", null);
        setField(term828, term828.getClass(), "language", term830);
        ArrayList term814 = new ArrayList();
        ((ArrayList) term814).add(term816);
        ((ArrayList) term814).add(term819);
        ((ArrayList) term814).add(term822);
        ((ArrayList) term814).add(term825);
        ((ArrayList) term814).add(term828);
        Object term835 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term837 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term835, term835.getClass(), "name", "");
        setField(term837, term837.getClass(), "name", null);
        setField(term837, term837.getClass(), "url", null);
        setField(term835, term835.getClass(), "language", term837);
        Object term838 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term840 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term838, term838.getClass(), "name", "");
        setField(term840, term840.getClass(), "name", null);
        setField(term840, term840.getClass(), "url", null);
        setField(term838, term838.getClass(), "language", term840);
        Object term841 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term843 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term841, term841.getClass(), "name", "");
        setField(term843, term843.getClass(), "name", null);
        setField(term843, term843.getClass(), "url", null);
        setField(term841, term841.getClass(), "language", term843);
        Object term844 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term846 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term844, term844.getClass(), "name", "");
        setField(term846, term846.getClass(), "name", null);
        setField(term846, term846.getClass(), "url", null);
        setField(term844, term844.getClass(), "language", term846);
        Object term847 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term849 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term847, term847.getClass(), "name", "");
        setField(term849, term849.getClass(), "name", null);
        setField(term849, term849.getClass(), "url", null);
        setField(term847, term847.getClass(), "language", term849);
        Object term850 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term850, term850.getClass(), "name", "");
        setField(term850, term850.getClass(), "language", term843);
        ArrayList term833 = new ArrayList();
        ((ArrayList) term833).add(term835);
        ((ArrayList) term833).add(term838);
        ((ArrayList) term833).add(term841);
        ((ArrayList) term833).add(term844);
        ((ArrayList) term833).add(term847);
        ((ArrayList) term833).add(term850);
        Integer term857 = new Integer(1876565163);
        Object term856 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term856, term856.getClass(), "entryNumber", term857);
        setField(term856, term856.getClass(), "pokemonSpecies", term846);
        Integer term860 = new Integer(-817164822);
        Object term859 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term859, term859.getClass(), "entryNumber", term860);
        setField(term859, term859.getClass(), "pokemonSpecies", term818);
        Integer term863 = new Integer(-1016503459);
        Object term862 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term862, term862.getClass(), "entryNumber", term863);
        setField(term862, term862.getClass(), "pokemonSpecies", term837);
        Integer term866 = new Integer(-1968847291);
        Object term865 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term865, term865.getClass(), "entryNumber", term866);
        setField(term865, term865.getClass(), "pokemonSpecies", term827);
        Integer term869 = new Integer(579005622);
        Object term868 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term868, term868.getClass(), "entryNumber", term869);
        setField(term868, term868.getClass(), "pokemonSpecies", term821);
        ArrayList term854 = new ArrayList();
        ((ArrayList) term854).add(term856);
        ((ArrayList) term854).add(term859);
        ((ArrayList) term854).add(term862);
        ((ArrayList) term854).add(term865);
        ((ArrayList) term854).add(term868);
        ArrayList term873 = new ArrayList();
        term797 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term797, term797.getClass(), "id", term798);
        setField(term797, term797.getClass(), "name", "cudZvLMQon");
        setField(term797, term797.getClass(), "isMainSeries", term812);
        setField(term797, term797.getClass(), "descriptions", term814);
        setField(term797, term797.getClass(), "names", term833);
        setField(term797, term797.getClass(), "pokemonEntries", term854);
        setField(term797, term797.getClass(), "region", term821);
        setField(term797, term797.getClass(), "versionGroups", term873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptions", argTypes, term797, args);
    }

};


