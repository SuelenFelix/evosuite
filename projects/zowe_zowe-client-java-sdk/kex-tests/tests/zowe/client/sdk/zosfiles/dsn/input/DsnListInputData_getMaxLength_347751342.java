package zowe.client.sdk.zosfiles.dsn.input;

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
import static zowe.client.sdk.zosfiles.dsn.input.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DsnListInputData_getMaxLength_347751342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23082;

    public DsnListInputData_getMaxLength_347751342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23176 = Class.forName((String) "zowe.client.sdk.zosfiles.dsn.types.AttributeType");
        Field term23175 = ((Class) term23176).getDeclaredField((String) "MEMBER");
        ((Field) term23175).setAccessible(true);
        Object enum22 = ((Field) term23175).get((Object) null);
        term23082 = newInstance(Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData"));
        setField(term23082, term23082.getClass(), "volume", "dWVwcwFGNo");
        setField(term23082, term23082.getClass(), "attribute", enum22);
        setField(term23082, term23082.getClass(), "maxLength", "PNdLRrSAIY");
        setField(term23082, term23082.getClass(), "start", "nJnRIRiLZK");
        setField(term23082, term23082.getClass(), "recall", "eWnrMSbYbT");
        setField(term23082, term23082.getClass(), "pattern", "AjoFvDFyCY");
        setField(term23082, term23082.getClass(), "responseTimeout", "OFTJwdPiTG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.dsn.input.DsnListInputData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLength", argTypes, term23082, args);
    }

};


