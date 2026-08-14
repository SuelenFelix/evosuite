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

public class BerryFlavor_setContestType_213547903310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140739;
     Object term140822;

    public BerryFlavor_setContestType_213547903310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term140740 = new Integer(1739625708);
        Integer term140757 = new Integer(-323567982);
        Object term140756 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140759 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140756, term140756.getClass(), "potency", term140757);
        setField(term140759, term140759.getClass(), "name", null);
        setField(term140759, term140759.getClass(), "url", null);
        setField(term140756, term140756.getClass(), "berry", term140759);
        Integer term140761 = new Integer(-64120763);
        Object term140760 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140763 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140760, term140760.getClass(), "potency", term140761);
        setField(term140763, term140763.getClass(), "name", null);
        setField(term140763, term140763.getClass(), "url", null);
        setField(term140760, term140760.getClass(), "berry", term140763);
        Integer term140765 = new Integer(1509055726);
        Object term140764 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140767 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140764, term140764.getClass(), "potency", term140765);
        setField(term140767, term140767.getClass(), "name", null);
        setField(term140767, term140767.getClass(), "url", null);
        setField(term140764, term140764.getClass(), "berry", term140767);
        Integer term140769 = new Integer(-1877152178);
        Object term140768 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140771 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140768, term140768.getClass(), "potency", term140769);
        setField(term140771, term140771.getClass(), "name", null);
        setField(term140771, term140771.getClass(), "url", null);
        setField(term140768, term140768.getClass(), "berry", term140771);
        Integer term140773 = new Integer(-1510720583);
        Object term140772 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140775 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140772, term140772.getClass(), "potency", term140773);
        setField(term140775, term140775.getClass(), "name", null);
        setField(term140775, term140775.getClass(), "url", null);
        setField(term140772, term140772.getClass(), "berry", term140775);
        Integer term140777 = new Integer(993976584);
        Object term140776 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140779 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140776, term140776.getClass(), "potency", term140777);
        setField(term140779, term140779.getClass(), "name", null);
        setField(term140779, term140779.getClass(), "url", null);
        setField(term140776, term140776.getClass(), "berry", term140779);
        Integer term140781 = new Integer(-1655862728);
        Object term140780 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140783 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140780, term140780.getClass(), "potency", term140781);
        setField(term140783, term140783.getClass(), "name", null);
        setField(term140783, term140783.getClass(), "url", null);
        setField(term140780, term140780.getClass(), "berry", term140783);
        Integer term140785 = new Integer(-596801958);
        Object term140784 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term140787 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140784, term140784.getClass(), "potency", term140785);
        setField(term140787, term140787.getClass(), "name", null);
        setField(term140787, term140787.getClass(), "url", null);
        setField(term140784, term140784.getClass(), "berry", term140787);
        ArrayList term140754 = new ArrayList();
        ((ArrayList) term140754).add(term140756);
        ((ArrayList) term140754).add(term140760);
        ((ArrayList) term140754).add(term140764);
        ((ArrayList) term140754).add(term140768);
        ((ArrayList) term140754).add(term140772);
        ((ArrayList) term140754).add(term140776);
        ((ArrayList) term140754).add(term140780);
        ((ArrayList) term140754).add(term140784);
        Object term140817 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term140819 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140817, term140817.getClass(), "name", "");
        setField(term140819, term140819.getClass(), "name", null);
        setField(term140819, term140819.getClass(), "url", null);
        setField(term140817, term140817.getClass(), "language", term140819);
        ArrayList term140815 = new ArrayList();
        ((ArrayList) term140815).add(term140817);
        term140739 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term140790 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140739, term140739.getClass(), "id", term140740);
        setField(term140739, term140739.getClass(), "name", "HpwLxMsWfM");
        setField(term140739, term140739.getClass(), "barries", term140754);
        setField(term140790, term140790.getClass(), "name", "KoVWkKekwp");
        setField(term140790, term140790.getClass(), "url", "HDRdoaBYpr");
        setField(term140739, term140739.getClass(), "contestType", term140790);
        setField(term140739, term140739.getClass(), "names", term140815);
        term140822 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140822, term140822.getClass(), "name", "cqRkVaBrri");
        setField(term140822, term140822.getClass(), "url", "vyoDwdaRup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term140822;
        callMethod(klass, "setContestType", argTypes, term140739, args);
    }

};


