package zowe.client.sdk.zosmfinfo.model;

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
import static zowe.client.sdk.zosmfinfo.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefinedSystem_getCpcName_3467576841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603;

    public DefinedSystem_getCpcName_3467576841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term603 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term603, term603.getClass(), "systemNickName", "OclPbYPkcH");
        setField(term603, term603.getClass(), "groupNames", "IoAlmYsBwc");
        setField(term603, term603.getClass(), "cpcSerial", "TEParAifyi");
        setField(term603, term603.getClass(), "zosVR", "OWDIEULEFu");
        setField(term603, term603.getClass(), "systemName", "dWRymuLBtr");
        setField(term603, term603.getClass(), "jesType", "AijpHYOFuy");
        setField(term603, term603.getClass(), "sysplexName", "SbAoxhfrkn");
        setField(term603, term603.getClass(), "jesMemberName", "kuTXqwMtDB");
        setField(term603, term603.getClass(), "httpProxyName", "Ghbwtircqb");
        setField(term603, term603.getClass(), "ftpDestinationName", "xrwlQZdwCp");
        setField(term603, term603.getClass(), "url", "IDCWpPLRkE");
        setField(term603, term603.getClass(), "cpcName", "nyiiPDVjAc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpcName", argTypes, term603, args);
    }

};


