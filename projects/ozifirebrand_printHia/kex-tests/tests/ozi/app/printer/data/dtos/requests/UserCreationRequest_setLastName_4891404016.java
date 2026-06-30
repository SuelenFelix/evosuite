package ozi.app.printer.data.dtos.requests;

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
import static ozi.app.printer.data.dtos.requests.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCreationRequest_setLastName_4891404016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1180;

    public UserCreationRequest_setLastName_4891404016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1180 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest"));
        setField(term1180, term1180.getClass(), "firstName", "LvtrsXUliU");
        setField(term1180, term1180.getClass(), "lastName", "xLbjWUgOIL");
        setField(term1180, term1180.getClass(), "password", "jDtqGUpnZN");
        setField(term1180, term1180.getClass(), "email", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.UserCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setLastName", argTypes, term1180, args);
    }

};


