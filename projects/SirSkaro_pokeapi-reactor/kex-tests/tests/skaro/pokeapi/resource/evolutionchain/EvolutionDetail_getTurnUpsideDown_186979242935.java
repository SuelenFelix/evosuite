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

public class EvolutionDetail_getTurnUpsideDown_186979242935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17037;

    public EvolutionDetail_getTurnUpsideDown_186979242935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17088 = new Integer(-271094506);
        Integer term17190 = new Integer(455632030);
        Integer term17192 = new Integer(-1632929393);
        Integer term17194 = new Integer(-431440129);
        Integer term17196 = new Integer(-763576148);
        Boolean term17198 = new Boolean(true);
        Integer term17250 = new Integer(1568948514);
        Boolean term17289 = new Boolean(true);
        term17037 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term17038 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17063 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17090 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17115 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17140 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17165 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17200 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17225 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term17264 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term17038, term17038.getClass(), "name", "mzCFLzFuSj");
        setField(term17038, term17038.getClass(), "url", "WQnMpDlSfA");
        setField(term17037, term17037.getClass(), "item", term17038);
        setField(term17063, term17063.getClass(), "name", "aOIvTQtXiv");
        setField(term17063, term17063.getClass(), "url", "IyjDiknqhA");
        setField(term17037, term17037.getClass(), "trigger", term17063);
        setField(term17037, term17037.getClass(), "gender", term17088);
        setField(term17090, term17090.getClass(), "name", "IHsXSAFYKi");
        setField(term17090, term17090.getClass(), "url", "KyGbLglqbW");
        setField(term17037, term17037.getClass(), "heldItem", term17090);
        setField(term17115, term17115.getClass(), "name", "ZKVeStsSNT");
        setField(term17115, term17115.getClass(), "url", "cqCXYaAnFB");
        setField(term17037, term17037.getClass(), "knownMove", term17115);
        setField(term17140, term17140.getClass(), "name", "UPLNFZHXjw");
        setField(term17140, term17140.getClass(), "url", "CwrrJlrGmg");
        setField(term17037, term17037.getClass(), "knownMoveType", term17140);
        setField(term17165, term17165.getClass(), "name", "HejzvyejjG");
        setField(term17165, term17165.getClass(), "url", "pbqJjeooBM");
        setField(term17037, term17037.getClass(), "location", term17165);
        setField(term17037, term17037.getClass(), "minLevel", term17190);
        setField(term17037, term17037.getClass(), "minHappiness", term17192);
        setField(term17037, term17037.getClass(), "minBeauty", term17194);
        setField(term17037, term17037.getClass(), "minAffection", term17196);
        setField(term17037, term17037.getClass(), "needsOverworldRain", term17198);
        setField(term17200, term17200.getClass(), "name", "ccnotFfPXt");
        setField(term17200, term17200.getClass(), "url", "plWlgdgIhn");
        setField(term17037, term17037.getClass(), "partySpecies", term17200);
        setField(term17225, term17225.getClass(), "name", "RZaKVKWtND");
        setField(term17225, term17225.getClass(), "url", "vXiaNiquft");
        setField(term17037, term17037.getClass(), "partyType", term17225);
        setField(term17037, term17037.getClass(), "relativePhysicalStats", term17250);
        setField(term17037, term17037.getClass(), "timeOfDay", "lucCeiVnYe");
        setField(term17264, term17264.getClass(), "name", "iYwkCLMsbJ");
        setField(term17264, term17264.getClass(), "url", "MXLsVQWrwc");
        setField(term17037, term17037.getClass(), "tradeSpecies", term17264);
        setField(term17037, term17037.getClass(), "turnUpsideDown", term17289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTurnUpsideDown", argTypes, term17037, args);
    }

};


