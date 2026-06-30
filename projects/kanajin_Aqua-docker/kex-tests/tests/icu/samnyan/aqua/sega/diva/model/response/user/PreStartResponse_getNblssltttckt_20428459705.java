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

public class PreStartResponse_getNblssltttckt_20428459705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250519;

    public PreStartResponse_getNblssltttckt_20428459705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term250668 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term250667 = ((Class) term250668).getDeclaredField((String) "FAILED");
        ((Field) term250667).setAccessible(true);
        Object enum590 = ((Field) term250667).get((Object) null);
        Integer term250531 = new Integer(-184153539);
        Integer term250533 = new Integer(493620644);
        Integer term250535 = new Integer(1328271830);
        Integer term250537 = new Integer(1596070772);
        Integer term250539 = new Integer(97029295);
        Class<? extends Object> term250973 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term250972 = ((Class) term250973).getDeclaredField((String) "MY_LIST_B");
        ((Field) term250972).setAccessible(true);
        Object enum591 = ((Field) term250972).get((Object) null);
        Integer term250567 = new Integer(-1371869594);
        Integer term250569 = new Integer(-2095575670);
        Integer term250583 = new Integer(1225272962);
        Integer term250585 = new Integer(1324040357);
        Integer term250609 = new Integer(-1588772968);
        Integer term250611 = new Integer(-93135961);
        Integer term250613 = new Integer(-112921587);
        Integer term250615 = new Integer(933028652);
        Integer term250617 = new Integer(287287233);
        Integer term250619 = new Integer(962840079);
        Class<? extends Object> term251267 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term251266 = ((Class) term251267).getDeclaredField((String) "RESET");
        ((Field) term251266).setAccessible(true);
        Object enum592 = ((Field) term251266).get((Object) null);
        term250519 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term250599 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250600 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250604 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term250519, term250519.getClass(), "ps_result", enum590);
        setField(term250519, term250519.getClass(), "accept_idx", term250531);
        setField(term250519, term250519.getClass(), "nblss_ltt_stts", term250533);
        setField(term250519, term250519.getClass(), "nblss_ltt_tckt", term250535);
        setField(term250519, term250519.getClass(), "nblss_ltt_is_opn", term250537);
        setField(term250519, term250519.getClass(), "pd_id", term250539);
        setField(term250519, term250519.getClass(), "player_name", "lvnwgMKxXk");
        setField(term250519, term250519.getClass(), "sort_kind", enum591);
        setField(term250519, term250519.getClass(), "lv_num", term250567);
        setField(term250519, term250519.getClass(), "lv_pnt", term250569);
        setField(term250519, term250519.getClass(), "lv_str", "FiSaNxpGPk");
        setField(term250519, term250519.getClass(), "lv_efct_id", term250583);
        setField(term250519, term250519.getClass(), "lv_plt_id", term250585);
        setField(term250519, term250519.getClass(), "mdl_eqp_ary", "QMzQRRhneO");
        setIntField(term250600, term250600.getClass(), "year", 2026);
        setShortField(term250600, term250600.getClass(), "month", (short) 6);
        setShortField(term250600, term250600.getClass(), "day", (short) 13);
        setField(term250599, term250599.getClass(), "date", term250600);
        setByteField(term250604, term250604.getClass(), "hour", (byte) 19);
        setByteField(term250604, term250604.getClass(), "minute", (byte) 23);
        setByteField(term250604, term250604.getClass(), "second", (byte) 46);
        setIntField(term250604, term250604.getClass(), "nano", 67955056);
        setField(term250599, term250599.getClass(), "time", term250604);
        setField(term250519, term250519.getClass(), "mdl_eqp_tm", term250599);
        setField(term250519, term250519.getClass(), "skn_eqp", term250609);
        setField(term250519, term250519.getClass(), "btn_se_eqp", term250611);
        setField(term250519, term250519.getClass(), "sld_se_eqp", term250613);
        setField(term250519, term250519.getClass(), "chn_sld_se_eqp", term250615);
        setField(term250519, term250519.getClass(), "sldr_tch_se_eqp", term250617);
        setField(term250519, term250519.getClass(), "vcld_pts", term250619);
        setField(term250519, term250519.getClass(), "passwd_stat", enum592);
        setField(term250519, term250519.getClass(), "cmd", "VFWNaQoDnL");
        setField(term250519, term250519.getClass(), "req_id", "BFwtIJkozx");
        setField(term250519, term250519.getClass(), "stat", "cIMeTiVeEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNblss_ltt_tckt", argTypes, term250519, args);
    }

};


