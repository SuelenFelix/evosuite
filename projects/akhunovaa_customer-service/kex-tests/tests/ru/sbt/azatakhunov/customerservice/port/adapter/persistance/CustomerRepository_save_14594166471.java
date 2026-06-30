package ru.sbt.azatakhunov.customerservice.port.adapter.persistance;

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
import static ru.sbt.azatakhunov.customerservice.port.adapter.persistance.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class CustomerRepository_save_14594166471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public CustomerRepository_save_14594166471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository"));
        ArrayList term63 = new ArrayList();
        ((ArrayList) term63).add((Object)null);
        ((ArrayList) term63).add((Object)null);
        ((ArrayList) term63).add((Object)null);
        ((ArrayList) term63).add((Object)null);
        ((ArrayList) term63).add((Object)null);
        HashMap term67 = new HashMap();
        term2 = newInstance(Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo"));
        setField(term2, term2.getClass(), "id", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "pw", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "name", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "address", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "registeredDay", "jJCZpVmanW");
        setField(term2, term2.getClass(), "eventList", term63);
        setField(term2, term2.getClass(), "methodMap", term67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.sbt.azatakhunov.customerservice.port.adapter.persistance.CustomerRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.sbt.azatakhunov.customerservice.domain.CustomerInfo");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "save", argTypes, term1, args);
    }

};


