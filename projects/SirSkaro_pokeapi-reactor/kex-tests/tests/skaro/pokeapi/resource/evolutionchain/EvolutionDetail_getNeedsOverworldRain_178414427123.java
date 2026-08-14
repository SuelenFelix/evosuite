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

public class EvolutionDetail_getNeedsOverworldRain_178414427123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11548;

    public EvolutionDetail_getNeedsOverworldRain_178414427123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term11599 = new Integer(1213549815);
        Integer term11701 = new Integer(-1518419301);
        Integer term11703 = new Integer(674879025);
        Integer term11705 = new Integer(-1538936030);
        Integer term11707 = new Integer(-752870423);
        Boolean term11709 = new Boolean(true);
        Integer term11761 = new Integer(-1698809299);
        Boolean term11800 = new Boolean(true);
        term11548 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term11549 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11574 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11601 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11626 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11651 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11676 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11711 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term11775 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term11549, term11549.getClass(), "name", "QgHhxMyKvr");
        setField(term11549, term11549.getClass(), "url", "VGiXZZTWRO");
        setField(term11548, term11548.getClass(), "item", term11549);
        setField(term11574, term11574.getClass(), "name", "MlPtwXnJOJ");
        setField(term11574, term11574.getClass(), "url", "DbfiyFeaTe");
        setField(term11548, term11548.getClass(), "trigger", term11574);
        setField(term11548, term11548.getClass(), "gender", term11599);
        setField(term11601, term11601.getClass(), "name", "dQxXGBtDLZ");
        setField(term11601, term11601.getClass(), "url", "EgSgEFIyyN");
        setField(term11548, term11548.getClass(), "heldItem", term11601);
        setField(term11626, term11626.getClass(), "name", "iAOFcXaLSf");
        setField(term11626, term11626.getClass(), "url", "EHoNUaeyvT");
        setField(term11548, term11548.getClass(), "knownMove", term11626);
        setField(term11651, term11651.getClass(), "name", "ZwKmasCVIy");
        setField(term11651, term11651.getClass(), "url", "pxokrVaeMd");
        setField(term11548, term11548.getClass(), "knownMoveType", term11651);
        setField(term11676, term11676.getClass(), "name", "ujxmmZZcbT");
        setField(term11676, term11676.getClass(), "url", "BOvgwHfoHQ");
        setField(term11548, term11548.getClass(), "location", term11676);
        setField(term11548, term11548.getClass(), "minLevel", term11701);
        setField(term11548, term11548.getClass(), "minHappiness", term11703);
        setField(term11548, term11548.getClass(), "minBeauty", term11705);
        setField(term11548, term11548.getClass(), "minAffection", term11707);
        setField(term11548, term11548.getClass(), "needsOverworldRain", term11709);
        setField(term11711, term11711.getClass(), "name", "hPpFNeDBIb");
        setField(term11711, term11711.getClass(), "url", "DNOtiLPAIY");
        setField(term11548, term11548.getClass(), "partySpecies", term11711);
        setField(term11736, term11736.getClass(), "name", "FnEkAHBfyV");
        setField(term11736, term11736.getClass(), "url", "VfmNFpEuax");
        setField(term11548, term11548.getClass(), "partyType", term11736);
        setField(term11548, term11548.getClass(), "relativePhysicalStats", term11761);
        setField(term11548, term11548.getClass(), "timeOfDay", "ANHjlWPmZG");
        setField(term11775, term11775.getClass(), "name", "SibzENsyyy");
        setField(term11775, term11775.getClass(), "url", "mrqGHotaef");
        setField(term11548, term11548.getClass(), "tradeSpecies", term11775);
        setField(term11548, term11548.getClass(), "turnUpsideDown", term11800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNeedsOverworldRain", argTypes, term11548, args);
    }

};


