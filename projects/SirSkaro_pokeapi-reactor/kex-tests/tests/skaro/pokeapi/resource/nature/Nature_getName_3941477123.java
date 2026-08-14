package skaro.pokeapi.resource.nature;

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
import static skaro.pokeapi.resource.nature.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class Nature_getName_3941477123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public Nature_getName_3941477123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term449 = new Integer(391863371);
        Object term565 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term567 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term565, term565.getClass(), "name", "");
        setField(term567, term567.getClass(), "name", null);
        setField(term567, term567.getClass(), "url", null);
        setField(term565, term565.getClass(), "language", term567);
        Object term568 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term570 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term568, term568.getClass(), "name", "");
        setField(term570, term570.getClass(), "name", null);
        setField(term570, term570.getClass(), "url", null);
        setField(term568, term568.getClass(), "language", term570);
        Object term571 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term573 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term571, term571.getClass(), "name", "");
        setField(term573, term573.getClass(), "name", null);
        setField(term573, term573.getClass(), "url", null);
        setField(term571, term571.getClass(), "language", term573);
        ArrayList term563 = new ArrayList();
        ((ArrayList) term563).add(term565);
        ((ArrayList) term563).add(term568);
        ((ArrayList) term563).add(term571);
        term448 = newInstance(Class.forName("skaro.pokeapi.resource.nature.Nature"));
        Object term463 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term488 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term513 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        Object term538 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term448, term448.getClass(), "id", term449);
        setField(term448, term448.getClass(), "name", "GzFkzHGYFt");
        setField(term463, term463.getClass(), "name", "tShwQLRGNe");
        setField(term463, term463.getClass(), "url", "LvtrsXUliU");
        setField(term448, term448.getClass(), "decreasedStat", term463);
        setField(term488, term488.getClass(), "name", "xLbjWUgOIL");
        setField(term488, term488.getClass(), "url", "jDtqGUpnZN");
        setField(term448, term448.getClass(), "increasedStat", term488);
        setField(term513, term513.getClass(), "name", "nGKItKLYNC");
        setField(term513, term513.getClass(), "url", "UiUYnPrcCi");
        setField(term448, term448.getClass(), "hatesFlavor", term513);
        setField(term538, term538.getClass(), "name", "UoYtihxVaS");
        setField(term538, term538.getClass(), "url", "JDswTTCZHV");
        setField(term448, term448.getClass(), "likesFlavor", term538);
        setField(term448, term448.getClass(), "names", term563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.nature.Nature");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term448, args);
    }

};


