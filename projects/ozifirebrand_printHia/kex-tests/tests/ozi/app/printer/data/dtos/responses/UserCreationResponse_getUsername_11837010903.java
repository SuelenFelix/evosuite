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
import java.util.ArrayList;

public class UserCreationResponse_getUsername_11837010903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7227;

    public UserCreationResponse_getUsername_11837010903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7363 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term7362 = ((Class) term7363).getDeclaredField((String) "USER");
        ((Field) term7362).setAccessible(true);
        Object enum24 = ((Field) term7362).get((Object) null);
        Class<? extends Object> term7542 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term7541 = ((Class) term7542).getDeclaredField((String) "PENDING");
        ((Field) term7541).setAccessible(true);
        Object enum25 = ((Field) term7541).get((Object) null);
        Object term7298 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term7304 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7305 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term7298, term7298.getClass(), "id", "");
        setField(term7298, term7298.getClass(), "imageUrl", "");
        setDoubleField(term7298, term7298.getClass(), "size", 0.9374115574082594);
        setIntField(term7298, term7298.getClass(), "quantity", 590364439);
        setDoubleField(term7298, term7298.getClass(), "price", 0.8454723071922143);
        setField(term7304, term7304.getClass(), "date", null);
        setField(term7304, term7304.getClass(), "time", null);
        setField(term7298, term7298.getClass(), "orderDate", term7304);
        setField(term7305, term7305.getClass(), "date", null);
        setField(term7305, term7305.getClass(), "time", null);
        setField(term7298, term7298.getClass(), "deliveryDate", term7305);
        setBooleanField(term7298, term7298.getClass(), "ordered", false);
        setField(term7298, term7298.getClass(), "userId", "");
        setField(term7298, term7298.getClass(), "orderStatus", enum25);
        ArrayList term7296 = new ArrayList();
        ((ArrayList) term7296).add(term7298);
        term7227 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term7227, term7227.getClass(), "firstName", "whBvTVIIlC");
        setField(term7227, term7227.getClass(), "lastName", "IgRJUzaCwW");
        setField(term7227, term7227.getClass(), "username", "JUmudUmaaV");
        setField(term7227, term7227.getClass(), "email", "KoyGrUJeJW");
        setField(term7227, term7227.getClass(), "id", "HqBOwkVqjD");
        setField(term7227, term7227.getClass(), "role", enum24);
        setField(term7227, term7227.getClass(), "orders", term7296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term7227, args);
    }

};


