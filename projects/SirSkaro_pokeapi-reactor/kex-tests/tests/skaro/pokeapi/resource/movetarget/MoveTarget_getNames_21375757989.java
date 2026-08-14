package skaro.pokeapi.resource.movetarget;

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
import static skaro.pokeapi.resource.movetarget.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveTarget_getNames_21375757989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term486;

    public MoveTarget_getNames_21375757989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term487 = new Integer(-1339778481);
        Object term503 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term505 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term503, term503.getClass(), "description", "");
        setField(term505, term505.getClass(), "name", null);
        setField(term505, term505.getClass(), "url", null);
        setField(term503, term503.getClass(), "language", term505);
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
        ArrayList term501 = new ArrayList();
        ((ArrayList) term501).add(term503);
        ((ArrayList) term501).add(term506);
        ((ArrayList) term501).add(term509);
        ((ArrayList) term501).add(term512);
        ((ArrayList) term501).add(term515);
        ((ArrayList) term501).add(term518);
        ArrayList term523 = new ArrayList();
        Object term529 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term531 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term529, term529.getClass(), "name", "");
        setField(term531, term531.getClass(), "name", null);
        setField(term531, term531.getClass(), "url", null);
        setField(term529, term529.getClass(), "language", term531);
        Object term532 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term534 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term532, term532.getClass(), "name", "");
        setField(term534, term534.getClass(), "name", null);
        setField(term534, term534.getClass(), "url", null);
        setField(term532, term532.getClass(), "language", term534);
        Object term535 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term537 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term535, term535.getClass(), "name", "");
        setField(term537, term537.getClass(), "name", null);
        setField(term537, term537.getClass(), "url", null);
        setField(term535, term535.getClass(), "language", term537);
        ArrayList term527 = new ArrayList();
        ((ArrayList) term527).add(term529);
        ((ArrayList) term527).add(term532);
        ((ArrayList) term527).add(term535);
        term486 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term486, term486.getClass(), "id", term487);
        setField(term486, term486.getClass(), "name", "OYbzXylRWW");
        setField(term486, term486.getClass(), "descriptions", term501);
        setField(term486, term486.getClass(), "moves", term523);
        setField(term486, term486.getClass(), "names", term527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNames", argTypes, term486, args);
    }

};


