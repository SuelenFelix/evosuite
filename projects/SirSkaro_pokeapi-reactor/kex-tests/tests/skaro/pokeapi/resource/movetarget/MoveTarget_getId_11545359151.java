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

public class MoveTarget_getId_11545359151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public MoveTarget_getId_11545359151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Object term18 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term20 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term18, term18.getClass(), "description", "");
        setField(term20, term20.getClass(), "name", null);
        setField(term20, term20.getClass(), "url", null);
        setField(term18, term18.getClass(), "language", term20);
        Object term21 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term23 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term21, term21.getClass(), "description", "");
        setField(term23, term23.getClass(), "name", null);
        setField(term23, term23.getClass(), "url", null);
        setField(term21, term21.getClass(), "language", term23);
        Object term24 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term26 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term24, term24.getClass(), "description", "");
        setField(term26, term26.getClass(), "name", null);
        setField(term26, term26.getClass(), "url", null);
        setField(term24, term24.getClass(), "language", term26);
        Object term27 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term29 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term27, term27.getClass(), "description", "");
        setField(term29, term29.getClass(), "name", null);
        setField(term29, term29.getClass(), "url", null);
        setField(term27, term27.getClass(), "language", term29);
        Object term30 = newInstance(Class.forName("skaro.pokeapi.resource.Description"));
        Object term32 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term30, term30.getClass(), "description", "");
        setField(term32, term32.getClass(), "name", null);
        setField(term32, term32.getClass(), "url", null);
        setField(term30, term30.getClass(), "language", term32);
        ArrayList term16 = new ArrayList();
        ((ArrayList) term16).add(term18);
        ((ArrayList) term16).add(term21);
        ((ArrayList) term16).add(term24);
        ((ArrayList) term16).add(term27);
        ((ArrayList) term16).add(term30);
        ArrayList term35 = new ArrayList();
        Object term41 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term43 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term41, term41.getClass(), "name", "");
        setField(term43, term43.getClass(), "name", null);
        setField(term43, term43.getClass(), "url", null);
        setField(term41, term41.getClass(), "language", term43);
        Object term44 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term46 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term44, term44.getClass(), "name", "");
        setField(term46, term46.getClass(), "name", null);
        setField(term46, term46.getClass(), "url", null);
        setField(term44, term44.getClass(), "language", term46);
        Object term47 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term49 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term47, term47.getClass(), "name", "");
        setField(term49, term49.getClass(), "name", null);
        setField(term49, term49.getClass(), "url", null);
        setField(term47, term47.getClass(), "language", term49);
        ArrayList term39 = new ArrayList();
        ((ArrayList) term39).add(term41);
        ((ArrayList) term39).add(term44);
        ((ArrayList) term39).add(term47);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "descriptions", term16);
        setField(term1, term1.getClass(), "moves", term35);
        setField(term1, term1.getClass(), "names", term39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.movetarget.MoveTarget");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


