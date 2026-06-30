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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Specieses_init_14680612921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2817;

    public Specieses_init_14680612921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2821 = new ArrayList();
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        ((ArrayList) term2821).add((Object)null);
        Object term2820 = newInstance(Class.forName("nn.model.Species"));
        Object term2825 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term2826 = newInstance(Class.forName("nn.model.Genome"));
        setField(term2820, term2820.getClass(), "genomes", term2821);
        setField(term2826, term2826.getClass(), "nodes", null);
        setField(term2826, term2826.getClass(), "connections", null);
        setField(term2826, term2826.getClass(), "nodeInnovator", null);
        setField(term2826, term2826.getClass(), "connectionInnovator", null);
        setField(term2826, term2826.getClass(), "random", null);
        setField(term2825, term2825.getClass(), "genome", term2826);
        setDoubleField(term2825, term2825.getClass(), "fitness", 0.9276995636844321);
        setField(term2820, term2820.getClass(), "bestGenome", term2825);
        setIntField(term2820, term2820.getClass(), "staleness", -749861210);
        ArrayList term2831 = new ArrayList();
        Object term2830 = newInstance(Class.forName("nn.model.Species"));
        Object term2834 = newInstance(Class.forName("nn.model.FitnessGenome"));
        setField(term2830, term2830.getClass(), "genomes", term2831);
        setField(term2834, term2834.getClass(), "genome", null);
        setDoubleField(term2834, term2834.getClass(), "fitness", 0.8490790645379176);
        setField(term2830, term2830.getClass(), "bestGenome", term2834);
        setIntField(term2830, term2830.getClass(), "staleness", 388157121);
        Object term2838 = newInstance(Class.forName("nn.model.Species"));
        setField(term2838, term2838.getClass(), "genomes", null);
        setField(term2838, term2838.getClass(), "bestGenome", null);
        setIntField(term2838, term2838.getClass(), "staleness", 1320570890);
        term2817 = new LinkedList();
        ((LinkedList) term2817).add(term2820);
        ((LinkedList) term2817).add(term2830);
        ((LinkedList) term2817).add(term2838);
        ((LinkedList) term2817).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Specieses");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2817;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


