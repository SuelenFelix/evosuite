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
import java.lang.Integer;

public class StartResponse_setStartidx_101744775961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128909;
     Object term129352;

    public StartResponse_setStartidx_101744775961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term129355 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term129354 = ((Class) term129355).getDeclaredField((String) "SUCCESS");
        ((Field) term129354).setAccessible(true);
        Object enum305 = ((Field) term129354).get((Object) null);
        Class<? extends Object> term129623 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term129622 = ((Class) term129623).getDeclaredField((String) "MY_LIST_A");
        ((Field) term129622).setAccessible(true);
        Object enum306 = ((Field) term129622).get((Object) null);
        Class<? extends Object> term129957 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term129956 = ((Class) term129957).getDeclaredField((String) "NORMAL");
        ((Field) term129956).setAccessible(true);
        Object enum307 = ((Field) term129956).get((Object) null);
        Class<? extends Object> term130232 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term130231 = ((Class) term130232).getDeclaredField((String) "ORIGINAL");
        ((Field) term130231).setAccessible(true);
        Object enum308 = ((Field) term130231).get((Object) null);
        Class<? extends Object> term130548 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term130547 = ((Class) term130548).getDeclaredField((String) "NONE");
        ((Field) term130547).setAccessible(true);
        Object enum309 = ((Field) term130547).get((Object) null);
        term128909 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term129007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129012 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term128909, term128909.getClass(), "pd_id", -232352320);
        setField(term128909, term128909.getClass(), "start_result", enum305);
        setIntField(term128909, term128909.getClass(), "accept_idx", -232333014);
        setIntField(term128909, term128909.getClass(), "start_idx", -139694079);
        setField(term128909, term128909.getClass(), "player_name", "rKIvvYydou");
        setIntField(term128909, term128909.getClass(), "hp_vol", -1602072035);
        setBooleanField(term128909, term128909.getClass(), "btn_se_vol", false);
        setIntField(term128909, term128909.getClass(), "btn_se_vol2", 1902624392);
        setIntField(term128909, term128909.getClass(), "sldr_se_vol2", 904607217);
        setField(term128909, term128909.getClass(), "sort_kind", enum306);
        setIntField(term128909, term128909.getClass(), "lv_num", 434914590);
        setIntField(term128909, term128909.getClass(), "lv_pnt", 1983756621);
        setField(term128909, term128909.getClass(), "lv_str", "KNgeIkQoef");
        setIntField(term128909, term128909.getClass(), "lv_efct_id", -2134711835);
        setIntField(term128909, term128909.getClass(), "lv_plt_id", -1641244494);
        setField(term128909, term128909.getClass(), "mdl_eqp_ary", "MeMWAHyjMR");
        setField(term128909, term128909.getClass(), "c_itm_eqp_ary", "lTuLOcnSnJ");
        setField(term128909, term128909.getClass(), "ms_itm_flg_ary", "govbBrRstA");
        setIntField(term129008, term129008.getClass(), "year", 2029);
        setShortField(term129008, term129008.getClass(), "month", (short) 1);
        setShortField(term129008, term129008.getClass(), "day", (short) 10);
        setField(term129007, term129007.getClass(), "date", term129008);
        setByteField(term129012, term129012.getClass(), "hour", (byte) 8);
        setByteField(term129012, term129012.getClass(), "minute", (byte) 46);
        setByteField(term129012, term129012.getClass(), "second", (byte) 35);
        setIntField(term129012, term129012.getClass(), "nano", 58807194);
        setField(term129007, term129007.getClass(), "time", term129012);
        setField(term128909, term128909.getClass(), "mdl_eqp_tm", term129007);
        setField(term128909, term128909.getClass(), "mdl_have", "zSMUNzRRyM");
        setField(term128909, term128909.getClass(), "cstmz_itm_have", "aKwJiIZSjJ");
        setBooleanField(term128909, term128909.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term128909, term128909.getClass(), "use_mdl_pri", true);
        setBooleanField(term128909, term128909.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term128909, term128909.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term128909, term128909.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term128909, term128909.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term128909, term128909.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term128909, term128909.getClass(), "vcld_pts", 1124282188);
        setIntField(term128909, term128909.getClass(), "nxt_pv_id", -489441521);
        setField(term128909, term128909.getClass(), "nxt_dffclty", enum307);
        setField(term128909, term128909.getClass(), "nxt_edtn", enum308);
        setField(term128909, term128909.getClass(), "cv_cid", "lYbeaINKud");
        setField(term128909, term128909.getClass(), "cv_sc", "BrwuUkkatt");
        setField(term128909, term128909.getClass(), "cv_rr", "NjmSJhbVEM");
        setField(term128909, term128909.getClass(), "cv_bv", "aftnGRjhKN");
        setField(term128909, term128909.getClass(), "cv_bf", "TirWkyiCHh");
        setIntField(term128909, term128909.getClass(), "cnp_cid", 225873732);
        setIntField(term128909, term128909.getClass(), "cnp_val", 529879356);
        setField(term128909, term128909.getClass(), "cnp_rr", enum309);
        setField(term128909, term128909.getClass(), "cnp_sp", "lsQrIFMkgZ");
        setField(term128909, term128909.getClass(), "my_lst_0", "VgAyBhgBhq");
        setField(term128909, term128909.getClass(), "my_lst_1", "nhpssUKjpK");
        setField(term128909, term128909.getClass(), "my_lst_2", "lnJVsFNsCN");
        setField(term128909, term128909.getClass(), "my_lst_3", "CUagRkEuzN");
        setField(term128909, term128909.getClass(), "my_lst_4", "eWIWfWobXm");
        setField(term128909, term128909.getClass(), "dsp_clr_brdr", "lkPJVVXhDd");
        setBooleanField(term128909, term128909.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term128909, term128909.getClass(), "dsp_clr_sts", true);
        setField(term128909, term128909.getClass(), "clr_sts", "OpMnUyJTrb");
        setBooleanField(term128909, term128909.getClass(), "rgo_sts", true);
        setField(term128909, term128909.getClass(), "my_qst_id", "ACBGZgugev");
        setField(term128909, term128909.getClass(), "my_qst_sts", "rcbQDpUkab");
        setField(term128909, term128909.getClass(), "my_qst_prgrs", "oZAbUeXmhW");
        setField(term128909, term128909.getClass(), "my_qst_et", "NDSDpOeQda");
        setField(term128909, term128909.getClass(), "p_std_ie_have", "HlKwxzAqTg");
        setField(term128909, term128909.getClass(), "p_std_se_have", "xKjkdjTYfe");
        setField(term128909, term128909.getClass(), "cmd", "HcfabJkuEQ");
        setField(term128909, term128909.getClass(), "req_id", "JlnoFYxLfk");
        setField(term128909, term128909.getClass(), "stat", "tMMLkDkFYW");
        term129352 = new Integer(18072182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129352;
        callMethod(klass, "setStart_idx", argTypes, term128909, args);
    }

};


