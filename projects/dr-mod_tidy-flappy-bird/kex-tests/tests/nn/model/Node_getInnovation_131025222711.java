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
     Object term12642;

    public Node_getInnovation_131025222711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12712 = Class.forName((String) "nn.model.Type");
        Field term12711 = ((Class) term12712).getDeclaredField((String) "OUTPUT");
        ((Field) term12711).setAccessible(true);
        Object enum83 = ((Field) term12711).get((Object) null);
        Object term12656 = newInstance(Class.forName("nn.model.Connection"));
        Object term12657 = newInstance(Class.forName("nn.model.Node"));
        Object term12660 = newInstance(Class.forName("nn.model.Node"));
        setField(term12657, term12657.getClass(), "type", null);
        setIntField(term12657, term12657.getClass(), "innovation", -1822211508);
        setField(term12657, term12657.getClass(), "connections", null);
        setDoubleField(term12657, term12657.getClass(), "bias", 0.6961639879171184);
        setField(term12656, term12656.getClass(), "in", term12657);
        setField(term12660, term12660.getClass(), "type", null);
        setIntField(term12660, term12660.getClass(), "innovation", 0);
        setField(term12660, term12660.getClass(), "connections", null);
        setDoubleField(term12660, term12660.getClass(), "bias", 0.0);
        setField(term12656, term12656.getClass(), "out", term12660);
        setFloatField(term12656, term12656.getClass(), "weight", 0.5959743F);
        setBooleanField(term12656, term12656.getClass(), "expressed", true);
        setIntField(term12656, term12656.getClass(), "innovation", 1491468856);
        Object term12666 = newInstance(Class.forName("nn.model.Connection"));
        Object term12667 = newInstance(Class.forName("nn.model.Node"));
        setField(term12666, term12666.getClass(), "in", term12660);
        setField(term12667, term12667.getClass(), "type", null);
        setIntField(term12667, term12667.getClass(), "innovation", 0);
        setField(term12667, term12667.getClass(), "connections", null);
        setDoubleField(term12667, term12667.getClass(), "bias", 0.0);
        setField(term12666, term12666.getClass(), "out", term12667);
        setFloatField(term12666, term12666.getClass(), "weight", 0.7368078F);
        setBooleanField(term12666, term12666.getClass(), "expressed", false);
        setIntField(term12666, term12666.getClass(), "innovation", -1099664830);
        Object term12673 = newInstance(Class.forName("nn.model.Connection"));
        Object term12674 = newInstance(Class.forName("nn.model.Node"));
        Object term12677 = newInstance(Class.forName("nn.model.Node"));
        setField(term12674, term12674.getClass(), "type", null);
        setIntField(term12674, term12674.getClass(), "innovation", -773608881);
        setField(term12674, term12674.getClass(), "connections", null);
        setDoubleField(term12674, term12674.getClass(), "bias", 0.17377837668919804);
        setField(term12673, term12673.getClass(), "in", term12674);
        setField(term12677, term12677.getClass(), "type", null);
        setIntField(term12677, term12677.getClass(), "innovation", 1485047282);
        setField(term12677, term12677.getClass(), "connections", null);
        setDoubleField(term12677, term12677.getClass(), "bias", 0.8733388286648099);
        setField(term12673, term12673.getClass(), "out", term12677);
        setFloatField(term12673, term12673.getClass(), "weight", 0.6530844F);
        setBooleanField(term12673, term12673.getClass(), "expressed", true);
        setIntField(term12673, term12673.getClass(), "innovation", -640763660);
        Object term12683 = newInstance(Class.forName("nn.model.Connection"));
        Object term12684 = newInstance(Class.forName("nn.model.Node"));
        setField(term12684, term12684.getClass(), "type", null);
        setIntField(term12684, term12684.getClass(), "innovation", 0);
        setField(term12684, term12684.getClass(), "connections", null);
        setDoubleField(term12684, term12684.getClass(), "bias", 0.0);
        setField(term12683, term12683.getClass(), "in", term12684);
        setField(term12683, term12683.getClass(), "out", term12667);
        setFloatField(term12683, term12683.getClass(), "weight", 0.31543463F);
        setBooleanField(term12683, term12683.getClass(), "expressed", false);
        setIntField(term12683, term12683.getClass(), "innovation", -1642688455);
        Object term12690 = newInstance(Class.forName("nn.model.Connection"));
        Object term12691 = newInstance(Class.forName("nn.model.Node"));
        setField(term12691, term12691.getClass(), "type", enum83);
        setIntField(term12691, term12691.getClass(), "innovation", -177243872);
        setField(term12691, term12691.getClass(), "connections", null);
        setDoubleField(term12691, term12691.getClass(), "bias", 0.10735086460638021);
        setField(term12690, term12690.getClass(), "in", term12691);
        setField(term12690, term12690.getClass(), "out", term12677);
        setFloatField(term12690, term12690.getClass(), "weight", 0.6799679F);
        setBooleanField(term12690, term12690.getClass(), "expressed", true);
        setIntField(term12690, term12690.getClass(), "innovation", -2004575734);
        Object term12697 = newInstance(Class.forName("nn.model.Connection"));
        Object term12698 = newInstance(Class.forName("nn.model.Node"));
        setField(term12697, term12697.getClass(), "in", term12667);
        setField(term12698, term12698.getClass(), "type", null);
        setIntField(term12698, term12698.getClass(), "innovation", 0);
        setField(term12698, term12698.getClass(), "connections", null);
        setDoubleField(term12698, term12698.getClass(), "bias", 0.0);
        setField(term12697, term12697.getClass(), "out", term12698);
        setFloatField(term12697, term12697.getClass(), "weight", 0.020103633F);
        setBooleanField(term12697, term12697.getClass(), "expressed", true);
        setIntField(term12697, term12697.getClass(), "innovation", 2123688338);
        Object term12704 = newInstance(Class.forName("nn.model.Connection"));
        setField(term12704, term12704.getClass(), "in", term12657);
        setField(term12704, term12704.getClass(), "out", term12657);
        setFloatField(term12704, term12704.getClass(), "weight", 0.6407471F);
        setBooleanField(term12704, term12704.getClass(), "expressed", true);
        setIntField(term12704, term12704.getClass(), "innovation", -1189468129);
        ArrayList term12654 = new ArrayList();
        ((ArrayList) term12654).add(term12656);
        ((ArrayList) term12654).add(term12666);
        ((ArrayList) term12654).add(term12673);
        ((ArrayList) term12654).add(term12683);
        ((ArrayList) term12654).add(term12683);
        ((ArrayList) term12654).add(term12690);
        ((ArrayList) term12654).add(term12697);
        ((ArrayList) term12654).add(term12697);
        ((ArrayList) term12654).add(term12704);
        term12642 = newInstance(Class.forName("nn.model.Node"));
        setField(term12642, term12642.getClass(), "type", enum83);
        setIntField(term12642, term12642.getClass(), "innovation", 1774728742);
        setField(term12642, term12642.getClass(), "connections", term12654);
        setDoubleField(term12642, term12642.getClass(), "bias", 0.04086594399817722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInnovation", argTypes, term12642, args);
    }

};


