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

public class Mail_MailBuilder_to_20710299611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9208;

    public Mail_MailBuilder_to_20710299611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9208 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder"));
        setField(term9208, term9208.getClass(), "to", "JppkknKVOw");
        setField(term9208, term9208.getClass(), "title", "iljANwuEjk");
        setField(term9208, term9208.getClass(), "content", "kNqaJKIATy");
        setField(term9208, term9208.getClass(), "msgId", "vKQukfbJUd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lFRJFUMVbx";
        callMethod(klass, "to", argTypes, term9208, args);
    }

};


