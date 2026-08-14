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

public class PokemonForm_getVersionGroup_49662665619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5752;

    public PokemonForm_getVersionGroup_49662665619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5753 = new Integer(-184153539);
        Integer term5767 = new Integer(493620644);
        Integer term5769 = new Integer(1328271830);
        Boolean term5771 = new Boolean(true);
        Boolean term5773 = new Boolean(false);
        Object term5888 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5890 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5888, term5888.getClass(), "name", "");
        setField(term5890, term5890.getClass(), "name", null);
        setField(term5890, term5890.getClass(), "url", null);
        setField(term5888, term5888.getClass(), "language", term5890);
        Object term5891 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5893 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5891, term5891.getClass(), "name", "");
        setField(term5893, term5893.getClass(), "name", null);
        setField(term5893, term5893.getClass(), "url", null);
        setField(term5891, term5891.getClass(), "language", term5893);
        Object term5894 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5896 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5894, term5894.getClass(), "name", "");
        setField(term5896, term5896.getClass(), "name", null);
        setField(term5896, term5896.getClass(), "url", null);
        setField(term5894, term5894.getClass(), "language", term5896);
        Object term5897 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5899 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5897, term5897.getClass(), "name", "");
        setField(term5899, term5899.getClass(), "name", null);
        setField(term5899, term5899.getClass(), "url", null);
        setField(term5897, term5897.getClass(), "language", term5899);
        Object term5900 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5902 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5900, term5900.getClass(), "name", "");
        setField(term5902, term5902.getClass(), "name", null);
        setField(term5902, term5902.getClass(), "url", null);
        setField(term5900, term5900.getClass(), "language", term5902);
        ArrayList term5886 = new ArrayList();
        ((ArrayList) term5886).add(term5888);
        ((ArrayList) term5886).add(term5891);
        ((ArrayList) term5886).add(term5894);
        ((ArrayList) term5886).add(term5897);
        ((ArrayList) term5886).add(term5900);
        Object term5907 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5909 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5907, term5907.getClass(), "name", "");
        setField(term5909, term5909.getClass(), "name", null);
        setField(term5909, term5909.getClass(), "url", null);
        setField(term5907, term5907.getClass(), "language", term5909);
        ArrayList term5905 = new ArrayList();
        ((ArrayList) term5905).add(term5907);
        term5752 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term5787 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5812 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term5861 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5752, term5752.getClass(), "id", term5753);
        setField(term5752, term5752.getClass(), "name", "DcOhhAfJTI");
        setField(term5752, term5752.getClass(), "order", term5767);
        setField(term5752, term5752.getClass(), "formOrder", term5769);
        setField(term5752, term5752.getClass(), "isDefault", term5771);
        setField(term5752, term5752.getClass(), "isBattleOnly", term5773);
        setField(term5752, term5752.getClass(), "formName", "gYTIkBFOoS");
        setField(term5787, term5787.getClass(), "name", "xmzSoVgiED");
        setField(term5787, term5787.getClass(), "url", "pdSvedKgPq");
        setField(term5752, term5752.getClass(), "pokemon", term5787);
        setField(term5812, term5812.getClass(), "frontDefault", "epPTwvcoyb");
        setField(term5812, term5812.getClass(), "frontShiny", "UBPHmOICBs");
        setField(term5812, term5812.getClass(), "backDefault", "IDJUVPgUJf");
        setField(term5812, term5812.getClass(), "backShiny", "JmnWRJUxGr");
        setField(term5752, term5752.getClass(), "sprites", term5812);
        setField(term5861, term5861.getClass(), "name", "wgRGBNrTGP");
        setField(term5861, term5861.getClass(), "url", "FIdNVptZpW");
        setField(term5752, term5752.getClass(), "versionGroup", term5861);
        setField(term5752, term5752.getClass(), "names", term5886);
        setField(term5752, term5752.getClass(), "formNames", term5905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term5752, args);
    }

};


