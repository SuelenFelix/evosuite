package icu.samnyan.aqua.sega.diva.model.response.card;

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
import static icu.samnyan.aqua.sega.diva.model.response.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ChangeNameResponse_setCdadmresult_15590792536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21523;
     Object enum64;

    public ChangeNameResponse_setCdadmresult_15590792536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21586 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term21585 = ((Class) term21586).getDeclaredField((String) "FAILED");
        ((Field) term21585).setAccessible(true);
        enum64 = ((Field) term21585).get((Object) null);
        term21523 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term21523, term21523.getClass(), "cd_adm_result", enum64);
        setIntField(term21523, term21523.getClass(), "accept_idx", 941650513);
        setIntField(term21523, term21523.getClass(), "pd_id", 444029505);
        setField(term21523, term21523.getClass(), "player_name", "OYbzXylRWW");
        setField(term21523, term21523.getClass(), "cmd", "DSNsTGYXDF");
        setField(term21523, term21523.getClass(), "req_id", "sQvGcVjdEx");
        setField(term21523, term21523.getClass(), "stat", "rLHAoqXgPh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum64;
        callMethod(klass, "setCd_adm_result", argTypes, term21523, args);
    }

};


