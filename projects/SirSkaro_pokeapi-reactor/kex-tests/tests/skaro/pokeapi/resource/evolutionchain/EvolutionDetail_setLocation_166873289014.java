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

public class EvolutionDetail_setLocation_166873289014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7499;
     Object term7753;

    public EvolutionDetail_setLocation_166873289014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term7550 = new Integer(1973060703);
        Integer term7652 = new Integer(-138239905);
        Integer term7654 = new Integer(1709474063);
        Integer term7656 = new Integer(1406617209);
        Integer term7658 = new Integer(1706047059);
        Boolean term7660 = new Boolean(false);
        Integer term7712 = new Integer(590451710);
        Boolean term7751 = new Boolean(true);
        term7499 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term7500 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7525 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7552 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7577 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7602 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7627 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7662 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7687 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term7726 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7500, term7500.getClass(), "name", "iiHBhsNFgk");
        setField(term7500, term7500.getClass(), "url", "HknsTajwxJ");
        setField(term7499, term7499.getClass(), "item", term7500);
        setField(term7525, term7525.getClass(), "name", "XtiurrVYKw");
        setField(term7525, term7525.getClass(), "url", "rsumfoDNHa");
        setField(term7499, term7499.getClass(), "trigger", term7525);
        setField(term7499, term7499.getClass(), "gender", term7550);
        setField(term7552, term7552.getClass(), "name", "ceCWHUTQUM");
        setField(term7552, term7552.getClass(), "url", "LrqwfrKKtS");
        setField(term7499, term7499.getClass(), "heldItem", term7552);
        setField(term7577, term7577.getClass(), "name", "ZUdnQXfzCI");
        setField(term7577, term7577.getClass(), "url", "EULDrUNQvw");
        setField(term7499, term7499.getClass(), "knownMove", term7577);
        setField(term7602, term7602.getClass(), "name", "BtvAvsJSei");
        setField(term7602, term7602.getClass(), "url", "vqnBkkxoIa");
        setField(term7499, term7499.getClass(), "knownMoveType", term7602);
        setField(term7627, term7627.getClass(), "name", "bycpZjxXFn");
        setField(term7627, term7627.getClass(), "url", "jQWttOAiwL");
        setField(term7499, term7499.getClass(), "location", term7627);
        setField(term7499, term7499.getClass(), "minLevel", term7652);
        setField(term7499, term7499.getClass(), "minHappiness", term7654);
        setField(term7499, term7499.getClass(), "minBeauty", term7656);
        setField(term7499, term7499.getClass(), "minAffection", term7658);
        setField(term7499, term7499.getClass(), "needsOverworldRain", term7660);
        setField(term7662, term7662.getClass(), "name", "DzKFxEuEEC");
        setField(term7662, term7662.getClass(), "url", "CAMnvfDLJL");
        setField(term7499, term7499.getClass(), "partySpecies", term7662);
        setField(term7687, term7687.getClass(), "name", "mfHtgSbdjD");
        setField(term7687, term7687.getClass(), "url", "cmuaUiHMVL");
        setField(term7499, term7499.getClass(), "partyType", term7687);
        setField(term7499, term7499.getClass(), "relativePhysicalStats", term7712);
        setField(term7499, term7499.getClass(), "timeOfDay", "xjoSGPWUgu");
        setField(term7726, term7726.getClass(), "name", "uzmqjnOUXu");
        setField(term7726, term7726.getClass(), "url", "xeyjTOCOJb");
        setField(term7499, term7499.getClass(), "tradeSpecies", term7726);
        setField(term7499, term7499.getClass(), "turnUpsideDown", term7751);
        term7753 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term7753, term7753.getClass(), "name", "BsuVlGUUjV");
        setField(term7753, term7753.getClass(), "url", "bHHjfDCntT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term7753;
        callMethod(klass, "setLocation", argTypes, term7499, args);
    }

};


