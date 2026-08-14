package skaro.pokeapi.resource.berry;

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
import static skaro.pokeapi.resource.berry.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Berry_getItem_176666021021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3902;

    public Berry_getItem_176666021021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3903 = new Integer(1045547089);
        Integer term3917 = new Integer(-1122880881);
        Integer term3919 = new Integer(-542712742);
        Integer term3921 = new Integer(-1254072822);
        Integer term3923 = new Integer(-1111249833);
        Integer term3925 = new Integer(-1692331299);
        Integer term3927 = new Integer(479531250);
        Integer term3957 = new Integer(1320570890);
        Object term3956 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term3959 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3956, term3956.getClass(), "potency", term3957);
        setField(term3959, term3959.getClass(), "name", null);
        setField(term3959, term3959.getClass(), "url", null);
        setField(term3956, term3956.getClass(), "flavor", term3959);
        ArrayList term3954 = new ArrayList();
        ((ArrayList) term3954).add(term3956);
        term3902 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term3929 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3962 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term3987 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term3902, term3902.getClass(), "id", term3903);
        setField(term3902, term3902.getClass(), "name", "zNFLXMifnS");
        setField(term3902, term3902.getClass(), "growthTime", term3917);
        setField(term3902, term3902.getClass(), "maxHarvest", term3919);
        setField(term3902, term3902.getClass(), "naturalGiftPower", term3921);
        setField(term3902, term3902.getClass(), "size", term3923);
        setField(term3902, term3902.getClass(), "smoothness", term3925);
        setField(term3902, term3902.getClass(), "soilDryness", term3927);
        setField(term3929, term3929.getClass(), "name", "HHQcYMSBVc");
        setField(term3929, term3929.getClass(), "url", "wdoqITnaAP");
        setField(term3902, term3902.getClass(), "firmness", term3929);
        setField(term3902, term3902.getClass(), "flavors", term3954);
        setField(term3962, term3962.getClass(), "name", "nRvKihUSPj");
        setField(term3962, term3962.getClass(), "url", "BbNeQJpYPr");
        setField(term3902, term3902.getClass(), "item", term3962);
        setField(term3987, term3987.getClass(), "name", "riMtzCoxNj");
        setField(term3987, term3987.getClass(), "url", "YAXkVjQZcV");
        setField(term3902, term3902.getClass(), "naturalGiftType", term3987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItem", argTypes, term3902, args);
    }

};


