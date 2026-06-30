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

public class CardProcedureResponse_setLvnum_34651746019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14307;
     Object term14400;

    public CardProcedureResponse_setLvnum_34651746019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14403 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term14402 = ((Class) term14403).getDeclaredField((String) "FAILED");
        ((Field) term14402).setAccessible(true);
        Object enum43 = ((Field) term14402).get((Object) null);
        Integer term14334 = new Integer(-1772434990);
        Integer term14336 = new Integer(-1845499264);
        Integer term14350 = new Integer(-505439934);
        Integer term14352 = new Integer(-344842608);
        Integer term14354 = new Integer(941650513);
        Class<? extends Object> term14678 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term14677 = ((Class) term14678).getDeclaredField((String) "SET");
        ((Field) term14677).setAccessible(true);
        Object enum44 = ((Field) term14677).get((Object) null);
        term14307 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term14307, term14307.getClass(), "cd_adm_result", enum43);
        setIntField(term14307, term14307.getClass(), "chg_name_price", -2095575670);
        setIntField(term14307, term14307.getClass(), "accept_idx", 1225272962);
        setIntField(term14307, term14307.getClass(), "pd_id", 1324040357);
        setField(term14307, term14307.getClass(), "player_name", "fztQhjqwdP");
        setField(term14307, term14307.getClass(), "lv_num", term14334);
        setField(term14307, term14307.getClass(), "lv_pnt", term14336);
        setField(term14307, term14307.getClass(), "lv_str", "eVpkWxjuki");
        setField(term14307, term14307.getClass(), "lv_efct_id", term14350);
        setField(term14307, term14307.getClass(), "lv_plt_id", term14352);
        setField(term14307, term14307.getClass(), "vcld_pts", term14354);
        setField(term14307, term14307.getClass(), "passwd_stat", enum44);
        setField(term14307, term14307.getClass(), "cmd", "SJiQaLvSKv");
        setField(term14307, term14307.getClass(), "req_id", "OEXDRUKcFl");
        setField(term14307, term14307.getClass(), "stat", "RYdKCNNMBR");
        term14400 = new Integer(444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14400;
        callMethod(klass, "setLv_num", argTypes, term14307, args);
    }

};


