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

public class PokemonForm_getNames_212537865021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6325;

    public PokemonForm_getNames_212537865021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6326 = new Integer(-2095575670);
        Integer term6340 = new Integer(1225272962);
        Integer term6342 = new Integer(1324040357);
        Boolean term6344 = new Boolean(true);
        Boolean term6346 = new Boolean(true);
        Object term6461 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6463 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6461, term6461.getClass(), "name", "");
        setField(term6463, term6463.getClass(), "name", null);
        setField(term6463, term6463.getClass(), "url", null);
        setField(term6461, term6461.getClass(), "language", term6463);
        Object term6464 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6466 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6464, term6464.getClass(), "name", "");
        setField(term6466, term6466.getClass(), "name", null);
        setField(term6466, term6466.getClass(), "url", null);
        setField(term6464, term6464.getClass(), "language", term6466);
        Object term6467 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6469 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6467, term6467.getClass(), "name", "");
        setField(term6469, term6469.getClass(), "name", null);
        setField(term6469, term6469.getClass(), "url", null);
        setField(term6467, term6467.getClass(), "language", term6469);
        Object term6470 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6472 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6470, term6470.getClass(), "name", "");
        setField(term6472, term6472.getClass(), "name", null);
        setField(term6472, term6472.getClass(), "url", null);
        setField(term6470, term6470.getClass(), "language", term6472);
        ArrayList term6459 = new ArrayList();
        ((ArrayList) term6459).add(term6461);
        ((ArrayList) term6459).add(term6464);
        ((ArrayList) term6459).add(term6467);
        ((ArrayList) term6459).add(term6470);
        Object term6477 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6479 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6477, term6477.getClass(), "name", "");
        setField(term6479, term6479.getClass(), "name", null);
        setField(term6479, term6479.getClass(), "url", null);
        setField(term6477, term6477.getClass(), "language", term6479);
        Object term6480 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6482 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6480, term6480.getClass(), "name", "");
        setField(term6482, term6482.getClass(), "name", null);
        setField(term6482, term6482.getClass(), "url", null);
        setField(term6480, term6480.getClass(), "language", term6482);
        Object term6483 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6485 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6483, term6483.getClass(), "name", "");
        setField(term6485, term6485.getClass(), "name", null);
        setField(term6485, term6485.getClass(), "url", null);
        setField(term6483, term6483.getClass(), "language", term6485);
        Object term6486 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term6488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6486, term6486.getClass(), "name", "");
        setField(term6488, term6488.getClass(), "name", null);
        setField(term6488, term6488.getClass(), "url", null);
        setField(term6486, term6486.getClass(), "language", term6488);
        Object term6489 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term6489, term6489.getClass(), "name", "");
        setField(term6489, term6489.getClass(), "language", term6482);
        Object term6491 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term6491, term6491.getClass(), "name", "");
        setField(term6491, term6491.getClass(), "language", term6485);
        ArrayList term6475 = new ArrayList();
        ((ArrayList) term6475).add(term6477);
        ((ArrayList) term6475).add(term6480);
        ((ArrayList) term6475).add(term6483);
        ((ArrayList) term6475).add(term6486);
        ((ArrayList) term6475).add(term6489);
        ((ArrayList) term6475).add(term6491);
        ((ArrayList) term6475).add(term6461);
        ((ArrayList) term6475).add(term6480);
        term6325 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term6360 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6385 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term6434 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6325, term6325.getClass(), "id", term6326);
        setField(term6325, term6325.getClass(), "name", "POPYycoDBy");
        setField(term6325, term6325.getClass(), "order", term6340);
        setField(term6325, term6325.getClass(), "formOrder", term6342);
        setField(term6325, term6325.getClass(), "isDefault", term6344);
        setField(term6325, term6325.getClass(), "isBattleOnly", term6346);
        setField(term6325, term6325.getClass(), "formName", "LuWMOXdAPA");
        setField(term6360, term6360.getClass(), "name", "blSffTnsOv");
        setField(term6360, term6360.getClass(), "url", "qbUMcIvEXH");
        setField(term6325, term6325.getClass(), "pokemon", term6360);
        setField(term6385, term6385.getClass(), "frontDefault", "TVxGTjeDcu");
        setField(term6385, term6385.getClass(), "frontShiny", "ABPtcyCzkR");
        setField(term6385, term6385.getClass(), "backDefault", "QgHhxMyKvr");
        setField(term6385, term6385.getClass(), "backShiny", "VGiXZZTWRO");
        setField(term6325, term6325.getClass(), "sprites", term6385);
        setField(term6434, term6434.getClass(), "name", "MlPtwXnJOJ");
        setField(term6434, term6434.getClass(), "url", "DbfiyFeaTe");
        setField(term6325, term6325.getClass(), "versionGroup", term6434);
        setField(term6325, term6325.getClass(), "names", term6459);
        setField(term6325, term6325.getClass(), "formNames", term6475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term6325, args);
    }

};


