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

public class SocialInfo_getTwitterProfile_10609632763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;

    public SocialInfo_getTwitterProfile_10609632763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term344 = new Long(4872422362414183754L);
        Object term396 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term396, term396.getClass(), "email", null);
        Object term397 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term397, term397.getClass(), "email", null);
        Object term398 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term398, term398.getClass(), "email", null);
        ArrayList term394 = new ArrayList();
        ((ArrayList) term394).add(term396);
        ((ArrayList) term394).add(term397);
        ((ArrayList) term394).add(term398);
        Long term401 = new Long(6811161968424632369L);
        Long term403 = new Long(-7237588299778557629L);
        term342 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term343 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term343, term343.getClass(), "id", term344);
        setField(term343, term343.getClass(), "userName", "eZFUvlxvGV");
        setField(term343, term343.getClass(), "firstName", "BYqFIqCKAV");
        setField(term343, term343.getClass(), "lastName", "vrQLuWIDJX");
        setField(term343, term343.getClass(), "primaryEmail", "flxyYxBRtu");
        setField(term343, term343.getClass(), "secondaryEmails", term394);
        setField(term343, term343.getClass(), "createdAt", term401);
        setField(term343, term343.getClass(), "updatedAt", term403);
        setField(term342, term342.getClass(), "user", term343);
        setField(term342, term342.getClass(), "githubProfile", "OWDIEULEFu");
        setField(term342, term342.getClass(), "twitterProfile", "dWRymuLBtr");
        setField(term342, term342.getClass(), "linkedInProfile", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTwitterProfile", argTypes, term342, args);
    }

};


