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

public class EvolutionDetail_setKnownMove_161712879910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5633;
     Object term5887;

    public EvolutionDetail_setKnownMove_161712879910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term5684 = new Integer(-1539747985);
        Integer term5786 = new Integer(-1982489643);
        Integer term5788 = new Integer(550892835);
        Integer term5790 = new Integer(1237549886);
        Integer term5792 = new Integer(-1945635750);
        Boolean term5794 = new Boolean(false);
        Integer term5846 = new Integer(-1622760744);
        Boolean term5885 = new Boolean(true);
        term5633 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term5634 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5659 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5686 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5711 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5761 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5796 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5821 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term5860 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5634, term5634.getClass(), "name", "IpmgwHTgnG");
        setField(term5634, term5634.getClass(), "url", "tIpkeYIezR");
        setField(term5633, term5633.getClass(), "item", term5634);
        setField(term5659, term5659.getClass(), "name", "YkZtEtthvz");
        setField(term5659, term5659.getClass(), "url", "dwlZSxlXOo");
        setField(term5633, term5633.getClass(), "trigger", term5659);
        setField(term5633, term5633.getClass(), "gender", term5684);
        setField(term5686, term5686.getClass(), "name", "lKrEAkypza");
        setField(term5686, term5686.getClass(), "url", "KtuuNAqGCQ");
        setField(term5633, term5633.getClass(), "heldItem", term5686);
        setField(term5711, term5711.getClass(), "name", "OGQsfjmReM");
        setField(term5711, term5711.getClass(), "url", "YsUtbngnRO");
        setField(term5633, term5633.getClass(), "knownMove", term5711);
        setField(term5736, term5736.getClass(), "name", "JisaWUxcNb");
        setField(term5736, term5736.getClass(), "url", "NxgmYPzWCI");
        setField(term5633, term5633.getClass(), "knownMoveType", term5736);
        setField(term5761, term5761.getClass(), "name", "SqjyKmayBx");
        setField(term5761, term5761.getClass(), "url", "XjDhvToxJy");
        setField(term5633, term5633.getClass(), "location", term5761);
        setField(term5633, term5633.getClass(), "minLevel", term5786);
        setField(term5633, term5633.getClass(), "minHappiness", term5788);
        setField(term5633, term5633.getClass(), "minBeauty", term5790);
        setField(term5633, term5633.getClass(), "minAffection", term5792);
        setField(term5633, term5633.getClass(), "needsOverworldRain", term5794);
        setField(term5796, term5796.getClass(), "name", "nxSTJflLQy");
        setField(term5796, term5796.getClass(), "url", "FlHzxEfFzI");
        setField(term5633, term5633.getClass(), "partySpecies", term5796);
        setField(term5821, term5821.getClass(), "name", "aSATgQUpoe");
        setField(term5821, term5821.getClass(), "url", "VkPSXewZfB");
        setField(term5633, term5633.getClass(), "partyType", term5821);
        setField(term5633, term5633.getClass(), "relativePhysicalStats", term5846);
        setField(term5633, term5633.getClass(), "timeOfDay", "ubodzJoMGW");
        setField(term5860, term5860.getClass(), "name", "weddIktxOA");
        setField(term5860, term5860.getClass(), "url", "uSlMeISsDD");
        setField(term5633, term5633.getClass(), "tradeSpecies", term5860);
        setField(term5633, term5633.getClass(), "turnUpsideDown", term5885);
        term5887 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term5887, term5887.getClass(), "name", "mKaHyMybrK");
        setField(term5887, term5887.getClass(), "url", "AyrEXuGrEj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term5887;
        callMethod(klass, "setKnownMove", argTypes, term5633, args);
    }

};


