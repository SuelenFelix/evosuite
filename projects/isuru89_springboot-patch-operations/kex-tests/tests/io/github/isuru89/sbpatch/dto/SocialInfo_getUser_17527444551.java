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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_getUser_17527444551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SocialInfo_getUser_17527444551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3 = new Long(2442117782898005296L);
        Object term55 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term55, term55.getClass(), "email", null);
        Object term56 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term56, term56.getClass(), "email", null);
        Object term57 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term57, term57.getClass(), "email", null);
        Object term58 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term58, term58.getClass(), "email", null);
        Object term59 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term59, term59.getClass(), "email", null);
        ArrayList term53 = new ArrayList();
        ((ArrayList) term53).add(term55);
        ((ArrayList) term53).add(term56);
        ((ArrayList) term53).add(term57);
        ((ArrayList) term53).add(term58);
        ((ArrayList) term53).add(term59);
        Long term62 = new Long(6375119433582206027L);
        Long term64 = new Long(-8257434502486459194L);
        term1 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term2 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2, term2.getClass(), "id", term3);
        setField(term2, term2.getClass(), "userName", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "firstName", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "lastName", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "primaryEmail", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "secondaryEmails", term53);
        setField(term2, term2.getClass(), "createdAt", term62);
        setField(term2, term2.getClass(), "updatedAt", term64);
        setField(term1, term1.getClass(), "user", term2);
        setField(term1, term1.getClass(), "githubProfile", "RMFIsYGgne");
        setField(term1, term1.getClass(), "twitterProfile", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "linkedInProfile", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term1, args);
    }

};


