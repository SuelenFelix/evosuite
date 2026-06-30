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

public class EmailXmlTemplate_getTemplateProperties_15895889307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4656;

    public EmailXmlTemplate_getTemplateProperties_15895889307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4656 = newInstance(Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate"));
        setField(term4656, term4656.getClass(), "templateName", null);
        setField(term4656, term4656.getClass(), "templateSubject", null);
        setField(term4656, term4656.getClass(), "templateProperties", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateProperties", argTypes, term4656, args);
    }

};


