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

public class StartResponse_setUsepvsldseeqp_204482089183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175227;
     Object term175665;

    public StartResponse_setUsepvsldseeqp_204482089183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175668 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term175667 = ((Class) term175668).getDeclaredField((String) "SUCCESS");
        ((Field) term175667).setAccessible(true);
        Object enum416 = ((Field) term175667).get((Object) null);
        Class<? extends Object> term175936 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term175935 = ((Class) term175936).getDeclaredField((String) "NAME");
        ((Field) term175935).setAccessible(true);
        Object enum417 = ((Field) term175935).get((Object) null);
        Class<? extends Object> term176255 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term176254 = ((Class) term176255).getDeclaredField((String) "HARD");
        ((Field) term176254).setAccessible(true);
        Object enum418 = ((Field) term176254).get((Object) null);
        Class<? extends Object> term176524 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term176523 = ((Class) term176524).getDeclaredField((String) "ORIGINAL");
        ((Field) term176523).setAccessible(true);
        Object enum419 = ((Field) term176523).get((Object) null);
        Class<? extends Object> term176840 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term176839 = ((Class) term176840).getDeclaredField((String) "BRONZE");
        ((Field) term176839).setAccessible(true);
        Object enum420 = ((Field) term176839).get((Object) null);
        term175227 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term175320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term175321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term175325 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term175227, term175227.getClass(), "pd_id", -1671982964);
        setField(term175227, term175227.getClass(), "start_result", enum416);
        setIntField(term175227, term175227.getClass(), "accept_idx", 776218451);
        setIntField(term175227, term175227.getClass(), "start_idx", -1362132929);
        setField(term175227, term175227.getClass(), "player_name", "rSSEpZFUMc");
        setIntField(term175227, term175227.getClass(), "hp_vol", 1267740164);
        setBooleanField(term175227, term175227.getClass(), "btn_se_vol", false);
        setIntField(term175227, term175227.getClass(), "btn_se_vol2", 1363887997);
        setIntField(term175227, term175227.getClass(), "sldr_se_vol2", -1744763945);
        setField(term175227, term175227.getClass(), "sort_kind", enum417);
        setIntField(term175227, term175227.getClass(), "lv_num", 852281447);
        setIntField(term175227, term175227.getClass(), "lv_pnt", 1248430530);
        setField(term175227, term175227.getClass(), "lv_str", "DJHwHjvNlc");
        setIntField(term175227, term175227.getClass(), "lv_efct_id", -1911828505);
        setIntField(term175227, term175227.getClass(), "lv_plt_id", 241725499);
        setField(term175227, term175227.getClass(), "mdl_eqp_ary", "ZSBzHqaLtQ");
        setField(term175227, term175227.getClass(), "c_itm_eqp_ary", "DCRuiaVwNa");
        setField(term175227, term175227.getClass(), "ms_itm_flg_ary", "VTjvZBqRUX");
        setIntField(term175321, term175321.getClass(), "year", 2020);
        setShortField(term175321, term175321.getClass(), "month", (short) 5);
        setShortField(term175321, term175321.getClass(), "day", (short) 12);
        setField(term175320, term175320.getClass(), "date", term175321);
        setByteField(term175325, term175325.getClass(), "hour", (byte) 0);
        setByteField(term175325, term175325.getClass(), "minute", (byte) 15);
        setByteField(term175325, term175325.getClass(), "second", (byte) 24);
        setIntField(term175325, term175325.getClass(), "nano", 250257744);
        setField(term175320, term175320.getClass(), "time", term175325);
        setField(term175227, term175227.getClass(), "mdl_eqp_tm", term175320);
        setField(term175227, term175227.getClass(), "mdl_have", "vhjxsMJjOh");
        setField(term175227, term175227.getClass(), "cstmz_itm_have", "gKgsqLPDCs");
        setBooleanField(term175227, term175227.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term175227, term175227.getClass(), "use_mdl_pri", true);
        setBooleanField(term175227, term175227.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term175227, term175227.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term175227, term175227.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term175227, term175227.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term175227, term175227.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term175227, term175227.getClass(), "vcld_pts", 823179298);
        setIntField(term175227, term175227.getClass(), "nxt_pv_id", 1174484848);
        setField(term175227, term175227.getClass(), "nxt_dffclty", enum418);
        setField(term175227, term175227.getClass(), "nxt_edtn", enum419);
        setField(term175227, term175227.getClass(), "cv_cid", "crZAQIKgDI");
        setField(term175227, term175227.getClass(), "cv_sc", "uDAdogNiBQ");
        setField(term175227, term175227.getClass(), "cv_rr", "GnPrxkKUmR");
        setField(term175227, term175227.getClass(), "cv_bv", "gVgLmqgxMh");
        setField(term175227, term175227.getClass(), "cv_bf", "QWknVCpJTU");
        setIntField(term175227, term175227.getClass(), "cnp_cid", 939889496);
        setIntField(term175227, term175227.getClass(), "cnp_val", -495242269);
        setField(term175227, term175227.getClass(), "cnp_rr", enum420);
        setField(term175227, term175227.getClass(), "cnp_sp", "XhnCbWwpIr");
        setField(term175227, term175227.getClass(), "my_lst_0", "BVMUadSiyU");
        setField(term175227, term175227.getClass(), "my_lst_1", "OhWrgFwvJi");
        setField(term175227, term175227.getClass(), "my_lst_2", "DfKWXfTINQ");
        setField(term175227, term175227.getClass(), "my_lst_3", "KqusFIxuyo");
        setField(term175227, term175227.getClass(), "my_lst_4", "CDpvEYMuDg");
        setField(term175227, term175227.getClass(), "dsp_clr_brdr", "YaZCAiIUPe");
        setBooleanField(term175227, term175227.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term175227, term175227.getClass(), "dsp_clr_sts", false);
        setField(term175227, term175227.getClass(), "clr_sts", "KsCWHUcJDd");
        setBooleanField(term175227, term175227.getClass(), "rgo_sts", true);
        setField(term175227, term175227.getClass(), "my_qst_id", "zkYsnzzwJu");
        setField(term175227, term175227.getClass(), "my_qst_sts", "hxHKgOYyQD");
        setField(term175227, term175227.getClass(), "my_qst_prgrs", "opEyNuSzgs");
        setField(term175227, term175227.getClass(), "my_qst_et", "YTnlgdIqfA");
        setField(term175227, term175227.getClass(), "p_std_ie_have", "gcKmFclftu");
        setField(term175227, term175227.getClass(), "p_std_se_have", "lfREOBPEuD");
        setField(term175227, term175227.getClass(), "cmd", "JAGjDlTwTa");
        setField(term175227, term175227.getClass(), "req_id", "wIDeyLnekQ");
        setField(term175227, term175227.getClass(), "stat", "tOGPTIqSMm");
        term175665 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term175665;
        callMethod(klass, "setUse_pv_sld_se_eqp", argTypes, term175227, args);
    }

};


