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

public class EvolutionDetail_setNeedsOverworldRain_173631442124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11992;
     Object term12246;

    public EvolutionDetail_setNeedsOverworldRain_173631442124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12043 = new Integer(401512128);
        Integer term12145 = new Integer(-2069930777);
        Integer term12147 = new Integer(1543696412);
        Integer term12149 = new Integer(-1385748168);
        Integer term12151 = new Integer(-270592367);
        Boolean term12153 = new Boolean(true);
        Integer term12205 = new Integer(178847646);
        Boolean term12244 = new Boolean(true);
        term11992 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term11993 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12018 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12045 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12070 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12095 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12120 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12155 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12180 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12219 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term11993, term11993.getClass(), "name", "UbZGBpQZQW");
        setField(term11993, term11993.getClass(), "url", "SvGTualQPa");
        setField(term11992, term11992.getClass(), "item", term11993);
        setField(term12018, term12018.getClass(), "name", "mdxcgZwsaP");
        setField(term12018, term12018.getClass(), "url", "XildIRoZHG");
        setField(term11992, term11992.getClass(), "trigger", term12018);
        setField(term11992, term11992.getClass(), "gender", term12043);
        setField(term12045, term12045.getClass(), "name", "lEcrFlxJXH");
        setField(term12045, term12045.getClass(), "url", "VNdDwXMYxR");
        setField(term11992, term11992.getClass(), "heldItem", term12045);
        setField(term12070, term12070.getClass(), "name", "bVbexZPmwW");
        setField(term12070, term12070.getClass(), "url", "tvxYdqiyGc");
        setField(term11992, term11992.getClass(), "knownMove", term12070);
        setField(term12095, term12095.getClass(), "name", "ZEXFoMSKeG");
        setField(term12095, term12095.getClass(), "url", "HvxahUfZcJ");
        setField(term11992, term11992.getClass(), "knownMoveType", term12095);
        setField(term12120, term12120.getClass(), "name", "WkLpmqoQxy");
        setField(term12120, term12120.getClass(), "url", "XiNoscmYhd");
        setField(term11992, term11992.getClass(), "location", term12120);
        setField(term11992, term11992.getClass(), "minLevel", term12145);
        setField(term11992, term11992.getClass(), "minHappiness", term12147);
        setField(term11992, term11992.getClass(), "minBeauty", term12149);
        setField(term11992, term11992.getClass(), "minAffection", term12151);
        setField(term11992, term11992.getClass(), "needsOverworldRain", term12153);
        setField(term12155, term12155.getClass(), "name", "asMqnMNrZp");
        setField(term12155, term12155.getClass(), "url", "pqFUMTCKJd");
        setField(term11992, term11992.getClass(), "partySpecies", term12155);
        setField(term12180, term12180.getClass(), "name", "PTEndmPMzk");
        setField(term12180, term12180.getClass(), "url", "aJQuCOCvZs");
        setField(term11992, term11992.getClass(), "partyType", term12180);
        setField(term11992, term11992.getClass(), "relativePhysicalStats", term12205);
        setField(term11992, term11992.getClass(), "timeOfDay", "lHYNCJRiOv");
        setField(term12219, term12219.getClass(), "name", "QVLresHoaP");
        setField(term12219, term12219.getClass(), "url", "IbxeAMwLVt");
        setField(term11992, term11992.getClass(), "tradeSpecies", term12219);
        setField(term11992, term11992.getClass(), "turnUpsideDown", term12244);
        term12246 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term12246;
        callMethod(klass, "setNeedsOverworldRain", argTypes, term11992, args);
    }

};


