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
     Object term13170;

    public AnnNode_getId_97705063811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13171 = new Double(0.43337207054070237);
        Double term13178 = new Double(0.13246999699526574);
        Double term13183 = new Double(0.022483645678509023);
        Object term13175 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13177 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term13182 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13175, term13175.getClass(), "weight", 0.3858905478901201);
        setField(term13177, term13177.getClass(), "output", term13178);
        setField(term13177, term13177.getClass(), "inputs", null);
        setField(term13177, term13177.getClass(), "outputs", null);
        setField(term13177, term13177.getClass(), "type", null);
        setIntField(term13177, term13177.getClass(), "id", -598803400);
        setDoubleField(term13177, term13177.getClass(), "bias", 0.5010487964484078);
        setField(term13175, term13175.getClass(), "in", term13177);
        setField(term13182, term13182.getClass(), "output", term13183);
        setField(term13182, term13182.getClass(), "inputs", null);
        setField(term13182, term13182.getClass(), "outputs", null);
        setField(term13182, term13182.getClass(), "type", null);
        setIntField(term13182, term13182.getClass(), "id", 1071776561);
        setDoubleField(term13182, term13182.getClass(), "bias", 0.6789722913921049);
        setField(term13175, term13175.getClass(), "out", term13182);
        Double term13190 = new Double(0.11179067076100713);
        Object term13187 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13189 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13187, term13187.getClass(), "weight", 0.7335000266072508);
        setField(term13189, term13189.getClass(), "output", term13190);
        setField(term13189, term13189.getClass(), "inputs", null);
        setField(term13189, term13189.getClass(), "outputs", null);
        setField(term13189, term13189.getClass(), "type", null);
        setIntField(term13189, term13189.getClass(), "id", 1846399918);
        setDoubleField(term13189, term13189.getClass(), "bias", 0.8655559834554122);
        setField(term13187, term13187.getClass(), "in", term13189);
        setField(term13187, term13187.getClass(), "out", term13177);
        Object term13194 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13196 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13194, term13194.getClass(), "weight", 0.7510022677490469);
        setField(term13194, term13194.getClass(), "in", term13189);
        setField(term13196, term13196.getClass(), "output", null);
        setField(term13196, term13196.getClass(), "inputs", null);
        setField(term13196, term13196.getClass(), "outputs", null);
        setField(term13196, term13196.getClass(), "type", null);
        setIntField(term13196, term13196.getClass(), "id", 0);
        setDoubleField(term13196, term13196.getClass(), "bias", 0.0);
        setField(term13194, term13194.getClass(), "out", term13196);
        Double term13202 = new Double(0.9126850255993704);
        Object term13199 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13201 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13199, term13199.getClass(), "weight", 0.06209980384851188);
        setField(term13201, term13201.getClass(), "output", term13202);
        setField(term13201, term13201.getClass(), "inputs", null);
        setField(term13201, term13201.getClass(), "outputs", null);
        setField(term13201, term13201.getClass(), "type", null);
        setIntField(term13201, term13201.getClass(), "id", 35388821);
        setDoubleField(term13201, term13201.getClass(), "bias", 0.468233333654713);
        setField(term13199, term13199.getClass(), "in", term13201);
        setField(term13199, term13199.getClass(), "out", term13182);
        Object term13206 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13208 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13206, term13206.getClass(), "weight", 0.45125789063502075);
        setField(term13206, term13206.getClass(), "in", term13182);
        setField(term13208, term13208.getClass(), "output", null);
        setField(term13208, term13208.getClass(), "inputs", null);
        setField(term13208, term13208.getClass(), "outputs", null);
        setField(term13208, term13208.getClass(), "type", null);
        setIntField(term13208, term13208.getClass(), "id", 0);
        setDoubleField(term13208, term13208.getClass(), "bias", 0.0);
        setField(term13206, term13206.getClass(), "out", term13208);
        Object term13211 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13213 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13211, term13211.getClass(), "weight", 0.947310784971331);
        setField(term13211, term13211.getClass(), "in", term13177);
        setField(term13213, term13213.getClass(), "output", null);
        setField(term13213, term13213.getClass(), "inputs", null);
        setField(term13213, term13213.getClass(), "outputs", null);
        setField(term13213, term13213.getClass(), "type", null);
        setIntField(term13213, term13213.getClass(), "id", 0);
        setDoubleField(term13213, term13213.getClass(), "bias", 0.0);
        setField(term13211, term13211.getClass(), "out", term13213);
        Double term13219 = new Double(0.5306473989087822);
        Object term13216 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13218 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13216, term13216.getClass(), "weight", 0.5419487144008749);
        setField(term13218, term13218.getClass(), "output", term13219);
        setField(term13218, term13218.getClass(), "inputs", null);
        setField(term13218, term13218.getClass(), "outputs", null);
        setField(term13218, term13218.getClass(), "type", null);
        setIntField(term13218, term13218.getClass(), "id", 1428598210);
        setDoubleField(term13218, term13218.getClass(), "bias", 0.9361416298884132);
        setField(term13216, term13216.getClass(), "in", term13218);
        setField(term13216, term13216.getClass(), "out", term13182);
        ArrayList term13173 = new ArrayList();
        ((ArrayList) term13173).add(term13175);
        ((ArrayList) term13173).add(term13187);
        ((ArrayList) term13173).add(term13194);
        ((ArrayList) term13173).add(term13199);
        ((ArrayList) term13173).add(term13187);
        ((ArrayList) term13173).add(term13206);
        ((ArrayList) term13173).add(term13175);
        ((ArrayList) term13173).add(term13211);
        ((ArrayList) term13173).add(term13216);
        Object term13227 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13229 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13227, term13227.getClass(), "weight", 0.5371162753597336);
        setField(term13229, term13229.getClass(), "output", null);
        setField(term13229, term13229.getClass(), "inputs", null);
        setField(term13229, term13229.getClass(), "outputs", null);
        setField(term13229, term13229.getClass(), "type", null);
        setIntField(term13229, term13229.getClass(), "id", 0);
        setDoubleField(term13229, term13229.getClass(), "bias", 0.0);
        setField(term13227, term13227.getClass(), "in", term13229);
        setField(term13227, term13227.getClass(), "out", term13196);
        ArrayList term13225 = new ArrayList();
        ((ArrayList) term13225).add(term13227);
        ((ArrayList) term13225).add(term13216);
        ((ArrayList) term13225).add(term13216);
        ((ArrayList) term13225).add(term13187);
        ((ArrayList) term13225).add(term13194);
        Class<? extends Object> term13247 = Class.forName((String) "nn.neural.AnnType");
        Field term13246 = ((Class) term13247).getDeclaredField((String) "OUTPUT");
        ((Field) term13246).setAccessible(true);
        Object enum79 = ((Field) term13246).get((Object) null);
        term13170 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term13170, term13170.getClass(), "output", term13171);
        setField(term13170, term13170.getClass(), "inputs", term13173);
        setField(term13170, term13170.getClass(), "outputs", term13225);
        setField(term13170, term13170.getClass(), "type", enum79);
        setIntField(term13170, term13170.getClass(), "id", 25560022);
        setDoubleField(term13170, term13170.getClass(), "bias", 0.449352073121681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13170, args);
    }

};


