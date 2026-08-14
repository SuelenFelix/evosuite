package skaro.pokeapi.resource.itemcategory;

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
import static skaro.pokeapi.resource.itemcategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemCategory_setPocket_204385879910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856;
     Object term910;

    public ItemCategory_setPocket_204385879910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term857 = new Integer(1725571209);
        ArrayList term871 = new ArrayList();
        Object term877 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term879 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term877, term877.getClass(), "name", "");
        setField(term879, term879.getClass(), "name", null);
        setField(term879, term879.getClass(), "url", null);
        setField(term877, term877.getClass(), "language", term879);
        Object term880 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term882 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term880, term880.getClass(), "name", "");
        setField(term882, term882.getClass(), "name", null);
        setField(term882, term882.getClass(), "url", null);
        setField(term880, term880.getClass(), "language", term882);
        ArrayList term875 = new ArrayList();
        ((ArrayList) term875).add(term877);
        ((ArrayList) term875).add(term880);
        term856 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term885 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term856, term856.getClass(), "id", term857);
        setField(term856, term856.getClass(), "name", "ZfdXfCCFDf");
        setField(term856, term856.getClass(), "items", term871);
        setField(term856, term856.getClass(), "names", term875);
        setField(term885, term885.getClass(), "name", "HWkpTmtlrc");
        setField(term885, term885.getClass(), "url", "hMmaoREuCK");
        setField(term856, term856.getClass(), "pocket", term885);
        term910 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term910, term910.getClass(), "name", "BRIVNtfUWU");
        setField(term910, term910.getClass(), "url", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term910;
        callMethod(klass, "setPocket", argTypes, term856, args);
    }

};


