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

public class PokemonForm_getFormNames_2928487423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6898;

    public PokemonForm_getFormNames_2928487423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6899 = new Integer(933028652);
        Integer term6913 = new Integer(287287233);
        Integer term6915 = new Integer(962840079);
        Boolean term6917 = new Boolean(true);
        Boolean term6919 = new Boolean(true);
        Object term7034 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7036 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7034, term7034.getClass(), "name", "");
        setField(term7036, term7036.getClass(), "name", null);
        setField(term7036, term7036.getClass(), "url", null);
        setField(term7034, term7034.getClass(), "language", term7036);
        Object term7037 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7039 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7037, term7037.getClass(), "name", "");
        setField(term7039, term7039.getClass(), "name", null);
        setField(term7039, term7039.getClass(), "url", null);
        setField(term7037, term7037.getClass(), "language", term7039);
        Object term7040 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7042 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7040, term7040.getClass(), "name", "");
        setField(term7042, term7042.getClass(), "name", null);
        setField(term7042, term7042.getClass(), "url", null);
        setField(term7040, term7040.getClass(), "language", term7042);
        Object term7043 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7045 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7043, term7043.getClass(), "name", "");
        setField(term7045, term7045.getClass(), "name", null);
        setField(term7045, term7045.getClass(), "url", null);
        setField(term7043, term7043.getClass(), "language", term7045);
        ArrayList term7032 = new ArrayList();
        ((ArrayList) term7032).add(term7034);
        ((ArrayList) term7032).add(term7037);
        ((ArrayList) term7032).add(term7040);
        ((ArrayList) term7032).add(term7043);
        ArrayList term7048 = new ArrayList();
        term6898 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term6933 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6958 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term7007 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6898, term6898.getClass(), "id", term6899);
        setField(term6898, term6898.getClass(), "name", "qGkNzZAeDN");
        setField(term6898, term6898.getClass(), "order", term6913);
        setField(term6898, term6898.getClass(), "formOrder", term6915);
        setField(term6898, term6898.getClass(), "isDefault", term6917);
        setField(term6898, term6898.getClass(), "isBattleOnly", term6919);
        setField(term6898, term6898.getClass(), "formName", "wdtiuPgTVJ");
        setField(term6933, term6933.getClass(), "name", "HUgzMgrpsK");
        setField(term6933, term6933.getClass(), "url", "ubaBUfLolu");
        setField(term6898, term6898.getClass(), "pokemon", term6933);
        setField(term6958, term6958.getClass(), "frontDefault", "itAUCFhZhq");
        setField(term6958, term6958.getClass(), "frontShiny", "bIqaKgXgPm");
        setField(term6958, term6958.getClass(), "backDefault", "uOJFOUcNvv");
        setField(term6958, term6958.getClass(), "backShiny", "tkmmGweDwJ");
        setField(term6898, term6898.getClass(), "sprites", term6958);
        setField(term7007, term7007.getClass(), "name", "pMfTuAFXxg");
        setField(term7007, term7007.getClass(), "url", "XCZmhkblRc");
        setField(term6898, term6898.getClass(), "versionGroup", term7007);
        setField(term6898, term6898.getClass(), "names", term7032);
        setField(term6898, term6898.getClass(), "formNames", term7048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormNames", argTypes, term6898, args);
    }

};


