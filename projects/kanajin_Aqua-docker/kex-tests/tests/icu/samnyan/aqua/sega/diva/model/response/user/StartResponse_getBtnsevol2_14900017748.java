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

public class StartResponse_getBtnsevol2_14900017748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18539;

    public StartResponse_getBtnsevol2_14900017748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18984 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term18983 = ((Class) term18984).getDeclaredField((String) "FAILED");
        ((Field) term18983).setAccessible(true);
        Object enum40 = ((Field) term18983).get((Object) null);
        Class<? extends Object> term19249 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term19248 = ((Class) term19249).getDeclaredField((String) "MY_LIST_A");
        ((Field) term19248).setAccessible(true);
        Object enum41 = ((Field) term19248).get((Object) null);
        Class<? extends Object> term19583 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term19582 = ((Class) term19583).getDeclaredField((String) "NORMAL");
        ((Field) term19582).setAccessible(true);
        Object enum42 = ((Field) term19582).get((Object) null);
        Class<? extends Object> term19858 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term19857 = ((Class) term19858).getDeclaredField((String) "ORIGINAL");
        ((Field) term19857).setAccessible(true);
        Object enum43 = ((Field) term19857).get((Object) null);
        Class<? extends Object> term20174 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term20173 = ((Class) term20174).getDeclaredField((String) "BRONZE");
        ((Field) term20173).setAccessible(true);
        Object enum44 = ((Field) term20173).get((Object) null);
        term18539 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term18636 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18637 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18641 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18539, term18539.getClass(), "pd_id", -2014576105);
        setField(term18539, term18539.getClass(), "start_result", enum40);
        setIntField(term18539, term18539.getClass(), "accept_idx", 1296895584);
        setIntField(term18539, term18539.getClass(), "start_idx", 628918458);
        setField(term18539, term18539.getClass(), "player_name", "PXdVZyoJyC");
        setIntField(term18539, term18539.getClass(), "hp_vol", -1274456137);
        setBooleanField(term18539, term18539.getClass(), "btn_se_vol", false);
        setIntField(term18539, term18539.getClass(), "btn_se_vol2", 1041916673);
        setIntField(term18539, term18539.getClass(), "sldr_se_vol2", -601863069);
        setField(term18539, term18539.getClass(), "sort_kind", enum41);
        setIntField(term18539, term18539.getClass(), "lv_num", 663292551);
        setIntField(term18539, term18539.getClass(), "lv_pnt", -1885090354);
        setField(term18539, term18539.getClass(), "lv_str", "vLerpqavFM");
        setIntField(term18539, term18539.getClass(), "lv_efct_id", -2066804303);
        setIntField(term18539, term18539.getClass(), "lv_plt_id", -1731761810);
        setField(term18539, term18539.getClass(), "mdl_eqp_ary", "qnvxzwuGKX");
        setField(term18539, term18539.getClass(), "c_itm_eqp_ary", "EdPAvpluZg");
        setField(term18539, term18539.getClass(), "ms_itm_flg_ary", "DzHVBMqWtE");
        setIntField(term18637, term18637.getClass(), "year", 2029);
        setShortField(term18637, term18637.getClass(), "month", (short) 8);
        setShortField(term18637, term18637.getClass(), "day", (short) 29);
        setField(term18636, term18636.getClass(), "date", term18637);
        setByteField(term18641, term18641.getClass(), "hour", (byte) 15);
        setByteField(term18641, term18641.getClass(), "minute", (byte) 50);
        setByteField(term18641, term18641.getClass(), "second", (byte) 1);
        setIntField(term18641, term18641.getClass(), "nano", 277971904);
        setField(term18636, term18636.getClass(), "time", term18641);
        setField(term18539, term18539.getClass(), "mdl_eqp_tm", term18636);
        setField(term18539, term18539.getClass(), "mdl_have", "THZSpzBRYP");
        setField(term18539, term18539.getClass(), "cstmz_itm_have", "ZfBIVGBQOE");
        setBooleanField(term18539, term18539.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term18539, term18539.getClass(), "use_mdl_pri", true);
        setBooleanField(term18539, term18539.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term18539, term18539.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term18539, term18539.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term18539, term18539.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term18539, term18539.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term18539, term18539.getClass(), "vcld_pts", 197109649);
        setIntField(term18539, term18539.getClass(), "nxt_pv_id", -1239406390);
        setField(term18539, term18539.getClass(), "nxt_dffclty", enum42);
        setField(term18539, term18539.getClass(), "nxt_edtn", enum43);
        setField(term18539, term18539.getClass(), "cv_cid", "QSrDQfEsTR");
        setField(term18539, term18539.getClass(), "cv_sc", "PsqusYmejD");
        setField(term18539, term18539.getClass(), "cv_rr", "NTWMiBEaDF");
        setField(term18539, term18539.getClass(), "cv_bv", "SPBstwKFVr");
        setField(term18539, term18539.getClass(), "cv_bf", "WxYUTuqmIq");
        setIntField(term18539, term18539.getClass(), "cnp_cid", 1557431527);
        setIntField(term18539, term18539.getClass(), "cnp_val", -1504890659);
        setField(term18539, term18539.getClass(), "cnp_rr", enum44);
        setField(term18539, term18539.getClass(), "cnp_sp", "OeQLvhVERT");
        setField(term18539, term18539.getClass(), "my_lst_0", "IlvgFINwIa");
        setField(term18539, term18539.getClass(), "my_lst_1", "GEJABPlHSI");
        setField(term18539, term18539.getClass(), "my_lst_2", "aQFUvuaYxd");
        setField(term18539, term18539.getClass(), "my_lst_3", "zNFLXMifnS");
        setField(term18539, term18539.getClass(), "my_lst_4", "HHQcYMSBVc");
        setField(term18539, term18539.getClass(), "dsp_clr_brdr", "wdoqITnaAP");
        setBooleanField(term18539, term18539.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term18539, term18539.getClass(), "dsp_clr_sts", true);
        setField(term18539, term18539.getClass(), "clr_sts", "rIPMBcrNqB");
        setBooleanField(term18539, term18539.getClass(), "rgo_sts", true);
        setField(term18539, term18539.getClass(), "my_qst_id", "UDaboHZHhz");
        setField(term18539, term18539.getClass(), "my_qst_sts", "nRvKihUSPj");
        setField(term18539, term18539.getClass(), "my_qst_prgrs", "BbNeQJpYPr");
        setField(term18539, term18539.getClass(), "my_qst_et", "riMtzCoxNj");
        setField(term18539, term18539.getClass(), "p_std_ie_have", "YAXkVjQZcV");
        setField(term18539, term18539.getClass(), "p_std_se_have", "pumvwBWvpy");
        setField(term18539, term18539.getClass(), "cmd", "HwLHeGLyhe");
        setField(term18539, term18539.getClass(), "req_id", "RDnkgWkcbz");
        setField(term18539, term18539.getClass(), "stat", "IBpaxltauX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBtn_se_vol2", argTypes, term18539, args);
    }

};


