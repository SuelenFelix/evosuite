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

public class EvolutionDetail_getTradeSpecies_27616901733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16104;

    public EvolutionDetail_getTradeSpecies_27616901733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term16155 = new Integer(-497534255);
        Integer term16257 = new Integer(1588942911);
        Integer term16259 = new Integer(-2129828854);
        Integer term16261 = new Integer(-47438786);
        Integer term16263 = new Integer(-1955400589);
        Boolean term16265 = new Boolean(false);
        Integer term16317 = new Integer(626179200);
        Boolean term16356 = new Boolean(false);
        term16104 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term16105 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16130 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16157 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16182 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16207 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16232 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16267 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16292 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term16331 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term16105, term16105.getClass(), "name", "HegRNsidFg");
        setField(term16105, term16105.getClass(), "url", "udRdJkgXmH");
        setField(term16104, term16104.getClass(), "item", term16105);
        setField(term16130, term16130.getClass(), "name", "FBCXbjHVXO");
        setField(term16130, term16130.getClass(), "url", "dIWAnvmLiC");
        setField(term16104, term16104.getClass(), "trigger", term16130);
        setField(term16104, term16104.getClass(), "gender", term16155);
        setField(term16157, term16157.getClass(), "name", "CuWebzZQjZ");
        setField(term16157, term16157.getClass(), "url", "wRVaaJxKYI");
        setField(term16104, term16104.getClass(), "heldItem", term16157);
        setField(term16182, term16182.getClass(), "name", "yOQuJXRvOo");
        setField(term16182, term16182.getClass(), "url", "XmLHcnVsch");
        setField(term16104, term16104.getClass(), "knownMove", term16182);
        setField(term16207, term16207.getClass(), "name", "Yrvtdcltri");
        setField(term16207, term16207.getClass(), "url", "RxrsjXRVcT");
        setField(term16104, term16104.getClass(), "knownMoveType", term16207);
        setField(term16232, term16232.getClass(), "name", "cfRimmJxqA");
        setField(term16232, term16232.getClass(), "url", "oOnRVGqFmy");
        setField(term16104, term16104.getClass(), "location", term16232);
        setField(term16104, term16104.getClass(), "minLevel", term16257);
        setField(term16104, term16104.getClass(), "minHappiness", term16259);
        setField(term16104, term16104.getClass(), "minBeauty", term16261);
        setField(term16104, term16104.getClass(), "minAffection", term16263);
        setField(term16104, term16104.getClass(), "needsOverworldRain", term16265);
        setField(term16267, term16267.getClass(), "name", "LaXzFIlWMk");
        setField(term16267, term16267.getClass(), "url", "GuVQjhBxma");
        setField(term16104, term16104.getClass(), "partySpecies", term16267);
        setField(term16292, term16292.getClass(), "name", "WAVMPPbIfL");
        setField(term16292, term16292.getClass(), "url", "GISHLsgALf");
        setField(term16104, term16104.getClass(), "partyType", term16292);
        setField(term16104, term16104.getClass(), "relativePhysicalStats", term16317);
        setField(term16104, term16104.getClass(), "timeOfDay", "PVykkUSgBq");
        setField(term16331, term16331.getClass(), "name", "tnKbZaCsuj");
        setField(term16331, term16331.getClass(), "url", "ZFpcYBgLNC");
        setField(term16104, term16104.getClass(), "tradeSpecies", term16331);
        setField(term16104, term16104.getClass(), "turnUpsideDown", term16356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTradeSpecies", argTypes, term16104, args);
    }

};


