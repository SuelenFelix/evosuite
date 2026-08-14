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
     Object term51219;
     Object term51256;

    public KLabel_init_17273623743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51219 = newInstance(Class.forName("java.awt.Font"));
        Object term51220 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term51221 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51222 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51224 = newInstance(Class.forName("java.lang.Object"));
        Object term51225 = newInstance(Class.forName("java.lang.Object"));
        Object term51251 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term51253 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51254 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term51222, term51222.getClass(), "hash", 518766616);
        setField(term51222, term51222.getClass(), "key", term51224);
        setField(term51222, term51222.getClass(), "value", term51225);
        setField(term51222, term51222.getClass(), "next", null);
        setElement(term51221, 5, term51222);
        setField(term51220, term51220.getClass(), "table", term51221);
        setIntField(term51220, term51220.getClass(), "count", 1);
        setIntField(term51220, term51220.getClass(), "threshold", 8);
        setFloatField(term51220, term51220.getClass(), "loadFactor", 0.75F);
        setIntField(term51220, term51220.getClass(), "modCount", 1);
        setField(term51220, term51220.getClass(), "keySet", null);
        setField(term51220, term51220.getClass(), "entrySet", null);
        setField(term51220, term51220.getClass(), "values", null);
        setField(term51219, term51219.getClass(), "fRequestedAttributes", term51220);
        setField(term51219, term51219.getClass(), "name", "yGtHPyvYiQ");
        setIntField(term51219, term51219.getClass(), "style", 291864719);
        setIntField(term51219, term51219.getClass(), "size", -1549607466);
        setFloatField(term51219, term51219.getClass(), "pointSize", 0.94706243F);
        setField(term51219, term51219.getClass(), "peer", null);
        setLongField(term51219, term51219.getClass(), "pData", -6823727938421990489L);
        setField(term51219, term51219.getClass(), "font2DHandle", null);
        setField(term51219, term51219.getClass(), "values", null);
        setBooleanField(term51219, term51219.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term51219, term51219.getClass(), "createdFont", false);
        setBooleanField(term51219, term51219.getClass(), "nonIdentityTx", false);
        setIntField(term51219, term51219.getClass(), "hash", 853609788);
        setIntField(term51219, term51219.getClass(), "fontSerializedDataVersion", -197820800);
        setLongField(term51251, term51251.getClass(), "timestamp", -484994522244390100L);
        setField(term51251, term51251.getClass(), "referent", null);
        setField(term51253, term51253.getClass(), "lock", term51254);
        setField(term51253, term51253.getClass(), "head", null);
        setLongField(term51253, term51253.getClass(), "queueLength", 1233889271256172047L);
        setField(term51251, term51251.getClass(), "queue", term51253);
        setField(term51251, term51251.getClass(), "next", null);
        setField(term51251, term51251.getClass(), "discovered", null);
        setField(term51219, term51219.getClass(), "flmref", term51251);
        term51256 = newInstance(Class.forName("java.awt.Color"));
        float[] term51258 = (float[]) newFloatArray(1);
        float[] term51260 = (float[]) newFloatArray(6);
        setIntField(term51256, term51256.getClass(), "value", 1639448749);
        setFloatElement(term51258, 0, 0.0027298927F);
        setField(term51256, term51256.getClass(), "frgbvalue", term51258);
        setFloatElement(term51260, 0, 0.45478272F);
        setFloatElement(term51260, 1, 0.29874015F);
        setFloatElement(term51260, 2, 0.8780084F);
        setFloatElement(term51260, 3, 0.32554477F);
        setFloatElement(term51260, 4, 0.053365767F);
        setFloatElement(term51260, 5, 0.8924855F);
        setField(term51256, term51256.getClass(), "fvalue", term51260);
        setFloatField(term51256, term51256.getClass(), "falpha", 0.94332385F);
        setField(term51256, term51256.getClass(), "cs", null);
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
        args[1] = term51219;
        args[2] = term51256;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


