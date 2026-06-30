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

public class Species_assignBestGenome_18577028586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4972;

    public Species_assignBestGenome_18577028586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4975 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4976 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4976, term4976.getClass(), "nodes", null);
        setField(term4976, term4976.getClass(), "connections", null);
        setField(term4976, term4976.getClass(), "nodeInnovator", null);
        setField(term4976, term4976.getClass(), "connectionInnovator", null);
        setField(term4976, term4976.getClass(), "random", null);
        setField(term4975, term4975.getClass(), "genome", term4976);
        setDoubleField(term4975, term4975.getClass(), "fitness", 0.9304178842125251);
        Object term4978 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4979 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4979, term4979.getClass(), "nodes", null);
        setField(term4979, term4979.getClass(), "connections", null);
        setField(term4979, term4979.getClass(), "nodeInnovator", null);
        setField(term4979, term4979.getClass(), "connectionInnovator", null);
        setField(term4979, term4979.getClass(), "random", null);
        setField(term4978, term4978.getClass(), "genome", term4979);
        setDoubleField(term4978, term4978.getClass(), "fitness", 0.04025609521413642);
        Object term4981 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4982 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4982, term4982.getClass(), "nodes", null);
        setField(term4982, term4982.getClass(), "connections", null);
        setField(term4982, term4982.getClass(), "nodeInnovator", null);
        setField(term4982, term4982.getClass(), "connectionInnovator", null);
        setField(term4982, term4982.getClass(), "random", null);
        setField(term4981, term4981.getClass(), "genome", term4982);
        setDoubleField(term4981, term4981.getClass(), "fitness", 0.5816591160182095);
        Object term4984 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4985 = newInstance(Class.forName("nn.model.Genome"));
        setField(term4985, term4985.getClass(), "nodes", null);
        setField(term4985, term4985.getClass(), "connections", null);
        setField(term4985, term4985.getClass(), "nodeInnovator", null);
        setField(term4985, term4985.getClass(), "connectionInnovator", null);
        setField(term4985, term4985.getClass(), "random", null);
        setField(term4984, term4984.getClass(), "genome", term4985);
        setDoubleField(term4984, term4984.getClass(), "fitness", 0.3752345600445256);
        ArrayList term4973 = new ArrayList();
        ((ArrayList) term4973).add(term4975);
        ((ArrayList) term4973).add(term4978);
        ((ArrayList) term4973).add(term4981);
        ((ArrayList) term4973).add(term4984);
        ArrayList term4991 = new ArrayList();
        ((ArrayList) term4991).add((Object)null);
        ((ArrayList) term4991).add((Object)null);
        ((ArrayList) term4991).add((Object)null);
        ((ArrayList) term4991).add((Object)null);
        ((ArrayList) term4991).add((Object)null);
        ((ArrayList) term4991).add((Object)null);
        ArrayList term4995 = new ArrayList();
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        ((ArrayList) term4995).add((Object)null);
        term4972 = newInstance(Class.forName("nn.model.Species"));
        Object term4989 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4990 = newInstance(Class.forName("nn.model.Genome"));
        Object term4999 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term5001 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term5003 = newInstance(Class.forName("java.util.Random"));
        Object term5004 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term4972, term4972.getClass(), "genomes", term4973);
        setField(term4990, term4990.getClass(), "nodes", term4991);
        setField(term4990, term4990.getClass(), "connections", term4995);
        setIntField(term4999, term4999.getClass(), "counter", 100);
        setField(term4990, term4990.getClass(), "nodeInnovator", term4999);
        setIntField(term5001, term5001.getClass(), "counter", 100);
        setField(term4990, term4990.getClass(), "connectionInnovator", term5001);
        setLongField(term5004, term5004.getClass(), "value", 279001617269647L);
        setField(term5003, term5003.getClass(), "seed", term5004);
        setDoubleField(term5003, term5003.getClass(), "nextNextGaussian", 0.40387522930100916);
        setBooleanField(term5003, term5003.getClass(), "haveNextNextGaussian", false);
        setField(term4990, term4990.getClass(), "random", term5003);
        setField(term4989, term4989.getClass(), "genome", term4990);
        setDoubleField(term4989, term4989.getClass(), "fitness", 0.036624440957556126);
        setField(term4972, term4972.getClass(), "bestGenome", term4989);
        setIntField(term4972, term4972.getClass(), "staleness", -337504086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Species");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignBestGenome", argTypes, term4972, args);
    }

};


