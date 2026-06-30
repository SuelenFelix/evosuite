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

public class AdminCreationRequest_getFirstName_155811167316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3549;

    public AdminCreationRequest_getFirstName_155811167316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3549 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest"));
        setField(term3549, term3549.getClass(), "firstName", null);
        setField(term3549, term3549.getClass(), "lastName", null);
        setField(term3549, term3549.getClass(), "phoneNumber", null);
        setField(term3549, term3549.getClass(), "email", null);
        setField(term3549, term3549.getClass(), "password", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term3549, args);
    }

};


