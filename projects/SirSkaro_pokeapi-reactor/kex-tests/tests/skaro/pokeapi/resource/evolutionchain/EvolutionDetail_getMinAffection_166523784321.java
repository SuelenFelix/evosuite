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

public class EvolutionDetail_getMinAffection_166523784321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10658;

    public EvolutionDetail_getMinAffection_166523784321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term10709 = new Integer(470895808);
        Integer term10811 = new Integer(1787325291);
        Integer term10813 = new Integer(1470349147);
        Integer term10815 = new Integer(-255317272);
        Integer term10817 = new Integer(-706253892);
        Boolean term10819 = new Boolean(true);
        Integer term10871 = new Integer(-1341439819);
        Boolean term10910 = new Boolean(false);
        term10658 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term10659 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10684 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10711 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10736 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10761 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10786 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10821 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10846 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term10885 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term10659, term10659.getClass(), "name", "njvnWFTMxN");
        setField(term10659, term10659.getClass(), "url", "fLRqcTSfzF");
        setField(term10658, term10658.getClass(), "item", term10659);
        setField(term10684, term10684.getClass(), "name", "EBYHwsuWAU");
        setField(term10684, term10684.getClass(), "url", "PtIjKpiSix");
        setField(term10658, term10658.getClass(), "trigger", term10684);
        setField(term10658, term10658.getClass(), "gender", term10709);
        setField(term10711, term10711.getClass(), "name", "NZdTuwSCIM");
        setField(term10711, term10711.getClass(), "url", "dDHcmzPAmP");
        setField(term10658, term10658.getClass(), "heldItem", term10711);
        setField(term10736, term10736.getClass(), "name", "HEaTkWYBgv");
        setField(term10736, term10736.getClass(), "url", "MpJsPKLTIU");
        setField(term10658, term10658.getClass(), "knownMove", term10736);
        setField(term10761, term10761.getClass(), "name", "IiNCZfdouL");
        setField(term10761, term10761.getClass(), "url", "AhOHzCsHKW");
        setField(term10658, term10658.getClass(), "knownMoveType", term10761);
        setField(term10786, term10786.getClass(), "name", "UqgLPaaAHi");
        setField(term10786, term10786.getClass(), "url", "xypryEkUPF");
        setField(term10658, term10658.getClass(), "location", term10786);
        setField(term10658, term10658.getClass(), "minLevel", term10811);
        setField(term10658, term10658.getClass(), "minHappiness", term10813);
        setField(term10658, term10658.getClass(), "minBeauty", term10815);
        setField(term10658, term10658.getClass(), "minAffection", term10817);
        setField(term10658, term10658.getClass(), "needsOverworldRain", term10819);
        setField(term10821, term10821.getClass(), "name", "zyZTzHNjQr");
        setField(term10821, term10821.getClass(), "url", "YSrFKQQwXE");
        setField(term10658, term10658.getClass(), "partySpecies", term10821);
        setField(term10846, term10846.getClass(), "name", "qxhOsmyyjm");
        setField(term10846, term10846.getClass(), "url", "DuKcNfVVYR");
        setField(term10658, term10658.getClass(), "partyType", term10846);
        setField(term10658, term10658.getClass(), "relativePhysicalStats", term10871);
        setField(term10658, term10658.getClass(), "timeOfDay", "fRujHWvXjJ");
        setField(term10885, term10885.getClass(), "name", "EAIAAStlTz");
        setField(term10885, term10885.getClass(), "url", "yIWXcOQTgy");
        setField(term10658, term10658.getClass(), "tradeSpecies", term10885);
        setField(term10658, term10658.getClass(), "turnUpsideDown", term10910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinAffection", argTypes, term10658, args);
    }

};


