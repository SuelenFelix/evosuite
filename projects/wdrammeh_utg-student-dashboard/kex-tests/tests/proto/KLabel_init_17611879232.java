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
     Object term51101;

    public KLabel_init_17611879232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51101 = newInstance(Class.forName("java.awt.Font"));
        Object term51102 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term51103 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term51104 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term51106 = newInstance(Class.forName("java.lang.Object"));
        Object term51107 = newInstance(Class.forName("java.lang.Object"));
        Object term51133 = newInstance(Class.forName("java.lang.ref.SoftReference"));
        Object term51135 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term51136 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        setIntField(term51104, term51104.getClass(), "hash", 2104335038);
        setField(term51104, term51104.getClass(), "key", term51106);
        setField(term51104, term51104.getClass(), "value", term51107);
        setField(term51104, term51104.getClass(), "next", null);
        setElement(term51103, 3, term51104);
        setField(term51102, term51102.getClass(), "table", term51103);
        setIntField(term51102, term51102.getClass(), "count", 1);
        setIntField(term51102, term51102.getClass(), "threshold", 8);
        setFloatField(term51102, term51102.getClass(), "loadFactor", 0.75F);
        setIntField(term51102, term51102.getClass(), "modCount", 1);
        setField(term51102, term51102.getClass(), "keySet", null);
        setField(term51102, term51102.getClass(), "entrySet", null);
        setField(term51102, term51102.getClass(), "values", null);
        setField(term51101, term51101.getClass(), "fRequestedAttributes", term51102);
        setField(term51101, term51101.getClass(), "name", "OEXDRUKcFl");
        setIntField(term51101, term51101.getClass(), "style", 243280944);
        setIntField(term51101, term51101.getClass(), "size", -726681073);
        setFloatField(term51101, term51101.getClass(), "pointSize", 0.42623103F);
        setField(term51101, term51101.getClass(), "peer", null);
        setLongField(term51101, term51101.getClass(), "pData", 6855071767938501807L);
        setField(term51101, term51101.getClass(), "font2DHandle", null);
        setField(term51101, term51101.getClass(), "values", null);
        setBooleanField(term51101, term51101.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term51101, term51101.getClass(), "createdFont", true);
        setBooleanField(term51101, term51101.getClass(), "nonIdentityTx", false);
        setIntField(term51101, term51101.getClass(), "hash", -1724487863);
        setIntField(term51101, term51101.getClass(), "fontSerializedDataVersion", -128490829);
        setLongField(term51133, term51133.getClass(), "timestamp", -5892135042702373494L);
        setField(term51133, term51133.getClass(), "referent", null);
        setField(term51135, term51135.getClass(), "lock", term51136);
        setField(term51135, term51135.getClass(), "head", null);
        setLongField(term51135, term51135.getClass(), "queueLength", 5262507301787091109L);
        setField(term51133, term51133.getClass(), "queue", term51135);
        setField(term51133, term51133.getClass(), "next", null);
        setField(term51133, term51133.getClass(), "discovered", null);
        setField(term51101, term51101.getClass(), "flmref", term51133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Font");
        Object[] args = new Object[2];
        args[0] = "SJiQaLvSKv";
        args[1] = term51101;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


