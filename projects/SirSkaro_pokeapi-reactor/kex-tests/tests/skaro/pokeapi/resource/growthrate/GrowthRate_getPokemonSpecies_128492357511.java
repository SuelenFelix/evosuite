package skaro.pokeapi.resource.growthrate;

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
import static skaro.pokeapi.resource.growthrate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class GrowthRate_getPokemonSpecies_128492357511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;

    public GrowthRate_getPokemonSpecies_128492357511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1021 = new Integer(1532716628);
        Object term1049 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1051 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1049, term1049.getClass(), "description", "");
        setField(term1051, term1051.getClass(), "name", null);
        setField(term1051, term1051.getClass(), "url", null);
        setField(term1049, term1049.getClass(), "language", term1051);
        Object term1052 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1054 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1052, term1052.getClass(), "description", "");
        setField(term1054, term1054.getClass(), "name", null);
        setField(term1054, term1054.getClass(), "url", null);
        setField(term1052, term1052.getClass(), "language", term1054);
        Object term1055 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1057 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1055, term1055.getClass(), "description", "");
        setField(term1057, term1057.getClass(), "name", null);
        setField(term1057, term1057.getClass(), "url", null);
        setField(term1055, term1055.getClass(), "language", term1057);
        Object term1058 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1060 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1058, term1058.getClass(), "description", "");
        setField(term1060, term1060.getClass(), "name", null);
        setField(term1060, term1060.getClass(), "url", null);
        setField(term1058, term1058.getClass(), "language", term1060);
        Object term1061 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1063 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1061, term1061.getClass(), "description", "");
        setField(term1063, term1063.getClass(), "name", null);
        setField(term1063, term1063.getClass(), "url", null);
        setField(term1061, term1061.getClass(), "language", term1063);
        Object term1064 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1066 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1064, term1064.getClass(), "description", "");
        setField(term1066, term1066.getClass(), "name", null);
        setField(term1066, term1066.getClass(), "url", null);
        setField(term1064, term1064.getClass(), "language", term1066);
        ArrayList term1047 = new ArrayList();
        ((ArrayList) term1047).add(term1049);
        ((ArrayList) term1047).add(term1052);
        ((ArrayList) term1047).add(term1055);
        ((ArrayList) term1047).add(term1058);
        ((ArrayList) term1047).add(term1061);
        ((ArrayList) term1047).add(term1064);
        Integer term1072 = new Integer(-1801760683);
        Integer term1074 = new Integer(1141317871);
        Object term1071 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1071, term1071.getClass(), "level", term1072);
        setField(term1071, term1071.getClass(), "experience", term1074);
        Integer term1077 = new Integer(890669485);
        Integer term1079 = new Integer(691577392);
        Object term1076 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1076, term1076.getClass(), "level", term1077);
        setField(term1076, term1076.getClass(), "experience", term1079);
        ArrayList term1069 = new ArrayList();
        ((ArrayList) term1069).add(term1071);
        ((ArrayList) term1069).add(term1076);
        ArrayList term1083 = new ArrayList();
        term1020 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term1020, term1020.getClass(), "id", term1021);
        setField(term1020, term1020.getClass(), "name", "AdxvLJhNLe");
        setField(term1020, term1020.getClass(), "formula", "lHfTrWKMPk");
        setField(term1020, term1020.getClass(), "descriptions", term1047);
        setField(term1020, term1020.getClass(), "levels", term1069);
        setField(term1020, term1020.getClass(), "pokemonSpecies", term1083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPokemonSpecies", argTypes, term1020, args);
    }

};


