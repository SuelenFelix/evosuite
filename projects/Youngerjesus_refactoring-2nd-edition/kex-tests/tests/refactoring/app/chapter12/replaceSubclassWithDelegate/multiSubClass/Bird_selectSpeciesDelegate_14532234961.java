package refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass;

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
import static refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Bird_selectSpeciesDelegate_14532234961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;
     Object term368;

    public Bird_selectSpeciesDelegate_14532234961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Bird"));
        Object term355 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.SpeciesDelegate"));
        setField(term330, term330.getClass(), "name", "oVcInYnLWB");
        setField(term330, term330.getClass(), "plumage", "aJlieCFVtF");
        setField(term355, term355.getClass(), "plumage", "ZiaGIbnzTs");
        setField(term330, term330.getClass(), "speciesDelegate", term355);
        term368 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data"));
        setBooleanField(term368, term368.getClass(), "isNailed", false);
        setIntField(term368, term368.getClass(), "voltage", -2038273078);
        setIntField(term368, term368.getClass(), "numberOfCounts", 1227103734);
        setField(term368, term368.getClass(), "type", "tbcdzjIfER");
        setField(term368, term368.getClass(), "name", "HyxfbSQYBe");
        setField(term368, term368.getClass(), "plumage", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Bird");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data");
        Object[] args = new Object[1];
        args[0] = term368;
        callMethod(klass, "selectSpeciesDelegate", argTypes, term330, args);
    }

};


