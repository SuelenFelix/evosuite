package skaro.pokeapi.resource.movecategory;

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
import static skaro.pokeapi.resource.movecategory.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class MoveCategory_getId_7783268371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MoveCategory_getId_7783268371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        ArrayList term16 = new ArrayList();
        Object term22 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term22, term22.getClass(), "description", "");
        setField(term24, term24.getClass(), "name", null);
        setField(term24, term24.getClass(), "url", null);
        setField(term22, term22.getClass(), "language", term24);
        Object term25 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term27 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term25, term25.getClass(), "description", "");
        setField(term27, term27.getClass(), "name", null);
        setField(term27, term27.getClass(), "url", null);
        setField(term25, term25.getClass(), "language", term27);
        Object term28 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term30 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term28, term28.getClass(), "description", "");
        setField(term30, term30.getClass(), "name", null);
        setField(term30, term30.getClass(), "url", null);
        setField(term28, term28.getClass(), "language", term30);
        Object term31 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term33 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term31, term31.getClass(), "description", "");
        setField(term33, term33.getClass(), "name", null);
        setField(term33, term33.getClass(), "url", null);
        setField(term31, term31.getClass(), "language", term33);
        ArrayList term20 = new ArrayList();
        ((ArrayList) term20).add(term22);
        ((ArrayList) term20).add(term25);
        ((ArrayList) term20).add(term28);
        ((ArrayList) term20).add(term31);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "moves", term16);
        setField(term1, term1.getClass(), "descriptions", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movecategory.MoveCategory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


