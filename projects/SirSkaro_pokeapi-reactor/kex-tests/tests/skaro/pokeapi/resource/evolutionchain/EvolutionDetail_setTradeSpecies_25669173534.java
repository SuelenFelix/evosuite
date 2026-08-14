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

public class EvolutionDetail_setTradeSpecies_25669173534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16548;
     Object term16802;

    public EvolutionDetail_setTradeSpecies_25669173534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16599 = new Integer(-511077684);
        Integer term16701 = new Integer(-711507760);
        Integer term16703 = new Integer(1053773809);
        Integer term16705 = new Integer(924127883);
        Integer term16707 = new Integer(-751079123);
        Boolean term16709 = new Boolean(true);
        Integer term16761 = new Integer(-110837188);
        Boolean term16800 = new Boolean(true);
        term16548 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term16549 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16574 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16651 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16676 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16711 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16775 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16549, term16549.getClass(), "name", "VAGkRppBem");
        setField(term16549, term16549.getClass(), "url", "eKcEJRxNSu");
        setField(term16548, term16548.getClass(), "item", term16549);
        setField(term16574, term16574.getClass(), "name", "NTXQPWFYSA");
        setField(term16574, term16574.getClass(), "url", "fOuOhBpldm");
        setField(term16548, term16548.getClass(), "trigger", term16574);
        setField(term16548, term16548.getClass(), "gender", term16599);
        setField(term16601, term16601.getClass(), "name", "qQQRKGPyIM");
        setField(term16601, term16601.getClass(), "url", "lzcwhvjdFg");
        setField(term16548, term16548.getClass(), "heldItem", term16601);
        setField(term16626, term16626.getClass(), "name", "dfzWTjcjnI");
        setField(term16626, term16626.getClass(), "url", "bsnZXGEvFv");
        setField(term16548, term16548.getClass(), "knownMove", term16626);
        setField(term16651, term16651.getClass(), "name", "osFrHWYeRy");
        setField(term16651, term16651.getClass(), "url", "scpIQUfPKw");
        setField(term16548, term16548.getClass(), "knownMoveType", term16651);
        setField(term16676, term16676.getClass(), "name", "QKYBpCjuYt");
        setField(term16676, term16676.getClass(), "url", "vjiRfoGdkl");
        setField(term16548, term16548.getClass(), "location", term16676);
        setField(term16548, term16548.getClass(), "minLevel", term16701);
        setField(term16548, term16548.getClass(), "minHappiness", term16703);
        setField(term16548, term16548.getClass(), "minBeauty", term16705);
        setField(term16548, term16548.getClass(), "minAffection", term16707);
        setField(term16548, term16548.getClass(), "needsOverworldRain", term16709);
        setField(term16711, term16711.getClass(), "name", "TwaxeSHvnR");
        setField(term16711, term16711.getClass(), "url", "paPzDETzIq");
        setField(term16548, term16548.getClass(), "partySpecies", term16711);
        setField(term16736, term16736.getClass(), "name", "fufeuGfwpN");
        setField(term16736, term16736.getClass(), "url", "XJbkXbljvz");
        setField(term16548, term16548.getClass(), "partyType", term16736);
        setField(term16548, term16548.getClass(), "relativePhysicalStats", term16761);
        setField(term16548, term16548.getClass(), "timeOfDay", "fuvdkDwBeH");
        setField(term16775, term16775.getClass(), "name", "NTefzwLPhx");
        setField(term16775, term16775.getClass(), "url", "dirFuhqyNu");
        setField(term16548, term16548.getClass(), "tradeSpecies", term16775);
        setField(term16548, term16548.getClass(), "turnUpsideDown", term16800);
        term16802 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16802, term16802.getClass(), "name", "ZdNcodHERG");
        setField(term16802, term16802.getClass(), "url", "CLHomjAqIM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term16802;
        callMethod(klass, "setTradeSpecies", argTypes, term16548, args);
    }

};


