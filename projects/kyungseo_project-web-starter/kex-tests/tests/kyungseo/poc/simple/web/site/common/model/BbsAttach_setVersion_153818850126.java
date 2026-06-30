package kyungseo.poc.simple.web.site.common.model;

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
import static kyungseo.poc.simple.web.site.common.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BbsAttach_setVersion_153818850126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9090;

    public BbsAttach_setVersion_153818850126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9090 = newInstance(Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach"));
        setField(term9090, term9090.getClass(), "bbsId", "uXYcXVYJZM");
        setField(term9090, term9090.getClass(), "docNumber", "BJhjdJUhkz");
        setField(term9090, term9090.getClass(), "attSeqno", "cdHYQDgUZR");
        setField(term9090, term9090.getClass(), "fileid", "KAORSSPSeV");
        setField(term9090, term9090.getClass(), "logicalfilename", "UimMMORkzd");
        setField(term9090, term9090.getClass(), "physicalfilename", "huVIXUWLtI");
        setField(term9090, term9090.getClass(), "filepath", "vhKzFyKPOT");
        setField(term9090, term9090.getClass(), "filesize", "nQhIgWXdRc");
        setField(term9090, term9090.getClass(), "createdby", "EusenEbIoF");
        setField(term9090, term9090.getClass(), "createdate", "SScVQYSvWH");
        setField(term9090, term9090.getClass(), "modifiedby", "MnovcqFhCl");
        setField(term9090, term9090.getClass(), "modifydate", "qYtAeLzOhW");
        setField(term9090, term9090.getClass(), "version", "tJzmOfcUnY");
        setField(term9090, term9090.getClass(), "fileurl", "TKlccZUpjz");
        setField(term9090, term9090.getClass(), "ext", "GGzwMoHZXC");
        setField(term9090, term9090.getClass(), "attFilepath", "IpmgwHTgnG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.site.common.model.BbsAttach");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tIpkeYIezR";
        callMethod(klass, "setVersion", argTypes, term9090, args);
    }

};


