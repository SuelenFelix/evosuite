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

public class ChangeNameResponse_getCdadmresult_112115868312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22989;

    public ChangeNameResponse_getCdadmresult_112115868312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22989 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term22989, term22989.getClass(), "cd_adm_result", null);
        setIntField(term22989, term22989.getClass(), "accept_idx", 0);
        setIntField(term22989, term22989.getClass(), "pd_id", 0);
        setField(term22989, term22989.getClass(), "player_name", null);
        setField(term22989, term22989.getClass(), "cmd", null);
        setField(term22989, term22989.getClass(), "req_id", null);
        setField(term22989, term22989.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCd_adm_result", argTypes, term22989, args);
    }

};


