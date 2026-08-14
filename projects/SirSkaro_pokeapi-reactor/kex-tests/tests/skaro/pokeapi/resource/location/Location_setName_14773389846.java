package skaro.pokeapi.resource.location;

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
import static skaro.pokeapi.resource.location.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Location_setName_14773389846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124485;

    public Location_setName_14773389846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term124486 = new Integer(82817178);
        ArrayList term124525 = new ArrayList();
        Integer term124532 = new Integer(1619985605);
        Object term124531 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124534 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124531, term124531.getClass(), "gameIndex", term124532);
        setField(term124534, term124534.getClass(), "name", null);
        setField(term124534, term124534.getClass(), "url", null);
        setField(term124531, term124531.getClass(), "generation", term124534);
        Integer term124536 = new Integer(-1020794327);
        Object term124535 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124538 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124535, term124535.getClass(), "gameIndex", term124536);
        setField(term124538, term124538.getClass(), "name", null);
        setField(term124538, term124538.getClass(), "url", null);
        setField(term124535, term124535.getClass(), "generation", term124538);
        Integer term124540 = new Integer(719987081);
        Object term124539 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124542 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124539, term124539.getClass(), "gameIndex", term124540);
        setField(term124542, term124542.getClass(), "name", null);
        setField(term124542, term124542.getClass(), "url", null);
        setField(term124539, term124539.getClass(), "generation", term124542);
        Integer term124544 = new Integer(-1306969788);
        Object term124543 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124546 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124543, term124543.getClass(), "gameIndex", term124544);
        setField(term124546, term124546.getClass(), "name", null);
        setField(term124546, term124546.getClass(), "url", null);
        setField(term124543, term124543.getClass(), "generation", term124546);
        Integer term124548 = new Integer(-272419076);
        Object term124547 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124550 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124547, term124547.getClass(), "gameIndex", term124548);
        setField(term124550, term124550.getClass(), "name", null);
        setField(term124550, term124550.getClass(), "url", null);
        setField(term124547, term124547.getClass(), "generation", term124550);
        Integer term124552 = new Integer(-1366102520);
        Object term124551 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124554 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124551, term124551.getClass(), "gameIndex", term124552);
        setField(term124554, term124554.getClass(), "name", null);
        setField(term124554, term124554.getClass(), "url", null);
        setField(term124551, term124551.getClass(), "generation", term124554);
        Integer term124556 = new Integer(-991083478);
        Object term124555 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term124558 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124555, term124555.getClass(), "gameIndex", term124556);
        setField(term124558, term124558.getClass(), "name", null);
        setField(term124558, term124558.getClass(), "url", null);
        setField(term124555, term124555.getClass(), "generation", term124558);
        ArrayList term124529 = new ArrayList();
        ((ArrayList) term124529).add(term124531);
        ((ArrayList) term124529).add(term124535);
        ((ArrayList) term124529).add(term124539);
        ((ArrayList) term124529).add(term124543);
        ((ArrayList) term124529).add(term124547);
        ((ArrayList) term124529).add(term124551);
        ((ArrayList) term124529).add(term124555);
        ArrayList term124561 = new ArrayList();
        term124485 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term124500 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term124485, term124485.getClass(), "id", term124486);
        setField(term124485, term124485.getClass(), "name", "ulytuHhUQE");
        setField(term124500, term124500.getClass(), "name", "RSBHTAuulO");
        setField(term124500, term124500.getClass(), "url", "LkZqPTSkmU");
        setField(term124485, term124485.getClass(), "region", term124500);
        setField(term124485, term124485.getClass(), "names", term124525);
        setField(term124485, term124485.getClass(), "gameIndices", term124529);
        setField(term124485, term124485.getClass(), "areas", term124561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pTqeRXlwlL";
        callMethod(klass, "setName", argTypes, term124485, args);
    }

};


