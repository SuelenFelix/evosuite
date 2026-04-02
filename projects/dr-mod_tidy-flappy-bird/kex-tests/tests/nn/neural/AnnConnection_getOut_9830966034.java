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

public class AnnConnection_getOut_9830966034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15992;

    public AnnConnection_getOut_9830966034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term15995 = new Double(0.509895859167191);
        Object term15999 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15999, term15999.getClass(), "weight", 0.6159623060552193);
        setField(term15999, term15999.getClass(), "in", null);
        setField(term15999, term15999.getClass(), "out", null);
        Object term16001 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16001, term16001.getClass(), "weight", 0.883798426792428);
        setField(term16001, term16001.getClass(), "in", null);
        setField(term16001, term16001.getClass(), "out", null);
        Object term16003 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16003, term16003.getClass(), "weight", 0.0);
        setField(term16003, term16003.getClass(), "in", null);
        setField(term16003, term16003.getClass(), "out", null);
        Object term16005 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16005, term16005.getClass(), "weight", 0.0);
        setField(term16005, term16005.getClass(), "in", null);
        setField(term16005, term16005.getClass(), "out", null);
        Object term16007 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16007, term16007.getClass(), "weight", 0.0);
        setField(term16007, term16007.getClass(), "in", null);
        setField(term16007, term16007.getClass(), "out", null);
        ArrayList term15997 = new ArrayList();
        ((ArrayList) term15997).add(term15999);
        ((ArrayList) term15997).add(term16001);
        ((ArrayList) term15997).add(term16003);
        ((ArrayList) term15997).add(term16005);
        ((ArrayList) term15997).add(term16007);
        Object term16013 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16013, term16013.getClass(), "weight", 0.6324735890734227);
        setField(term16013, term16013.getClass(), "in", null);
        setField(term16013, term16013.getClass(), "out", null);
        Object term16015 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16015, term16015.getClass(), "weight", 0.0);
        setField(term16015, term16015.getClass(), "in", null);
        setField(term16015, term16015.getClass(), "out", null);
        Object term16017 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16017, term16017.getClass(), "weight", 0.3808902109160499);
        setField(term16017, term16017.getClass(), "in", null);
        setField(term16017, term16017.getClass(), "out", null);
        ArrayList term16011 = new ArrayList();
        ((ArrayList) term16011).add(term15999);
        ((ArrayList) term16011).add(term16013);
        ((ArrayList) term16011).add(term15999);
        ((ArrayList) term16011).add(term16015);
        ((ArrayList) term16011).add(term16017);
        Class<? extends Object> term16049 = Class.forName((String) "nn.neural.AnnType");
        Field term16048 = ((Class) term16049).getDeclaredField((String) "OUTPUT");
        ((Field) term16048).setAccessible(true);
        Object enum97 = ((Field) term16048).get((Object) null);
        Double term16034 = new Double(0.623231822150205);
        Object term16038 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16038, term16038.getClass(), "weight", 0.0);
        setField(term16038, term16038.getClass(), "in", null);
        setField(term16038, term16038.getClass(), "out", null);
        ArrayList term16036 = new ArrayList();
        ((ArrayList) term16036).add(term16007);
        ((ArrayList) term16036).add(term16017);
        ((ArrayList) term16036).add(term16005);
        ((ArrayList) term16036).add(term16005);
        ((ArrayList) term16036).add(term16038);
        ((ArrayList) term16036).add(term15992);
        ArrayList term16042 = new ArrayList();
        ((ArrayList) term16042).add(term15992);
        ((ArrayList) term16042).add(term16001);
        ((ArrayList) term16042).add(term15999);
        ((ArrayList) term16042).add(term16005);
        ((ArrayList) term16042).add(term15999);
        ((ArrayList) term16042).add(term16003);
        ((ArrayList) term16042).add(term16038);
        ((ArrayList) term16042).add(term16003);
        term15992 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term15994 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16033 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term15992, term15992.getClass(), "weight", 0.15833228093630225);
        setField(term15994, term15994.getClass(), "output", term15995);
        setField(term15994, term15994.getClass(), "inputs", term15997);
        setField(term15994, term15994.getClass(), "outputs", term16011);
        setField(term15994, term15994.getClass(), "type", enum97);
        setIntField(term15994, term15994.getClass(), "id", 1598831363);
        setDoubleField(term15994, term15994.getClass(), "bias", 0.811099486121254);
        setField(term15992, term15992.getClass(), "in", term15994);
        setField(term16033, term16033.getClass(), "output", term16034);
        setField(term16033, term16033.getClass(), "inputs", term16036);
        setField(term16033, term16033.getClass(), "outputs", term16042);
        setField(term16033, term16033.getClass(), "type", enum97);
        setIntField(term16033, term16033.getClass(), "id", -690367798);
        setDoubleField(term16033, term16033.getClass(), "bias", 0.7148906778566934);
        setField(term15992, term15992.getClass(), "out", term16033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term15992, args);
    }

};


