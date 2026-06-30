package refactoring.app.chapter04;

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
import static refactoring.app.chapter04.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Province_addProducer_14139650402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;
     Object term164;

    public Province_addProducer_14139650402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term147 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term143, term143.getClass(), "name", "");
        setIntField(term143, term143.getClass(), "cost", 663292551);
        setIntField(term143, term143.getClass(), "production", -1885090354);
        setField(term147, term147.getClass(), "name", null);
        setField(term147, term147.getClass(), "producers", null);
        setIntField(term147, term147.getClass(), "totalProduction", 937859191);
        setIntField(term147, term147.getClass(), "demand", -916584829);
        setIntField(term147, term147.getClass(), "price", -2131181468);
        setField(term143, term143.getClass(), "province", term147);
        Object term151 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term155 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term151, term151.getClass(), "name", "");
        setIntField(term151, term151.getClass(), "cost", -1214628358);
        setIntField(term151, term151.getClass(), "production", 1102721075);
        setField(term155, term155.getClass(), "name", null);
        setField(term155, term155.getClass(), "producers", null);
        setIntField(term155, term155.getClass(), "totalProduction", -2104981311);
        setIntField(term155, term155.getClass(), "demand", -571169753);
        setIntField(term155, term155.getClass(), "price", 318591690);
        setField(term151, term151.getClass(), "province", term155);
        ArrayList term141 = new ArrayList();
        ((ArrayList) term141).add(term143);
        ((ArrayList) term141).add(term151);
        term128 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term128, term128.getClass(), "name", "whBvTVIIlC");
        setField(term128, term128.getClass(), "producers", term141);
        setIntField(term128, term128.getClass(), "totalProduction", 282916351);
        setIntField(term128, term128.getClass(), "demand", 880977281);
        setIntField(term128, term128.getClass(), "price", 371943306);
        Object term194 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term194, term194.getClass(), "name", null);
        setIntField(term194, term194.getClass(), "cost", -75206835);
        setIntField(term194, term194.getClass(), "production", -1618206977);
        setField(term194, term194.getClass(), "province", null);
        Object term197 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term197, term197.getClass(), "name", null);
        setIntField(term197, term197.getClass(), "cost", 479531250);
        setIntField(term197, term197.getClass(), "production", 1320570890);
        setField(term197, term197.getClass(), "province", null);
        Object term200 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term200, term200.getClass(), "name", null);
        setIntField(term200, term200.getClass(), "cost", -1122880881);
        setIntField(term200, term200.getClass(), "production", -542712742);
        setField(term200, term200.getClass(), "province", null);
        Object term203 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        setField(term203, term203.getClass(), "name", null);
        setIntField(term203, term203.getClass(), "cost", -1747406163);
        setIntField(term203, term203.getClass(), "production", 388157121);
        setField(term203, term203.getClass(), "province", null);
        ArrayList term192 = new ArrayList();
        ((ArrayList) term192).add(term194);
        ((ArrayList) term192).add(term197);
        ((ArrayList) term192).add(term200);
        ((ArrayList) term192).add(term203);
        term164 = newInstance(Class.forName("refactoring.app.chapter04.Producer"));
        Object term179 = newInstance(Class.forName("refactoring.app.chapter04.Province"));
        setField(term164, term164.getClass(), "name", "jSpAteRute");
        setIntField(term164, term164.getClass(), "cost", 982388293);
        setIntField(term164, term164.getClass(), "production", -159494544);
        setField(term179, term179.getClass(), "name", "swZVeJAxjt");
        setField(term179, term179.getClass(), "producers", term192);
        setIntField(term179, term179.getClass(), "totalProduction", 1507074215);
        setIntField(term179, term179.getClass(), "demand", -282881827);
        setIntField(term179, term179.getClass(), "price", -1183353915);
        setField(term164, term164.getClass(), "province", term179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter04.Province");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter04.Producer");
        Object[] args = new Object[1];
        args[0] = term164;
        callMethod(klass, "addProducer", argTypes, term128, args);
    }

};


