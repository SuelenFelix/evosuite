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
import java.util.LinkedList;

public class PokemonForm_setFormNames_139548866824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7152;
     Object term7320;

    public PokemonForm_setFormNames_139548866824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7153 = new Integer(1540719661);
        Integer term7167 = new Integer(1265463001);
        Integer term7169 = new Integer(335112684);
        Boolean term7171 = new Boolean(false);
        Boolean term7173 = new Boolean(true);
        Object term7288 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7288, term7288.getClass(), "name", "");
        setField(term7290, term7290.getClass(), "name", null);
        setField(term7290, term7290.getClass(), "url", null);
        setField(term7288, term7288.getClass(), "language", term7290);
        Object term7291 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7293 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7291, term7291.getClass(), "name", "");
        setField(term7293, term7293.getClass(), "name", null);
        setField(term7293, term7293.getClass(), "url", null);
        setField(term7291, term7291.getClass(), "language", term7293);
        Object term7294 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7296 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7294, term7294.getClass(), "name", "");
        setField(term7296, term7296.getClass(), "name", null);
        setField(term7296, term7296.getClass(), "url", null);
        setField(term7294, term7294.getClass(), "language", term7296);
        Object term7297 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7299 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7297, term7297.getClass(), "name", "");
        setField(term7299, term7299.getClass(), "name", null);
        setField(term7299, term7299.getClass(), "url", null);
        setField(term7297, term7297.getClass(), "language", term7299);
        Object term7300 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7302 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7300, term7300.getClass(), "name", "");
        setField(term7302, term7302.getClass(), "name", null);
        setField(term7302, term7302.getClass(), "url", null);
        setField(term7300, term7300.getClass(), "language", term7302);
        Object term7303 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7303, term7303.getClass(), "name", "");
        setField(term7305, term7305.getClass(), "name", null);
        setField(term7305, term7305.getClass(), "url", null);
        setField(term7303, term7303.getClass(), "language", term7305);
        Object term7306 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7308 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7306, term7306.getClass(), "name", "");
        setField(term7308, term7308.getClass(), "name", null);
        setField(term7308, term7308.getClass(), "url", null);
        setField(term7306, term7306.getClass(), "language", term7308);
        ArrayList term7286 = new ArrayList();
        ((ArrayList) term7286).add(term7288);
        ((ArrayList) term7286).add(term7291);
        ((ArrayList) term7286).add(term7294);
        ((ArrayList) term7286).add(term7297);
        ((ArrayList) term7286).add(term7300);
        ((ArrayList) term7286).add(term7303);
        ((ArrayList) term7286).add(term7306);
        Object term7313 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term7315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7313, term7313.getClass(), "name", "");
        setField(term7315, term7315.getClass(), "name", null);
        setField(term7315, term7315.getClass(), "url", null);
        setField(term7313, term7313.getClass(), "language", term7315);
        Object term7316 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term7316, term7316.getClass(), "name", "");
        setField(term7316, term7316.getClass(), "language", term7305);
        ArrayList term7311 = new ArrayList();
        ((ArrayList) term7311).add(term7313);
        ((ArrayList) term7311).add(term7316);
        term7152 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm"));
        Object term7187 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7212 = newInstance(Class.forName("skaro.pokeapi.resource.pokemonform.PokemonFormSprites"));
        Object term7261 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7152, term7152.getClass(), "id", term7153);
        setField(term7152, term7152.getClass(), "name", "HuOUlaFmvJ");
        setField(term7152, term7152.getClass(), "order", term7167);
        setField(term7152, term7152.getClass(), "formOrder", term7169);
        setField(term7152, term7152.getClass(), "isDefault", term7171);
        setField(term7152, term7152.getClass(), "isBattleOnly", term7173);
        setField(term7152, term7152.getClass(), "formName", "dWVwcwFGNo");
        setField(term7187, term7187.getClass(), "name", "PNdLRrSAIY");
        setField(term7187, term7187.getClass(), "url", "nJnRIRiLZK");
        setField(term7152, term7152.getClass(), "pokemon", term7187);
        setField(term7212, term7212.getClass(), "frontDefault", "eWnrMSbYbT");
        setField(term7212, term7212.getClass(), "frontShiny", "AjoFvDFyCY");
        setField(term7212, term7212.getClass(), "backDefault", "OFTJwdPiTG");
        setField(term7212, term7212.getClass(), "backShiny", "QiUprSEluR");
        setField(term7152, term7152.getClass(), "sprites", term7212);
        setField(term7261, term7261.getClass(), "name", "cDOXXottZh");
        setField(term7261, term7261.getClass(), "url", "rfqJDkDppz");
        setField(term7152, term7152.getClass(), "versionGroup", term7261);
        setField(term7152, term7152.getClass(), "names", term7286);
        setField(term7152, term7152.getClass(), "formNames", term7311);
        term7320 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokemonform.PokemonForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7320;
        callMethod(klass, "setFormNames", argTypes, term7152, args);
    }

};


