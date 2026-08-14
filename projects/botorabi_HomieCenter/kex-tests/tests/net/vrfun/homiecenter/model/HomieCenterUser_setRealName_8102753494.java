package net.vrfun.homiecenter.model;

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
import static net.vrfun.homiecenter.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class HomieCenterUser_setRealName_8102753494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6595;

    public HomieCenterUser_setRealName_8102753494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6596 = new Long(-6573104506744284592L);
        term6595 = newInstance(Class.forName("net.vrfun.homiecenter.model.HomieCenterUser"));
        setField(term6595, term6595.getClass(), "id", term6596);
        setField(term6595, term6595.getClass(), "realName", "XfRABIFVEp");
        setField(term6595, term6595.getClass(), "userName", "MHGKyEnwKc");
        setField(term6595, term6595.getClass(), "password", "ShIELyuULw");
        setBooleanField(term6595, term6595.getClass(), "admin", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.vrfun.homiecenter.model.HomieCenterUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpQuOGMgmj";
        callMethod(klass, "setRealName", argTypes, term6595, args);
    }

};


