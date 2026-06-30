package com.alkemy.ong.application.service.user;

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
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class CreateUserUseCaseService_add_20561523430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551;
     Object term552;

    public CreateUserUseCaseService_add_20561523430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551 = newInstance(Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService"));
        setField(term551, term551.getClass(), "userRepository", null);
        setField(term551, term551.getClass(), "roleRepository", null);
        setField(term551, term551.getClass(), "organizationRepository", null);
        setField(term551, term551.getClass(), "mailSender", null);
        Long term553 = new Long(4872422362414183754L);
        Long term616 = new Long(6811161968424632369L);
        term552 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term615 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term552, term552.getClass(), "id", term553);
        setField(term552, term552.getClass(), "firstName", "BYqFIqCKAV");
        setField(term552, term552.getClass(), "lastName", "vrQLuWIDJX");
        setField(term552, term552.getClass(), "email", "flxyYxBRtu");
        setField(term552, term552.getClass(), "password", "OclPbYPkcH");
        setField(term552, term552.getClass(), "imageUrl", "IoAlmYsBwc");
        setField(term615, term615.getClass(), "id", term616);
        setField(term615, term615.getClass(), "name", "TEParAifyi");
        setField(term615, term615.getClass(), "description", "OWDIEULEFu");
        setField(term552, term552.getClass(), "role", term615);
        setField(term552, term552.getClass(), "token", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term552;
        callMethod(klass, "add", argTypes, term551, args);
    }

};


