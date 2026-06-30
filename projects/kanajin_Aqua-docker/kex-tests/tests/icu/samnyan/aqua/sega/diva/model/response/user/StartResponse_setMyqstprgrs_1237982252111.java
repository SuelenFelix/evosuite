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

public class StartResponse_setMyqstprgrs_1237982252111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234274;

    public StartResponse_setMyqstprgrs_1237982252111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term234726 = ((Class) term234727).getDeclaredField((String) "SUCCESS");
        ((Field) term234726).setAccessible(true);
        Object enum557 = ((Field) term234726).get((Object) null);
        Class<? extends Object> term234995 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term234994 = ((Class) term234995).getDeclaredField((String) "MY_LIST_B");
        ((Field) term234994).setAccessible(true);
        Object enum558 = ((Field) term234994).get((Object) null);
        Class<? extends Object> term235329 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term235328 = ((Class) term235329).getDeclaredField((String) "EASY");
        ((Field) term235328).setAccessible(true);
        Object enum559 = ((Field) term235328).get((Object) null);
        Class<? extends Object> term235598 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term235597 = ((Class) term235598).getDeclaredField((String) "EXTRA");
        ((Field) term235597).setAccessible(true);
        Object enum560 = ((Field) term235597).get((Object) null);
        Class<? extends Object> term235905 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term235904 = ((Class) term235905).getDeclaredField((String) "SILVER");
        ((Field) term235904).setAccessible(true);
        Object enum561 = ((Field) term235904).get((Object) null);
        term234274 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term234372 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term234373 = newInstance(Class.forName("java.time.LocalDate"));
        Object term234377 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term234274, term234274.getClass(), "pd_id", 1691516034);
        setField(term234274, term234274.getClass(), "start_result", enum557);
        setIntField(term234274, term234274.getClass(), "accept_idx", 335681723);
        setIntField(term234274, term234274.getClass(), "start_idx", -773707674);
        setField(term234274, term234274.getClass(), "player_name", "coDGKPmcIo");
        setIntField(term234274, term234274.getClass(), "hp_vol", 383244929);
        setBooleanField(term234274, term234274.getClass(), "btn_se_vol", false);
        setIntField(term234274, term234274.getClass(), "btn_se_vol2", -2114034003);
        setIntField(term234274, term234274.getClass(), "sldr_se_vol2", 207213904);
        setField(term234274, term234274.getClass(), "sort_kind", enum558);
        setIntField(term234274, term234274.getClass(), "lv_num", -484303394);
        setIntField(term234274, term234274.getClass(), "lv_pnt", -31125530);
        setField(term234274, term234274.getClass(), "lv_str", "sNKnkClMjH");
        setIntField(term234274, term234274.getClass(), "lv_efct_id", 1909773180);
        setIntField(term234274, term234274.getClass(), "lv_plt_id", -970417907);
        setField(term234274, term234274.getClass(), "mdl_eqp_ary", "DzuhSmFHcg");
        setField(term234274, term234274.getClass(), "c_itm_eqp_ary", "lHFGeijIrp");
        setField(term234274, term234274.getClass(), "ms_itm_flg_ary", "OjqiiqbEQC");
        setIntField(term234373, term234373.getClass(), "year", 2028);
        setShortField(term234373, term234373.getClass(), "month", (short) 4);
        setShortField(term234373, term234373.getClass(), "day", (short) 11);
        setField(term234372, term234372.getClass(), "date", term234373);
        setByteField(term234377, term234377.getClass(), "hour", (byte) 4);
        setByteField(term234377, term234377.getClass(), "minute", (byte) 45);
        setByteField(term234377, term234377.getClass(), "second", (byte) 2);
        setIntField(term234377, term234377.getClass(), "nano", 374177968);
        setField(term234372, term234372.getClass(), "time", term234377);
        setField(term234274, term234274.getClass(), "mdl_eqp_tm", term234372);
        setField(term234274, term234274.getClass(), "mdl_have", "lOnziohwRj");
        setField(term234274, term234274.getClass(), "cstmz_itm_have", "FcuzXnxIut");
        setBooleanField(term234274, term234274.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term234274, term234274.getClass(), "use_mdl_pri", false);
        setBooleanField(term234274, term234274.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term234274, term234274.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term234274, term234274.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term234274, term234274.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term234274, term234274.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term234274, term234274.getClass(), "vcld_pts", 1097894139);
        setIntField(term234274, term234274.getClass(), "nxt_pv_id", 390256347);
        setField(term234274, term234274.getClass(), "nxt_dffclty", enum559);
        setField(term234274, term234274.getClass(), "nxt_edtn", enum560);
        setField(term234274, term234274.getClass(), "cv_cid", "fyepabvKPu");
        setField(term234274, term234274.getClass(), "cv_sc", "igjhLhfUDg");
        setField(term234274, term234274.getClass(), "cv_rr", "aphCSNJgJZ");
        setField(term234274, term234274.getClass(), "cv_bv", "JtamsBczow");
        setField(term234274, term234274.getClass(), "cv_bf", "ckScPlFqWx");
        setIntField(term234274, term234274.getClass(), "cnp_cid", 1471619998);
        setIntField(term234274, term234274.getClass(), "cnp_val", -1623489521);
        setField(term234274, term234274.getClass(), "cnp_rr", enum561);
        setField(term234274, term234274.getClass(), "cnp_sp", "KIGJgoclUB");
        setField(term234274, term234274.getClass(), "my_lst_0", "LxnOVCDRzb");
        setField(term234274, term234274.getClass(), "my_lst_1", "MPsfpSOhwQ");
        setField(term234274, term234274.getClass(), "my_lst_2", "GkTxuqMoMw");
        setField(term234274, term234274.getClass(), "my_lst_3", "MdlLUfrIYx");
        setField(term234274, term234274.getClass(), "my_lst_4", "trNmqmTVhn");
        setField(term234274, term234274.getClass(), "dsp_clr_brdr", "oRcEdheGqg");
        setBooleanField(term234274, term234274.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term234274, term234274.getClass(), "dsp_clr_sts", true);
        setField(term234274, term234274.getClass(), "clr_sts", "vwQAcJEANy");
        setBooleanField(term234274, term234274.getClass(), "rgo_sts", false);
        setField(term234274, term234274.getClass(), "my_qst_id", "bakvKrXWXm");
        setField(term234274, term234274.getClass(), "my_qst_sts", "ixpDCFiQaP");
        setField(term234274, term234274.getClass(), "my_qst_prgrs", "vrRPhHcJDp");
        setField(term234274, term234274.getClass(), "my_qst_et", "GAfAmizshG");
        setField(term234274, term234274.getClass(), "p_std_ie_have", "mouoQUznmq");
        setField(term234274, term234274.getClass(), "p_std_se_have", "WaacgRHGZQ");
        setField(term234274, term234274.getClass(), "cmd", "GiqQhSRhZD");
        setField(term234274, term234274.getClass(), "req_id", "oycMVEbykz");
        setField(term234274, term234274.getClass(), "stat", "DdxinlKAiI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DZPXiwRtmo";
        callMethod(klass, "setMy_qst_prgrs", argTypes, term234274, args);
    }

};


