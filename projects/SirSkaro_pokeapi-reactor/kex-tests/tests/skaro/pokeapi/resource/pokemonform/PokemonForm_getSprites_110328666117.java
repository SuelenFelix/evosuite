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

public class PokemonForm_getSprites_110328666117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5134;

    public PokemonForm_getSprites_110328666117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5135 = new Integer(454281060);
        Integer term5149 = new Integer(-1786399638);
        Integer term5151 = new Integer(2055867847);
        Boolean term5153 = new Boolean(false);
        Boolean term5155 = new Boolean(true);
        Object term5270 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5270, term5270.getClass(), "name", "");
        setField(term5272, term5272.getClass(), "name", null);
        setField(term5272, term5272.getClass(), "url", null);
        setField(term5270, term5270.getClass(), "language", term5272);
        Object term5273 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5275 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5273, term5273.getClass(), "name", "");
        setField(term5275, term5275.getClass(), "name", null);
        setField(term5275, term5275.getClass(), "url", null);
        setField(term5273, term5273.getClass(), "language", term5275);
        ArrayList term5268 = new ArrayList();
        ((ArrayList) term5268).add(term5270);
        ((ArrayList) term5268).add(term5273);
        Object term5280 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5280, term5280.getClass(), "name", "");
        setField(term5282, term5282.getClass(), "name", null);
        setField(term5282, term5282.getClass(), "url", null);
        setField(term5280, term5280.getClass(), "language", term5282);
        Object term5283 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5283, term5283.getClass(), "name", "");
        setField(term5285, term5285.getClass(), "name", null);
        setField(term5285, term5285.getClass(), "url", null);
        setField(term5283, term5283.getClass(), "language", term5285);
        Object term5286 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5288 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5286, term5286.getClass(), "name", "");
        setField(term5288, term5288.getClass(), "name", null);
        setField(term5288, term5288.getClass(), "url", null);
        setField(term5286, term5286.getClass(), "language", term5288);
        Object term5289 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5291 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5289, term5289.getClass(), "name", "");
        setField(term5291, term5291.getClass(), "name", null);
        setField(term5291, term5291.getClass(), "url", null);
        setField(term5289, term5289.getClass(), "language", term5291);
        Object term5292 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term5294 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5292, term5292.getClass(), "name", "");
        setField(term5294, term5294.getClass(), "name", null);
        setField(term5294, term5294.getClass(), "url", null);
        setField(term5292, term5292.getClass(), "language", term5294);
        ArrayList term5278 = new ArrayList();
        ((ArrayList) term5278).add(term5280);
        ((ArrayList) term5278).add(term5283);
        ((ArrayList) term5278).add(term5286);
        ((ArrayList) term5278).add(term5289);
        ((ArrayList) term5278).add(term5292);
        term5134 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term5169 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5194 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term5243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5134, term5134.getClass(), "id", term5135);
        setField(term5134, term5134.getClass(), "name", "vMsWjuPTnO");
        setField(term5134, term5134.getClass(), "order", term5149);
        setField(term5134, term5134.getClass(), "formOrder", term5151);
        setField(term5134, term5134.getClass(), "isDefault", term5153);
        setField(term5134, term5134.getClass(), "isBattleOnly", term5155);
        setField(term5134, term5134.getClass(), "formName", "zHvfKaOstO");
        setField(term5169, term5169.getClass(), "name", "tOszriqETr");
        setField(term5169, term5169.getClass(), "url", "ncSPTkhKjO");
        setField(term5134, term5134.getClass(), "pokemon", term5169);
        setField(term5194, term5194.getClass(), "frontDefault", "jcWKHRWhyj");
        setField(term5194, term5194.getClass(), "frontShiny", "nrQjODRMLD");
        setField(term5194, term5194.getClass(), "backDefault", "PNoWXrsFic");
        setField(term5194, term5194.getClass(), "backShiny", "QZBHZqZope");
        setField(term5134, term5134.getClass(), "sprites", term5194);
        setField(term5243, term5243.getClass(), "name", "VBUahCvyxC");
        setField(term5243, term5243.getClass(), "url", "MlzTkzKMCX");
        setField(term5134, term5134.getClass(), "versionGroup", term5243);
        setField(term5134, term5134.getClass(), "names", term5268);
        setField(term5134, term5134.getClass(), "formNames", term5278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSprites", argTypes, term5134, args);
    }

};


