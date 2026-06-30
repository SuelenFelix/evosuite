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

public class StartResponse_setLvpnt_207977419669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145855;
     Object term146295;

    public StartResponse_setLvpnt_207977419669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term146298 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term146297 = ((Class) term146298).getDeclaredField((String) "FAILED");
        ((Field) term146297).setAccessible(true);
        Object enum346 = ((Field) term146297).get((Object) null);
        Class<? extends Object> term146563 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term146562 = ((Class) term146563).getDeclaredField((String) "MY_LIST_B");
        ((Field) term146562).setAccessible(true);
        Object enum347 = ((Field) term146562).get((Object) null);
        Class<? extends Object> term146897 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term146896 = ((Class) term146897).getDeclaredField((String) "EASY");
        ((Field) term146896).setAccessible(true);
        Object enum348 = ((Field) term146896).get((Object) null);
        Class<? extends Object> term147166 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term147165 = ((Class) term147166).getDeclaredField((String) "ORIGINAL");
        ((Field) term147165).setAccessible(true);
        Object enum349 = ((Field) term147165).get((Object) null);
        Class<? extends Object> term147482 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term147481 = ((Class) term147482).getDeclaredField((String) "NONE");
        ((Field) term147481).setAccessible(true);
        Object enum350 = ((Field) term147481).get((Object) null);
        term145855 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term145952 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145953 = newInstance(Class.forName("java.time.LocalDate"));
        Object term145957 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term145855, term145855.getClass(), "pd_id", -382652403);
        setField(term145855, term145855.getClass(), "start_result", enum346);
        setIntField(term145855, term145855.getClass(), "accept_idx", -2126539433);
        setIntField(term145855, term145855.getClass(), "start_idx", 196952878);
        setField(term145855, term145855.getClass(), "player_name", "shGEZulpDG");
        setIntField(term145855, term145855.getClass(), "hp_vol", 802673242);
        setBooleanField(term145855, term145855.getClass(), "btn_se_vol", true);
        setIntField(term145855, term145855.getClass(), "btn_se_vol2", -1808638031);
        setIntField(term145855, term145855.getClass(), "sldr_se_vol2", -1514240086);
        setField(term145855, term145855.getClass(), "sort_kind", enum347);
        setIntField(term145855, term145855.getClass(), "lv_num", 2052244839);
        setIntField(term145855, term145855.getClass(), "lv_pnt", -1763480506);
        setField(term145855, term145855.getClass(), "lv_str", "twDnEqZglX");
        setIntField(term145855, term145855.getClass(), "lv_efct_id", -1541297110);
        setIntField(term145855, term145855.getClass(), "lv_plt_id", -1581464804);
        setField(term145855, term145855.getClass(), "mdl_eqp_ary", "TWzZFATLAj");
        setField(term145855, term145855.getClass(), "c_itm_eqp_ary", "QjsqHrtVMY");
        setField(term145855, term145855.getClass(), "ms_itm_flg_ary", "PlQZGGhnZK");
        setIntField(term145953, term145953.getClass(), "year", 2019);
        setShortField(term145953, term145953.getClass(), "month", (short) 7);
        setShortField(term145953, term145953.getClass(), "day", (short) 19);
        setField(term145952, term145952.getClass(), "date", term145953);
        setByteField(term145957, term145957.getClass(), "hour", (byte) 10);
        setByteField(term145957, term145957.getClass(), "minute", (byte) 54);
        setByteField(term145957, term145957.getClass(), "second", (byte) 55);
        setIntField(term145957, term145957.getClass(), "nano", 244650454);
        setField(term145952, term145952.getClass(), "time", term145957);
        setField(term145855, term145855.getClass(), "mdl_eqp_tm", term145952);
        setField(term145855, term145855.getClass(), "mdl_have", "sTtLCWDEPO");
        setField(term145855, term145855.getClass(), "cstmz_itm_have", "UGMtNRjhnC");
        setBooleanField(term145855, term145855.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term145855, term145855.getClass(), "use_mdl_pri", true);
        setBooleanField(term145855, term145855.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term145855, term145855.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term145855, term145855.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term145855, term145855.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term145855, term145855.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term145855, term145855.getClass(), "vcld_pts", -1954937310);
        setIntField(term145855, term145855.getClass(), "nxt_pv_id", -460657407);
        setField(term145855, term145855.getClass(), "nxt_dffclty", enum348);
        setField(term145855, term145855.getClass(), "nxt_edtn", enum349);
        setField(term145855, term145855.getClass(), "cv_cid", "oTnPmmIphJ");
        setField(term145855, term145855.getClass(), "cv_sc", "vTgJolwQXF");
        setField(term145855, term145855.getClass(), "cv_rr", "QuNSfeKtAH");
        setField(term145855, term145855.getClass(), "cv_bv", "vFhRdscfFA");
        setField(term145855, term145855.getClass(), "cv_bf", "ZmfocrvaII");
        setIntField(term145855, term145855.getClass(), "cnp_cid", 941003590);
        setIntField(term145855, term145855.getClass(), "cnp_val", -1825624890);
        setField(term145855, term145855.getClass(), "cnp_rr", enum350);
        setField(term145855, term145855.getClass(), "cnp_sp", "LTbQXrGKuA");
        setField(term145855, term145855.getClass(), "my_lst_0", "gzmGmDALUv");
        setField(term145855, term145855.getClass(), "my_lst_1", "ZRoptBRTDM");
        setField(term145855, term145855.getClass(), "my_lst_2", "vVVFChfeBQ");
        setField(term145855, term145855.getClass(), "my_lst_3", "aASfcqfBbh");
        setField(term145855, term145855.getClass(), "my_lst_4", "DwpOIkpRFT");
        setField(term145855, term145855.getClass(), "dsp_clr_brdr", "LPlTDoLrUy");
        setBooleanField(term145855, term145855.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term145855, term145855.getClass(), "dsp_clr_sts", true);
        setField(term145855, term145855.getClass(), "clr_sts", "XETimBHIKG");
        setBooleanField(term145855, term145855.getClass(), "rgo_sts", false);
        setField(term145855, term145855.getClass(), "my_qst_id", "nOKVZSyfbZ");
        setField(term145855, term145855.getClass(), "my_qst_sts", "adHZFgDoEH");
        setField(term145855, term145855.getClass(), "my_qst_prgrs", "vjNETNMDhQ");
        setField(term145855, term145855.getClass(), "my_qst_et", "pexqQqwSNj");
        setField(term145855, term145855.getClass(), "p_std_ie_have", "myfXkIEBSV");
        setField(term145855, term145855.getClass(), "p_std_se_have", "LSrqDVjzEP");
        setField(term145855, term145855.getClass(), "cmd", "CPZCLJxTuA");
        setField(term145855, term145855.getClass(), "req_id", "ivAOXnVjmg");
        setField(term145855, term145855.getClass(), "stat", "FivesaUeHG");
        term146295 = new Integer(413214164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term146295;
        callMethod(klass, "setLv_pnt", argTypes, term145855, args);
    }

};


