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

public class ChangePasswdResponse_getPdid_26278178612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25995;

    public ChangePasswdResponse_getPdid_26278178612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25995 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse"));
        setField(term25995, term25995.getClass(), "cd_adm_result", null);
        setIntField(term25995, term25995.getClass(), "accept_idx", 0);
        setIntField(term25995, term25995.getClass(), "pd_id", 0);
        setField(term25995, term25995.getClass(), "cmd", null);
        setField(term25995, term25995.getClass(), "req_id", null);
        setField(term25995, term25995.getClass(), "stat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangePasswdResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPd_id", argTypes, term25995, args);
    }

};


