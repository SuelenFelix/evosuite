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

public class PokemonForm_setFormOrder_19515794908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;
     Object term2848;

    public PokemonForm_setFormOrder_19515794908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2695 = new Integer(-117576464);
        Integer term2709 = new Integer(-1007160944);
        Integer term2711 = new Integer(1135664017);
        Boolean term2713 = new Boolean(false);
        Boolean term2715 = new Boolean(false);
        Object term2830 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2832 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2830, term2830.getClass(), "name", "");
        setField(term2832, term2832.getClass(), "name", null);
        setField(term2832, term2832.getClass(), "url", null);
        setField(term2830, term2830.getClass(), "language", term2832);
        Object term2833 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2835 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2833, term2833.getClass(), "name", "");
        setField(term2835, term2835.getClass(), "name", null);
        setField(term2835, term2835.getClass(), "url", null);
        setField(term2833, term2833.getClass(), "language", term2835);
        Object term2836 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2838 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2836, term2836.getClass(), "name", "");
        setField(term2838, term2838.getClass(), "name", null);
        setField(term2838, term2838.getClass(), "url", null);
        setField(term2836, term2836.getClass(), "language", term2838);
        ArrayList term2828 = new ArrayList();
        ((ArrayList) term2828).add(term2830);
        ((ArrayList) term2828).add(term2833);
        ((ArrayList) term2828).add(term2836);
        Object term2843 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2845 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2843, term2843.getClass(), "name", "");
        setField(term2845, term2845.getClass(), "name", null);
        setField(term2845, term2845.getClass(), "url", null);
        setField(term2843, term2843.getClass(), "language", term2845);
        ArrayList term2841 = new ArrayList();
        ((ArrayList) term2841).add(term2843);
        term2694 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term2729 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2754 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term2803 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2694, term2694.getClass(), "id", term2695);
        setField(term2694, term2694.getClass(), "name", "jDmhBrIoDa");
        setField(term2694, term2694.getClass(), "order", term2709);
        setField(term2694, term2694.getClass(), "formOrder", term2711);
        setField(term2694, term2694.getClass(), "isDefault", term2713);
        setField(term2694, term2694.getClass(), "isBattleOnly", term2715);
        setField(term2694, term2694.getClass(), "formName", "SPtPatHeOm");
        setField(term2729, term2729.getClass(), "name", "ywmcuThdfL");
        setField(term2729, term2729.getClass(), "url", "GBOEuByOfr");
        setField(term2694, term2694.getClass(), "pokemon", term2729);
        setField(term2754, term2754.getClass(), "frontDefault", "NHbOFFjyVK");
        setField(term2754, term2754.getClass(), "frontShiny", "zaloBqlrSo");
        setField(term2754, term2754.getClass(), "backDefault", "vvoLrMGCoN");
        setField(term2754, term2754.getClass(), "backShiny", "pXdglvyrQe");
        setField(term2694, term2694.getClass(), "sprites", term2754);
        setField(term2803, term2803.getClass(), "name", "OcfNzHYdki");
        setField(term2803, term2803.getClass(), "url", "uPuCVuZYOI");
        setField(term2694, term2694.getClass(), "versionGroup", term2803);
        setField(term2694, term2694.getClass(), "names", term2828);
        setField(term2694, term2694.getClass(), "formNames", term2841);
        term2848 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term2848;
        callMethod(klass, "setFormOrder", argTypes, term2694, args);
    }

};


