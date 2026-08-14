package zowe.client.sdk.zosfiles.uss.model;

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
import static zowe.client.sdk.zosfiles.uss.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class UnixZfs_init_12489956020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49;
     Object term94;
     Object term96;
     Object term98;
     Object term100;
     Object term102;
     Object term116;
     Object term118;
     Object term120;
     Object term122;
     Object term124;
     Object term126;

    public UnixZfs_init_12489956020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49 = new LinkedList();
        ((LinkedList) term49).add("jJCZpVmanW");
        ((LinkedList) term49).add("EGtDIRbSSb");
        ((LinkedList) term49).add("");
        ((LinkedList) term49).add((Object)null);
        ((LinkedList) term49).add((Object)null);
        term94 = new Long(2442117782898005296L);
        term96 = new Long(6375119433582206027L);
        term98 = new Long(-8257434502486459194L);
        term100 = new Long(-8400487765614892086L);
        term102 = new Long(5270370404989704783L);
        term116 = new Long(7411271909051562686L);
        term118 = new Long(4872422362414183754L);
        term120 = new Long(6811161968424632369L);
        term122 = new Long(-7237588299778557629L);
        term124 = new Long(6967924379644551255L);
        term126 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixZfs");
        Class<?>[] argTypes = new Class<?>[17];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.Long");
        argTypes[7] = Class.forName("java.lang.Long");
        argTypes[8] = Class.forName("java.lang.Long");
        argTypes[9] = Class.forName("java.lang.Long");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.Long");
        argTypes[12] = Class.forName("java.lang.Long");
        argTypes[13] = Class.forName("java.lang.Long");
        argTypes[14] = Class.forName("java.lang.Long");
        argTypes[15] = Class.forName("java.lang.Long");
        argTypes[16] = boolean.class;
        Object[] args = new Object[17];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = "MuLcgQHgqz";
        args[3] = "xxtlPwDYFs";
        args[4] = term49;
        args[5] = term94;
        args[6] = term96;
        args[7] = term98;
        args[8] = term100;
        args[9] = term102;
        args[10] = "RMFIsYGgne";
        args[11] = term116;
        args[12] = term118;
        args[13] = term120;
        args[14] = term122;
        args[15] = term124;
        args[16] = term126;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


