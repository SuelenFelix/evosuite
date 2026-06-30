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
     Object term15982;

    public AnnConnection_getOut_9830966034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term15985 = new Double(0.509895859167191);
        Object term15989 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15989, term15989.getClass(), "weight", 0.6159623060552193);
        setField(term15989, term15989.getClass(), "in", null);
        setField(term15989, term15989.getClass(), "out", null);
        Object term15991 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15991, term15991.getClass(), "weight", 0.883798426792428);
        setField(term15991, term15991.getClass(), "in", null);
        setField(term15991, term15991.getClass(), "out", null);
        Object term15993 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15993, term15993.getClass(), "weight", 0.0);
        setField(term15993, term15993.getClass(), "in", null);
        setField(term15993, term15993.getClass(), "out", null);
        Object term15995 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15995, term15995.getClass(), "weight", 0.0);
        setField(term15995, term15995.getClass(), "in", null);
        setField(term15995, term15995.getClass(), "out", null);
        Object term15997 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term15997, term15997.getClass(), "weight", 0.0);
        setField(term15997, term15997.getClass(), "in", null);
        setField(term15997, term15997.getClass(), "out", null);
        ArrayList term15987 = new ArrayList();
        ((ArrayList) term15987).add(term15989);
        ((ArrayList) term15987).add(term15991);
        ((ArrayList) term15987).add(term15993);
        ((ArrayList) term15987).add(term15995);
        ((ArrayList) term15987).add(term15997);
        Object term16003 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16003, term16003.getClass(), "weight", 0.6324735890734227);
        setField(term16003, term16003.getClass(), "in", null);
        setField(term16003, term16003.getClass(), "out", null);
        Object term16005 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16005, term16005.getClass(), "weight", 0.0);
        setField(term16005, term16005.getClass(), "in", null);
        setField(term16005, term16005.getClass(), "out", null);
        Object term16007 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16007, term16007.getClass(), "weight", 0.3808902109160499);
        setField(term16007, term16007.getClass(), "in", null);
        setField(term16007, term16007.getClass(), "out", null);
        ArrayList term16001 = new ArrayList();
        ((ArrayList) term16001).add(term15989);
        ((ArrayList) term16001).add(term16003);
        ((ArrayList) term16001).add(term15989);
        ((ArrayList) term16001).add(term16005);
        ((ArrayList) term16001).add(term16007);
        Class<? extends Object> term16039 = Class.forName((String) "nn.neural.AnnType");
        Field term16038 = ((Class) term16039).getDeclaredField((String) "OUTPUT");
        ((Field) term16038).setAccessible(true);
        Object enum97 = ((Field) term16038).get((Object) null);
        Double term16024 = new Double(0.623231822150205);
        Object term16028 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term16028, term16028.getClass(), "weight", 0.0);
        setField(term16028, term16028.getClass(), "in", null);
        setField(term16028, term16028.getClass(), "out", null);
        ArrayList term16026 = new ArrayList();
        ((ArrayList) term16026).add(term15997);
        ((ArrayList) term16026).add(term16007);
        ((ArrayList) term16026).add(term15995);
        ((ArrayList) term16026).add(term15995);
        ((ArrayList) term16026).add(term16028);
        ((ArrayList) term16026).add(term15982);
        ArrayList term16032 = new ArrayList();
        ((ArrayList) term16032).add(term15982);
        ((ArrayList) term16032).add(term15991);
        ((ArrayList) term16032).add(term15989);
        ((ArrayList) term16032).add(term15995);
        ((ArrayList) term16032).add(term15989);
        ((ArrayList) term16032).add(term15993);
        ((ArrayList) term16032).add(term16028);
        ((ArrayList) term16032).add(term15993);
        term15982 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term15984 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term16023 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term15982, term15982.getClass(), "weight", 0.15833228093630225);
        setField(term15984, term15984.getClass(), "output", term15985);
        setField(term15984, term15984.getClass(), "inputs", term15987);
        setField(term15984, term15984.getClass(), "outputs", term16001);
        setField(term15984, term15984.getClass(), "type", enum97);
        setIntField(term15984, term15984.getClass(), "id", 1598831363);
        setDoubleField(term15984, term15984.getClass(), "bias", 0.811099486121254);
        setField(term15982, term15982.getClass(), "in", term15984);
        setField(term16023, term16023.getClass(), "output", term16024);
        setField(term16023, term16023.getClass(), "inputs", term16026);
        setField(term16023, term16023.getClass(), "outputs", term16032);
        setField(term16023, term16023.getClass(), "type", enum97);
        setIntField(term16023, term16023.getClass(), "id", -690367798);
        setDoubleField(term16023, term16023.getClass(), "bias", 0.7148906778566934);
        setField(term15982, term15982.getClass(), "out", term16023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOut", argTypes, term15982, args);
    }

};


