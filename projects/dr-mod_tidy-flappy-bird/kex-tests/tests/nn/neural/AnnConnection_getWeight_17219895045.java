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

public class AnnConnection_getWeight_17219895045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4393;

    public AnnConnection_getWeight_17219895045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4396 = new Double(0.9341364461850963);
        Object term4400 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4400, term4400.getClass(), "weight", 0.34234234602085223);
        setField(term4400, term4400.getClass(), "in", null);
        setField(term4400, term4400.getClass(), "out", null);
        Object term4402 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4402, term4402.getClass(), "weight", 0.0);
        setField(term4402, term4402.getClass(), "in", null);
        setField(term4402, term4402.getClass(), "out", null);
        ArrayList term4398 = new ArrayList();
        ((ArrayList) term4398).add(term4400);
        ((ArrayList) term4398).add(term4402);
        ((ArrayList) term4398).add(term4400);
        Object term4408 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4408, term4408.getClass(), "weight", 0.0);
        setField(term4408, term4408.getClass(), "in", null);
        setField(term4408, term4408.getClass(), "out", null);
        Object term4410 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4410, term4410.getClass(), "weight", 0.0);
        setField(term4410, term4410.getClass(), "in", null);
        setField(term4410, term4410.getClass(), "out", null);
        ArrayList term4406 = new ArrayList();
        ((ArrayList) term4406).add(term4408);
        ((ArrayList) term4406).add(term4410);
        Class<? extends Object> term4458 = Class.forName((String) "nn.neural.AnnType");
        Field term4457 = ((Class) term4458).getDeclaredField((String) "HIDDEN");
        ((Field) term4457).setAccessible(true);
        Object enum28 = ((Field) term4457).get((Object) null);
        Double term4427 = new Double(0.9123572866833729);
        Object term4431 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4431, term4431.getClass(), "weight", 0.8355624480198577);
        setField(term4431, term4431.getClass(), "in", null);
        setField(term4431, term4431.getClass(), "out", null);
        Object term4433 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4433, term4433.getClass(), "weight", 0.0);
        setField(term4433, term4433.getClass(), "in", null);
        setField(term4433, term4433.getClass(), "out", null);
        ArrayList term4429 = new ArrayList();
        ((ArrayList) term4429).add(term4431);
        ((ArrayList) term4429).add(term4400);
        ((ArrayList) term4429).add(term4410);
        ((ArrayList) term4429).add(term4433);
        ((ArrayList) term4429).add(term4393);
        Object term4439 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4439, term4439.getClass(), "weight", 0.0);
        setField(term4439, term4439.getClass(), "in", null);
        setField(term4439, term4439.getClass(), "out", null);
        Object term4441 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4441, term4441.getClass(), "weight", 0.8303221706066055);
        setField(term4441, term4441.getClass(), "in", null);
        setField(term4441, term4441.getClass(), "out", null);
        ArrayList term4437 = new ArrayList();
        ((ArrayList) term4437).add(term4439);
        ((ArrayList) term4437).add(term4441);
        Class<? extends Object> term4568 = Class.forName((String) "nn.neural.AnnType");
        Field term4567 = ((Class) term4568).getDeclaredField((String) "OUTPUT");
        ((Field) term4567).setAccessible(true);
        Object enum29 = ((Field) term4567).get((Object) null);
        term4393 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term4395 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term4426 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term4393, term4393.getClass(), "weight", 0.10963898027157926);
        setField(term4395, term4395.getClass(), "output", term4396);
        setField(term4395, term4395.getClass(), "inputs", term4398);
        setField(term4395, term4395.getClass(), "outputs", term4406);
        setField(term4395, term4395.getClass(), "type", enum28);
        setIntField(term4395, term4395.getClass(), "id", 1358829571);
        setDoubleField(term4395, term4395.getClass(), "bias", 0.9188322321077216);
        setField(term4393, term4393.getClass(), "in", term4395);
        setField(term4426, term4426.getClass(), "output", term4427);
        setField(term4426, term4426.getClass(), "inputs", term4429);
        setField(term4426, term4426.getClass(), "outputs", term4437);
        setField(term4426, term4426.getClass(), "type", enum29);
        setIntField(term4426, term4426.getClass(), "id", 991356662);
        setDoubleField(term4426, term4426.getClass(), "bias", 0.8046904246652031);
        setField(term4393, term4393.getClass(), "out", term4426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term4393, args);
    }

};


