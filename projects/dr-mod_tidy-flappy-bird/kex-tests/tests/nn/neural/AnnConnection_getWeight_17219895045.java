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
     Object term4389;

    public AnnConnection_getWeight_17219895045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4392 = new Double(0.9341364461850963);
        Object term4396 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4396, term4396.getClass(), "weight", 0.34234234602085223);
        setField(term4396, term4396.getClass(), "in", null);
        setField(term4396, term4396.getClass(), "out", null);
        Object term4398 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4398, term4398.getClass(), "weight", 0.0);
        setField(term4398, term4398.getClass(), "in", null);
        setField(term4398, term4398.getClass(), "out", null);
        ArrayList term4394 = new ArrayList();
        ((ArrayList) term4394).add(term4396);
        ((ArrayList) term4394).add(term4398);
        ((ArrayList) term4394).add(term4396);
        Object term4404 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4404, term4404.getClass(), "weight", 0.0);
        setField(term4404, term4404.getClass(), "in", null);
        setField(term4404, term4404.getClass(), "out", null);
        Object term4406 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4406, term4406.getClass(), "weight", 0.0);
        setField(term4406, term4406.getClass(), "in", null);
        setField(term4406, term4406.getClass(), "out", null);
        ArrayList term4402 = new ArrayList();
        ((ArrayList) term4402).add(term4404);
        ((ArrayList) term4402).add(term4406);
        Class<? extends Object> term4454 = Class.forName((String) "nn.neural.AnnType");
        Field term4453 = ((Class) term4454).getDeclaredField((String) "HIDDEN");
        ((Field) term4453).setAccessible(true);
        Object enum28 = ((Field) term4453).get((Object) null);
        Double term4423 = new Double(0.9123572866833729);
        Object term4427 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4427, term4427.getClass(), "weight", 0.8355624480198577);
        setField(term4427, term4427.getClass(), "in", null);
        setField(term4427, term4427.getClass(), "out", null);
        Object term4429 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4429, term4429.getClass(), "weight", 0.0);
        setField(term4429, term4429.getClass(), "in", null);
        setField(term4429, term4429.getClass(), "out", null);
        ArrayList term4425 = new ArrayList();
        ((ArrayList) term4425).add(term4427);
        ((ArrayList) term4425).add(term4396);
        ((ArrayList) term4425).add(term4406);
        ((ArrayList) term4425).add(term4429);
        ((ArrayList) term4425).add(term4389);
        Object term4435 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4435, term4435.getClass(), "weight", 0.0);
        setField(term4435, term4435.getClass(), "in", null);
        setField(term4435, term4435.getClass(), "out", null);
        Object term4437 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4437, term4437.getClass(), "weight", 0.8303221706066055);
        setField(term4437, term4437.getClass(), "in", null);
        setField(term4437, term4437.getClass(), "out", null);
        ArrayList term4433 = new ArrayList();
        ((ArrayList) term4433).add(term4435);
        ((ArrayList) term4433).add(term4437);
        Class<? extends Object> term4564 = Class.forName((String) "nn.neural.AnnType");
        Field term4563 = ((Class) term4564).getDeclaredField((String) "OUTPUT");
        ((Field) term4563).setAccessible(true);
        Object enum29 = ((Field) term4563).get((Object) null);
        term4389 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term4391 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term4422 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term4389, term4389.getClass(), "weight", 0.10963898027157926);
        setField(term4391, term4391.getClass(), "output", term4392);
        setField(term4391, term4391.getClass(), "inputs", term4394);
        setField(term4391, term4391.getClass(), "outputs", term4402);
        setField(term4391, term4391.getClass(), "type", enum28);
        setIntField(term4391, term4391.getClass(), "id", 1358829571);
        setDoubleField(term4391, term4391.getClass(), "bias", 0.9188322321077216);
        setField(term4389, term4389.getClass(), "in", term4391);
        setField(term4422, term4422.getClass(), "output", term4423);
        setField(term4422, term4422.getClass(), "inputs", term4425);
        setField(term4422, term4422.getClass(), "outputs", term4433);
        setField(term4422, term4422.getClass(), "type", enum29);
        setIntField(term4422, term4422.getClass(), "id", 991356662);
        setDoubleField(term4422, term4422.getClass(), "bias", 0.8046904246652031);
        setField(term4389, term4389.getClass(), "out", term4422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term4389, args);
    }

};


