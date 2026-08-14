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

public class AccountInterpreter_import_14767059092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21955;

    public AccountInterpreter_import_14767059092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term21958 = new HashMap();
        Class<? extends Object> term22059 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term22058 = ((Class) term22059).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term22058).setAccessible(true);
        Object enum52 = ((Field) term22058).get((Object) null);
        ArrayList term22006 = new ArrayList();
        ArrayList term22034 = new ArrayList();
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        ((ArrayList) term22034).add((Object)null);
        term21955 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter"));
        Object term21956 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.GitRepositoryImporter"));
        Object term21957 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.services.reverseEngineering.RepositoryParser"));
        Object term21964 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term21957, term21957.getClass(), "memberPersistence", null);
        setField(term21957, term21957.getClass(), "classMap", term21958);
        setField(term21956, term21956.getClass(), "repositoryParser", term21957);
        setField(term21955, term21955.getClass(), "gitRepositoryImporter", term21956);
        setField(term21955, term21955.getClass(), "withMembersMemberPersistence", null);
        setField(term21955, term21955.getClass(), "memberPersistence", null);
        setField(term21964, term21964.getClass(), "email", "BJhjdJUhkz");
        setField(term21964, term21964.getClass(), "password", "cdHYQDgUZR");
        setField(term21964, term21964.getClass(), "role", enum52);
        setField(term21964, term21964.getClass(), "projects", term22006);
        setField(term21964, term21964.getClass(), "id", "KAORSSPSeV");
        setField(term21964, term21964.getClass(), "name", "UimMMORkzd");
        setField(term21964, term21964.getClass(), "relations", term22034);
        setField(term21955, term21955.getClass(), "account", term21964);
        setField(term21955, term21955.getClass(), "member", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.services.interpreters.AccountInterpreter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.infrastructure.api.dtos.Command");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "_import", argTypes, term21955, args);
    }

};


