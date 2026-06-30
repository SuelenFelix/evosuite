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

public class StartResponse_setMylst3_80244260102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215314;

    public StartResponse_setMylst3_80244260102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term215771 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term215770 = ((Class) term215771).getDeclaredField((String) "FAILED");
        ((Field) term215770).setAccessible(true);
        Object enum512 = ((Field) term215770).get((Object) null);
        Class<? extends Object> term216036 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term216035 = ((Class) term216036).getDeclaredField((String) "MY_LIST_A");
        ((Field) term216035).setAccessible(true);
        Object enum513 = ((Field) term216035).get((Object) null);
        Class<? extends Object> term216370 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term216369 = ((Class) term216370).getDeclaredField((String) "NORMAL");
        ((Field) term216369).setAccessible(true);
        Object enum514 = ((Field) term216369).get((Object) null);
        Class<? extends Object> term216645 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term216644 = ((Class) term216645).getDeclaredField((String) "ORIGINAL");
        ((Field) term216644).setAccessible(true);
        Object enum515 = ((Field) term216644).get((Object) null);
        Class<? extends Object> term216961 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term216960 = ((Class) term216961).getDeclaredField((String) "BRONZE");
        ((Field) term216960).setAccessible(true);
        Object enum516 = ((Field) term216960).get((Object) null);
        term215314 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term215411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215416 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term215314, term215314.getClass(), "pd_id", 1370246522);
        setField(term215314, term215314.getClass(), "start_result", enum512);
        setIntField(term215314, term215314.getClass(), "accept_idx", -574611924);
        setIntField(term215314, term215314.getClass(), "start_idx", 512521742);
        setField(term215314, term215314.getClass(), "player_name", "ZsGqLnRMml");
        setIntField(term215314, term215314.getClass(), "hp_vol", 1291000976);
        setBooleanField(term215314, term215314.getClass(), "btn_se_vol", false);
        setIntField(term215314, term215314.getClass(), "btn_se_vol2", 1143522832);
        setIntField(term215314, term215314.getClass(), "sldr_se_vol2", 40965975);
        setField(term215314, term215314.getClass(), "sort_kind", enum513);
        setIntField(term215314, term215314.getClass(), "lv_num", -194718582);
        setIntField(term215314, term215314.getClass(), "lv_pnt", 42982854);
        setField(term215314, term215314.getClass(), "lv_str", "BTXsqJgjjs");
        setIntField(term215314, term215314.getClass(), "lv_efct_id", -1129506480);
        setIntField(term215314, term215314.getClass(), "lv_plt_id", 301438568);
        setField(term215314, term215314.getClass(), "mdl_eqp_ary", "OjFRpvsLzi");
        setField(term215314, term215314.getClass(), "c_itm_eqp_ary", "kugZgYRWcG");
        setField(term215314, term215314.getClass(), "ms_itm_flg_ary", "OzucqAMebQ");
        setIntField(term215412, term215412.getClass(), "year", 2025);
        setShortField(term215412, term215412.getClass(), "month", (short) 9);
        setShortField(term215412, term215412.getClass(), "day", (short) 18);
        setField(term215411, term215411.getClass(), "date", term215412);
        setByteField(term215416, term215416.getClass(), "hour", (byte) 16);
        setByteField(term215416, term215416.getClass(), "minute", (byte) 1);
        setByteField(term215416, term215416.getClass(), "second", (byte) 23);
        setIntField(term215416, term215416.getClass(), "nano", 178285726);
        setField(term215411, term215411.getClass(), "time", term215416);
        setField(term215314, term215314.getClass(), "mdl_eqp_tm", term215411);
        setField(term215314, term215314.getClass(), "mdl_have", "VecourIOHN");
        setField(term215314, term215314.getClass(), "cstmz_itm_have", "tZiwBSETUL");
        setBooleanField(term215314, term215314.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term215314, term215314.getClass(), "use_mdl_pri", true);
        setBooleanField(term215314, term215314.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term215314, term215314.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term215314, term215314.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term215314, term215314.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term215314, term215314.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term215314, term215314.getClass(), "vcld_pts", -1667908453);
        setIntField(term215314, term215314.getClass(), "nxt_pv_id", 315910438);
        setField(term215314, term215314.getClass(), "nxt_dffclty", enum514);
        setField(term215314, term215314.getClass(), "nxt_edtn", enum515);
        setField(term215314, term215314.getClass(), "cv_cid", "fmecFLYSIi");
        setField(term215314, term215314.getClass(), "cv_sc", "bjjsWtQeyp");
        setField(term215314, term215314.getClass(), "cv_rr", "CoPgTYdcst");
        setField(term215314, term215314.getClass(), "cv_bv", "UYWsaWaOUS");
        setField(term215314, term215314.getClass(), "cv_bf", "oOxKzvqxUJ");
        setIntField(term215314, term215314.getClass(), "cnp_cid", -1673157821);
        setIntField(term215314, term215314.getClass(), "cnp_val", 1217804703);
        setField(term215314, term215314.getClass(), "cnp_rr", enum516);
        setField(term215314, term215314.getClass(), "cnp_sp", "tjqgiPrtgj");
        setField(term215314, term215314.getClass(), "my_lst_0", "atajdBiCpk");
        setField(term215314, term215314.getClass(), "my_lst_1", "iZkNHOfNWw");
        setField(term215314, term215314.getClass(), "my_lst_2", "SxvlCppquX");
        setField(term215314, term215314.getClass(), "my_lst_3", "KXtTCHHVWr");
        setField(term215314, term215314.getClass(), "my_lst_4", "ylbTmYKeKr");
        setField(term215314, term215314.getClass(), "dsp_clr_brdr", "iyKZenGXgC");
        setBooleanField(term215314, term215314.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term215314, term215314.getClass(), "dsp_clr_sts", true);
        setField(term215314, term215314.getClass(), "clr_sts", "jgPUpbSRNf");
        setBooleanField(term215314, term215314.getClass(), "rgo_sts", true);
        setField(term215314, term215314.getClass(), "my_qst_id", "GHKReaUGqB");
        setField(term215314, term215314.getClass(), "my_qst_sts", "oWFgLqbhiK");
        setField(term215314, term215314.getClass(), "my_qst_prgrs", "gyLdvdOJQs");
        setField(term215314, term215314.getClass(), "my_qst_et", "PASAYkwcOc");
        setField(term215314, term215314.getClass(), "p_std_ie_have", "aeiojdusXr");
        setField(term215314, term215314.getClass(), "p_std_se_have", "KKgjZsGDBV");
        setField(term215314, term215314.getClass(), "cmd", "EkIjtjomYk");
        setField(term215314, term215314.getClass(), "req_id", "ZOUuaTJRXe");
        setField(term215314, term215314.getClass(), "stat", "gIyzpvuRnO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oLFNhFdMBL";
        callMethod(klass, "setMy_lst_3", argTypes, term215314, args);
    }

};


