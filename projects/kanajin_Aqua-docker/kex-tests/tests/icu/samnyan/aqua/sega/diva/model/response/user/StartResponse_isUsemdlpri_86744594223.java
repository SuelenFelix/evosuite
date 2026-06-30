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

public class StartResponse_isUsemdlpri_86744594223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49817;

    public StartResponse_isUsemdlpri_86744594223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50256 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term50255 = ((Class) term50256).getDeclaredField((String) "SUCCESS");
        ((Field) term50255).setAccessible(true);
        Object enum115 = ((Field) term50255).get((Object) null);
        Class<? extends Object> term50524 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term50523 = ((Class) term50524).getDeclaredField((String) "MY_LIST_B");
        ((Field) term50523).setAccessible(true);
        Object enum116 = ((Field) term50523).get((Object) null);
        Class<? extends Object> term50858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term50857 = ((Class) term50858).getDeclaredField((String) "EASY");
        ((Field) term50857).setAccessible(true);
        Object enum117 = ((Field) term50857).get((Object) null);
        Class<? extends Object> term51127 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term51126 = ((Class) term51127).getDeclaredField((String) "EXTRA");
        ((Field) term51126).setAccessible(true);
        Object enum118 = ((Field) term51126).get((Object) null);
        Class<? extends Object> term51434 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term51433 = ((Class) term51434).getDeclaredField((String) "GOLD");
        ((Field) term51433).setAccessible(true);
        Object enum119 = ((Field) term51433).get((Object) null);
        term49817 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term49915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term49920 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term49817, term49817.getClass(), "pd_id", -100825168);
        setField(term49817, term49817.getClass(), "start_result", enum115);
        setIntField(term49817, term49817.getClass(), "accept_idx", 768407648);
        setIntField(term49817, term49817.getClass(), "start_idx", -350454594);
        setField(term49817, term49817.getClass(), "player_name", "PNzNzzjSXM");
        setIntField(term49817, term49817.getClass(), "hp_vol", -1148142995);
        setBooleanField(term49817, term49817.getClass(), "btn_se_vol", false);
        setIntField(term49817, term49817.getClass(), "btn_se_vol2", -233024044);
        setIntField(term49817, term49817.getClass(), "sldr_se_vol2", 1820784228);
        setField(term49817, term49817.getClass(), "sort_kind", enum116);
        setIntField(term49817, term49817.getClass(), "lv_num", 1390820006);
        setIntField(term49817, term49817.getClass(), "lv_pnt", -828982065);
        setField(term49817, term49817.getClass(), "lv_str", "ktKcSZiuGM");
        setIntField(term49817, term49817.getClass(), "lv_efct_id", 1221443226);
        setIntField(term49817, term49817.getClass(), "lv_plt_id", 908108726);
        setField(term49817, term49817.getClass(), "mdl_eqp_ary", "PSOttyUeqv");
        setField(term49817, term49817.getClass(), "c_itm_eqp_ary", "HmEvTlmzXo");
        setField(term49817, term49817.getClass(), "ms_itm_flg_ary", "BMMonTIZgJ");
        setIntField(term49916, term49916.getClass(), "year", 2027);
        setShortField(term49916, term49916.getClass(), "month", (short) 8);
        setShortField(term49916, term49916.getClass(), "day", (short) 26);
        setField(term49915, term49915.getClass(), "date", term49916);
        setByteField(term49920, term49920.getClass(), "hour", (byte) 5);
        setByteField(term49920, term49920.getClass(), "minute", (byte) 11);
        setByteField(term49920, term49920.getClass(), "second", (byte) 9);
        setIntField(term49920, term49920.getClass(), "nano", 219245092);
        setField(term49915, term49915.getClass(), "time", term49920);
        setField(term49817, term49817.getClass(), "mdl_eqp_tm", term49915);
        setField(term49817, term49817.getClass(), "mdl_have", "QXyFXBjFde");
        setField(term49817, term49817.getClass(), "cstmz_itm_have", "xVFgeyYxZS");
        setBooleanField(term49817, term49817.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term49817, term49817.getClass(), "use_mdl_pri", true);
        setBooleanField(term49817, term49817.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term49817, term49817.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term49817, term49817.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term49817, term49817.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term49817, term49817.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term49817, term49817.getClass(), "vcld_pts", 1023209512);
        setIntField(term49817, term49817.getClass(), "nxt_pv_id", 1084849225);
        setField(term49817, term49817.getClass(), "nxt_dffclty", enum117);
        setField(term49817, term49817.getClass(), "nxt_edtn", enum118);
        setField(term49817, term49817.getClass(), "cv_cid", "iQiGTulJiH");
        setField(term49817, term49817.getClass(), "cv_sc", "utCuuVCKqE");
        setField(term49817, term49817.getClass(), "cv_rr", "zSfoqzJbPT");
        setField(term49817, term49817.getClass(), "cv_bv", "QUymMnsCIj");
        setField(term49817, term49817.getClass(), "cv_bf", "ikTtOgdVYS");
        setIntField(term49817, term49817.getClass(), "cnp_cid", -1702055571);
        setIntField(term49817, term49817.getClass(), "cnp_val", -944542900);
        setField(term49817, term49817.getClass(), "cnp_rr", enum119);
        setField(term49817, term49817.getClass(), "cnp_sp", "JptuwlirlS");
        setField(term49817, term49817.getClass(), "my_lst_0", "TKOMaGswbU");
        setField(term49817, term49817.getClass(), "my_lst_1", "YcTbglHiUq");
        setField(term49817, term49817.getClass(), "my_lst_2", "TiUqHrjoEU");
        setField(term49817, term49817.getClass(), "my_lst_3", "eoEvZbdLjL");
        setField(term49817, term49817.getClass(), "my_lst_4", "BkIxsyPkGy");
        setField(term49817, term49817.getClass(), "dsp_clr_brdr", "mrMGwoRgVY");
        setBooleanField(term49817, term49817.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term49817, term49817.getClass(), "dsp_clr_sts", false);
        setField(term49817, term49817.getClass(), "clr_sts", "mxVLTgCwki");
        setBooleanField(term49817, term49817.getClass(), "rgo_sts", false);
        setField(term49817, term49817.getClass(), "my_qst_id", "wCurppnDSA");
        setField(term49817, term49817.getClass(), "my_qst_sts", "JydxSNTMYt");
        setField(term49817, term49817.getClass(), "my_qst_prgrs", "KpurAcrHYT");
        setField(term49817, term49817.getClass(), "my_qst_et", "QjvDwgKJGz");
        setField(term49817, term49817.getClass(), "p_std_ie_have", "ngYxiXTZrk");
        setField(term49817, term49817.getClass(), "p_std_se_have", "YTxBqWRAlo");
        setField(term49817, term49817.getClass(), "cmd", "ReruUQRXwl");
        setField(term49817, term49817.getClass(), "req_id", "DWEsVQwuaE");
        setField(term49817, term49817.getClass(), "stat", "qGkNzZAeDN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_mdl_pri", argTypes, term49817, args);
    }

};


