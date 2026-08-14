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

public class EvolutionDetail_getKnownMoveType_161723279711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6122;

    public EvolutionDetail_getKnownMoveType_161723279711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6173 = new Integer(2068435279);
        Integer term6275 = new Integer(-1556527718);
        Integer term6277 = new Integer(895255351);
        Integer term6279 = new Integer(-1317044799);
        Integer term6281 = new Integer(-1428063820);
        Boolean term6283 = new Boolean(false);
        Integer term6335 = new Integer(-1271375703);
        Boolean term6374 = new Boolean(false);
        term6122 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term6123 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6175 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6200 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6225 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6250 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6285 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6310 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term6349 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term6123, term6123.getClass(), "name", "yevIIoVYHq");
        setField(term6123, term6123.getClass(), "url", "UuYWMTqWTV");
        setField(term6122, term6122.getClass(), "item", term6123);
        setField(term6148, term6148.getClass(), "name", "DSFGlcaXUb");
        setField(term6148, term6148.getClass(), "url", "sHMXNUzNeM");
        setField(term6122, term6122.getClass(), "trigger", term6148);
        setField(term6122, term6122.getClass(), "gender", term6173);
        setField(term6175, term6175.getClass(), "name", "gPzGDOEPPw");
        setField(term6175, term6175.getClass(), "url", "rwKoAngzCu");
        setField(term6122, term6122.getClass(), "heldItem", term6175);
        setField(term6200, term6200.getClass(), "name", "VUkRVwROTl");
        setField(term6200, term6200.getClass(), "url", "UDlkdccCRn");
        setField(term6122, term6122.getClass(), "knownMove", term6200);
        setField(term6225, term6225.getClass(), "name", "McpzErOcYb");
        setField(term6225, term6225.getClass(), "url", "jqrVEUvYEz");
        setField(term6122, term6122.getClass(), "knownMoveType", term6225);
        setField(term6250, term6250.getClass(), "name", "QITgiBrmfj");
        setField(term6250, term6250.getClass(), "url", "pXxkiXgQnq");
        setField(term6122, term6122.getClass(), "location", term6250);
        setField(term6122, term6122.getClass(), "minLevel", term6275);
        setField(term6122, term6122.getClass(), "minHappiness", term6277);
        setField(term6122, term6122.getClass(), "minBeauty", term6279);
        setField(term6122, term6122.getClass(), "minAffection", term6281);
        setField(term6122, term6122.getClass(), "needsOverworldRain", term6283);
        setField(term6285, term6285.getClass(), "name", "tKmrUDURku");
        setField(term6285, term6285.getClass(), "url", "JeZbrwZmsP");
        setField(term6122, term6122.getClass(), "partySpecies", term6285);
        setField(term6310, term6310.getClass(), "name", "bxyfeicqrK");
        setField(term6310, term6310.getClass(), "url", "vBnWPlsZMk");
        setField(term6122, term6122.getClass(), "partyType", term6310);
        setField(term6122, term6122.getClass(), "relativePhysicalStats", term6335);
        setField(term6122, term6122.getClass(), "timeOfDay", "fIZsWucfXz");
        setField(term6349, term6349.getClass(), "name", "IApvtmfhnq");
        setField(term6349, term6349.getClass(), "url", "VSaNnhMpRc");
        setField(term6122, term6122.getClass(), "tradeSpecies", term6349);
        setField(term6122, term6122.getClass(), "turnUpsideDown", term6374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKnownMoveType", argTypes, term6122, args);
    }

};


