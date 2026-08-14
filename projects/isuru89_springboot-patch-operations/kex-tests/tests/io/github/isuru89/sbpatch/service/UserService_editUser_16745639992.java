package io.github.isuru89.sbpatch.service;

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
import static io.github.isuru89.sbpatch.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserService_editUser_16745639992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;

    public UserService_editUser_16745639992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term113 = new Long(5270370404989704783L);
        Object term165 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term165, term165.getClass(), "email", "");
        Object term167 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term167, term167.getClass(), "email", "");
        Object term169 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term169, term169.getClass(), "email", "");
        Object term171 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term171, term171.getClass(), "email", "");
        ArrayList term163 = new ArrayList();
        ((ArrayList) term163).add(term165);
        ((ArrayList) term163).add(term167);
        ((ArrayList) term163).add(term169);
        ((ArrayList) term163).add(term171);
        Long term175 = new Long(7411271909051562686L);
        Long term177 = new Long(4872422362414183754L);
        term112 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term112, term112.getClass(), "id", term113);
        setField(term112, term112.getClass(), "userName", "RMFIsYGgne");
        setField(term112, term112.getClass(), "firstName", "NRdvgJlhkX");
        setField(term112, term112.getClass(), "lastName", "uuaPigETmJ");
        setField(term112, term112.getClass(), "primaryEmail", "MxlszYVzRf");
        setField(term112, term112.getClass(), "secondaryEmails", term163);
        setField(term112, term112.getClass(), "createdAt", term175);
        setField(term112, term112.getClass(), "updatedAt", term177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.service.UserService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Object[] args = new Object[1];
        args[0] = term112;
        callMethod(klass, "editUser", argTypes, null, args);
    }

};


