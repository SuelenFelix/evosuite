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
import java.util.HashMap;

public class EmailXmlTemplate_getTemplateName_4764203171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4489;

    public EmailXmlTemplate_getTemplateName_4764203171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4514 = new HashMap();
        term4489 = newInstance(Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate"));
        setField(term4489, term4489.getClass(), "templateName", "AijpHYOFuy");
        setField(term4489, term4489.getClass(), "templateSubject", "SbAoxhfrkn");
        setField(term4489, term4489.getClass(), "templateProperties", term4514);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.EmailXmlTemplate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemplateName", argTypes, term4489, args);
    }

};


