package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MiscHandler_MiscModuleEditor_init_16241741390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356889;

    public MiscHandler_MiscModuleEditor_init_16241741390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356889 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term356889, term356889.getClass(), "score", 0.37161417339133307);
        setField(term356889, term356889.getClass(), "code", "IERziToRSQ");
        setField(term356889, term356889.getClass(), "name", "mDTRMwjBpc");
        setField(term356889, term356889.getClass(), "year", "sCLAuKoiVL");
        setField(term356889, term356889.getClass(), "semester", "pFWiDEnVnU");
        setField(term356889, term356889.getClass(), "lecturer", "NeEetzFhTt");
        setBooleanField(term356889, term356889.getClass(), "isLecturerEditable", true);
        setField(term356889, term356889.getClass(), "campus", "UgvuvUxKed");
        setField(term356889, term356889.getClass(), "room", "ljBBMsQpaM");
        setField(term356889, term356889.getClass(), "day", "hHNIOlOzJc");
        setField(term356889, term356889.getClass(), "time", "ALRSeULyWV");
        setField(term356889, term356889.getClass(), "requirement", "WVhzXHdyFF");
        setIntField(term356889, term356889.getClass(), "creditHours", -2026593848);
        setBooleanField(term356889, term356889.getClass(), "isConfirmed", true);
        setField(term356889, term356889.getClass(), "status", "GLAWYoxkyw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term356889;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


