package skaro.pokeapi.resource.evolutionchain;

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
import static skaro.pokeapi.resource.evolutionchain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class EvolutionDetail_getTimeOfDay_2331404131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15194;

    public EvolutionDetail_getTimeOfDay_2331404131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15245 = new Integer(1104108112);
        Integer term15347 = new Integer(1648665618);
        Integer term15349 = new Integer(633765954);
        Integer term15351 = new Integer(269110087);
        Integer term15353 = new Integer(1545119095);
        Boolean term15355 = new Boolean(true);
        Integer term15407 = new Integer(1671229683);
        Boolean term15446 = new Boolean(true);
        term15194 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term15195 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15220 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15247 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15272 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15297 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15322 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15357 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15421 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15195, term15195.getClass(), "name", "uXYojRmxrM");
        setField(term15195, term15195.getClass(), "url", "cxRwRcodud");
        setField(term15194, term15194.getClass(), "item", term15195);
        setField(term15220, term15220.getClass(), "name", "GDGBPlYeLn");
        setField(term15220, term15220.getClass(), "url", "jdQANIXSTq");
        setField(term15194, term15194.getClass(), "trigger", term15220);
        setField(term15194, term15194.getClass(), "gender", term15245);
        setField(term15247, term15247.getClass(), "name", "stVcZLTNpu");
        setField(term15247, term15247.getClass(), "url", "LgXdqWrsLL");
        setField(term15194, term15194.getClass(), "heldItem", term15247);
        setField(term15272, term15272.getClass(), "name", "bbHWyibNmy");
        setField(term15272, term15272.getClass(), "url", "vYYOYhWMWZ");
        setField(term15194, term15194.getClass(), "knownMove", term15272);
        setField(term15297, term15297.getClass(), "name", "FLQJOzEXff");
        setField(term15297, term15297.getClass(), "url", "qlaIVJBSfQ");
        setField(term15194, term15194.getClass(), "knownMoveType", term15297);
        setField(term15322, term15322.getClass(), "name", "lYvIWBFFsq");
        setField(term15322, term15322.getClass(), "url", "tThwsqWKcE");
        setField(term15194, term15194.getClass(), "location", term15322);
        setField(term15194, term15194.getClass(), "minLevel", term15347);
        setField(term15194, term15194.getClass(), "minHappiness", term15349);
        setField(term15194, term15194.getClass(), "minBeauty", term15351);
        setField(term15194, term15194.getClass(), "minAffection", term15353);
        setField(term15194, term15194.getClass(), "needsOverworldRain", term15355);
        setField(term15357, term15357.getClass(), "name", "bkSgsDrkCN");
        setField(term15357, term15357.getClass(), "url", "hwjlcimgJH");
        setField(term15194, term15194.getClass(), "partySpecies", term15357);
        setField(term15382, term15382.getClass(), "name", "TLxQzxvizR");
        setField(term15382, term15382.getClass(), "url", "uUgJfKAzDM");
        setField(term15194, term15194.getClass(), "partyType", term15382);
        setField(term15194, term15194.getClass(), "relativePhysicalStats", term15407);
        setField(term15194, term15194.getClass(), "timeOfDay", "gZPZNkweEp");
        setField(term15421, term15421.getClass(), "name", "vfennwtmqe");
        setField(term15421, term15421.getClass(), "url", "zZxoNkohbw");
        setField(term15194, term15194.getClass(), "tradeSpecies", term15421);
        setField(term15194, term15194.getClass(), "turnUpsideDown", term15446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeOfDay", argTypes, term15194, args);
    }

};


