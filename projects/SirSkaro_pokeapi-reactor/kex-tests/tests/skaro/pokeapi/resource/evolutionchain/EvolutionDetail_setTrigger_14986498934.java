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

public class EvolutionDetail_setTrigger_14986498934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2877;
     Object term3131;

    public EvolutionDetail_setTrigger_14986498934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2928 = new Integer(1065595802);
        Integer term3030 = new Integer(21031843);
        Integer term3032 = new Integer(-380787857);
        Integer term3034 = new Integer(319853052);
        Integer term3036 = new Integer(-1097563716);
        Boolean term3038 = new Boolean(false);
        Integer term3090 = new Integer(1572907769);
        Boolean term3129 = new Boolean(false);
        term2877 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term2878 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2903 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2930 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2955 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2980 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3005 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3040 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3065 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2878, term2878.getClass(), "name", "ZfBIVGBQOE");
        setField(term2878, term2878.getClass(), "url", "QSrDQfEsTR");
        setField(term2877, term2877.getClass(), "item", term2878);
        setField(term2903, term2903.getClass(), "name", "PsqusYmejD");
        setField(term2903, term2903.getClass(), "url", "NTWMiBEaDF");
        setField(term2877, term2877.getClass(), "trigger", term2903);
        setField(term2877, term2877.getClass(), "gender", term2928);
        setField(term2930, term2930.getClass(), "name", "SPBstwKFVr");
        setField(term2930, term2930.getClass(), "url", "WxYUTuqmIq");
        setField(term2877, term2877.getClass(), "heldItem", term2930);
        setField(term2955, term2955.getClass(), "name", "OeQLvhVERT");
        setField(term2955, term2955.getClass(), "url", "IlvgFINwIa");
        setField(term2877, term2877.getClass(), "knownMove", term2955);
        setField(term2980, term2980.getClass(), "name", "GEJABPlHSI");
        setField(term2980, term2980.getClass(), "url", "aQFUvuaYxd");
        setField(term2877, term2877.getClass(), "knownMoveType", term2980);
        setField(term3005, term3005.getClass(), "name", "zNFLXMifnS");
        setField(term3005, term3005.getClass(), "url", "HHQcYMSBVc");
        setField(term2877, term2877.getClass(), "location", term3005);
        setField(term2877, term2877.getClass(), "minLevel", term3030);
        setField(term2877, term2877.getClass(), "minHappiness", term3032);
        setField(term2877, term2877.getClass(), "minBeauty", term3034);
        setField(term2877, term2877.getClass(), "minAffection", term3036);
        setField(term2877, term2877.getClass(), "needsOverworldRain", term3038);
        setField(term3040, term3040.getClass(), "name", "wdoqITnaAP");
        setField(term3040, term3040.getClass(), "url", "rIPMBcrNqB");
        setField(term2877, term2877.getClass(), "partySpecies", term3040);
        setField(term3065, term3065.getClass(), "name", "UDaboHZHhz");
        setField(term3065, term3065.getClass(), "url", "nRvKihUSPj");
        setField(term2877, term2877.getClass(), "partyType", term3065);
        setField(term2877, term2877.getClass(), "relativePhysicalStats", term3090);
        setField(term2877, term2877.getClass(), "timeOfDay", "BbNeQJpYPr");
        setField(term3104, term3104.getClass(), "name", "riMtzCoxNj");
        setField(term3104, term3104.getClass(), "url", "YAXkVjQZcV");
        setField(term2877, term2877.getClass(), "tradeSpecies", term3104);
        setField(term2877, term2877.getClass(), "turnUpsideDown", term3129);
        term3131 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3131, term3131.getClass(), "name", "RDnkgWkcbz");
        setField(term3131, term3131.getClass(), "url", "IBpaxltauX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term3131;
        callMethod(klass, "setTrigger", argTypes, term2877, args);
    }

};


