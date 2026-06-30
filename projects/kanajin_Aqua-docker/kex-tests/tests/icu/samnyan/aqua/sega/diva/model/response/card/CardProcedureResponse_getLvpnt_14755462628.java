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

public class CardProcedureResponse_getLvpnt_14755462628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6993;

    public CardProcedureResponse_getLvpnt_14755462628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7089 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term7088 = ((Class) term7089).getDeclaredField((String) "FAILED");
        ((Field) term7088).setAccessible(true);
        Object enum21 = ((Field) term7088).get((Object) null);
        Integer term7020 = new Integer(-1087774327);
        Integer term7022 = new Integer(-1530420153);
        Integer term7036 = new Integer(-469968304);
        Integer term7038 = new Integer(-1145578966);
        Integer term7040 = new Integer(679763016);
        Class<? extends Object> term7364 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term7363 = ((Class) term7364).getDeclaredField((String) "RESET");
        ((Field) term7363).setAccessible(true);
        Object enum22 = ((Field) term7363).get((Object) null);
        term6993 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse"));
        setField(term6993, term6993.getClass(), "cd_adm_result", enum21);
        setIntField(term6993, term6993.getClass(), "chg_name_price", 865208305);
        setIntField(term6993, term6993.getClass(), "accept_idx", -1275173084);
        setIntField(term6993, term6993.getClass(), "pd_id", -244121226);
        setField(term6993, term6993.getClass(), "player_name", "JDswTTCZHV");
        setField(term6993, term6993.getClass(), "lv_num", term7020);
        setField(term6993, term6993.getClass(), "lv_pnt", term7022);
        setField(term6993, term6993.getClass(), "lv_str", "onpbIeEKoi");
        setField(term6993, term6993.getClass(), "lv_efct_id", term7036);
        setField(term6993, term6993.getClass(), "lv_plt_id", term7038);
        setField(term6993, term6993.getClass(), "vcld_pts", term7040);
        setField(term6993, term6993.getClass(), "passwd_stat", enum22);
        setField(term6993, term6993.getClass(), "cmd", "YRHGsAkhxb");
        setField(term6993, term6993.getClass(), "req_id", "ffYhPOzlUs");
        setField(term6993, term6993.getClass(), "stat", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.card.CardProcedureResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_pnt", argTypes, term6993, args);
    }

};


