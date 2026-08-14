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

public class EvolutionDetail_setRelativePhysicalStats_27323128830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14748;
     Object term15002;

    public EvolutionDetail_setRelativePhysicalStats_27323128830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14799 = new Integer(993627098);
        Integer term14901 = new Integer(872295704);
        Integer term14903 = new Integer(86041387);
        Integer term14905 = new Integer(1010721666);
        Integer term14907 = new Integer(27043781);
        Boolean term14909 = new Boolean(true);
        Integer term14961 = new Integer(-1367122405);
        Boolean term15000 = new Boolean(true);
        term14748 = newInstance(Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail"));
        Object term14749 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14774 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14801 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14826 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14851 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14876 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14911 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14936 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term14975 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term14749, term14749.getClass(), "name", "kucsxnvbES");
        setField(term14749, term14749.getClass(), "url", "IdGzDFfcZf");
        setField(term14748, term14748.getClass(), "item", term14749);
        setField(term14774, term14774.getClass(), "name", "KDdRNhZmnU");
        setField(term14774, term14774.getClass(), "url", "iMsqJaKlDC");
        setField(term14748, term14748.getClass(), "trigger", term14774);
        setField(term14748, term14748.getClass(), "gender", term14799);
        setField(term14801, term14801.getClass(), "name", "aPkGHbZyjj");
        setField(term14801, term14801.getClass(), "url", "nSWdsVyJRI");
        setField(term14748, term14748.getClass(), "heldItem", term14801);
        setField(term14826, term14826.getClass(), "name", "JBOPGgGKnc");
        setField(term14826, term14826.getClass(), "url", "GlPTiCMCGP");
        setField(term14748, term14748.getClass(), "knownMove", term14826);
        setField(term14851, term14851.getClass(), "name", "jlcBpLoWfd");
        setField(term14851, term14851.getClass(), "url", "oYymmLqbfJ");
        setField(term14748, term14748.getClass(), "knownMoveType", term14851);
        setField(term14876, term14876.getClass(), "name", "YaDWphDOSz");
        setField(term14876, term14876.getClass(), "url", "nnnmCgFBLw");
        setField(term14748, term14748.getClass(), "location", term14876);
        setField(term14748, term14748.getClass(), "minLevel", term14901);
        setField(term14748, term14748.getClass(), "minHappiness", term14903);
        setField(term14748, term14748.getClass(), "minBeauty", term14905);
        setField(term14748, term14748.getClass(), "minAffection", term14907);
        setField(term14748, term14748.getClass(), "needsOverworldRain", term14909);
        setField(term14911, term14911.getClass(), "name", "hSSCyNEhyH");
        setField(term14911, term14911.getClass(), "url", "jDFNSuvZqm");
        setField(term14748, term14748.getClass(), "partySpecies", term14911);
        setField(term14936, term14936.getClass(), "name", "pLvkKHqNYX");
        setField(term14936, term14936.getClass(), "url", "PwqnuJJwjR");
        setField(term14748, term14748.getClass(), "partyType", term14936);
        setField(term14748, term14748.getClass(), "relativePhysicalStats", term14961);
        setField(term14748, term14748.getClass(), "timeOfDay", "NFkbBiPeiw");
        setField(term14975, term14975.getClass(), "name", "tlRvilQyjJ");
        setField(term14975, term14975.getClass(), "url", "gwTUlYNpjM");
        setField(term14748, term14748.getClass(), "tradeSpecies", term14975);
        setField(term14748, term14748.getClass(), "turnUpsideDown", term15000);
        term15002 = new Integer(-1703625118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.evolutionchain.EvolutionDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term15002;
        callMethod(klass, "setRelativePhysicalStats", argTypes, term14748, args);
    }

};


