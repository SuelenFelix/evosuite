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

public class StartResponse_setCvsc_33214445491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191923;

    public StartResponse_setCvsc_33214445491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192376 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term192375 = ((Class) term192376).getDeclaredField((String) "SUCCESS");
        ((Field) term192375).setAccessible(true);
        Object enum456 = ((Field) term192375).get((Object) null);
        Class<? extends Object> term192644 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term192643 = ((Class) term192644).getDeclaredField((String) "MY_LIST_C");
        ((Field) term192643).setAccessible(true);
        Object enum457 = ((Field) term192643).get((Object) null);
        Class<? extends Object> term192978 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term192977 = ((Class) term192978).getDeclaredField((String) "EASY");
        ((Field) term192977).setAccessible(true);
        Object enum458 = ((Field) term192977).get((Object) null);
        Class<? extends Object> term193247 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term193246 = ((Class) term193247).getDeclaredField((String) "EXTRA");
        ((Field) term193246).setAccessible(true);
        Object enum459 = ((Field) term193246).get((Object) null);
        Class<? extends Object> term193554 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term193553 = ((Class) term193554).getDeclaredField((String) "SILVER");
        ((Field) term193553).setAccessible(true);
        Object enum460 = ((Field) term193553).get((Object) null);
        term191923 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term192021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192026 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term191923, term191923.getClass(), "pd_id", -1494372780);
        setField(term191923, term191923.getClass(), "start_result", enum456);
        setIntField(term191923, term191923.getClass(), "accept_idx", 703799187);
        setIntField(term191923, term191923.getClass(), "start_idx", -1305898281);
        setField(term191923, term191923.getClass(), "player_name", "DLfgyAqDDu");
        setIntField(term191923, term191923.getClass(), "hp_vol", 140501130);
        setBooleanField(term191923, term191923.getClass(), "btn_se_vol", true);
        setIntField(term191923, term191923.getClass(), "btn_se_vol2", -1458890291);
        setIntField(term191923, term191923.getClass(), "sldr_se_vol2", 1016087323);
        setField(term191923, term191923.getClass(), "sort_kind", enum457);
        setIntField(term191923, term191923.getClass(), "lv_num", 1957748979);
        setIntField(term191923, term191923.getClass(), "lv_pnt", -1290093259);
        setField(term191923, term191923.getClass(), "lv_str", "ryuQaXtwNj");
        setIntField(term191923, term191923.getClass(), "lv_efct_id", -1200934890);
        setIntField(term191923, term191923.getClass(), "lv_plt_id", 1765633108);
        setField(term191923, term191923.getClass(), "mdl_eqp_ary", "OutjKNDSgR");
        setField(term191923, term191923.getClass(), "c_itm_eqp_ary", "brfLLGXcwA");
        setField(term191923, term191923.getClass(), "ms_itm_flg_ary", "zoVKwYYMOI");
        setIntField(term192022, term192022.getClass(), "year", 2021);
        setShortField(term192022, term192022.getClass(), "month", (short) 4);
        setShortField(term192022, term192022.getClass(), "day", (short) 26);
        setField(term192021, term192021.getClass(), "date", term192022);
        setByteField(term192026, term192026.getClass(), "hour", (byte) 11);
        setByteField(term192026, term192026.getClass(), "minute", (byte) 34);
        setByteField(term192026, term192026.getClass(), "second", (byte) 15);
        setIntField(term192026, term192026.getClass(), "nano", 638206023);
        setField(term192021, term192021.getClass(), "time", term192026);
        setField(term191923, term191923.getClass(), "mdl_eqp_tm", term192021);
        setField(term191923, term191923.getClass(), "mdl_have", "DGCeQsmIOU");
        setField(term191923, term191923.getClass(), "cstmz_itm_have", "otcpSHwkzG");
        setBooleanField(term191923, term191923.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term191923, term191923.getClass(), "use_mdl_pri", false);
        setBooleanField(term191923, term191923.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term191923, term191923.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term191923, term191923.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term191923, term191923.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term191923, term191923.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term191923, term191923.getClass(), "vcld_pts", 1312888741);
        setIntField(term191923, term191923.getClass(), "nxt_pv_id", -1443680397);
        setField(term191923, term191923.getClass(), "nxt_dffclty", enum458);
        setField(term191923, term191923.getClass(), "nxt_edtn", enum459);
        setField(term191923, term191923.getClass(), "cv_cid", "BixZhUjVme");
        setField(term191923, term191923.getClass(), "cv_sc", "BmnUezUoWz");
        setField(term191923, term191923.getClass(), "cv_rr", "QqeCgeRpIS");
        setField(term191923, term191923.getClass(), "cv_bv", "xVwossmLda");
        setField(term191923, term191923.getClass(), "cv_bf", "EvSQeALexj");
        setIntField(term191923, term191923.getClass(), "cnp_cid", -1331169079);
        setIntField(term191923, term191923.getClass(), "cnp_val", 1109050836);
        setField(term191923, term191923.getClass(), "cnp_rr", enum460);
        setField(term191923, term191923.getClass(), "cnp_sp", "VuprBjhWdI");
        setField(term191923, term191923.getClass(), "my_lst_0", "CFGOXMbAUn");
        setField(term191923, term191923.getClass(), "my_lst_1", "OxlZVhvedR");
        setField(term191923, term191923.getClass(), "my_lst_2", "eoDtSQyUsr");
        setField(term191923, term191923.getClass(), "my_lst_3", "RMTgBohsAX");
        setField(term191923, term191923.getClass(), "my_lst_4", "kdYeXJnJGG");
        setField(term191923, term191923.getClass(), "dsp_clr_brdr", "XEdoshuvxD");
        setBooleanField(term191923, term191923.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term191923, term191923.getClass(), "dsp_clr_sts", true);
        setField(term191923, term191923.getClass(), "clr_sts", "ljtopXMcRl");
        setBooleanField(term191923, term191923.getClass(), "rgo_sts", false);
        setField(term191923, term191923.getClass(), "my_qst_id", "HHtcAGkfuz");
        setField(term191923, term191923.getClass(), "my_qst_sts", "QZCuYHcIBC");
        setField(term191923, term191923.getClass(), "my_qst_prgrs", "hpvoFaAyIu");
        setField(term191923, term191923.getClass(), "my_qst_et", "dyqukIBJxC");
        setField(term191923, term191923.getClass(), "p_std_ie_have", "MVMiGQdgnX");
        setField(term191923, term191923.getClass(), "p_std_se_have", "cQnJIENJHe");
        setField(term191923, term191923.getClass(), "cmd", "ExjdCvAxlG");
        setField(term191923, term191923.getClass(), "req_id", "moMySSiBuB");
        setField(term191923, term191923.getClass(), "stat", "iuuazALDWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GqehccUels";
        callMethod(klass, "setCv_sc", argTypes, term191923, args);
    }

};


