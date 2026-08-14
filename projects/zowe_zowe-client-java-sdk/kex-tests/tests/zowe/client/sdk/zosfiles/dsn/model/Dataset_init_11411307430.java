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

public class Dataset_init_11411307430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Dataset_init_11411307430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.model.Dataset");
        Class<?>[] argTypes = new Class<?>[19];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = Class.forName("java.lang.String");
        argTypes[16] = Class.forName("java.lang.String");
        argTypes[17] = Class.forName("java.lang.String");
        argTypes[18] = Class.forName("java.lang.String");
        Object[] args = new Object[19];
        args[0] = "XPKmummaqg";
        args[1] = "BKLfkLiZTH";
        args[2] = "SPpkrGcPRr";
        args[3] = "sEccwbJKYE";
        args[4] = "AWRooQKkdW";
        args[5] = "vjxIhXHxGR";
        args[6] = "QXzGXbEXMu";
        args[7] = "qxSDVejjiY";
        args[8] = "xBsXSDjXYK";
        args[9] = "sEnIVFtZuQ";
        args[10] = "ZVecLZMLHF";
        args[11] = "fztQhjqwdP";
        args[12] = "eVpkWxjuki";
        args[13] = "SJiQaLvSKv";
        args[14] = "OEXDRUKcFl";
        args[15] = "RYdKCNNMBR";
        args[16] = "yGtHPyvYiQ";
        args[17] = "MvRIxilFMJ";
        args[18] = "iNwOJRBEjp";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


