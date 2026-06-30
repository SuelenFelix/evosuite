package refactoring.app.chapter12.replaceSuperclassWithDelegate;

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
import static refactoring.app.chapter12.replaceSuperclassWithDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class CatalogItem_hashTag_4208723973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;

    public CatalogItem_hashTag_4208723973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term347 = new Long(-8400487765614892086L);
        ArrayList term361 = new ArrayList();
        ((ArrayList) term361).add("HyxfbSQYBe");
        ((ArrayList) term361).add("pCTimMblYc");
        ((ArrayList) term361).add("hNxWaHcfhY");
        ((ArrayList) term361).add("RkybSrpybU");
        term346 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        setField(term346, term346.getClass(), "id", term347);
        setField(term346, term346.getClass(), "title", "tbcdzjIfER");
        setField(term346, term346.getClass(), "tags", term361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "hashTag", argTypes, term346, args);
    }

};


