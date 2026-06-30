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

public class CardProcedureResponse_setPdid_146034670517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12955;
     Object term13051;

    public CardProcedureResponse_setPdid_146034670517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13054 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term13053 = ((Class) term13054).getDeclaredField((String) "SUCCESS");
        ((Field) term13053).setAccessible(true);
        Object enum39 = ((Field) term13053).get((Object) null);
        Integer term12983 = new Integer(972867650);
        Integer term12985 = new Integer(1655935355);
        Integer term12999 = new Integer(-481533957);
        Integer term13001 = new Integer(1240914516);
        Integer term13003 = new Integer(-1465035361);
        Class<? extends Object> term13332 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term13331 = ((Class) term13332).getDeclaredField((String) "RESET");
        ((Field) term13331).setAccessible(true);
        Object enum40 = ((Field) term13331).get((Object) null);
        term12955 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term12955, term12955.getClass(), "cd_adm_result", enum39);
        setIntField(term12955, term12955.getClass(), "chg_name_price", 458147407);
        setIntField(term12955, term12955.getClass(), "accept_idx", -184153539);
        setIntField(term12955, term12955.getClass(), "pd_id", 493620644);
        setField(term12955, term12955.getClass(), "player_name", "XPKmummaqg");
        setField(term12955, term12955.getClass(), "lv_num", term12983);
        setField(term12955, term12955.getClass(), "lv_pnt", term12985);
        setField(term12955, term12955.getClass(), "lv_str", "BKLfkLiZTH");
        setField(term12955, term12955.getClass(), "lv_efct_id", term12999);
        setField(term12955, term12955.getClass(), "lv_plt_id", term13001);
        setField(term12955, term12955.getClass(), "vcld_pts", term13003);
        setField(term12955, term12955.getClass(), "passwd_stat", enum40);
        setField(term12955, term12955.getClass(), "cmd", "SPpkrGcPRr");
        setField(term12955, term12955.getClass(), "req_id", "sEccwbJKYE");
        setField(term12955, term12955.getClass(), "stat", "AWRooQKkdW");
        term13051 = new Integer(1328271830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13051;
        callMethod(klass, "setPd_id", argTypes, term12955, args);
    }

};


