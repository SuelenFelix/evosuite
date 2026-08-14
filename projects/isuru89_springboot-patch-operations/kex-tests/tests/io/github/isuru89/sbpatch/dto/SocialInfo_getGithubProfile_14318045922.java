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

public class SocialInfo_getGithubProfile_14318045922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172;

    public SocialInfo_getGithubProfile_14318045922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term174 = new Long(-8400487765614892086L);
        Object term226 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term226, term226.getClass(), "email", null);
        Object term227 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term227, term227.getClass(), "email", null);
        Object term228 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term228, term228.getClass(), "email", null);
        Object term229 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term229, term229.getClass(), "email", null);
        ArrayList term224 = new ArrayList();
        ((ArrayList) term224).add(term226);
        ((ArrayList) term224).add(term227);
        ((ArrayList) term224).add(term228);
        ((ArrayList) term224).add(term229);
        Long term232 = new Long(5270370404989704783L);
        Long term234 = new Long(7411271909051562686L);
        term172 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term173 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term173, term173.getClass(), "id", term174);
        setField(term173, term173.getClass(), "userName", "MxlszYVzRf");
        setField(term173, term173.getClass(), "firstName", "LQFpaHEwXR");
        setField(term173, term173.getClass(), "lastName", "oVcInYnLWB");
        setField(term173, term173.getClass(), "primaryEmail", "aJlieCFVtF");
        setField(term173, term173.getClass(), "secondaryEmails", term224);
        setField(term173, term173.getClass(), "createdAt", term232);
        setField(term173, term173.getClass(), "updatedAt", term234);
        setField(term172, term172.getClass(), "user", term173);
        setField(term172, term172.getClass(), "githubProfile", "hNxWaHcfhY");
        setField(term172, term172.getClass(), "twitterProfile", "RkybSrpybU");
        setField(term172, term172.getClass(), "linkedInProfile", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGithubProfile", argTypes, term172, args);
    }

};


