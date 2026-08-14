package io.polivakha.mojo.properties;

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
import static io.polivakha.mojo.properties.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class AbstractWritePropertiesMojo_StoreProperties_1_entrySet_2472114681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;

    public AbstractWritePropertiesMojo_StoreProperties_1_entrySet_2472114681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term799 = new HashMap();
        Set<Object> term814 =  ((Map) term799).keySet();
        HashSet term798 = new HashSet((Collection<? extends Object>) term814);
        HashMap term805 = new HashMap();
        Set<Object> term815 =  ((Map) term805).keySet();
        HashSet term804 = new HashSet((Collection<? extends Object>) term815);
        ArrayList term810 = new ArrayList();
        term741 = newInstance(Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1"));
        Object term742 = newInstance(Class.forName("java.util.Properties"));
        Object term743 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term752 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object[] term753 = (Object[]) newArray("java.util.concurrent.ConcurrentHashMap$Node", 16);
        Object term754 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object term756 = newInstance(Class.forName("java.lang.Object"));
        Object term757 = newInstance(Class.forName("java.lang.Object"));
        Object term758 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object term760 = newInstance(Class.forName("java.lang.Object"));
        Object term761 = newInstance(Class.forName("java.lang.Object"));
        Object term762 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap$Node"));
        Object[] term768 = (Object[]) newArray("java.util.Hashtable$Entry", 7);
        Object term769 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term771 = newInstance(Class.forName("java.lang.Object"));
        Object term772 = newInstance(Class.forName("java.lang.Object"));
        Object term773 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term775 = newInstance(Class.forName("java.lang.Object"));
        Object term776 = newInstance(Class.forName("java.lang.Object"));
        Object term777 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term779 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term781 = newInstance(Class.forName("java.lang.Object"));
        Object term782 = newInstance(Class.forName("java.lang.Object"));
        Object term783 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term785 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term787 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term789 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        Object term791 = newInstance(Class.forName("java.lang.Object"));
        Object term792 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term741, term741.getClass(), "this$0", null);
        setField(term742, term742.getClass(), "defaults", null);
        setField(term743, term743.getClass(), "table", null);
        setField(term743, term743.getClass(), "nextTable", null);
        setLongField(term743, term743.getClass(), "baseCount", 0L);
        setIntField(term743, term743.getClass(), "sizeCtl", 16);
        setIntField(term743, term743.getClass(), "transferIndex", 0);
        setIntField(term743, term743.getClass(), "cellsBusy", 0);
        setField(term743, term743.getClass(), "counterCells", null);
        setField(term743, term743.getClass(), "keySet", null);
        setField(term743, term743.getClass(), "values", null);
        setField(term743, term743.getClass(), "entrySet", null);
        setField(term743, term743.getClass(), "keySet", null);
        setField(term743, term743.getClass(), "values", null);
        setField(term742, term742.getClass(), "map", term743);
        setField(term742, term742.getClass(), "table", null);
        setIntField(term742, term742.getClass(), "count", 0);
        setIntField(term742, term742.getClass(), "threshold", 0);
        setFloatField(term742, term742.getClass(), "loadFactor", 0.0F);
        setIntField(term742, term742.getClass(), "modCount", 0);
        setField(term742, term742.getClass(), "keySet", null);
        setField(term742, term742.getClass(), "entrySet", null);
        setField(term742, term742.getClass(), "values", null);
        setField(term741, term741.getClass(), "defaults", term742);
        setIntField(term754, term754.getClass(), "hash", 294974615);
        setField(term754, term754.getClass(), "key", term756);
        setField(term754, term754.getClass(), "val", term757);
        setField(term754, term754.getClass(), "next", null);
        setElement(term753, 7, term754);
        setIntField(term758, term758.getClass(), "hash", 826250395);
        setField(term758, term758.getClass(), "key", term760);
        setField(term758, term758.getClass(), "val", term761);
        setIntField(term762, term762.getClass(), "hash", 1142336027);
        setField(term762, term762.getClass(), "key", null);
        setField(term762, term762.getClass(), "val", null);
        setField(term762, term762.getClass(), "next", null);
        setField(term758, term758.getClass(), "next", term762);
        setElement(term753, 11, term758);
        setField(term752, term752.getClass(), "table", term753);
        setField(term752, term752.getClass(), "nextTable", null);
        setLongField(term752, term752.getClass(), "baseCount", 3L);
        setIntField(term752, term752.getClass(), "sizeCtl", 12);
        setIntField(term752, term752.getClass(), "transferIndex", 0);
        setIntField(term752, term752.getClass(), "cellsBusy", 0);
        setField(term752, term752.getClass(), "counterCells", null);
        setField(term752, term752.getClass(), "keySet", null);
        setField(term752, term752.getClass(), "values", null);
        setField(term752, term752.getClass(), "entrySet", null);
        setField(term752, term752.getClass(), "keySet", null);
        setField(term752, term752.getClass(), "values", null);
        setField(term741, term741.getClass(), "map", term752);
        setIntField(term769, term769.getClass(), "hash", -1922583790);
        setField(term769, term769.getClass(), "key", term771);
        setField(term769, term769.getClass(), "value", term772);
        setIntField(term773, term773.getClass(), "hash", -616727354);
        setField(term773, term773.getClass(), "key", term775);
        setField(term773, term773.getClass(), "value", term776);
        setIntField(term777, term777.getClass(), "hash", -1955890973);
        setField(term777, term777.getClass(), "key", null);
        setField(term777, term777.getClass(), "value", null);
        setField(term777, term777.getClass(), "next", null);
        setField(term773, term773.getClass(), "next", term777);
        setField(term769, term769.getClass(), "next", term773);
        setElement(term768, 0, term769);
        setIntField(term779, term779.getClass(), "hash", 1227103734);
        setField(term779, term779.getClass(), "key", term781);
        setField(term779, term779.getClass(), "value", term782);
        setIntField(term783, term783.getClass(), "hash", -1339778481);
        setField(term783, term783.getClass(), "key", term760);
        setField(term783, term783.getClass(), "value", term776);
        setIntField(term785, term785.getClass(), "hash", 1725571209);
        setField(term785, term785.getClass(), "key", term772);
        setField(term785, term785.getClass(), "value", term761);
        setField(term785, term785.getClass(), "next", null);
        setField(term783, term783.getClass(), "next", term785);
        setField(term779, term779.getClass(), "next", term783);
        setElement(term768, 1, term779);
        setIntField(term787, term787.getClass(), "hash", 0);
        setField(term787, term787.getClass(), "key", null);
        setField(term787, term787.getClass(), "value", null);
        setField(term787, term787.getClass(), "next", null);
        setElement(term768, 2, term787);
        setIntField(term789, term789.getClass(), "hash", -522618178);
        setField(term789, term789.getClass(), "key", term761);
        setField(term789, term789.getClass(), "value", term791);
        setIntField(term792, term792.getClass(), "hash", 1134449235);
        setField(term792, term792.getClass(), "key", term781);
        setField(term792, term792.getClass(), "value", term781);
        setField(term792, term792.getClass(), "next", term787);
        setField(term789, term789.getClass(), "next", term792);
        setElement(term768, 3, term789);
        setElement(term768, 4, term783);
        setElement(term768, 5, term777);
        setElement(term768, 6, term779);
        setField(term741, term741.getClass(), "table", term768);
        setIntField(term741, term741.getClass(), "count", -883034806);
        setIntField(term741, term741.getClass(), "threshold", 1585847225);
        setFloatField(term741, term741.getClass(), "loadFactor", 0.13238746F);
        setIntField(term741, term741.getClass(), "modCount", 597278769);
        setField(term741, term741.getClass(), "keySet", term798);
        setField(term741, term741.getClass(), "entrySet", term804);
        setField(term741, term741.getClass(), "values", term810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.AbstractWritePropertiesMojo$StoreProperties$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "entrySet", argTypes, term741, args);
    }

};


