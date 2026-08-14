package skaro.pokeapi.resource.version;

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
import static skaro.pokeapi.resource.version.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;

public class Version_getVersionGroup_18817572507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;

    public Version_getVersionGroup_18817572507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term593 = new Integer(-2038273078);
        ArrayList term607 = new ArrayList();
        term592 = newInstance(Class.forName("skaro.pokeapi.resource.version.Version"));
        Object term611 = newInstance(Class.forName("skaro.pokeapi.resource.NamedApiResource"));
        setField(term592, term592.getClass(), "id", term593);
        setField(term592, term592.getClass(), "name", "vjxIhXHxGR");
        setField(term592, term592.getClass(), "names", term607);
        setField(term611, term611.getClass(), "name", "QXzGXbEXMu");
        setField(term611, term611.getClass(), "url", "qxSDVejjiY");
        setField(term592, term592.getClass(), "versionGroup", term611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("skaro.pokeapi.resource.version.Version");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersionGroup", argTypes, term592, args);
    }

};


