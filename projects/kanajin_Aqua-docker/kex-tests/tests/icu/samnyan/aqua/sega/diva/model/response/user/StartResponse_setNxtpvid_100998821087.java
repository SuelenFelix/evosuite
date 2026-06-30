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

public class StartResponse_setNxtpvid_100998821087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183583;
     Object term184020;

    public StartResponse_setNxtpvid_100998821087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184023 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term184022 = ((Class) term184023).getDeclaredField((String) "FAILED");
        ((Field) term184022).setAccessible(true);
        Object enum436 = ((Field) term184022).get((Object) null);
        Class<? extends Object> term184288 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term184287 = ((Class) term184288).getDeclaredField((String) "NAME");
        ((Field) term184287).setAccessible(true);
        Object enum437 = ((Field) term184287).get((Object) null);
        Class<? extends Object> term184607 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term184606 = ((Class) term184607).getDeclaredField((String) "HARD");
        ((Field) term184606).setAccessible(true);
        Object enum438 = ((Field) term184606).get((Object) null);
        Class<? extends Object> term184876 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term184875 = ((Class) term184876).getDeclaredField((String) "ORIGINAL");
        ((Field) term184875).setAccessible(true);
        Object enum439 = ((Field) term184875).get((Object) null);
        Class<? extends Object> term185192 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term185191 = ((Class) term185192).getDeclaredField((String) "BRONZE");
        ((Field) term185191).setAccessible(true);
        Object enum440 = ((Field) term185191).get((Object) null);
        term183583 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term183675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183680 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term183583, term183583.getClass(), "pd_id", 910269225);
        setField(term183583, term183583.getClass(), "start_result", enum436);
        setIntField(term183583, term183583.getClass(), "accept_idx", -298852874);
        setIntField(term183583, term183583.getClass(), "start_idx", 1094297953);
        setField(term183583, term183583.getClass(), "player_name", "lowANLpXCV");
        setIntField(term183583, term183583.getClass(), "hp_vol", -329141819);
        setBooleanField(term183583, term183583.getClass(), "btn_se_vol", false);
        setIntField(term183583, term183583.getClass(), "btn_se_vol2", -963204620);
        setIntField(term183583, term183583.getClass(), "sldr_se_vol2", 172898580);
        setField(term183583, term183583.getClass(), "sort_kind", enum437);
        setIntField(term183583, term183583.getClass(), "lv_num", -777833461);
        setIntField(term183583, term183583.getClass(), "lv_pnt", 1583691829);
        setField(term183583, term183583.getClass(), "lv_str", "orjiIcUIcD");
        setIntField(term183583, term183583.getClass(), "lv_efct_id", -1468541076);
        setIntField(term183583, term183583.getClass(), "lv_plt_id", -1796760393);
        setField(term183583, term183583.getClass(), "mdl_eqp_ary", "lGzFueHQqZ");
        setField(term183583, term183583.getClass(), "c_itm_eqp_ary", "cjiDFHGGlp");
        setField(term183583, term183583.getClass(), "ms_itm_flg_ary", "XLjtkfroHJ");
        setIntField(term183676, term183676.getClass(), "year", 2023);
        setShortField(term183676, term183676.getClass(), "month", (short) 5);
        setShortField(term183676, term183676.getClass(), "day", (short) 23);
        setField(term183675, term183675.getClass(), "date", term183676);
        setByteField(term183680, term183680.getClass(), "hour", (byte) 0);
        setByteField(term183680, term183680.getClass(), "minute", (byte) 50);
        setByteField(term183680, term183680.getClass(), "second", (byte) 5);
        setIntField(term183680, term183680.getClass(), "nano", 296286825);
        setField(term183675, term183675.getClass(), "time", term183680);
        setField(term183583, term183583.getClass(), "mdl_eqp_tm", term183675);
        setField(term183583, term183583.getClass(), "mdl_have", "hdqypaATat");
        setField(term183583, term183583.getClass(), "cstmz_itm_have", "yXrHDHEipD");
        setBooleanField(term183583, term183583.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term183583, term183583.getClass(), "use_mdl_pri", false);
        setBooleanField(term183583, term183583.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term183583, term183583.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term183583, term183583.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term183583, term183583.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term183583, term183583.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term183583, term183583.getClass(), "vcld_pts", -2099267271);
        setIntField(term183583, term183583.getClass(), "nxt_pv_id", 1134565344);
        setField(term183583, term183583.getClass(), "nxt_dffclty", enum438);
        setField(term183583, term183583.getClass(), "nxt_edtn", enum439);
        setField(term183583, term183583.getClass(), "cv_cid", "pbqIeikQzp");
        setField(term183583, term183583.getClass(), "cv_sc", "baLJgqNNUx");
        setField(term183583, term183583.getClass(), "cv_rr", "GlPSGqVaBj");
        setField(term183583, term183583.getClass(), "cv_bv", "jieMNXAAbL");
        setField(term183583, term183583.getClass(), "cv_bf", "NbmTxmqOjh");
        setIntField(term183583, term183583.getClass(), "cnp_cid", -1747434000);
        setIntField(term183583, term183583.getClass(), "cnp_val", 1611620166);
        setField(term183583, term183583.getClass(), "cnp_rr", enum440);
        setField(term183583, term183583.getClass(), "cnp_sp", "rLDmBbcLaC");
        setField(term183583, term183583.getClass(), "my_lst_0", "tUKcXglBlG");
        setField(term183583, term183583.getClass(), "my_lst_1", "ZGptycjjRq");
        setField(term183583, term183583.getClass(), "my_lst_2", "kXJaxapFer");
        setField(term183583, term183583.getClass(), "my_lst_3", "OEeAVwVwuj");
        setField(term183583, term183583.getClass(), "my_lst_4", "WEgFuDZsxi");
        setField(term183583, term183583.getClass(), "dsp_clr_brdr", "kvcaSGNTHd");
        setBooleanField(term183583, term183583.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term183583, term183583.getClass(), "dsp_clr_sts", true);
        setField(term183583, term183583.getClass(), "clr_sts", "opXkGeBDoI");
        setBooleanField(term183583, term183583.getClass(), "rgo_sts", false);
        setField(term183583, term183583.getClass(), "my_qst_id", "UHxidCtatV");
        setField(term183583, term183583.getClass(), "my_qst_sts", "LRzADDSjVT");
        setField(term183583, term183583.getClass(), "my_qst_prgrs", "lpFCMaAYxj");
        setField(term183583, term183583.getClass(), "my_qst_et", "fzHVMNSLii");
        setField(term183583, term183583.getClass(), "p_std_ie_have", "TxymnVINZF");
        setField(term183583, term183583.getClass(), "p_std_se_have", "fkBfmixBEh");
        setField(term183583, term183583.getClass(), "cmd", "SWbairdDKL");
        setField(term183583, term183583.getClass(), "req_id", "AibUFEALwF");
        setField(term183583, term183583.getClass(), "stat", "eXOUrXTrdW");
        term184020 = new Integer(249657454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term184020;
        callMethod(klass, "setNxt_pv_id", argTypes, term183583, args);
    }

};


