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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Node_getInnovation_131025222711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12657;

    public Node_getInnovation_131025222711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12727 = Class.forName((String) "nn.model.Type");
        Field term12726 = ((Class) term12727).getDeclaredField((String) "OUTPUT");
        ((Field) term12726).setAccessible(true);
        Object enum83 = ((Field) term12726).get((Object) null);
        Object term12671 = newInstance(Class.forName("nn.model.Connection"));
        Object term12672 = newInstance(Class.forName("nn.model.Node"));
        Object term12675 = newInstance(Class.forName("nn.model.Node"));
        setField(term12672, term12672.getClass(), "type", null);
        setIntField(term12672, term12672.getClass(), "innovation", -1822211508);
        setField(term12672, term12672.getClass(), "connections", null);
        setDoubleField(term12672, term12672.getClass(), "bias", 0.6961639879171184);
        setField(term12671, term12671.getClass(), "in", term12672);
        setField(term12675, term12675.getClass(), "type", null);
        setIntField(term12675, term12675.getClass(), "innovation", 0);
        setField(term12675, term12675.getClass(), "connections", null);
        setDoubleField(term12675, term12675.getClass(), "bias", 0.0);
        setField(term12671, term12671.getClass(), "out", term12675);
        setFloatField(term12671, term12671.getClass(), "weight", 0.5959743F);
        setBooleanField(term12671, term12671.getClass(), "expressed", true);
        setIntField(term12671, term12671.getClass(), "innovation", 1491468856);
        Object term12681 = newInstance(Class.forName("nn.model.Connection"));
        Object term12682 = newInstance(Class.forName("nn.model.Node"));
        setField(term12681, term12681.getClass(), "in", term12675);
        setField(term12682, term12682.getClass(), "type", null);
        setIntField(term12682, term12682.getClass(), "innovation", 0);
        setField(term12682, term12682.getClass(), "connections", null);
        setDoubleField(term12682, term12682.getClass(), "bias", 0.0);
        setField(term12681, term12681.getClass(), "out", term12682);
        setFloatField(term12681, term12681.getClass(), "weight", 0.7368078F);
        setBooleanField(term12681, term12681.getClass(), "expressed", false);
        setIntField(term12681, term12681.getClass(), "innovation", -1099664830);
        Object term12688 = newInstance(Class.forName("nn.model.Connection"));
        Object term12689 = newInstance(Class.forName("nn.model.Node"));
        Object term12692 = newInstance(Class.forName("nn.model.Node"));
        setField(term12689, term12689.getClass(), "type", null);
        setIntField(term12689, term12689.getClass(), "innovation", -773608881);
        setField(term12689, term12689.getClass(), "connections", null);
        setDoubleField(term12689, term12689.getClass(), "bias", 0.17377837668919804);
        setField(term12688, term12688.getClass(), "in", term12689);
        setField(term12692, term12692.getClass(), "type", null);
        setIntField(term12692, term12692.getClass(), "innovation", 1485047282);
        setField(term12692, term12692.getClass(), "connections", null);
        setDoubleField(term12692, term12692.getClass(), "bias", 0.8733388286648099);
        setField(term12688, term12688.getClass(), "out", term12692);
        setFloatField(term12688, term12688.getClass(), "weight", 0.6530844F);
        setBooleanField(term12688, term12688.getClass(), "expressed", true);
        setIntField(term12688, term12688.getClass(), "innovation", -640763660);
        Object term12698 = newInstance(Class.forName("nn.model.Connection"));
        Object term12699 = newInstance(Class.forName("nn.model.Node"));
        setField(term12699, term12699.getClass(), "type", null);
        setIntField(term12699, term12699.getClass(), "innovation", 0);
        setField(term12699, term12699.getClass(), "connections", null);
        setDoubleField(term12699, term12699.getClass(), "bias", 0.0);
        setField(term12698, term12698.getClass(), "in", term12699);
        setField(term12698, term12698.getClass(), "out", term12682);
        setFloatField(term12698, term12698.getClass(), "weight", 0.31543463F);
        setBooleanField(term12698, term12698.getClass(), "expressed", false);
        setIntField(term12698, term12698.getClass(), "innovation", -1642688455);
        Object term12705 = newInstance(Class.forName("nn.model.Connection"));
        Object term12706 = newInstance(Class.forName("nn.model.Node"));
        setField(term12706, term12706.getClass(), "type", enum83);
        setIntField(term12706, term12706.getClass(), "innovation", -177243872);
        setField(term12706, term12706.getClass(), "connections", null);
        setDoubleField(term12706, term12706.getClass(), "bias", 0.10735086460638021);
        setField(term12705, term12705.getClass(), "in", term12706);
        setField(term12705, term12705.getClass(), "out", term12692);
        setFloatField(term12705, term12705.getClass(), "weight", 0.6799679F);
        setBooleanField(term12705, term12705.getClass(), "expressed", true);
        setIntField(term12705, term12705.getClass(), "innovation", -2004575734);
        Object term12712 = newInstance(Class.forName("nn.model.Connection"));
        Object term12713 = newInstance(Class.forName("nn.model.Node"));
        setField(term12712, term12712.getClass(), "in", term12682);
        setField(term12713, term12713.getClass(), "type", null);
        setIntField(term12713, term12713.getClass(), "innovation", 0);
        setField(term12713, term12713.getClass(), "connections", null);
        setDoubleField(term12713, term12713.getClass(), "bias", 0.0);
        setField(term12712, term12712.getClass(), "out", term12713);
        setFloatField(term12712, term12712.getClass(), "weight", 0.020103633F);
        setBooleanField(term12712, term12712.getClass(), "expressed", true);
        setIntField(term12712, term12712.getClass(), "innovation", 2123688338);
        Object term12719 = newInstance(Class.forName("nn.model.Connection"));
        setField(term12719, term12719.getClass(), "in", term12672);
        setField(term12719, term12719.getClass(), "out", term12672);
        setFloatField(term12719, term12719.getClass(), "weight", 0.6407471F);
        setBooleanField(term12719, term12719.getClass(), "expressed", true);
        setIntField(term12719, term12719.getClass(), "innovation", -1189468129);
        ArrayList term12669 = new ArrayList();
        ((ArrayList) term12669).add(term12671);
        ((ArrayList) term12669).add(term12681);
        ((ArrayList) term12669).add(term12688);
        ((ArrayList) term12669).add(term12698);
        ((ArrayList) term12669).add(term12698);
        ((ArrayList) term12669).add(term12705);
        ((ArrayList) term12669).add(term12712);
        ((ArrayList) term12669).add(term12712);
        ((ArrayList) term12669).add(term12719);
        term12657 = newInstance(Class.forName("nn.model.Node"));
        setField(term12657, term12657.getClass(), "type", enum83);
        setIntField(term12657, term12657.getClass(), "innovation", 1774728742);
        setField(term12657, term12657.getClass(), "connections", term12669);
        setDoubleField(term12657, term12657.getClass(), "bias", 0.04086594399817722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term12657, args);
    }

};


