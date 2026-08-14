package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_setUser_17639232455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;
     Object term778;

    public SocialInfo_setUser_17639232455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term683 = new Long(-4325723315152823407L);
        Object term735 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term735, term735.getClass(), "email", null);
        ArrayList term733 = new ArrayList();
        ((ArrayList) term733).add(term735);
        Long term738 = new Long(2535595959091595249L);
        Long term740 = new Long(-5476826692763582090L);
        term681 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term682 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term682, term682.getClass(), "id", term683);
        setField(term682, term682.getClass(), "userName", "BndsHwAFMv");
        setField(term682, term682.getClass(), "firstName", "GzFkzHGYFt");
        setField(term682, term682.getClass(), "lastName", "tShwQLRGNe");
        setField(term682, term682.getClass(), "primaryEmail", "LvtrsXUliU");
        setField(term682, term682.getClass(), "secondaryEmails", term733);
        setField(term682, term682.getClass(), "createdAt", term738);
        setField(term682, term682.getClass(), "updatedAt", term740);
        setField(term681, term681.getClass(), "user", term682);
        setField(term681, term681.getClass(), "githubProfile", "jDtqGUpnZN");
        setField(term681, term681.getClass(), "twitterProfile", "nGKItKLYNC");
        setField(term681, term681.getClass(), "linkedInProfile", "UiUYnPrcCi");
        Long term779 = new Long(-872011222785455006L);
        Object term831 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term831, term831.getClass(), "email", "");
        Object term833 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term833, term833.getClass(), "email", "");
        Object term835 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term835, term835.getClass(), "email", "");
        Object term837 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term837, term837.getClass(), "email", "");
        Object term839 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term839, term839.getClass(), "email", "");
        Object term841 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term841, term841.getClass(), "email", "");
        ArrayList term829 = new ArrayList();
        ((ArrayList) term829).add(term831);
        ((ArrayList) term829).add(term833);
        ((ArrayList) term829).add(term835);
        ((ArrayList) term829).add(term837);
        ((ArrayList) term829).add(term839);
        ((ArrayList) term829).add(term841);
        Long term845 = new Long(-316468845751588286L);
        Long term847 = new Long(5127676408959197577L);
        term778 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term778, term778.getClass(), "id", term779);
        setField(term778, term778.getClass(), "userName", "UoYtihxVaS");
        setField(term778, term778.getClass(), "firstName", "JDswTTCZHV");
        setField(term778, term778.getClass(), "lastName", "onpbIeEKoi");
        setField(term778, term778.getClass(), "primaryEmail", "YRHGsAkhxb");
        setField(term778, term778.getClass(), "secondaryEmails", term829);
        setField(term778, term778.getClass(), "createdAt", term845);
        setField(term778, term778.getClass(), "updatedAt", term847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Object[] args = new Object[1];
        args[0] = term778;
        callMethod(klass, "setUser", argTypes, term681, args);
    }

};


