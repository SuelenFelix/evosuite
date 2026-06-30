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

public class CardProcedureResponse_getLvefctid_17082394410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8309;

    public CardProcedureResponse_getLvefctid_17082394410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8406 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term8405 = ((Class) term8406).getDeclaredField((String) "SUCCESS");
        ((Field) term8405).setAccessible(true);
        Object enum25 = ((Field) term8405).get((Object) null);
        Integer term8337 = new Integer(-817164822);
        Integer term8339 = new Integer(-1016503459);
        Integer term8353 = new Integer(-1968847291);
        Integer term8355 = new Integer(579005622);
        Integer term8357 = new Integer(-14890619);
        Class<? extends Object> term8684 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term8683 = ((Class) term8684).getDeclaredField((String) "RESET");
        ((Field) term8683).setAccessible(true);
        Object enum26 = ((Field) term8683).get((Object) null);
        term8309 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term8309, term8309.getClass(), "cd_adm_result", enum25);
        setIntField(term8309, term8309.getClass(), "chg_name_price", -226514366);
        setIntField(term8309, term8309.getClass(), "accept_idx", 1193880199);
        setIntField(term8309, term8309.getClass(), "pd_id", -1087774327);
        setField(term8309, term8309.getClass(), "player_name", "eqJfYWRaEL");
        setField(term8309, term8309.getClass(), "lv_num", term8337);
        setField(term8309, term8309.getClass(), "lv_pnt", term8339);
        setField(term8309, term8309.getClass(), "lv_str", "fhkbdRViHi");
        setField(term8309, term8309.getClass(), "lv_efct_id", term8353);
        setField(term8309, term8309.getClass(), "lv_plt_id", term8355);
        setField(term8309, term8309.getClass(), "vcld_pts", term8357);
        setField(term8309, term8309.getClass(), "passwd_stat", enum26);
        setField(term8309, term8309.getClass(), "cmd", "uWHnvSvaPl");
        setField(term8309, term8309.getClass(), "req_id", "kBdSllIBVz");
        setField(term8309, term8309.getClass(), "stat", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_efct_id", argTypes, term8309, args);
    }

};


