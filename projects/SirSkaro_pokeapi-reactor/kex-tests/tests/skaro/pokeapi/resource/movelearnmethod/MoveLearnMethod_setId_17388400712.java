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

public class MoveLearnMethod_setId_17388400712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term107;

    public MoveLearnMethod_setId_17388400712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term66 = new Integer(1162663216);
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
        Object term91 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term93 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term91, term91.getClass(), "description", "");
        setField(term93, term93.getClass(), "name", null);
        setField(term93, term93.getClass(), "url", null);
        setField(term91, term91.getClass(), "language", term93);
        ArrayList term80 = new ArrayList();
        ((ArrayList) term80).add(term82);
        ((ArrayList) term80).add(term85);
        ((ArrayList) term80).add(term88);
        ((ArrayList) term80).add(term91);
        Object term98 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term100 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term98, term98.getClass(), "name", "");
        setField(term100, term100.getClass(), "name", null);
        setField(term100, term100.getClass(), "url", null);
        setField(term98, term98.getClass(), "language", term100);
        ArrayList term96 = new ArrayList();
        ((ArrayList) term96).add(term98);
        ArrayList term103 = new ArrayList();
        term65 = newInstance(Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod"));
        setField(term65, term65.getClass(), "id", term66);
        setField(term65, term65.getClass(), "name", "IoAlmYsBwc");
        setField(term65, term65.getClass(), "descriptions", term80);
        setField(term65, term65.getClass(), "names", term96);
        setField(term65, term65.getClass(), "versionGroups", term103);
        term107 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movelearnmethod.MoveLearnMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term107;
        callMethod(klass, "setId", argTypes, term65, args);
    }

};


