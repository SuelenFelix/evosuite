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
     Object term4391;

    public AnnConnection_getWeight_17219895045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4394 = new Double(0.9341364461850963);
        Object term4398 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4398, term4398.getClass(), "weight", 0.34234234602085223);
        setField(term4398, term4398.getClass(), "in", null);
        setField(term4398, term4398.getClass(), "out", null);
        Object term4400 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4400, term4400.getClass(), "weight", 0.0);
        setField(term4400, term4400.getClass(), "in", null);
        setField(term4400, term4400.getClass(), "out", null);
        ArrayList term4396 = new ArrayList();
        ((ArrayList) term4396).add(term4398);
        ((ArrayList) term4396).add(term4400);
        ((ArrayList) term4396).add(term4398);
        Object term4406 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4406, term4406.getClass(), "weight", 0.0);
        setField(term4406, term4406.getClass(), "in", null);
        setField(term4406, term4406.getClass(), "out", null);
        Object term4408 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4408, term4408.getClass(), "weight", 0.0);
        setField(term4408, term4408.getClass(), "in", null);
        setField(term4408, term4408.getClass(), "out", null);
        ArrayList term4404 = new ArrayList();
        ((ArrayList) term4404).add(term4406);
        ((ArrayList) term4404).add(term4408);
        Class<? extends Object> term4456 = Class.forName((String) "nn.neural.AnnType");
        Field term4455 = ((Class) term4456).getDeclaredField((String) "HIDDEN");
        ((Field) term4455).setAccessible(true);
        Object enum28 = ((Field) term4455).get((Object) null);
        Double term4425 = new Double(0.9123572866833729);
        Object term4429 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4429, term4429.getClass(), "weight", 0.8355624480198577);
        setField(term4429, term4429.getClass(), "in", null);
        setField(term4429, term4429.getClass(), "out", null);
        Object term4431 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4431, term4431.getClass(), "weight", 0.0);
        setField(term4431, term4431.getClass(), "in", null);
        setField(term4431, term4431.getClass(), "out", null);
        ArrayList term4427 = new ArrayList();
        ((ArrayList) term4427).add(term4429);
        ((ArrayList) term4427).add(term4398);
        ((ArrayList) term4427).add(term4408);
        ((ArrayList) term4427).add(term4431);
        ((ArrayList) term4427).add(term4391);
        Object term4437 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4437, term4437.getClass(), "weight", 0.0);
        setField(term4437, term4437.getClass(), "in", null);
        setField(term4437, term4437.getClass(), "out", null);
        Object term4439 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term4439, term4439.getClass(), "weight", 0.8303221706066055);
        setField(term4439, term4439.getClass(), "in", null);
        setField(term4439, term4439.getClass(), "out", null);
        ArrayList term4435 = new ArrayList();
        ((ArrayList) term4435).add(term4437);
        ((ArrayList) term4435).add(term4439);
        Class<? extends Object> term4566 = Class.forName((String) "nn.neural.AnnType");
        Field term4565 = ((Class) term4566).getDeclaredField((String) "OUTPUT");
        ((Field) term4565).setAccessible(true);
        Object enum29 = ((Field) term4565).get((Object) null);
        term4391 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term4393 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term4424 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term4391, term4391.getClass(), "weight", 0.10963898027157926);
        setField(term4393, term4393.getClass(), "output", term4394);
        setField(term4393, term4393.getClass(), "inputs", term4396);
        setField(term4393, term4393.getClass(), "outputs", term4404);
        setField(term4393, term4393.getClass(), "type", enum28);
        setIntField(term4393, term4393.getClass(), "id", 1358829571);
        setDoubleField(term4393, term4393.getClass(), "bias", 0.9188322321077216);
        setField(term4391, term4391.getClass(), "in", term4393);
        setField(term4424, term4424.getClass(), "output", term4425);
        setField(term4424, term4424.getClass(), "inputs", term4427);
        setField(term4424, term4424.getClass(), "outputs", term4435);
        setField(term4424, term4424.getClass(), "type", enum29);
        setIntField(term4424, term4424.getClass(), "id", 991356662);
        setDoubleField(term4424, term4424.getClass(), "bias", 0.8046904246652031);
        setField(term4391, term4391.getClass(), "out", term4424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWeight", argTypes, term4391, args);
    }

};


