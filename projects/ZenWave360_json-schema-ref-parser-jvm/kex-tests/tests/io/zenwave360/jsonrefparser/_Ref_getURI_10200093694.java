package io.zenwave360.jsonrefparser;

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
import static io.zenwave360.jsonrefparser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class _Ref_getURI_10200093694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6173;

    public _Ref_getURI_10200093694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6372 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term6371 = ((Class) term6372).getDeclaredField((String) "URL");
        ((Field) term6371).setAccessible(true);
        Object enum14 = ((Field) term6371).get((Object) null);
        term6173 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term6193 = newInstance(Class.forName("java.net.URI"));
        Object term6295 = newInstance(Class.forName("java.net.URI"));
        setField(term6173, term6173.getClass(), "ref", "RkybSrpybU");
        setField(term6173, term6173.getClass(), "refFormat", enum14);
        setField(term6193, term6193.getClass(), "scheme", "ftp");
        setField(term6193, term6193.getClass(), "fragment", null);
        setField(term6193, term6193.getClass(), "authority", "ftp.is.co.za");
        setField(term6193, term6193.getClass(), "userInfo", null);
        setField(term6193, term6193.getClass(), "host", "ftp.is.co.za");
        setIntField(term6193, term6193.getClass(), "port", -1);
        setField(term6193, term6193.getClass(), "path", "/rfc/rfc1808.txt");
        setField(term6193, term6193.getClass(), "query", null);
        setField(term6193, term6193.getClass(), "schemeSpecificPart", null);
        setIntField(term6193, term6193.getClass(), "hash", 0);
        setField(term6193, term6193.getClass(), "decodedUserInfo", null);
        setField(term6193, term6193.getClass(), "decodedAuthority", null);
        setField(term6193, term6193.getClass(), "decodedPath", null);
        setField(term6193, term6193.getClass(), "decodedQuery", null);
        setField(term6193, term6193.getClass(), "decodedFragment", null);
        setField(term6193, term6193.getClass(), "decodedSchemeSpecificPart", null);
        setField(term6193, term6193.getClass(), "string", "ftp://ftp.is.co.za/rfc/rfc1808.txt");
        setField(term6173, term6173.getClass(), "uri", term6193);
        setField(term6173, term6173.getClass(), "path", "xOEqzGAmDU");
        setField(term6295, term6295.getClass(), "scheme", "telnet");
        setField(term6295, term6295.getClass(), "fragment", null);
        setField(term6295, term6295.getClass(), "authority", "192.0.2.16:80");
        setField(term6295, term6295.getClass(), "userInfo", null);
        setField(term6295, term6295.getClass(), "host", "192.0.2.16");
        setIntField(term6295, term6295.getClass(), "port", 80);
        setField(term6295, term6295.getClass(), "path", "/");
        setField(term6295, term6295.getClass(), "query", null);
        setField(term6295, term6295.getClass(), "schemeSpecificPart", null);
        setIntField(term6295, term6295.getClass(), "hash", 0);
        setField(term6295, term6295.getClass(), "decodedUserInfo", null);
        setField(term6295, term6295.getClass(), "decodedAuthority", null);
        setField(term6295, term6295.getClass(), "decodedPath", null);
        setField(term6295, term6295.getClass(), "decodedQuery", null);
        setField(term6295, term6295.getClass(), "decodedFragment", null);
        setField(term6295, term6295.getClass(), "decodedSchemeSpecificPart", null);
        setField(term6295, term6295.getClass(), "string", "telnet://192.0.2.16:80/");
        setField(term6173, term6173.getClass(), "referencingFileURI", term6295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getURI", argTypes, term6173, args);
    }

};


