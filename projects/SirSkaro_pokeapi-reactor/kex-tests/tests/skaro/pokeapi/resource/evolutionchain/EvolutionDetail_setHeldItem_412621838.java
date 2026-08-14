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

public class EvolutionDetail_setHeldItem_412621838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4700;
     Object term4954;

    public EvolutionDetail_setHeldItem_412621838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4751 = new Integer(114279242);
        Integer term4853 = new Integer(990883365);
        Integer term4855 = new Integer(633598642);
        Integer term4857 = new Integer(1862841859);
        Integer term4859 = new Integer(-1114668574);
        Boolean term4861 = new Boolean(true);
        Integer term4913 = new Integer(514511037);
        Boolean term4952 = new Boolean(true);
        term4700 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term4701 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4726 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4753 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4778 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4803 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4828 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4863 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4888 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term4927 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4701, term4701.getClass(), "name", "MgLCedQfoj");
        setField(term4701, term4701.getClass(), "url", "zgKiINdgNu");
        setField(term4700, term4700.getClass(), "item", term4701);
        setField(term4726, term4726.getClass(), "name", "zLMTXDQHYH");
        setField(term4726, term4726.getClass(), "url", "PqywFWJlpE");
        setField(term4700, term4700.getClass(), "trigger", term4726);
        setField(term4700, term4700.getClass(), "gender", term4751);
        setField(term4753, term4753.getClass(), "name", "OzXRsFGTIp");
        setField(term4753, term4753.getClass(), "url", "TjWpyghUWN");
        setField(term4700, term4700.getClass(), "heldItem", term4753);
        setField(term4778, term4778.getClass(), "name", "dkZFDZxcde");
        setField(term4778, term4778.getClass(), "url", "WXcZEtUKlI");
        setField(term4700, term4700.getClass(), "knownMove", term4778);
        setField(term4803, term4803.getClass(), "name", "IkpjUOuWQU");
        setField(term4803, term4803.getClass(), "url", "boSSpezHeU");
        setField(term4700, term4700.getClass(), "knownMoveType", term4803);
        setField(term4828, term4828.getClass(), "name", "OUeBWNTQDh");
        setField(term4828, term4828.getClass(), "url", "gltJarNuUk");
        setField(term4700, term4700.getClass(), "location", term4828);
        setField(term4700, term4700.getClass(), "minLevel", term4853);
        setField(term4700, term4700.getClass(), "minHappiness", term4855);
        setField(term4700, term4700.getClass(), "minBeauty", term4857);
        setField(term4700, term4700.getClass(), "minAffection", term4859);
        setField(term4700, term4700.getClass(), "needsOverworldRain", term4861);
        setField(term4863, term4863.getClass(), "name", "ZwZIDwYcSW");
        setField(term4863, term4863.getClass(), "url", "sOdkipUKRu");
        setField(term4700, term4700.getClass(), "partySpecies", term4863);
        setField(term4888, term4888.getClass(), "name", "oKwCDqywym");
        setField(term4888, term4888.getClass(), "url", "zjZYTddemL");
        setField(term4700, term4700.getClass(), "partyType", term4888);
        setField(term4700, term4700.getClass(), "relativePhysicalStats", term4913);
        setField(term4700, term4700.getClass(), "timeOfDay", "QtrylgCLiF");
        setField(term4927, term4927.getClass(), "name", "orEuhCStGM");
        setField(term4927, term4927.getClass(), "url", "HhEaSXWvrY");
        setField(term4700, term4700.getClass(), "tradeSpecies", term4927);
        setField(term4700, term4700.getClass(), "turnUpsideDown", term4952);
        term4954 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term4954, term4954.getClass(), "name", "UkKvaeJfEC");
        setField(term4954, term4954.getClass(), "url", "WPxXsahPRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term4954;
        callMethod(klass, "setHeldItem", argTypes, term4700, args);
    }

};


