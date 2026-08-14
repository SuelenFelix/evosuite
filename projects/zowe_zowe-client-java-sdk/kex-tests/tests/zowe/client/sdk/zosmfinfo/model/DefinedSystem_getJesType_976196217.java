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

public class DefinedSystem_getJesType_976196217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2193;

    public DefinedSystem_getJesType_976196217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2193 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem"));
        setField(term2193, term2193.getClass(), "systemNickName", "BKLfkLiZTH");
        setField(term2193, term2193.getClass(), "groupNames", "SPpkrGcPRr");
        setField(term2193, term2193.getClass(), "cpcSerial", "sEccwbJKYE");
        setField(term2193, term2193.getClass(), "zosVR", "AWRooQKkdW");
        setField(term2193, term2193.getClass(), "systemName", "vjxIhXHxGR");
        setField(term2193, term2193.getClass(), "jesType", "QXzGXbEXMu");
        setField(term2193, term2193.getClass(), "sysplexName", "qxSDVejjiY");
        setField(term2193, term2193.getClass(), "jesMemberName", "xBsXSDjXYK");
        setField(term2193, term2193.getClass(), "httpProxyName", "sEnIVFtZuQ");
        setField(term2193, term2193.getClass(), "ftpDestinationName", "ZVecLZMLHF");
        setField(term2193, term2193.getClass(), "url", "fztQhjqwdP");
        setField(term2193, term2193.getClass(), "cpcName", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.model.DefinedSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJesType", argTypes, term2193, args);
    }

};


