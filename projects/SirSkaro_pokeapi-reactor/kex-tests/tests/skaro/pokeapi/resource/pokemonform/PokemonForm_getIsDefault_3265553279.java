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

public class PokemonForm_getIsDefault_3265553279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2950;

    public PokemonForm_getIsDefault_3265553279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2951 = new Integer(865208305);
        Integer term2965 = new Integer(-1275173084);
        Integer term2967 = new Integer(-244121226);
        Boolean term2969 = new Boolean(true);
        Boolean term2971 = new Boolean(true);
        ArrayList term3084 = new ArrayList();
        Object term3090 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3092 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3090, term3090.getClass(), "name", "");
        setField(term3092, term3092.getClass(), "name", null);
        setField(term3092, term3092.getClass(), "url", null);
        setField(term3090, term3090.getClass(), "language", term3092);
        Object term3093 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term3095 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3093, term3093.getClass(), "name", "");
        setField(term3095, term3095.getClass(), "name", null);
        setField(term3095, term3095.getClass(), "url", null);
        setField(term3093, term3093.getClass(), "language", term3095);
        ArrayList term3088 = new ArrayList();
        ((ArrayList) term3088).add(term3090);
        ((ArrayList) term3088).add(term3093);
        term2950 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term2985 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3010 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term3059 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2950, term2950.getClass(), "id", term2951);
        setField(term2950, term2950.getClass(), "name", "urCiQnUFBM");
        setField(term2950, term2950.getClass(), "order", term2965);
        setField(term2950, term2950.getClass(), "formOrder", term2967);
        setField(term2950, term2950.getClass(), "isDefault", term2969);
        setField(term2950, term2950.getClass(), "isBattleOnly", term2971);
        setField(term2950, term2950.getClass(), "formName", "EKjQdtKxAM");
        setField(term2985, term2985.getClass(), "name", "TXZAIPQJHt");
        setField(term2985, term2985.getClass(), "url", "DIbeDHICho");
        setField(term2950, term2950.getClass(), "pokemon", term2985);
        setField(term3010, term3010.getClass(), "frontDefault", "dJGPlmSRnz");
        setField(term3010, term3010.getClass(), "frontShiny", "DPskuFUobI");
        setField(term3010, term3010.getClass(), "backDefault", "wBGfLpNNiZ");
        setField(term3010, term3010.getClass(), "backShiny", "yUGCjlqgJE");
        setField(term2950, term2950.getClass(), "sprites", term3010);
        setField(term3059, term3059.getClass(), "name", "PXdVZyoJyC");
        setField(term3059, term3059.getClass(), "url", "vLerpqavFM");
        setField(term2950, term2950.getClass(), "versionGroup", term3059);
        setField(term2950, term2950.getClass(), "names", term3084);
        setField(term2950, term2950.getClass(), "formNames", term3088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIsDefault", argTypes, term2950, args);
    }

};


