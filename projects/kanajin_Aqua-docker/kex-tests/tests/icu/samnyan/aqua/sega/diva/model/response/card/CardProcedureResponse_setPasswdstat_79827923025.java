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

public class CardProcedureResponse_setPasswdstat_79827923025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18339;
     Object enum57;

    public CardProcedureResponse_setPasswdstat_79827923025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18446 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term18445 = ((Class) term18446).getDeclaredField((String) "SUCCESS");
        ((Field) term18445).setAccessible(true);
        Object enum55 = ((Field) term18445).get((Object) null);
        Integer term18367 = new Integer(53410913);
        Integer term18369 = new Integer(-375014958);
        Integer term18383 = new Integer(1107176718);
        Integer term18385 = new Integer(480137250);
        Integer term18387 = new Integer(-341152642);
        Class<? extends Object> term18724 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term18723 = ((Class) term18724).getDeclaredField((String) "REISSUE");
        ((Field) term18723).setAccessible(true);
        Object enum56 = ((Field) term18723).get((Object) null);
        term18339 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term18339, term18339.getClass(), "cd_adm_result", enum55);
        setIntField(term18339, term18339.getClass(), "chg_name_price", 1655935355);
        setIntField(term18339, term18339.getClass(), "accept_idx", -481533957);
        setIntField(term18339, term18339.getClass(), "pd_id", 1240914516);
        setField(term18339, term18339.getClass(), "player_name", "LWyEaeIyAo");
        setField(term18339, term18339.getClass(), "lv_num", term18367);
        setField(term18339, term18339.getClass(), "lv_pnt", term18369);
        setField(term18339, term18339.getClass(), "lv_str", "yVMkkQhvmN");
        setField(term18339, term18339.getClass(), "lv_efct_id", term18383);
        setField(term18339, term18339.getClass(), "lv_plt_id", term18385);
        setField(term18339, term18339.getClass(), "vcld_pts", term18387);
        setField(term18339, term18339.getClass(), "passwd_stat", enum56);
        setField(term18339, term18339.getClass(), "cmd", "mvrkADEgpp");
        setField(term18339, term18339.getClass(), "req_id", "pXOkjyeIRb");
        setField(term18339, term18339.getClass(), "stat", "GgZWSjxjyE");
        Class<? extends Object> term19022 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term19021 = ((Class) term19022).getDeclaredField((String) "SET");
        ((Field) term19021).setAccessible(true);
        enum57 = ((Field) term19021).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[1];
        args[0] = enum57;
        callMethod(klass, "setPasswd_stat", argTypes, term18339, args);
    }

};


