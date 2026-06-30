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
     Object term16148;
     Object term16200;

    public AnnConnection_setOut_3569483515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16151 = new Double(0.09037487793444521);
        Object term16155 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16155, term16155.getClass(), "weight", 0.699722589784733);
        setField(term16155, term16155.getClass(), "in", null);
        setField(term16155, term16155.getClass(), "out", null);
        Object term16157 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16157, term16157.getClass(), "weight", 0.0);
        setField(term16157, term16157.getClass(), "in", null);
        setField(term16157, term16157.getClass(), "out", null);
        Object term16159 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16159, term16159.getClass(), "weight", 0.0);
        setField(term16159, term16159.getClass(), "in", null);
        setField(term16159, term16159.getClass(), "out", null);
        Object term16161 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16161, term16161.getClass(), "weight", 0.41437680771372976);
        setField(term16161, term16161.getClass(), "in", null);
        setField(term16161, term16161.getClass(), "out", null);
        ArrayList term16153 = new ArrayList();
        ((ArrayList) term16153).add(term16155);
        ((ArrayList) term16153).add(term16157);
        ((ArrayList) term16153).add(term16159);
        ((ArrayList) term16153).add(term16155);
        ((ArrayList) term16153).add(term16161);
        Object term16167 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16167, term16167.getClass(), "weight", 0.0);
        setField(term16167, term16167.getClass(), "in", null);
        setField(term16167, term16167.getClass(), "out", null);
        Object term16169 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16169, term16169.getClass(), "weight", 0.31449454294142376);
        setField(term16169, term16169.getClass(), "in", null);
        setField(term16169, term16169.getClass(), "out", null);
        ArrayList term16165 = new ArrayList();
        ((ArrayList) term16165).add(term16155);
        ((ArrayList) term16165).add(term16167);
        ((ArrayList) term16165).add(term16169);
        ((ArrayList) term16165).add(term16159);
        ((ArrayList) term16165).add(term16169);
        Class<? extends Object> term16250 = Class.forName((String) "nn.neural.AnnType");
        Field term16249 = ((Class) term16250).getDeclaredField((String) "HIDDEN");
        ((Field) term16249).setAccessible(true);
        Object enum98 = ((Field) term16249).get((Object) null);
        Double term16186 = new Double(0.9511861072660375);
        Object term16190 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16190, term16190.getClass(), "weight", 0.0);
        setField(term16190, term16190.getClass(), "in", null);
        setField(term16190, term16190.getClass(), "out", null);
        ArrayList term16188 = new ArrayList();
        ((ArrayList) term16188).add(term16157);
        ((ArrayList) term16188).add(term16157);
        ((ArrayList) term16188).add(term16190);
        ((ArrayList) term16188).add(term16148);
        ((ArrayList) term16188).add(term16148);
        ArrayList term16194 = new ArrayList();
        term16148 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16150 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16185 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16148, term16148.getClass(), "weight", 0.9948833256821954);
        setField(term16150, term16150.getClass(), "output", term16151);
        setField(term16150, term16150.getClass(), "inputs", term16153);
        setField(term16150, term16150.getClass(), "outputs", term16165);
        setField(term16150, term16150.getClass(), "type", enum98);
        setIntField(term16150, term16150.getClass(), "id", -1512221115);
        setDoubleField(term16150, term16150.getClass(), "bias", 0.7993342506043556);
        setField(term16148, term16148.getClass(), "in", term16150);
        setField(term16185, term16185.getClass(), "output", term16186);
        setField(term16185, term16185.getClass(), "inputs", term16188);
        setField(term16185, term16185.getClass(), "outputs", term16194);
        setField(term16185, term16185.getClass(), "type", enum98);
        setIntField(term16185, term16185.getClass(), "id", -515486706);
        setDoubleField(term16185, term16185.getClass(), "bias", 0.1397483969082174);
        setField(term16148, term16148.getClass(), "out", term16185);
        Double term16201 = new Double(0.05880719443135807);
        Double term16208 = new Double(0.34010089048558567);
        Object term16205 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16207 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16212 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16205, term16205.getClass(), "weight", 0.7734226136878846);
        setField(term16207, term16207.getClass(), "output", term16208);
        setField(term16207, term16207.getClass(), "inputs", null);
        setField(term16207, term16207.getClass(), "outputs", null);
        setField(term16207, term16207.getClass(), "type", enum98);
        setIntField(term16207, term16207.getClass(), "id", -1176968921);
        setDoubleField(term16207, term16207.getClass(), "bias", 0.38751643915794354);
        setField(term16205, term16205.getClass(), "in", term16207);
        setField(term16212, term16212.getClass(), "output", null);
        setField(term16212, term16212.getClass(), "inputs", null);
        setField(term16212, term16212.getClass(), "outputs", null);
        setField(term16212, term16212.getClass(), "type", null);
        setIntField(term16212, term16212.getClass(), "id", 0);
        setDoubleField(term16212, term16212.getClass(), "bias", 0.0);
        setField(term16205, term16205.getClass(), "out", term16212);
        Object term16215 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16217 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16220 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16215, term16215.getClass(), "weight", 0.4655589762588376);
        setField(term16217, term16217.getClass(), "output", null);
        setField(term16217, term16217.getClass(), "inputs", null);
        setField(term16217, term16217.getClass(), "outputs", null);
        setField(term16217, term16217.getClass(), "type", null);
        setIntField(term16217, term16217.getClass(), "id", 0);
        setDoubleField(term16217, term16217.getClass(), "bias", 0.0);
        setField(term16215, term16215.getClass(), "in", term16217);
        setField(term16220, term16220.getClass(), "output", null);
        setField(term16220, term16220.getClass(), "inputs", null);
        setField(term16220, term16220.getClass(), "outputs", null);
        setField(term16220, term16220.getClass(), "type", null);
        setIntField(term16220, term16220.getClass(), "id", 0);
        setDoubleField(term16220, term16220.getClass(), "bias", 0.0);
        setField(term16215, term16215.getClass(), "out", term16220);
        ArrayList term16203 = new ArrayList();
        ((ArrayList) term16203).add(term16205);
        ((ArrayList) term16203).add(term16215);
        ((ArrayList) term16203).add(term16205);
        Object term16227 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16227, term16227.getClass(), "weight", 0.01058857386775991);
        setField(term16227, term16227.getClass(), "in", term16207);
        setField(term16227, term16227.getClass(), "out", term16207);
        Double term16232 = new Double(0.9341364461850963);
        Object term16229 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16231 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16229, term16229.getClass(), "weight", 0.23604751860793194);
        setField(term16231, term16231.getClass(), "output", term16232);
        setField(term16231, term16231.getClass(), "inputs", null);
        setField(term16231, term16231.getClass(), "outputs", null);
        setField(term16231, term16231.getClass(), "type", null);
        setIntField(term16231, term16231.getClass(), "id", -612862488);
        setDoubleField(term16231, term16231.getClass(), "bias", 0.47389726801621446);
        setField(term16229, term16229.getClass(), "in", term16231);
        setField(term16229, term16229.getClass(), "out", term16220);
        ArrayList term16225 = new ArrayList();
        ((ArrayList) term16225).add(term16227);
        ((ArrayList) term16225).add(term16229);
        Class<? extends Object> term16360 = Class.forName((String) "nn.neural.AnnType");
        Field term16359 = ((Class) term16360).getDeclaredField((String) "INPUT");
        ((Field) term16359).setAccessible(true);
        Object enum99 = ((Field) term16359).get((Object) null);
        term16200 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term16200, term16200.getClass(), "output", term16201);
        setField(term16200, term16200.getClass(), "inputs", term16203);
        setField(term16200, term16200.getClass(), "outputs", term16225);
        setField(term16200, term16200.getClass(), "type", enum99);
        setIntField(term16200, term16200.getClass(), "id", -1986225025);
        setDoubleField(term16200, term16200.getClass(), "bias", 0.7012219082391921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.neural.AnnNode");
        Object[] args = new Object[1];
        args[0] = term16200;
        callMethod(klass, "setOut", argTypes, term16148, args);
    }

};


