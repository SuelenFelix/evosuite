package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PrintAdmin_hashCode_37893148417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22901;

    public PrintAdmin_hashCode_37893148417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23034 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term23033 = ((Class) term23034).getDeclaredField((String) "ADMIN");
        ((Field) term23033).setAccessible(true);
        Object enum81 = ((Field) term23033).get((Object) null);
        term22901 = newInstance(Class.forName("ozi.app.printer.data.models.PrintAdmin"));
        setField(term22901, term22901.getClass(), "id", "pXxkiXgQnq");
        setField(term22901, term22901.getClass(), "firstName", "tKmrUDURku");
        setField(term22901, term22901.getClass(), "lastName", "JeZbrwZmsP");
        setField(term22901, term22901.getClass(), "phoneNumber", "bxyfeicqrK");
        setField(term22901, term22901.getClass(), "email", "vBnWPlsZMk");
        setField(term22901, term22901.getClass(), "role", enum81);
        setField(term22901, term22901.getClass(), "password", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintAdmin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term22901, args);
    }

};


