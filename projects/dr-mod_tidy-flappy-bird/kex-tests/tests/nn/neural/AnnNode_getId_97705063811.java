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
     Object term13164;

    public AnnNode_getId_97705063811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term13165 = new Double(0.43337207054070237);
        Double term13172 = new Double(0.13246999699526574);
        Double term13177 = new Double(0.022483645678509023);
        Object term13169 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13171 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term13176 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13169, term13169.getClass(), "weight", 0.3858905478901201);
        setField(term13171, term13171.getClass(), "output", term13172);
        setField(term13171, term13171.getClass(), "inputs", null);
        setField(term13171, term13171.getClass(), "outputs", null);
        setField(term13171, term13171.getClass(), "type", null);
        setIntField(term13171, term13171.getClass(), "id", -598803400);
        setDoubleField(term13171, term13171.getClass(), "bias", 0.5010487964484078);
        setField(term13169, term13169.getClass(), "in", term13171);
        setField(term13176, term13176.getClass(), "output", term13177);
        setField(term13176, term13176.getClass(), "inputs", null);
        setField(term13176, term13176.getClass(), "outputs", null);
        setField(term13176, term13176.getClass(), "type", null);
        setIntField(term13176, term13176.getClass(), "id", 1071776561);
        setDoubleField(term13176, term13176.getClass(), "bias", 0.6789722913921049);
        setField(term13169, term13169.getClass(), "out", term13176);
        Double term13184 = new Double(0.11179067076100713);
        Object term13181 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13183 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13181, term13181.getClass(), "weight", 0.7335000266072508);
        setField(term13183, term13183.getClass(), "output", term13184);
        setField(term13183, term13183.getClass(), "inputs", null);
        setField(term13183, term13183.getClass(), "outputs", null);
        setField(term13183, term13183.getClass(), "type", null);
        setIntField(term13183, term13183.getClass(), "id", 1846399918);
        setDoubleField(term13183, term13183.getClass(), "bias", 0.8655559834554122);
        setField(term13181, term13181.getClass(), "in", term13183);
        setField(term13181, term13181.getClass(), "out", term13171);
        Object term13188 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13190 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13188, term13188.getClass(), "weight", 0.7510022677490469);
        setField(term13188, term13188.getClass(), "in", term13183);
        setField(term13190, term13190.getClass(), "output", null);
        setField(term13190, term13190.getClass(), "inputs", null);
        setField(term13190, term13190.getClass(), "outputs", null);
        setField(term13190, term13190.getClass(), "type", null);
        setIntField(term13190, term13190.getClass(), "id", 0);
        setDoubleField(term13190, term13190.getClass(), "bias", 0.0);
        setField(term13188, term13188.getClass(), "out", term13190);
        Double term13196 = new Double(0.9126850255993704);
        Object term13193 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13195 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13193, term13193.getClass(), "weight", 0.06209980384851188);
        setField(term13195, term13195.getClass(), "output", term13196);
        setField(term13195, term13195.getClass(), "inputs", null);
        setField(term13195, term13195.getClass(), "outputs", null);
        setField(term13195, term13195.getClass(), "type", null);
        setIntField(term13195, term13195.getClass(), "id", 35388821);
        setDoubleField(term13195, term13195.getClass(), "bias", 0.468233333654713);
        setField(term13193, term13193.getClass(), "in", term13195);
        setField(term13193, term13193.getClass(), "out", term13176);
        Object term13200 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13202 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13200, term13200.getClass(), "weight", 0.45125789063502075);
        setField(term13200, term13200.getClass(), "in", term13176);
        setField(term13202, term13202.getClass(), "output", null);
        setField(term13202, term13202.getClass(), "inputs", null);
        setField(term13202, term13202.getClass(), "outputs", null);
        setField(term13202, term13202.getClass(), "type", null);
        setIntField(term13202, term13202.getClass(), "id", 0);
        setDoubleField(term13202, term13202.getClass(), "bias", 0.0);
        setField(term13200, term13200.getClass(), "out", term13202);
        Object term13205 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13207 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13205, term13205.getClass(), "weight", 0.947310784971331);
        setField(term13205, term13205.getClass(), "in", term13171);
        setField(term13207, term13207.getClass(), "output", null);
        setField(term13207, term13207.getClass(), "inputs", null);
        setField(term13207, term13207.getClass(), "outputs", null);
        setField(term13207, term13207.getClass(), "type", null);
        setIntField(term13207, term13207.getClass(), "id", 0);
        setDoubleField(term13207, term13207.getClass(), "bias", 0.0);
        setField(term13205, term13205.getClass(), "out", term13207);
        Double term13213 = new Double(0.5306473989087822);
        Object term13210 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13212 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13210, term13210.getClass(), "weight", 0.5419487144008749);
        setField(term13212, term13212.getClass(), "output", term13213);
        setField(term13212, term13212.getClass(), "inputs", null);
        setField(term13212, term13212.getClass(), "outputs", null);
        setField(term13212, term13212.getClass(), "type", null);
        setIntField(term13212, term13212.getClass(), "id", 1428598210);
        setDoubleField(term13212, term13212.getClass(), "bias", 0.9361416298884132);
        setField(term13210, term13210.getClass(), "in", term13212);
        setField(term13210, term13210.getClass(), "out", term13176);
        ArrayList term13167 = new ArrayList();
        ((ArrayList) term13167).add(term13169);
        ((ArrayList) term13167).add(term13181);
        ((ArrayList) term13167).add(term13188);
        ((ArrayList) term13167).add(term13193);
        ((ArrayList) term13167).add(term13181);
        ((ArrayList) term13167).add(term13200);
        ((ArrayList) term13167).add(term13169);
        ((ArrayList) term13167).add(term13205);
        ((ArrayList) term13167).add(term13210);
        Object term13221 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term13223 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term13221, term13221.getClass(), "weight", 0.5371162753597336);
        setField(term13223, term13223.getClass(), "output", null);
        setField(term13223, term13223.getClass(), "inputs", null);
        setField(term13223, term13223.getClass(), "outputs", null);
        setField(term13223, term13223.getClass(), "type", null);
        setIntField(term13223, term13223.getClass(), "id", 0);
        setDoubleField(term13223, term13223.getClass(), "bias", 0.0);
        setField(term13221, term13221.getClass(), "in", term13223);
        setField(term13221, term13221.getClass(), "out", term13190);
        ArrayList term13219 = new ArrayList();
        ((ArrayList) term13219).add(term13221);
        ((ArrayList) term13219).add(term13210);
        ((ArrayList) term13219).add(term13210);
        ((ArrayList) term13219).add(term13181);
        ((ArrayList) term13219).add(term13188);
        Class<? extends Object> term13241 = Class.forName((String) "nn.neural.AnnType");
        Field term13240 = ((Class) term13241).getDeclaredField((String) "OUTPUT");
        ((Field) term13240).setAccessible(true);
        Object enum79 = ((Field) term13240).get((Object) null);
        term13164 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term13164, term13164.getClass(), "output", term13165);
        setField(term13164, term13164.getClass(), "inputs", term13167);
        setField(term13164, term13164.getClass(), "outputs", term13219);
        setField(term13164, term13164.getClass(), "type", enum79);
        setIntField(term13164, term13164.getClass(), "id", 25560022);
        setDoubleField(term13164, term13164.getClass(), "bias", 0.449352073121681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13164, args);
    }

};


