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

public class StartResponse_getCitmeqpary_155024259417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37325;

    public StartResponse_getCitmeqpary_155024259417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37769 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term37768 = ((Class) term37769).getDeclaredField((String) "SUCCESS");
        ((Field) term37768).setAccessible(true);
        Object enum85 = ((Field) term37768).get((Object) null);
        Class<? extends Object> term38037 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term38036 = ((Class) term38037).getDeclaredField((String) "MY_LIST_A");
        ((Field) term38036).setAccessible(true);
        Object enum86 = ((Field) term38036).get((Object) null);
        Class<? extends Object> term38371 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term38370 = ((Class) term38371).getDeclaredField((String) "EXTREME");
        ((Field) term38370).setAccessible(true);
        Object enum87 = ((Field) term38370).get((Object) null);
        Class<? extends Object> term38649 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term38648 = ((Class) term38649).getDeclaredField((String) "EXTRA");
        ((Field) term38648).setAccessible(true);
        Object enum88 = ((Field) term38648).get((Object) null);
        Class<? extends Object> term38956 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term38955 = ((Class) term38956).getDeclaredField((String) "SILVER");
        ((Field) term38955).setAccessible(true);
        Object enum89 = ((Field) term38955).get((Object) null);
        term37325 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term37423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37428 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term37325, term37325.getClass(), "pd_id", -1070592289);
        setField(term37325, term37325.getClass(), "start_result", enum85);
        setIntField(term37325, term37325.getClass(), "accept_idx", -1464172784);
        setIntField(term37325, term37325.getClass(), "start_idx", 32185364);
        setField(term37325, term37325.getClass(), "player_name", "UiWhvbypdr");
        setIntField(term37325, term37325.getClass(), "hp_vol", 1768204942);
        setBooleanField(term37325, term37325.getClass(), "btn_se_vol", true);
        setIntField(term37325, term37325.getClass(), "btn_se_vol2", 1252951645);
        setIntField(term37325, term37325.getClass(), "sldr_se_vol2", 574481092);
        setField(term37325, term37325.getClass(), "sort_kind", enum86);
        setIntField(term37325, term37325.getClass(), "lv_num", -310528004);
        setIntField(term37325, term37325.getClass(), "lv_pnt", -634976996);
        setField(term37325, term37325.getClass(), "lv_str", "CgleElJNje");
        setIntField(term37325, term37325.getClass(), "lv_efct_id", -1015274146);
        setIntField(term37325, term37325.getClass(), "lv_plt_id", -49052672);
        setField(term37325, term37325.getClass(), "mdl_eqp_ary", "ZrchvNGMtd");
        setField(term37325, term37325.getClass(), "c_itm_eqp_ary", "WaEcyVlcIx");
        setField(term37325, term37325.getClass(), "ms_itm_flg_ary", "ONcbPCQnHd");
        setIntField(term37424, term37424.getClass(), "year", 2029);
        setShortField(term37424, term37424.getClass(), "month", (short) 6);
        setShortField(term37424, term37424.getClass(), "day", (short) 23);
        setField(term37423, term37423.getClass(), "date", term37424);
        setByteField(term37428, term37428.getClass(), "hour", (byte) 21);
        setByteField(term37428, term37428.getClass(), "minute", (byte) 55);
        setByteField(term37428, term37428.getClass(), "second", (byte) 27);
        setIntField(term37428, term37428.getClass(), "nano", 66889274);
        setField(term37423, term37423.getClass(), "time", term37428);
        setField(term37325, term37325.getClass(), "mdl_eqp_tm", term37423);
        setField(term37325, term37325.getClass(), "mdl_have", "AobDaplFLl");
        setField(term37325, term37325.getClass(), "cstmz_itm_have", "pDkMNnAGgv");
        setBooleanField(term37325, term37325.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term37325, term37325.getClass(), "use_mdl_pri", false);
        setBooleanField(term37325, term37325.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term37325, term37325.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term37325, term37325.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term37325, term37325.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term37325, term37325.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term37325, term37325.getClass(), "vcld_pts", 339372704);
        setIntField(term37325, term37325.getClass(), "nxt_pv_id", -851097944);
        setField(term37325, term37325.getClass(), "nxt_dffclty", enum87);
        setField(term37325, term37325.getClass(), "nxt_edtn", enum88);
        setField(term37325, term37325.getClass(), "cv_cid", "PaCpFXGzdX");
        setField(term37325, term37325.getClass(), "cv_sc", "FftYCNbnks");
        setField(term37325, term37325.getClass(), "cv_rr", "lJoltmsadS");
        setField(term37325, term37325.getClass(), "cv_bv", "mvfDtZNEHr");
        setField(term37325, term37325.getClass(), "cv_bf", "bvSgmFUDOU");
        setIntField(term37325, term37325.getClass(), "cnp_cid", 803925431);
        setIntField(term37325, term37325.getClass(), "cnp_val", 76929641);
        setField(term37325, term37325.getClass(), "cnp_rr", enum89);
        setField(term37325, term37325.getClass(), "cnp_sp", "XMHwbfiHRl");
        setField(term37325, term37325.getClass(), "my_lst_0", "bucTnYicnp");
        setField(term37325, term37325.getClass(), "my_lst_1", "EkgprvqZlM");
        setField(term37325, term37325.getClass(), "my_lst_2", "fbnKvthhOz");
        setField(term37325, term37325.getClass(), "my_lst_3", "PGfCDJTBek");
        setField(term37325, term37325.getClass(), "my_lst_4", "ZwjARhAtHC");
        setField(term37325, term37325.getClass(), "dsp_clr_brdr", "XXvscsYBWv");
        setBooleanField(term37325, term37325.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term37325, term37325.getClass(), "dsp_clr_sts", false);
        setField(term37325, term37325.getClass(), "clr_sts", "uePedtiAfL");
        setBooleanField(term37325, term37325.getClass(), "rgo_sts", true);
        setField(term37325, term37325.getClass(), "my_qst_id", "AdSHvysxQB");
        setField(term37325, term37325.getClass(), "my_qst_sts", "jlraKkBWFA");
        setField(term37325, term37325.getClass(), "my_qst_prgrs", "mRBtFTxVdE");
        setField(term37325, term37325.getClass(), "my_qst_et", "IVacFDAZcj");
        setField(term37325, term37325.getClass(), "p_std_ie_have", "EEYmuwyVDP");
        setField(term37325, term37325.getClass(), "p_std_se_have", "EWFbEDAVrE");
        setField(term37325, term37325.getClass(), "cmd", "EMiMtYgfvr");
        setField(term37325, term37325.getClass(), "req_id", "OyYyYYnJuF");
        setField(term37325, term37325.getClass(), "stat", "aYLvcxZohT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getC_itm_eqp_ary", argTypes, term37325, args);
    }

};


