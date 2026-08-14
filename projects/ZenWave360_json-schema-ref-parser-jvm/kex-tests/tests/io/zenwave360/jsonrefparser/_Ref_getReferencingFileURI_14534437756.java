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

public class _Ref_getReferencingFileURI_14534437756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7331;

    public _Ref_getReferencingFileURI_14534437756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7530 = Class.forName((String) "io.zenwave360.jsonrefparser.resolver.RefFormat");
        Field term7529 = ((Class) term7530).getDeclaredField((String) "CLASSPATH");
        ((Field) term7529).setAccessible(true);
        Object enum16 = ((Field) term7529).get((Object) null);
        term7331 = newInstance(Class.forName("io.zenwave360.jsonrefparser.$Ref"));
        Object term7357 = newInstance(Class.forName("java.net.URI"));
        Object term7444 = newInstance(Class.forName("java.net.URI"));
        setField(term7331, term7331.getClass(), "ref", "vrQLuWIDJX");
        setField(term7331, term7331.getClass(), "refFormat", enum16);
        setField(term7357, term7357.getClass(), "scheme", "http");
        setField(term7357, term7357.getClass(), "fragment", null);
        setField(term7357, term7357.getClass(), "authority", "www.wikipedia.org");
        setField(term7357, term7357.getClass(), "userInfo", null);
        setField(term7357, term7357.getClass(), "host", "www.wikipedia.org");
        setIntField(term7357, term7357.getClass(), "port", -1);
        setField(term7357, term7357.getClass(), "path", "");
        setField(term7357, term7357.getClass(), "query", null);
        setField(term7357, term7357.getClass(), "schemeSpecificPart", null);
        setIntField(term7357, term7357.getClass(), "hash", 0);
        setField(term7357, term7357.getClass(), "decodedUserInfo", null);
        setField(term7357, term7357.getClass(), "decodedAuthority", null);
        setField(term7357, term7357.getClass(), "decodedPath", null);
        setField(term7357, term7357.getClass(), "decodedQuery", null);
        setField(term7357, term7357.getClass(), "decodedFragment", null);
        setField(term7357, term7357.getClass(), "decodedSchemeSpecificPart", null);
        setField(term7357, term7357.getClass(), "string", "http://www.wikipedia.org");
        setField(term7331, term7331.getClass(), "uri", term7357);
        setField(term7331, term7331.getClass(), "path", "flxyYxBRtu");
        setField(term7444, term7444.getClass(), "scheme", "http");
        setField(term7444, term7444.getClass(), "fragment", null);
        setField(term7444, term7444.getClass(), "authority", "www.wikipedia.org");
        setField(term7444, term7444.getClass(), "userInfo", null);
        setField(term7444, term7444.getClass(), "host", "www.wikipedia.org");
        setIntField(term7444, term7444.getClass(), "port", -1);
        setField(term7444, term7444.getClass(), "path", "");
        setField(term7444, term7444.getClass(), "query", null);
        setField(term7444, term7444.getClass(), "schemeSpecificPart", null);
        setIntField(term7444, term7444.getClass(), "hash", 0);
        setField(term7444, term7444.getClass(), "decodedUserInfo", null);
        setField(term7444, term7444.getClass(), "decodedAuthority", null);
        setField(term7444, term7444.getClass(), "decodedPath", null);
        setField(term7444, term7444.getClass(), "decodedQuery", null);
        setField(term7444, term7444.getClass(), "decodedFragment", null);
        setField(term7444, term7444.getClass(), "decodedSchemeSpecificPart", null);
        setField(term7444, term7444.getClass(), "string", "http://www.wikipedia.org");
        setField(term7331, term7331.getClass(), "referencingFileURI", term7444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.zenwave360.jsonrefparser.$Ref");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReferencingFileURI", argTypes, term7331, args);
    }

};


