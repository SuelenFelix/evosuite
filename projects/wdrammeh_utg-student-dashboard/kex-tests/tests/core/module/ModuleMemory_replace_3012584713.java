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

public class ModuleMemory_replace_3012584713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52326;
     Object term52463;

    public ModuleMemory_replace_3012584713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52326 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term52326, term52326.getClass(), "score", 0.11493000848982304);
        setField(term52326, term52326.getClass(), "code", "BDIRCxAWLA");
        setField(term52326, term52326.getClass(), "name", "eOJfbiZLnb");
        setField(term52326, term52326.getClass(), "year", "nKZKnxWYCK");
        setField(term52326, term52326.getClass(), "semester", "JOqQxuzRuZ");
        setField(term52326, term52326.getClass(), "lecturer", "RSaoipUlsg");
        setBooleanField(term52326, term52326.getClass(), "isLecturerEditable", true);
        setField(term52326, term52326.getClass(), "campus", "cSHGbqKqlN");
        setField(term52326, term52326.getClass(), "room", "pFAfANnxup");
        setField(term52326, term52326.getClass(), "day", "FbSIUZyBXZ");
        setField(term52326, term52326.getClass(), "time", "mhQDwIyrRi");
        setField(term52326, term52326.getClass(), "requirement", "HpZXWDPhlg");
        setIntField(term52326, term52326.getClass(), "creditHours", -123338791);
        setBooleanField(term52326, term52326.getClass(), "isConfirmed", true);
        setField(term52326, term52326.getClass(), "status", "lBOokzEPfe");
        term52463 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term52463, term52463.getClass(), "score", 0.37161417339133307);
        setField(term52463, term52463.getClass(), "code", "dtGZCsKXbW");
        setField(term52463, term52463.getClass(), "name", "bdyhHbDAmJ");
        setField(term52463, term52463.getClass(), "year", "BBXiTNHqGE");
        setField(term52463, term52463.getClass(), "semester", "IEYhJmgCVd");
        setField(term52463, term52463.getClass(), "lecturer", "KSJeYkkvpk");
        setBooleanField(term52463, term52463.getClass(), "isLecturerEditable", false);
        setField(term52463, term52463.getClass(), "campus", "qUtkFGMNUV");
        setField(term52463, term52463.getClass(), "room", "mGRiYhnMcR");
        setField(term52463, term52463.getClass(), "day", "NFlvfJCVPO");
        setField(term52463, term52463.getClass(), "time", "KarbTXFmUU");
        setField(term52463, term52463.getClass(), "requirement", "jiUSjqwSIQ");
        setIntField(term52463, term52463.getClass(), "creditHours", -1467089634);
        setBooleanField(term52463, term52463.getClass(), "isConfirmed", true);
        setField(term52463, term52463.getClass(), "status", "MgLCedQfoj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleMemory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("core.module.Course");
        argTypes[1] = Class.forName("core.module.Course");
        Object[] args = new Object[2];
        args[0] = term52326;
        args[1] = term52463;
        callMethod(klass, "replace", argTypes, null, args);
    }

};


