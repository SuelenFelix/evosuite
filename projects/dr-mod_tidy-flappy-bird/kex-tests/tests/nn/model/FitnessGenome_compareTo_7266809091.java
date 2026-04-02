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
import java.lang.Object;
import java.util.ArrayList;

public class FitnessGenome_compareTo_7266809091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10670;
     Object term10705;

    public FitnessGenome_compareTo_7266809091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10674 = newInstance(Class.forName("nn.model.Node"));
        setField(term10674, term10674.getClass(), "type", null);
        setIntField(term10674, term10674.getClass(), "innovation", 695330987);
        setField(term10674, term10674.getClass(), "connections", null);
        setDoubleField(term10674, term10674.getClass(), "bias", 0.7174146280831781);
        Object term10677 = newInstance(Class.forName("nn.model.Node"));
        setField(term10677, term10677.getClass(), "type", null);
        setIntField(term10677, term10677.getClass(), "innovation", 0);
        setField(term10677, term10677.getClass(), "connections", null);
        setDoubleField(term10677, term10677.getClass(), "bias", 0.0);
        Object term10680 = newInstance(Class.forName("nn.model.Node"));
        setField(term10680, term10680.getClass(), "type", null);
        setIntField(term10680, term10680.getClass(), "innovation", 0);
        setField(term10680, term10680.getClass(), "connections", null);
        setDoubleField(term10680, term10680.getClass(), "bias", 0.0);
        Object term10683 = newInstance(Class.forName("nn.model.Node"));
        setField(term10683, term10683.getClass(), "type", null);
        setIntField(term10683, term10683.getClass(), "innovation", 773432822);
        setField(term10683, term10683.getClass(), "connections", null);
        setDoubleField(term10683, term10683.getClass(), "bias", 0.6104966841551919);
        Object term10686 = newInstance(Class.forName("nn.model.Node"));
        setField(term10686, term10686.getClass(), "type", null);
        setIntField(term10686, term10686.getClass(), "innovation", 0);
        setField(term10686, term10686.getClass(), "connections", null);
        setDoubleField(term10686, term10686.getClass(), "bias", 0.0);
        ArrayList term10672 = new ArrayList();
        ((ArrayList) term10672).add(term10674);
        ((ArrayList) term10672).add(term10677);
        ((ArrayList) term10672).add(term10680);
        ((ArrayList) term10672).add(term10683);
        ((ArrayList) term10672).add(term10686);
        ((ArrayList) term10672).add(term10677);
        ArrayList term10691 = new ArrayList();
        term10670 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10671 = newInstance(Class.forName("nn.model.Genome"));
        Object term10695 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10697 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10699 = newInstance(Class.forName("java.util.Random"));
        Object term10700 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10671, term10671.getClass(), "nodes", term10672);
        setField(term10671, term10671.getClass(), "connections", term10691);
        setIntField(term10695, term10695.getClass(), "counter", 100);
        setField(term10671, term10671.getClass(), "nodeInnovator", term10695);
        setIntField(term10697, term10697.getClass(), "counter", 100);
        setField(term10671, term10671.getClass(), "connectionInnovator", term10697);
        setLongField(term10700, term10700.getClass(), "value", 31413175909126L);
        setField(term10699, term10699.getClass(), "seed", term10700);
        setDoubleField(term10699, term10699.getClass(), "nextNextGaussian", 0.9120605477208);
        setBooleanField(term10699, term10699.getClass(), "haveNextNextGaussian", false);
        setField(term10671, term10671.getClass(), "random", term10699);
        setField(term10670, term10670.getClass(), "genome", term10671);
        setDoubleField(term10670, term10670.getClass(), "fitness", 0.302896023969903);
        Object term10709 = newInstance(Class.forName("nn.model.Node"));
        setField(term10709, term10709.getClass(), "type", null);
        setIntField(term10709, term10709.getClass(), "innovation", 433039357);
        setField(term10709, term10709.getClass(), "connections", null);
        setDoubleField(term10709, term10709.getClass(), "bias", 0.5592771838075339);
        Object term10712 = newInstance(Class.forName("nn.model.Node"));
        setField(term10712, term10712.getClass(), "type", null);
        setIntField(term10712, term10712.getClass(), "innovation", -269909549);
        setField(term10712, term10712.getClass(), "connections", null);
        setDoubleField(term10712, term10712.getClass(), "bias", 0.11759977190822413);
        Object term10715 = newInstance(Class.forName("nn.model.Node"));
        setField(term10715, term10715.getClass(), "type", null);
        setIntField(term10715, term10715.getClass(), "innovation", 1469939797);
        setField(term10715, term10715.getClass(), "connections", null);
        setDoubleField(term10715, term10715.getClass(), "bias", 0.8093135131302098);
        Object term10718 = newInstance(Class.forName("nn.model.Node"));
        setField(term10718, term10718.getClass(), "type", null);
        setIntField(term10718, term10718.getClass(), "innovation", 0);
        setField(term10718, term10718.getClass(), "connections", null);
        setDoubleField(term10718, term10718.getClass(), "bias", 0.0);
        Object term10721 = newInstance(Class.forName("nn.model.Node"));
        setField(term10721, term10721.getClass(), "type", null);
        setIntField(term10721, term10721.getClass(), "innovation", 0);
        setField(term10721, term10721.getClass(), "connections", null);
        setDoubleField(term10721, term10721.getClass(), "bias", 0.0);
        Object term10724 = newInstance(Class.forName("nn.model.Node"));
        setField(term10724, term10724.getClass(), "type", null);
        setIntField(term10724, term10724.getClass(), "innovation", 0);
        setField(term10724, term10724.getClass(), "connections", null);
        setDoubleField(term10724, term10724.getClass(), "bias", 0.0);
        Object term10727 = newInstance(Class.forName("nn.model.Node"));
        setField(term10727, term10727.getClass(), "type", null);
        setIntField(term10727, term10727.getClass(), "innovation", 252799294);
        setField(term10727, term10727.getClass(), "connections", null);
        setDoubleField(term10727, term10727.getClass(), "bias", 0.5583293703509996);
        ArrayList term10707 = new ArrayList();
        ((ArrayList) term10707).add(term10709);
        ((ArrayList) term10707).add(term10712);
        ((ArrayList) term10707).add(term10712);
        ((ArrayList) term10707).add(term10715);
        ((ArrayList) term10707).add(term10718);
        ((ArrayList) term10707).add(term10718);
        ((ArrayList) term10707).add(term10721);
        ((ArrayList) term10707).add(term10724);
        ((ArrayList) term10707).add(term10727);
        Object term10734 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10734, term10734.getClass(), "in", term10709);
        setField(term10734, term10734.getClass(), "out", null);
        setFloatField(term10734, term10734.getClass(), "weight", 0.9700962F);
        setBooleanField(term10734, term10734.getClass(), "expressed", false);
        setIntField(term10734, term10734.getClass(), "innovation", -773707674);
        Object term10738 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10738, term10738.getClass(), "in", term10724);
        setField(term10738, term10738.getClass(), "out", null);
        setFloatField(term10738, term10738.getClass(), "weight", 0.7037769F);
        setBooleanField(term10738, term10738.getClass(), "expressed", true);
        setIntField(term10738, term10738.getClass(), "innovation", 1691516034);
        Object term10742 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10742, term10742.getClass(), "in", term10727);
        setField(term10742, term10742.getClass(), "out", null);
        setFloatField(term10742, term10742.getClass(), "weight", 0.43252808F);
        setBooleanField(term10742, term10742.getClass(), "expressed", true);
        setIntField(term10742, term10742.getClass(), "innovation", -484303394);
        Object term10746 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10746, term10746.getClass(), "in", null);
        setField(term10746, term10746.getClass(), "out", term10715);
        setFloatField(term10746, term10746.getClass(), "weight", 0.49736315F);
        setBooleanField(term10746, term10746.getClass(), "expressed", false);
        setIntField(term10746, term10746.getClass(), "innovation", 383244929);
        Object term10750 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10750, term10750.getClass(), "in", null);
        setField(term10750, term10750.getClass(), "out", null);
        setFloatField(term10750, term10750.getClass(), "weight", 0.43500775F);
        setBooleanField(term10750, term10750.getClass(), "expressed", false);
        setIntField(term10750, term10750.getClass(), "innovation", 207213904);
        ArrayList term10732 = new ArrayList();
        ((ArrayList) term10732).add(term10734);
        ((ArrayList) term10732).add(term10738);
        ((ArrayList) term10732).add(term10742);
        ((ArrayList) term10732).add(term10746);
        ((ArrayList) term10732).add(term10738);
        ((ArrayList) term10732).add(term10738);
        ((ArrayList) term10732).add(term10750);
        term10705 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10706 = newInstance(Class.forName("nn.model.Genome"));
        Object term10756 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10758 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10760 = newInstance(Class.forName("java.util.Random"));
        Object term10761 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10706, term10706.getClass(), "nodes", term10707);
        setField(term10706, term10706.getClass(), "connections", term10732);
        setIntField(term10756, term10756.getClass(), "counter", 100);
        setField(term10706, term10706.getClass(), "nodeInnovator", term10756);
        setIntField(term10758, term10758.getClass(), "counter", 100);
        setField(term10706, term10706.getClass(), "connectionInnovator", term10758);
        setLongField(term10761, term10761.getClass(), "value", 80802975095869L);
        setField(term10760, term10760.getClass(), "seed", term10761);
        setDoubleField(term10760, term10760.getClass(), "nextNextGaussian", 0.8514246643563477);
        setBooleanField(term10760, term10760.getClass(), "haveNextNextGaussian", false);
        setField(term10706, term10706.getClass(), "random", term10760);
        setField(term10705, term10705.getClass(), "genome", term10706);
        setDoubleField(term10705, term10705.getClass(), "fitness", 0.07779122290725593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term10705;
        callMethod(klass, "compareTo", argTypes, term10670, args);
    }

};


