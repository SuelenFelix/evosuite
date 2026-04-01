package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_setConfirmationToken_21422183146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;

    public ConfirmationToken_setConfirmationToken_21422183146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term620 = new Integer(941650513);
        Integer term637 = new Integer(444029505);
        Integer term640 = new Integer(-1034506028);
        HashMap term655 = new HashMap();
        Set<Object> term717 =  ((Map) term655).keySet();
        HashSet term654 = new HashSet((Collection<? extends Object>) term717);
        term619 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term634 = newInstance(Class.forName("java.util.Date"));
        Object term636 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term639 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term619, term619.getClass(), "id", term620);
        setField(term619, term619.getClass(), "confirmationToken", "HzqpegHiRq");
        setLongField(term634, term634.getClass(), "fastTime", 1515890130018L);
        setField(term634, term634.getClass(), "cdate", null);
        setField(term619, term619.getClass(), "createdDate", term634);
        setField(term636, term636.getClass(), "id", term637);
        setField(term639, term639.getClass(), "id", term640);
        setField(term639, term639.getClass(), "role", "jwsfVjMoJT");
        setField(term639, term639.getClass(), "users", term654);
        setField(term636, term636.getClass(), "authority", term639);
        setField(term636, term636.getClass(), "email", "vwbEQQNQrx");
        setField(term636, term636.getClass(), "password", "xtftXXMbem");
        setBooleanField(term636, term636.getClass(), "enabled", true);
        setField(term619, term619.getClass(), "user", term636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cudZvLMQon";
        callMethod(klass, "setConfirmationToken", argTypes, term619, args);
    }

};


