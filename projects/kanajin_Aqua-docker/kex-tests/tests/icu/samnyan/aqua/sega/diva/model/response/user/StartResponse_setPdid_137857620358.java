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

public class StartResponse_setPdid_137857620358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122647;
     Object term123089;

    public StartResponse_setPdid_137857620358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123092 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term123091 = ((Class) term123092).getDeclaredField((String) "FAILED");
        ((Field) term123091).setAccessible(true);
        Object enum290 = ((Field) term123091).get((Object) null);
        Class<? extends Object> term123357 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term123356 = ((Class) term123357).getDeclaredField((String) "MY_LIST_B");
        ((Field) term123356).setAccessible(true);
        Object enum291 = ((Field) term123356).get((Object) null);
        Class<? extends Object> term123691 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term123690 = ((Class) term123691).getDeclaredField((String) "NORMAL");
        ((Field) term123690).setAccessible(true);
        Object enum292 = ((Field) term123690).get((Object) null);
        Class<? extends Object> term123966 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term123965 = ((Class) term123966).getDeclaredField((String) "ORIGINAL");
        ((Field) term123965).setAccessible(true);
        Object enum293 = ((Field) term123965).get((Object) null);
        Class<? extends Object> term124282 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term124281 = ((Class) term124282).getDeclaredField((String) "NONE");
        ((Field) term124281).setAccessible(true);
        Object enum294 = ((Field) term124281).get((Object) null);
        term122647 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term122744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term122745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term122749 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term122647, term122647.getClass(), "pd_id", 1235045850);
        setField(term122647, term122647.getClass(), "start_result", enum290);
        setIntField(term122647, term122647.getClass(), "accept_idx", -75143033);
        setIntField(term122647, term122647.getClass(), "start_idx", 797015478);
        setField(term122647, term122647.getClass(), "player_name", "KkgJnxXxVl");
        setIntField(term122647, term122647.getClass(), "hp_vol", 717574276);
        setBooleanField(term122647, term122647.getClass(), "btn_se_vol", false);
        setIntField(term122647, term122647.getClass(), "btn_se_vol2", 1795369860);
        setIntField(term122647, term122647.getClass(), "sldr_se_vol2", -570164389);
        setField(term122647, term122647.getClass(), "sort_kind", enum291);
        setIntField(term122647, term122647.getClass(), "lv_num", 43200329);
        setIntField(term122647, term122647.getClass(), "lv_pnt", 998679955);
        setField(term122647, term122647.getClass(), "lv_str", "TGnzPlGFMb");
        setIntField(term122647, term122647.getClass(), "lv_efct_id", 953741504);
        setIntField(term122647, term122647.getClass(), "lv_plt_id", 1389452261);
        setField(term122647, term122647.getClass(), "mdl_eqp_ary", "yEvLMSpdHy");
        setField(term122647, term122647.getClass(), "c_itm_eqp_ary", "qdErlZeTVv");
        setField(term122647, term122647.getClass(), "ms_itm_flg_ary", "OCCDQbndDE");
        setIntField(term122745, term122745.getClass(), "year", 2025);
        setShortField(term122745, term122745.getClass(), "month", (short) 3);
        setShortField(term122745, term122745.getClass(), "day", (short) 28);
        setField(term122744, term122744.getClass(), "date", term122745);
        setByteField(term122749, term122749.getClass(), "hour", (byte) 19);
        setByteField(term122749, term122749.getClass(), "minute", (byte) 56);
        setByteField(term122749, term122749.getClass(), "second", (byte) 52);
        setIntField(term122749, term122749.getClass(), "nano", 738558930);
        setField(term122744, term122744.getClass(), "time", term122749);
        setField(term122647, term122647.getClass(), "mdl_eqp_tm", term122744);
        setField(term122647, term122647.getClass(), "mdl_have", "NMANMKfctU");
        setField(term122647, term122647.getClass(), "cstmz_itm_have", "mQsaqUltLU");
        setBooleanField(term122647, term122647.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term122647, term122647.getClass(), "use_mdl_pri", true);
        setBooleanField(term122647, term122647.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term122647, term122647.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term122647, term122647.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term122647, term122647.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term122647, term122647.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term122647, term122647.getClass(), "vcld_pts", 1615957955);
        setIntField(term122647, term122647.getClass(), "nxt_pv_id", 1779370220);
        setField(term122647, term122647.getClass(), "nxt_dffclty", enum292);
        setField(term122647, term122647.getClass(), "nxt_edtn", enum293);
        setField(term122647, term122647.getClass(), "cv_cid", "jwENwZiGlR");
        setField(term122647, term122647.getClass(), "cv_sc", "rfFHGPcfpz");
        setField(term122647, term122647.getClass(), "cv_rr", "fViQeyMrrL");
        setField(term122647, term122647.getClass(), "cv_bv", "zzeaToyLmI");
        setField(term122647, term122647.getClass(), "cv_bf", "sKYWhmRMLx");
        setIntField(term122647, term122647.getClass(), "cnp_cid", -1716046610);
        setIntField(term122647, term122647.getClass(), "cnp_val", 65264024);
        setField(term122647, term122647.getClass(), "cnp_rr", enum294);
        setField(term122647, term122647.getClass(), "cnp_sp", "SOJpgWUZCf");
        setField(term122647, term122647.getClass(), "my_lst_0", "jgywFOzBDw");
        setField(term122647, term122647.getClass(), "my_lst_1", "yKIXLtCWYi");
        setField(term122647, term122647.getClass(), "my_lst_2", "EhuyRKrUJu");
        setField(term122647, term122647.getClass(), "my_lst_3", "UlBxuoBXcJ");
        setField(term122647, term122647.getClass(), "my_lst_4", "PqduvNFXXw");
        setField(term122647, term122647.getClass(), "dsp_clr_brdr", "bMQrxvaBAI");
        setBooleanField(term122647, term122647.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term122647, term122647.getClass(), "dsp_clr_sts", true);
        setField(term122647, term122647.getClass(), "clr_sts", "StFtysZlWm");
        setBooleanField(term122647, term122647.getClass(), "rgo_sts", false);
        setField(term122647, term122647.getClass(), "my_qst_id", "CoqUcmjnkF");
        setField(term122647, term122647.getClass(), "my_qst_sts", "oOrXvGaFwa");
        setField(term122647, term122647.getClass(), "my_qst_prgrs", "KJSTLGsSvO");
        setField(term122647, term122647.getClass(), "my_qst_et", "kSkiIpaepq");
        setField(term122647, term122647.getClass(), "p_std_ie_have", "FzJhDecyvI");
        setField(term122647, term122647.getClass(), "p_std_se_have", "zOxseYMSdY");
        setField(term122647, term122647.getClass(), "cmd", "jEKlkqpHMQ");
        setField(term122647, term122647.getClass(), "req_id", "QpEVWispEh");
        setField(term122647, term122647.getClass(), "stat", "STofGrqXqL");
        term123089 = new Integer(-252449812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term123089;
        callMethod(klass, "setPd_id", argTypes, term122647, args);
    }

};


