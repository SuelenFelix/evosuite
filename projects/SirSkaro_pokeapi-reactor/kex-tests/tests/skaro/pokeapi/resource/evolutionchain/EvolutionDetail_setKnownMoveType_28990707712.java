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

public class EvolutionDetail_setKnownMoveType_28990707712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6566;
     Object term6820;

    public EvolutionDetail_setKnownMoveType_28990707712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6617 = new Integer(1136208236);
        Integer term6719 = new Integer(-1220630391);
        Integer term6721 = new Integer(-995822131);
        Integer term6723 = new Integer(-687282231);
        Integer term6725 = new Integer(1200440315);
        Boolean term6727 = new Boolean(false);
        Integer term6779 = new Integer(40571662);
        Boolean term6818 = new Boolean(false);
        term6566 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term6567 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6592 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6619 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6669 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6694 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6729 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6754 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6793 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6567, term6567.getClass(), "name", "QNjNTLlUaV");
        setField(term6567, term6567.getClass(), "url", "hIYsRyOZxk");
        setField(term6566, term6566.getClass(), "item", term6567);
        setField(term6592, term6592.getClass(), "name", "RjNoEywJbC");
        setField(term6592, term6592.getClass(), "url", "RTTvrwwhou");
        setField(term6566, term6566.getClass(), "trigger", term6592);
        setField(term6566, term6566.getClass(), "gender", term6617);
        setField(term6619, term6619.getClass(), "name", "lRORwXipuk");
        setField(term6619, term6619.getClass(), "url", "fVdTcjgHdw");
        setField(term6566, term6566.getClass(), "heldItem", term6619);
        setField(term6644, term6644.getClass(), "name", "wwAwLLcLPp");
        setField(term6644, term6644.getClass(), "url", "nHpMKOmlpQ");
        setField(term6566, term6566.getClass(), "knownMove", term6644);
        setField(term6669, term6669.getClass(), "name", "fKhrQsJToZ");
        setField(term6669, term6669.getClass(), "url", "wsysQLGFnl");
        setField(term6566, term6566.getClass(), "knownMoveType", term6669);
        setField(term6694, term6694.getClass(), "name", "ckQLZGFjMX");
        setField(term6694, term6694.getClass(), "url", "qphdrqUtNx");
        setField(term6566, term6566.getClass(), "location", term6694);
        setField(term6566, term6566.getClass(), "minLevel", term6719);
        setField(term6566, term6566.getClass(), "minHappiness", term6721);
        setField(term6566, term6566.getClass(), "minBeauty", term6723);
        setField(term6566, term6566.getClass(), "minAffection", term6725);
        setField(term6566, term6566.getClass(), "needsOverworldRain", term6727);
        setField(term6729, term6729.getClass(), "name", "bwlLFAfNWx");
        setField(term6729, term6729.getClass(), "url", "JWodNQzjjV");
        setField(term6566, term6566.getClass(), "partySpecies", term6729);
        setField(term6754, term6754.getClass(), "name", "CAgxWjhxNf");
        setField(term6754, term6754.getClass(), "url", "goAoCMhKBu");
        setField(term6566, term6566.getClass(), "partyType", term6754);
        setField(term6566, term6566.getClass(), "relativePhysicalStats", term6779);
        setField(term6566, term6566.getClass(), "timeOfDay", "BWxJSgKHRT");
        setField(term6793, term6793.getClass(), "name", "AGXoIndFnm");
        setField(term6793, term6793.getClass(), "url", "mwmFMNEzkK");
        setField(term6566, term6566.getClass(), "tradeSpecies", term6793);
        setField(term6566, term6566.getClass(), "turnUpsideDown", term6818);
        term6820 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6820, term6820.getClass(), "name", "BYrGukTyof");
        setField(term6820, term6820.getClass(), "url", "jiCGTTzKGB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term6820;
        callMethod(klass, "setKnownMoveType", argTypes, term6566, args);
    }

};


