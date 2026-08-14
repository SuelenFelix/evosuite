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
import java.util.LinkedList;

public class Pokedex_setNames_151141680610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;
     Object term1192;

    public Pokedex_setNames_151141680610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1100 = new Integer(1328271830);
        Boolean term1114 = new Boolean(false);
        Object term1118 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1120 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1118, term1118.getClass(), "description", "");
        setField(term1120, term1120.getClass(), "name", null);
        setField(term1120, term1120.getClass(), "url", null);
        setField(term1118, term1118.getClass(), "language", term1120);
        ArrayList term1116 = new ArrayList();
        ((ArrayList) term1116).add(term1118);
        ArrayList term1123 = new ArrayList();
        Integer term1130 = new Integer(1596070772);
        Object term1129 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1132 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1129, term1129.getClass(), "entryNumber", term1130);
        setField(term1132, term1132.getClass(), "name", null);
        setField(term1132, term1132.getClass(), "url", null);
        setField(term1129, term1129.getClass(), "pokemonSpecies", term1132);
        Integer term1134 = new Integer(97029295);
        Object term1133 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1133, term1133.getClass(), "entryNumber", term1134);
        setField(term1136, term1136.getClass(), "name", null);
        setField(term1136, term1136.getClass(), "url", null);
        setField(term1133, term1133.getClass(), "pokemonSpecies", term1136);
        Integer term1138 = new Integer(-1371869594);
        Object term1137 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1137, term1137.getClass(), "entryNumber", term1138);
        setField(term1140, term1140.getClass(), "name", null);
        setField(term1140, term1140.getClass(), "url", null);
        setField(term1137, term1137.getClass(), "pokemonSpecies", term1140);
        Integer term1142 = new Integer(-2095575670);
        Object term1141 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1144 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1141, term1141.getClass(), "entryNumber", term1142);
        setField(term1144, term1144.getClass(), "name", null);
        setField(term1144, term1144.getClass(), "url", null);
        setField(term1141, term1141.getClass(), "pokemonSpecies", term1144);
        Integer term1146 = new Integer(1225272962);
        Object term1145 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1145, term1145.getClass(), "entryNumber", term1146);
        setField(term1148, term1148.getClass(), "name", null);
        setField(term1148, term1148.getClass(), "url", null);
        setField(term1145, term1145.getClass(), "pokemonSpecies", term1148);
        Integer term1150 = new Integer(1324040357);
        Object term1149 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1152 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1149, term1149.getClass(), "entryNumber", term1150);
        setField(term1152, term1152.getClass(), "name", null);
        setField(term1152, term1152.getClass(), "url", null);
        setField(term1149, term1149.getClass(), "pokemonSpecies", term1152);
        Integer term1154 = new Integer(-1588772968);
        Object term1153 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1156 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1153, term1153.getClass(), "entryNumber", term1154);
        setField(term1156, term1156.getClass(), "name", null);
        setField(term1156, term1156.getClass(), "url", null);
        setField(term1153, term1153.getClass(), "pokemonSpecies", term1156);
        Integer term1158 = new Integer(-93135961);
        Object term1157 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.PokemonEntry"));
        Object term1160 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1157, term1157.getClass(), "entryNumber", term1158);
        setField(term1160, term1160.getClass(), "name", null);
        setField(term1160, term1160.getClass(), "url", null);
        setField(term1157, term1157.getClass(), "pokemonSpecies", term1160);
        ArrayList term1127 = new ArrayList();
        ((ArrayList) term1127).add(term1129);
        ((ArrayList) term1127).add(term1133);
        ((ArrayList) term1127).add(term1137);
        ((ArrayList) term1127).add(term1141);
        ((ArrayList) term1127).add(term1145);
        ((ArrayList) term1127).add(term1149);
        ((ArrayList) term1127).add(term1153);
        ((ArrayList) term1127).add(term1157);
        ArrayList term1188 = new ArrayList();
        term1099 = newInstance(Class.forName("skaro.pokeapi.resource.pokedex.Pokedex"));
        Object term1163 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1099, term1099.getClass(), "id", term1100);
        setField(term1099, term1099.getClass(), "name", "TweMFhxNdj");
        setField(term1099, term1099.getClass(), "isMainSeries", term1114);
        setField(term1099, term1099.getClass(), "descriptions", term1116);
        setField(term1099, term1099.getClass(), "names", term1123);
        setField(term1099, term1099.getClass(), "pokemonEntries", term1127);
        setField(term1163, term1163.getClass(), "name", "PXdVZyoJyC");
        setField(term1163, term1163.getClass(), "url", "vLerpqavFM");
        setField(term1099, term1099.getClass(), "region", term1163);
        setField(term1099, term1099.getClass(), "versionGroups", term1188);
        Object term1195 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1208 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1195, term1195.getClass(), "name", "qnvxzwuGKX");
        setField(term1208, term1208.getClass(), "name", "");
        setField(term1208, term1208.getClass(), "url", "");
        setField(term1195, term1195.getClass(), "language", term1208);
        Object term1212 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1214 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1212, term1212.getClass(), "name", "");
        setField(term1214, term1214.getClass(), "name", null);
        setField(term1214, term1214.getClass(), "url", null);
        setField(term1212, term1212.getClass(), "language", term1214);
        Object term1216 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term1216, term1216.getClass(), "name", null);
        setField(term1216, term1216.getClass(), "language", null);
        term1192 = new LinkedList();
        ((LinkedList) term1192).add(term1195);
        ((LinkedList) term1192).add(term1212);
        ((LinkedList) term1192).add(term1216);
        ((LinkedList) term1192).add((Object)null);
        ((LinkedList) term1192).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.pokedex.Pokedex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1192;
        callMethod(klass, "setNames", argTypes, term1099, args);
    }

};


