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

public class Mail_MailBuilder_toString_199029996713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9835;

    public Mail_MailBuilder_toString_199029996713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9835 = newInstance(Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder"));
        setField(term9835, term9835.getClass(), "to", null);
        setField(term9835, term9835.getClass(), "title", null);
        setField(term9835, term9835.getClass(), "content", null);
        setField(term9835, term9835.getClass(), "msgId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("kyungseo.poc.simple.web.appcore.dto.Mail$MailBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9835, args);
    }

};


