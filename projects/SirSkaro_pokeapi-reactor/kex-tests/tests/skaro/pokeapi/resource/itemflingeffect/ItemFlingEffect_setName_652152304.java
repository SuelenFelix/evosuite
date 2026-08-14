package skaro.pokeapi.resource.itemflingeffect;

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
import static skaro.pokeapi.resource.itemflingeffect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemFlingEffect_setName_652152304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;

    public ItemFlingEffect_setName_652152304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term130 = new Integer(-1922583790);
        Object term146 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term146, term146.getClass(), "effect", "");
        setField(term148, term148.getClass(), "name", null);
        setField(term148, term148.getClass(), "url", null);
        setField(term146, term146.getClass(), "language", term148);
        Object term149 = newInstance(Class.forName("skaro.pokeapi.resource.Effect"));
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term149, term149.getClass(), "effect", "");
        setField(term151, term151.getClass(), "name", null);
        setField(term151, term151.getClass(), "url", null);
        setField(term149, term149.getClass(), "language", term151);
        ArrayList term144 = new ArrayList();
        ((ArrayList) term144).add(term146);
        ((ArrayList) term144).add(term149);
        ArrayList term154 = new ArrayList();
        term129 = newInstance(Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect"));
        setField(term129, term129.getClass(), "id", term130);
        setField(term129, term129.getClass(), "name", "OWDIEULEFu");
        setField(term129, term129.getClass(), "effectEntries", term144);
        setField(term129, term129.getClass(), "items", term154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemflingeffect.ItemFlingEffect");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setName", argTypes, term129, args);
    }

};


