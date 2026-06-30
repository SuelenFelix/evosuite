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

public class ChangeNameResponse_getCdadmresult_11211586832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20079;

    public ChangeNameResponse_getCdadmresult_11211586832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20143 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term20142 = ((Class) term20143).getDeclaredField((String) "SUCCESS");
        ((Field) term20142).setAccessible(true);
        Object enum60 = ((Field) term20142).get((Object) null);
        term20079 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term20079, term20079.getClass(), "cd_adm_result", enum60);
        setIntField(term20079, term20079.getClass(), "accept_idx", -1547384488);
        setIntField(term20079, term20079.getClass(), "pd_id", 1442160736);
        setField(term20079, term20079.getClass(), "player_name", "MwwjNtdOFT");
        setField(term20079, term20079.getClass(), "cmd", "VYkqXKVlAJ");
        setField(term20079, term20079.getClass(), "req_id", "XkIoWJRNwN");
        setField(term20079, term20079.getClass(), "stat", "aNWLJdrZMq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_result", argTypes, term20079, args);
    }

};


