package skaro.pokeapi.resource.contesttype;

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
import static skaro.pokeapi.resource.contesttype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class ContestType_getId_2941029671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;

    public ContestType_getId_2941029671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term637 = new Integer(568599855);
        Object term678 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term681 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term678, term678.getClass(), "name", "");
        setField(term678, term678.getClass(), "color", "");
        setField(term681, term681.getClass(), "name", null);
        setField(term681, term681.getClass(), "url", null);
        setField(term678, term678.getClass(), "language", term681);
        Object term682 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term685 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term682, term682.getClass(), "name", "");
        setField(term682, term682.getClass(), "color", "");
        setField(term685, term685.getClass(), "name", null);
        setField(term685, term685.getClass(), "url", null);
        setField(term682, term682.getClass(), "language", term685);
        Object term686 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term689 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term686, term686.getClass(), "name", "");
        setField(term686, term686.getClass(), "color", "");
        setField(term689, term689.getClass(), "name", null);
        setField(term689, term689.getClass(), "url", null);
        setField(term686, term686.getClass(), "language", term689);
        Object term690 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term693 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term690, term690.getClass(), "name", "");
        setField(term690, term690.getClass(), "color", "");
        setField(term693, term693.getClass(), "name", null);
        setField(term693, term693.getClass(), "url", null);
        setField(term690, term690.getClass(), "language", term693);
        Object term694 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term697 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term694, term694.getClass(), "name", "");
        setField(term694, term694.getClass(), "color", "");
        setField(term697, term697.getClass(), "name", null);
        setField(term697, term697.getClass(), "url", null);
        setField(term694, term694.getClass(), "language", term697);
        ArrayList term676 = new ArrayList();
        ((ArrayList) term676).add(term678);
        ((ArrayList) term676).add(term682);
        ((ArrayList) term676).add(term686);
        ((ArrayList) term676).add(term690);
        ((ArrayList) term676).add(term694);
        term636 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term651 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "name", "OWDIEULEFu");
        setField(term651, term651.getClass(), "name", "dWRymuLBtr");
        setField(term651, term651.getClass(), "url", "AijpHYOFuy");
        setField(term636, term636.getClass(), "berryFlavor", term651);
        setField(term636, term636.getClass(), "names", term676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term636, args);
    }

};


