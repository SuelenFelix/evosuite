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

public class StartResponse_setNxtdffclty_2268666688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185651;
     Object enum443;

    public StartResponse_setNxtdffclty_2268666688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186097 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term186096 = ((Class) term186097).getDeclaredField((String) "SUCCESS");
        ((Field) term186096).setAccessible(true);
        Object enum441 = ((Field) term186096).get((Object) null);
        Class<? extends Object> term186365 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term186364 = ((Class) term186365).getDeclaredField((String) "MY_LIST_B");
        ((Field) term186364).setAccessible(true);
        Object enum442 = ((Field) term186364).get((Object) null);
        Class<? extends Object> term186699 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term186698 = ((Class) term186699).getDeclaredField((String) "NORMAL");
        ((Field) term186698).setAccessible(true);
        enum443 = ((Field) term186698).get((Object) null);
        Class<? extends Object> term186974 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term186973 = ((Class) term186974).getDeclaredField((String) "ORIGINAL");
        ((Field) term186973).setAccessible(true);
        Object enum444 = ((Field) term186973).get((Object) null);
        Class<? extends Object> term187290 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term187289 = ((Class) term187290).getDeclaredField((String) "BRONZE");
        ((Field) term187289).setAccessible(true);
        Object enum445 = ((Field) term187289).get((Object) null);
        term185651 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term185749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185754 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term185651, term185651.getClass(), "pd_id", 1734630901);
        setField(term185651, term185651.getClass(), "start_result", enum441);
        setIntField(term185651, term185651.getClass(), "accept_idx", -703815246);
        setIntField(term185651, term185651.getClass(), "start_idx", 157300746);
        setField(term185651, term185651.getClass(), "player_name", "aomDEETHep");
        setIntField(term185651, term185651.getClass(), "hp_vol", -1600748613);
        setBooleanField(term185651, term185651.getClass(), "btn_se_vol", true);
        setIntField(term185651, term185651.getClass(), "btn_se_vol2", -1509192782);
        setIntField(term185651, term185651.getClass(), "sldr_se_vol2", -867925573);
        setField(term185651, term185651.getClass(), "sort_kind", enum442);
        setIntField(term185651, term185651.getClass(), "lv_num", 478422495);
        setIntField(term185651, term185651.getClass(), "lv_pnt", 1727771237);
        setField(term185651, term185651.getClass(), "lv_str", "GTMrlIYfIM");
        setIntField(term185651, term185651.getClass(), "lv_efct_id", 2033663549);
        setIntField(term185651, term185651.getClass(), "lv_plt_id", 1766479154);
        setField(term185651, term185651.getClass(), "mdl_eqp_ary", "eiDqCOWbLE");
        setField(term185651, term185651.getClass(), "c_itm_eqp_ary", "OBbbsrFNxC");
        setField(term185651, term185651.getClass(), "ms_itm_flg_ary", "mvdZyohjrq");
        setIntField(term185750, term185750.getClass(), "year", 2015);
        setShortField(term185750, term185750.getClass(), "month", (short) 2);
        setShortField(term185750, term185750.getClass(), "day", (short) 5);
        setField(term185749, term185749.getClass(), "date", term185750);
        setByteField(term185754, term185754.getClass(), "hour", (byte) 3);
        setByteField(term185754, term185754.getClass(), "minute", (byte) 26);
        setByteField(term185754, term185754.getClass(), "second", (byte) 49);
        setIntField(term185754, term185754.getClass(), "nano", 995758570);
        setField(term185749, term185749.getClass(), "time", term185754);
        setField(term185651, term185651.getClass(), "mdl_eqp_tm", term185749);
        setField(term185651, term185651.getClass(), "mdl_have", "hXsByefZqZ");
        setField(term185651, term185651.getClass(), "cstmz_itm_have", "PfWKdFFgbz");
        setBooleanField(term185651, term185651.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term185651, term185651.getClass(), "use_mdl_pri", true);
        setBooleanField(term185651, term185651.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term185651, term185651.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term185651, term185651.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term185651, term185651.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term185651, term185651.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term185651, term185651.getClass(), "vcld_pts", 533171496);
        setIntField(term185651, term185651.getClass(), "nxt_pv_id", 1369020869);
        setField(term185651, term185651.getClass(), "nxt_dffclty", enum443);
        setField(term185651, term185651.getClass(), "nxt_edtn", enum444);
        setField(term185651, term185651.getClass(), "cv_cid", "rgmFLfFmTW");
        setField(term185651, term185651.getClass(), "cv_sc", "GHvFvelXFv");
        setField(term185651, term185651.getClass(), "cv_rr", "MIDoqNmCoh");
        setField(term185651, term185651.getClass(), "cv_bv", "yrOIMfdQSI");
        setField(term185651, term185651.getClass(), "cv_bf", "PhtNZAacut");
        setIntField(term185651, term185651.getClass(), "cnp_cid", -1428947021);
        setIntField(term185651, term185651.getClass(), "cnp_val", -134324004);
        setField(term185651, term185651.getClass(), "cnp_rr", enum445);
        setField(term185651, term185651.getClass(), "cnp_sp", "xbPAqsSBBS");
        setField(term185651, term185651.getClass(), "my_lst_0", "ivxMfASKCB");
        setField(term185651, term185651.getClass(), "my_lst_1", "JbksMMXXzT");
        setField(term185651, term185651.getClass(), "my_lst_2", "WHpoLWpffz");
        setField(term185651, term185651.getClass(), "my_lst_3", "axiXBkomuw");
        setField(term185651, term185651.getClass(), "my_lst_4", "nhByIXwUpO");
        setField(term185651, term185651.getClass(), "dsp_clr_brdr", "vVySvQZVok");
        setBooleanField(term185651, term185651.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term185651, term185651.getClass(), "dsp_clr_sts", false);
        setField(term185651, term185651.getClass(), "clr_sts", "fDVzkGiHev");
        setBooleanField(term185651, term185651.getClass(), "rgo_sts", false);
        setField(term185651, term185651.getClass(), "my_qst_id", "CanAbWJNgt");
        setField(term185651, term185651.getClass(), "my_qst_sts", "tFRLUuSeUt");
        setField(term185651, term185651.getClass(), "my_qst_prgrs", "KcKxvbBAHa");
        setField(term185651, term185651.getClass(), "my_qst_et", "NbFVXCPmxn");
        setField(term185651, term185651.getClass(), "p_std_ie_have", "ovYlGvhKKO");
        setField(term185651, term185651.getClass(), "p_std_se_have", "JvoSiMCDAb");
        setField(term185651, term185651.getClass(), "cmd", "JANJXHGMsv");
        setField(term185651, term185651.getClass(), "req_id", "WVQqsFGJMw");
        setField(term185651, term185651.getClass(), "stat", "TIPSlmidwP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = enum443;
        callMethod(klass, "setNxt_dffclty", argTypes, term185651, args);
    }

};


