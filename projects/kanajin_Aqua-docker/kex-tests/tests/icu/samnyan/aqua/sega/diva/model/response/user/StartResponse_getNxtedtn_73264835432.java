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

public class StartResponse_getNxtedtn_73264835432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68531;

    public StartResponse_getNxtedtn_73264835432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68975 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term68974 = ((Class) term68975).getDeclaredField((String) "SUCCESS");
        ((Field) term68974).setAccessible(true);
        Object enum160 = ((Field) term68974).get((Object) null);
        Class<? extends Object> term69243 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term69242 = ((Class) term69243).getDeclaredField((String) "MY_LIST_A");
        ((Field) term69242).setAccessible(true);
        Object enum161 = ((Field) term69242).get((Object) null);
        Class<? extends Object> term69577 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term69576 = ((Class) term69577).getDeclaredField((String) "UNDEFINED");
        ((Field) term69576).setAccessible(true);
        Object enum162 = ((Field) term69576).get((Object) null);
        Class<? extends Object> term69861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term69860 = ((Class) term69861).getDeclaredField((String) "EXTRA");
        ((Field) term69860).setAccessible(true);
        Object enum163 = ((Field) term69860).get((Object) null);
        Class<? extends Object> term70168 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term70167 = ((Class) term70168).getDeclaredField((String) "GOLD");
        ((Field) term70167).setAccessible(true);
        Object enum164 = ((Field) term70167).get((Object) null);
        term68531 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term68629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term68630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term68634 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term68531, term68531.getClass(), "pd_id", 1608016787);
        setField(term68531, term68531.getClass(), "start_result", enum160);
        setIntField(term68531, term68531.getClass(), "accept_idx", -516303035);
        setIntField(term68531, term68531.getClass(), "start_idx", -2143043890);
        setField(term68531, term68531.getClass(), "player_name", "nHYQYkycCR");
        setIntField(term68531, term68531.getClass(), "hp_vol", -2138825831);
        setBooleanField(term68531, term68531.getClass(), "btn_se_vol", true);
        setIntField(term68531, term68531.getClass(), "btn_se_vol2", 1454781562);
        setIntField(term68531, term68531.getClass(), "sldr_se_vol2", -27944011);
        setField(term68531, term68531.getClass(), "sort_kind", enum161);
        setIntField(term68531, term68531.getClass(), "lv_num", -20614472);
        setIntField(term68531, term68531.getClass(), "lv_pnt", 1126618861);
        setField(term68531, term68531.getClass(), "lv_str", "yBiVacDcZX");
        setIntField(term68531, term68531.getClass(), "lv_efct_id", 947449400);
        setIntField(term68531, term68531.getClass(), "lv_plt_id", -763799087);
        setField(term68531, term68531.getClass(), "mdl_eqp_ary", "QrKfEgQeoy");
        setField(term68531, term68531.getClass(), "c_itm_eqp_ary", "oApgdbwnti");
        setField(term68531, term68531.getClass(), "ms_itm_flg_ary", "YcgHACNgyo");
        setIntField(term68630, term68630.getClass(), "year", 2012);
        setShortField(term68630, term68630.getClass(), "month", (short) 3);
        setShortField(term68630, term68630.getClass(), "day", (short) 27);
        setField(term68629, term68629.getClass(), "date", term68630);
        setByteField(term68634, term68634.getClass(), "hour", (byte) 17);
        setByteField(term68634, term68634.getClass(), "minute", (byte) 49);
        setByteField(term68634, term68634.getClass(), "second", (byte) 24);
        setIntField(term68634, term68634.getClass(), "nano", 530647398);
        setField(term68629, term68629.getClass(), "time", term68634);
        setField(term68531, term68531.getClass(), "mdl_eqp_tm", term68629);
        setField(term68531, term68531.getClass(), "mdl_have", "MrUPJzBTEn");
        setField(term68531, term68531.getClass(), "cstmz_itm_have", "IaSymdfFGa");
        setBooleanField(term68531, term68531.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term68531, term68531.getClass(), "use_mdl_pri", false);
        setBooleanField(term68531, term68531.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term68531, term68531.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term68531, term68531.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term68531, term68531.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term68531, term68531.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term68531, term68531.getClass(), "vcld_pts", 1207142014);
        setIntField(term68531, term68531.getClass(), "nxt_pv_id", -876426634);
        setField(term68531, term68531.getClass(), "nxt_dffclty", enum162);
        setField(term68531, term68531.getClass(), "nxt_edtn", enum163);
        setField(term68531, term68531.getClass(), "cv_cid", "FxSvJCIpul");
        setField(term68531, term68531.getClass(), "cv_sc", "HCjKwpexJj");
        setField(term68531, term68531.getClass(), "cv_rr", "sCpIHVPdfl");
        setField(term68531, term68531.getClass(), "cv_bv", "lMUBBGRjfY");
        setField(term68531, term68531.getClass(), "cv_bf", "olYpqbolWL");
        setIntField(term68531, term68531.getClass(), "cnp_cid", 213831054);
        setIntField(term68531, term68531.getClass(), "cnp_val", 330043745);
        setField(term68531, term68531.getClass(), "cnp_rr", enum164);
        setField(term68531, term68531.getClass(), "cnp_sp", "MCMCjxXzjw");
        setField(term68531, term68531.getClass(), "my_lst_0", "pZbbwCURge");
        setField(term68531, term68531.getClass(), "my_lst_1", "RsOfgdMCMv");
        setField(term68531, term68531.getClass(), "my_lst_2", "nsofCJqJOR");
        setField(term68531, term68531.getClass(), "my_lst_3", "CitJiZwsjF");
        setField(term68531, term68531.getClass(), "my_lst_4", "ZiyMvLArWJ");
        setField(term68531, term68531.getClass(), "dsp_clr_brdr", "MaeokjEfWD");
        setBooleanField(term68531, term68531.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term68531, term68531.getClass(), "dsp_clr_sts", true);
        setField(term68531, term68531.getClass(), "clr_sts", "ocZcumnXEz");
        setBooleanField(term68531, term68531.getClass(), "rgo_sts", true);
        setField(term68531, term68531.getClass(), "my_qst_id", "rNNwyactDR");
        setField(term68531, term68531.getClass(), "my_qst_sts", "QJrTMTdxyh");
        setField(term68531, term68531.getClass(), "my_qst_prgrs", "rgZSPplPSs");
        setField(term68531, term68531.getClass(), "my_qst_et", "NPUSTXlEKx");
        setField(term68531, term68531.getClass(), "p_std_ie_have", "KKFprGoNpl");
        setField(term68531, term68531.getClass(), "p_std_se_have", "tWVISJlxKZ");
        setField(term68531, term68531.getClass(), "cmd", "rOZkUKEoaf");
        setField(term68531, term68531.getClass(), "req_id", "yLnzGqyHGL");
        setField(term68531, term68531.getClass(), "stat", "IjprPXBDuY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNxt_edtn", argTypes, term68531, args);
    }

};


