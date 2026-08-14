package skaro.pokeapi.resource.itemattribute;

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
import static skaro.pokeapi.resource.itemattribute.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemAttribute_setId_20342877612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term107;

    public ItemAttribute_setId_20342877612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term60 = new Integer(1162663216);
        ArrayList term74 = new ArrayList();
        Object term80 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term82 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term80, term80.getClass(), "name", "");
        setField(term82, term82.getClass(), "name", null);
        setField(term82, term82.getClass(), "url", null);
        setField(term80, term80.getClass(), "language", term82);
        ArrayList term78 = new ArrayList();
        ((ArrayList) term78).add(term80);
        Object term87 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term89 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term87, term87.getClass(), "description", "");
        setField(term89, term89.getClass(), "name", null);
        setField(term89, term89.getClass(), "url", null);
        setField(term87, term87.getClass(), "language", term89);
        Object term90 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term92 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term90, term90.getClass(), "description", "");
        setField(term92, term92.getClass(), "name", null);
        setField(term92, term92.getClass(), "url", null);
        setField(term90, term90.getClass(), "language", term92);
        Object term93 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term95 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term93, term93.getClass(), "description", "");
        setField(term95, term95.getClass(), "name", null);
        setField(term95, term95.getClass(), "url", null);
        setField(term93, term93.getClass(), "language", term95);
        Object term96 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term98 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term96, term96.getClass(), "description", "");
        setField(term98, term98.getClass(), "name", null);
        setField(term98, term98.getClass(), "url", null);
        setField(term96, term96.getClass(), "language", term98);
        Object term99 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term101 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term99, term99.getClass(), "description", "");
        setField(term101, term101.getClass(), "name", null);
        setField(term101, term101.getClass(), "url", null);
        setField(term99, term99.getClass(), "language", term101);
        Object term102 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term102, term102.getClass(), "description", "");
        setField(term104, term104.getClass(), "name", null);
        setField(term104, term104.getClass(), "url", null);
        setField(term102, term102.getClass(), "language", term104);
        ArrayList term85 = new ArrayList();
        ((ArrayList) term85).add(term87);
        ((ArrayList) term85).add(term90);
        ((ArrayList) term85).add(term93);
        ((ArrayList) term85).add(term96);
        ((ArrayList) term85).add(term99);
        ((ArrayList) term85).add(term102);
        term59 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term59, term59.getClass(), "id", term60);
        setField(term59, term59.getClass(), "name", "xOEqzGAmDU");
        setField(term59, term59.getClass(), "items", term74);
        setField(term59, term59.getClass(), "names", term78);
        setField(term59, term59.getClass(), "descriptions", term85);
        term107 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term107;
        callMethod(klass, "setId", argTypes, term59, args);
    }

};


