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

public class EvolutionDetail_getMinHappiness_61015927117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8878;

    public EvolutionDetail_getMinHappiness_61015927117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8929 = new Integer(-1626451656);
        Integer term9031 = new Integer(173952451);
        Integer term9033 = new Integer(-1972033388);
        Integer term9035 = new Integer(-1005024758);
        Integer term9037 = new Integer(2634669);
        Boolean term9039 = new Boolean(false);
        Integer term9091 = new Integer(-1912429941);
        Boolean term9130 = new Boolean(false);
        term8878 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term8879 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8904 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8931 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8956 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term8981 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9006 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9041 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9066 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term9105 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term8879, term8879.getClass(), "name", "XMHwbfiHRl");
        setField(term8879, term8879.getClass(), "url", "bucTnYicnp");
        setField(term8878, term8878.getClass(), "item", term8879);
        setField(term8904, term8904.getClass(), "name", "EkgprvqZlM");
        setField(term8904, term8904.getClass(), "url", "fbnKvthhOz");
        setField(term8878, term8878.getClass(), "trigger", term8904);
        setField(term8878, term8878.getClass(), "gender", term8929);
        setField(term8931, term8931.getClass(), "name", "PGfCDJTBek");
        setField(term8931, term8931.getClass(), "url", "ZwjARhAtHC");
        setField(term8878, term8878.getClass(), "heldItem", term8931);
        setField(term8956, term8956.getClass(), "name", "XXvscsYBWv");
        setField(term8956, term8956.getClass(), "url", "uePedtiAfL");
        setField(term8878, term8878.getClass(), "knownMove", term8956);
        setField(term8981, term8981.getClass(), "name", "AdSHvysxQB");
        setField(term8981, term8981.getClass(), "url", "jlraKkBWFA");
        setField(term8878, term8878.getClass(), "knownMoveType", term8981);
        setField(term9006, term9006.getClass(), "name", "mRBtFTxVdE");
        setField(term9006, term9006.getClass(), "url", "IVacFDAZcj");
        setField(term8878, term8878.getClass(), "location", term9006);
        setField(term8878, term8878.getClass(), "minLevel", term9031);
        setField(term8878, term8878.getClass(), "minHappiness", term9033);
        setField(term8878, term8878.getClass(), "minBeauty", term9035);
        setField(term8878, term8878.getClass(), "minAffection", term9037);
        setField(term8878, term8878.getClass(), "needsOverworldRain", term9039);
        setField(term9041, term9041.getClass(), "name", "EEYmuwyVDP");
        setField(term9041, term9041.getClass(), "url", "EWFbEDAVrE");
        setField(term8878, term8878.getClass(), "partySpecies", term9041);
        setField(term9066, term9066.getClass(), "name", "EMiMtYgfvr");
        setField(term9066, term9066.getClass(), "url", "OyYyYYnJuF");
        setField(term8878, term8878.getClass(), "partyType", term9066);
        setField(term8878, term8878.getClass(), "relativePhysicalStats", term9091);
        setField(term8878, term8878.getClass(), "timeOfDay", "aYLvcxZohT");
        setField(term9105, term9105.getClass(), "name", "mnHyQbMyld");
        setField(term9105, term9105.getClass(), "url", "KHtaDOIcJZ");
        setField(term8878, term8878.getClass(), "tradeSpecies", term9105);
        setField(term8878, term8878.getClass(), "turnUpsideDown", term9130);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinHappiness", argTypes, term8878, args);
    }

};


