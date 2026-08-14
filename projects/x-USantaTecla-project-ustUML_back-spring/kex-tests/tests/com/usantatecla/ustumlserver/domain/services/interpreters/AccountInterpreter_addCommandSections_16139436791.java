package com.usantatecla.ustumlserver.domain.services.interpreters;

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
import static com.usantatecla.ustumlserver.domain.services.interpreters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.ArrayList;

public class AccountInterpreter_addCommandSections_16139436791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21556;

    public AccountInterpreter_addCommandSections_16139436791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21559 = new HashMap();
        Class<? extends Object> term21660 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term21659 = ((Class) term21660).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term21659).setAccessible(true);
        Object enum51 = ((Field) term21659).get((Object) null);
        ArrayList term21607 = new ArrayList();
        ArrayList term21635 = new ArrayList();
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        ((ArrayList) term21635).add((Object)null);
        term21556 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter"));
        Object term21557 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.GitRepositoryImporter"));
        Object term21558 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser"));
        Object term21565 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term21558, term21558.getClass(), "memberPersistence", null);
        setField(term21558, term21558.getClass(), "classMap", term21559);
        setField(term21557, term21557.getClass(), "repositoryParser", term21558);
        setField(term21556, term21556.getClass(), "gitRepositoryImporter", term21557);
        setField(term21556, term21556.getClass(), "withMembersMemberPersistence", null);
        setField(term21556, term21556.getClass(), "memberPersistence", null);
        setField(term21565, term21565.getClass(), "email", "pFAfANnxup");
        setField(term21565, term21565.getClass(), "password", "FbSIUZyBXZ");
        setField(term21565, term21565.getClass(), "role", enum51);
        setField(term21565, term21565.getClass(), "projects", term21607);
        setField(term21565, term21565.getClass(), "id", "mhQDwIyrRi");
        setField(term21565, term21565.getClass(), "name", "HpZXWDPhlg");
        setField(term21565, term21565.getClass(), "relations", term21635);
        setField(term21556, term21556.getClass(), "account", term21565);
        setField(term21556, term21556.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCommandSections", argTypes, term21556, args);
    }

};


