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

public class EvolutionDetail_getTrigger_4576348033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2433;

    public EvolutionDetail_getTrigger_4576348033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2484 = new Integer(-1736183862);
        Integer term2586 = new Integer(897010381);
        Integer term2588 = new Integer(-15712667);
        Integer term2590 = new Integer(1964967720);
        Integer term2592 = new Integer(1351900243);
        Boolean term2594 = new Boolean(false);
        Integer term2646 = new Integer(-330897705);
        Boolean term2685 = new Boolean(false);
        term2433 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term2434 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2459 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2486 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2511 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2536 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2561 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2596 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2621 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term2660 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term2434, term2434.getClass(), "name", "TtGbVmKcnX");
        setField(term2434, term2434.getClass(), "url", "GJVkUrCVdD");
        setField(term2433, term2433.getClass(), "item", term2434);
        setField(term2459, term2459.getClass(), "name", "zNdorvdUgu");
        setField(term2459, term2459.getClass(), "url", "oPxuZbkYio");
        setField(term2433, term2433.getClass(), "trigger", term2459);
        setField(term2433, term2433.getClass(), "gender", term2484);
        setField(term2486, term2486.getClass(), "name", "vKitydDVnM");
        setField(term2486, term2486.getClass(), "url", "urCiQnUFBM");
        setField(term2433, term2433.getClass(), "heldItem", term2486);
        setField(term2511, term2511.getClass(), "name", "EKjQdtKxAM");
        setField(term2511, term2511.getClass(), "url", "TXZAIPQJHt");
        setField(term2433, term2433.getClass(), "knownMove", term2511);
        setField(term2536, term2536.getClass(), "name", "DIbeDHICho");
        setField(term2536, term2536.getClass(), "url", "dJGPlmSRnz");
        setField(term2433, term2433.getClass(), "knownMoveType", term2536);
        setField(term2561, term2561.getClass(), "name", "DPskuFUobI");
        setField(term2561, term2561.getClass(), "url", "wBGfLpNNiZ");
        setField(term2433, term2433.getClass(), "location", term2561);
        setField(term2433, term2433.getClass(), "minLevel", term2586);
        setField(term2433, term2433.getClass(), "minHappiness", term2588);
        setField(term2433, term2433.getClass(), "minBeauty", term2590);
        setField(term2433, term2433.getClass(), "minAffection", term2592);
        setField(term2433, term2433.getClass(), "needsOverworldRain", term2594);
        setField(term2596, term2596.getClass(), "name", "yUGCjlqgJE");
        setField(term2596, term2596.getClass(), "url", "PXdVZyoJyC");
        setField(term2433, term2433.getClass(), "partySpecies", term2596);
        setField(term2621, term2621.getClass(), "name", "vLerpqavFM");
        setField(term2621, term2621.getClass(), "url", "qnvxzwuGKX");
        setField(term2433, term2433.getClass(), "partyType", term2621);
        setField(term2433, term2433.getClass(), "relativePhysicalStats", term2646);
        setField(term2433, term2433.getClass(), "timeOfDay", "EdPAvpluZg");
        setField(term2660, term2660.getClass(), "name", "DzHVBMqWtE");
        setField(term2660, term2660.getClass(), "url", "THZSpzBRYP");
        setField(term2433, term2433.getClass(), "tradeSpecies", term2660);
        setField(term2433, term2433.getClass(), "turnUpsideDown", term2685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrigger", argTypes, term2433, args);
    }

};


