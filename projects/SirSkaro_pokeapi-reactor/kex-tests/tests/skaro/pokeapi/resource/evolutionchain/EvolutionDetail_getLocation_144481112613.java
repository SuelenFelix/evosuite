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

public class EvolutionDetail_getLocation_144481112613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7055;

    public EvolutionDetail_getLocation_144481112613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7106 = new Integer(1863910269);
        Integer term7208 = new Integer(864645689);
        Integer term7210 = new Integer(279384872);
        Integer term7212 = new Integer(1427305953);
        Integer term7214 = new Integer(-781832877);
        Boolean term7216 = new Boolean(true);
        Integer term7268 = new Integer(797203987);
        Boolean term7307 = new Boolean(false);
        term7055 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term7056 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7081 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7108 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7133 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7158 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7183 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7218 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7243 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7056, term7056.getClass(), "name", "MqICFYzDJj");
        setField(term7056, term7056.getClass(), "url", "YgQvdcBQKw");
        setField(term7055, term7055.getClass(), "item", term7056);
        setField(term7081, term7081.getClass(), "name", "FiYYLuailz");
        setField(term7081, term7081.getClass(), "url", "XebAeSnCKZ");
        setField(term7055, term7055.getClass(), "trigger", term7081);
        setField(term7055, term7055.getClass(), "gender", term7106);
        setField(term7108, term7108.getClass(), "name", "GeddnXjHGy");
        setField(term7108, term7108.getClass(), "url", "vLTbaoAxBm");
        setField(term7055, term7055.getClass(), "heldItem", term7108);
        setField(term7133, term7133.getClass(), "name", "BXTjEyEZxD");
        setField(term7133, term7133.getClass(), "url", "oKhVzOKUFW");
        setField(term7055, term7055.getClass(), "knownMove", term7133);
        setField(term7158, term7158.getClass(), "name", "mNHyqmOAFy");
        setField(term7158, term7158.getClass(), "url", "UxgSdhxPCH");
        setField(term7055, term7055.getClass(), "knownMoveType", term7158);
        setField(term7183, term7183.getClass(), "name", "DAujxZPHJC");
        setField(term7183, term7183.getClass(), "url", "IlBhdrCvHq");
        setField(term7055, term7055.getClass(), "location", term7183);
        setField(term7055, term7055.getClass(), "minLevel", term7208);
        setField(term7055, term7055.getClass(), "minHappiness", term7210);
        setField(term7055, term7055.getClass(), "minBeauty", term7212);
        setField(term7055, term7055.getClass(), "minAffection", term7214);
        setField(term7055, term7055.getClass(), "needsOverworldRain", term7216);
        setField(term7218, term7218.getClass(), "name", "OirVUQhauU");
        setField(term7218, term7218.getClass(), "url", "GLbyDfbNZI");
        setField(term7055, term7055.getClass(), "partySpecies", term7218);
        setField(term7243, term7243.getClass(), "name", "oNLcCYDAsO");
        setField(term7243, term7243.getClass(), "url", "CNqMxLvtcJ");
        setField(term7055, term7055.getClass(), "partyType", term7243);
        setField(term7055, term7055.getClass(), "relativePhysicalStats", term7268);
        setField(term7055, term7055.getClass(), "timeOfDay", "ktbqerIaKW");
        setField(term7282, term7282.getClass(), "name", "VoghngXfsK");
        setField(term7282, term7282.getClass(), "url", "GbahCBMvct");
        setField(term7055, term7055.getClass(), "tradeSpecies", term7282);
        setField(term7055, term7055.getClass(), "turnUpsideDown", term7307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term7055, args);
    }

};


