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
     Object term298;

    public SettingsActivity_1_init_16595630570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = newInstance(Class.forName("java.awt.Font"));
        Object term299 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term300 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term301 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term303 = newInstance(Class.forName("java.lang.Object"));
        Object term304 = newInstance(Class.forName("java.lang.Object"));
        Object term330 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term332 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term333 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term301, term301.getClass(), "hash", 146906769);
        setField(term301, term301.getClass(), "key", term303);
        setField(term301, term301.getClass(), "value", term304);
        setField(term301, term301.getClass(), "next", null);
        setElement(term300, 9, term301);
        setField(term299, term299.getClass(), "table", term300);
        setIntField(term299, term299.getClass(), "count", 1);
        setIntField(term299, term299.getClass(), "threshold", 8);
        setFloatField(term299, term299.getClass(), "loadFactor", 0.75F);
        setIntField(term299, term299.getClass(), "modCount", 1);
        setField(term299, term299.getClass(), "keySet", null);
        setField(term299, term299.getClass(), "entrySet", null);
        setField(term299, term299.getClass(), "values", null);
        setField(term298, term298.getClass(), "fRequestedAttributes", term299);
        setField(term298, term298.getClass(), "name", "RMFIsYGgne");
        setIntField(term298, term298.getClass(), "style", 679763016);
        setIntField(term298, term298.getClass(), "size", 1962444399);
        setFloatField(term298, term298.getClass(), "pointSize", 0.09123778F);
        setField(term298, term298.getClass(), "peer", null);
        setLongField(term298, term298.getClass(), "pData", -8400487765614892086L);
        setField(term298, term298.getClass(), "font2DHandle", null);
        setField(term298, term298.getClass(), "values", null);
        setBooleanField(term298, term298.getClass(), "hasLayoutAttributes", true);
        setBooleanField(term298, term298.getClass(), "createdFont", true);
        setBooleanField(term298, term298.getClass(), "nonIdentityTx", true);
        setIntField(term298, term298.getClass(), "hash", 767834723);
        setIntField(term298, term298.getClass(), "fontSerializedDataVersion", -602026508);
        setLongField(term330, term330.getClass(), "timestamp", 5270370404989704783L);
        setField(term330, term330.getClass(), "referent", null);
        setField(term332, term332.getClass(), "lock", term333);
        setField(term332, term332.getClass(), "head", null);
        setLongField(term332, term332.getClass(), "queueLength", 7411271909051562686L);
        setField(term330, term330.getClass(), "queue", term332);
        setField(term330, term330.getClass(), "next", null);
        setField(term330, term330.getClass(), "discovered", null);
        setField(term298, term298.getClass(), "flmref", term330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "hRNSzYYIrc";
        args[1] = term298;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


