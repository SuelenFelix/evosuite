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

public class EvolutionDetail_setMinBeauty_204614629420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10212;
     Object term10466;

    public EvolutionDetail_setMinBeauty_204614629420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10263 = new Integer(520504102);
        Integer term10365 = new Integer(-457396133);
        Integer term10367 = new Integer(-1793950607);
        Integer term10369 = new Integer(1091954101);
        Integer term10371 = new Integer(1895143076);
        Boolean term10373 = new Boolean(false);
        Integer term10425 = new Integer(1981860404);
        Boolean term10464 = new Boolean(true);
        term10212 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term10213 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10238 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10265 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10290 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10315 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10340 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10375 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10400 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10439 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10213, term10213.getClass(), "name", "DPwIqlszZo");
        setField(term10213, term10213.getClass(), "url", "mNgDshwZNc");
        setField(term10212, term10212.getClass(), "item", term10213);
        setField(term10238, term10238.getClass(), "name", "pDqgDbJoFw");
        setField(term10238, term10238.getClass(), "url", "iVOvTzOxwt");
        setField(term10212, term10212.getClass(), "trigger", term10238);
        setField(term10212, term10212.getClass(), "gender", term10263);
        setField(term10265, term10265.getClass(), "name", "BjZQdecXvB");
        setField(term10265, term10265.getClass(), "url", "iUkOOQhEkw");
        setField(term10212, term10212.getClass(), "heldItem", term10265);
        setField(term10290, term10290.getClass(), "name", "wmVoFoUVmU");
        setField(term10290, term10290.getClass(), "url", "lLiSiPCciB");
        setField(term10212, term10212.getClass(), "knownMove", term10290);
        setField(term10315, term10315.getClass(), "name", "PsMKIIEwdR");
        setField(term10315, term10315.getClass(), "url", "RbQmXqfXAT");
        setField(term10212, term10212.getClass(), "knownMoveType", term10315);
        setField(term10340, term10340.getClass(), "name", "fcCAsvfBbe");
        setField(term10340, term10340.getClass(), "url", "mUNcKUxghj");
        setField(term10212, term10212.getClass(), "location", term10340);
        setField(term10212, term10212.getClass(), "minLevel", term10365);
        setField(term10212, term10212.getClass(), "minHappiness", term10367);
        setField(term10212, term10212.getClass(), "minBeauty", term10369);
        setField(term10212, term10212.getClass(), "minAffection", term10371);
        setField(term10212, term10212.getClass(), "needsOverworldRain", term10373);
        setField(term10375, term10375.getClass(), "name", "lnvLKbtveE");
        setField(term10375, term10375.getClass(), "url", "FfrrEhTHzQ");
        setField(term10212, term10212.getClass(), "partySpecies", term10375);
        setField(term10400, term10400.getClass(), "name", "LXnDNrMsqT");
        setField(term10400, term10400.getClass(), "url", "ZLQamJFBmu");
        setField(term10212, term10212.getClass(), "partyType", term10400);
        setField(term10212, term10212.getClass(), "relativePhysicalStats", term10425);
        setField(term10212, term10212.getClass(), "timeOfDay", "ZWcOCwKNvd");
        setField(term10439, term10439.getClass(), "name", "GTmoNrziyc");
        setField(term10439, term10439.getClass(), "url", "LvztehSlhM");
        setField(term10212, term10212.getClass(), "tradeSpecies", term10439);
        setField(term10212, term10212.getClass(), "turnUpsideDown", term10464);
        term10466 = new Integer(732174235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term10466;
        callMethod(klass, "setMinBeauty", argTypes, term10212, args);
    }

};


