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

public class EvolutionDetail_setPartySpecies_203611203926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12882;
     Object term13136;

    public EvolutionDetail_setPartySpecies_203611203926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12933 = new Integer(1532723756);
        Integer term13035 = new Integer(-124088550);
        Integer term13037 = new Integer(777492093);
        Integer term13039 = new Integer(1414025609);
        Integer term13041 = new Integer(255145822);
        Boolean term13043 = new Boolean(false);
        Integer term13095 = new Integer(-573608449);
        Boolean term13134 = new Boolean(false);
        term12882 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term12883 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12908 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12935 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12960 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term12985 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13010 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13045 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13070 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term13109 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term12883, term12883.getClass(), "name", "zSfoqzJbPT");
        setField(term12883, term12883.getClass(), "url", "QUymMnsCIj");
        setField(term12882, term12882.getClass(), "item", term12883);
        setField(term12908, term12908.getClass(), "name", "ikTtOgdVYS");
        setField(term12908, term12908.getClass(), "url", "JptuwlirlS");
        setField(term12882, term12882.getClass(), "trigger", term12908);
        setField(term12882, term12882.getClass(), "gender", term12933);
        setField(term12935, term12935.getClass(), "name", "TKOMaGswbU");
        setField(term12935, term12935.getClass(), "url", "YcTbglHiUq");
        setField(term12882, term12882.getClass(), "heldItem", term12935);
        setField(term12960, term12960.getClass(), "name", "TiUqHrjoEU");
        setField(term12960, term12960.getClass(), "url", "eoEvZbdLjL");
        setField(term12882, term12882.getClass(), "knownMove", term12960);
        setField(term12985, term12985.getClass(), "name", "BkIxsyPkGy");
        setField(term12985, term12985.getClass(), "url", "mrMGwoRgVY");
        setField(term12882, term12882.getClass(), "knownMoveType", term12985);
        setField(term13010, term13010.getClass(), "name", "mxVLTgCwki");
        setField(term13010, term13010.getClass(), "url", "wCurppnDSA");
        setField(term12882, term12882.getClass(), "location", term13010);
        setField(term12882, term12882.getClass(), "minLevel", term13035);
        setField(term12882, term12882.getClass(), "minHappiness", term13037);
        setField(term12882, term12882.getClass(), "minBeauty", term13039);
        setField(term12882, term12882.getClass(), "minAffection", term13041);
        setField(term12882, term12882.getClass(), "needsOverworldRain", term13043);
        setField(term13045, term13045.getClass(), "name", "JydxSNTMYt");
        setField(term13045, term13045.getClass(), "url", "KpurAcrHYT");
        setField(term12882, term12882.getClass(), "partySpecies", term13045);
        setField(term13070, term13070.getClass(), "name", "QjvDwgKJGz");
        setField(term13070, term13070.getClass(), "url", "ngYxiXTZrk");
        setField(term12882, term12882.getClass(), "partyType", term13070);
        setField(term12882, term12882.getClass(), "relativePhysicalStats", term13095);
        setField(term12882, term12882.getClass(), "timeOfDay", "YTxBqWRAlo");
        setField(term13109, term13109.getClass(), "name", "ReruUQRXwl");
        setField(term13109, term13109.getClass(), "url", "DWEsVQwuaE");
        setField(term12882, term12882.getClass(), "tradeSpecies", term13109);
        setField(term12882, term12882.getClass(), "turnUpsideDown", term13134);
        term13136 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term13136, term13136.getClass(), "name", "HUgzMgrpsK");
        setField(term13136, term13136.getClass(), "url", "ubaBUfLolu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term13136;
        callMethod(klass, "setPartySpecies", argTypes, term12882, args);
    }

};


