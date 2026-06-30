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

public class CardProcedureResponse_setCdadmresult_137296108714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10957;
     Object enum33;

    public CardProcedureResponse_setCdadmresult_137296108714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11056 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term11055 = ((Class) term11056).getDeclaredField((String) "SUCCESS");
        ((Field) term11055).setAccessible(true);
        enum33 = ((Field) term11055).get((Object) null);
        Integer term10985 = new Integer(1324040357);
        Integer term10987 = new Integer(-1588772968);
        Integer term11001 = new Integer(-93135961);
        Integer term11003 = new Integer(-112921587);
        Integer term11005 = new Integer(933028652);
        Class<? extends Object> term11334 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term11333 = ((Class) term11334).getDeclaredField((String) "REISSUE");
        ((Field) term11333).setAccessible(true);
        Object enum34 = ((Field) term11333).get((Object) null);
        term10957 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term10957, term10957.getClass(), "cd_adm_result", enum33);
        setIntField(term10957, term10957.getClass(), "chg_name_price", -817164822);
        setIntField(term10957, term10957.getClass(), "accept_idx", -1016503459);
        setIntField(term10957, term10957.getClass(), "pd_id", -1968847291);
        setField(term10957, term10957.getClass(), "player_name", "bWWfajKbEX");
        setField(term10957, term10957.getClass(), "lv_num", term10985);
        setField(term10957, term10957.getClass(), "lv_pnt", term10987);
        setField(term10957, term10957.getClass(), "lv_str", "cAPeiZHKGJ");
        setField(term10957, term10957.getClass(), "lv_efct_id", term11001);
        setField(term10957, term10957.getClass(), "lv_plt_id", term11003);
        setField(term10957, term10957.getClass(), "vcld_pts", term11005);
        setField(term10957, term10957.getClass(), "passwd_stat", enum34);
        setField(term10957, term10957.getClass(), "cmd", "LvJFtLBaxj");
        setField(term10957, term10957.getClass(), "req_id", "PHvxnGHptP");
        setField(term10957, term10957.getClass(), "stat", "TimdotUuNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Result");
        Object[] args = new Object[1];
        args[0] = enum33;
        callMethod(klass, "setCd_adm_result", argTypes, term10957, args);
    }

};


