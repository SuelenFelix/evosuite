package skaro.pokeapi.resource.type;

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
import static skaro.pokeapi.resource.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class Type_setPokemon_4662390725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59108;
     Object term59254;

    public Type_setPokemon_4662390725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59109 = new Integer(-1135845415);
        ArrayList term59124 = new ArrayList();
        ArrayList term59128 = new ArrayList();
        ArrayList term59132 = new ArrayList();
        ArrayList term59136 = new ArrayList();
        ArrayList term59140 = new ArrayList();
        ArrayList term59144 = new ArrayList();
        Object term59150 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59152 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59151, term59151.getClass(), "name", null);
        setField(term59151, term59151.getClass(), "url", null);
        setField(term59150, term59150.getClass(), "generation", term59151);
        setField(term59152, term59152.getClass(), "noDamageTo", null);
        setField(term59152, term59152.getClass(), "halfDamageTo", null);
        setField(term59152, term59152.getClass(), "doubleDamageTo", null);
        setField(term59152, term59152.getClass(), "noDamageFrom", null);
        setField(term59152, term59152.getClass(), "halfDamageFrom", null);
        setField(term59152, term59152.getClass(), "doubleDamageFrom", null);
        setField(term59150, term59150.getClass(), "damageRelations", term59152);
        Object term59153 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59154 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59155 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59154, term59154.getClass(), "name", null);
        setField(term59154, term59154.getClass(), "url", null);
        setField(term59153, term59153.getClass(), "generation", term59154);
        setField(term59155, term59155.getClass(), "noDamageTo", null);
        setField(term59155, term59155.getClass(), "halfDamageTo", null);
        setField(term59155, term59155.getClass(), "doubleDamageTo", null);
        setField(term59155, term59155.getClass(), "noDamageFrom", null);
        setField(term59155, term59155.getClass(), "halfDamageFrom", null);
        setField(term59155, term59155.getClass(), "doubleDamageFrom", null);
        setField(term59153, term59153.getClass(), "damageRelations", term59155);
        ArrayList term59148 = new ArrayList();
        ((ArrayList) term59148).add(term59150);
        ((ArrayList) term59148).add(term59153);
        Integer term59161 = new Integer(-1361921586);
        Object term59160 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term59163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59160, term59160.getClass(), "gameIndex", term59161);
        setField(term59163, term59163.getClass(), "name", null);
        setField(term59163, term59163.getClass(), "url", null);
        setField(term59160, term59160.getClass(), "generation", term59163);
        ArrayList term59158 = new ArrayList();
        ((ArrayList) term59158).add(term59160);
        Object term59218 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59220 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59218, term59218.getClass(), "name", "");
        setField(term59220, term59220.getClass(), "name", null);
        setField(term59220, term59220.getClass(), "url", null);
        setField(term59218, term59218.getClass(), "language", term59220);
        Object term59221 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59223 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59221, term59221.getClass(), "name", "");
        setField(term59223, term59223.getClass(), "name", null);
        setField(term59223, term59223.getClass(), "url", null);
        setField(term59221, term59221.getClass(), "language", term59223);
        Object term59224 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59226 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59224, term59224.getClass(), "name", "");
        setField(term59226, term59226.getClass(), "name", null);
        setField(term59226, term59226.getClass(), "url", null);
        setField(term59224, term59224.getClass(), "language", term59226);
        Object term59227 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59229 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59227, term59227.getClass(), "name", "");
        setField(term59229, term59229.getClass(), "name", null);
        setField(term59229, term59229.getClass(), "url", null);
        setField(term59227, term59227.getClass(), "language", term59229);
        Object term59230 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term59232 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59230, term59230.getClass(), "name", "");
        setField(term59232, term59232.getClass(), "name", null);
        setField(term59232, term59232.getClass(), "url", null);
        setField(term59230, term59230.getClass(), "language", term59232);
        Object term59233 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term59233, term59233.getClass(), "name", "");
        setField(term59233, term59233.getClass(), "language", term59226);
        ArrayList term59216 = new ArrayList();
        ((ArrayList) term59216).add(term59218);
        ((ArrayList) term59216).add(term59221);
        ((ArrayList) term59216).add(term59224);
        ((ArrayList) term59216).add(term59227);
        ((ArrayList) term59216).add(term59230);
        ((ArrayList) term59216).add(term59233);
        Integer term59240 = new Integer(593679468);
        Object term59239 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term59239, term59239.getClass(), "slot", term59240);
        setField(term59239, term59239.getClass(), "pokemon", term59229);
        Integer term59243 = new Integer(747491);
        Object term59242 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term59242, term59242.getClass(), "slot", term59243);
        setField(term59242, term59242.getClass(), "pokemon", term59151);
        Integer term59246 = new Integer(734222768);
        Object term59245 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term59245, term59245.getClass(), "slot", term59246);
        setField(term59245, term59245.getClass(), "pokemon", term59220);
        ArrayList term59237 = new ArrayList();
        ((ArrayList) term59237).add(term59239);
        ((ArrayList) term59237).add(term59242);
        ((ArrayList) term59237).add(term59245);
        ArrayList term59250 = new ArrayList();
        term59108 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term59123 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term59166 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59191 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59108, term59108.getClass(), "id", term59109);
        setField(term59108, term59108.getClass(), "name", "RAxKFeZvmg");
        setField(term59123, term59123.getClass(), "noDamageTo", term59124);
        setField(term59123, term59123.getClass(), "halfDamageTo", term59128);
        setField(term59123, term59123.getClass(), "doubleDamageTo", term59132);
        setField(term59123, term59123.getClass(), "noDamageFrom", term59136);
        setField(term59123, term59123.getClass(), "halfDamageFrom", term59140);
        setField(term59123, term59123.getClass(), "doubleDamageFrom", term59144);
        setField(term59108, term59108.getClass(), "damageRelations", term59123);
        setField(term59108, term59108.getClass(), "pastDamageRelations", term59148);
        setField(term59108, term59108.getClass(), "gameIndices", term59158);
        setField(term59166, term59166.getClass(), "name", "StwnIPgnrO");
        setField(term59166, term59166.getClass(), "url", "VJxpQdocmB");
        setField(term59108, term59108.getClass(), "generation", term59166);
        setField(term59191, term59191.getClass(), "name", "nySDwbsteb");
        setField(term59191, term59191.getClass(), "url", "NQxSeIhzbf");
        setField(term59108, term59108.getClass(), "moveDamageClass", term59191);
        setField(term59108, term59108.getClass(), "names", term59216);
        setField(term59108, term59108.getClass(), "pokemon", term59237);
        setField(term59108, term59108.getClass(), "moves", term59250);
        term59254 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term59254;
        callMethod(klass, "setPokemon", argTypes, term59108, args);
    }

};


