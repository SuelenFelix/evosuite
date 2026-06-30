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
import java.lang.Integer;

public class ChangeNameResponse_setAcceptidx_2351515457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21880;
     Object term21942;

    public ChangeNameResponse_setAcceptidx_2351515457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21945 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term21944 = ((Class) term21945).getDeclaredField((String) "FAILED");
        ((Field) term21944).setAccessible(true);
        Object enum65 = ((Field) term21944).get((Object) null);
        term21880 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term21880, term21880.getClass(), "cd_adm_result", enum65);
        setIntField(term21880, term21880.getClass(), "accept_idx", -1034506028);
        setIntField(term21880, term21880.getClass(), "pd_id", -1263114719);
        setField(term21880, term21880.getClass(), "player_name", "zUlRdimJtU");
        setField(term21880, term21880.getClass(), "cmd", "vwbEQQNQrx");
        setField(term21880, term21880.getClass(), "req_id", "xtftXXMbem");
        setField(term21880, term21880.getClass(), "stat", "cudZvLMQon");
        term21942 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term21942;
        callMethod(klass, "setAccept_idx", argTypes, term21880, args);
    }

};


