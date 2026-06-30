package codeit.gatcha.domain.user.service.signUp;

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
import static codeit.gatcha.domain.user.service.signUp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class EmailConfirmationService_createAndSendConfirmationEmail_10148110211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term132;

    public EmailConfirmationService_createAndSendConfirmationEmail_10148110211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term83 = new Integer(1134449235);
        Integer term86 = new Integer(-883034806);
        HashMap term101 = new HashMap();
        Set<Object> term208 =  ((Map) term101).keySet();
        HashSet term100 = new HashSet((Collection<? extends Object>) term208);
        term82 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term85 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term82, term82.getClass(), "id", term83);
        setField(term85, term85.getClass(), "id", term86);
        setField(term85, term85.getClass(), "role", "HyxfbSQYBe");
        setField(term85, term85.getClass(), "users", term100);
        setField(term82, term82.getClass(), "authority", term85);
        setField(term82, term82.getClass(), "email", "dWRymuLBtr");
        setField(term82, term82.getClass(), "password", "AijpHYOFuy");
        setBooleanField(term82, term82.getClass(), "enabled", true);
        Integer term133 = new Integer(-2068769794);
        Integer term150 = new Integer(-117576464);
        Integer term153 = new Integer(-1007160944);
        HashMap term168 = new HashMap();
        Set<Object> term249 =  ((Map) term168).keySet();
        HashSet term167 = new HashSet((Collection<? extends Object>) term249);
        term132 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term147 = newInstance(Class.forName("java.util.Date"));
        Object term149 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term152 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term132, term132.getClass(), "id", term133);
        setField(term132, term132.getClass(), "confirmationToken", "SbAoxhfrkn");
        setLongField(term147, term147.getClass(), "fastTime", 1345871412244L);
        setField(term147, term147.getClass(), "cdate", null);
        setField(term132, term132.getClass(), "createdDate", term147);
        setField(term149, term149.getClass(), "id", term150);
        setField(term152, term152.getClass(), "id", term153);
        setField(term152, term152.getClass(), "role", "kuTXqwMtDB");
        setField(term152, term152.getClass(), "users", term167);
        setField(term149, term149.getClass(), "authority", term152);
        setField(term149, term149.getClass(), "email", "ytSBIKXogI");
        setField(term149, term149.getClass(), "password", "nHXjMycHlU");
        setBooleanField(term149, term149.getClass(), "enabled", true);
        setField(term132, term132.getClass(), "user", term149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.service.signUp.EmailConfirmationService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        argTypes[1] = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Object[] args = new Object[2];
        args[0] = term82;
        args[1] = term132;
        callMethod(klass, "createAndSendConfirmationEmail", argTypes, null, args);
    }

};


