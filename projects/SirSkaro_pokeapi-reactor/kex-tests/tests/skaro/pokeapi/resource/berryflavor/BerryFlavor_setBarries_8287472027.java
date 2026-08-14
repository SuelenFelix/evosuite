package skaro.pokeapi.resource.berryflavor;

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
import static skaro.pokeapi.resource.berryflavor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class BerryFlavor_setBarries_8287472027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140532;
     Object term140584;

    public BerryFlavor_setBarries_8287472027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140533 = new Integer(59956966);
        Integer term140550 = new Integer(-841682366);
        Object term140549 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140552 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140549, term140549.getClass(), "potency", term140550);
        setField(term140552, term140552.getClass(), "name", null);
        setField(term140552, term140552.getClass(), "url", null);
        setField(term140549, term140549.getClass(), "berry", term140552);
        ArrayList term140547 = new ArrayList();
        ((ArrayList) term140547).add(term140549);
        ArrayList term140580 = new ArrayList();
        term140532 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140555 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140532, term140532.getClass(), "id", term140533);
        setField(term140532, term140532.getClass(), "name", "fMcFeXqOQb");
        setField(term140532, term140532.getClass(), "barries", term140547);
        setField(term140555, term140555.getClass(), "name", "AclwSEaHPt");
        setField(term140555, term140555.getClass(), "url", "QztYAnnKpB");
        setField(term140532, term140532.getClass(), "contestType", term140555);
        setField(term140532, term140532.getClass(), "names", term140580);
        term140584 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term140584;
        callMethod(klass, "setBarries", argTypes, term140532, args);
    }

};


