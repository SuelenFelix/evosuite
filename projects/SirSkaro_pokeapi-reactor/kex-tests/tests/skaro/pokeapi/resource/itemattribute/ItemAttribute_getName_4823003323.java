package skaro.pokeapi.resource.itemattribute;

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
import static skaro.pokeapi.resource.itemattribute.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class ItemAttribute_getName_4823003323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public ItemAttribute_getName_4823003323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term120 = new Integer(391863371);
        ArrayList term134 = new ArrayList();
        Object term140 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term142 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term140, term140.getClass(), "name", "");
        setField(term142, term142.getClass(), "name", null);
        setField(term142, term142.getClass(), "url", null);
        setField(term140, term140.getClass(), "language", term142);
        Object term143 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term145 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term143, term143.getClass(), "name", "");
        setField(term145, term145.getClass(), "name", null);
        setField(term145, term145.getClass(), "url", null);
        setField(term143, term143.getClass(), "language", term145);
        Object term146 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term148 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term146, term146.getClass(), "name", "");
        setField(term148, term148.getClass(), "name", null);
        setField(term148, term148.getClass(), "url", null);
        setField(term146, term146.getClass(), "language", term148);
        Object term149 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term151 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term149, term149.getClass(), "name", "");
        setField(term151, term151.getClass(), "name", null);
        setField(term151, term151.getClass(), "url", null);
        setField(term149, term149.getClass(), "language", term151);
        Object term152 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term154 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term152, term152.getClass(), "name", "");
        setField(term154, term154.getClass(), "name", null);
        setField(term154, term154.getClass(), "url", null);
        setField(term152, term152.getClass(), "language", term154);
        Object term155 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term157 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term155, term155.getClass(), "name", "");
        setField(term157, term157.getClass(), "name", null);
        setField(term157, term157.getClass(), "url", null);
        setField(term155, term155.getClass(), "language", term157);
        ArrayList term138 = new ArrayList();
        ((ArrayList) term138).add(term140);
        ((ArrayList) term138).add(term143);
        ((ArrayList) term138).add(term146);
        ((ArrayList) term138).add(term149);
        ((ArrayList) term138).add(term152);
        ((ArrayList) term138).add(term155);
        Object term162 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term164 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term162, term162.getClass(), "description", "");
        setField(term164, term164.getClass(), "name", null);
        setField(term164, term164.getClass(), "url", null);
        setField(term162, term162.getClass(), "language", term164);
        Object term165 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term167 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term165, term165.getClass(), "description", "");
        setField(term167, term167.getClass(), "name", null);
        setField(term167, term167.getClass(), "url", null);
        setField(term165, term165.getClass(), "language", term167);
        Object term168 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term170 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term168, term168.getClass(), "description", "");
        setField(term170, term170.getClass(), "name", null);
        setField(term170, term170.getClass(), "url", null);
        setField(term168, term168.getClass(), "language", term170);
        Object term171 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term173 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term171, term171.getClass(), "description", "");
        setField(term173, term173.getClass(), "name", null);
        setField(term173, term173.getClass(), "url", null);
        setField(term171, term171.getClass(), "language", term173);
        Object term174 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        setField(term174, term174.getClass(), "description", "");
        setField(term174, term174.getClass(), "language", term167);
        Object term176 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        setField(term176, term176.getClass(), "description", "");
        setField(term176, term176.getClass(), "language", term170);
        Object term178 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        setField(term178, term178.getClass(), "description", "");
        setField(term178, term178.getClass(), "language", term142);
        ArrayList term160 = new ArrayList();
        ((ArrayList) term160).add(term162);
        ((ArrayList) term160).add(term165);
        ((ArrayList) term160).add(term168);
        ((ArrayList) term160).add(term171);
        ((ArrayList) term160).add(term174);
        ((ArrayList) term160).add(term176);
        ((ArrayList) term160).add(term178);
        term119 = newInstance(Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute"));
        setField(term119, term119.getClass(), "id", term120);
        setField(term119, term119.getClass(), "name", "BndsHwAFMv");
        setField(term119, term119.getClass(), "items", term134);
        setField(term119, term119.getClass(), "names", term138);
        setField(term119, term119.getClass(), "descriptions", term160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.itemattribute.ItemAttribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term119, args);
    }

};


