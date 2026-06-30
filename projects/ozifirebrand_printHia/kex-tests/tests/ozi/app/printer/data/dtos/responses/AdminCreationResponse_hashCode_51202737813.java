package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class AdminCreationResponse_hashCode_51202737813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24763;

    public AdminCreationResponse_hashCode_51202737813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24862 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term24861 = ((Class) term24862).getDeclaredField((String) "ADMIN");
        ((Field) term24861).setAccessible(true);
        Object enum89 = ((Field) term24861).get((Object) null);
        term24763 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse"));
        setField(term24763, term24763.getClass(), "id", "weddIktxOA");
        setField(term24763, term24763.getClass(), "firstName", "uSlMeISsDD");
        setField(term24763, term24763.getClass(), "lastName", "WdCiTDUKqn");
        setField(term24763, term24763.getClass(), "email", "PSizQDoxxe");
        setField(term24763, term24763.getClass(), "role", enum89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.AdminCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24763, args);
    }

};


