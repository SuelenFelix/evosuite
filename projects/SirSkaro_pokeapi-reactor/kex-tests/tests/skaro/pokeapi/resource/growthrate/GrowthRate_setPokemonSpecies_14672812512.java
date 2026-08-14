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
import java.util.LinkedList;

public class GrowthRate_setPokemonSpecies_14672812512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;
     Object term1180;

    public GrowthRate_setPokemonSpecies_14672812512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1108 = new Integer(-893623680);
        Object term1136 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1138 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1136, term1136.getClass(), "description", "");
        setField(term1138, term1138.getClass(), "name", null);
        setField(term1138, term1138.getClass(), "url", null);
        setField(term1136, term1136.getClass(), "language", term1138);
        Object term1139 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1141 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1139, term1139.getClass(), "description", "");
        setField(term1141, term1141.getClass(), "name", null);
        setField(term1141, term1141.getClass(), "url", null);
        setField(term1139, term1139.getClass(), "language", term1141);
        Object term1142 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term1144 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1142, term1142.getClass(), "description", "");
        setField(term1144, term1144.getClass(), "name", null);
        setField(term1144, term1144.getClass(), "url", null);
        setField(term1142, term1142.getClass(), "language", term1144);
        ArrayList term1134 = new ArrayList();
        ((ArrayList) term1134).add(term1136);
        ((ArrayList) term1134).add(term1139);
        ((ArrayList) term1134).add(term1142);
        Integer term1150 = new Integer(-1963434938);
        Integer term1152 = new Integer(906181092);
        Object term1149 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1149, term1149.getClass(), "level", term1150);
        setField(term1149, term1149.getClass(), "experience", term1152);
        Integer term1155 = new Integer(1045657203);
        Integer term1157 = new Integer(1386130016);
        Object term1154 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1154, term1154.getClass(), "level", term1155);
        setField(term1154, term1154.getClass(), "experience", term1157);
        Integer term1160 = new Integer(1072005683);
        Integer term1162 = new Integer(1861318859);
        Object term1159 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1159, term1159.getClass(), "level", term1160);
        setField(term1159, term1159.getClass(), "experience", term1162);
        Integer term1165 = new Integer(1474524152);
        Integer term1167 = new Integer(568954359);
        Object term1164 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1164, term1164.getClass(), "level", term1165);
        setField(term1164, term1164.getClass(), "experience", term1167);
        Integer term1170 = new Integer(53410913);
        Integer term1172 = new Integer(-375014958);
        Object term1169 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRateExperienceLevel"));
        setField(term1169, term1169.getClass(), "level", term1170);
        setField(term1169, term1169.getClass(), "experience", term1172);
        ArrayList term1147 = new ArrayList();
        ((ArrayList) term1147).add(term1149);
        ((ArrayList) term1147).add(term1154);
        ((ArrayList) term1147).add(term1159);
        ((ArrayList) term1147).add(term1164);
        ((ArrayList) term1147).add(term1169);
        ArrayList term1176 = new ArrayList();
        term1107 = newInstance(Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate"));
        setField(term1107, term1107.getClass(), "id", term1108);
        setField(term1107, term1107.getClass(), "name", "GgZWSjxjyE");
        setField(term1107, term1107.getClass(), "formula", "EeBVbzjcCI");
        setField(term1107, term1107.getClass(), "descriptions", term1134);
        setField(term1107, term1107.getClass(), "levels", term1147);
        setField(term1107, term1107.getClass(), "pokemonSpecies", term1176);
        Object term1183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1183, term1183.getClass(), "name", "PtirvZmsGt");
        setField(term1183, term1183.getClass(), "url", "HWkpTmtlrc");
        Object term1209 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1209, term1209.getClass(), "name", "");
        setField(term1209, term1209.getClass(), "url", "");
        Object term1213 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1213, term1213.getClass(), "name", null);
        setField(term1213, term1213.getClass(), "url", null);
        term1180 = new LinkedList();
        ((LinkedList) term1180).add(term1183);
        ((LinkedList) term1180).add(term1209);
        ((LinkedList) term1180).add(term1213);
        ((LinkedList) term1180).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.growthrate.GrowthRate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1180;
        callMethod(klass, "setPokemonSpecies", argTypes, term1107, args);
    }

};


