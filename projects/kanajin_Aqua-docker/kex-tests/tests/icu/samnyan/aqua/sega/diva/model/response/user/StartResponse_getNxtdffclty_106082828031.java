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

public class StartResponse_getNxtdffclty_106082828031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66465;

    public StartResponse_getNxtdffclty_106082828031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term66903 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term66902 = ((Class) term66903).getDeclaredField((String) "SUCCESS");
        ((Field) term66902).setAccessible(true);
        Object enum155 = ((Field) term66902).get((Object) null);
        Class<? extends Object> term67171 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term67170 = ((Class) term67171).getDeclaredField((String) "NAME");
        ((Field) term67170).setAccessible(true);
        Object enum156 = ((Field) term67170).get((Object) null);
        Class<? extends Object> term67490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term67489 = ((Class) term67490).getDeclaredField((String) "NORMAL");
        ((Field) term67489).setAccessible(true);
        Object enum157 = ((Field) term67489).get((Object) null);
        Class<? extends Object> term67765 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term67764 = ((Class) term67765).getDeclaredField((String) "EXTRA");
        ((Field) term67764).setAccessible(true);
        Object enum158 = ((Field) term67764).get((Object) null);
        Class<? extends Object> term68072 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term68071 = ((Class) term68072).getDeclaredField((String) "SILVER");
        ((Field) term68071).setAccessible(true);
        Object enum159 = ((Field) term68071).get((Object) null);
        term66465 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term66558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66563 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term66465, term66465.getClass(), "pd_id", 433248783);
        setField(term66465, term66465.getClass(), "start_result", enum155);
        setIntField(term66465, term66465.getClass(), "accept_idx", -507944154);
        setIntField(term66465, term66465.getClass(), "start_idx", -1736183862);
        setField(term66465, term66465.getClass(), "player_name", "LHnkeoNwHq");
        setIntField(term66465, term66465.getClass(), "hp_vol", 897010381);
        setBooleanField(term66465, term66465.getClass(), "btn_se_vol", false);
        setIntField(term66465, term66465.getClass(), "btn_se_vol2", -15712667);
        setIntField(term66465, term66465.getClass(), "sldr_se_vol2", 1964967720);
        setField(term66465, term66465.getClass(), "sort_kind", enum156);
        setIntField(term66465, term66465.getClass(), "lv_num", 1351900243);
        setIntField(term66465, term66465.getClass(), "lv_pnt", -330897705);
        setField(term66465, term66465.getClass(), "lv_str", "gVnDVbSyKa");
        setIntField(term66465, term66465.getClass(), "lv_efct_id", 1065595802);
        setIntField(term66465, term66465.getClass(), "lv_plt_id", 21031843);
        setField(term66465, term66465.getClass(), "mdl_eqp_ary", "kdCYNMSuoD");
        setField(term66465, term66465.getClass(), "c_itm_eqp_ary", "eRYlSLwtvV");
        setField(term66465, term66465.getClass(), "ms_itm_flg_ary", "duOyJsARTD");
        setIntField(term66559, term66559.getClass(), "year", 2012);
        setShortField(term66559, term66559.getClass(), "month", (short) 8);
        setShortField(term66559, term66559.getClass(), "day", (short) 25);
        setField(term66558, term66558.getClass(), "date", term66559);
        setByteField(term66563, term66563.getClass(), "hour", (byte) 19);
        setByteField(term66563, term66563.getClass(), "minute", (byte) 49);
        setByteField(term66563, term66563.getClass(), "second", (byte) 8);
        setIntField(term66563, term66563.getClass(), "nano", 912685024);
        setField(term66558, term66558.getClass(), "time", term66563);
        setField(term66465, term66465.getClass(), "mdl_eqp_tm", term66558);
        setField(term66465, term66465.getClass(), "mdl_have", "xPnOHsNlyc");
        setField(term66465, term66465.getClass(), "cstmz_itm_have", "OTSPWPJefj");
        setBooleanField(term66465, term66465.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term66465, term66465.getClass(), "use_mdl_pri", true);
        setBooleanField(term66465, term66465.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term66465, term66465.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term66465, term66465.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term66465, term66465.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term66465, term66465.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term66465, term66465.getClass(), "vcld_pts", -380787857);
        setIntField(term66465, term66465.getClass(), "nxt_pv_id", 319853052);
        setField(term66465, term66465.getClass(), "nxt_dffclty", enum157);
        setField(term66465, term66465.getClass(), "nxt_edtn", enum158);
        setField(term66465, term66465.getClass(), "cv_cid", "EOTYMqXRmE");
        setField(term66465, term66465.getClass(), "cv_sc", "iTxNduwSjE");
        setField(term66465, term66465.getClass(), "cv_rr", "MQUTfIiFnh");
        setField(term66465, term66465.getClass(), "cv_bv", "JeyKRznnft");
        setField(term66465, term66465.getClass(), "cv_bf", "vQJUCtuYpK");
        setIntField(term66465, term66465.getClass(), "cnp_cid", -1097563716);
        setIntField(term66465, term66465.getClass(), "cnp_val", 1572907769);
        setField(term66465, term66465.getClass(), "cnp_rr", enum159);
        setField(term66465, term66465.getClass(), "cnp_sp", "GHtOeztAdz");
        setField(term66465, term66465.getClass(), "my_lst_0", "gSAtqakaLY");
        setField(term66465, term66465.getClass(), "my_lst_1", "taPBiMFNEZ");
        setField(term66465, term66465.getClass(), "my_lst_2", "NoAFAfGyYL");
        setField(term66465, term66465.getClass(), "my_lst_3", "MFtfkBMyOD");
        setField(term66465, term66465.getClass(), "my_lst_4", "rdiIyXfRtL");
        setField(term66465, term66465.getClass(), "dsp_clr_brdr", "douzkltmiI");
        setBooleanField(term66465, term66465.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term66465, term66465.getClass(), "dsp_clr_sts", true);
        setField(term66465, term66465.getClass(), "clr_sts", "MFKjhvLtpe");
        setBooleanField(term66465, term66465.getClass(), "rgo_sts", false);
        setField(term66465, term66465.getClass(), "my_qst_id", "xpbLKEsput");
        setField(term66465, term66465.getClass(), "my_qst_sts", "urlyLwPBVn");
        setField(term66465, term66465.getClass(), "my_qst_prgrs", "SPQVzOlOzZ");
        setField(term66465, term66465.getClass(), "my_qst_et", "bOUAgAptAI");
        setField(term66465, term66465.getClass(), "p_std_ie_have", "KSZfGbvzPE");
        setField(term66465, term66465.getClass(), "p_std_se_have", "YfgYGgzYER");
        setField(term66465, term66465.getClass(), "cmd", "IDClvDZuqE");
        setField(term66465, term66465.getClass(), "req_id", "cMvKxpZOvg");
        setField(term66465, term66465.getClass(), "stat", "WWBYemIuiK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNxt_dffclty", argTypes, term66465, args);
    }

};


