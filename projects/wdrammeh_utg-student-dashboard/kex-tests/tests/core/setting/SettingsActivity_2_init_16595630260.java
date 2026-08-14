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
     Object term80;

    public SettingsActivity_2_init_16595630260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("java.awt.Font"));
        Object term81 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term82 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term83 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term86 = newInstance(Class.forName("java.lang.Object"));
        Object term112 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term114 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term115 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term83, term83.getClass(), "hash", 1911012339);
        setField(term83, term83.getClass(), "key", term85);
        setField(term83, term83.getClass(), "value", term86);
        setField(term83, term83.getClass(), "next", null);
        setElement(term82, 5, term83);
        setField(term81, term81.getClass(), "table", term82);
        setIntField(term81, term81.getClass(), "count", 1);
        setIntField(term81, term81.getClass(), "threshold", 8);
        setFloatField(term81, term81.getClass(), "loadFactor", 0.75F);
        setIntField(term81, term81.getClass(), "modCount", 1);
        setField(term81, term81.getClass(), "keySet", null);
        setField(term81, term81.getClass(), "entrySet", null);
        setField(term81, term81.getClass(), "values", null);
        setField(term80, term80.getClass(), "fRequestedAttributes", term81);
        setField(term80, term80.getClass(), "name", "xxtlPwDYFs");
        setIntField(term80, term80.getClass(), "style", 391863371);
        setIntField(term80, term80.getClass(), "size", -1922583790);
        setFloatField(term80, term80.getClass(), "pointSize", 0.13238746F);
        setField(term80, term80.getClass(), "peer", null);
        setLongField(term80, term80.getClass(), "pData", 2442117782898005296L);
        setField(term80, term80.getClass(), "font2DHandle", null);
        setField(term80, term80.getClass(), "values", null);
        setBooleanField(term80, term80.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term80, term80.getClass(), "createdFont", false);
        setBooleanField(term80, term80.getClass(), "nonIdentityTx", true);
        setIntField(term80, term80.getClass(), "hash", -616727354);
        setIntField(term80, term80.getClass(), "fontSerializedDataVersion", -1955890973);
        setLongField(term112, term112.getClass(), "timestamp", 6375119433582206027L);
        setField(term112, term112.getClass(), "referent", null);
        setField(term114, term114.getClass(), "lock", term115);
        setField(term114, term114.getClass(), "head", null);
        setLongField(term114, term114.getClass(), "queueLength", -8257434502486459194L);
        setField(term112, term112.getClass(), "queue", term114);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "discovered", null);
        setField(term80, term80.getClass(), "flmref", term112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term80;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


