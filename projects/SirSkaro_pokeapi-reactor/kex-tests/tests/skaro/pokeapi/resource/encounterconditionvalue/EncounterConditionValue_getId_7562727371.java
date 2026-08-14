package skaro.pokeapi.resource.encounterconditionvalue;

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
import static skaro.pokeapi.resource.encounterconditionvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.ArrayList;

public class EncounterConditionValue_getId_7562727371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public EncounterConditionValue_getId_7562727371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Object term43 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term45 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term43, term43.getClass(), "name", "");
        setField(term45, term45.getClass(), "name", null);
        setField(term45, term45.getClass(), "url", null);
        setField(term43, term43.getClass(), "language", term45);
        Object term46 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term48 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term46, term46.getClass(), "name", "");
        setField(term48, term48.getClass(), "name", null);
        setField(term48, term48.getClass(), "url", null);
        setField(term46, term46.getClass(), "language", term48);
        Object term49 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term51 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term49, term49.getClass(), "name", "");
        setField(term51, term51.getClass(), "name", null);
        setField(term51, term51.getClass(), "url", null);
        setField(term49, term49.getClass(), "language", term51);
        Object term52 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term54 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term52, term52.getClass(), "name", "");
        setField(term54, term54.getClass(), "name", null);
        setField(term54, term54.getClass(), "url", null);
        setField(term52, term52.getClass(), "language", term54);
        Object term55 = newInstance(Class.forName("skaro.pokeapi.resource.Name"));
        Object term57 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term55, term55.getClass(), "name", "");
        setField(term57, term57.getClass(), "name", null);
        setField(term57, term57.getClass(), "url", null);
        setField(term55, term55.getClass(), "language", term57);
        ArrayList term41 = new ArrayList();
        ((ArrayList) term41).add(term43);
        ((ArrayList) term41).add(term46);
        ((ArrayList) term41).add(term49);
        ((ArrayList) term41).add(term52);
        ((ArrayList) term41).add(term55);
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue"));
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "name", "sjlJAEtRrb");
        setField(term16, term16.getClass(), "url", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "condition", term16);
        setField(term1, term1.getClass(), "names", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.encounterconditionvalue.EncounterConditionValue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


