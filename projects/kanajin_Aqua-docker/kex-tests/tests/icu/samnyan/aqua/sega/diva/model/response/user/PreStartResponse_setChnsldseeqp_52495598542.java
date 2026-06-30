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

public class PreStartResponse_setChnsldseeqp_52495598542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290604;
     Object term290751;

    public PreStartResponse_setChnsldseeqp_52495598542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term290754 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term290753 = ((Class) term290754).getDeclaredField((String) "FAILED");
        ((Field) term290753).setAccessible(true);
        Object enum703 = ((Field) term290753).get((Object) null);
        Integer term290616 = new Integer(-2069930777);
        Integer term290618 = new Integer(1543696412);
        Integer term290620 = new Integer(-1385748168);
        Integer term290622 = new Integer(-270592367);
        Integer term290624 = new Integer(178847646);
        Class<? extends Object> term291059 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term291058 = ((Class) term291059).getDeclaredField((String) "MY_LIST_C");
        ((Field) term291058).setAccessible(true);
        Object enum704 = ((Field) term291058).get((Object) null);
        Integer term290652 = new Integer(273590437);
        Integer term290654 = new Integer(-348612876);
        Integer term290668 = new Integer(1302807565);
        Integer term290670 = new Integer(-838848221);
        Integer term290694 = new Integer(1163761623);
        Integer term290696 = new Integer(718742281);
        Integer term290698 = new Integer(1532723756);
        Integer term290700 = new Integer(-124088550);
        Integer term290702 = new Integer(777492093);
        Integer term290704 = new Integer(1414025609);
        Class<? extends Object> term291353 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term291352 = ((Class) term291353).getDeclaredField((String) "MISS");
        ((Field) term291352).setAccessible(true);
        Object enum705 = ((Field) term291352).get((Object) null);
        term290604 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term290684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290689 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term290604, term290604.getClass(), "ps_result", enum703);
        setField(term290604, term290604.getClass(), "accept_idx", term290616);
        setField(term290604, term290604.getClass(), "nblss_ltt_stts", term290618);
        setField(term290604, term290604.getClass(), "nblss_ltt_tckt", term290620);
        setField(term290604, term290604.getClass(), "nblss_ltt_is_opn", term290622);
        setField(term290604, term290604.getClass(), "pd_id", term290624);
        setField(term290604, term290604.getClass(), "player_name", "DRbcFFNcSr");
        setField(term290604, term290604.getClass(), "sort_kind", enum704);
        setField(term290604, term290604.getClass(), "lv_num", term290652);
        setField(term290604, term290604.getClass(), "lv_pnt", term290654);
        setField(term290604, term290604.getClass(), "lv_str", "WGDSInQrVz");
        setField(term290604, term290604.getClass(), "lv_efct_id", term290668);
        setField(term290604, term290604.getClass(), "lv_plt_id", term290670);
        setField(term290604, term290604.getClass(), "mdl_eqp_ary", "pJboxLnvbb");
        setIntField(term290685, term290685.getClass(), "year", 2026);
        setShortField(term290685, term290685.getClass(), "month", (short) 2);
        setShortField(term290685, term290685.getClass(), "day", (short) 5);
        setField(term290684, term290684.getClass(), "date", term290685);
        setByteField(term290689, term290689.getClass(), "hour", (byte) 1);
        setByteField(term290689, term290689.getClass(), "minute", (byte) 38);
        setByteField(term290689, term290689.getClass(), "second", (byte) 15);
        setIntField(term290689, term290689.getClass(), "nano", 167345230);
        setField(term290684, term290684.getClass(), "time", term290689);
        setField(term290604, term290604.getClass(), "mdl_eqp_tm", term290684);
        setField(term290604, term290604.getClass(), "skn_eqp", term290694);
        setField(term290604, term290604.getClass(), "btn_se_eqp", term290696);
        setField(term290604, term290604.getClass(), "sld_se_eqp", term290698);
        setField(term290604, term290604.getClass(), "chn_sld_se_eqp", term290700);
        setField(term290604, term290604.getClass(), "sldr_tch_se_eqp", term290702);
        setField(term290604, term290604.getClass(), "vcld_pts", term290704);
        setField(term290604, term290604.getClass(), "passwd_stat", enum705);
        setField(term290604, term290604.getClass(), "cmd", "ofGdinTYHj");
        setField(term290604, term290604.getClass(), "req_id", "FaJjdWrmzf");
        setField(term290604, term290604.getClass(), "stat", "qBRgIZjugc");
        term290751 = new Integer(255145822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term290751;
        callMethod(klass, "setChn_sld_se_eqp", argTypes, term290604, args);
    }

};


