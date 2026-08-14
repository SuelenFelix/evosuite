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

public class EvolutionDetail_getMinBeauty_76439365219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9768;

    public EvolutionDetail_getMinBeauty_76439365219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9819 = new Integer(299791142);
        Integer term9921 = new Integer(1862191391);
        Integer term9923 = new Integer(1131398807);
        Integer term9925 = new Integer(-344907703);
        Integer term9927 = new Integer(824341437);
        Boolean term9929 = new Boolean(false);
        Integer term9981 = new Integer(-1794965320);
        Boolean term10020 = new Boolean(false);
        term9768 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term9769 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9794 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9821 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9846 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9871 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9896 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9931 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9956 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9995 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term9769, term9769.getClass(), "name", "IkfarsYNJO");
        setField(term9769, term9769.getClass(), "url", "aZKOWhHMEh");
        setField(term9768, term9768.getClass(), "item", term9769);
        setField(term9794, term9794.getClass(), "name", "YfkhviKZwl");
        setField(term9794, term9794.getClass(), "url", "DcOhhAfJTI");
        setField(term9768, term9768.getClass(), "trigger", term9794);
        setField(term9768, term9768.getClass(), "gender", term9819);
        setField(term9821, term9821.getClass(), "name", "gYTIkBFOoS");
        setField(term9821, term9821.getClass(), "url", "xmzSoVgiED");
        setField(term9768, term9768.getClass(), "heldItem", term9821);
        setField(term9846, term9846.getClass(), "name", "pdSvedKgPq");
        setField(term9846, term9846.getClass(), "url", "epPTwvcoyb");
        setField(term9768, term9768.getClass(), "knownMove", term9846);
        setField(term9871, term9871.getClass(), "name", "UBPHmOICBs");
        setField(term9871, term9871.getClass(), "url", "IDJUVPgUJf");
        setField(term9768, term9768.getClass(), "knownMoveType", term9871);
        setField(term9896, term9896.getClass(), "name", "JmnWRJUxGr");
        setField(term9896, term9896.getClass(), "url", "wgRGBNrTGP");
        setField(term9768, term9768.getClass(), "location", term9896);
        setField(term9768, term9768.getClass(), "minLevel", term9921);
        setField(term9768, term9768.getClass(), "minHappiness", term9923);
        setField(term9768, term9768.getClass(), "minBeauty", term9925);
        setField(term9768, term9768.getClass(), "minAffection", term9927);
        setField(term9768, term9768.getClass(), "needsOverworldRain", term9929);
        setField(term9931, term9931.getClass(), "name", "FIdNVptZpW");
        setField(term9931, term9931.getClass(), "url", "rQjxAhisjm");
        setField(term9768, term9768.getClass(), "partySpecies", term9931);
        setField(term9956, term9956.getClass(), "name", "ZDhASPHjDG");
        setField(term9956, term9956.getClass(), "url", "HNVOAXYNEZ");
        setField(term9768, term9768.getClass(), "partyType", term9956);
        setField(term9768, term9768.getClass(), "relativePhysicalStats", term9981);
        setField(term9768, term9768.getClass(), "timeOfDay", "gbbYBYyfvr");
        setField(term9995, term9995.getClass(), "name", "SrWMUlbtWV");
        setField(term9995, term9995.getClass(), "url", "VePIumgrrU");
        setField(term9768, term9768.getClass(), "tradeSpecies", term9995);
        setField(term9768, term9768.getClass(), "turnUpsideDown", term10020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinBeauty", argTypes, term9768, args);
    }

};


