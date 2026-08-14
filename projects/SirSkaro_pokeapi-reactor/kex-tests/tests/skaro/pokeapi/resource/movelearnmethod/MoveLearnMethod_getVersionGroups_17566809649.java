package skaro.pokeapi.resource.movelearnmethod;

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
import static skaro.pokeapi.resource.movelearnmethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveLearnMethod_getVersionGroups_17566809649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term489;

    public MoveLearnMethod_getVersionGroups_17566809649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term490 = new Integer(-1339778481);
        Object term506 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term508 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term506, term506.getClass(), "description", "");
        setField(term508, term508.getClass(), "name", null);
        setField(term508, term508.getClass(), "url", null);
        setField(term506, term506.getClass(), "language", term508);
        Object term509 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term511 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term509, term509.getClass(), "description", "");
        setField(term511, term511.getClass(), "name", null);
        setField(term511, term511.getClass(), "url", null);
        setField(term509, term509.getClass(), "language", term511);
        Object term512 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term514 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term512, term512.getClass(), "description", "");
        setField(term514, term514.getClass(), "name", null);
        setField(term514, term514.getClass(), "url", null);
        setField(term512, term512.getClass(), "language", term514);
        Object term515 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term517 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term515, term515.getClass(), "description", "");
        setField(term517, term517.getClass(), "name", null);
        setField(term517, term517.getClass(), "url", null);
        setField(term515, term515.getClass(), "language", term517);
        Object term518 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term520 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term518, term518.getClass(), "description", "");
        setField(term520, term520.getClass(), "name", null);
        setField(term520, term520.getClass(), "url", null);
        setField(term518, term518.getClass(), "language", term520);
        Object term521 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term523 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term521, term521.getClass(), "description", "");
        setField(term523, term523.getClass(), "name", null);
        setField(term523, term523.getClass(), "url", null);
        setField(term521, term521.getClass(), "language", term523);
        ArrayList term504 = new ArrayList();
        ((ArrayList) term504).add(term506);
        ((ArrayList) term504).add(term509);
        ((ArrayList) term504).add(term512);
        ((ArrayList) term504).add(term515);
        ((ArrayList) term504).add(term518);
        ((ArrayList) term504).add(term521);
        Object term528 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term530 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term528, term528.getClass(), "name", "");
        setField(term530, term530.getClass(), "name", null);
        setField(term530, term530.getClass(), "url", null);
        setField(term528, term528.getClass(), "language", term530);
        Object term531 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term533 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term531, term531.getClass(), "name", "");
        setField(term533, term533.getClass(), "name", null);
        setField(term533, term533.getClass(), "url", null);
        setField(term531, term531.getClass(), "language", term533);
        Object term534 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term536 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term534, term534.getClass(), "name", "");
        setField(term536, term536.getClass(), "name", null);
        setField(term536, term536.getClass(), "url", null);
        setField(term534, term534.getClass(), "language", term536);
        Object term537 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term539 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term537, term537.getClass(), "name", "");
        setField(term539, term539.getClass(), "name", null);
        setField(term539, term539.getClass(), "url", null);
        setField(term537, term537.getClass(), "language", term539);
        Object term540 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        setField(term540, term540.getClass(), "name", "");
        setField(term540, term540.getClass(), "language", term533);
        ArrayList term526 = new ArrayList();
        ((ArrayList) term526).add(term528);
        ((ArrayList) term526).add(term531);
        ((ArrayList) term526).add(term534);
        ((ArrayList) term526).add(term537);
        ((ArrayList) term526).add(term540);
        ArrayList term544 = new ArrayList();
        term489 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term489, term489.getClass(), "id", term490);
        setField(term489, term489.getClass(), "name", "rLHAoqXgPh");
        setField(term489, term489.getClass(), "descriptions", term504);
        setField(term489, term489.getClass(), "names", term526);
        setField(term489, term489.getClass(), "versionGroups", term544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroups", argTypes, term489, args);
    }

};


