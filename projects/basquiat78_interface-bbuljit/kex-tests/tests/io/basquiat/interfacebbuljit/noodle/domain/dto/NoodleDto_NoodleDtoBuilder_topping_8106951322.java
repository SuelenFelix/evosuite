package io.basquiat.interfacebbuljit.noodle.domain.dto;

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
import static io.basquiat.interfacebbuljit.noodle.domain.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class NoodleDto_NoodleDtoBuilder_topping_8106951322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5670;
     Object term5698;

    public NoodleDto_NoodleDtoBuilder_topping_8106951322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5710 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term5709 = ((Class) term5710).getDeclaredField((String) "ADD");
        ((Field) term5709).setAccessible(true);
        Object enum20 = ((Field) term5709).get((Object) null);
        Class<? extends Object> term5971 = Class.forName((String) "io.basquiat.interfacebbuljit.noodle.code.AddOrNot");
        Field term5970 = ((Class) term5971).getDeclaredField((String) "NOT");
        ((Field) term5970).setAccessible(true);
        Object enum21 = ((Field) term5970).get((Object) null);
        term5670 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder"));
        Object term5683 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term5670, term5670.getClass(), "noodleName", "MxlszYVzRf");
        setField(term5683, term5683.getClass(), "egg", enum20);
        setField(term5683, term5683.getClass(), "rice", enum20);
        setField(term5683, term5683.getClass(), "garlicFlake", enum21);
        setField(term5683, term5683.getClass(), "peanutButter", enum20);
        setField(term5683, term5683.getClass(), "spicySource", enum20);
        setField(term5670, term5670.getClass(), "topping", term5683);
        term5698 = newInstance(Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping"));
        setField(term5698, term5698.getClass(), "egg", enum20);
        setField(term5698, term5698.getClass(), "rice", enum20);
        setField(term5698, term5698.getClass(), "garlicFlake", enum21);
        setField(term5698, term5698.getClass(), "peanutButter", enum21);
        setField(term5698, term5698.getClass(), "spicySource", enum20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.dto.NoodleDto$NoodleDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.basquiat.interfacebbuljit.noodle.domain.vo.Topping");
        Object[] args = new Object[1];
        args[0] = term5698;
        callMethod(klass, "topping", argTypes, term5670, args);
    }

};


