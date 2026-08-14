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

public class Node_hashCode_5887765738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12383;

    public Node_hashCode_5887765738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12438 = Class.forName((String) "nn.model.Type");
        Field term12437 = ((Class) term12438).getDeclaredField((String) "OUTPUT");
        ((Field) term12437).setAccessible(true);
        Object enum81 = ((Field) term12437).get((Object) null);
        Object term12397 = newInstance(Class.forName("nn.model.Connection"));
        Object term12398 = newInstance(Class.forName("nn.model.Node"));
        Object term12401 = newInstance(Class.forName("nn.model.Node"));
        setField(term12398, term12398.getClass(), "type", enum81);
        setIntField(term12398, term12398.getClass(), "innovation", 1471031478);
        setField(term12398, term12398.getClass(), "connections", null);
        setDoubleField(term12398, term12398.getClass(), "bias", 0.20219858593718787);
        setField(term12397, term12397.getClass(), "in", term12398);
        setField(term12401, term12401.getClass(), "type", null);
        setIntField(term12401, term12401.getClass(), "innovation", 1989014880);
        setField(term12401, term12401.getClass(), "connections", null);
        setDoubleField(term12401, term12401.getClass(), "bias", 0.18636713236319624);
        setField(term12397, term12397.getClass(), "out", term12401);
        setFloatField(term12397, term12397.getClass(), "weight", 0.12337214F);
        setBooleanField(term12397, term12397.getClass(), "expressed", true);
        setIntField(term12397, term12397.getClass(), "innovation", -801175078);
        Object term12407 = newInstance(Class.forName("nn.model.Connection"));
        Object term12408 = newInstance(Class.forName("nn.model.Node"));
        Object term12411 = newInstance(Class.forName("nn.model.Node"));
        setField(term12408, term12408.getClass(), "type", enum81);
        setIntField(term12408, term12408.getClass(), "innovation", -334716487);
        setField(term12408, term12408.getClass(), "connections", null);
        setDoubleField(term12408, term12408.getClass(), "bias", 0.16581764143035682);
        setField(term12407, term12407.getClass(), "in", term12408);
        setField(term12411, term12411.getClass(), "type", null);
        setIntField(term12411, term12411.getClass(), "innovation", 0);
        setField(term12411, term12411.getClass(), "connections", null);
        setDoubleField(term12411, term12411.getClass(), "bias", 0.0);
        setField(term12407, term12407.getClass(), "out", term12411);
        setFloatField(term12407, term12407.getClass(), "weight", 0.05259031F);
        setBooleanField(term12407, term12407.getClass(), "expressed", true);
        setIntField(term12407, term12407.getClass(), "innovation", 950783153);
        Object term12417 = newInstance(Class.forName("nn.model.Connection"));
        Object term12418 = newInstance(Class.forName("nn.model.Node"));
        setField(term12418, term12418.getClass(), "type", null);
        setIntField(term12418, term12418.getClass(), "innovation", 0);
        setField(term12418, term12418.getClass(), "connections", null);
        setDoubleField(term12418, term12418.getClass(), "bias", 0.0);
        setField(term12417, term12417.getClass(), "in", term12418);
        setField(term12417, term12417.getClass(), "out", term12411);
        setFloatField(term12417, term12417.getClass(), "weight", 0.10126144F);
        setBooleanField(term12417, term12417.getClass(), "expressed", true);
        setIntField(term12417, term12417.getClass(), "innovation", 1818274550);
        Object term12424 = newInstance(Class.forName("nn.model.Connection"));
        Object term12425 = newInstance(Class.forName("nn.model.Node"));
        Object term12428 = newInstance(Class.forName("nn.model.Node"));
        setField(term12425, term12425.getClass(), "type", null);
        setIntField(term12425, term12425.getClass(), "innovation", 0);
        setField(term12425, term12425.getClass(), "connections", null);
        setDoubleField(term12425, term12425.getClass(), "bias", 0.0);
        setField(term12424, term12424.getClass(), "in", term12425);
        setField(term12428, term12428.getClass(), "type", null);
        setIntField(term12428, term12428.getClass(), "innovation", -1739012814);
        setField(term12428, term12428.getClass(), "connections", null);
        setDoubleField(term12428, term12428.getClass(), "bias", 0.8712455774005332);
        setField(term12424, term12424.getClass(), "out", term12428);
        setFloatField(term12424, term12424.getClass(), "weight", 0.5029736F);
        setBooleanField(term12424, term12424.getClass(), "expressed", false);
        setIntField(term12424, term12424.getClass(), "innovation", 2095699770);
        ArrayList term12395 = new ArrayList();
        ((ArrayList) term12395).add(term12397);
        ((ArrayList) term12395).add(term12407);
        ((ArrayList) term12395).add(term12417);
        ((ArrayList) term12395).add(term12417);
        ((ArrayList) term12395).add(term12424);
        term12383 = newInstance(Class.forName("nn.model.Node"));
        setField(term12383, term12383.getClass(), "type", enum81);
        setIntField(term12383, term12383.getClass(), "innovation", -1540486514);
        setField(term12383, term12383.getClass(), "connections", term12395);
        setDoubleField(term12383, term12383.getClass(), "bias", 0.0015033902879237893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12383, args);
    }

};


