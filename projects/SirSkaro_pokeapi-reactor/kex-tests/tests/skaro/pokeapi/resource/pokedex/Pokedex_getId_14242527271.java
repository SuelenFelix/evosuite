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

public class Pokedex_getId_14242527271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public Pokedex_getId_14242527271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term245 = new Integer(-616727354);
        Boolean term259 = new Boolean(false);
        Object term263 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term263, term263.getClass(), "description", "");
        setField(term265, term265.getClass(), "name", null);
        setField(term265, term265.getClass(), "url", null);
        setField(term263, term263.getClass(), "language", term265);
        Object term266 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term268 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term266, term266.getClass(), "description", "");
        setField(term268, term268.getClass(), "name", null);
        setField(term268, term268.getClass(), "url", null);
        setField(term266, term266.getClass(), "language", term268);
        Object term269 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term271 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term269, term269.getClass(), "description", "");
        setField(term271, term271.getClass(), "name", null);
        setField(term271, term271.getClass(), "url", null);
        setField(term269, term269.getClass(), "language", term271);
        Object term272 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term274 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term272, term272.getClass(), "description", "");
        setField(term274, term274.getClass(), "name", null);
        setField(term274, term274.getClass(), "url", null);
        setField(term272, term272.getClass(), "language", term274);
        Object term275 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term277 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term275, term275.getClass(), "description", "");
        setField(term277, term277.getClass(), "name", null);
        setField(term277, term277.getClass(), "url", null);
        setField(term275, term275.getClass(), "language", term277);
        ArrayList term261 = new ArrayList();
        ((ArrayList) term261).add(term263);
        ((ArrayList) term261).add(term266);
        ((ArrayList) term261).add(term269);
        ((ArrayList) term261).add(term272);
        ((ArrayList) term261).add(term275);
        Object term282 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term284 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term282, term282.getClass(), "name", "");
        setField(term284, term284.getClass(), "name", null);
        setField(term284, term284.getClass(), "url", null);
        setField(term282, term282.getClass(), "language", term284);
        Object term285 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term287 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term285, term285.getClass(), "name", "");
        setField(term287, term287.getClass(), "name", null);
        setField(term287, term287.getClass(), "url", null);
        setField(term285, term285.getClass(), "language", term287);
        Object term288 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term288, term288.getClass(), "name", "");
        setField(term290, term290.getClass(), "name", null);
        setField(term290, term290.getClass(), "url", null);
        setField(term288, term288.getClass(), "language", term290);
        Object term291 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term293 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term291, term291.getClass(), "name", "");
        setField(term293, term293.getClass(), "name", null);
        setField(term293, term293.getClass(), "url", null);
        setField(term291, term291.getClass(), "language", term293);
        ArrayList term280 = new ArrayList();
        ((ArrayList) term280).add(term282);
        ((ArrayList) term280).add(term285);
        ((ArrayList) term280).add(term288);
        ((ArrayList) term280).add(term291);
        Integer term299 = new Integer(-1955890973);
        Object term298 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term301 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term298, term298.getClass(), "entryNumber", term299);
        setField(term301, term301.getClass(), "name", null);
        setField(term301, term301.getClass(), "url", null);
        setField(term298, term298.getClass(), "pokemonSpecies", term301);
        Integer term303 = new Integer(-2038273078);
        Object term302 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term302, term302.getClass(), "entryNumber", term303);
        setField(term302, term302.getClass(), "pokemonSpecies", term290);
        Integer term306 = new Integer(1227103734);
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term305, term305.getClass(), "entryNumber", term306);
        setField(term305, term305.getClass(), "pokemonSpecies", term293);
        ArrayList term296 = new ArrayList();
        ((ArrayList) term296).add(term298);
        ((ArrayList) term296).add(term302);
        ((ArrayList) term296).add(term305);
        ArrayList term310 = new ArrayList();
        term244 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term244, term244.getClass(), "id", term245);
        setField(term244, term244.getClass(), "name", "MxlszYVzRf");
        setField(term244, term244.getClass(), "isMainSeries", term259);
        setField(term244, term244.getClass(), "descriptions", term261);
        setField(term244, term244.getClass(), "names", term280);
        setField(term244, term244.getClass(), "pokemonEntries", term296);
        setField(term244, term244.getClass(), "region", term265);
        setField(term244, term244.getClass(), "versionGroups", term310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term244, args);
    }

};


