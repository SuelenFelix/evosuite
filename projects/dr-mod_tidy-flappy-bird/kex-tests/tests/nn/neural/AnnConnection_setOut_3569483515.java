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
     Object term16164;
     Object term16216;

    public AnnConnection_setOut_3569483515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16167 = new Double(0.09037487793444521);
        Object term16171 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16171, term16171.getClass(), "weight", 0.699722589784733);
        setField(term16171, term16171.getClass(), "in", null);
        setField(term16171, term16171.getClass(), "out", null);
        Object term16173 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16173, term16173.getClass(), "weight", 0.0);
        setField(term16173, term16173.getClass(), "in", null);
        setField(term16173, term16173.getClass(), "out", null);
        Object term16175 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16175, term16175.getClass(), "weight", 0.0);
        setField(term16175, term16175.getClass(), "in", null);
        setField(term16175, term16175.getClass(), "out", null);
        Object term16177 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16177, term16177.getClass(), "weight", 0.41437680771372976);
        setField(term16177, term16177.getClass(), "in", null);
        setField(term16177, term16177.getClass(), "out", null);
        ArrayList term16169 = new ArrayList();
        ((ArrayList) term16169).add(term16171);
        ((ArrayList) term16169).add(term16173);
        ((ArrayList) term16169).add(term16175);
        ((ArrayList) term16169).add(term16171);
        ((ArrayList) term16169).add(term16177);
        Object term16183 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16183, term16183.getClass(), "weight", 0.0);
        setField(term16183, term16183.getClass(), "in", null);
        setField(term16183, term16183.getClass(), "out", null);
        Object term16185 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16185, term16185.getClass(), "weight", 0.31449454294142376);
        setField(term16185, term16185.getClass(), "in", null);
        setField(term16185, term16185.getClass(), "out", null);
        ArrayList term16181 = new ArrayList();
        ((ArrayList) term16181).add(term16171);
        ((ArrayList) term16181).add(term16183);
        ((ArrayList) term16181).add(term16185);
        ((ArrayList) term16181).add(term16175);
        ((ArrayList) term16181).add(term16185);
        Class<? extends Object> term16266 = Class.forName((String) "nn.neural.AnnType");
        Field term16265 = ((Class) term16266).getDeclaredField((String) "HIDDEN");
        ((Field) term16265).setAccessible(true);
        Object enum98 = ((Field) term16265).get((Object) null);
        Double term16202 = new Double(0.9511861072660375);
        Object term16206 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16206, term16206.getClass(), "weight", 0.0);
        setField(term16206, term16206.getClass(), "in", null);
        setField(term16206, term16206.getClass(), "out", null);
        ArrayList term16204 = new ArrayList();
        ((ArrayList) term16204).add(term16173);
        ((ArrayList) term16204).add(term16173);
        ((ArrayList) term16204).add(term16206);
        ((ArrayList) term16204).add(term16164);
        ((ArrayList) term16204).add(term16164);
        ArrayList term16210 = new ArrayList();
        term16164 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16166 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16201 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16164, term16164.getClass(), "weight", 0.9948833256821954);
        setField(term16166, term16166.getClass(), "output", term16167);
        setField(term16166, term16166.getClass(), "inputs", term16169);
        setField(term16166, term16166.getClass(), "outputs", term16181);
        setField(term16166, term16166.getClass(), "type", enum98);
        setIntField(term16166, term16166.getClass(), "id", -1512221115);
        setDoubleField(term16166, term16166.getClass(), "bias", 0.7993342506043556);
        setField(term16164, term16164.getClass(), "in", term16166);
        setField(term16201, term16201.getClass(), "output", term16202);
        setField(term16201, term16201.getClass(), "inputs", term16204);
        setField(term16201, term16201.getClass(), "outputs", term16210);
        setField(term16201, term16201.getClass(), "type", enum98);
        setIntField(term16201, term16201.getClass(), "id", -515486706);
        setDoubleField(term16201, term16201.getClass(), "bias", 0.1397483969082174);
        setField(term16164, term16164.getClass(), "out", term16201);
        Double term16217 = new Double(0.05880719443135807);
        Double term16224 = new Double(0.34010089048558567);
        Object term16221 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16223 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16228 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16221, term16221.getClass(), "weight", 0.7734226136878846);
        setField(term16223, term16223.getClass(), "output", term16224);
        setField(term16223, term16223.getClass(), "inputs", null);
        setField(term16223, term16223.getClass(), "outputs", null);
        setField(term16223, term16223.getClass(), "type", enum98);
        setIntField(term16223, term16223.getClass(), "id", -1176968921);
        setDoubleField(term16223, term16223.getClass(), "bias", 0.38751643915794354);
        setField(term16221, term16221.getClass(), "in", term16223);
        setField(term16228, term16228.getClass(), "output", null);
        setField(term16228, term16228.getClass(), "inputs", null);
        setField(term16228, term16228.getClass(), "outputs", null);
        setField(term16228, term16228.getClass(), "type", null);
        setIntField(term16228, term16228.getClass(), "id", 0);
        setDoubleField(term16228, term16228.getClass(), "bias", 0.0);
        setField(term16221, term16221.getClass(), "out", term16228);
        Object term16231 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16233 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16236 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16231, term16231.getClass(), "weight", 0.4655589762588376);
        setField(term16233, term16233.getClass(), "output", null);
        setField(term16233, term16233.getClass(), "inputs", null);
        setField(term16233, term16233.getClass(), "outputs", null);
        setField(term16233, term16233.getClass(), "type", null);
        setIntField(term16233, term16233.getClass(), "id", 0);
        setDoubleField(term16233, term16233.getClass(), "bias", 0.0);
        setField(term16231, term16231.getClass(), "in", term16233);
        setField(term16236, term16236.getClass(), "output", null);
        setField(term16236, term16236.getClass(), "inputs", null);
        setField(term16236, term16236.getClass(), "outputs", null);
        setField(term16236, term16236.getClass(), "type", null);
        setIntField(term16236, term16236.getClass(), "id", 0);
        setDoubleField(term16236, term16236.getClass(), "bias", 0.0);
        setField(term16231, term16231.getClass(), "out", term16236);
        ArrayList term16219 = new ArrayList();
        ((ArrayList) term16219).add(term16221);
        ((ArrayList) term16219).add(term16231);
        ((ArrayList) term16219).add(term16221);
        Object term16243 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16243, term16243.getClass(), "weight", 0.01058857386775991);
        setField(term16243, term16243.getClass(), "in", term16223);
        setField(term16243, term16243.getClass(), "out", term16223);
        Double term16248 = new Double(0.9341364461850963);
        Object term16245 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16247 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term16245, term16245.getClass(), "weight", 0.23604751860793194);
        setField(term16247, term16247.getClass(), "output", term16248);
        setField(term16247, term16247.getClass(), "inputs", null);
        setField(term16247, term16247.getClass(), "outputs", null);
        setField(term16247, term16247.getClass(), "type", null);
        setIntField(term16247, term16247.getClass(), "id", -612862488);
        setDoubleField(term16247, term16247.getClass(), "bias", 0.47389726801621446);
        setField(term16245, term16245.getClass(), "in", term16247);
        setField(term16245, term16245.getClass(), "out", term16236);
        ArrayList term16241 = new ArrayList();
        ((ArrayList) term16241).add(term16243);
        ((ArrayList) term16241).add(term16245);
        Class<? extends Object> term16376 = Class.forName((String) "nn.neural.AnnType");
        Field term16375 = ((Class) term16376).getDeclaredField((String) "INPUT");
        ((Field) term16375).setAccessible(true);
        Object enum99 = ((Field) term16375).get((Object) null);
        term16216 = newInstance(Class.forName("nn.neural.AnnNode"));
        setField(term16216, term16216.getClass(), "output", term16217);
        setField(term16216, term16216.getClass(), "inputs", term16219);
        setField(term16216, term16216.getClass(), "outputs", term16241);
        setField(term16216, term16216.getClass(), "type", enum99);
        setIntField(term16216, term16216.getClass(), "id", -1986225025);
        setDoubleField(term16216, term16216.getClass(), "bias", 0.7012219082391921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.neural.AnnNode");
        Object[] args = new Object[1];
        args[0] = term16216;
        callMethod(klass, "setOut", argTypes, term16164, args);
    }

};


