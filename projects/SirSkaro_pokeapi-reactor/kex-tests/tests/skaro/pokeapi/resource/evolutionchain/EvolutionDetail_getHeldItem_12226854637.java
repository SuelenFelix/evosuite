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

public class EvolutionDetail_getHeldItem_12226854637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4256;

    public EvolutionDetail_getHeldItem_12226854637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4307 = new Integer(330043745);
        Integer term4409 = new Integer(-509349195);
        Integer term4411 = new Integer(-1639041228);
        Integer term4413 = new Integer(2027686272);
        Integer term4415 = new Integer(-1494356104);
        Boolean term4417 = new Boolean(false);
        Integer term4469 = new Integer(-695279311);
        Boolean term4508 = new Boolean(true);
        term4256 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term4257 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4282 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4309 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4334 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4359 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4384 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4419 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4444 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4483 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4257, term4257.getClass(), "name", "nKZKnxWYCK");
        setField(term4257, term4257.getClass(), "url", "JOqQxuzRuZ");
        setField(term4256, term4256.getClass(), "item", term4257);
        setField(term4282, term4282.getClass(), "name", "RSaoipUlsg");
        setField(term4282, term4282.getClass(), "url", "cSHGbqKqlN");
        setField(term4256, term4256.getClass(), "trigger", term4282);
        setField(term4256, term4256.getClass(), "gender", term4307);
        setField(term4309, term4309.getClass(), "name", "pFAfANnxup");
        setField(term4309, term4309.getClass(), "url", "FbSIUZyBXZ");
        setField(term4256, term4256.getClass(), "heldItem", term4309);
        setField(term4334, term4334.getClass(), "name", "mhQDwIyrRi");
        setField(term4334, term4334.getClass(), "url", "HpZXWDPhlg");
        setField(term4256, term4256.getClass(), "knownMove", term4334);
        setField(term4359, term4359.getClass(), "name", "lBOokzEPfe");
        setField(term4359, term4359.getClass(), "url", "dtGZCsKXbW");
        setField(term4256, term4256.getClass(), "knownMoveType", term4359);
        setField(term4384, term4384.getClass(), "name", "bdyhHbDAmJ");
        setField(term4384, term4384.getClass(), "url", "BBXiTNHqGE");
        setField(term4256, term4256.getClass(), "location", term4384);
        setField(term4256, term4256.getClass(), "minLevel", term4409);
        setField(term4256, term4256.getClass(), "minHappiness", term4411);
        setField(term4256, term4256.getClass(), "minBeauty", term4413);
        setField(term4256, term4256.getClass(), "minAffection", term4415);
        setField(term4256, term4256.getClass(), "needsOverworldRain", term4417);
        setField(term4419, term4419.getClass(), "name", "IEYhJmgCVd");
        setField(term4419, term4419.getClass(), "url", "KSJeYkkvpk");
        setField(term4256, term4256.getClass(), "partySpecies", term4419);
        setField(term4444, term4444.getClass(), "name", "qUtkFGMNUV");
        setField(term4444, term4444.getClass(), "url", "mGRiYhnMcR");
        setField(term4256, term4256.getClass(), "partyType", term4444);
        setField(term4256, term4256.getClass(), "relativePhysicalStats", term4469);
        setField(term4256, term4256.getClass(), "timeOfDay", "NFlvfJCVPO");
        setField(term4483, term4483.getClass(), "name", "KarbTXFmUU");
        setField(term4483, term4483.getClass(), "url", "jiUSjqwSIQ");
        setField(term4256, term4256.getClass(), "tradeSpecies", term4483);
        setField(term4256, term4256.getClass(), "turnUpsideDown", term4508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeldItem", argTypes, term4256, args);
    }

};


