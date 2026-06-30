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

public class SummerHandler_SummerModuleEditor_init_9468828910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124981;

    public SummerHandler_SummerModuleEditor_init_9468828910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124981 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term124981, term124981.getClass(), "score", 0.3202192021706908);
        setField(term124981, term124981.getClass(), "code", "QVLresHoaP");
        setField(term124981, term124981.getClass(), "name", "IbxeAMwLVt");
        setField(term124981, term124981.getClass(), "year", "bShlAqoTmZ");
        setField(term124981, term124981.getClass(), "semester", "nOKlKlNhtU");
        setField(term124981, term124981.getClass(), "lecturer", "gXFNBHJSey");
        setBooleanField(term124981, term124981.getClass(), "isLecturerEditable", false);
        setField(term124981, term124981.getClass(), "campus", "wUcSfItZgv");
        setField(term124981, term124981.getClass(), "room", "rOfPCPHmtJ");
        setField(term124981, term124981.getClass(), "day", "EnmiAvfpJv");
        setField(term124981, term124981.getClass(), "time", "AdYzLPMcwe");
        setField(term124981, term124981.getClass(), "requirement", "FrTZLybkKk");
        setIntField(term124981, term124981.getClass(), "creditHours", 1280322790);
        setBooleanField(term124981, term124981.getClass(), "isConfirmed", false);
        setField(term124981, term124981.getClass(), "status", "FlxVmiMYKP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$SummerModuleEditor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = term124981;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


