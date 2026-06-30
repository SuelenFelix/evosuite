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

public class AnnConnection_getIn_10542849621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3147;

    public AnnConnection_getIn_10542849621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3150 = new Double(0.6767213143579776);
        Object term3154 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3154, term3154.getClass(), "weight", 0.58265008665336);
        setField(term3154, term3154.getClass(), "in", null);
        setField(term3154, term3154.getClass(), "out", null);
        Object term3156 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3156, term3156.getClass(), "weight", 0.0);
        setField(term3156, term3156.getClass(), "in", null);
        setField(term3156, term3156.getClass(), "out", null);
        Object term3158 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3158, term3158.getClass(), "weight", 0.0);
        setField(term3158, term3158.getClass(), "in", null);
        setField(term3158, term3158.getClass(), "out", null);
        Object term3160 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3160, term3160.getClass(), "weight", 0.04662501176438627);
        setField(term3160, term3160.getClass(), "in", null);
        setField(term3160, term3160.getClass(), "out", null);
        Object term3162 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3162, term3162.getClass(), "weight", 0.1163034938203874);
        setField(term3162, term3162.getClass(), "in", null);
        setField(term3162, term3162.getClass(), "out", null);
        ArrayList term3152 = new ArrayList();
        ((ArrayList) term3152).add(term3154);
        ((ArrayList) term3152).add(term3156);
        ((ArrayList) term3152).add(term3158);
        ((ArrayList) term3152).add(term3160);
        ((ArrayList) term3152).add(term3158);
        ((ArrayList) term3152).add(term3156);
        ((ArrayList) term3152).add(term3162);
        Object term3168 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3168, term3168.getClass(), "weight", 0.1187814206908886);
        setField(term3168, term3168.getClass(), "in", null);
        setField(term3168, term3168.getClass(), "out", null);
        Object term3170 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3170, term3170.getClass(), "weight", 0.0);
        setField(term3170, term3170.getClass(), "in", null);
        setField(term3170, term3170.getClass(), "out", null);
        Object term3172 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3172, term3172.getClass(), "weight", 0.0);
        setField(term3172, term3172.getClass(), "in", null);
        setField(term3172, term3172.getClass(), "out", null);
        ArrayList term3166 = new ArrayList();
        ((ArrayList) term3166).add(term3168);
        ((ArrayList) term3166).add(term3170);
        ((ArrayList) term3166).add(term3154);
        ((ArrayList) term3166).add(term3160);
        ((ArrayList) term3166).add(term3170);
        ((ArrayList) term3166).add(term3162);
        ((ArrayList) term3166).add(term3160);
        ((ArrayList) term3166).add(term3158);
        ((ArrayList) term3166).add(term3172);
        Class<? extends Object> term3213 = Class.forName((String) "nn.neural.AnnType");
        Field term3212 = ((Class) term3213).getDeclaredField((String) "OUTPUT");
        ((Field) term3212).setAccessible(true);
        Object enum20 = ((Field) term3212).get((Object) null);
        Double term3189 = new Double(0.146431486357265);
        Object term3193 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3193, term3193.getClass(), "weight", 0.0);
        setField(term3193, term3193.getClass(), "in", null);
        setField(term3193, term3193.getClass(), "out", null);
        ArrayList term3191 = new ArrayList();
        ((ArrayList) term3191).add(term3158);
        ((ArrayList) term3191).add(term3193);
        ((ArrayList) term3191).add(term3168);
        ((ArrayList) term3191).add(term3154);
        ((ArrayList) term3191).add(term3156);
        ((ArrayList) term3191).add(term3147);
        ArrayList term3197 = new ArrayList();
        ((ArrayList) term3197).add(term3168);
        Class<? extends Object> term3323 = Class.forName((String) "nn.neural.AnnType");
        Field term3322 = ((Class) term3323).getDeclaredField((String) "INPUT");
        ((Field) term3322).setAccessible(true);
        Object enum21 = ((Field) term3322).get((Object) null);
        term3147 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3149 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3188 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3147, term3147.getClass(), "weight", 0.0100718646868041);
        setField(term3149, term3149.getClass(), "output", term3150);
        setField(term3149, term3149.getClass(), "inputs", term3152);
        setField(term3149, term3149.getClass(), "outputs", term3166);
        setField(term3149, term3149.getClass(), "type", enum20);
        setIntField(term3149, term3149.getClass(), "id", 538259104);
        setDoubleField(term3149, term3149.getClass(), "bias", 0.9136597256674437);
        setField(term3147, term3147.getClass(), "in", term3149);
        setField(term3188, term3188.getClass(), "output", term3189);
        setField(term3188, term3188.getClass(), "inputs", term3191);
        setField(term3188, term3188.getClass(), "outputs", term3197);
        setField(term3188, term3188.getClass(), "type", enum21);
        setIntField(term3188, term3188.getClass(), "id", 96566506);
        setDoubleField(term3188, term3188.getClass(), "bias", 0.3741779691002205);
        setField(term3147, term3147.getClass(), "out", term3188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIn", argTypes, term3147, args);
    }

};


