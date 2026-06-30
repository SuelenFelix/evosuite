package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KLabel_init_17273623743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51170;
     Object term51207;

    public KLabel_init_17273623743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51170 = newInstance(Class.forName("java.awt.Font"));
        Object term51171 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term51172 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51173 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51175 = newInstance(Class.forName("java.lang.Object"));
        Object term51176 = newInstance(Class.forName("java.lang.Object"));
        Object term51202 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term51204 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51205 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term51173, term51173.getClass(), "hash", 180438093);
        setField(term51173, term51173.getClass(), "key", term51175);
        setField(term51173, term51173.getClass(), "value", term51176);
        setField(term51173, term51173.getClass(), "next", null);
        setElement(term51172, 0, term51173);
        setField(term51171, term51171.getClass(), "table", term51172);
        setIntField(term51171, term51171.getClass(), "count", 1);
        setIntField(term51171, term51171.getClass(), "threshold", 8);
        setFloatField(term51171, term51171.getClass(), "loadFactor", 0.75F);
        setIntField(term51171, term51171.getClass(), "modCount", 1);
        setField(term51171, term51171.getClass(), "keySet", null);
        setField(term51171, term51171.getClass(), "entrySet", null);
        setField(term51171, term51171.getClass(), "values", null);
        setField(term51170, term51170.getClass(), "fRequestedAttributes", term51171);
        setField(term51170, term51170.getClass(), "name", "yGtHPyvYiQ");
        setIntField(term51170, term51170.getClass(), "style", 291864719);
        setIntField(term51170, term51170.getClass(), "size", -1549607466);
        setFloatField(term51170, term51170.getClass(), "pointSize", 0.94706243F);
        setField(term51170, term51170.getClass(), "peer", null);
        setLongField(term51170, term51170.getClass(), "pData", -6823727938421990489L);
        setField(term51170, term51170.getClass(), "font2DHandle", null);
        setField(term51170, term51170.getClass(), "values", null);
        setBooleanField(term51170, term51170.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term51170, term51170.getClass(), "createdFont", false);
        setBooleanField(term51170, term51170.getClass(), "nonIdentityTx", false);
        setIntField(term51170, term51170.getClass(), "hash", 853609788);
        setIntField(term51170, term51170.getClass(), "fontSerializedDataVersion", -197820800);
        setLongField(term51202, term51202.getClass(), "timestamp", -484994522244390100L);
        setField(term51202, term51202.getClass(), "referent", null);
        setField(term51204, term51204.getClass(), "lock", term51205);
        setField(term51204, term51204.getClass(), "head", null);
        setLongField(term51204, term51204.getClass(), "queueLength", 1233889271256172047L);
        setField(term51202, term51202.getClass(), "queue", term51204);
        setField(term51202, term51202.getClass(), "next", null);
        setField(term51202, term51202.getClass(), "discovered", null);
        setField(term51170, term51170.getClass(), "flmref", term51202);
        term51207 = newInstance(Class.forName("java.awt.Color"));
        float[] term51209 = (float[]) newFloatArray(1);
        float[] term51211 = (float[]) newFloatArray(6);
        setIntField(term51207, term51207.getClass(), "value", 1639448749);
        setFloatElement(term51209, 0, 0.0027298927F);
        setField(term51207, term51207.getClass(), "frgbvalue", term51209);
        setFloatElement(term51211, 0, 0.45478272F);
        setFloatElement(term51211, 1, 0.29874015F);
        setFloatElement(term51211, 2, 0.8780084F);
        setFloatElement(term51211, 3, 0.32554477F);
        setFloatElement(term51211, 4, 0.053365767F);
        setFloatElement(term51211, 5, 0.8924855F);
        setField(term51207, term51207.getClass(), "fvalue", term51211);
        setFloatField(term51207, term51207.getClass(), "falpha", 0.94332385F);
        setField(term51207, term51207.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        argTypes[2] = Class.forName("java.awt.Color");
        Object[] args = new Object[3];
        args[0] = "RYdKCNNMBR";
        args[1] = term51170;
        args[2] = term51207;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


