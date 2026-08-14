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

public class Berry_setName_14184427624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579;

    public Berry_setName_14184427624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term580 = new Integer(1193880199);
        Integer term594 = new Integer(-1087774327);
        Integer term596 = new Integer(-1530420153);
        Integer term598 = new Integer(-469968304);
        Integer term600 = new Integer(-1145578966);
        Integer term602 = new Integer(679763016);
        Integer term604 = new Integer(1962444399);
        Integer term634 = new Integer(767834723);
        Object term633 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term636 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term633, term633.getClass(), "potency", term634);
        setField(term636, term636.getClass(), "name", null);
        setField(term636, term636.getClass(), "url", null);
        setField(term633, term633.getClass(), "flavor", term636);
        Integer term638 = new Integer(-602026508);
        Object term637 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term640 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term637, term637.getClass(), "potency", term638);
        setField(term640, term640.getClass(), "name", null);
        setField(term640, term640.getClass(), "url", null);
        setField(term637, term637.getClass(), "flavor", term640);
        Integer term642 = new Integer(-157887805);
        Object term641 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term644 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term641, term641.getClass(), "potency", term642);
        setField(term644, term644.getClass(), "name", null);
        setField(term644, term644.getClass(), "url", null);
        setField(term641, term641.getClass(), "flavor", term644);
        Integer term646 = new Integer(1876565163);
        Object term645 = newInstance(Class.forName("skaro.pokeapi.resource.berry.BerryFlavorMap"));
        Object term648 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term645, term645.getClass(), "potency", term646);
        setField(term648, term648.getClass(), "name", null);
        setField(term648, term648.getClass(), "url", null);
        setField(term645, term645.getClass(), "flavor", term648);
        ArrayList term631 = new ArrayList();
        ((ArrayList) term631).add(term633);
        ((ArrayList) term631).add(term637);
        ((ArrayList) term631).add(term641);
        ((ArrayList) term631).add(term645);
        term579 = newInstance(Class.forName("skaro.pokeapi.resource.berry.Berry"));
        Object term606 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term651 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term676 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term579, term579.getClass(), "id", term580);
        setField(term579, term579.getClass(), "name", "GzFkzHGYFt");
        setField(term579, term579.getClass(), "growthTime", term594);
        setField(term579, term579.getClass(), "maxHarvest", term596);
        setField(term579, term579.getClass(), "naturalGiftPower", term598);
        setField(term579, term579.getClass(), "size", term600);
        setField(term579, term579.getClass(), "smoothness", term602);
        setField(term579, term579.getClass(), "soilDryness", term604);
        setField(term606, term606.getClass(), "name", "tShwQLRGNe");
        setField(term606, term606.getClass(), "url", "LvtrsXUliU");
        setField(term579, term579.getClass(), "firmness", term606);
        setField(term579, term579.getClass(), "flavors", term631);
        setField(term651, term651.getClass(), "name", "ffYhPOzlUs");
        setField(term651, term651.getClass(), "url", "MLqYREekMl");
        setField(term579, term579.getClass(), "item", term651);
        setField(term676, term676.getClass(), "name", "ytSBIKXogI");
        setField(term676, term676.getClass(), "url", "nHXjMycHlU");
        setField(term579, term579.getClass(), "naturalGiftType", term676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berry.Berry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setName", argTypes, term579, args);
    }

};


