package nn.neural;

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
import static nn.neural.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class AnnNode_getId_97705063811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13154;

    public AnnNode_getId_97705063811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13155 = new Double(0.43337207054070237);
        Double term13162 = new Double(0.13246999699526574);
        Double term13167 = new Double(0.022483645678509023);
        Object term13159 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13161 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term13166 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13159, term13159.getClass(), "weight", 0.3858905478901201);
        setField(term13161, term13161.getClass(), "output", term13162);
        setField(term13161, term13161.getClass(), "inputs", null);
        setField(term13161, term13161.getClass(), "outputs", null);
        setField(term13161, term13161.getClass(), "type", null);
        setIntField(term13161, term13161.getClass(), "id", -598803400);
        setDoubleField(term13161, term13161.getClass(), "bias", 0.5010487964484078);
        setField(term13159, term13159.getClass(), "in", term13161);
        setField(term13166, term13166.getClass(), "output", term13167);
        setField(term13166, term13166.getClass(), "inputs", null);
        setField(term13166, term13166.getClass(), "outputs", null);
        setField(term13166, term13166.getClass(), "type", null);
        setIntField(term13166, term13166.getClass(), "id", 1071776561);
        setDoubleField(term13166, term13166.getClass(), "bias", 0.6789722913921049);
        setField(term13159, term13159.getClass(), "out", term13166);
        Double term13174 = new Double(0.11179067076100713);
        Object term13171 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13173 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13171, term13171.getClass(), "weight", 0.7335000266072508);
        setField(term13173, term13173.getClass(), "output", term13174);
        setField(term13173, term13173.getClass(), "inputs", null);
        setField(term13173, term13173.getClass(), "outputs", null);
        setField(term13173, term13173.getClass(), "type", null);
        setIntField(term13173, term13173.getClass(), "id", 1846399918);
        setDoubleField(term13173, term13173.getClass(), "bias", 0.8655559834554122);
        setField(term13171, term13171.getClass(), "in", term13173);
        setField(term13171, term13171.getClass(), "out", term13161);
        Object term13178 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13180 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13178, term13178.getClass(), "weight", 0.7510022677490469);
        setField(term13178, term13178.getClass(), "in", term13173);
        setField(term13180, term13180.getClass(), "output", null);
        setField(term13180, term13180.getClass(), "inputs", null);
        setField(term13180, term13180.getClass(), "outputs", null);
        setField(term13180, term13180.getClass(), "type", null);
        setIntField(term13180, term13180.getClass(), "id", 0);
        setDoubleField(term13180, term13180.getClass(), "bias", 0.0);
        setField(term13178, term13178.getClass(), "out", term13180);
        Double term13186 = new Double(0.9126850255993704);
        Object term13183 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13185 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13183, term13183.getClass(), "weight", 0.06209980384851188);
        setField(term13185, term13185.getClass(), "output", term13186);
        setField(term13185, term13185.getClass(), "inputs", null);
        setField(term13185, term13185.getClass(), "outputs", null);
        setField(term13185, term13185.getClass(), "type", null);
        setIntField(term13185, term13185.getClass(), "id", 35388821);
        setDoubleField(term13185, term13185.getClass(), "bias", 0.468233333654713);
        setField(term13183, term13183.getClass(), "in", term13185);
        setField(term13183, term13183.getClass(), "out", term13166);
        Object term13190 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13192 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13190, term13190.getClass(), "weight", 0.45125789063502075);
        setField(term13190, term13190.getClass(), "in", term13166);
        setField(term13192, term13192.getClass(), "output", null);
        setField(term13192, term13192.getClass(), "inputs", null);
        setField(term13192, term13192.getClass(), "outputs", null);
        setField(term13192, term13192.getClass(), "type", null);
        setIntField(term13192, term13192.getClass(), "id", 0);
        setDoubleField(term13192, term13192.getClass(), "bias", 0.0);
        setField(term13190, term13190.getClass(), "out", term13192);
        Object term13195 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13197 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13195, term13195.getClass(), "weight", 0.947310784971331);
        setField(term13195, term13195.getClass(), "in", term13161);
        setField(term13197, term13197.getClass(), "output", null);
        setField(term13197, term13197.getClass(), "inputs", null);
        setField(term13197, term13197.getClass(), "outputs", null);
        setField(term13197, term13197.getClass(), "type", null);
        setIntField(term13197, term13197.getClass(), "id", 0);
        setDoubleField(term13197, term13197.getClass(), "bias", 0.0);
        setField(term13195, term13195.getClass(), "out", term13197);
        Double term13203 = new Double(0.5306473989087822);
        Object term13200 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13202 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13200, term13200.getClass(), "weight", 0.5419487144008749);
        setField(term13202, term13202.getClass(), "output", term13203);
        setField(term13202, term13202.getClass(), "inputs", null);
        setField(term13202, term13202.getClass(), "outputs", null);
        setField(term13202, term13202.getClass(), "type", null);
        setIntField(term13202, term13202.getClass(), "id", 1428598210);
        setDoubleField(term13202, term13202.getClass(), "bias", 0.9361416298884132);
        setField(term13200, term13200.getClass(), "in", term13202);
        setField(term13200, term13200.getClass(), "out", term13166);
        ArrayList term13157 = new ArrayList();
        ((ArrayList) term13157).add(term13159);
        ((ArrayList) term13157).add(term13171);
        ((ArrayList) term13157).add(term13178);
        ((ArrayList) term13157).add(term13183);
        ((ArrayList) term13157).add(term13171);
        ((ArrayList) term13157).add(term13190);
        ((ArrayList) term13157).add(term13159);
        ((ArrayList) term13157).add(term13195);
        ((ArrayList) term13157).add(term13200);
        Object term13211 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13213 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13211, term13211.getClass(), "weight", 0.5371162753597336);
        setField(term13213, term13213.getClass(), "output", null);
        setField(term13213, term13213.getClass(), "inputs", null);
        setField(term13213, term13213.getClass(), "outputs", null);
        setField(term13213, term13213.getClass(), "type", null);
        setIntField(term13213, term13213.getClass(), "id", 0);
        setDoubleField(term13213, term13213.getClass(), "bias", 0.0);
        setField(term13211, term13211.getClass(), "in", term13213);
        setField(term13211, term13211.getClass(), "out", term13180);
        ArrayList term13209 = new ArrayList();
        ((ArrayList) term13209).add(term13211);
        ((ArrayList) term13209).add(term13200);
        ((ArrayList) term13209).add(term13200);
        ((ArrayList) term13209).add(term13171);
        ((ArrayList) term13209).add(term13178);
        Class<? extends Object> term13231 = Class.forName((String) "nn.neural.AnnType");
        Field term13230 = ((Class) term13231).getDeclaredField((String) "OUTPUT");
        ((Field) term13230).setAccessible(true);
        Object enum79 = ((Field) term13230).get((Object) null);
        term13154 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term13154, term13154.getClass(), "output", term13155);
        setField(term13154, term13154.getClass(), "inputs", term13157);
        setField(term13154, term13154.getClass(), "outputs", term13209);
        setField(term13154, term13154.getClass(), "type", enum79);
        setIntField(term13154, term13154.getClass(), "id", 25560022);
        setDoubleField(term13154, term13154.getClass(), "bias", 0.449352073121681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13154, args);
    }

};


