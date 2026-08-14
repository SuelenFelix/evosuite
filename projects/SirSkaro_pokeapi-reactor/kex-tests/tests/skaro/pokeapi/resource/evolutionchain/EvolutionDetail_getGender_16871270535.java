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

public class EvolutionDetail_getGender_16871270535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3366;

    public EvolutionDetail_getGender_16871270535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3417 = new Integer(1608016787);
        Integer term3519 = new Integer(-516303035);
        Integer term3521 = new Integer(-2143043890);
        Integer term3523 = new Integer(-2138825831);
        Integer term3525 = new Integer(1454781562);
        Boolean term3527 = new Boolean(false);
        Integer term3579 = new Integer(-27944011);
        Boolean term3618 = new Boolean(false);
        term3366 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term3367 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3392 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3419 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3444 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3469 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3494 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3529 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3554 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3593 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3367, term3367.getClass(), "name", "hePqROaplw");
        setField(term3367, term3367.getClass(), "url", "PJcSNDruWd");
        setField(term3366, term3366.getClass(), "item", term3367);
        setField(term3392, term3392.getClass(), "name", "VVNNlAePXF");
        setField(term3392, term3392.getClass(), "url", "jnwVnmKAFv");
        setField(term3366, term3366.getClass(), "trigger", term3392);
        setField(term3366, term3366.getClass(), "gender", term3417);
        setField(term3419, term3419.getClass(), "name", "TXyHhqeCjR");
        setField(term3419, term3419.getClass(), "url", "lZIgPZPgTu");
        setField(term3366, term3366.getClass(), "heldItem", term3419);
        setField(term3444, term3444.getClass(), "name", "iuCxnHGMoW");
        setField(term3444, term3444.getClass(), "url", "GPSEWEDSTo");
        setField(term3366, term3366.getClass(), "knownMove", term3444);
        setField(term3469, term3469.getClass(), "name", "RCOqfVsRHt");
        setField(term3469, term3469.getClass(), "url", "TSyCeEZPaT");
        setField(term3366, term3366.getClass(), "knownMoveType", term3469);
        setField(term3494, term3494.getClass(), "name", "JeZFtaqkzW");
        setField(term3494, term3494.getClass(), "url", "vOVuNSCCLe");
        setField(term3366, term3366.getClass(), "location", term3494);
        setField(term3366, term3366.getClass(), "minLevel", term3519);
        setField(term3366, term3366.getClass(), "minHappiness", term3521);
        setField(term3366, term3366.getClass(), "minBeauty", term3523);
        setField(term3366, term3366.getClass(), "minAffection", term3525);
        setField(term3366, term3366.getClass(), "needsOverworldRain", term3527);
        setField(term3529, term3529.getClass(), "name", "fzeqPnzpnt");
        setField(term3529, term3529.getClass(), "url", "RxbhrFBjkO");
        setField(term3366, term3366.getClass(), "partySpecies", term3529);
        setField(term3554, term3554.getClass(), "name", "aanyiAOJCl");
        setField(term3554, term3554.getClass(), "url", "VDokbsCuqq");
        setField(term3366, term3366.getClass(), "partyType", term3554);
        setField(term3366, term3366.getClass(), "relativePhysicalStats", term3579);
        setField(term3366, term3366.getClass(), "timeOfDay", "xClUIcPECX");
        setField(term3593, term3593.getClass(), "name", "avhRaGZaBF");
        setField(term3593, term3593.getClass(), "url", "JkgoRtImdE");
        setField(term3366, term3366.getClass(), "tradeSpecies", term3593);
        setField(term3366, term3366.getClass(), "turnUpsideDown", term3618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term3366, args);
    }

};


