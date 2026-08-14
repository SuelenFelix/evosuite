package skaro.pokeapi.resource.movedamageclass;

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
import static skaro.pokeapi.resource.movedamageclass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveDamageClass_setId_6649586412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term119;

    public MoveDamageClass_setId_6649586412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term63 = new Integer(1162663216);
        Object term79 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term81 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term79, term79.getClass(), "description", "");
        setField(term81, term81.getClass(), "name", null);
        setField(term81, term81.getClass(), "url", null);
        setField(term79, term79.getClass(), "language", term81);
        Object term82 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term84 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term82, term82.getClass(), "description", "");
        setField(term84, term84.getClass(), "name", null);
        setField(term84, term84.getClass(), "url", null);
        setField(term82, term82.getClass(), "language", term84);
        Object term85 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term87 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term85, term85.getClass(), "description", "");
        setField(term87, term87.getClass(), "name", null);
        setField(term87, term87.getClass(), "url", null);
        setField(term85, term85.getClass(), "language", term87);
        Object term88 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term90 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term88, term88.getClass(), "description", "");
        setField(term90, term90.getClass(), "name", null);
        setField(term90, term90.getClass(), "url", null);
        setField(term88, term88.getClass(), "language", term90);
        ArrayList term77 = new ArrayList();
        ((ArrayList) term77).add(term79);
        ((ArrayList) term77).add(term82);
        ((ArrayList) term77).add(term85);
        ((ArrayList) term77).add(term88);
        ArrayList term93 = new ArrayList();
        Object term99 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term101 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term99, term99.getClass(), "name", "");
        setField(term101, term101.getClass(), "name", null);
        setField(term101, term101.getClass(), "url", null);
        setField(term99, term99.getClass(), "language", term101);
        Object term102 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term104 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term102, term102.getClass(), "name", "");
        setField(term104, term104.getClass(), "name", null);
        setField(term104, term104.getClass(), "url", null);
        setField(term102, term102.getClass(), "language", term104);
        Object term105 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term107 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term105, term105.getClass(), "name", "");
        setField(term107, term107.getClass(), "name", null);
        setField(term107, term107.getClass(), "url", null);
        setField(term105, term105.getClass(), "language", term107);
        Object term108 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term110 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term108, term108.getClass(), "name", "");
        setField(term110, term110.getClass(), "name", null);
        setField(term110, term110.getClass(), "url", null);
        setField(term108, term108.getClass(), "language", term110);
        Object term111 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term113 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term111, term111.getClass(), "name", "");
        setField(term113, term113.getClass(), "name", null);
        setField(term113, term113.getClass(), "url", null);
        setField(term111, term111.getClass(), "language", term113);
        Object term114 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term116 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term114, term114.getClass(), "name", "");
        setField(term116, term116.getClass(), "name", null);
        setField(term116, term116.getClass(), "url", null);
        setField(term114, term114.getClass(), "language", term116);
        ArrayList term97 = new ArrayList();
        ((ArrayList) term97).add(term99);
        ((ArrayList) term97).add(term102);
        ((ArrayList) term97).add(term105);
        ((ArrayList) term97).add(term108);
        ((ArrayList) term97).add(term111);
        ((ArrayList) term97).add(term114);
        term62 = newInstance(Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass"));
        setField(term62, term62.getClass(), "id", term63);
        setField(term62, term62.getClass(), "name", "vrQLuWIDJX");
        setField(term62, term62.getClass(), "descriptions", term77);
        setField(term62, term62.getClass(), "moves", term93);
        setField(term62, term62.getClass(), "names", term97);
        term119 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movedamageclass.MoveDamageClass");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term119;
        callMethod(klass, "setId", argTypes, term62, args);
    }

};


