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

public class SettingsActivity_2_init_16595630260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143599;

    public SettingsActivity_2_init_16595630260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143599 = newInstance(Class.forName("java.awt.Font"));
        Object term143600 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term143601 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term143602 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term143604 = newInstance(Class.forName("java.lang.Object"));
        Object term143605 = newInstance(Class.forName("java.lang.Object"));
        Object term143631 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term143633 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term143634 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term143602, term143602.getClass(), "hash", 951004573);
        setField(term143602, term143602.getClass(), "key", term143604);
        setField(term143602, term143602.getClass(), "value", term143605);
        setField(term143602, term143602.getClass(), "next", null);
        setElement(term143601, 2, term143602);
        setField(term143600, term143600.getClass(), "table", term143601);
        setIntField(term143600, term143600.getClass(), "count", 1);
        setIntField(term143600, term143600.getClass(), "threshold", 8);
        setFloatField(term143600, term143600.getClass(), "loadFactor", 0.75F);
        setIntField(term143600, term143600.getClass(), "modCount", 1);
        setField(term143600, term143600.getClass(), "keySet", null);
        setField(term143600, term143600.getClass(), "entrySet", null);
        setField(term143600, term143600.getClass(), "values", null);
        setField(term143599, term143599.getClass(), "fRequestedAttributes", term143600);
        setField(term143599, term143599.getClass(), "name", "ikTtOgdVYS");
        setIntField(term143599, term143599.getClass(), "style", 469871899);
        setIntField(term143599, term143599.getClass(), "size", -1348703436);
        setFloatField(term143599, term143599.getClass(), "pointSize", 0.912685F);
        setField(term143599, term143599.getClass(), "peer", null);
        setLongField(term143599, term143599.getClass(), "pData", 7276637106827860087L);
        setField(term143599, term143599.getClass(), "font2DHandle", null);
        setField(term143599, term143599.getClass(), "values", null);
        setBooleanField(term143599, term143599.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term143599, term143599.getClass(), "createdFont", false);
        setBooleanField(term143599, term143599.getClass(), "nonIdentityTx", false);
        setIntField(term143599, term143599.getClass(), "hash", -2027012650);
        setIntField(term143599, term143599.getClass(), "fontSerializedDataVersion", 1343432022);
        setLongField(term143631, term143631.getClass(), "timestamp", -3936701866695933852L);
        setField(term143631, term143631.getClass(), "referent", null);
        setField(term143633, term143633.getClass(), "lock", term143634);
        setField(term143633, term143633.getClass(), "head", null);
        setLongField(term143633, term143633.getClass(), "queueLength", 1215116475929634177L);
        setField(term143631, term143631.getClass(), "queue", term143633);
        setField(term143631, term143631.getClass(), "next", null);
        setField(term143631, term143631.getClass(), "discovered", null);
        setField(term143599, term143599.getClass(), "flmref", term143631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "QUymMnsCIj";
        args[1] = term143599;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


