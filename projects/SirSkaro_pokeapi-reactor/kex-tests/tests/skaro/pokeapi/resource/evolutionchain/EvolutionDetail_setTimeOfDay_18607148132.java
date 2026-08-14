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

public class EvolutionDetail_setTimeOfDay_18607148132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15638;

    public EvolutionDetail_setTimeOfDay_18607148132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term15689 = new Integer(34167717);
        Integer term15791 = new Integer(-514195141);
        Integer term15793 = new Integer(-297946422);
        Integer term15795 = new Integer(385463636);
        Integer term15797 = new Integer(-1677599962);
        Boolean term15799 = new Boolean(false);
        Integer term15851 = new Integer(-1790275458);
        Boolean term15890 = new Boolean(true);
        term15638 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term15639 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15664 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15691 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15716 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15741 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15766 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15801 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15826 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term15865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term15639, term15639.getClass(), "name", "DQrjPcLysX");
        setField(term15639, term15639.getClass(), "url", "VWPFyrpmmb");
        setField(term15638, term15638.getClass(), "item", term15639);
        setField(term15664, term15664.getClass(), "name", "gYYKrIeThw");
        setField(term15664, term15664.getClass(), "url", "UsxeLMVkAK");
        setField(term15638, term15638.getClass(), "trigger", term15664);
        setField(term15638, term15638.getClass(), "gender", term15689);
        setField(term15691, term15691.getClass(), "name", "ITrhiKKzcb");
        setField(term15691, term15691.getClass(), "url", "qMKmSzOQXg");
        setField(term15638, term15638.getClass(), "heldItem", term15691);
        setField(term15716, term15716.getClass(), "name", "CURQCMkqbZ");
        setField(term15716, term15716.getClass(), "url", "VZwkkQktrm");
        setField(term15638, term15638.getClass(), "knownMove", term15716);
        setField(term15741, term15741.getClass(), "name", "wIuJvIvEMb");
        setField(term15741, term15741.getClass(), "url", "EyojsbSjWT");
        setField(term15638, term15638.getClass(), "knownMoveType", term15741);
        setField(term15766, term15766.getClass(), "name", "szGicGyWDL");
        setField(term15766, term15766.getClass(), "url", "lkdvUiYwRq");
        setField(term15638, term15638.getClass(), "location", term15766);
        setField(term15638, term15638.getClass(), "minLevel", term15791);
        setField(term15638, term15638.getClass(), "minHappiness", term15793);
        setField(term15638, term15638.getClass(), "minBeauty", term15795);
        setField(term15638, term15638.getClass(), "minAffection", term15797);
        setField(term15638, term15638.getClass(), "needsOverworldRain", term15799);
        setField(term15801, term15801.getClass(), "name", "XuxkPrpfND");
        setField(term15801, term15801.getClass(), "url", "OxNXeKMDje");
        setField(term15638, term15638.getClass(), "partySpecies", term15801);
        setField(term15826, term15826.getClass(), "name", "hGTqHomrbc");
        setField(term15826, term15826.getClass(), "url", "NNMBrIWEBw");
        setField(term15638, term15638.getClass(), "partyType", term15826);
        setField(term15638, term15638.getClass(), "relativePhysicalStats", term15851);
        setField(term15638, term15638.getClass(), "timeOfDay", "GrTaccOQzl");
        setField(term15865, term15865.getClass(), "name", "uuSYOUCVHU");
        setField(term15865, term15865.getClass(), "url", "DfWwbodtVw");
        setField(term15638, term15638.getClass(), "tradeSpecies", term15865);
        setField(term15638, term15638.getClass(), "turnUpsideDown", term15890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kTbFMpVWqx";
        callMethod(klass, "setTimeOfDay", argTypes, term15638, args);
    }

};


