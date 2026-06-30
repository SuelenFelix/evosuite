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

public class UserCreationResponse_setFirstName_6098439778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11721;

    public UserCreationResponse_setFirstName_6098439778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11870 = Class.forName((String) "ozi.app.printer.data.models.Role");
        Field term11869 = ((Class) term11870).getDeclaredField((String) "ADMIN");
        ((Field) term11869).setAccessible(true);
        Object enum41 = ((Field) term11869).get((Object) null);
        Class<? extends Object> term12052 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term12051 = ((Class) term12052).getDeclaredField((String) "ORDERED");
        ((Field) term12051).setAccessible(true);
        Object enum42 = ((Field) term12051).get((Object) null);
        Object term11793 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term11799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11800 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term11793, term11793.getClass(), "id", "");
        setField(term11793, term11793.getClass(), "imageUrl", "");
        setDoubleField(term11793, term11793.getClass(), "size", 0.07417792024383196);
        setIntField(term11793, term11793.getClass(), "quantity", -1786399638);
        setDoubleField(term11793, term11793.getClass(), "price", 0.686293604788188);
        setField(term11799, term11799.getClass(), "date", null);
        setField(term11799, term11799.getClass(), "time", null);
        setField(term11793, term11793.getClass(), "orderDate", term11799);
        setField(term11800, term11800.getClass(), "date", null);
        setField(term11800, term11800.getClass(), "time", null);
        setField(term11793, term11793.getClass(), "deliveryDate", term11800);
        setBooleanField(term11793, term11793.getClass(), "ordered", false);
        setField(term11793, term11793.getClass(), "userId", "");
        setField(term11793, term11793.getClass(), "orderStatus", enum42);
        ArrayList term11791 = new ArrayList();
        ((ArrayList) term11791).add(term11793);
        term11721 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse"));
        setField(term11721, term11721.getClass(), "firstName", "vwbEQQNQrx");
        setField(term11721, term11721.getClass(), "lastName", "xtftXXMbem");
        setField(term11721, term11721.getClass(), "username", "cudZvLMQon");
        setField(term11721, term11721.getClass(), "email", "lihXWlGDxk");
        setField(term11721, term11721.getClass(), "id", "JmcmxoGhIK");
        setField(term11721, term11721.getClass(), "role", enum41);
        setField(term11721, term11721.getClass(), "orders", term11791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.UserCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        callMethod(klass, "setFirstName", argTypes, term11721, args);
    }

};


