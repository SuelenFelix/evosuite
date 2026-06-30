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

public class PreStartResponse_getSortkind_10505907579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254775;

    public PreStartResponse_getSortkind_10505907579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254926 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PreStartResult");
        Field term254925 = ((Class) term254926).getDeclaredField((String) "ALREADY_PLAYING");
        ((Field) term254925).setAccessible(true);
        Object enum602 = ((Field) term254925).get((Object) null);
        Integer term254796 = new Integer(-1963434938);
        Integer term254798 = new Integer(906181092);
        Integer term254800 = new Integer(1045657203);
        Integer term254802 = new Integer(1386130016);
        Integer term254804 = new Integer(1072005683);
        Class<? extends Object> term255258 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term255257 = ((Class) term255258).getDeclaredField((String) "NAME");
        ((Field) term255257).setAccessible(true);
        Object enum603 = ((Field) term255257).get((Object) null);
        Integer term254827 = new Integer(1861318859);
        Integer term254829 = new Integer(1474524152);
        Integer term254843 = new Integer(568954359);
        Integer term254845 = new Integer(53410913);
        Integer term254869 = new Integer(-375014958);
        Integer term254871 = new Integer(1107176718);
        Integer term254873 = new Integer(480137250);
        Integer term254875 = new Integer(-341152642);
        Integer term254877 = new Integer(-2015854073);
        Integer term254879 = new Integer(538259104);
        Class<? extends Object> term255537 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Field term255536 = ((Class) term255537).getDeclaredField((String) "SET");
        ((Field) term255536).setAccessible(true);
        Object enum604 = ((Field) term255536).get((Object) null);
        term254775 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse"));
        Object term254859 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254860 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254864 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term254775, term254775.getClass(), "ps_result", enum602);
        setField(term254775, term254775.getClass(), "accept_idx", term254796);
        setField(term254775, term254775.getClass(), "nblss_ltt_stts", term254798);
        setField(term254775, term254775.getClass(), "nblss_ltt_tckt", term254800);
        setField(term254775, term254775.getClass(), "nblss_ltt_is_opn", term254802);
        setField(term254775, term254775.getClass(), "pd_id", term254804);
        setField(term254775, term254775.getClass(), "player_name", "FYulmknfej");
        setField(term254775, term254775.getClass(), "sort_kind", enum603);
        setField(term254775, term254775.getClass(), "lv_num", term254827);
        setField(term254775, term254775.getClass(), "lv_pnt", term254829);
        setField(term254775, term254775.getClass(), "lv_str", "eKQelJcJEF");
        setField(term254775, term254775.getClass(), "lv_efct_id", term254843);
        setField(term254775, term254775.getClass(), "lv_plt_id", term254845);
        setField(term254775, term254775.getClass(), "mdl_eqp_ary", "rMzkpEMgIm");
        setIntField(term254860, term254860.getClass(), "year", 2016);
        setShortField(term254860, term254860.getClass(), "month", (short) 4);
        setShortField(term254860, term254860.getClass(), "day", (short) 18);
        setField(term254859, term254859.getClass(), "date", term254860);
        setByteField(term254864, term254864.getClass(), "hour", (byte) 15);
        setByteField(term254864, term254864.getClass(), "minute", (byte) 56);
        setByteField(term254864, term254864.getClass(), "second", (byte) 45);
        setIntField(term254864, term254864.getClass(), "nano", 248103350);
        setField(term254859, term254859.getClass(), "time", term254864);
        setField(term254775, term254775.getClass(), "mdl_eqp_tm", term254859);
        setField(term254775, term254775.getClass(), "skn_eqp", term254869);
        setField(term254775, term254775.getClass(), "btn_se_eqp", term254871);
        setField(term254775, term254775.getClass(), "sld_se_eqp", term254873);
        setField(term254775, term254775.getClass(), "chn_sld_se_eqp", term254875);
        setField(term254775, term254775.getClass(), "sldr_tch_se_eqp", term254877);
        setField(term254775, term254775.getClass(), "vcld_pts", term254879);
        setField(term254775, term254775.getClass(), "passwd_stat", enum604);
        setField(term254775, term254775.getClass(), "cmd", "pNGFuoPYQr");
        setField(term254775, term254775.getClass(), "req_id", "kCjOAdClxu");
        setField(term254775, term254775.getClass(), "stat", "UqDmRiivsD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.PreStartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSort_kind", argTypes, term254775, args);
    }

};


