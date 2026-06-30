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

public class StartResponse_getCvcid_156401140033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70621;

    public StartResponse_getCvcid_156401140033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71060 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term71059 = ((Class) term71060).getDeclaredField((String) "SUCCESS");
        ((Field) term71059).setAccessible(true);
        Object enum165 = ((Field) term71059).get((Object) null);
        Class<? extends Object> term71328 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term71327 = ((Class) term71328).getDeclaredField((String) "NAME");
        ((Field) term71327).setAccessible(true);
        Object enum166 = ((Field) term71327).get((Object) null);
        Class<? extends Object> term71647 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term71646 = ((Class) term71647).getDeclaredField((String) "UNDEFINED");
        ((Field) term71646).setAccessible(true);
        Object enum167 = ((Field) term71646).get((Object) null);
        Class<? extends Object> term71931 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term71930 = ((Class) term71931).getDeclaredField((String) "EXTRA");
        ((Field) term71930).setAccessible(true);
        Object enum168 = ((Field) term71930).get((Object) null);
        Class<? extends Object> term72238 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term72237 = ((Class) term72238).getDeclaredField((String) "GOLD");
        ((Field) term72237).setAccessible(true);
        Object enum169 = ((Field) term72237).get((Object) null);
        term70621 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term70714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70719 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term70621, term70621.getClass(), "pd_id", -509349195);
        setField(term70621, term70621.getClass(), "start_result", enum165);
        setIntField(term70621, term70621.getClass(), "accept_idx", -1639041228);
        setIntField(term70621, term70621.getClass(), "start_idx", 2027686272);
        setField(term70621, term70621.getClass(), "player_name", "wkqPmmFDAa");
        setIntField(term70621, term70621.getClass(), "hp_vol", -1494356104);
        setBooleanField(term70621, term70621.getClass(), "btn_se_vol", true);
        setIntField(term70621, term70621.getClass(), "btn_se_vol2", -695279311);
        setIntField(term70621, term70621.getClass(), "sldr_se_vol2", 114279242);
        setField(term70621, term70621.getClass(), "sort_kind", enum166);
        setIntField(term70621, term70621.getClass(), "lv_num", 990883365);
        setIntField(term70621, term70621.getClass(), "lv_pnt", 633598642);
        setField(term70621, term70621.getClass(), "lv_str", "rLTDtNqLyW");
        setIntField(term70621, term70621.getClass(), "lv_efct_id", 1862841859);
        setIntField(term70621, term70621.getClass(), "lv_plt_id", -1114668574);
        setField(term70621, term70621.getClass(), "mdl_eqp_ary", "CLsbWobdgS");
        setField(term70621, term70621.getClass(), "c_itm_eqp_ary", "TbYrjEyFPc");
        setField(term70621, term70621.getClass(), "ms_itm_flg_ary", "muefchpJiZ");
        setIntField(term70715, term70715.getClass(), "year", 2010);
        setShortField(term70715, term70715.getClass(), "month", (short) 6);
        setShortField(term70715, term70715.getClass(), "day", (short) 14);
        setField(term70714, term70714.getClass(), "date", term70715);
        setByteField(term70719, term70719.getClass(), "hour", (byte) 6);
        setByteField(term70719, term70719.getClass(), "minute", (byte) 22);
        setByteField(term70719, term70719.getClass(), "second", (byte) 20);
        setIntField(term70719, term70719.getClass(), "nano", 25133051);
        setField(term70714, term70714.getClass(), "time", term70719);
        setField(term70621, term70621.getClass(), "mdl_eqp_tm", term70714);
        setField(term70621, term70621.getClass(), "mdl_have", "tuYaAqvYrh");
        setField(term70621, term70621.getClass(), "cstmz_itm_have", "CIbhheukbR");
        setBooleanField(term70621, term70621.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term70621, term70621.getClass(), "use_mdl_pri", true);
        setBooleanField(term70621, term70621.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term70621, term70621.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term70621, term70621.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term70621, term70621.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term70621, term70621.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term70621, term70621.getClass(), "vcld_pts", 514511037);
        setIntField(term70621, term70621.getClass(), "nxt_pv_id", 1713573821);
        setField(term70621, term70621.getClass(), "nxt_dffclty", enum167);
        setField(term70621, term70621.getClass(), "nxt_edtn", enum168);
        setField(term70621, term70621.getClass(), "cv_cid", "VOHPpErtan");
        setField(term70621, term70621.getClass(), "cv_sc", "GDMUlolTNs");
        setField(term70621, term70621.getClass(), "cv_rr", "xpLvWisjzN");
        setField(term70621, term70621.getClass(), "cv_bv", "IKfozyyKEj");
        setField(term70621, term70621.getClass(), "cv_bf", "thCjwQjRBL");
        setIntField(term70621, term70621.getClass(), "cnp_cid", 1956590498);
        setIntField(term70621, term70621.getClass(), "cnp_val", 1467356494);
        setField(term70621, term70621.getClass(), "cnp_rr", enum169);
        setField(term70621, term70621.getClass(), "cnp_sp", "ojLrjltndD");
        setField(term70621, term70621.getClass(), "my_lst_0", "VJtFSexKat");
        setField(term70621, term70621.getClass(), "my_lst_1", "xPVddlPSQR");
        setField(term70621, term70621.getClass(), "my_lst_2", "MxrhCLTMTH");
        setField(term70621, term70621.getClass(), "my_lst_3", "kEehLMZcOU");
        setField(term70621, term70621.getClass(), "my_lst_4", "RhLliqMiOF");
        setField(term70621, term70621.getClass(), "dsp_clr_brdr", "jlhonEGrJH");
        setBooleanField(term70621, term70621.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term70621, term70621.getClass(), "dsp_clr_sts", false);
        setField(term70621, term70621.getClass(), "clr_sts", "RKcKwlEYZb");
        setBooleanField(term70621, term70621.getClass(), "rgo_sts", true);
        setField(term70621, term70621.getClass(), "my_qst_id", "acPRDlpsid");
        setField(term70621, term70621.getClass(), "my_qst_sts", "YyojIzvxLZ");
        setField(term70621, term70621.getClass(), "my_qst_prgrs", "fxapaYlZea");
        setField(term70621, term70621.getClass(), "my_qst_et", "VJgREHwfRM");
        setField(term70621, term70621.getClass(), "p_std_ie_have", "kXnpLIZTAr");
        setField(term70621, term70621.getClass(), "p_std_se_have", "ZiMAmqpbzk");
        setField(term70621, term70621.getClass(), "cmd", "UwJtBPAtSU");
        setField(term70621, term70621.getClass(), "req_id", "nBaMiSdFmS");
        setField(term70621, term70621.getClass(), "stat", "ezwGsjqTai");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCv_cid", argTypes, term70621, args);
    }

};


