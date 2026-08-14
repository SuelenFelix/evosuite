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
import java.lang.String;

public class Genome_makeNodeBiasMutation_5431076559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6904;

    public Genome_makeNodeBiasMutation_5431076559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6941 = Class.forName((String) "nn.model.Type");
        Field term6940 = ((Class) term6941).getDeclaredField((String) "OUTPUT");
        ((Field) term6940).setAccessible(true);
        Object enum40 = ((Field) term6940).get((Object) null);
        ArrayList term6911 = new ArrayList();
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        ((ArrayList) term6911).add((Object)null);
        Object term6907 = newInstance(Class.forName("nn.model.Node"));
        setField(term6907, term6907.getClass(), "type", enum40);
        setIntField(term6907, term6907.getClass(), "innovation", 2011764585);
        setField(term6907, term6907.getClass(), "connections", term6911);
        setDoubleField(term6907, term6907.getClass(), "bias", 0.9494229461907108);
        ArrayList term6905 = new ArrayList();
        ((ArrayList) term6905).add(term6907);
        Object term6919 = newInstance(Class.forName("nn.model.Connection"));
        Object term6920 = newInstance(Class.forName("nn.model.Node"));
        Object term6923 = newInstance(Class.forName("nn.model.Node"));
        setField(term6920, term6920.getClass(), "type", null);
        setIntField(term6920, term6920.getClass(), "innovation", -963198667);
        setField(term6920, term6920.getClass(), "connections", null);
        setDoubleField(term6920, term6920.getClass(), "bias", 0.6563333099004626);
        setField(term6919, term6919.getClass(), "in", term6920);
        setField(term6923, term6923.getClass(), "type", null);
        setIntField(term6923, term6923.getClass(), "innovation", -1007935918);
        setField(term6923, term6923.getClass(), "connections", null);
        setDoubleField(term6923, term6923.getClass(), "bias", 0.7838077946639819);
        setField(term6919, term6919.getClass(), "out", term6923);
        setFloatField(term6919, term6919.getClass(), "weight", 0.77281576F);
        setBooleanField(term6919, term6919.getClass(), "expressed", false);
        setIntField(term6919, term6919.getClass(), "innovation", 21095258);
        ArrayList term6917 = new ArrayList();
        ((ArrayList) term6917).add(term6919);
        term6904 = newInstance(Class.forName("nn.model.Genome"));
        Object term6931 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term6933 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term6935 = newInstance(Class.forName("java.util.Random"));
        Object term6936 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term6904, term6904.getClass(), "nodes", term6905);
        setField(term6904, term6904.getClass(), "connections", term6917);
        setIntField(term6931, term6931.getClass(), "counter", 100);
        setField(term6904, term6904.getClass(), "nodeInnovator", term6931);
        setIntField(term6933, term6933.getClass(), "counter", 100);
        setField(term6904, term6904.getClass(), "connectionInnovator", term6933);
        setLongField(term6936, term6936.getClass(), "value", 241536306269578L);
        setField(term6935, term6935.getClass(), "seed", term6936);
        setDoubleField(term6935, term6935.getClass(), "nextNextGaussian", 0.31538328268378013);
        setBooleanField(term6935, term6935.getClass(), "haveNextNextGaussian", false);
        setField(term6904, term6904.getClass(), "random", term6935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeNodeBiasMutation", argTypes, term6904, args);
    }

};


