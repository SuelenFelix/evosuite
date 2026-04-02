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
     Object term3143;

    public AnnConnection_getIn_10542849621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3146 = new Double(0.6767213143579776);
        Object term3150 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3150, term3150.getClass(), "weight", 0.58265008665336);
        setField(term3150, term3150.getClass(), "in", null);
        setField(term3150, term3150.getClass(), "out", null);
        Object term3152 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3152, term3152.getClass(), "weight", 0.0);
        setField(term3152, term3152.getClass(), "in", null);
        setField(term3152, term3152.getClass(), "out", null);
        Object term3154 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3154, term3154.getClass(), "weight", 0.0);
        setField(term3154, term3154.getClass(), "in", null);
        setField(term3154, term3154.getClass(), "out", null);
        Object term3156 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3156, term3156.getClass(), "weight", 0.04662501176438627);
        setField(term3156, term3156.getClass(), "in", null);
        setField(term3156, term3156.getClass(), "out", null);
        Object term3158 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3158, term3158.getClass(), "weight", 0.1163034938203874);
        setField(term3158, term3158.getClass(), "in", null);
        setField(term3158, term3158.getClass(), "out", null);
        ArrayList term3148 = new ArrayList();
        ((ArrayList) term3148).add(term3150);
        ((ArrayList) term3148).add(term3152);
        ((ArrayList) term3148).add(term3154);
        ((ArrayList) term3148).add(term3156);
        ((ArrayList) term3148).add(term3154);
        ((ArrayList) term3148).add(term3152);
        ((ArrayList) term3148).add(term3158);
        Object term3164 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3164, term3164.getClass(), "weight", 0.1187814206908886);
        setField(term3164, term3164.getClass(), "in", null);
        setField(term3164, term3164.getClass(), "out", null);
        Object term3166 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3166, term3166.getClass(), "weight", 0.0);
        setField(term3166, term3166.getClass(), "in", null);
        setField(term3166, term3166.getClass(), "out", null);
        Object term3168 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3168, term3168.getClass(), "weight", 0.0);
        setField(term3168, term3168.getClass(), "in", null);
        setField(term3168, term3168.getClass(), "out", null);
        ArrayList term3162 = new ArrayList();
        ((ArrayList) term3162).add(term3164);
        ((ArrayList) term3162).add(term3166);
        ((ArrayList) term3162).add(term3150);
        ((ArrayList) term3162).add(term3156);
        ((ArrayList) term3162).add(term3166);
        ((ArrayList) term3162).add(term3158);
        ((ArrayList) term3162).add(term3156);
        ((ArrayList) term3162).add(term3154);
        ((ArrayList) term3162).add(term3168);
        Class<? extends Object> term3209 = Class.forName((String) "nn.neural.AnnType");
        Field term3208 = ((Class) term3209).getDeclaredField((String) "OUTPUT");
        ((Field) term3208).setAccessible(true);
        Object enum20 = ((Field) term3208).get((Object) null);
        Double term3185 = new Double(0.146431486357265);
        Object term3189 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3189, term3189.getClass(), "weight", 0.0);
        setField(term3189, term3189.getClass(), "in", null);
        setField(term3189, term3189.getClass(), "out", null);
        ArrayList term3187 = new ArrayList();
        ((ArrayList) term3187).add(term3154);
        ((ArrayList) term3187).add(term3189);
        ((ArrayList) term3187).add(term3164);
        ((ArrayList) term3187).add(term3150);
        ((ArrayList) term3187).add(term3152);
        ((ArrayList) term3187).add(term3143);
        ArrayList term3193 = new ArrayList();
        ((ArrayList) term3193).add(term3164);
        Class<? extends Object> term3319 = Class.forName((String) "nn.neural.AnnType");
        Field term3318 = ((Class) term3319).getDeclaredField((String) "INPUT");
        ((Field) term3318).setAccessible(true);
        Object enum21 = ((Field) term3318).get((Object) null);
        term3143 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3145 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3184 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3143, term3143.getClass(), "weight", 0.0100718646868041);
        setField(term3145, term3145.getClass(), "output", term3146);
        setField(term3145, term3145.getClass(), "inputs", term3148);
        setField(term3145, term3145.getClass(), "outputs", term3162);
        setField(term3145, term3145.getClass(), "type", enum20);
        setIntField(term3145, term3145.getClass(), "id", 538259104);
        setDoubleField(term3145, term3145.getClass(), "bias", 0.9136597256674437);
        setField(term3143, term3143.getClass(), "in", term3145);
        setField(term3184, term3184.getClass(), "output", term3185);
        setField(term3184, term3184.getClass(), "inputs", term3187);
        setField(term3184, term3184.getClass(), "outputs", term3193);
        setField(term3184, term3184.getClass(), "type", enum21);
        setIntField(term3184, term3184.getClass(), "id", 96566506);
        setDoubleField(term3184, term3184.getClass(), "bias", 0.3741779691002205);
        setField(term3143, term3143.getClass(), "out", term3184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIn", argTypes, term3143, args);
    }

};


