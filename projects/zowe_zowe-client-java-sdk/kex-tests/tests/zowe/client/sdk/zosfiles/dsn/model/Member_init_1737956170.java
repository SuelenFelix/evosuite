package zowe.client.sdk.zosfiles.dsn.model;

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
import static zowe.client.sdk.zosfiles.dsn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Member_init_1737956170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term15;
     Object term41;
     Object term43;
     Object term45;

    public Member_init_1737956170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new Long(2442117782898005296L);
        term15 = new Long(6375119433582206027L);
        term41 = new Long(-8257434502486459194L);
        term43 = new Long(-8400487765614892086L);
        term45 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Member");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.Long");
        argTypes[7] = Class.forName("java.lang.Long");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        Object[] args = new Object[12];
        args[0] = "PAEBtnZtTD";
        args[1] = term13;
        args[2] = term15;
        args[3] = "sjlJAEtRrb";
        args[4] = "MuLcgQHgqz";
        args[5] = term41;
        args[6] = term43;
        args[7] = term45;
        args[8] = "xxtlPwDYFs";
        args[9] = "jJCZpVmanW";
        args[10] = "EGtDIRbSSb";
        args[11] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


