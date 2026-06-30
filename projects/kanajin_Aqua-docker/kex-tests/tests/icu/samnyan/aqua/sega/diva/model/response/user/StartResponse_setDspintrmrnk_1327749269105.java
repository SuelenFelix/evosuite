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

public class StartResponse_setDspintrmrnk_1327749269105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221654;
     Object term222097;

    public StartResponse_setDspintrmrnk_1327749269105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222100 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term222099 = ((Class) term222100).getDeclaredField((String) "SUCCESS");
        ((Field) term222099).setAccessible(true);
        Object enum527 = ((Field) term222099).get((Object) null);
        Class<? extends Object> term222368 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term222367 = ((Class) term222368).getDeclaredField((String) "MY_LIST_A");
        ((Field) term222367).setAccessible(true);
        Object enum528 = ((Field) term222367).get((Object) null);
        Class<? extends Object> term222702 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term222701 = ((Class) term222702).getDeclaredField((String) "UNDEFINED");
        ((Field) term222701).setAccessible(true);
        Object enum529 = ((Field) term222701).get((Object) null);
        Class<? extends Object> term222986 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term222985 = ((Class) term222986).getDeclaredField((String) "EXTRA");
        ((Field) term222985).setAccessible(true);
        Object enum530 = ((Field) term222985).get((Object) null);
        Class<? extends Object> term223293 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term223292 = ((Class) term223293).getDeclaredField((String) "GOLD");
        ((Field) term223292).setAccessible(true);
        Object enum531 = ((Field) term223292).get((Object) null);
        term221654 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term221752 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221753 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221757 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term221654, term221654.getClass(), "pd_id", 1844345719);
        setField(term221654, term221654.getClass(), "start_result", enum527);
        setIntField(term221654, term221654.getClass(), "accept_idx", 1704024265);
        setIntField(term221654, term221654.getClass(), "start_idx", 501801161);
        setField(term221654, term221654.getClass(), "player_name", "GuQzOBxsNv");
        setIntField(term221654, term221654.getClass(), "hp_vol", 2103971768);
        setBooleanField(term221654, term221654.getClass(), "btn_se_vol", true);
        setIntField(term221654, term221654.getClass(), "btn_se_vol2", -939132796);
        setIntField(term221654, term221654.getClass(), "sldr_se_vol2", 159279866);
        setField(term221654, term221654.getClass(), "sort_kind", enum528);
        setIntField(term221654, term221654.getClass(), "lv_num", 138122227);
        setIntField(term221654, term221654.getClass(), "lv_pnt", 1795358995);
        setField(term221654, term221654.getClass(), "lv_str", "YxcYXGDyZx");
        setIntField(term221654, term221654.getClass(), "lv_efct_id", -781185864);
        setIntField(term221654, term221654.getClass(), "lv_plt_id", 340500914);
        setField(term221654, term221654.getClass(), "mdl_eqp_ary", "dubNMHmdjy");
        setField(term221654, term221654.getClass(), "c_itm_eqp_ary", "vYzdCPfleW");
        setField(term221654, term221654.getClass(), "ms_itm_flg_ary", "AXVMtieJQT");
        setIntField(term221753, term221753.getClass(), "year", 2021);
        setShortField(term221753, term221753.getClass(), "month", (short) 8);
        setShortField(term221753, term221753.getClass(), "day", (short) 27);
        setField(term221752, term221752.getClass(), "date", term221753);
        setByteField(term221757, term221757.getClass(), "hour", (byte) 20);
        setByteField(term221757, term221757.getClass(), "minute", (byte) 11);
        setByteField(term221757, term221757.getClass(), "second", (byte) 47);
        setIntField(term221757, term221757.getClass(), "nano", 116303493);
        setField(term221752, term221752.getClass(), "time", term221757);
        setField(term221654, term221654.getClass(), "mdl_eqp_tm", term221752);
        setField(term221654, term221654.getClass(), "mdl_have", "BKaXfQaGqm");
        setField(term221654, term221654.getClass(), "cstmz_itm_have", "OpadJlQqJc");
        setBooleanField(term221654, term221654.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term221654, term221654.getClass(), "use_mdl_pri", false);
        setBooleanField(term221654, term221654.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term221654, term221654.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term221654, term221654.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term221654, term221654.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term221654, term221654.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term221654, term221654.getClass(), "vcld_pts", -2061712635);
        setIntField(term221654, term221654.getClass(), "nxt_pv_id", 1182911731);
        setField(term221654, term221654.getClass(), "nxt_dffclty", enum529);
        setField(term221654, term221654.getClass(), "nxt_edtn", enum530);
        setField(term221654, term221654.getClass(), "cv_cid", "ZXdFbwHLvQ");
        setField(term221654, term221654.getClass(), "cv_sc", "VEastYHDbF");
        setField(term221654, term221654.getClass(), "cv_rr", "CVrxrIRbBP");
        setField(term221654, term221654.getClass(), "cv_bv", "qMveUiByVL");
        setField(term221654, term221654.getClass(), "cv_bf", "VfhPQKCIrE");
        setIntField(term221654, term221654.getClass(), "cnp_cid", 644726932);
        setIntField(term221654, term221654.getClass(), "cnp_val", -1515977761);
        setField(term221654, term221654.getClass(), "cnp_rr", enum531);
        setField(term221654, term221654.getClass(), "cnp_sp", "RUgpUeqcGS");
        setField(term221654, term221654.getClass(), "my_lst_0", "ufopOhWQkB");
        setField(term221654, term221654.getClass(), "my_lst_1", "RqVPcaMpxk");
        setField(term221654, term221654.getClass(), "my_lst_2", "zOsnJKDwhL");
        setField(term221654, term221654.getClass(), "my_lst_3", "VCOuRNQveV");
        setField(term221654, term221654.getClass(), "my_lst_4", "wOBUMePcSQ");
        setField(term221654, term221654.getClass(), "dsp_clr_brdr", "SkfJvbcpSy");
        setBooleanField(term221654, term221654.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term221654, term221654.getClass(), "dsp_clr_sts", false);
        setField(term221654, term221654.getClass(), "clr_sts", "NQVfrHmuUQ");
        setBooleanField(term221654, term221654.getClass(), "rgo_sts", true);
        setField(term221654, term221654.getClass(), "my_qst_id", "BxUEPMTBxW");
        setField(term221654, term221654.getClass(), "my_qst_sts", "OkwcYhqTPO");
        setField(term221654, term221654.getClass(), "my_qst_prgrs", "XeHaPiTvPt");
        setField(term221654, term221654.getClass(), "my_qst_et", "GsyGZIlHgo");
        setField(term221654, term221654.getClass(), "p_std_ie_have", "DPTUtDUuOf");
        setField(term221654, term221654.getClass(), "p_std_se_have", "TwTeGrJqeV");
        setField(term221654, term221654.getClass(), "cmd", "EmqjtKbtwp");
        setField(term221654, term221654.getClass(), "req_id", "BIcjuljzhc");
        setField(term221654, term221654.getClass(), "stat", "SQDHGXSyaX");
        term222097 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term222097;
        callMethod(klass, "setDsp_intrm_rnk", argTypes, term221654, args);
    }

};


