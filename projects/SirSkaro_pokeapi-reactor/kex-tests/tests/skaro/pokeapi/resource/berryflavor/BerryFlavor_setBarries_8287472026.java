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

public class BerryFlavor_setBarries_8287472026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term793;
     Object term878;

    public BerryFlavor_setBarries_8287472026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term794 = new Integer(-244121226);
        Integer term811 = new Integer(-203030934);
        Object term810 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term813 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term810, term810.getClass(), "potency", term811);
        setField(term813, term813.getClass(), "name", null);
        setField(term813, term813.getClass(), "url", null);
        setField(term810, term810.getClass(), "berry", term813);
        Integer term815 = new Integer(-1179120542);
        Object term814 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term817 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term814, term814.getClass(), "potency", term815);
        setField(term817, term817.getClass(), "name", null);
        setField(term817, term817.getClass(), "url", null);
        setField(term814, term814.getClass(), "berry", term817);
        Integer term819 = new Integer(-73683645);
        Object term818 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term821 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term818, term818.getClass(), "potency", term819);
        setField(term821, term821.getClass(), "name", null);
        setField(term821, term821.getClass(), "url", null);
        setField(term818, term818.getClass(), "berry", term821);
        Integer term823 = new Integer(-226514366);
        Object term822 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term825 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term822, term822.getClass(), "potency", term823);
        setField(term825, term825.getClass(), "name", null);
        setField(term825, term825.getClass(), "url", null);
        setField(term822, term822.getClass(), "berry", term825);
        Integer term827 = new Integer(1193880199);
        Object term826 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term829 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term826, term826.getClass(), "potency", term827);
        setField(term829, term829.getClass(), "name", null);
        setField(term829, term829.getClass(), "url", null);
        setField(term826, term826.getClass(), "berry", term829);
        Integer term831 = new Integer(-1087774327);
        Object term830 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term833 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term830, term830.getClass(), "potency", term831);
        setField(term833, term833.getClass(), "name", null);
        setField(term833, term833.getClass(), "url", null);
        setField(term830, term830.getClass(), "berry", term833);
        ArrayList term808 = new ArrayList();
        ((ArrayList) term808).add(term810);
        ((ArrayList) term808).add(term814);
        ((ArrayList) term808).add(term818);
        ((ArrayList) term808).add(term822);
        ((ArrayList) term808).add(term826);
        ((ArrayList) term808).add(term830);
        Object term863 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term865 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term863, term863.getClass(), "name", "");
        setField(term865, term865.getClass(), "name", null);
        setField(term865, term865.getClass(), "url", null);
        setField(term863, term863.getClass(), "language", term865);
        Object term866 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term868 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term866, term866.getClass(), "name", "");
        setField(term868, term868.getClass(), "name", null);
        setField(term868, term868.getClass(), "url", null);
        setField(term866, term866.getClass(), "language", term868);
        Object term869 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term871 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term869, term869.getClass(), "name", "");
        setField(term871, term871.getClass(), "name", null);
        setField(term871, term871.getClass(), "url", null);
        setField(term869, term869.getClass(), "language", term871);
        Object term872 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term872, term872.getClass(), "name", "");
        setField(term872, term872.getClass(), "language", term865);
        Object term874 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term874, term874.getClass(), "name", "");
        setField(term874, term874.getClass(), "language", term868);
        ArrayList term861 = new ArrayList();
        ((ArrayList) term861).add(term863);
        ((ArrayList) term861).add(term866);
        ((ArrayList) term861).add(term869);
        ((ArrayList) term861).add(term872);
        ((ArrayList) term861).add(term874);
        term793 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term836 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term793, term793.getClass(), "id", term794);
        setField(term793, term793.getClass(), "name", "mLUZFTfjle");
        setField(term793, term793.getClass(), "barries", term808);
        setField(term836, term836.getClass(), "name", "LWyEaeIyAo");
        setField(term836, term836.getClass(), "url", "yVMkkQhvmN");
        setField(term793, term793.getClass(), "contestType", term836);
        setField(term793, term793.getClass(), "names", term861);
        term878 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term878;
        callMethod(klass, "setBarries", argTypes, term793, args);
    }

};


