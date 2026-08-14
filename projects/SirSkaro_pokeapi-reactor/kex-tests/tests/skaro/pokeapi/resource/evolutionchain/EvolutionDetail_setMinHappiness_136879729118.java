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

public class EvolutionDetail_setMinHappiness_136879729118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9322;
     Object term9576;

    public EvolutionDetail_setMinHappiness_136879729118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9373 = new Integer(1801052257);
        Integer term9475 = new Integer(-2110556060);
        Integer term9477 = new Integer(313459791);
        Integer term9479 = new Integer(752615112);
        Integer term9481 = new Integer(-1674430871);
        Boolean term9483 = new Boolean(false);
        Integer term9535 = new Integer(794352120);
        Boolean term9574 = new Boolean(false);
        term9322 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term9323 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9348 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9375 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9400 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9425 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9450 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9485 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9510 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9549 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term9323, term9323.getClass(), "name", "vgdwrCZczl");
        setField(term9323, term9323.getClass(), "url", "gKMNrpKBpu");
        setField(term9322, term9322.getClass(), "item", term9323);
        setField(term9348, term9348.getClass(), "name", "ZbHJVEqcoa");
        setField(term9348, term9348.getClass(), "url", "awDQVEVIKi");
        setField(term9322, term9322.getClass(), "trigger", term9348);
        setField(term9322, term9322.getClass(), "gender", term9373);
        setField(term9375, term9375.getClass(), "name", "HJwNgUzZZR");
        setField(term9375, term9375.getClass(), "url", "FvUCZgTXhq");
        setField(term9322, term9322.getClass(), "heldItem", term9375);
        setField(term9400, term9400.getClass(), "name", "wWWidPCHzx");
        setField(term9400, term9400.getClass(), "url", "OwPIiBRuKK");
        setField(term9322, term9322.getClass(), "knownMove", term9400);
        setField(term9425, term9425.getClass(), "name", "sgfGySMODT");
        setField(term9425, term9425.getClass(), "url", "ndAITnOsny");
        setField(term9322, term9322.getClass(), "knownMoveType", term9425);
        setField(term9450, term9450.getClass(), "name", "CVZnTiJucs");
        setField(term9450, term9450.getClass(), "url", "ecHEQufXoq");
        setField(term9322, term9322.getClass(), "location", term9450);
        setField(term9322, term9322.getClass(), "minLevel", term9475);
        setField(term9322, term9322.getClass(), "minHappiness", term9477);
        setField(term9322, term9322.getClass(), "minBeauty", term9479);
        setField(term9322, term9322.getClass(), "minAffection", term9481);
        setField(term9322, term9322.getClass(), "needsOverworldRain", term9483);
        setField(term9485, term9485.getClass(), "name", "btBLMvHzJg");
        setField(term9485, term9485.getClass(), "url", "JdOMfNWgLP");
        setField(term9322, term9322.getClass(), "partySpecies", term9485);
        setField(term9510, term9510.getClass(), "name", "uWqXrwAsDU");
        setField(term9510, term9510.getClass(), "url", "hgFbWAUtsu");
        setField(term9322, term9322.getClass(), "partyType", term9510);
        setField(term9322, term9322.getClass(), "relativePhysicalStats", term9535);
        setField(term9322, term9322.getClass(), "timeOfDay", "HqoTWlkbwF");
        setField(term9549, term9549.getClass(), "name", "CwNELDTAPP");
        setField(term9549, term9549.getClass(), "url", "GSzQdbHLHw");
        setField(term9322, term9322.getClass(), "tradeSpecies", term9549);
        setField(term9322, term9322.getClass(), "turnUpsideDown", term9574);
        term9576 = new Integer(340719678);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term9576;
        callMethod(klass, "setMinHappiness", argTypes, term9322, args);
    }

};


