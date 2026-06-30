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

public class CardProcedureResponse_getLvpltid_68656038411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8975;

    public CardProcedureResponse_getLvpltid_68656038411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9070 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term9069 = ((Class) term9070).getDeclaredField((String) "SUCCESS");
        ((Field) term9069).setAccessible(true);
        Object enum27 = ((Field) term9069).get((Object) null);
        Integer term9003 = new Integer(1632125673);
        Integer term9005 = new Integer(454281060);
        Integer term9019 = new Integer(-1786399638);
        Integer term9021 = new Integer(2055867847);
        Integer term9023 = new Integer(-1048298087);
        Class<? extends Object> term9348 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term9347 = ((Class) term9348).getDeclaredField((String) "SET");
        ((Field) term9347).setAccessible(true);
        Object enum28 = ((Field) term9347).get((Object) null);
        term8975 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term8975, term8975.getClass(), "cd_adm_result", enum27);
        setIntField(term8975, term8975.getClass(), "chg_name_price", -1530420153);
        setIntField(term8975, term8975.getClass(), "accept_idx", -469968304);
        setIntField(term8975, term8975.getClass(), "pd_id", -1145578966);
        setField(term8975, term8975.getClass(), "player_name", "tPlsykYBqO");
        setField(term8975, term8975.getClass(), "lv_num", term9003);
        setField(term8975, term8975.getClass(), "lv_pnt", term9005);
        setField(term8975, term8975.getClass(), "lv_str", "bLPjGVBhlX");
        setField(term8975, term8975.getClass(), "lv_efct_id", term9019);
        setField(term8975, term8975.getClass(), "lv_plt_id", term9021);
        setField(term8975, term8975.getClass(), "vcld_pts", term9023);
        setField(term8975, term8975.getClass(), "passwd_stat", enum28);
        setField(term8975, term8975.getClass(), "cmd", "whBvTVIIlC");
        setField(term8975, term8975.getClass(), "req_id", "IgRJUzaCwW");
        setField(term8975, term8975.getClass(), "stat", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_plt_id", argTypes, term8975, args);
    }

};


