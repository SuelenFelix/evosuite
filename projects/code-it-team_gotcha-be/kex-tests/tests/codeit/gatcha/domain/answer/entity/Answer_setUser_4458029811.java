package codeit.gatcha.domain.answer.entity;

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
import static codeit.gatcha.domain.answer.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Answer_setUser_4458029811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1231;
     Object term1311;

    public Answer_setUser_4458029811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1232 = new Integer(71190297);
        Integer term1247 = new Integer(1202361360);
        Integer term1263 = new Integer(-2015048153);
        Integer term1266 = new Integer(-2063457669);
        HashMap term1281 = new HashMap();
        Set<Object> term1391 =  ((Map) term1281).keySet();
        HashSet term1280 = new HashSet((Collection<? extends Object>) term1391);
        term1231 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term1246 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term1262 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1265 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1231, term1231.getClass(), "id", term1232);
        setField(term1231, term1231.getClass(), "body", "FwPbDZcHmB");
        setField(term1246, term1246.getClass(), "id", term1247);
        setField(term1246, term1246.getClass(), "body", "hOncybyCAH");
        setBooleanField(term1246, term1246.getClass(), "valid", true);
        setField(term1231, term1231.getClass(), "question", term1246);
        setField(term1262, term1262.getClass(), "id", term1263);
        setField(term1265, term1265.getClass(), "id", term1266);
        setField(term1265, term1265.getClass(), "role", "QduALnDSVo");
        setField(term1265, term1265.getClass(), "users", term1280);
        setField(term1262, term1262.getClass(), "authority", term1265);
        setField(term1262, term1262.getClass(), "email", "mfCpTPPQQm");
        setField(term1262, term1262.getClass(), "password", "OcJCIDNIXA");
        setBooleanField(term1262, term1262.getClass(), "enabled", true);
        setField(term1231, term1231.getClass(), "user", term1262);
        Integer term1312 = new Integer(-1388471422);
        Integer term1315 = new Integer(-1498296052);
        HashMap term1330 = new HashMap();
        Set<Object> term1422 =  ((Map) term1330).keySet();
        HashSet term1329 = new HashSet((Collection<? extends Object>) term1422);
        term1311 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term1314 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term1311, term1311.getClass(), "id", term1312);
        setField(term1314, term1314.getClass(), "id", term1315);
        setField(term1314, term1314.getClass(), "role", "XfRABIFVEp");
        setField(term1314, term1314.getClass(), "users", term1329);
        setField(term1311, term1311.getClass(), "authority", term1314);
        setField(term1311, term1311.getClass(), "email", "bxrCBbrrct");
        setField(term1311, term1311.getClass(), "password", "CKWpJaaaxX");
        setBooleanField(term1311, term1311.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term1311;
        callMethod(klass, "setUser", argTypes, term1231, args);
    }

};


