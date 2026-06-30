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
     Object term12386;

    public Node_hashCode_5887765738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12441 = Class.forName((String) "nn.model.Type");
        Field term12440 = ((Class) term12441).getDeclaredField((String) "OUTPUT");
        ((Field) term12440).setAccessible(true);
        Object enum81 = ((Field) term12440).get((Object) null);
        Object term12400 = newInstance(Class.forName("nn.model.Connection"));
        Object term12401 = newInstance(Class.forName("nn.model.Node"));
        Object term12404 = newInstance(Class.forName("nn.model.Node"));
        setField(term12401, term12401.getClass(), "type", enum81);
        setIntField(term12401, term12401.getClass(), "innovation", 1471031478);
        setField(term12401, term12401.getClass(), "connections", null);
        setDoubleField(term12401, term12401.getClass(), "bias", 0.20219858593718787);
        setField(term12400, term12400.getClass(), "in", term12401);
        setField(term12404, term12404.getClass(), "type", null);
        setIntField(term12404, term12404.getClass(), "innovation", 1989014880);
        setField(term12404, term12404.getClass(), "connections", null);
        setDoubleField(term12404, term12404.getClass(), "bias", 0.18636713236319624);
        setField(term12400, term12400.getClass(), "out", term12404);
        setFloatField(term12400, term12400.getClass(), "weight", 0.12337214F);
        setBooleanField(term12400, term12400.getClass(), "expressed", true);
        setIntField(term12400, term12400.getClass(), "innovation", -801175078);
        Object term12410 = newInstance(Class.forName("nn.model.Connection"));
        Object term12411 = newInstance(Class.forName("nn.model.Node"));
        Object term12414 = newInstance(Class.forName("nn.model.Node"));
        setField(term12411, term12411.getClass(), "type", enum81);
        setIntField(term12411, term12411.getClass(), "innovation", -334716487);
        setField(term12411, term12411.getClass(), "connections", null);
        setDoubleField(term12411, term12411.getClass(), "bias", 0.16581764143035682);
        setField(term12410, term12410.getClass(), "in", term12411);
        setField(term12414, term12414.getClass(), "type", null);
        setIntField(term12414, term12414.getClass(), "innovation", 0);
        setField(term12414, term12414.getClass(), "connections", null);
        setDoubleField(term12414, term12414.getClass(), "bias", 0.0);
        setField(term12410, term12410.getClass(), "out", term12414);
        setFloatField(term12410, term12410.getClass(), "weight", 0.05259031F);
        setBooleanField(term12410, term12410.getClass(), "expressed", true);
        setIntField(term12410, term12410.getClass(), "innovation", 950783153);
        Object term12420 = newInstance(Class.forName("nn.model.Connection"));
        Object term12421 = newInstance(Class.forName("nn.model.Node"));
        setField(term12421, term12421.getClass(), "type", null);
        setIntField(term12421, term12421.getClass(), "innovation", 0);
        setField(term12421, term12421.getClass(), "connections", null);
        setDoubleField(term12421, term12421.getClass(), "bias", 0.0);
        setField(term12420, term12420.getClass(), "in", term12421);
        setField(term12420, term12420.getClass(), "out", term12414);
        setFloatField(term12420, term12420.getClass(), "weight", 0.10126144F);
        setBooleanField(term12420, term12420.getClass(), "expressed", true);
        setIntField(term12420, term12420.getClass(), "innovation", 1818274550);
        Object term12427 = newInstance(Class.forName("nn.model.Connection"));
        Object term12428 = newInstance(Class.forName("nn.model.Node"));
        Object term12431 = newInstance(Class.forName("nn.model.Node"));
        setField(term12428, term12428.getClass(), "type", null);
        setIntField(term12428, term12428.getClass(), "innovation", 0);
        setField(term12428, term12428.getClass(), "connections", null);
        setDoubleField(term12428, term12428.getClass(), "bias", 0.0);
        setField(term12427, term12427.getClass(), "in", term12428);
        setField(term12431, term12431.getClass(), "type", null);
        setIntField(term12431, term12431.getClass(), "innovation", -1739012814);
        setField(term12431, term12431.getClass(), "connections", null);
        setDoubleField(term12431, term12431.getClass(), "bias", 0.8712455774005332);
        setField(term12427, term12427.getClass(), "out", term12431);
        setFloatField(term12427, term12427.getClass(), "weight", 0.5029736F);
        setBooleanField(term12427, term12427.getClass(), "expressed", false);
        setIntField(term12427, term12427.getClass(), "innovation", 2095699770);
        ArrayList term12398 = new ArrayList();
        ((ArrayList) term12398).add(term12400);
        ((ArrayList) term12398).add(term12410);
        ((ArrayList) term12398).add(term12420);
        ((ArrayList) term12398).add(term12420);
        ((ArrayList) term12398).add(term12427);
        term12386 = newInstance(Class.forName("nn.model.Node"));
        setField(term12386, term12386.getClass(), "type", enum81);
        setIntField(term12386, term12386.getClass(), "innovation", -1540486514);
        setField(term12386, term12386.getClass(), "connections", term12398);
        setDoubleField(term12386, term12386.getClass(), "bias", 0.0015033902879237893);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term12386, args);
    }

};


