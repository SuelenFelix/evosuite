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

public class Type_getGameIndices_199207572117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1979;

    public Type_getGameIndices_199207572117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1980 = new Integer(444029505);
        ArrayList term1995 = new ArrayList();
        ArrayList term1999 = new ArrayList();
        ArrayList term2003 = new ArrayList();
        ArrayList term2007 = new ArrayList();
        ArrayList term2011 = new ArrayList();
        ArrayList term2015 = new ArrayList();
        Object term2021 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelationsPast"));
        Object term2022 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2023 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        setField(term2022, term2022.getClass(), "name", null);
        setField(term2022, term2022.getClass(), "url", null);
        setField(term2021, term2021.getClass(), "generation", term2022);
        setField(term2023, term2023.getClass(), "noDamageTo", null);
        setField(term2023, term2023.getClass(), "halfDamageTo", null);
        setField(term2023, term2023.getClass(), "doubleDamageTo", null);
        setField(term2023, term2023.getClass(), "noDamageFrom", null);
        setField(term2023, term2023.getClass(), "halfDamageFrom", null);
        setField(term2023, term2023.getClass(), "doubleDamageFrom", null);
        setField(term2021, term2021.getClass(), "damageRelations", term2023);
        ArrayList term2019 = new ArrayList();
        ((ArrayList) term2019).add(term2021);
        Integer term2029 = new Integer(-1034506028);
        Object term2028 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term2031 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2028, term2028.getClass(), "gameIndex", term2029);
        setField(term2031, term2031.getClass(), "name", null);
        setField(term2031, term2031.getClass(), "url", null);
        setField(term2028, term2028.getClass(), "generation", term2031);
        Integer term2033 = new Integer(-1263114719);
        Object term2032 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term2035 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2032, term2032.getClass(), "gameIndex", term2033);
        setField(term2035, term2035.getClass(), "name", null);
        setField(term2035, term2035.getClass(), "url", null);
        setField(term2032, term2032.getClass(), "generation", term2035);
        Integer term2037 = new Integer(-894662986);
        Object term2036 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term2039 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2036, term2036.getClass(), "gameIndex", term2037);
        setField(term2039, term2039.getClass(), "name", null);
        setField(term2039, term2039.getClass(), "url", null);
        setField(term2036, term2036.getClass(), "generation", term2039);
        Integer term2041 = new Integer(304775596);
        Object term2040 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term2043 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2040, term2040.getClass(), "gameIndex", term2041);
        setField(term2043, term2043.getClass(), "name", null);
        setField(term2043, term2043.getClass(), "url", null);
        setField(term2040, term2040.getClass(), "generation", term2043);
        Integer term2045 = new Integer(-1347665717);
        Object term2044 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term2047 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2044, term2044.getClass(), "gameIndex", term2045);
        setField(term2047, term2047.getClass(), "name", null);
        setField(term2047, term2047.getClass(), "url", null);
        setField(term2044, term2044.getClass(), "generation", term2047);
        ArrayList term2026 = new ArrayList();
        ((ArrayList) term2026).add(term2028);
        ((ArrayList) term2026).add(term2032);
        ((ArrayList) term2026).add(term2036);
        ((ArrayList) term2026).add(term2040);
        ((ArrayList) term2026).add(term2044);
        Object term2102 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term2104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2102, term2102.getClass(), "name", "");
        setField(term2104, term2104.getClass(), "name", null);
        setField(term2104, term2104.getClass(), "url", null);
        setField(term2102, term2102.getClass(), "language", term2104);
        ArrayList term2100 = new ArrayList();
        ((ArrayList) term2100).add(term2102);
        Integer term2110 = new Integer(-1888585309);
        Object term2109 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypePokemon"));
        Object term2112 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2109, term2109.getClass(), "slot", term2110);
        setField(term2112, term2112.getClass(), "name", null);
        setField(term2112, term2112.getClass(), "url", null);
        setField(term2109, term2109.getClass(), "pokemon", term2112);
        ArrayList term2107 = new ArrayList();
        ((ArrayList) term2107).add(term2109);
        ArrayList term2115 = new ArrayList();
        term1979 = newInstance(Class.forName("skaro.pokeapi.resource.type.Type"));
        Object term1994 = newInstance(Class.forName("skaro.pokeapi.resource.type.TypeRelations"));
        Object term2050 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2075 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1979, term1979.getClass(), "id", term1980);
        setField(term1979, term1979.getClass(), "name", "tXfQjSqDzN");
        setField(term1994, term1994.getClass(), "noDamageTo", term1995);
        setField(term1994, term1994.getClass(), "halfDamageTo", term1999);
        setField(term1994, term1994.getClass(), "doubleDamageTo", term2003);
        setField(term1994, term1994.getClass(), "noDamageFrom", term2007);
        setField(term1994, term1994.getClass(), "halfDamageFrom", term2011);
        setField(term1994, term1994.getClass(), "doubleDamageFrom", term2015);
        setField(term1979, term1979.getClass(), "damageRelations", term1994);
        setField(term1979, term1979.getClass(), "pastDamageRelations", term2019);
        setField(term1979, term1979.getClass(), "gameIndices", term2026);
        setField(term2050, term2050.getClass(), "name", "zcorEihhLK");
        setField(term2050, term2050.getClass(), "url", "GrqozDKFOk");
        setField(term1979, term1979.getClass(), "generation", term2050);
        setField(term2075, term2075.getClass(), "name", "CFyoseFGLF");
        setField(term2075, term2075.getClass(), "url", "SFqCrhEWLm");
        setField(term1979, term1979.getClass(), "moveDamageClass", term2075);
        setField(term1979, term1979.getClass(), "names", term2100);
        setField(term1979, term1979.getClass(), "pokemon", term2107);
        setField(term1979, term1979.getClass(), "moves", term2115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.type.Type");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameIndices", argTypes, term1979, args);
    }

};


