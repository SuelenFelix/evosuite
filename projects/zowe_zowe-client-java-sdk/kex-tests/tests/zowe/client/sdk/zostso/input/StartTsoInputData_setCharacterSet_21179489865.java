package zowe.client.sdk.zostso.input;

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
import static zowe.client.sdk.zostso.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartTsoInputData_setCharacterSet_21179489865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642;

    public StartTsoInputData_setCharacterSet_21179489865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642 = newInstance(Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData"));
        setField(term642, term642.getClass(), "account", "TEParAifyi");
        setField(term642, term642.getClass(), "characterSet", "OWDIEULEFu");
        setField(term642, term642.getClass(), "codePage", "dWRymuLBtr");
        setField(term642, term642.getClass(), "columns", "AijpHYOFuy");
        setField(term642, term642.getClass(), "logonProcedure", "SbAoxhfrkn");
        setField(term642, term642.getClass(), "regionSize", "kuTXqwMtDB");
        setField(term642, term642.getClass(), "rows", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zostso.input.StartTsoInputData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xrwlQZdwCp";
        callMethod(klass, "setCharacterSet", argTypes, term642, args);
    }

};


