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

public class EvolutionDetail_setGender_14804566736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3810;
     Object term4064;

    public EvolutionDetail_setGender_14804566736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3861 = new Integer(-20614472);
        Integer term3963 = new Integer(1126618861);
        Integer term3965 = new Integer(947449400);
        Integer term3967 = new Integer(-763799087);
        Integer term3969 = new Integer(1207142014);
        Boolean term3971 = new Boolean(false);
        Integer term4023 = new Integer(-876426634);
        Boolean term4062 = new Boolean(false);
        term3810 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term3811 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3836 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3863 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3888 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3913 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3938 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3973 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3998 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4037 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3811, term3811.getClass(), "name", "qFGKIJjlmV");
        setField(term3811, term3811.getClass(), "url", "IHqvyhMtuM");
        setField(term3810, term3810.getClass(), "item", term3811);
        setField(term3836, term3836.getClass(), "name", "dAldIGYAXV");
        setField(term3836, term3836.getClass(), "url", "mLwibAPEsa");
        setField(term3810, term3810.getClass(), "trigger", term3836);
        setField(term3810, term3810.getClass(), "gender", term3861);
        setField(term3863, term3863.getClass(), "name", "zsWKWiTFuo");
        setField(term3863, term3863.getClass(), "url", "UPUbwyHQKN");
        setField(term3810, term3810.getClass(), "heldItem", term3863);
        setField(term3888, term3888.getClass(), "name", "lgQkrXANyI");
        setField(term3888, term3888.getClass(), "url", "MeTmRZXErV");
        setField(term3810, term3810.getClass(), "knownMove", term3888);
        setField(term3913, term3913.getClass(), "name", "jNxbVmoZgq");
        setField(term3913, term3913.getClass(), "url", "PvmBHIXaMY");
        setField(term3810, term3810.getClass(), "knownMoveType", term3913);
        setField(term3938, term3938.getClass(), "name", "hulYxtowxw");
        setField(term3938, term3938.getClass(), "url", "GNEmuHPNcU");
        setField(term3810, term3810.getClass(), "location", term3938);
        setField(term3810, term3810.getClass(), "minLevel", term3963);
        setField(term3810, term3810.getClass(), "minHappiness", term3965);
        setField(term3810, term3810.getClass(), "minBeauty", term3967);
        setField(term3810, term3810.getClass(), "minAffection", term3969);
        setField(term3810, term3810.getClass(), "needsOverworldRain", term3971);
        setField(term3973, term3973.getClass(), "name", "IoSfuKDFRe");
        setField(term3973, term3973.getClass(), "url", "AWYyZiNfsm");
        setField(term3810, term3810.getClass(), "partySpecies", term3973);
        setField(term3998, term3998.getClass(), "name", "ITRRYiuDwH");
        setField(term3998, term3998.getClass(), "url", "llRfwANcVF");
        setField(term3810, term3810.getClass(), "partyType", term3998);
        setField(term3810, term3810.getClass(), "relativePhysicalStats", term4023);
        setField(term3810, term3810.getClass(), "timeOfDay", "sUEeHQTWkA");
        setField(term4037, term4037.getClass(), "name", "BDIRCxAWLA");
        setField(term4037, term4037.getClass(), "url", "eOJfbiZLnb");
        setField(term3810, term3810.getClass(), "tradeSpecies", term4037);
        setField(term3810, term3810.getClass(), "turnUpsideDown", term4062);
        term4064 = new Integer(213831054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4064;
        callMethod(klass, "setGender", argTypes, term3810, args);
    }

};


