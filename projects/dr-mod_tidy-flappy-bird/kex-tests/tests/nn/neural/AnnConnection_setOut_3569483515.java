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
import java.lang.Object;
import java.lang.Double;
import java.util.ArrayList;
import java.lang.String;

public class AnnConnection_setOut_3569483515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16158;
     Object term16210;

    public AnnConnection_setOut_3569483515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16161 = new Double(0.09037487793444521);
        Object term16165 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16165, term16165.getClass(), "weight", 0.699722589784733);
        setField(term16165, term16165.getClass(), "in", null);
        setField(term16165, term16165.getClass(), "out", null);
        Object term16167 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16167, term16167.getClass(), "weight", 0.0);
        setField(term16167, term16167.getClass(), "in", null);
        setField(term16167, term16167.getClass(), "out", null);
        Object term16169 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16169, term16169.getClass(), "weight", 0.0);
        setField(term16169, term16169.getClass(), "in", null);
        setField(term16169, term16169.getClass(), "out", null);
        Object term16171 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16171, term16171.getClass(), "weight", 0.41437680771372976);
        setField(term16171, term16171.getClass(), "in", null);
        setField(term16171, term16171.getClass(), "out", null);
        ArrayList term16163 = new ArrayList();
        ((ArrayList) term16163).add(term16165);
        ((ArrayList) term16163).add(term16167);
        ((ArrayList) term16163).add(term16169);
        ((ArrayList) term16163).add(term16165);
        ((ArrayList) term16163).add(term16171);
        Object term16177 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16177, term16177.getClass(), "weight", 0.0);
        setField(term16177, term16177.getClass(), "in", null);
        setField(term16177, term16177.getClass(), "out", null);
        Object term16179 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16179, term16179.getClass(), "weight", 0.31449454294142376);
        setField(term16179, term16179.getClass(), "in", null);
        setField(term16179, term16179.getClass(), "out", null);
        ArrayList term16175 = new ArrayList();
        ((ArrayList) term16175).add(term16165);
        ((ArrayList) term16175).add(term16177);
        ((ArrayList) term16175).add(term16179);
        ((ArrayList) term16175).add(term16169);
        ((ArrayList) term16175).add(term16179);
        Class<? extends Object> term16260 = Class.forName((String) "nn.neural.AnnType");
        Field term16259 = ((Class) term16260).getDeclaredField((String) "HIDDEN");
        ((Field) term16259).setAccessible(true);
        Object enum98 = ((Field) term16259).get((Object) null);
        Double term16196 = new Double(0.9511861072660375);
        Object term16200 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16200, term16200.getClass(), "weight", 0.0);
        setField(term16200, term16200.getClass(), "in", null);
        setField(term16200, term16200.getClass(), "out", null);
        ArrayList term16198 = new ArrayList();
        ((ArrayList) term16198).add(term16167);
        ((ArrayList) term16198).add(term16167);
        ((ArrayList) term16198).add(term16200);
        ((ArrayList) term16198).add(term16158);
        ((ArrayList) term16198).add(term16158);
        ArrayList term16204 = new ArrayList();
        term16158 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16160 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16195 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16158, term16158.getClass(), "weight", 0.9948833256821954);
        setField(term16160, term16160.getClass(), "output", term16161);
        setField(term16160, term16160.getClass(), "inputs", term16163);
        setField(term16160, term16160.getClass(), "outputs", term16175);
        setField(term16160, term16160.getClass(), "type", enum98);
        setIntField(term16160, term16160.getClass(), "id", -1512221115);
        setDoubleField(term16160, term16160.getClass(), "bias", 0.7993342506043556);
        setField(term16158, term16158.getClass(), "in", term16160);
        setField(term16195, term16195.getClass(), "output", term16196);
        setField(term16195, term16195.getClass(), "inputs", term16198);
        setField(term16195, term16195.getClass(), "outputs", term16204);
        setField(term16195, term16195.getClass(), "type", enum98);
        setIntField(term16195, term16195.getClass(), "id", -515486706);
        setDoubleField(term16195, term16195.getClass(), "bias", 0.1397483969082174);
        setField(term16158, term16158.getClass(), "out", term16195);
        Double term16211 = new Double(0.05880719443135807);
        Double term16218 = new Double(0.34010089048558567);
        Object term16215 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16217 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16222 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16215, term16215.getClass(), "weight", 0.7734226136878846);
        setField(term16217, term16217.getClass(), "output", term16218);
        setField(term16217, term16217.getClass(), "inputs", null);
        setField(term16217, term16217.getClass(), "outputs", null);
        setField(term16217, term16217.getClass(), "type", enum98);
        setIntField(term16217, term16217.getClass(), "id", -1176968921);
        setDoubleField(term16217, term16217.getClass(), "bias", 0.38751643915794354);
        setField(term16215, term16215.getClass(), "in", term16217);
        setField(term16222, term16222.getClass(), "output", null);
        setField(term16222, term16222.getClass(), "inputs", null);
        setField(term16222, term16222.getClass(), "outputs", null);
        setField(term16222, term16222.getClass(), "type", null);
        setIntField(term16222, term16222.getClass(), "id", 0);
        setDoubleField(term16222, term16222.getClass(), "bias", 0.0);
        setField(term16215, term16215.getClass(), "out", term16222);
        Object term16225 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16227 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16230 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16225, term16225.getClass(), "weight", 0.4655589762588376);
        setField(term16227, term16227.getClass(), "output", null);
        setField(term16227, term16227.getClass(), "inputs", null);
        setField(term16227, term16227.getClass(), "outputs", null);
        setField(term16227, term16227.getClass(), "type", null);
        setIntField(term16227, term16227.getClass(), "id", 0);
        setDoubleField(term16227, term16227.getClass(), "bias", 0.0);
        setField(term16225, term16225.getClass(), "in", term16227);
        setField(term16230, term16230.getClass(), "output", null);
        setField(term16230, term16230.getClass(), "inputs", null);
        setField(term16230, term16230.getClass(), "outputs", null);
        setField(term16230, term16230.getClass(), "type", null);
        setIntField(term16230, term16230.getClass(), "id", 0);
        setDoubleField(term16230, term16230.getClass(), "bias", 0.0);
        setField(term16225, term16225.getClass(), "out", term16230);
        ArrayList term16213 = new ArrayList();
        ((ArrayList) term16213).add(term16215);
        ((ArrayList) term16213).add(term16225);
        ((ArrayList) term16213).add(term16215);
        Object term16237 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16237, term16237.getClass(), "weight", 0.01058857386775991);
        setField(term16237, term16237.getClass(), "in", term16217);
        setField(term16237, term16237.getClass(), "out", term16217);
        Double term16242 = new Double(0.9341364461850963);
        Object term16239 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16241 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16239, term16239.getClass(), "weight", 0.23604751860793194);
        setField(term16241, term16241.getClass(), "output", term16242);
        setField(term16241, term16241.getClass(), "inputs", null);
        setField(term16241, term16241.getClass(), "outputs", null);
        setField(term16241, term16241.getClass(), "type", null);
        setIntField(term16241, term16241.getClass(), "id", -612862488);
        setDoubleField(term16241, term16241.getClass(), "bias", 0.47389726801621446);
        setField(term16239, term16239.getClass(), "in", term16241);
        setField(term16239, term16239.getClass(), "out", term16230);
        ArrayList term16235 = new ArrayList();
        ((ArrayList) term16235).add(term16237);
        ((ArrayList) term16235).add(term16239);
        Class<? extends Object> term16370 = Class.forName((String) "nn.neural.AnnType");
        Field term16369 = ((Class) term16370).getDeclaredField((String) "INPUT");
        ((Field) term16369).setAccessible(true);
        Object enum99 = ((Field) term16369).get((Object) null);
        term16210 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term16210, term16210.getClass(), "output", term16211);
        setField(term16210, term16210.getClass(), "inputs", term16213);
        setField(term16210, term16210.getClass(), "outputs", term16235);
        setField(term16210, term16210.getClass(), "type", enum99);
        setIntField(term16210, term16210.getClass(), "id", -1986225025);
        setDoubleField(term16210, term16210.getClass(), "bias", 0.7012219082391921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.neural.AnnNode");
        Object[] args = new Object[1];
        args[0] = term16210;
        callMethod(klass, "setOut", argTypes, term16158, args);
    }

};


