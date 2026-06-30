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

public class StartResponse_setLvefctid_177438423071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150015;
     Object term150459;

    public StartResponse_setLvefctid_177438423071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150462 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term150461 = ((Class) term150462).getDeclaredField((String) "FAILED");
        ((Field) term150461).setAccessible(true);
        Object enum356 = ((Field) term150461).get((Object) null);
        Class<? extends Object> term150727 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term150726 = ((Class) term150727).getDeclaredField((String) "COMPLEXITY");
        ((Field) term150726).setAccessible(true);
        Object enum357 = ((Field) term150726).get((Object) null);
        Class<? extends Object> term151064 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term151063 = ((Class) term151064).getDeclaredField((String) "EXTREME");
        ((Field) term151063).setAccessible(true);
        Object enum358 = ((Field) term151063).get((Object) null);
        Class<? extends Object> term151342 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term151341 = ((Class) term151342).getDeclaredField((String) "ORIGINAL");
        ((Field) term151341).setAccessible(true);
        Object enum359 = ((Field) term151341).get((Object) null);
        Class<? extends Object> term151658 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term151657 = ((Class) term151658).getDeclaredField((String) "NONE");
        ((Field) term151657).setAccessible(true);
        Object enum360 = ((Field) term151657).get((Object) null);
        term150015 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term150113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150114 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150118 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term150015, term150015.getClass(), "pd_id", 1186917020);
        setField(term150015, term150015.getClass(), "start_result", enum356);
        setIntField(term150015, term150015.getClass(), "accept_idx", 1670041824);
        setIntField(term150015, term150015.getClass(), "start_idx", 2140388634);
        setField(term150015, term150015.getClass(), "player_name", "ghoklPMuMt");
        setIntField(term150015, term150015.getClass(), "hp_vol", 21095258);
        setBooleanField(term150015, term150015.getClass(), "btn_se_vol", true);
        setIntField(term150015, term150015.getClass(), "btn_se_vol2", -1793997256);
        setIntField(term150015, term150015.getClass(), "sldr_se_vol2", -1271598018);
        setField(term150015, term150015.getClass(), "sort_kind", enum357);
        setIntField(term150015, term150015.getClass(), "lv_num", 157967613);
        setIntField(term150015, term150015.getClass(), "lv_pnt", 811839399);
        setField(term150015, term150015.getClass(), "lv_str", "uAgfQbLPeZ");
        setIntField(term150015, term150015.getClass(), "lv_efct_id", 593962063);
        setIntField(term150015, term150015.getClass(), "lv_plt_id", -1485826786);
        setField(term150015, term150015.getClass(), "mdl_eqp_ary", "aZiFZfzhQT");
        setField(term150015, term150015.getClass(), "c_itm_eqp_ary", "HbzAbCwWRh");
        setField(term150015, term150015.getClass(), "ms_itm_flg_ary", "yBgWgFtVxP");
        setIntField(term150114, term150114.getClass(), "year", 2026);
        setShortField(term150114, term150114.getClass(), "month", (short) 10);
        setShortField(term150114, term150114.getClass(), "day", (short) 31);
        setField(term150113, term150113.getClass(), "date", term150114);
        setByteField(term150118, term150118.getClass(), "hour", (byte) 17);
        setByteField(term150118, term150118.getClass(), "minute", (byte) 6);
        setByteField(term150118, term150118.getClass(), "second", (byte) 30);
        setIntField(term150118, term150118.getClass(), "nano", 785931660);
        setField(term150113, term150113.getClass(), "time", term150118);
        setField(term150015, term150015.getClass(), "mdl_eqp_tm", term150113);
        setField(term150015, term150015.getClass(), "mdl_have", "NAwiEDVBcB");
        setField(term150015, term150015.getClass(), "cstmz_itm_have", "jxuVQHHLqy");
        setBooleanField(term150015, term150015.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term150015, term150015.getClass(), "use_mdl_pri", false);
        setBooleanField(term150015, term150015.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term150015, term150015.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term150015, term150015.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term150015, term150015.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term150015, term150015.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term150015, term150015.getClass(), "vcld_pts", -1549952664);
        setIntField(term150015, term150015.getClass(), "nxt_pv_id", 148394188);
        setField(term150015, term150015.getClass(), "nxt_dffclty", enum358);
        setField(term150015, term150015.getClass(), "nxt_edtn", enum359);
        setField(term150015, term150015.getClass(), "cv_cid", "TnUXNtKOns");
        setField(term150015, term150015.getClass(), "cv_sc", "umsYdaPflb");
        setField(term150015, term150015.getClass(), "cv_rr", "CnNmpSyiBE");
        setField(term150015, term150015.getClass(), "cv_bv", "JvKKIGdUWh");
        setField(term150015, term150015.getClass(), "cv_bf", "DInvDrzBtt");
        setIntField(term150015, term150015.getClass(), "cnp_cid", 504525721);
        setIntField(term150015, term150015.getClass(), "cnp_val", 1835568392);
        setField(term150015, term150015.getClass(), "cnp_rr", enum360);
        setField(term150015, term150015.getClass(), "cnp_sp", "igZJubDPuK");
        setField(term150015, term150015.getClass(), "my_lst_0", "qxBdFhLbAN");
        setField(term150015, term150015.getClass(), "my_lst_1", "KyUmXHRrED");
        setField(term150015, term150015.getClass(), "my_lst_2", "eOMBFVrNcf");
        setField(term150015, term150015.getClass(), "my_lst_3", "gOwOIsocMB");
        setField(term150015, term150015.getClass(), "my_lst_4", "GqTBOhQBgV");
        setField(term150015, term150015.getClass(), "dsp_clr_brdr", "DQhxOWqEyi");
        setBooleanField(term150015, term150015.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term150015, term150015.getClass(), "dsp_clr_sts", false);
        setField(term150015, term150015.getClass(), "clr_sts", "dSszYGDwAk");
        setBooleanField(term150015, term150015.getClass(), "rgo_sts", true);
        setField(term150015, term150015.getClass(), "my_qst_id", "gNeMyGSVIG");
        setField(term150015, term150015.getClass(), "my_qst_sts", "qxEkaqdKPG");
        setField(term150015, term150015.getClass(), "my_qst_prgrs", "VclIptmKrF");
        setField(term150015, term150015.getClass(), "my_qst_et", "wcTeSHCZwz");
        setField(term150015, term150015.getClass(), "p_std_ie_have", "fxxnbYOiZZ");
        setField(term150015, term150015.getClass(), "p_std_se_have", "CTnRYaYXia");
        setField(term150015, term150015.getClass(), "cmd", "SUIYUFtCCe");
        setField(term150015, term150015.getClass(), "req_id", "eKCrPCkedw");
        setField(term150015, term150015.getClass(), "stat", "VAFSknHLsZ");
        term150459 = new Integer(457470807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term150459;
        callMethod(klass, "setLv_efct_id", argTypes, term150015, args);
    }

};


