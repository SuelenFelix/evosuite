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

public class Answer_getId_21279901564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;

    public Answer_getId_21279901564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term265 = new Integer(590364439);
        Integer term280 = new Integer(865208305);
        Integer term296 = new Integer(-1275173084);
        Integer term299 = new Integer(-244121226);
        HashMap term314 = new HashMap();
        Set<Object> term374 =  ((Map) term314).keySet();
        HashSet term313 = new HashSet((Collection<? extends Object>) term374);
        term264 = newInstance(Class.forName("codeit.gatcha.domain.answer.entity.Answer"));
        Object term279 = newInstance(Class.forName("codeit.gatcha.domain.question.entity.Question"));
        Object term295 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term298 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term264, term264.getClass(), "id", term265);
        setField(term264, term264.getClass(), "body", "IDCWpPLRkE");
        setField(term279, term279.getClass(), "id", term280);
        setField(term279, term279.getClass(), "body", "nyiiPDVjAc");
        setBooleanField(term279, term279.getClass(), "valid", true);
        setField(term264, term264.getClass(), "question", term279);
        setField(term295, term295.getClass(), "id", term296);
        setField(term298, term298.getClass(), "id", term299);
        setField(term298, term298.getClass(), "role", "aKnKipADSo");
        setField(term298, term298.getClass(), "users", term313);
        setField(term295, term295.getClass(), "authority", term298);
        setField(term295, term295.getClass(), "email", "eqJfYWRaEL");
        setField(term295, term295.getClass(), "password", "fhkbdRViHi");
        setBooleanField(term295, term295.getClass(), "enabled", true);
        setField(term264, term264.getClass(), "user", term295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.answer.entity.Answer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term264, args);
    }

};


