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

public class ContestType_getBerryFlavor_3132048835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;

    public ContestType_getBerryFlavor_3132048835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1021 = new Integer(-616727354);
        Object term1062 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestName"));
        Object term1065 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1062, term1062.getClass(), "name", "");
        setField(term1062, term1062.getClass(), "color", "");
        setField(term1065, term1065.getClass(), "name", null);
        setField(term1065, term1065.getClass(), "url", null);
        setField(term1062, term1062.getClass(), "language", term1065);
        ArrayList term1060 = new ArrayList();
        ((ArrayList) term1060).add(term1062);
        term1020 = newInstance(Class.forName("skaro.pokeapi.resource.contesttype.ContestType"));
        Object term1035 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1020, term1020.getClass(), "id", term1021);
        setField(term1020, term1020.getClass(), "name", "sEnIVFtZuQ");
        setField(term1035, term1035.getClass(), "name", "ZVecLZMLHF");
        setField(term1035, term1035.getClass(), "url", "fztQhjqwdP");
        setField(term1020, term1020.getClass(), "berryFlavor", term1035);
        setField(term1020, term1020.getClass(), "names", term1060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.contesttype.ContestType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBerryFlavor", argTypes, term1020, args);
    }

};


