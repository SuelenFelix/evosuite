package in.cubestack.apps.blog.post.domain;

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
import static in.cubestack.apps.blog.post.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class Post_init_3768881061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29078;
     Object enum72;

    public Post_init_3768881061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29362 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term29361 = ((Class) term29362).getDeclaredField((String) "ACTIVE");
        ((Field) term29361).setAccessible(true);
        Object enum71 = ((Field) term29361).get((Object) null);
        ArrayList term29197 = new ArrayList();
        Long term29201 = new Long(-4776514981294468834L);
        term29078 = newInstance(Class.forName("in.cubestack.apps.blog.core.domain.Person"));
        Object term29203 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29204 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29208 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29218 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29078, term29078.getClass(), "firstName", "BdsLFSRWda");
        setField(term29078, term29078.getClass(), "lastName", "tMhhBYonAI");
        setField(term29078, term29078.getClass(), "email", "AaQRshwIQC");
        setField(term29078, term29078.getClass(), "username", "rHgKCfgCsg");
        setField(term29078, term29078.getClass(), "password", "AWtIUOuutt");
        setField(term29078, term29078.getClass(), "profileImage", "jBgJZpHifl");
        setField(term29078, term29078.getClass(), "status", enum71);
        setField(term29078, term29078.getClass(), "phone", "azMTTmEXnh");
        setField(term29078, term29078.getClass(), "countryCode", "BjJtxwsIpt");
        setField(term29078, term29078.getClass(), "salt", "gUQhOyGfzF");
        setField(term29078, term29078.getClass(), "personRoles", term29197);
        setField(term29078, term29078.getClass(), "id", term29201);
        setIntField(term29204, term29204.getClass(), "year", 2026);
        setShortField(term29204, term29204.getClass(), "month", (short) 2);
        setShortField(term29204, term29204.getClass(), "day", (short) 28);
        setField(term29203, term29203.getClass(), "date", term29204);
        setByteField(term29208, term29208.getClass(), "hour", (byte) 19);
        setByteField(term29208, term29208.getClass(), "minute", (byte) 20);
        setByteField(term29208, term29208.getClass(), "second", (byte) 45);
        setIntField(term29208, term29208.getClass(), "nano", 843222042);
        setField(term29203, term29203.getClass(), "time", term29208);
        setField(term29078, term29078.getClass(), "createdAt", term29203);
        setIntField(term29214, term29214.getClass(), "year", 2012);
        setShortField(term29214, term29214.getClass(), "month", (short) 2);
        setShortField(term29214, term29214.getClass(), "day", (short) 24);
        setField(term29213, term29213.getClass(), "date", term29214);
        setByteField(term29218, term29218.getClass(), "hour", (byte) 7);
        setByteField(term29218, term29218.getClass(), "minute", (byte) 19);
        setByteField(term29218, term29218.getClass(), "second", (byte) 47);
        setIntField(term29218, term29218.getClass(), "nano", 173778376);
        setField(term29213, term29213.getClass(), "time", term29218);
        setField(term29078, term29078.getClass(), "updatedAt", term29213);
        Class<? extends Object> term29692 = Class.forName((String) "in.cubestack.apps.blog.post.domain.PostType");
        Field term29691 = ((Class) term29692).getDeclaredField((String) "SERIES");
        ((Field) term29691).setAccessible(true);
        enum72 = ((Field) term29691).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.post.domain.Post");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.Person");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("in.cubestack.apps.blog.post.domain.PostType");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term29078;
        args[1] = "IqDObvPBZX";
        args[2] = "NITCrIISoC";
        args[3] = "nSzzeexTDI";
        args[4] = "WBrpvMhmsz";
        args[5] = enum72;
        args[6] = "ZzqRHVEXcM";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


