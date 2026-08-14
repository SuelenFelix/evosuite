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

public class PokemonForm_setId_1652429252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;
     Object term1240;

    public PokemonForm_setId_1652429252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1078 = new Integer(391863371);
        Integer term1092 = new Integer(-1922583790);
        Integer term1094 = new Integer(-616727354);
        Boolean term1096 = new Boolean(false);
        Boolean term1098 = new Boolean(false);
        Object term1213 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1215 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1213, term1213.getClass(), "name", "");
        setField(term1215, term1215.getClass(), "name", null);
        setField(term1215, term1215.getClass(), "url", null);
        setField(term1213, term1213.getClass(), "language", term1215);
        Object term1216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1216, term1216.getClass(), "name", "");
        setField(term1218, term1218.getClass(), "name", null);
        setField(term1218, term1218.getClass(), "url", null);
        setField(term1216, term1216.getClass(), "language", term1218);
        Object term1219 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1221 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1219, term1219.getClass(), "name", "");
        setField(term1221, term1221.getClass(), "name", null);
        setField(term1221, term1221.getClass(), "url", null);
        setField(term1219, term1219.getClass(), "language", term1221);
        ArrayList term1211 = new ArrayList();
        ((ArrayList) term1211).add(term1213);
        ((ArrayList) term1211).add(term1216);
        ((ArrayList) term1211).add(term1219);
        Object term1226 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1228 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1226, term1226.getClass(), "name", "");
        setField(term1228, term1228.getClass(), "name", null);
        setField(term1228, term1228.getClass(), "url", null);
        setField(term1226, term1226.getClass(), "language", term1228);
        Object term1229 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1231 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1229, term1229.getClass(), "name", "");
        setField(term1231, term1231.getClass(), "name", null);
        setField(term1231, term1231.getClass(), "url", null);
        setField(term1229, term1229.getClass(), "language", term1231);
        Object term1232 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1234 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1232, term1232.getClass(), "name", "");
        setField(term1234, term1234.getClass(), "name", null);
        setField(term1234, term1234.getClass(), "url", null);
        setField(term1232, term1232.getClass(), "language", term1234);
        Object term1235 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1237 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1235, term1235.getClass(), "name", "");
        setField(term1237, term1237.getClass(), "name", null);
        setField(term1237, term1237.getClass(), "url", null);
        setField(term1235, term1235.getClass(), "language", term1237);
        ArrayList term1224 = new ArrayList();
        ((ArrayList) term1224).add(term1226);
        ((ArrayList) term1224).add(term1229);
        ((ArrayList) term1224).add(term1232);
        ((ArrayList) term1224).add(term1235);
        term1077 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term1112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term1137 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term1186 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1077, term1077.getClass(), "id", term1078);
        setField(term1077, term1077.getClass(), "name", "IgRJUzaCwW");
        setField(term1077, term1077.getClass(), "order", term1092);
        setField(term1077, term1077.getClass(), "formOrder", term1094);
        setField(term1077, term1077.getClass(), "isDefault", term1096);
        setField(term1077, term1077.getClass(), "isBattleOnly", term1098);
        setField(term1077, term1077.getClass(), "formName", "JUmudUmaaV");
        setField(term1112, term1112.getClass(), "name", "KoyGrUJeJW");
        setField(term1112, term1112.getClass(), "url", "HqBOwkVqjD");
        setField(term1077, term1077.getClass(), "pokemon", term1112);
        setField(term1137, term1137.getClass(), "frontDefault", "MAcUBcBckh");
        setField(term1137, term1137.getClass(), "frontShiny", "oVgzLbrsFr");
        setField(term1137, term1137.getClass(), "backDefault", "vQVyKLdtaz");
        setField(term1137, term1137.getClass(), "backShiny", "OWKQODBLzb");
        setField(term1077, term1077.getClass(), "sprites", term1137);
        setField(term1186, term1186.getClass(), "name", "wGmYcqUkgE");
        setField(term1186, term1186.getClass(), "url", "idgaQsnJpQ");
        setField(term1077, term1077.getClass(), "versionGroup", term1186);
        setField(term1077, term1077.getClass(), "names", term1211);
        setField(term1077, term1077.getClass(), "formNames", term1224);
        term1240 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1240;
        callMethod(klass, "setId", argTypes, term1077, args);
    }

};


