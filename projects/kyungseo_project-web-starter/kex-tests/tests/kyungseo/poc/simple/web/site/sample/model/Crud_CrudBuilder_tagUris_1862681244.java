package kyungseo.poc.simple.web.site.sample.model;

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
import static kyungseo.poc.simple.web.site.sample.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Crud_CrudBuilder_tagUris_1862681244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term718;
     Object term780;

    public Crud_CrudBuilder_tagUris_1862681244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term746 = newInstance(Class.forName("java.net.URI"));
        setField(term746, term746.getClass(), "scheme", "");
        setField(term746, term746.getClass(), "fragment", null);
        setField(term746, term746.getClass(), "authority", "");
        setField(term746, term746.getClass(), "userInfo", null);
        setField(term746, term746.getClass(), "host", "");
        setIntField(term746, term746.getClass(), "port", 80);
        setField(term746, term746.getClass(), "path", "");
        setField(term746, term746.getClass(), "query", null);
        setField(term746, term746.getClass(), "schemeSpecificPart", null);
        setIntField(term746, term746.getClass(), "hash", 0);
        setField(term746, term746.getClass(), "decodedUserInfo", null);
        setField(term746, term746.getClass(), "decodedAuthority", null);
        setField(term746, term746.getClass(), "decodedPath", null);
        setField(term746, term746.getClass(), "decodedQuery", null);
        setField(term746, term746.getClass(), "decodedFragment", null);
        setField(term746, term746.getClass(), "decodedSchemeSpecificPart", null);
        setField(term746, term746.getClass(), "string", "");
        Object term754 = newInstance(Class.forName("java.net.URI"));
        setField(term754, term754.getClass(), "scheme", "");
        setField(term754, term754.getClass(), "fragment", null);
        setField(term754, term754.getClass(), "authority", "");
        setField(term754, term754.getClass(), "userInfo", null);
        setField(term754, term754.getClass(), "host", "");
        setIntField(term754, term754.getClass(), "port", -1);
        setField(term754, term754.getClass(), "path", "");
        setField(term754, term754.getClass(), "query", null);
        setField(term754, term754.getClass(), "schemeSpecificPart", null);
        setIntField(term754, term754.getClass(), "hash", 0);
        setField(term754, term754.getClass(), "decodedUserInfo", null);
        setField(term754, term754.getClass(), "decodedAuthority", null);
        setField(term754, term754.getClass(), "decodedPath", null);
        setField(term754, term754.getClass(), "decodedQuery", null);
        setField(term754, term754.getClass(), "decodedFragment", null);
        setField(term754, term754.getClass(), "decodedSchemeSpecificPart", null);
        setField(term754, term754.getClass(), "string", "");
        Object term762 = newInstance(Class.forName("java.net.URI"));
        setField(term762, term762.getClass(), "scheme", "");
        setField(term762, term762.getClass(), "fragment", null);
        setField(term762, term762.getClass(), "authority", "");
        setField(term762, term762.getClass(), "userInfo", null);
        setField(term762, term762.getClass(), "host", "");
        setIntField(term762, term762.getClass(), "port", 80);
        setField(term762, term762.getClass(), "path", "");
        setField(term762, term762.getClass(), "query", null);
        setField(term762, term762.getClass(), "schemeSpecificPart", null);
        setIntField(term762, term762.getClass(), "hash", 0);
        setField(term762, term762.getClass(), "decodedUserInfo", null);
        setField(term762, term762.getClass(), "decodedAuthority", null);
        setField(term762, term762.getClass(), "decodedPath", null);
        setField(term762, term762.getClass(), "decodedQuery", null);
        setField(term762, term762.getClass(), "decodedFragment", null);
        setField(term762, term762.getClass(), "decodedSchemeSpecificPart", null);
        setField(term762, term762.getClass(), "string", "");
        Object term770 = newInstance(Class.forName("java.net.URI"));
        setField(term770, term770.getClass(), "scheme", "");
        setField(term770, term770.getClass(), "fragment", null);
        setField(term770, term770.getClass(), "authority", "");
        setField(term770, term770.getClass(), "userInfo", null);
        setField(term770, term770.getClass(), "host", "");
        setIntField(term770, term770.getClass(), "port", -1);
        setField(term770, term770.getClass(), "path", "");
        setField(term770, term770.getClass(), "query", null);
        setField(term770, term770.getClass(), "schemeSpecificPart", null);
        setIntField(term770, term770.getClass(), "hash", 0);
        setField(term770, term770.getClass(), "decodedUserInfo", null);
        setField(term770, term770.getClass(), "decodedAuthority", null);
        setField(term770, term770.getClass(), "decodedPath", null);
        setField(term770, term770.getClass(), "decodedQuery", null);
        setField(term770, term770.getClass(), "decodedFragment", null);
        setField(term770, term770.getClass(), "decodedSchemeSpecificPart", null);
        setField(term770, term770.getClass(), "string", "");
        ArrayList term744 = new ArrayList();
        ((ArrayList) term744).add(term746);
        ((ArrayList) term744).add(term754);
        ((ArrayList) term744).add(term762);
        ((ArrayList) term744).add(term770);
        term718 = newInstance(Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder"));
        setLongField(term718, term718.getClass(), "id", 5270370404989704783L);
        setField(term718, term718.getClass(), "title", "flxyYxBRtu");
        setField(term718, term718.getClass(), "body", "OclPbYPkcH");
        setField(term718, term718.getClass(), "tagUris", term744);
        Object term783 = newInstance(Class.forName("java.net.URI"));
        setField(term783, term783.getClass(), "scheme", "telnet");
        setField(term783, term783.getClass(), "fragment", null);
        setField(term783, term783.getClass(), "authority", "192.0.2.16:80");
        setField(term783, term783.getClass(), "userInfo", null);
        setField(term783, term783.getClass(), "host", "192.0.2.16");
        setIntField(term783, term783.getClass(), "port", 80);
        setField(term783, term783.getClass(), "path", "/");
        setField(term783, term783.getClass(), "query", null);
        setField(term783, term783.getClass(), "schemeSpecificPart", null);
        setIntField(term783, term783.getClass(), "hash", 0);
        setField(term783, term783.getClass(), "decodedUserInfo", null);
        setField(term783, term783.getClass(), "decodedAuthority", null);
        setField(term783, term783.getClass(), "decodedPath", null);
        setField(term783, term783.getClass(), "decodedQuery", null);
        setField(term783, term783.getClass(), "decodedFragment", null);
        setField(term783, term783.getClass(), "decodedSchemeSpecificPart", null);
        setField(term783, term783.getClass(), "string", "telnet://192.0.2.16:80/");
        Object term850 = newInstance(Class.forName("java.net.URI"));
        setField(term850, term850.getClass(), "scheme", "");
        setField(term850, term850.getClass(), "fragment", null);
        setField(term850, term850.getClass(), "authority", "");
        setField(term850, term850.getClass(), "userInfo", null);
        setField(term850, term850.getClass(), "host", "");
        setIntField(term850, term850.getClass(), "port", -1);
        setField(term850, term850.getClass(), "path", "");
        setField(term850, term850.getClass(), "query", null);
        setField(term850, term850.getClass(), "schemeSpecificPart", null);
        setIntField(term850, term850.getClass(), "hash", 0);
        setField(term850, term850.getClass(), "decodedUserInfo", null);
        setField(term850, term850.getClass(), "decodedAuthority", null);
        setField(term850, term850.getClass(), "decodedPath", null);
        setField(term850, term850.getClass(), "decodedQuery", null);
        setField(term850, term850.getClass(), "decodedFragment", null);
        setField(term850, term850.getClass(), "decodedSchemeSpecificPart", null);
        setField(term850, term850.getClass(), "string", "");
        Object term859 = newInstance(Class.forName("java.net.URI"));
        setField(term859, term859.getClass(), "scheme", null);
        setField(term859, term859.getClass(), "fragment", null);
        setField(term859, term859.getClass(), "authority", null);
        setField(term859, term859.getClass(), "userInfo", null);
        setField(term859, term859.getClass(), "host", null);
        setIntField(term859, term859.getClass(), "port", -1);
        setField(term859, term859.getClass(), "path", null);
        setField(term859, term859.getClass(), "query", null);
        setField(term859, term859.getClass(), "schemeSpecificPart", null);
        setIntField(term859, term859.getClass(), "hash", 0);
        setField(term859, term859.getClass(), "decodedUserInfo", null);
        setField(term859, term859.getClass(), "decodedAuthority", null);
        setField(term859, term859.getClass(), "decodedPath", null);
        setField(term859, term859.getClass(), "decodedQuery", null);
        setField(term859, term859.getClass(), "decodedFragment", null);
        setField(term859, term859.getClass(), "decodedSchemeSpecificPart", null);
        setField(term859, term859.getClass(), "string", null);
        term780 = new LinkedList();
        ((LinkedList) term780).add(term783);
        ((LinkedList) term780).add(term850);
        ((LinkedList) term780).add(term859);
        ((LinkedList) term780).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.sample.model.Crud$CrudBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term780;
        callMethod(klass, "tagUris", argTypes, term718, args);
    }

};


