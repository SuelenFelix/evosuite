package zowe.client.sdk.zosfiles.uss.input;

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
import static zowe.client.sdk.zosfiles.uss.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class UssListInputData_Builder_name_5078182797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43091;

    public UssListInputData_Builder_name_5078182797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term43104 = new Integer(-1530420153);
        Integer term43142 = new Integer(-469968304);
        Class<? extends Object> term43258 = Class.forName((String) "zowe.client.sdk.zosfiles.uss.types.ListFilterType");
        Field term43257 = ((Class) term43258).getDeclaredField((String) "SOCKET");
        ((Field) term43257).setAccessible(true);
        Object enum132 = ((Field) term43257).get((Object) null);
        Integer term43181 = new Integer(-1145578966);
        term43091 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder"));
        setField(term43091, term43091.getClass(), "path", "WZzvmIHhzZ");
        setField(term43091, term43091.getClass(), "maxLength", term43104);
        setField(term43091, term43091.getClass(), "group", "doQLHkjpNm");
        setField(term43091, term43091.getClass(), "user", "lCyLIcSuom");
        setField(term43091, term43091.getClass(), "mtime", "CGOpQSZZwI");
        setField(term43091, term43091.getClass(), "size", term43142);
        setField(term43091, term43091.getClass(), "name", "ypEdrstygY");
        setField(term43091, term43091.getClass(), "perm", "sNQFlATEeQ");
        setField(term43091, term43091.getClass(), "type", enum132);
        setField(term43091, term43091.getClass(), "depth", term43181);
        setBooleanField(term43091, term43091.getClass(), "filesys", false);
        setBooleanField(term43091, term43091.getClass(), "symlinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.input.UssListInputData$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZKMLioamsY";
        callMethod(klass, "name", argTypes, term43091, args);
    }

};


