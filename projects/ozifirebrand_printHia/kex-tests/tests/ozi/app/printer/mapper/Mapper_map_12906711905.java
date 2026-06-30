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

public class Mapper_map_12906711905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1569;

    public Mapper_map_12906711905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1569 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest"));
        setField(term1569, term1569.getClass(), "firstName", "OWDIEULEFu");
        setField(term1569, term1569.getClass(), "lastName", "dWRymuLBtr");
        setField(term1569, term1569.getClass(), "phoneNumber", "AijpHYOFuy");
        setField(term1569, term1569.getClass(), "email", "SbAoxhfrkn");
        setField(term1569, term1569.getClass(), "password", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.mapper.Mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.AdminCreationRequest");
        Object[] args = new Object[1];
        args[0] = term1569;
        callMethod(klass, "map", argTypes, null, args);
    }

};


