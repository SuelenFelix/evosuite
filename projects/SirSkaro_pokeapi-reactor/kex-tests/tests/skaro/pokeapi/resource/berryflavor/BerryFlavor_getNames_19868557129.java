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

public class BerryFlavor_getNames_19868557129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1145;

    public BerryFlavor_getNames_19868557129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1146 = new Integer(767834723);
        Integer term1163 = new Integer(-602026508);
        Object term1162 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.FlavorBerryMap"));
        Object term1165 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1162, term1162.getClass(), "potency", term1163);
        setField(term1165, term1165.getClass(), "name", null);
        setField(term1165, term1165.getClass(), "url", null);
        setField(term1162, term1162.getClass(), "berry", term1165);
        ArrayList term1160 = new ArrayList();
        ((ArrayList) term1160).add(term1162);
        Object term1195 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1197 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1195, term1195.getClass(), "name", "");
        setField(term1197, term1197.getClass(), "name", null);
        setField(term1197, term1197.getClass(), "url", null);
        setField(term1195, term1195.getClass(), "language", term1197);
        Object term1198 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1200 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1198, term1198.getClass(), "name", "");
        setField(term1200, term1200.getClass(), "name", null);
        setField(term1200, term1200.getClass(), "url", null);
        setField(term1198, term1198.getClass(), "language", term1200);
        Object term1201 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1203 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1201, term1201.getClass(), "name", "");
        setField(term1203, term1203.getClass(), "name", null);
        setField(term1203, term1203.getClass(), "url", null);
        setField(term1201, term1201.getClass(), "language", term1203);
        Object term1204 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1206 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1204, term1204.getClass(), "name", "");
        setField(term1206, term1206.getClass(), "name", null);
        setField(term1206, term1206.getClass(), "url", null);
        setField(term1204, term1204.getClass(), "language", term1206);
        Object term1207 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term1209 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1207, term1207.getClass(), "name", "");
        setField(term1209, term1209.getClass(), "name", null);
        setField(term1209, term1209.getClass(), "url", null);
        setField(term1207, term1207.getClass(), "language", term1209);
        ArrayList term1193 = new ArrayList();
        ((ArrayList) term1193).add(term1195);
        ((ArrayList) term1193).add(term1198);
        ((ArrayList) term1193).add(term1201);
        ((ArrayList) term1193).add(term1204);
        ((ArrayList) term1193).add(term1207);
        term1145 = newInstance(Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor"));
        Object term1168 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1145, term1145.getClass(), "id", term1146);
        setField(term1145, term1145.getClass(), "name", "lFRJFUMVbx");
        setField(term1145, term1145.getClass(), "barries", term1160);
        setField(term1168, term1168.getClass(), "name", "tRxZafjqIx");
        setField(term1168, term1168.getClass(), "url", "DhjNLmRMCu");
        setField(term1145, term1145.getClass(), "contestType", term1168);
        setField(term1145, term1145.getClass(), "names", term1193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.berryflavor.BerryFlavor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term1145, args);
    }

};


