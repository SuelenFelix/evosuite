package ozi.app.printer.services.adminService;

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
import static ozi.app.printer.services.adminService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AdminServicesImpl_validate_12247642802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public AdminServicesImpl_validate_12247642802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest"));
        setField(term112, term112.getClass(), "firstName", "EGtDIRbSSb");
        setField(term112, term112.getClass(), "lastName", "SzjVpOQTyS");
        setField(term112, term112.getClass(), "phoneNumber", "MjGYSRKTNF");
        setField(term112, term112.getClass(), "email", "hRNSzYYIrc");
        setField(term112, term112.getClass(), "password", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.adminService.AdminServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest");
        Object[] args = new Object[1];
        args[0] = term112;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


