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
     Object term3145;

    public AnnConnection_getIn_10542849621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3148 = new Double(0.6767213143579776);
        Object term3152 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3152, term3152.getClass(), "weight", 0.58265008665336);
        setField(term3152, term3152.getClass(), "in", null);
        setField(term3152, term3152.getClass(), "out", null);
        Object term3154 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3154, term3154.getClass(), "weight", 0.0);
        setField(term3154, term3154.getClass(), "in", null);
        setField(term3154, term3154.getClass(), "out", null);
        Object term3156 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3156, term3156.getClass(), "weight", 0.0);
        setField(term3156, term3156.getClass(), "in", null);
        setField(term3156, term3156.getClass(), "out", null);
        Object term3158 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3158, term3158.getClass(), "weight", 0.04662501176438627);
        setField(term3158, term3158.getClass(), "in", null);
        setField(term3158, term3158.getClass(), "out", null);
        Object term3160 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3160, term3160.getClass(), "weight", 0.1163034938203874);
        setField(term3160, term3160.getClass(), "in", null);
        setField(term3160, term3160.getClass(), "out", null);
        ArrayList term3150 = new ArrayList();
        ((ArrayList) term3150).add(term3152);
        ((ArrayList) term3150).add(term3154);
        ((ArrayList) term3150).add(term3156);
        ((ArrayList) term3150).add(term3158);
        ((ArrayList) term3150).add(term3156);
        ((ArrayList) term3150).add(term3154);
        ((ArrayList) term3150).add(term3160);
        Object term3166 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3166, term3166.getClass(), "weight", 0.1187814206908886);
        setField(term3166, term3166.getClass(), "in", null);
        setField(term3166, term3166.getClass(), "out", null);
        Object term3168 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3168, term3168.getClass(), "weight", 0.0);
        setField(term3168, term3168.getClass(), "in", null);
        setField(term3168, term3168.getClass(), "out", null);
        Object term3170 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3170, term3170.getClass(), "weight", 0.0);
        setField(term3170, term3170.getClass(), "in", null);
        setField(term3170, term3170.getClass(), "out", null);
        ArrayList term3164 = new ArrayList();
        ((ArrayList) term3164).add(term3166);
        ((ArrayList) term3164).add(term3168);
        ((ArrayList) term3164).add(term3152);
        ((ArrayList) term3164).add(term3158);
        ((ArrayList) term3164).add(term3168);
        ((ArrayList) term3164).add(term3160);
        ((ArrayList) term3164).add(term3158);
        ((ArrayList) term3164).add(term3156);
        ((ArrayList) term3164).add(term3170);
        Class<? extends Object> term3211 = Class.forName((String) "nn.neural.AnnType");
        Field term3210 = ((Class) term3211).getDeclaredField((String) "OUTPUT");
        ((Field) term3210).setAccessible(true);
        Object enum20 = ((Field) term3210).get((Object) null);
        Double term3187 = new Double(0.146431486357265);
        Object term3191 = newInstance(Class.forName("nn.neural.AnnConnection"));
        setDoubleField(term3191, term3191.getClass(), "weight", 0.0);
        setField(term3191, term3191.getClass(), "in", null);
        setField(term3191, term3191.getClass(), "out", null);
        ArrayList term3189 = new ArrayList();
        ((ArrayList) term3189).add(term3156);
        ((ArrayList) term3189).add(term3191);
        ((ArrayList) term3189).add(term3166);
        ((ArrayList) term3189).add(term3152);
        ((ArrayList) term3189).add(term3154);
        ((ArrayList) term3189).add(term3145);
        ArrayList term3195 = new ArrayList();
        ((ArrayList) term3195).add(term3166);
        Class<? extends Object> term3321 = Class.forName((String) "nn.neural.AnnType");
        Field term3320 = ((Class) term3321).getDeclaredField((String) "INPUT");
        ((Field) term3320).setAccessible(true);
        Object enum21 = ((Field) term3320).get((Object) null);
        term3145 = newInstance(Class.forName("nn.neural.AnnConnection"));
        Object term3147 = newInstance(Class.forName("nn.neural.AnnNode"));
        Object term3186 = newInstance(Class.forName("nn.neural.AnnNode"));
        setDoubleField(term3145, term3145.getClass(), "weight", 0.0100718646868041);
        setField(term3147, term3147.getClass(), "output", term3148);
        setField(term3147, term3147.getClass(), "inputs", term3150);
        setField(term3147, term3147.getClass(), "outputs", term3164);
        setField(term3147, term3147.getClass(), "type", enum20);
        setIntField(term3147, term3147.getClass(), "id", 538259104);
        setDoubleField(term3147, term3147.getClass(), "bias", 0.9136597256674437);
        setField(term3145, term3145.getClass(), "in", term3147);
        setField(term3186, term3186.getClass(), "output", term3187);
        setField(term3186, term3186.getClass(), "inputs", term3189);
        setField(term3186, term3186.getClass(), "outputs", term3195);
        setField(term3186, term3186.getClass(), "type", enum21);
        setIntField(term3186, term3186.getClass(), "id", 96566506);
        setDoubleField(term3186, term3186.getClass(), "bias", 0.3741779691002205);
        setField(term3145, term3145.getClass(), "out", term3186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.neural.AnnConnection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIn", argTypes, term3145, args);
    }

};


