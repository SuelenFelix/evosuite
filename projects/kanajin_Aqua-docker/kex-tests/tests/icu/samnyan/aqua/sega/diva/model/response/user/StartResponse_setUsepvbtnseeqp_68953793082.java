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
import java.lang.Boolean;

public class StartResponse_setUsepvbtnseeqp_68953793082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173143;
     Object term173584;

    public StartResponse_setUsepvbtnseeqp_68953793082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term173587 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term173586 = ((Class) term173587).getDeclaredField((String) "FAILED");
        ((Field) term173586).setAccessible(true);
        Object enum411 = ((Field) term173586).get((Object) null);
        Class<? extends Object> term173852 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term173851 = ((Class) term173852).getDeclaredField((String) "COMPLEXITY");
        ((Field) term173851).setAccessible(true);
        Object enum412 = ((Field) term173851).get((Object) null);
        Class<? extends Object> term174189 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term174188 = ((Class) term174189).getDeclaredField((String) "EXTREME");
        ((Field) term174188).setAccessible(true);
        Object enum413 = ((Field) term174188).get((Object) null);
        Class<? extends Object> term174467 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term174466 = ((Class) term174467).getDeclaredField((String) "EXTRA");
        ((Field) term174466).setAccessible(true);
        Object enum414 = ((Field) term174466).get((Object) null);
        Class<? extends Object> term174774 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term174773 = ((Class) term174774).getDeclaredField((String) "GOLD");
        ((Field) term174773).setAccessible(true);
        Object enum415 = ((Field) term174773).get((Object) null);
        term173143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term173241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173246 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term173143, term173143.getClass(), "pd_id", -867099093);
        setField(term173143, term173143.getClass(), "start_result", enum411);
        setIntField(term173143, term173143.getClass(), "accept_idx", -1091199008);
        setIntField(term173143, term173143.getClass(), "start_idx", 1837886253);
        setField(term173143, term173143.getClass(), "player_name", "ImSBmTIdsP");
        setIntField(term173143, term173143.getClass(), "hp_vol", -269528550);
        setBooleanField(term173143, term173143.getClass(), "btn_se_vol", false);
        setIntField(term173143, term173143.getClass(), "btn_se_vol2", 2108571355);
        setIntField(term173143, term173143.getClass(), "sldr_se_vol2", 1909966089);
        setField(term173143, term173143.getClass(), "sort_kind", enum412);
        setIntField(term173143, term173143.getClass(), "lv_num", 1827255916);
        setIntField(term173143, term173143.getClass(), "lv_pnt", 2039815750);
        setField(term173143, term173143.getClass(), "lv_str", "KDKQhbiclt");
        setIntField(term173143, term173143.getClass(), "lv_efct_id", 2079590265);
        setIntField(term173143, term173143.getClass(), "lv_plt_id", -435079567);
        setField(term173143, term173143.getClass(), "mdl_eqp_ary", "diWnDDpNWl");
        setField(term173143, term173143.getClass(), "c_itm_eqp_ary", "jcrJhyEbDI");
        setField(term173143, term173143.getClass(), "ms_itm_flg_ary", "DHbGOjJfEz");
        setIntField(term173242, term173242.getClass(), "year", 2020);
        setShortField(term173242, term173242.getClass(), "month", (short) 10);
        setShortField(term173242, term173242.getClass(), "day", (short) 25);
        setField(term173241, term173241.getClass(), "date", term173242);
        setByteField(term173246, term173246.getClass(), "hour", (byte) 18);
        setByteField(term173246, term173246.getClass(), "minute", (byte) 22);
        setByteField(term173246, term173246.getClass(), "second", (byte) 30);
        setIntField(term173246, term173246.getClass(), "nano", 948592965);
        setField(term173241, term173241.getClass(), "time", term173246);
        setField(term173143, term173143.getClass(), "mdl_eqp_tm", term173241);
        setField(term173143, term173143.getClass(), "mdl_have", "OuyHNwADel");
        setField(term173143, term173143.getClass(), "cstmz_itm_have", "shazlRAQrB");
        setBooleanField(term173143, term173143.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term173143, term173143.getClass(), "use_mdl_pri", true);
        setBooleanField(term173143, term173143.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term173143, term173143.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term173143, term173143.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term173143, term173143.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term173143, term173143.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term173143, term173143.getClass(), "vcld_pts", -1017617829);
        setIntField(term173143, term173143.getClass(), "nxt_pv_id", 270928865);
        setField(term173143, term173143.getClass(), "nxt_dffclty", enum413);
        setField(term173143, term173143.getClass(), "nxt_edtn", enum414);
        setField(term173143, term173143.getClass(), "cv_cid", "PNJdNWkxgW");
        setField(term173143, term173143.getClass(), "cv_sc", "aCTJvzQZSQ");
        setField(term173143, term173143.getClass(), "cv_rr", "hcvedmWnmW");
        setField(term173143, term173143.getClass(), "cv_bv", "rBZaHWidIS");
        setField(term173143, term173143.getClass(), "cv_bf", "xneQCADwGB");
        setIntField(term173143, term173143.getClass(), "cnp_cid", -308526089);
        setIntField(term173143, term173143.getClass(), "cnp_val", -359675864);
        setField(term173143, term173143.getClass(), "cnp_rr", enum415);
        setField(term173143, term173143.getClass(), "cnp_sp", "luSCmxphxi");
        setField(term173143, term173143.getClass(), "my_lst_0", "OGEDwuJhjV");
        setField(term173143, term173143.getClass(), "my_lst_1", "vepOtOxlWM");
        setField(term173143, term173143.getClass(), "my_lst_2", "XZmoxlxcKh");
        setField(term173143, term173143.getClass(), "my_lst_3", "aHNGawFCfD");
        setField(term173143, term173143.getClass(), "my_lst_4", "cHjhnXKTVF");
        setField(term173143, term173143.getClass(), "dsp_clr_brdr", "NVsXpTZPoM");
        setBooleanField(term173143, term173143.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term173143, term173143.getClass(), "dsp_clr_sts", true);
        setField(term173143, term173143.getClass(), "clr_sts", "OlbhHDRGng");
        setBooleanField(term173143, term173143.getClass(), "rgo_sts", false);
        setField(term173143, term173143.getClass(), "my_qst_id", "kbxuaUHTXf");
        setField(term173143, term173143.getClass(), "my_qst_sts", "CwmyQhyiUR");
        setField(term173143, term173143.getClass(), "my_qst_prgrs", "PxwyuZAkGy");
        setField(term173143, term173143.getClass(), "my_qst_et", "ODhSWAnZWd");
        setField(term173143, term173143.getClass(), "p_std_ie_have", "NQkFXmkuYK");
        setField(term173143, term173143.getClass(), "p_std_se_have", "kHzsJWDHsz");
        setField(term173143, term173143.getClass(), "cmd", "jIfbtgnHqt");
        setField(term173143, term173143.getClass(), "req_id", "vNvzjymLXH");
        setField(term173143, term173143.getClass(), "stat", "TCadyfXzAm");
        term173584 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term173584;
        callMethod(klass, "setUse_pv_btn_se_eqp", argTypes, term173143, args);
    }

};


