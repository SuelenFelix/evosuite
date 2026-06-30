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

public class StartResponse_setAcceptidx_120954591360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126821;
     Object term127263;

    public StartResponse_setAcceptidx_120954591360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term127266 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term127265 = ((Class) term127266).getDeclaredField((String) "FAILED");
        ((Field) term127265).setAccessible(true);
        Object enum300 = ((Field) term127265).get((Object) null);
        Class<? extends Object> term127531 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term127530 = ((Class) term127531).getDeclaredField((String) "MY_LIST_B");
        ((Field) term127530).setAccessible(true);
        Object enum301 = ((Field) term127530).get((Object) null);
        Class<? extends Object> term127865 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term127864 = ((Class) term127865).getDeclaredField((String) "EASY");
        ((Field) term127864).setAccessible(true);
        Object enum302 = ((Field) term127864).get((Object) null);
        Class<? extends Object> term128134 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term128133 = ((Class) term128134).getDeclaredField((String) "ORIGINAL");
        ((Field) term128133).setAccessible(true);
        Object enum303 = ((Field) term128133).get((Object) null);
        Class<? extends Object> term128450 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term128449 = ((Class) term128450).getDeclaredField((String) "BRONZE");
        ((Field) term128449).setAccessible(true);
        Object enum304 = ((Field) term128449).get((Object) null);
        term126821 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term126918 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term126919 = newInstance(Class.forName("java.time.LocalDate"));
        Object term126923 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term126821, term126821.getClass(), "pd_id", 1822317628);
        setField(term126821, term126821.getClass(), "start_result", enum300);
        setIntField(term126821, term126821.getClass(), "accept_idx", -608830309);
        setIntField(term126821, term126821.getClass(), "start_idx", -537786484);
        setField(term126821, term126821.getClass(), "player_name", "mBrbyQVzve");
        setIntField(term126821, term126821.getClass(), "hp_vol", 263859424);
        setBooleanField(term126821, term126821.getClass(), "btn_se_vol", false);
        setIntField(term126821, term126821.getClass(), "btn_se_vol2", 1436978289);
        setIntField(term126821, term126821.getClass(), "sldr_se_vol2", 696225243);
        setField(term126821, term126821.getClass(), "sort_kind", enum301);
        setIntField(term126821, term126821.getClass(), "lv_num", -1421649118);
        setIntField(term126821, term126821.getClass(), "lv_pnt", -511248284);
        setField(term126821, term126821.getClass(), "lv_str", "FQODEbQeKa");
        setIntField(term126821, term126821.getClass(), "lv_efct_id", 788630042);
        setIntField(term126821, term126821.getClass(), "lv_plt_id", 1430066560);
        setField(term126821, term126821.getClass(), "mdl_eqp_ary", "iLsUPvsdys");
        setField(term126821, term126821.getClass(), "c_itm_eqp_ary", "zsglFxvzdp");
        setField(term126821, term126821.getClass(), "ms_itm_flg_ary", "zhXtSGLnJR");
        setIntField(term126919, term126919.getClass(), "year", 2016);
        setShortField(term126919, term126919.getClass(), "month", (short) 2);
        setShortField(term126919, term126919.getClass(), "day", (short) 25);
        setField(term126918, term126918.getClass(), "date", term126919);
        setByteField(term126923, term126923.getClass(), "hour", (byte) 8);
        setByteField(term126923, term126923.getClass(), "minute", (byte) 54);
        setByteField(term126923, term126923.getClass(), "second", (byte) 40);
        setIntField(term126923, term126923.getClass(), "nano", 124525896);
        setField(term126918, term126918.getClass(), "time", term126923);
        setField(term126821, term126821.getClass(), "mdl_eqp_tm", term126918);
        setField(term126821, term126821.getClass(), "mdl_have", "XlNXxsYNss");
        setField(term126821, term126821.getClass(), "cstmz_itm_have", "jheRZWjuaB");
        setBooleanField(term126821, term126821.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term126821, term126821.getClass(), "use_mdl_pri", false);
        setBooleanField(term126821, term126821.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term126821, term126821.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term126821, term126821.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term126821, term126821.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term126821, term126821.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term126821, term126821.getClass(), "vcld_pts", 836734074);
        setIntField(term126821, term126821.getClass(), "nxt_pv_id", -1747711865);
        setField(term126821, term126821.getClass(), "nxt_dffclty", enum302);
        setField(term126821, term126821.getClass(), "nxt_edtn", enum303);
        setField(term126821, term126821.getClass(), "cv_cid", "IERziToRSQ");
        setField(term126821, term126821.getClass(), "cv_sc", "mDTRMwjBpc");
        setField(term126821, term126821.getClass(), "cv_rr", "sCLAuKoiVL");
        setField(term126821, term126821.getClass(), "cv_bv", "pFWiDEnVnU");
        setField(term126821, term126821.getClass(), "cv_bf", "NeEetzFhTt");
        setIntField(term126821, term126821.getClass(), "cnp_cid", 682812715);
        setIntField(term126821, term126821.getClass(), "cnp_val", -1092883950);
        setField(term126821, term126821.getClass(), "cnp_rr", enum304);
        setField(term126821, term126821.getClass(), "cnp_sp", "UgvuvUxKed");
        setField(term126821, term126821.getClass(), "my_lst_0", "ljBBMsQpaM");
        setField(term126821, term126821.getClass(), "my_lst_1", "hHNIOlOzJc");
        setField(term126821, term126821.getClass(), "my_lst_2", "ALRSeULyWV");
        setField(term126821, term126821.getClass(), "my_lst_3", "WVhzXHdyFF");
        setField(term126821, term126821.getClass(), "my_lst_4", "GLAWYoxkyw");
        setField(term126821, term126821.getClass(), "dsp_clr_brdr", "cfpPTNNVnW");
        setBooleanField(term126821, term126821.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term126821, term126821.getClass(), "dsp_clr_sts", false);
        setField(term126821, term126821.getClass(), "clr_sts", "VPkEFShMUB");
        setBooleanField(term126821, term126821.getClass(), "rgo_sts", false);
        setField(term126821, term126821.getClass(), "my_qst_id", "ZIgHysIFcL");
        setField(term126821, term126821.getClass(), "my_qst_sts", "ofSfQtWBjp");
        setField(term126821, term126821.getClass(), "my_qst_prgrs", "vkbIpZOlcY");
        setField(term126821, term126821.getClass(), "my_qst_et", "XbAeosZekH");
        setField(term126821, term126821.getClass(), "p_std_ie_have", "EvGPvjswTz");
        setField(term126821, term126821.getClass(), "p_std_se_have", "lbnnCkEZgE");
        setField(term126821, term126821.getClass(), "cmd", "YaWdTQZkTw");
        setField(term126821, term126821.getClass(), "req_id", "QqsjlsXtmm");
        setField(term126821, term126821.getClass(), "stat", "FuWUjAYXxz");
        term127263 = new Integer(950385621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term127263;
        callMethod(klass, "setAccept_idx", argTypes, term126821, args);
    }

};


