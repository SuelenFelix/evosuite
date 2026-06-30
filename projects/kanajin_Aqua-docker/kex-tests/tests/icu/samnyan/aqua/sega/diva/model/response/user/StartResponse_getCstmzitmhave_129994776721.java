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

public class StartResponse_getCstmzitmhave_129994776721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45653;

    public StartResponse_getCstmzitmhave_129994776721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46096 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term46095 = ((Class) term46096).getDeclaredField((String) "SUCCESS");
        ((Field) term46095).setAccessible(true);
        Object enum105 = ((Field) term46095).get((Object) null);
        Class<? extends Object> term46364 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term46363 = ((Class) term46364).getDeclaredField((String) "COMPLEXITY");
        ((Field) term46363).setAccessible(true);
        Object enum106 = ((Field) term46363).get((Object) null);
        Class<? extends Object> term46701 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term46700 = ((Class) term46701).getDeclaredField((String) "EXTREME");
        ((Field) term46700).setAccessible(true);
        Object enum107 = ((Field) term46700).get((Object) null);
        Class<? extends Object> term46979 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term46978 = ((Class) term46979).getDeclaredField((String) "EXTRA");
        ((Field) term46978).setAccessible(true);
        Object enum108 = ((Field) term46978).get((Object) null);
        Class<? extends Object> term47286 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term47285 = ((Class) term47286).getDeclaredField((String) "GOLD");
        ((Field) term47285).setAccessible(true);
        Object enum109 = ((Field) term47285).get((Object) null);
        term45653 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term45752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45757 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term45653, term45653.getClass(), "pd_id", -1332748804);
        setField(term45653, term45653.getClass(), "start_result", enum105);
        setIntField(term45653, term45653.getClass(), "accept_idx", 1774507971);
        setIntField(term45653, term45653.getClass(), "start_idx", -1420269858);
        setField(term45653, term45653.getClass(), "player_name", "bIrtpkYJWT");
        setIntField(term45653, term45653.getClass(), "hp_vol", -2119545015);
        setBooleanField(term45653, term45653.getClass(), "btn_se_vol", true);
        setIntField(term45653, term45653.getClass(), "btn_se_vol2", 1272542218);
        setIntField(term45653, term45653.getClass(), "sldr_se_vol2", 1209799204);
        setField(term45653, term45653.getClass(), "sort_kind", enum106);
        setIntField(term45653, term45653.getClass(), "lv_num", 1094107751);
        setIntField(term45653, term45653.getClass(), "lv_pnt", 844222656);
        setField(term45653, term45653.getClass(), "lv_str", "VuLLXpvPpZ");
        setIntField(term45653, term45653.getClass(), "lv_efct_id", -18216811);
        setIntField(term45653, term45653.getClass(), "lv_plt_id", -1813280137);
        setField(term45653, term45653.getClass(), "mdl_eqp_ary", "UEdzEKEEEV");
        setField(term45653, term45653.getClass(), "c_itm_eqp_ary", "BcENaQFYSd");
        setField(term45653, term45653.getClass(), "ms_itm_flg_ary", "POPYycoDBy");
        setIntField(term45753, term45753.getClass(), "year", 2023);
        setShortField(term45753, term45753.getClass(), "month", (short) 3);
        setShortField(term45753, term45753.getClass(), "day", (short) 7);
        setField(term45752, term45752.getClass(), "date", term45753);
        setByteField(term45757, term45757.getClass(), "hour", (byte) 21);
        setByteField(term45757, term45757.getClass(), "minute", (byte) 15);
        setByteField(term45757, term45757.getClass(), "second", (byte) 43);
        setIntField(term45757, term45757.getClass(), "nano", 639721472);
        setField(term45752, term45752.getClass(), "time", term45757);
        setField(term45653, term45653.getClass(), "mdl_eqp_tm", term45752);
        setField(term45653, term45653.getClass(), "mdl_have", "LuWMOXdAPA");
        setField(term45653, term45653.getClass(), "cstmz_itm_have", "blSffTnsOv");
        setBooleanField(term45653, term45653.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term45653, term45653.getClass(), "use_mdl_pri", false);
        setBooleanField(term45653, term45653.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term45653, term45653.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term45653, term45653.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term45653, term45653.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term45653, term45653.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term45653, term45653.getClass(), "vcld_pts", 719656595);
        setIntField(term45653, term45653.getClass(), "nxt_pv_id", -1516995753);
        setField(term45653, term45653.getClass(), "nxt_dffclty", enum107);
        setField(term45653, term45653.getClass(), "nxt_edtn", enum108);
        setField(term45653, term45653.getClass(), "cv_cid", "qbUMcIvEXH");
        setField(term45653, term45653.getClass(), "cv_sc", "TVxGTjeDcu");
        setField(term45653, term45653.getClass(), "cv_rr", "ABPtcyCzkR");
        setField(term45653, term45653.getClass(), "cv_bv", "QgHhxMyKvr");
        setField(term45653, term45653.getClass(), "cv_bf", "VGiXZZTWRO");
        setIntField(term45653, term45653.getClass(), "cnp_cid", -390501023);
        setIntField(term45653, term45653.getClass(), "cnp_val", -1667482829);
        setField(term45653, term45653.getClass(), "cnp_rr", enum109);
        setField(term45653, term45653.getClass(), "cnp_sp", "MlPtwXnJOJ");
        setField(term45653, term45653.getClass(), "my_lst_0", "DbfiyFeaTe");
        setField(term45653, term45653.getClass(), "my_lst_1", "dQxXGBtDLZ");
        setField(term45653, term45653.getClass(), "my_lst_2", "EgSgEFIyyN");
        setField(term45653, term45653.getClass(), "my_lst_3", "iAOFcXaLSf");
        setField(term45653, term45653.getClass(), "my_lst_4", "EHoNUaeyvT");
        setField(term45653, term45653.getClass(), "dsp_clr_brdr", "ZwKmasCVIy");
        setBooleanField(term45653, term45653.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term45653, term45653.getClass(), "dsp_clr_sts", false);
        setField(term45653, term45653.getClass(), "clr_sts", "pxokrVaeMd");
        setBooleanField(term45653, term45653.getClass(), "rgo_sts", true);
        setField(term45653, term45653.getClass(), "my_qst_id", "ujxmmZZcbT");
        setField(term45653, term45653.getClass(), "my_qst_sts", "BOvgwHfoHQ");
        setField(term45653, term45653.getClass(), "my_qst_prgrs", "hPpFNeDBIb");
        setField(term45653, term45653.getClass(), "my_qst_et", "DNOtiLPAIY");
        setField(term45653, term45653.getClass(), "p_std_ie_have", "FnEkAHBfyV");
        setField(term45653, term45653.getClass(), "p_std_se_have", "VfmNFpEuax");
        setField(term45653, term45653.getClass(), "cmd", "ANHjlWPmZG");
        setField(term45653, term45653.getClass(), "req_id", "SibzENsyyy");
        setField(term45653, term45653.getClass(), "stat", "mrqGHotaef");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCstmz_itm_have", argTypes, term45653, args);
    }

};


