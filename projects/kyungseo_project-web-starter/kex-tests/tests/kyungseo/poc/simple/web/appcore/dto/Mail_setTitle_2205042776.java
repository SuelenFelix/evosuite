package kyungseo.poc.simple.web.appcore.dto;

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
import static kyungseo.poc.simple.web.appcore.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mail_setTitle_2205042776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1483;

    public Mail_setTitle_2205042776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1483 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail"));
        setField(term1483, term1483.getClass(), "to", "kBdSllIBVz");
        setField(term1483, term1483.getClass(), "title", "TJmVBGfTML");
        setField(term1483, term1483.getClass(), "content", "tPlsykYBqO");
        setField(term1483, term1483.getClass(), "msgId", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        callMethod(klass, "setTitle", argTypes, term1483, args);
    }

};


