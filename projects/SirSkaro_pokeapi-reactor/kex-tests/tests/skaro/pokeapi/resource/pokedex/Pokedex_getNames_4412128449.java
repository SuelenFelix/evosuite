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

public class Pokedex_getNames_4412128449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1010;

    public Pokedex_getNames_4412128449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1011 = new Integer(458147407);
        Boolean term1025 = new Boolean(true);
        Object term1029 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1031 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1029, term1029.getClass(), "description", "");
        setField(term1031, term1031.getClass(), "name", null);
        setField(term1031, term1031.getClass(), "url", null);
        setField(term1029, term1029.getClass(), "language", term1031);
        Object term1032 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1034 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1032, term1032.getClass(), "description", "");
        setField(term1034, term1034.getClass(), "name", null);
        setField(term1034, term1034.getClass(), "url", null);
        setField(term1032, term1032.getClass(), "language", term1034);
        Object term1035 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1037 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1035, term1035.getClass(), "description", "");
        setField(term1037, term1037.getClass(), "name", null);
        setField(term1037, term1037.getClass(), "url", null);
        setField(term1035, term1035.getClass(), "language", term1037);
        Object term1038 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1040 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1038, term1038.getClass(), "description", "");
        setField(term1040, term1040.getClass(), "name", null);
        setField(term1040, term1040.getClass(), "url", null);
        setField(term1038, term1038.getClass(), "language", term1040);
        Object term1041 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1043 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1041, term1041.getClass(), "description", "");
        setField(term1043, term1043.getClass(), "name", null);
        setField(term1043, term1043.getClass(), "url", null);
        setField(term1041, term1041.getClass(), "language", term1043);
        Object term1044 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1046 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1044, term1044.getClass(), "description", "");
        setField(term1046, term1046.getClass(), "name", null);
        setField(term1046, term1046.getClass(), "url", null);
        setField(term1044, term1044.getClass(), "language", term1046);
        Object term1047 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1049 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1047, term1047.getClass(), "description", "");
        setField(term1049, term1049.getClass(), "name", null);
        setField(term1049, term1049.getClass(), "url", null);
        setField(term1047, term1047.getClass(), "language", term1049);
        Object term1050 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1052 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1050, term1050.getClass(), "description", "");
        setField(term1052, term1052.getClass(), "name", null);
        setField(term1052, term1052.getClass(), "url", null);
        setField(term1050, term1050.getClass(), "language", term1052);
        ArrayList term1027 = new ArrayList();
        ((ArrayList) term1027).add(term1029);
        ((ArrayList) term1027).add(term1032);
        ((ArrayList) term1027).add(term1035);
        ((ArrayList) term1027).add(term1038);
        ((ArrayList) term1027).add(term1041);
        ((ArrayList) term1027).add(term1044);
        ((ArrayList) term1027).add(term1047);
        ((ArrayList) term1027).add(term1050);
        Object term1057 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1059 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1057, term1057.getClass(), "name", "");
        setField(term1059, term1059.getClass(), "name", null);
        setField(term1059, term1059.getClass(), "url", null);
        setField(term1057, term1057.getClass(), "language", term1059);
        Object term1060 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1062 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1060, term1060.getClass(), "name", "");
        setField(term1062, term1062.getClass(), "name", null);
        setField(term1062, term1062.getClass(), "url", null);
        setField(term1060, term1060.getClass(), "language", term1062);
        Object term1063 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1063, term1063.getClass(), "name", "");
        setField(term1063, term1063.getClass(), "language", term1052);
        Object term1065 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1065, term1065.getClass(), "name", "");
        setField(term1065, term1065.getClass(), "language", term1059);
        Object term1067 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1067, term1067.getClass(), "name", "");
        setField(term1067, term1067.getClass(), "language", term1031);
        Object term1069 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1069, term1069.getClass(), "name", "");
        setField(term1069, term1069.getClass(), "language", term1046);
        Object term1071 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1071, term1071.getClass(), "name", "");
        setField(term1071, term1071.getClass(), "language", term1040);
        ArrayList term1055 = new ArrayList();
        ((ArrayList) term1055).add(term1057);
        ((ArrayList) term1055).add(term1060);
        ((ArrayList) term1055).add(term1063);
        ((ArrayList) term1055).add(term1065);
        ((ArrayList) term1055).add(term1067);
        ((ArrayList) term1055).add(term1069);
        ((ArrayList) term1055).add(term1071);
        Integer term1078 = new Integer(-184153539);
        Object term1077 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1077, term1077.getClass(), "entryNumber", term1078);
        setField(term1077, term1077.getClass(), "pokemonSpecies", term1034);
        Integer term1081 = new Integer(493620644);
        Object term1080 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        setField(term1080, term1080.getClass(), "entryNumber", term1081);
        setField(term1080, term1080.getClass(), "pokemonSpecies", term1034);
        ArrayList term1075 = new ArrayList();
        ((ArrayList) term1075).add(term1077);
        ((ArrayList) term1075).add(term1080);
        ArrayList term1085 = new ArrayList();
        term1010 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        setField(term1010, term1010.getClass(), "id", term1011);
        setField(term1010, term1010.getClass(), "name", "PqtVXXZMqK");
        setField(term1010, term1010.getClass(), "isMainSeries", term1025);
        setField(term1010, term1010.getClass(), "descriptions", term1027);
        setField(term1010, term1010.getClass(), "names", term1055);
        setField(term1010, term1010.getClass(), "pokemonEntries", term1075);
        setField(term1010, term1010.getClass(), "region", term1062);
        setField(term1010, term1010.getClass(), "versionGroups", term1085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term1010, args);
    }

};


