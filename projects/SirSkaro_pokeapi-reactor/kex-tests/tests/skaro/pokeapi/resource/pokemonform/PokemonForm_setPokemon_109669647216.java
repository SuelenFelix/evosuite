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

public class PokemonForm_setPokemon_109669647216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4819;
     Object term4989;

    public PokemonForm_setPokemon_109669647216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4820 = new Integer(579005622);
        Integer term4834 = new Integer(-14890619);
        Integer term4836 = new Integer(1632125673);
        Boolean term4838 = new Boolean(true);
        Boolean term4840 = new Boolean(true);
        Object term4955 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4957 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4955, term4955.getClass(), "name", "");
        setField(term4957, term4957.getClass(), "name", null);
        setField(term4957, term4957.getClass(), "url", null);
        setField(term4955, term4955.getClass(), "language", term4957);
        Object term4958 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4960 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4958, term4958.getClass(), "name", "");
        setField(term4960, term4960.getClass(), "name", null);
        setField(term4960, term4960.getClass(), "url", null);
        setField(term4958, term4958.getClass(), "language", term4960);
        Object term4961 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4963 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4961, term4961.getClass(), "name", "");
        setField(term4963, term4963.getClass(), "name", null);
        setField(term4963, term4963.getClass(), "url", null);
        setField(term4961, term4961.getClass(), "language", term4963);
        Object term4964 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4966 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4964, term4964.getClass(), "name", "");
        setField(term4966, term4966.getClass(), "name", null);
        setField(term4966, term4966.getClass(), "url", null);
        setField(term4964, term4964.getClass(), "language", term4966);
        Object term4967 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4969 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4967, term4967.getClass(), "name", "");
        setField(term4969, term4969.getClass(), "name", null);
        setField(term4969, term4969.getClass(), "url", null);
        setField(term4967, term4967.getClass(), "language", term4969);
        Object term4970 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4972 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4970, term4970.getClass(), "name", "");
        setField(term4972, term4972.getClass(), "name", null);
        setField(term4972, term4972.getClass(), "url", null);
        setField(term4970, term4970.getClass(), "language", term4972);
        ArrayList term4953 = new ArrayList();
        ((ArrayList) term4953).add(term4955);
        ((ArrayList) term4953).add(term4958);
        ((ArrayList) term4953).add(term4961);
        ((ArrayList) term4953).add(term4964);
        ((ArrayList) term4953).add(term4967);
        ((ArrayList) term4953).add(term4970);
        Object term4977 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4979 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4977, term4977.getClass(), "name", "");
        setField(term4979, term4979.getClass(), "name", null);
        setField(term4979, term4979.getClass(), "url", null);
        setField(term4977, term4977.getClass(), "language", term4979);
        Object term4980 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term4982 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4980, term4980.getClass(), "name", "");
        setField(term4982, term4982.getClass(), "name", null);
        setField(term4982, term4982.getClass(), "url", null);
        setField(term4980, term4980.getClass(), "language", term4982);
        Object term4983 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term4983, term4983.getClass(), "name", "");
        setField(term4983, term4983.getClass(), "language", term4972);
        Object term4985 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term4985, term4985.getClass(), "name", "");
        setField(term4985, term4985.getClass(), "language", term4979);
        ArrayList term4975 = new ArrayList();
        ((ArrayList) term4975).add(term4977);
        ((ArrayList) term4975).add(term4980);
        ((ArrayList) term4975).add(term4983);
        ((ArrayList) term4975).add(term4985);
        ((ArrayList) term4975).add(term4955);
        ((ArrayList) term4975).add(term4970);
        term4819 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term4854 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4879 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term4928 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4819, term4819.getClass(), "id", term4820);
        setField(term4819, term4819.getClass(), "name", "OirVUQhauU");
        setField(term4819, term4819.getClass(), "order", term4834);
        setField(term4819, term4819.getClass(), "formOrder", term4836);
        setField(term4819, term4819.getClass(), "isDefault", term4838);
        setField(term4819, term4819.getClass(), "isBattleOnly", term4840);
        setField(term4819, term4819.getClass(), "formName", "GLbyDfbNZI");
        setField(term4854, term4854.getClass(), "name", "oNLcCYDAsO");
        setField(term4854, term4854.getClass(), "url", "CNqMxLvtcJ");
        setField(term4819, term4819.getClass(), "pokemon", term4854);
        setField(term4879, term4879.getClass(), "frontDefault", "ktbqerIaKW");
        setField(term4879, term4879.getClass(), "frontShiny", "VoghngXfsK");
        setField(term4879, term4879.getClass(), "backDefault", "GbahCBMvct");
        setField(term4879, term4879.getClass(), "backShiny", "iiHBhsNFgk");
        setField(term4819, term4819.getClass(), "sprites", term4879);
        setField(term4928, term4928.getClass(), "name", "HknsTajwxJ");
        setField(term4928, term4928.getClass(), "url", "XtiurrVYKw");
        setField(term4819, term4819.getClass(), "versionGroup", term4928);
        setField(term4819, term4819.getClass(), "names", term4953);
        setField(term4819, term4819.getClass(), "formNames", term4975);
        term4989 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4989, term4989.getClass(), "name", "TcuXODkzBV");
        setField(term4989, term4989.getClass(), "url", "coJPjrBZNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4989;
        callMethod(klass, "setPokemon", argTypes, term4819, args);
    }

};


