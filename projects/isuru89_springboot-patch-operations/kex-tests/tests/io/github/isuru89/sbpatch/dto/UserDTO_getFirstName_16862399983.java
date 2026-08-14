package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserDTO_getFirstName_16862399983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2609;

    public UserDTO_getFirstName_16862399983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2610 = new Long(-7612550318181586304L);
        Object term2662 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2662, term2662.getClass(), "email", "");
        ArrayList term2660 = new ArrayList();
        ((ArrayList) term2660).add(term2662);
        Long term2666 = new Long(-2170847986967241072L);
        Long term2668 = new Long(4044358158040652353L);
        term2609 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2609, term2609.getClass(), "id", term2610);
        setField(term2609, term2609.getClass(), "userName", "smnHEqRFRx");
        setField(term2609, term2609.getClass(), "firstName", "XYtryyobou");
        setField(term2609, term2609.getClass(), "lastName", "OYbzXylRWW");
        setField(term2609, term2609.getClass(), "primaryEmail", "DSNsTGYXDF");
        setField(term2609, term2609.getClass(), "secondaryEmails", term2660);
        setField(term2609, term2609.getClass(), "createdAt", term2666);
        setField(term2609, term2609.getClass(), "updatedAt", term2668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term2609, args);
    }

};


