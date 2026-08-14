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

public class Type_getPokemon_190790113125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59936;

    public Type_getPokemon_190790113125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term59937 = new Integer(1923027847);
        ArrayList term59952 = new ArrayList();
        ArrayList term59956 = new ArrayList();
        ArrayList term59960 = new ArrayList();
        ArrayList term59964 = new ArrayList();
        ArrayList term59968 = new ArrayList();
        ArrayList term59972 = new ArrayList();
        Object term59978 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59979 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59980 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59979, term59979.getClass(), "name", null);
        setField(term59979, term59979.getClass(), "url", null);
        setField(term59978, term59978.getClass(), "generation", term59979);
        setField(term59980, term59980.getClass(), "noDamageTo", null);
        setField(term59980, term59980.getClass(), "halfDamageTo", null);
        setField(term59980, term59980.getClass(), "doubleDamageTo", null);
        setField(term59980, term59980.getClass(), "noDamageFrom", null);
        setField(term59980, term59980.getClass(), "halfDamageFrom", null);
        setField(term59980, term59980.getClass(), "doubleDamageFrom", null);
        setField(term59978, term59978.getClass(), "damageRelations", term59980);
        Object term59981 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59982 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59983 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59982, term59982.getClass(), "name", null);
        setField(term59982, term59982.getClass(), "url", null);
        setField(term59981, term59981.getClass(), "generation", term59982);
        setField(term59983, term59983.getClass(), "noDamageTo", null);
        setField(term59983, term59983.getClass(), "halfDamageTo", null);
        setField(term59983, term59983.getClass(), "doubleDamageTo", null);
        setField(term59983, term59983.getClass(), "noDamageFrom", null);
        setField(term59983, term59983.getClass(), "halfDamageFrom", null);
        setField(term59983, term59983.getClass(), "doubleDamageFrom", null);
        setField(term59981, term59981.getClass(), "damageRelations", term59983);
        Object term59984 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term59985 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term59986 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term59985, term59985.getClass(), "name", null);
        setField(term59985, term59985.getClass(), "url", null);
        setField(term59984, term59984.getClass(), "generation", term59985);
        setField(term59986, term59986.getClass(), "noDamageTo", null);
        setField(term59986, term59986.getClass(), "halfDamageTo", null);
        setField(term59986, term59986.getClass(), "doubleDamageTo", null);
        setField(term59986, term59986.getClass(), "noDamageFrom", null);
        setField(term59986, term59986.getClass(), "halfDamageFrom", null);
        setField(term59986, term59986.getClass(), "doubleDamageFrom", null);
        setField(term59984, term59984.getClass(), "damageRelations", term59986);
        ArrayList term59976 = new ArrayList();
        ((ArrayList) term59976).add(term59978);
        ((ArrayList) term59976).add(term59981);
        ((ArrayList) term59976).add(term59984);
        Integer term59992 = new Integer(-1652693609);
        Object term59991 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term59994 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59991, term59991.getClass(), "gameIndex", term59992);
        setField(term59994, term59994.getClass(), "name", null);
        setField(term59994, term59994.getClass(), "url", null);
        setField(term59991, term59991.getClass(), "generation", term59994);
        ArrayList term59989 = new ArrayList();
        ((ArrayList) term59989).add(term59991);
        Object term60049 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term60051 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term60049, term60049.getClass(), "name", "");
        setField(term60051, term60051.getClass(), "name", null);
        setField(term60051, term60051.getClass(), "url", null);
        setField(term60049, term60049.getClass(), "language", term60051);
        ArrayList term60047 = new ArrayList();
        ((ArrayList) term60047).add(term60049);
        Integer term60057 = new Integer(-824893512);
        Object term60056 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term60059 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term60056, term60056.getClass(), "slot", term60057);
        setField(term60059, term60059.getClass(), "name", null);
        setField(term60059, term60059.getClass(), "url", null);
        setField(term60056, term60056.getClass(), "pokemon", term60059);
        Integer term60061 = new Integer(-55435071);
        Object term60060 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term60063 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term60060, term60060.getClass(), "slot", term60061);
        setField(term60063, term60063.getClass(), "name", null);
        setField(term60063, term60063.getClass(), "url", null);
        setField(term60060, term60060.getClass(), "pokemon", term60063);
        Integer term60065 = new Integer(-673356166);
        Object term60064 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term60067 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term60064, term60064.getClass(), "slot", term60065);
        setField(term60067, term60067.getClass(), "name", null);
        setField(term60067, term60067.getClass(), "url", null);
        setField(term60064, term60064.getClass(), "pokemon", term60067);
        Integer term60069 = new Integer(1876812694);
        Object term60068 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term60068, term60068.getClass(), "slot", term60069);
        setField(term60068, term60068.getClass(), "pokemon", term60059);
        Integer term60072 = new Integer(461068473);
        Object term60071 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term60071, term60071.getClass(), "slot", term60072);
        setField(term60071, term60071.getClass(), "pokemon", term60063);
        Integer term60075 = new Integer(-1833298266);
        Object term60074 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        setField(term60074, term60074.getClass(), "slot", term60075);
        setField(term60074, term60074.getClass(), "pokemon", term59979);
        ArrayList term60054 = new ArrayList();
        ((ArrayList) term60054).add(term60056);
        ((ArrayList) term60054).add(term60060);
        ((ArrayList) term60054).add(term60064);
        ((ArrayList) term60054).add(term60068);
        ((ArrayList) term60054).add(term60071);
        ((ArrayList) term60054).add(term60074);
        ArrayList term60079 = new ArrayList();
        term59936 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term59951 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term59997 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term60022 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term59936, term59936.getClass(), "id", term59937);
        setField(term59936, term59936.getClass(), "name", "hVvOTNVpNh");
        setField(term59951, term59951.getClass(), "noDamageTo", term59952);
        setField(term59951, term59951.getClass(), "halfDamageTo", term59956);
        setField(term59951, term59951.getClass(), "doubleDamageTo", term59960);
        setField(term59951, term59951.getClass(), "noDamageFrom", term59964);
        setField(term59951, term59951.getClass(), "halfDamageFrom", term59968);
        setField(term59951, term59951.getClass(), "doubleDamageFrom", term59972);
        setField(term59936, term59936.getClass(), "damageRelations", term59951);
        setField(term59936, term59936.getClass(), "pastDamageRelations", term59976);
        setField(term59936, term59936.getClass(), "gameIndices", term59989);
        setField(term59997, term59997.getClass(), "name", "UttjyRKHwn");
        setField(term59997, term59997.getClass(), "url", "IyJjCUddkw");
        setField(term59936, term59936.getClass(), "generation", term59997);
        setField(term60022, term60022.getClass(), "name", "heIrYPNcWE");
        setField(term60022, term60022.getClass(), "url", "gFagUPdepk");
        setField(term59936, term59936.getClass(), "moveDamageClass", term60022);
        setField(term59936, term59936.getClass(), "names", term60047);
        setField(term59936, term59936.getClass(), "pokemon", term60054);
        setField(term59936, term59936.getClass(), "moves", term60079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemon", argTypes, term59936, args);
    }

};


