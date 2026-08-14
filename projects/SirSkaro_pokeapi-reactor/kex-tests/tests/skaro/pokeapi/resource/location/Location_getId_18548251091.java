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

public class Location_getId_18548251091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Location_getId_18548251091() {
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
        Integer term63 = new Integer(1162663216);
        Object term62 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term65 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term62, term62.getClass(), "gameIndex", term63);
        setField(term65, term65.getClass(), "name", null);
        setField(term65, term65.getClass(), "url", null);
        setField(term62, term62.getClass(), "generation", term65);
        Integer term67 = new Integer(1484323161);
        Object term66 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term69 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term66, term66.getClass(), "gameIndex", term67);
        setField(term69, term69.getClass(), "name", null);
        setField(term69, term69.getClass(), "url", null);
        setField(term66, term66.getClass(), "generation", term69);
        Integer term71 = new Integer(391863371);
        Object term70 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term73 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term70, term70.getClass(), "gameIndex", term71);
        setField(term73, term73.getClass(), "name", null);
        setField(term73, term73.getClass(), "url", null);
        setField(term70, term70.getClass(), "generation", term73);
        Integer term75 = new Integer(-1922583790);
        Object term74 = newInstance(Class.forName("skaro.pokeapi.resource.GenerationGameIndex"));
        Object term77 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term74, term74.getClass(), "gameIndex", term75);
        setField(term77, term77.getClass(), "name", null);
        setField(term77, term77.getClass(), "url", null);
        setField(term74, term74.getClass(), "generation", term77);
        ArrayList term60 = new ArrayList();
        ((ArrayList) term60).add(term62);
        ((ArrayList) term60).add(term66);
        ((ArrayList) term60).add(term70);
        ((ArrayList) term60).add(term74);
        ArrayList term80 = new ArrayList();
        term1 = newInstance(Class.forName("skaro.pokeapi.resource.location.Location"));
        Object term16 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term16, term16.getClass(), "name", "sjlJAEtRrb");
        setField(term16, term16.getClass(), "url", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "region", term16);
        setField(term1, term1.getClass(), "names", term41);
        setField(term1, term1.getClass(), "gameIndices", term60);
        setField(term1, term1.getClass(), "areas", term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.location.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


