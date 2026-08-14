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

public class BerryFlavor_setContestType_21354790338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term993;
     Object term1070;

    public BerryFlavor_setContestType_21354790338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term994 = new Integer(-1145578966);
        Integer term1011 = new Integer(679763016);
        Object term1010 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1013 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1010, term1010.getClass(), "potency", term1011);
        setField(term1013, term1013.getClass(), "name", null);
        setField(term1013, term1013.getClass(), "url", null);
        setField(term1010, term1010.getClass(), "berry", term1013);
        Integer term1015 = new Integer(1962444399);
        Object term1014 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1017 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1014, term1014.getClass(), "potency", term1015);
        setField(term1017, term1017.getClass(), "name", null);
        setField(term1017, term1017.getClass(), "url", null);
        setField(term1014, term1014.getClass(), "berry", term1017);
        ArrayList term1008 = new ArrayList();
        ((ArrayList) term1008).add(term1010);
        ((ArrayList) term1008).add(term1014);
        Object term1047 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1049 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1047, term1047.getClass(), "name", "");
        setField(term1049, term1049.getClass(), "name", null);
        setField(term1049, term1049.getClass(), "url", null);
        setField(term1047, term1047.getClass(), "language", term1049);
        Object term1050 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1052 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1050, term1050.getClass(), "name", "");
        setField(term1052, term1052.getClass(), "name", null);
        setField(term1052, term1052.getClass(), "url", null);
        setField(term1050, term1050.getClass(), "language", term1052);
        Object term1053 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1055 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1053, term1053.getClass(), "name", "");
        setField(term1055, term1055.getClass(), "name", null);
        setField(term1055, term1055.getClass(), "url", null);
        setField(term1053, term1053.getClass(), "language", term1055);
        Object term1056 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1058 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1056, term1056.getClass(), "name", "");
        setField(term1058, term1058.getClass(), "name", null);
        setField(term1058, term1058.getClass(), "url", null);
        setField(term1056, term1056.getClass(), "language", term1058);
        Object term1059 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1061 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1059, term1059.getClass(), "name", "");
        setField(term1061, term1061.getClass(), "name", null);
        setField(term1061, term1061.getClass(), "url", null);
        setField(term1059, term1059.getClass(), "language", term1061);
        Object term1062 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1064 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1062, term1062.getClass(), "name", "");
        setField(term1064, term1064.getClass(), "name", null);
        setField(term1064, term1064.getClass(), "url", null);
        setField(term1062, term1062.getClass(), "language", term1064);
        Object term1065 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1067 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1065, term1065.getClass(), "name", "");
        setField(term1067, term1067.getClass(), "name", null);
        setField(term1067, term1067.getClass(), "url", null);
        setField(term1065, term1065.getClass(), "language", term1067);
        ArrayList term1045 = new ArrayList();
        ((ArrayList) term1045).add(term1047);
        ((ArrayList) term1045).add(term1050);
        ((ArrayList) term1045).add(term1053);
        ((ArrayList) term1045).add(term1056);
        ((ArrayList) term1045).add(term1059);
        ((ArrayList) term1045).add(term1062);
        ((ArrayList) term1045).add(term1065);
        term993 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term1020 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term993, term993.getClass(), "id", term994);
        setField(term993, term993.getClass(), "name", "HWkpTmtlrc");
        setField(term993, term993.getClass(), "barries", term1008);
        setField(term1020, term1020.getClass(), "name", "DbiCVtPPCT");
        setField(term1020, term1020.getClass(), "url", "WzFopsaDuG");
        setField(term993, term993.getClass(), "contestType", term1020);
        setField(term993, term993.getClass(), "names", term1045);
        term1070 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1070, term1070.getClass(), "name", "kNqaJKIATy");
        setField(term1070, term1070.getClass(), "url", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("skaro.pokeapi.resource.NamedApiResource");
        Object[] args = new Object[1];
        args[0] = term1070;
        callMethod(klass, "setContestType", argTypes, term993, args);
    }

};


