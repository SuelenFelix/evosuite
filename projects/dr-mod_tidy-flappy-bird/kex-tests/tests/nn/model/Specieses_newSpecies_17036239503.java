package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Specieses_newSpecies_17036239503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;
     Object term2945;

    public Specieses_newSpecies_17036239503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2941 = new ArrayList();
        term2940 = newInstance(Class.forName("nn.model.Specieses"));
        setField(term2940, term2940.getClass(), "specieses", term2941);
        Object term2949 = newInstance(Class.forName("nn.model.Node"));
        setField(term2949, term2949.getClass(), "type", null);
        setIntField(term2949, term2949.getClass(), "innovation", -680920524);
        setField(term2949, term2949.getClass(), "connections", null);
        setDoubleField(term2949, term2949.getClass(), "bias", 0.7361083671494018);
        Object term2952 = newInstance(Class.forName("nn.model.Node"));
        setField(term2952, term2952.getClass(), "type", null);
        setIntField(term2952, term2952.getClass(), "innovation", 0);
        setField(term2952, term2952.getClass(), "connections", null);
        setDoubleField(term2952, term2952.getClass(), "bias", 0.0);
        Object term2955 = newInstance(Class.forName("nn.model.Node"));
        setField(term2955, term2955.getClass(), "type", null);
        setIntField(term2955, term2955.getClass(), "innovation", -43417861);
        setField(term2955, term2955.getClass(), "connections", null);
        setDoubleField(term2955, term2955.getClass(), "bias", 0.6420798930164424);
        Object term2958 = newInstance(Class.forName("nn.model.Node"));
        setField(term2958, term2958.getClass(), "type", null);
        setIntField(term2958, term2958.getClass(), "innovation", 0);
        setField(term2958, term2958.getClass(), "connections", null);
        setDoubleField(term2958, term2958.getClass(), "bias", 0.0);
        ArrayList term2947 = new ArrayList();
        ((ArrayList) term2947).add(term2949);
        ((ArrayList) term2947).add(term2952);
        ((ArrayList) term2947).add(term2952);
        ((ArrayList) term2947).add(term2955);
        ((ArrayList) term2947).add(term2958);
        Object term2965 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2965, term2965.getClass(), "in", null);
        setField(term2965, term2965.getClass(), "out", null);
        setFloatField(term2965, term2965.getClass(), "weight", 0.8454723F);
        setBooleanField(term2965, term2965.getClass(), "expressed", true);
        setIntField(term2965, term2965.getClass(), "innovation", -1467089634);
        Object term2969 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2969, term2969.getClass(), "in", null);
        setField(term2969, term2969.getClass(), "out", term2958);
        setFloatField(term2969, term2969.getClass(), "weight", 0.26573372F);
        setBooleanField(term2969, term2969.getClass(), "expressed", true);
        setIntField(term2969, term2969.getClass(), "innovation", 1768204942);
        Object term2973 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2973, term2973.getClass(), "in", null);
        setField(term2973, term2973.getClass(), "out", term2949);
        setFloatField(term2973, term2973.getClass(), "weight", 0.85665673F);
        setBooleanField(term2973, term2973.getClass(), "expressed", false);
        setIntField(term2973, term2973.getClass(), "innovation", 1901317214);
        Object term2977 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2977, term2977.getClass(), "in", null);
        setField(term2977, term2977.getClass(), "out", null);
        setFloatField(term2977, term2977.getClass(), "weight", 0.92038053F);
        setBooleanField(term2977, term2977.getClass(), "expressed", true);
        setIntField(term2977, term2977.getClass(), "innovation", -1070592289);
        Object term2981 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2981, term2981.getClass(), "in", term2952);
        setField(term2981, term2981.getClass(), "out", null);
        setFloatField(term2981, term2981.getClass(), "weight", 0.35686338F);
        setBooleanField(term2981, term2981.getClass(), "expressed", true);
        setIntField(term2981, term2981.getClass(), "innovation", -1464172784);
        ArrayList term2963 = new ArrayList();
        ((ArrayList) term2963).add(term2965);
        ((ArrayList) term2963).add(term2969);
        ((ArrayList) term2963).add(term2973);
        ((ArrayList) term2963).add(term2973);
        ((ArrayList) term2963).add(term2977);
        ((ArrayList) term2963).add(term2981);
        term2945 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term2946 = newInstance(Class.forName("nn.model.Genome"));
        Object term2987 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term2989 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term2991 = newInstance(Class.forName("java.util.Random"));
        Object term2992 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term2946, term2946.getClass(), "nodes", term2947);
        setField(term2946, term2946.getClass(), "connections", term2963);
        setIntField(term2987, term2987.getClass(), "counter", 100);
        setField(term2946, term2946.getClass(), "nodeInnovator", term2987);
        setIntField(term2989, term2989.getClass(), "counter", 100);
        setField(term2946, term2946.getClass(), "connectionInnovator", term2989);
        setLongField(term2992, term2992.getClass(), "value", 203270423070625L);
        setField(term2991, term2991.getClass(), "seed", term2992);
        setDoubleField(term2991, term2991.getClass(), "nextNextGaussian", 0.056643259984349825);
        setBooleanField(term2991, term2991.getClass(), "haveNextNextGaussian", false);
        setField(term2946, term2946.getClass(), "random", term2991);
        setField(term2945, term2945.getClass(), "genome", term2946);
        setDoubleField(term2945, term2945.getClass(), "fitness", 0.5984863932443171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Specieses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term2945;
        callMethod(klass, "newSpecies", argTypes, term2940, args);
    }

};


