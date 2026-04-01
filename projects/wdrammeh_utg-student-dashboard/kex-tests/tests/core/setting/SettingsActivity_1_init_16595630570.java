package core.setting;

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
import static core.setting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SettingsActivity_1_init_16595630570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143817;

    public SettingsActivity_1_init_16595630570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143817 = newInstance(Class.forName("java.awt.Font"));
        Object term143818 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term143819 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term143820 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term143822 = newInstance(Class.forName("java.lang.Object"));
        Object term143823 = newInstance(Class.forName("java.lang.Object"));
        Object term143849 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term143851 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term143852 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term143820, term143820.getClass(), "hash", 382346174);
        setField(term143820, term143820.getClass(), "key", term143822);
        setField(term143820, term143820.getClass(), "value", term143823);
        setField(term143820, term143820.getClass(), "next", null);
        setElement(term143819, 1, term143820);
        setField(term143818, term143818.getClass(), "table", term143819);
        setIntField(term143818, term143818.getClass(), "count", 1);
        setIntField(term143818, term143818.getClass(), "threshold", 8);
        setFloatField(term143818, term143818.getClass(), "loadFactor", 0.75F);
        setIntField(term143818, term143818.getClass(), "modCount", 1);
        setField(term143818, term143818.getClass(), "keySet", null);
        setField(term143818, term143818.getClass(), "entrySet", null);
        setField(term143818, term143818.getClass(), "values", null);
        setField(term143817, term143817.getClass(), "fRequestedAttributes", term143818);
        setField(term143817, term143817.getClass(), "name", "eoEvZbdLjL");
        setIntField(term143817, term143817.getClass(), "style", 360972386);
        setIntField(term143817, term143817.getClass(), "size", -2063884849);
        setFloatField(term143817, term143817.getClass(), "pointSize", 0.9205692F);
        setField(term143817, term143817.getClass(), "peer", null);
        setLongField(term143817, term143817.getClass(), "pData", 1597484336218508869L);
        setField(term143817, term143817.getClass(), "font2DHandle", null);
        setField(term143817, term143817.getClass(), "values", null);
        setBooleanField(term143817, term143817.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term143817, term143817.getClass(), "createdFont", false);
        setBooleanField(term143817, term143817.getClass(), "nonIdentityTx", false);
        setIntField(term143817, term143817.getClass(), "hash", 1054887169);
        setIntField(term143817, term143817.getClass(), "fontSerializedDataVersion", 692873905);
        setLongField(term143849, term143849.getClass(), "timestamp", -685023850445639859L);
        setField(term143849, term143849.getClass(), "referent", null);
        setField(term143851, term143851.getClass(), "lock", term143852);
        setField(term143851, term143851.getClass(), "head", null);
        setLongField(term143851, term143851.getClass(), "queueLength", -6950146046121430355L);
        setField(term143849, term143849.getClass(), "queue", term143851);
        setField(term143849, term143849.getClass(), "next", null);
        setField(term143849, term143849.getClass(), "discovered", null);
        setField(term143817, term143817.getClass(), "flmref", term143849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "TiUqHrjoEU";
        args[1] = term143817;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


