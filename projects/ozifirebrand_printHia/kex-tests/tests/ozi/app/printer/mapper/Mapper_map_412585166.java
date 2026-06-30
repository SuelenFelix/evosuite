package ozi.app.printer.mapper;

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
import static ozi.app.printer.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Mapper_map_412585166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public Mapper_map_412585166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1812 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term1811 = ((Class) term1812).getDeclaredField((String) "USER");
        ((Field) term1811).setAccessible(true);
        Object enum5 = ((Field) term1811).get((Object) null);
        term1680 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term1680, term1680.getClass(), "id", "Ghbwtircqb");
        setField(term1680, term1680.getClass(), "firstName", "xrwlQZdwCp");
        setField(term1680, term1680.getClass(), "lastName", "IDCWpPLRkE");
        setField(term1680, term1680.getClass(), "phoneNumber", "nyiiPDVjAc");
        setField(term1680, term1680.getClass(), "email", "aKnKipADSo");
        setField(term1680, term1680.getClass(), "role", enum5);
        setField(term1680, term1680.getClass(), "password", "wSQxaModmm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.mapper.Mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Object[] args = new Object[1];
        args[0] = term1680;
        callMethod(klass, "map", argTypes, null, args);
    }

};


