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

public class EvolutionDetail_getRelativePhysicalStats_93979734629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14304;

    public EvolutionDetail_getRelativePhysicalStats_93979734629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14355 = new Integer(-558146961);
        Integer term14457 = new Integer(1505480070);
        Integer term14459 = new Integer(-829088844);
        Integer term14461 = new Integer(-31751777);
        Integer term14463 = new Integer(-246967963);
        Boolean term14465 = new Boolean(false);
        Integer term14517 = new Integer(-1777140369);
        Boolean term14556 = new Boolean(false);
        term14304 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term14305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14330 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14357 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14382 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14407 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14432 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14467 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14492 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14531 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term14305, term14305.getClass(), "name", "vuIJRrypuA");
        setField(term14305, term14305.getClass(), "url", "AxfSZmaiyA");
        setField(term14304, term14304.getClass(), "item", term14305);
        setField(term14330, term14330.getClass(), "name", "lBpveIKbea");
        setField(term14330, term14330.getClass(), "url", "uyLBVQYcOV");
        setField(term14304, term14304.getClass(), "trigger", term14330);
        setField(term14304, term14304.getClass(), "gender", term14355);
        setField(term14357, term14357.getClass(), "name", "PoTZjDuBHa");
        setField(term14357, term14357.getClass(), "url", "MIwvgVrhzP");
        setField(term14304, term14304.getClass(), "heldItem", term14357);
        setField(term14382, term14382.getClass(), "name", "HcUUieXdep");
        setField(term14382, term14382.getClass(), "url", "AbonCTtbef");
        setField(term14304, term14304.getClass(), "knownMove", term14382);
        setField(term14407, term14407.getClass(), "name", "maXrGOGoKA");
        setField(term14407, term14407.getClass(), "url", "zAkgWQVCpM");
        setField(term14304, term14304.getClass(), "knownMoveType", term14407);
        setField(term14432, term14432.getClass(), "name", "yQUDyOroXU");
        setField(term14432, term14432.getClass(), "url", "xweqkPdyJH");
        setField(term14304, term14304.getClass(), "location", term14432);
        setField(term14304, term14304.getClass(), "minLevel", term14457);
        setField(term14304, term14304.getClass(), "minHappiness", term14459);
        setField(term14304, term14304.getClass(), "minBeauty", term14461);
        setField(term14304, term14304.getClass(), "minAffection", term14463);
        setField(term14304, term14304.getClass(), "needsOverworldRain", term14465);
        setField(term14467, term14467.getClass(), "name", "kwteHWzwcc");
        setField(term14467, term14467.getClass(), "url", "uMsWXqNhln");
        setField(term14304, term14304.getClass(), "partySpecies", term14467);
        setField(term14492, term14492.getClass(), "name", "MAnhIPOtHL");
        setField(term14492, term14492.getClass(), "url", "dikKjYjmRO");
        setField(term14304, term14304.getClass(), "partyType", term14492);
        setField(term14304, term14304.getClass(), "relativePhysicalStats", term14517);
        setField(term14304, term14304.getClass(), "timeOfDay", "GJnnMDVnEP");
        setField(term14531, term14531.getClass(), "name", "zSMVllDpfk");
        setField(term14531, term14531.getClass(), "url", "iptRXVDoYE");
        setField(term14304, term14304.getClass(), "tradeSpecies", term14531);
        setField(term14304, term14304.getClass(), "turnUpsideDown", term14556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRelativePhysicalStats", argTypes, term14304, args);
    }

};


