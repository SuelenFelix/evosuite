package com.lyubenblagoev.postfixrest.entity;

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
import static com.lyubenblagoev.postfixrest.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.util.LinkedList;

public class User_setRoles_164890990311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4394;
     Object term4444;

    public User_setRoles_164890990311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4425 = new ArrayList();
        ((ArrayList) term4425).add((Object)null);
        ((ArrayList) term4425).add((Object)null);
        ((ArrayList) term4425).add((Object)null);
        ((ArrayList) term4425).add((Object)null);
        Long term4428 = new Long(-5876259280451647338L);
        Object term4423 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4431 = newInstance(Class.forName("java.util.Date"));
        Object term4433 = newInstance(Class.forName("java.util.Date"));
        setField(term4423, term4423.getClass(), "name", "");
        setField(term4423, term4423.getClass(), "users", term4425);
        setField(term4423, term4423.getClass(), "id", term4428);
        setBooleanField(term4423, term4423.getClass(), "enabled", false);
        setLongField(term4431, term4431.getClass(), "fastTime", 1695432264739L);
        setField(term4431, term4431.getClass(), "cdate", null);
        setField(term4423, term4423.getClass(), "created", term4431);
        setLongField(term4433, term4433.getClass(), "fastTime", 1817693922139L);
        setField(term4433, term4433.getClass(), "cdate", null);
        setField(term4423, term4423.getClass(), "updated", term4433);
        ArrayList term4421 = new ArrayList();
        ((ArrayList) term4421).add(term4423);
        Long term4437 = new Long(-4562564710769146498L);
        term4394 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.User"));
        Object term4419 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term4440 = newInstance(Class.forName("java.util.Date"));
        Object term4442 = newInstance(Class.forName("java.util.Date"));
        setField(term4394, term4394.getClass(), "email", "MAnhIPOtHL");
        setField(term4394, term4394.getClass(), "password", "dikKjYjmRO");
        setIntField(term4419, term4419.getClass(), "modCount", 0);
        setField(term4394, term4394.getClass(), "devices", term4419);
        setField(term4394, term4394.getClass(), "roles", term4421);
        setField(term4394, term4394.getClass(), "id", term4437);
        setBooleanField(term4394, term4394.getClass(), "enabled", false);
        setLongField(term4440, term4440.getClass(), "fastTime", 1877018244707L);
        setField(term4440, term4440.getClass(), "cdate", null);
        setField(term4394, term4394.getClass(), "created", term4440);
        setLongField(term4442, term4442.getClass(), "fastTime", 1420334918500L);
        setField(term4442, term4442.getClass(), "cdate", null);
        setField(term4394, term4394.getClass(), "updated", term4442);
        ArrayList term4460 = new ArrayList();
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        ((ArrayList) term4460).add((Object)null);
        Long term4464 = new Long(-5967061076297699457L);
        Object term4447 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4467 = newInstance(Class.forName("java.util.Date"));
        Object term4469 = newInstance(Class.forName("java.util.Date"));
        setField(term4447, term4447.getClass(), "name", "PwqnuJJwjR");
        setField(term4447, term4447.getClass(), "users", term4460);
        setField(term4447, term4447.getClass(), "id", term4464);
        setBooleanField(term4447, term4447.getClass(), "enabled", false);
        setLongField(term4467, term4467.getClass(), "fastTime", 1402960883581L);
        setField(term4467, term4467.getClass(), "cdate", null);
        setField(term4447, term4447.getClass(), "created", term4467);
        setLongField(term4469, term4469.getClass(), "fastTime", 1646029420567L);
        setField(term4469, term4469.getClass(), "cdate", null);
        setField(term4447, term4447.getClass(), "updated", term4469);
        ArrayList term4474 = new ArrayList();
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        ((ArrayList) term4474).add((Object)null);
        Long term4477 = new Long(-7574091101944828886L);
        Object term4472 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        Object term4480 = newInstance(Class.forName("java.util.Date"));
        Object term4482 = newInstance(Class.forName("java.util.Date"));
        setField(term4472, term4472.getClass(), "name", "");
        setField(term4472, term4472.getClass(), "users", term4474);
        setField(term4472, term4472.getClass(), "id", term4477);
        setBooleanField(term4472, term4472.getClass(), "enabled", true);
        setLongField(term4480, term4480.getClass(), "fastTime", 1336538131239L);
        setField(term4480, term4480.getClass(), "cdate", null);
        setField(term4472, term4472.getClass(), "created", term4480);
        setLongField(term4482, term4482.getClass(), "fastTime", 1747477149580L);
        setField(term4482, term4482.getClass(), "cdate", null);
        setField(term4472, term4472.getClass(), "updated", term4482);
        Long term4486 = new Long(2551047634163864862L);
        Object term4485 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.entity.Role"));
        setField(term4485, term4485.getClass(), "name", null);
        setField(term4485, term4485.getClass(), "users", null);
        setField(term4485, term4485.getClass(), "id", term4486);
        setBooleanField(term4485, term4485.getClass(), "enabled", false);
        setField(term4485, term4485.getClass(), "created", null);
        setField(term4485, term4485.getClass(), "updated", null);
        term4444 = new LinkedList();
        ((LinkedList) term4444).add(term4447);
        ((LinkedList) term4444).add(term4472);
        ((LinkedList) term4444).add(term4485);
        ((LinkedList) term4444).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4444;
        callMethod(klass, "setRoles", argTypes, term4394, args);
    }

};


