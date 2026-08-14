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

public class ItemCategory_setName_12364129364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;

    public ItemCategory_setName_12364129364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term280 = new Integer(-1922583790);
        ArrayList term294 = new ArrayList();
        Object term300 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term302 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term300, term300.getClass(), "name", "");
        setField(term302, term302.getClass(), "name", null);
        setField(term302, term302.getClass(), "url", null);
        setField(term300, term300.getClass(), "language", term302);
        Object term303 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term305 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term303, term303.getClass(), "name", "");
        setField(term305, term305.getClass(), "name", null);
        setField(term305, term305.getClass(), "url", null);
        setField(term303, term303.getClass(), "language", term305);
        Object term306 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term308 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term306, term306.getClass(), "name", "");
        setField(term308, term308.getClass(), "name", null);
        setField(term308, term308.getClass(), "url", null);
        setField(term306, term306.getClass(), "language", term308);
        Object term309 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term311 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term309, term309.getClass(), "name", "");
        setField(term311, term311.getClass(), "name", null);
        setField(term311, term311.getClass(), "url", null);
        setField(term309, term309.getClass(), "language", term311);
        Object term312 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term314 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term312, term312.getClass(), "name", "");
        setField(term314, term314.getClass(), "name", null);
        setField(term314, term314.getClass(), "url", null);
        setField(term312, term312.getClass(), "language", term314);
        Object term315 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term317 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term315, term315.getClass(), "name", "");
        setField(term317, term317.getClass(), "name", null);
        setField(term317, term317.getClass(), "url", null);
        setField(term315, term315.getClass(), "language", term317);
        ArrayList term298 = new ArrayList();
        ((ArrayList) term298).add(term300);
        ((ArrayList) term298).add(term303);
        ((ArrayList) term298).add(term306);
        ((ArrayList) term298).add(term309);
        ((ArrayList) term298).add(term312);
        ((ArrayList) term298).add(term315);
        term279 = newInstance(Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory"));
        Object term320 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term279, term279.getClass(), "id", term280);
        setField(term279, term279.getClass(), "name", "UiUYnPrcCi");
        setField(term279, term279.getClass(), "items", term294);
        setField(term279, term279.getClass(), "names", term298);
        setField(term320, term320.getClass(), "name", "whBvTVIIlC");
        setField(term320, term320.getClass(), "url", "IgRJUzaCwW");
        setField(term279, term279.getClass(), "pocket", term320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemcategory.ItemCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JUmudUmaaV";
        callMethod(klass, "setName", argTypes, term279, args);
    }

};


