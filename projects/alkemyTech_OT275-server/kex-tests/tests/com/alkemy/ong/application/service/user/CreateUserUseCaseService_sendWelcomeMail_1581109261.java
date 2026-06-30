package com.alkemy.ong.application.service.user;

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
import static com.alkemy.ong.application.service.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class CreateUserUseCaseService_sendWelcomeMail_1581109261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term735;

    public CreateUserUseCaseService_sendWelcomeMail_1581109261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734 = newInstance(Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService"));
        setField(term734, term734.getClass(), "userRepository", null);
        setField(term734, term734.getClass(), "roleRepository", null);
        setField(term734, term734.getClass(), "organizationRepository", null);
        setField(term734, term734.getClass(), "mailSender", null);
        Long term736 = new Long(-7237588299778557629L);
        Long term799 = new Long(6967924379644551255L);
        term735 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term798 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term735, term735.getClass(), "id", term736);
        setField(term735, term735.getClass(), "firstName", "AijpHYOFuy");
        setField(term735, term735.getClass(), "lastName", "SbAoxhfrkn");
        setField(term735, term735.getClass(), "email", "kuTXqwMtDB");
        setField(term735, term735.getClass(), "password", "Ghbwtircqb");
        setField(term735, term735.getClass(), "imageUrl", "xrwlQZdwCp");
        setField(term798, term798.getClass(), "id", term799);
        setField(term798, term798.getClass(), "name", "IDCWpPLRkE");
        setField(term798, term798.getClass(), "description", "nyiiPDVjAc");
        setField(term735, term735.getClass(), "role", term798);
        setField(term735, term735.getClass(), "token", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.user.CreateUserUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term735;
        callMethod(klass, "sendWelcomeMail", argTypes, term734, args);
    }

};


