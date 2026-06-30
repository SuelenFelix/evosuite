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

public class ChangeNameResponse_getAcceptidx_11495313233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20440;

    public ChangeNameResponse_getAcceptidx_11495313233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20504 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term20503 = ((Class) term20504).getDeclaredField((String) "SUCCESS");
        ((Field) term20503).setAccessible(true);
        Object enum61 = ((Field) term20503).get((Object) null);
        term20440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term20440, term20440.getClass(), "cd_adm_result", enum61);
        setIntField(term20440, term20440.getClass(), "accept_idx", 1114000454);
        setIntField(term20440, term20440.getClass(), "pd_id", -556405712);
        setField(term20440, term20440.getClass(), "player_name", "HHmNoYxIGj");
        setField(term20440, term20440.getClass(), "cmd", "PtirvZmsGt");
        setField(term20440, term20440.getClass(), "req_id", "HWkpTmtlrc");
        setField(term20440, term20440.getClass(), "stat", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccept_idx", argTypes, term20440, args);
    }

};


