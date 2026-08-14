package com.pfa.app.controller.web.manager;

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
import static com.pfa.app.controller.web.manager.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ManagerController_init_17290533310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public ManagerController_init_17290533310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.pfa.app.controller.web.manager.ManagerController");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.pfa.app.service.EmployeeService");
        argTypes[1] = Class.forName("com.pfa.app.service.CredentialService");
        argTypes[2] = Class.forName("com.pfa.app.service.AssignmentService");
        argTypes[3] = Class.forName("com.pfa.app.service.ProjectService");
        argTypes[4] = Class.forName("com.pfa.app.util.email.EmailUtil");
        argTypes[5] = Class.forName("com.pfa.app.util.sms.SmsUtil");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


