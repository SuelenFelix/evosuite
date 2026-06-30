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

public class StartResponse_getMylst1_150609625843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91449;

    public StartResponse_getMylst1_150609625843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91888 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term91887 = ((Class) term91888).getDeclaredField((String) "SUCCESS");
        ((Field) term91887).setAccessible(true);
        Object enum215 = ((Field) term91887).get((Object) null);
        Class<? extends Object> term92156 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term92155 = ((Class) term92156).getDeclaredField((String) "NAME");
        ((Field) term92155).setAccessible(true);
        Object enum216 = ((Field) term92155).get((Object) null);
        Class<? extends Object> term92475 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term92474 = ((Class) term92475).getDeclaredField((String) "UNDEFINED");
        ((Field) term92474).setAccessible(true);
        Object enum217 = ((Field) term92474).get((Object) null);
        Class<? extends Object> term92759 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term92758 = ((Class) term92759).getDeclaredField((String) "EXTRA");
        ((Field) term92758).setAccessible(true);
        Object enum218 = ((Field) term92758).get((Object) null);
        Class<? extends Object> term93066 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term93065 = ((Class) term93066).getDeclaredField((String) "GOLD");
        ((Field) term93065).setAccessible(true);
        Object enum219 = ((Field) term93065).get((Object) null);
        term91449 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term91542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term91543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term91547 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term91449, term91449.getClass(), "pd_id", -1777140369);
        setField(term91449, term91449.getClass(), "start_result", enum215);
        setIntField(term91449, term91449.getClass(), "accept_idx", 993627098);
        setIntField(term91449, term91449.getClass(), "start_idx", 872295704);
        setField(term91449, term91449.getClass(), "player_name", "JTPAQsfRtT");
        setIntField(term91449, term91449.getClass(), "hp_vol", 86041387);
        setBooleanField(term91449, term91449.getClass(), "btn_se_vol", false);
        setIntField(term91449, term91449.getClass(), "btn_se_vol2", 1010721666);
        setIntField(term91449, term91449.getClass(), "sldr_se_vol2", 27043781);
        setField(term91449, term91449.getClass(), "sort_kind", enum216);
        setIntField(term91449, term91449.getClass(), "lv_num", -1367122405);
        setIntField(term91449, term91449.getClass(), "lv_pnt", -1703625118);
        setField(term91449, term91449.getClass(), "lv_str", "otxkkKfDfl");
        setIntField(term91449, term91449.getClass(), "lv_efct_id", 1104108112);
        setIntField(term91449, term91449.getClass(), "lv_plt_id", 1648665618);
        setField(term91449, term91449.getClass(), "mdl_eqp_ary", "bqIuFFFwnP");
        setField(term91449, term91449.getClass(), "c_itm_eqp_ary", "hDxvvVgGlk");
        setField(term91449, term91449.getClass(), "ms_itm_flg_ary", "XdjSvjaTqk");
        setIntField(term91543, term91543.getClass(), "year", 2014);
        setShortField(term91543, term91543.getClass(), "month", (short) 11);
        setShortField(term91543, term91543.getClass(), "day", (short) 8);
        setField(term91542, term91542.getClass(), "date", term91543);
        setByteField(term91547, term91547.getClass(), "hour", (byte) 8);
        setByteField(term91547, term91547.getClass(), "minute", (byte) 43);
        setByteField(term91547, term91547.getClass(), "second", (byte) 32);
        setIntField(term91547, term91547.getClass(), "nano", 154434838);
        setField(term91542, term91542.getClass(), "time", term91547);
        setField(term91449, term91449.getClass(), "mdl_eqp_tm", term91542);
        setField(term91449, term91449.getClass(), "mdl_have", "ukrlYVcvsg");
        setField(term91449, term91449.getClass(), "cstmz_itm_have", "cpjqTCNflQ");
        setBooleanField(term91449, term91449.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term91449, term91449.getClass(), "use_mdl_pri", true);
        setBooleanField(term91449, term91449.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term91449, term91449.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term91449, term91449.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term91449, term91449.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term91449, term91449.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term91449, term91449.getClass(), "vcld_pts", 633765954);
        setIntField(term91449, term91449.getClass(), "nxt_pv_id", 269110087);
        setField(term91449, term91449.getClass(), "nxt_dffclty", enum217);
        setField(term91449, term91449.getClass(), "nxt_edtn", enum218);
        setField(term91449, term91449.getClass(), "cv_cid", "wiYGATEfmw");
        setField(term91449, term91449.getClass(), "cv_sc", "FiALSqneIg");
        setField(term91449, term91449.getClass(), "cv_rr", "lGVACSQceQ");
        setField(term91449, term91449.getClass(), "cv_bv", "jpgWRbSvyQ");
        setField(term91449, term91449.getClass(), "cv_bf", "tFMlYmPEBX");
        setIntField(term91449, term91449.getClass(), "cnp_cid", 1545119095);
        setIntField(term91449, term91449.getClass(), "cnp_val", 1671229683);
        setField(term91449, term91449.getClass(), "cnp_rr", enum219);
        setField(term91449, term91449.getClass(), "cnp_sp", "ljkZxGNgjZ");
        setField(term91449, term91449.getClass(), "my_lst_0", "hrFtgdcZKS");
        setField(term91449, term91449.getClass(), "my_lst_1", "ZhZJvpPaTU");
        setField(term91449, term91449.getClass(), "my_lst_2", "NZwUsJxDLI");
        setField(term91449, term91449.getClass(), "my_lst_3", "wlusYBOfXW");
        setField(term91449, term91449.getClass(), "my_lst_4", "HEWWLhfKIa");
        setField(term91449, term91449.getClass(), "dsp_clr_brdr", "mJJkYzNPob");
        setBooleanField(term91449, term91449.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term91449, term91449.getClass(), "dsp_clr_sts", false);
        setField(term91449, term91449.getClass(), "clr_sts", "mRDwekkZQg");
        setBooleanField(term91449, term91449.getClass(), "rgo_sts", true);
        setField(term91449, term91449.getClass(), "my_qst_id", "RIGChgqpTI");
        setField(term91449, term91449.getClass(), "my_qst_sts", "YCrgXnhgoK");
        setField(term91449, term91449.getClass(), "my_qst_prgrs", "nQodIeQekM");
        setField(term91449, term91449.getClass(), "my_qst_et", "YXORpHCDcd");
        setField(term91449, term91449.getClass(), "p_std_ie_have", "XzZbAcRADD");
        setField(term91449, term91449.getClass(), "p_std_se_have", "UqSNWSoTRy");
        setField(term91449, term91449.getClass(), "cmd", "VesRqDfjMa");
        setField(term91449, term91449.getClass(), "req_id", "AQTTebOiZR");
        setField(term91449, term91449.getClass(), "stat", "mgeIhswNtk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_lst_1", argTypes, term91449, args);
    }

};


