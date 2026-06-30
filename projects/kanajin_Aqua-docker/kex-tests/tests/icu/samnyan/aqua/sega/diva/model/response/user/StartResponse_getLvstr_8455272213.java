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

public class StartResponse_getLvstr_8455272213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28973;

    public StartResponse_getLvstr_8455272213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29417 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term29416 = ((Class) term29417).getDeclaredField((String) "SUCCESS");
        ((Field) term29416).setAccessible(true);
        Object enum65 = ((Field) term29416).get((Object) null);
        Class<? extends Object> term29685 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term29684 = ((Class) term29685).getDeclaredField((String) "MY_LIST_A");
        ((Field) term29684).setAccessible(true);
        Object enum66 = ((Field) term29684).get((Object) null);
        Class<? extends Object> term30019 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term30018 = ((Class) term30019).getDeclaredField((String) "UNDEFINED");
        ((Field) term30018).setAccessible(true);
        Object enum67 = ((Field) term30018).get((Object) null);
        Class<? extends Object> term30303 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term30302 = ((Class) term30303).getDeclaredField((String) "EXTRA");
        ((Field) term30302).setAccessible(true);
        Object enum68 = ((Field) term30302).get((Object) null);
        Class<? extends Object> term30610 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term30609 = ((Class) term30610).getDeclaredField((String) "GOLD");
        ((Field) term30609).setAccessible(true);
        Object enum69 = ((Field) term30609).get((Object) null);
        term28973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term29071 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29072 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29076 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28973, term28973.getClass(), "pd_id", -1692331299);
        setField(term28973, term28973.getClass(), "start_result", enum65);
        setIntField(term28973, term28973.getClass(), "accept_idx", 479531250);
        setIntField(term28973, term28973.getClass(), "start_idx", 1320570890);
        setField(term28973, term28973.getClass(), "player_name", "weddIktxOA");
        setIntField(term28973, term28973.getClass(), "hp_vol", -130649791);
        setBooleanField(term28973, term28973.getClass(), "btn_se_vol", false);
        setIntField(term28973, term28973.getClass(), "btn_se_vol2", 534834644);
        setIntField(term28973, term28973.getClass(), "sldr_se_vol2", 1959097203);
        setField(term28973, term28973.getClass(), "sort_kind", enum66);
        setIntField(term28973, term28973.getClass(), "lv_num", -209654048);
        setIntField(term28973, term28973.getClass(), "lv_pnt", 477625804);
        setField(term28973, term28973.getClass(), "lv_str", "uSlMeISsDD");
        setIntField(term28973, term28973.getClass(), "lv_efct_id", 252575029);
        setIntField(term28973, term28973.getClass(), "lv_plt_id", 57189932);
        setField(term28973, term28973.getClass(), "mdl_eqp_ary", "WdCiTDUKqn");
        setField(term28973, term28973.getClass(), "c_itm_eqp_ary", "PSizQDoxxe");
        setField(term28973, term28973.getClass(), "ms_itm_flg_ary", "mKaHyMybrK");
        setIntField(term29072, term29072.getClass(), "year", 2021);
        setShortField(term29072, term29072.getClass(), "month", (short) 9);
        setShortField(term29072, term29072.getClass(), "day", (short) 7);
        setField(term29071, term29071.getClass(), "date", term29072);
        setByteField(term29076, term29076.getClass(), "hour", (byte) 5);
        setByteField(term29076, term29076.getClass(), "minute", (byte) 25);
        setByteField(term29076, term29076.getClass(), "second", (byte) 7);
        setIntField(term29076, term29076.getClass(), "nano", 755924076);
        setField(term29071, term29071.getClass(), "time", term29076);
        setField(term28973, term28973.getClass(), "mdl_eqp_tm", term29071);
        setField(term28973, term28973.getClass(), "mdl_have", "AyrEXuGrEj");
        setField(term28973, term28973.getClass(), "cstmz_itm_have", "yevIIoVYHq");
        setBooleanField(term28973, term28973.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term28973, term28973.getClass(), "use_mdl_pri", true);
        setBooleanField(term28973, term28973.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term28973, term28973.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term28973, term28973.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term28973, term28973.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term28973, term28973.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term28973, term28973.getClass(), "vcld_pts", 1460722225);
        setIntField(term28973, term28973.getClass(), "nxt_pv_id", 1743224434);
        setField(term28973, term28973.getClass(), "nxt_dffclty", enum67);
        setField(term28973, term28973.getClass(), "nxt_edtn", enum68);
        setField(term28973, term28973.getClass(), "cv_cid", "UuYWMTqWTV");
        setField(term28973, term28973.getClass(), "cv_sc", "DSFGlcaXUb");
        setField(term28973, term28973.getClass(), "cv_rr", "sHMXNUzNeM");
        setField(term28973, term28973.getClass(), "cv_bv", "gPzGDOEPPw");
        setField(term28973, term28973.getClass(), "cv_bf", "rwKoAngzCu");
        setIntField(term28973, term28973.getClass(), "cnp_cid", 842904495);
        setIntField(term28973, term28973.getClass(), "cnp_val", 1008080511);
        setField(term28973, term28973.getClass(), "cnp_rr", enum69);
        setField(term28973, term28973.getClass(), "cnp_sp", "VUkRVwROTl");
        setField(term28973, term28973.getClass(), "my_lst_0", "UDlkdccCRn");
        setField(term28973, term28973.getClass(), "my_lst_1", "McpzErOcYb");
        setField(term28973, term28973.getClass(), "my_lst_2", "jqrVEUvYEz");
        setField(term28973, term28973.getClass(), "my_lst_3", "QITgiBrmfj");
        setField(term28973, term28973.getClass(), "my_lst_4", "pXxkiXgQnq");
        setField(term28973, term28973.getClass(), "dsp_clr_brdr", "tKmrUDURku");
        setBooleanField(term28973, term28973.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term28973, term28973.getClass(), "dsp_clr_sts", true);
        setField(term28973, term28973.getClass(), "clr_sts", "JeZbrwZmsP");
        setBooleanField(term28973, term28973.getClass(), "rgo_sts", true);
        setField(term28973, term28973.getClass(), "my_qst_id", "bxyfeicqrK");
        setField(term28973, term28973.getClass(), "my_qst_sts", "vBnWPlsZMk");
        setField(term28973, term28973.getClass(), "my_qst_prgrs", "fIZsWucfXz");
        setField(term28973, term28973.getClass(), "my_qst_et", "IApvtmfhnq");
        setField(term28973, term28973.getClass(), "p_std_ie_have", "VSaNnhMpRc");
        setField(term28973, term28973.getClass(), "p_std_se_have", "QNjNTLlUaV");
        setField(term28973, term28973.getClass(), "cmd", "hIYsRyOZxk");
        setField(term28973, term28973.getClass(), "req_id", "RjNoEywJbC");
        setField(term28973, term28973.getClass(), "stat", "RTTvrwwhou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_str", argTypes, term28973, args);
    }

};


