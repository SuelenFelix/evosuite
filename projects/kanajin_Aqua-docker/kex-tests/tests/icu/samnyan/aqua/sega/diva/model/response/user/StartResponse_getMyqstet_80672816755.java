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

public class StartResponse_getMyqstet_80672816755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116437;

    public StartResponse_getMyqstet_80672816755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term116873 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term116872 = ((Class) term116873).getDeclaredField((String) "FAILED");
        ((Field) term116872).setAccessible(true);
        Object enum275 = ((Field) term116872).get((Object) null);
        Class<? extends Object> term117138 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term117137 = ((Class) term117138).getDeclaredField((String) "NAME");
        ((Field) term117137).setAccessible(true);
        Object enum276 = ((Field) term117137).get((Object) null);
        Class<? extends Object> term117457 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term117456 = ((Class) term117457).getDeclaredField((String) "HARD");
        ((Field) term117456).setAccessible(true);
        Object enum277 = ((Field) term117456).get((Object) null);
        Class<? extends Object> term117726 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term117725 = ((Class) term117726).getDeclaredField((String) "ORIGINAL");
        ((Field) term117725).setAccessible(true);
        Object enum278 = ((Field) term117725).get((Object) null);
        Class<? extends Object> term118042 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term118041 = ((Class) term118042).getDeclaredField((String) "NONE");
        ((Field) term118041).setAccessible(true);
        Object enum279 = ((Field) term118041).get((Object) null);
        term116437 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term116529 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116530 = newInstance(Class.forName("java.time.LocalDate"));
        Object term116534 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term116437, term116437.getClass(), "pd_id", 297582552);
        setField(term116437, term116437.getClass(), "start_result", enum275);
        setIntField(term116437, term116437.getClass(), "accept_idx", -1485916498);
        setIntField(term116437, term116437.getClass(), "start_idx", 722787672);
        setField(term116437, term116437.getClass(), "player_name", "gzvlGZVfnZ");
        setIntField(term116437, term116437.getClass(), "hp_vol", 2077491675);
        setBooleanField(term116437, term116437.getClass(), "btn_se_vol", false);
        setIntField(term116437, term116437.getClass(), "btn_se_vol2", -1728316609);
        setIntField(term116437, term116437.getClass(), "sldr_se_vol2", 47118909);
        setField(term116437, term116437.getClass(), "sort_kind", enum276);
        setIntField(term116437, term116437.getClass(), "lv_num", -2093707412);
        setIntField(term116437, term116437.getClass(), "lv_pnt", -680627153);
        setField(term116437, term116437.getClass(), "lv_str", "rmSqCaXWHi");
        setIntField(term116437, term116437.getClass(), "lv_efct_id", 722519669);
        setIntField(term116437, term116437.getClass(), "lv_plt_id", -40335961);
        setField(term116437, term116437.getClass(), "mdl_eqp_ary", "ScztqspySK");
        setField(term116437, term116437.getClass(), "c_itm_eqp_ary", "IvYxGwWoVu");
        setField(term116437, term116437.getClass(), "ms_itm_flg_ary", "XnZHOhTfxL");
        setIntField(term116530, term116530.getClass(), "year", 2011);
        setShortField(term116530, term116530.getClass(), "month", (short) 9);
        setShortField(term116530, term116530.getClass(), "day", (short) 25);
        setField(term116529, term116529.getClass(), "date", term116530);
        setByteField(term116534, term116534.getClass(), "hour", (byte) 16);
        setByteField(term116534, term116534.getClass(), "minute", (byte) 45);
        setByteField(term116534, term116534.getClass(), "second", (byte) 19);
        setIntField(term116534, term116534.getClass(), "nano", 962864785);
        setField(term116529, term116529.getClass(), "time", term116534);
        setField(term116437, term116437.getClass(), "mdl_eqp_tm", term116529);
        setField(term116437, term116437.getClass(), "mdl_have", "oFBhNamtAs");
        setField(term116437, term116437.getClass(), "cstmz_itm_have", "YURcpRjwSt");
        setBooleanField(term116437, term116437.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term116437, term116437.getClass(), "use_mdl_pri", true);
        setBooleanField(term116437, term116437.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term116437, term116437.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term116437, term116437.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term116437, term116437.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term116437, term116437.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term116437, term116437.getClass(), "vcld_pts", 175343605);
        setIntField(term116437, term116437.getClass(), "nxt_pv_id", 1050853183);
        setField(term116437, term116437.getClass(), "nxt_dffclty", enum277);
        setField(term116437, term116437.getClass(), "nxt_edtn", enum278);
        setField(term116437, term116437.getClass(), "cv_cid", "SXMdNSGPog");
        setField(term116437, term116437.getClass(), "cv_sc", "vsqwOLpDjj");
        setField(term116437, term116437.getClass(), "cv_rr", "rJgXQRsPCl");
        setField(term116437, term116437.getClass(), "cv_bv", "RgqpoBknjN");
        setField(term116437, term116437.getClass(), "cv_bf", "nUDhadopHE");
        setIntField(term116437, term116437.getClass(), "cnp_cid", 848428785);
        setIntField(term116437, term116437.getClass(), "cnp_val", -1984436481);
        setField(term116437, term116437.getClass(), "cnp_rr", enum279);
        setField(term116437, term116437.getClass(), "cnp_sp", "vLrTnQTIPg");
        setField(term116437, term116437.getClass(), "my_lst_0", "GsXvLZCFtf");
        setField(term116437, term116437.getClass(), "my_lst_1", "JqSCTBGSUs");
        setField(term116437, term116437.getClass(), "my_lst_2", "bZrrPiMnsr");
        setField(term116437, term116437.getClass(), "my_lst_3", "IeromvfDmz");
        setField(term116437, term116437.getClass(), "my_lst_4", "xJLHPTRSqe");
        setField(term116437, term116437.getClass(), "dsp_clr_brdr", "OIFZYdbUZz");
        setBooleanField(term116437, term116437.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term116437, term116437.getClass(), "dsp_clr_sts", true);
        setField(term116437, term116437.getClass(), "clr_sts", "FPablxseTr");
        setBooleanField(term116437, term116437.getClass(), "rgo_sts", true);
        setField(term116437, term116437.getClass(), "my_qst_id", "wNndrIQDbr");
        setField(term116437, term116437.getClass(), "my_qst_sts", "JiSIFtJnYv");
        setField(term116437, term116437.getClass(), "my_qst_prgrs", "wxAHQRVgKc");
        setField(term116437, term116437.getClass(), "my_qst_et", "bYsZEHeoeV");
        setField(term116437, term116437.getClass(), "p_std_ie_have", "IwvwrQylib");
        setField(term116437, term116437.getClass(), "p_std_se_have", "ZWJgSttNjg");
        setField(term116437, term116437.getClass(), "cmd", "LQTIjJLkXH");
        setField(term116437, term116437.getClass(), "req_id", "RvkBwedFKx");
        setField(term116437, term116437.getClass(), "stat", "DYzWJljbaE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_et", argTypes, term116437, args);
    }

};


