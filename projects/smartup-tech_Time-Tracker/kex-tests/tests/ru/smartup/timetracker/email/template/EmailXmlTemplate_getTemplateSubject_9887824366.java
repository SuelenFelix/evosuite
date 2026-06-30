package ru.smartup.timetracker.email.template;

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
import static ru.smartup.timetracker.email.template.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EmailXmlTemplate_getTemplateSubject_9887824366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4655;

    public EmailXmlTemplate_getTemplateSubject_9887824366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4655 = newInstance(Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate"));
        setField(term4655, term4655.getClass(), "templateName", null);
        setField(term4655, term4655.getClass(), "templateSubject", null);
        setField(term4655, term4655.getClass(), "templateProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateSubject", argTypes, term4655, args);
    }

};


