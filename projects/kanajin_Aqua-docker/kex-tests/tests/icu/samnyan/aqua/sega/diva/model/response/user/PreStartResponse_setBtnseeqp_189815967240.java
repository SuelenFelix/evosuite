package icu.samnyan.aqua.sega.diva.model.response.user;

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
import static icu.samnyan.aqua.sega.diva.model.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class PreStartResponse_setBtnseeqp_189815967240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288474;
     Object term288626;

    public PreStartResponse_setBtnseeqp_189815967240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term288629 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term288628 = ((Class) term288629).getDeclaredField((String) "CARD_BANNED");
        ((Field) term288628).setAccessible(true);
        Object enum697 = ((Field) term288628).get((Object) null);
        Integer term288491 = new Integer(1862191391);
        Integer term288493 = new Integer(1131398807);
        Integer term288495 = new Integer(-344907703);
        Integer term288497 = new Integer(824341437);
        Integer term288499 = new Integer(-1794965320);
        Class<? extends Object> term288949 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term288948 = ((Class) term288949).getDeclaredField((String) "MY_LIST_A");
        ((Field) term288948).setAccessible(true);
        Object enum698 = ((Field) term288948).get((Object) null);
        Integer term288527 = new Integer(520504102);
        Integer term288529 = new Integer(-457396133);
        Integer term288543 = new Integer(-1793950607);
        Integer term288545 = new Integer(1091954101);
        Integer term288569 = new Integer(1895143076);
        Integer term288571 = new Integer(1981860404);
        Integer term288573 = new Integer(732174235);
        Integer term288575 = new Integer(470895808);
        Integer term288577 = new Integer(1787325291);
        Integer term288579 = new Integer(1470349147);
        Class<? extends Object> term289243 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term289242 = ((Class) term289243).getDeclaredField((String) "MISS");
        ((Field) term289242).setAccessible(true);
        Object enum699 = ((Field) term289242).get((Object) null);
        term288474 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term288559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term288560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term288564 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term288474, term288474.getClass(), "ps_result", enum697);
        setField(term288474, term288474.getClass(), "accept_idx", term288491);
        setField(term288474, term288474.getClass(), "nblss_ltt_stts", term288493);
        setField(term288474, term288474.getClass(), "nblss_ltt_tckt", term288495);
        setField(term288474, term288474.getClass(), "nblss_ltt_is_opn", term288497);
        setField(term288474, term288474.getClass(), "pd_id", term288499);
        setField(term288474, term288474.getClass(), "player_name", "UrAeseWSFd");
        setField(term288474, term288474.getClass(), "sort_kind", enum698);
        setField(term288474, term288474.getClass(), "lv_num", term288527);
        setField(term288474, term288474.getClass(), "lv_pnt", term288529);
        setField(term288474, term288474.getClass(), "lv_str", "udLLyuUbuM");
        setField(term288474, term288474.getClass(), "lv_efct_id", term288543);
        setField(term288474, term288474.getClass(), "lv_plt_id", term288545);
        setField(term288474, term288474.getClass(), "mdl_eqp_ary", "sNNylQpAva");
        setIntField(term288560, term288560.getClass(), "year", 2020);
        setShortField(term288560, term288560.getClass(), "month", (short) 5);
        setShortField(term288560, term288560.getClass(), "day", (short) 12);
        setField(term288559, term288559.getClass(), "date", term288560);
        setByteField(term288564, term288564.getClass(), "hour", (byte) 22);
        setByteField(term288564, term288564.getClass(), "minute", (byte) 7);
        setByteField(term288564, term288564.getClass(), "second", (byte) 49);
        setIntField(term288564, term288564.getClass(), "nano", 677355362);
        setField(term288559, term288559.getClass(), "time", term288564);
        setField(term288474, term288474.getClass(), "mdl_eqp_tm", term288559);
        setField(term288474, term288474.getClass(), "skn_eqp", term288569);
        setField(term288474, term288474.getClass(), "btn_se_eqp", term288571);
        setField(term288474, term288474.getClass(), "sld_se_eqp", term288573);
        setField(term288474, term288474.getClass(), "chn_sld_se_eqp", term288575);
        setField(term288474, term288474.getClass(), "sldr_tch_se_eqp", term288577);
        setField(term288474, term288474.getClass(), "vcld_pts", term288579);
        setField(term288474, term288474.getClass(), "passwd_stat", enum699);
        setField(term288474, term288474.getClass(), "cmd", "fiwockBanw");
        setField(term288474, term288474.getClass(), "req_id", "VbcximgVTz");
        setField(term288474, term288474.getClass(), "stat", "TGJZvuTmTU");
        term288626 = new Integer(-255317272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term288626;
        callMethod(klass, "setBtn_se_eqp", argTypes, term288474, args);
    }

};


