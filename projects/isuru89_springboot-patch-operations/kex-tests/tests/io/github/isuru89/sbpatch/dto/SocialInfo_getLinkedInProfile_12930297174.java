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

public class SocialInfo_getLinkedInProfile_12930297174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511;

    public SocialInfo_getLinkedInProfile_12930297174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term513 = new Long(6967924379644551255L);
        Object term565 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term565, term565.getClass(), "email", null);
        Object term566 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term566, term566.getClass(), "email", null);
        Object term567 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term567, term567.getClass(), "email", null);
        Object term568 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term568, term568.getClass(), "email", null);
        ArrayList term563 = new ArrayList();
        ((ArrayList) term563).add(term565);
        ((ArrayList) term563).add(term566);
        ((ArrayList) term563).add(term567);
        ((ArrayList) term563).add(term568);
        Long term571 = new Long(-2813493605142626659L);
        Long term573 = new Long(-8885298608300233488L);
        term511 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term512 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term512, term512.getClass(), "id", term513);
        setField(term512, term512.getClass(), "userName", "SbAoxhfrkn");
        setField(term512, term512.getClass(), "firstName", "kuTXqwMtDB");
        setField(term512, term512.getClass(), "lastName", "Ghbwtircqb");
        setField(term512, term512.getClass(), "primaryEmail", "xrwlQZdwCp");
        setField(term512, term512.getClass(), "secondaryEmails", term563);
        setField(term512, term512.getClass(), "createdAt", term571);
        setField(term512, term512.getClass(), "updatedAt", term573);
        setField(term511, term511.getClass(), "user", term512);
        setField(term511, term511.getClass(), "githubProfile", "UlajhuVLaP");
        setField(term511, term511.getClass(), "twitterProfile", "gGSMzuGICf");
        setField(term511, term511.getClass(), "linkedInProfile", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLinkedInProfile", argTypes, term511, args);
    }

};


