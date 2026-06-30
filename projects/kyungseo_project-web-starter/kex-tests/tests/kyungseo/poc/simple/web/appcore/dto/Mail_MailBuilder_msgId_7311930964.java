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

public class Mail_MailBuilder_msgId_7311930964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9541;

    public Mail_MailBuilder_msgId_7311930964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9541 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder"));
        setField(term9541, term9541.getClass(), "to", "nhoHrZfnIN");
        setField(term9541, term9541.getClass(), "title", "ZkMALXpEAZ");
        setField(term9541, term9541.getClass(), "content", "tXfQjSqDzN");
        setField(term9541, term9541.getClass(), "msgId", "BjugTaMcxJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vGiuZVPJNH";
        callMethod(klass, "msgId", argTypes, term9541, args);
    }

};


