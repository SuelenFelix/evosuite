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

public class KLabel_init_17611879232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51150;

    public KLabel_init_17611879232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51150 = newInstance(Class.forName("java.awt.Font"));
        Object term51151 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term51152 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51153 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51155 = newInstance(Class.forName("java.lang.Object"));
        Object term51156 = newInstance(Class.forName("java.lang.Object"));
        Object term51182 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term51184 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51185 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term51153, term51153.getClass(), "hash", 992285423);
        setField(term51153, term51153.getClass(), "key", term51155);
        setField(term51153, term51153.getClass(), "value", term51156);
        setField(term51153, term51153.getClass(), "next", null);
        setElement(term51152, 8, term51153);
        setField(term51151, term51151.getClass(), "table", term51152);
        setIntField(term51151, term51151.getClass(), "count", 1);
        setIntField(term51151, term51151.getClass(), "threshold", 8);
        setFloatField(term51151, term51151.getClass(), "loadFactor", 0.75F);
        setIntField(term51151, term51151.getClass(), "modCount", 1);
        setField(term51151, term51151.getClass(), "keySet", null);
        setField(term51151, term51151.getClass(), "entrySet", null);
        setField(term51151, term51151.getClass(), "values", null);
        setField(term51150, term51150.getClass(), "fRequestedAttributes", term51151);
        setField(term51150, term51150.getClass(), "name", "OEXDRUKcFl");
        setIntField(term51150, term51150.getClass(), "style", 243280944);
        setIntField(term51150, term51150.getClass(), "size", -726681073);
        setFloatField(term51150, term51150.getClass(), "pointSize", 0.42623103F);
        setField(term51150, term51150.getClass(), "peer", null);
        setLongField(term51150, term51150.getClass(), "pData", 6855071767938501807L);
        setField(term51150, term51150.getClass(), "font2DHandle", null);
        setField(term51150, term51150.getClass(), "values", null);
        setBooleanField(term51150, term51150.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term51150, term51150.getClass(), "createdFont", true);
        setBooleanField(term51150, term51150.getClass(), "nonIdentityTx", false);
        setIntField(term51150, term51150.getClass(), "hash", -1724487863);
        setIntField(term51150, term51150.getClass(), "fontSerializedDataVersion", -128490829);
        setLongField(term51182, term51182.getClass(), "timestamp", -5892135042702373494L);
        setField(term51182, term51182.getClass(), "referent", null);
        setField(term51184, term51184.getClass(), "lock", term51185);
        setField(term51184, term51184.getClass(), "head", null);
        setLongField(term51184, term51184.getClass(), "queueLength", 5262507301787091109L);
        setField(term51182, term51182.getClass(), "queue", term51184);
        setField(term51182, term51182.getClass(), "next", null);
        setField(term51182, term51182.getClass(), "discovered", null);
        setField(term51150, term51150.getClass(), "flmref", term51182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "SJiQaLvSKv";
        args[1] = term51150;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


