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

public class ChangeNameResponse_getPlayername_13376334395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21162;

    public ChangeNameResponse_getPlayername_13376334395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21226 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term21225 = ((Class) term21226).getDeclaredField((String) "SUCCESS");
        ((Field) term21225).setAccessible(true);
        Object enum63 = ((Field) term21225).get((Object) null);
        term21162 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse"));
        setField(term21162, term21162.getClass(), "cd_adm_result", enum63);
        setIntField(term21162, term21162.getClass(), "accept_idx", -505439934);
        setIntField(term21162, term21162.getClass(), "pd_id", -344842608);
        setField(term21162, term21162.getClass(), "player_name", "WzFopsaDuG");
        setField(term21162, term21162.getClass(), "cmd", "PapWxkhEWe");
        setField(term21162, term21162.getClass(), "req_id", "smnHEqRFRx");
        setField(term21162, term21162.getClass(), "stat", "XYtryyobou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.ChangeNameResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer_name", argTypes, term21162, args);
    }

};


