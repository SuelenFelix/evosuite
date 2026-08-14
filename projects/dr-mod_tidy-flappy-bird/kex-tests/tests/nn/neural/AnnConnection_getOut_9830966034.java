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
     Object term15998;

    public AnnConnection_getOut_9830966034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term16001 = new Double(0.509895859167191);
        Object term16005 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16005, term16005.getClass(), "weight", 0.6159623060552193);
        setField(term16005, term16005.getClass(), "in", null);
        setField(term16005, term16005.getClass(), "out", null);
        Object term16007 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16007, term16007.getClass(), "weight", 0.883798426792428);
        setField(term16007, term16007.getClass(), "in", null);
        setField(term16007, term16007.getClass(), "out", null);
        Object term16009 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16009, term16009.getClass(), "weight", 0.0);
        setField(term16009, term16009.getClass(), "in", null);
        setField(term16009, term16009.getClass(), "out", null);
        Object term16011 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16011, term16011.getClass(), "weight", 0.0);
        setField(term16011, term16011.getClass(), "in", null);
        setField(term16011, term16011.getClass(), "out", null);
        Object term16013 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16013, term16013.getClass(), "weight", 0.0);
        setField(term16013, term16013.getClass(), "in", null);
        setField(term16013, term16013.getClass(), "out", null);
        ArrayList term16003 = new ArrayList();
        ((ArrayList) term16003).add(term16005);
        ((ArrayList) term16003).add(term16007);
        ((ArrayList) term16003).add(term16009);
        ((ArrayList) term16003).add(term16011);
        ((ArrayList) term16003).add(term16013);
        Object term16019 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16019, term16019.getClass(), "weight", 0.6324735890734227);
        setField(term16019, term16019.getClass(), "in", null);
        setField(term16019, term16019.getClass(), "out", null);
        Object term16021 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16021, term16021.getClass(), "weight", 0.0);
        setField(term16021, term16021.getClass(), "in", null);
        setField(term16021, term16021.getClass(), "out", null);
        Object term16023 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16023, term16023.getClass(), "weight", 0.3808902109160499);
        setField(term16023, term16023.getClass(), "in", null);
        setField(term16023, term16023.getClass(), "out", null);
        ArrayList term16017 = new ArrayList();
        ((ArrayList) term16017).add(term16005);
        ((ArrayList) term16017).add(term16019);
        ((ArrayList) term16017).add(term16005);
        ((ArrayList) term16017).add(term16021);
        ((ArrayList) term16017).add(term16023);
        Class<? extends Object> term16055 = Class.forName((String) "nn.neural.AnnType");
        Field term16054 = ((Class) term16055).getDeclaredField((String) "OUTPUT");
        ((Field) term16054).setAccessible(true);
        Object enum97 = ((Field) term16054).get((Object) null);
        Double term16040 = new Double(0.623231822150205);
        Object term16044 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16044, term16044.getClass(), "weight", 0.0);
        setField(term16044, term16044.getClass(), "in", null);
        setField(term16044, term16044.getClass(), "out", null);
        ArrayList term16042 = new ArrayList();
        ((ArrayList) term16042).add(term16013);
        ((ArrayList) term16042).add(term16023);
        ((ArrayList) term16042).add(term16011);
        ((ArrayList) term16042).add(term16011);
        ((ArrayList) term16042).add(term16044);
        ((ArrayList) term16042).add(term15998);
        ArrayList term16048 = new ArrayList();
        ((ArrayList) term16048).add(term15998);
        ((ArrayList) term16048).add(term16007);
        ((ArrayList) term16048).add(term16005);
        ((ArrayList) term16048).add(term16011);
        ((ArrayList) term16048).add(term16005);
        ((ArrayList) term16048).add(term16009);
        ((ArrayList) term16048).add(term16044);
        ((ArrayList) term16048).add(term16009);
        term15998 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term16000 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16039 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term15998, term15998.getClass(), "weight", 0.15833228093630225);
        setField(term16000, term16000.getClass(), "output", term16001);
        setField(term16000, term16000.getClass(), "inputs", term16003);
        setField(term16000, term16000.getClass(), "outputs", term16017);
        setField(term16000, term16000.getClass(), "type", enum97);
        setIntField(term16000, term16000.getClass(), "id", 1598831363);
        setDoubleField(term16000, term16000.getClass(), "bias", 0.811099486121254);
        setField(term15998, term15998.getClass(), "in", term16000);
        setField(term16039, term16039.getClass(), "output", term16040);
        setField(term16039, term16039.getClass(), "inputs", term16042);
        setField(term16039, term16039.getClass(), "outputs", term16048);
        setField(term16039, term16039.getClass(), "type", enum97);
        setIntField(term16039, term16039.getClass(), "id", -690367798);
        setDoubleField(term16039, term16039.getClass(), "bias", 0.7148906778566934);
        setField(term15998, term15998.getClass(), "out", term16039);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term15998, args);
    }

};


