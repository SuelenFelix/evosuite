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

public class StartResponse_isDspintrmrnk_100336629148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101819;

    public StartResponse_isDspintrmrnk_100336629148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102260 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term102259 = ((Class) term102260).getDeclaredField((String) "FAILED");
        ((Field) term102259).setAccessible(true);
        Object enum240 = ((Field) term102259).get((Object) null);
        Class<? extends Object> term102525 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term102524 = ((Class) term102525).getDeclaredField((String) "MY_LIST_A");
        ((Field) term102524).setAccessible(true);
        Object enum241 = ((Field) term102524).get((Object) null);
        Class<? extends Object> term102859 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term102858 = ((Class) term102859).getDeclaredField((String) "EASY");
        ((Field) term102858).setAccessible(true);
        Object enum242 = ((Field) term102858).get((Object) null);
        Class<? extends Object> term103128 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term103127 = ((Class) term103128).getDeclaredField((String) "ORIGINAL");
        ((Field) term103127).setAccessible(true);
        Object enum243 = ((Field) term103127).get((Object) null);
        Class<? extends Object> term103444 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term103443 = ((Class) term103444).getDeclaredField((String) "NONE");
        ((Field) term103443).setAccessible(true);
        Object enum244 = ((Field) term103443).get((Object) null);
        term101819 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term101916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101921 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term101819, term101819.getClass(), "pd_id", -1631048635);
        setField(term101819, term101819.getClass(), "start_result", enum240);
        setIntField(term101819, term101819.getClass(), "accept_idx", 1342808731);
        setIntField(term101819, term101819.getClass(), "start_idx", -64893740);
        setField(term101819, term101819.getClass(), "player_name", "ZyAecZGope");
        setIntField(term101819, term101819.getClass(), "hp_vol", -222012928);
        setBooleanField(term101819, term101819.getClass(), "btn_se_vol", false);
        setIntField(term101819, term101819.getClass(), "btn_se_vol2", -146564963);
        setIntField(term101819, term101819.getClass(), "sldr_se_vol2", -83178716);
        setField(term101819, term101819.getClass(), "sort_kind", enum241);
        setIntField(term101819, term101819.getClass(), "lv_num", -1292704466);
        setIntField(term101819, term101819.getClass(), "lv_pnt", 1991858584);
        setField(term101819, term101819.getClass(), "lv_str", "uYnmxkwLfB");
        setIntField(term101819, term101819.getClass(), "lv_efct_id", -1300947782);
        setIntField(term101819, term101819.getClass(), "lv_plt_id", 188512644);
        setField(term101819, term101819.getClass(), "mdl_eqp_ary", "RVZTQxYOUO");
        setField(term101819, term101819.getClass(), "c_itm_eqp_ary", "tydPpKxAbv");
        setField(term101819, term101819.getClass(), "ms_itm_flg_ary", "CJxQpJUfLJ");
        setIntField(term101917, term101917.getClass(), "year", 2012);
        setShortField(term101917, term101917.getClass(), "month", (short) 4);
        setShortField(term101917, term101917.getClass(), "day", (short) 25);
        setField(term101916, term101916.getClass(), "date", term101917);
        setByteField(term101921, term101921.getClass(), "hour", (byte) 21);
        setByteField(term101921, term101921.getClass(), "minute", (byte) 14);
        setByteField(term101921, term101921.getClass(), "second", (byte) 15);
        setIntField(term101921, term101921.getClass(), "nano", 561700934);
        setField(term101916, term101916.getClass(), "time", term101921);
        setField(term101819, term101819.getClass(), "mdl_eqp_tm", term101916);
        setField(term101819, term101819.getClass(), "mdl_have", "NUUjAyqOva");
        setField(term101819, term101819.getClass(), "cstmz_itm_have", "EoAMIIUdDX");
        setBooleanField(term101819, term101819.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term101819, term101819.getClass(), "use_mdl_pri", false);
        setBooleanField(term101819, term101819.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term101819, term101819.getClass(), "use_pv_btn_se_eqp", true);
        setBooleanField(term101819, term101819.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term101819, term101819.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term101819, term101819.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term101819, term101819.getClass(), "vcld_pts", 1851127634);
        setIntField(term101819, term101819.getClass(), "nxt_pv_id", 783730213);
        setField(term101819, term101819.getClass(), "nxt_dffclty", enum242);
        setField(term101819, term101819.getClass(), "nxt_edtn", enum243);
        setField(term101819, term101819.getClass(), "cv_cid", "OATNwRncsv");
        setField(term101819, term101819.getClass(), "cv_sc", "rACmzcmIPm");
        setField(term101819, term101819.getClass(), "cv_rr", "OCtePrLDhe");
        setField(term101819, term101819.getClass(), "cv_bv", "yqEphNxUPZ");
        setField(term101819, term101819.getClass(), "cv_bf", "mJJxTuZuKO");
        setIntField(term101819, term101819.getClass(), "cnp_cid", 1815951606);
        setIntField(term101819, term101819.getClass(), "cnp_val", 1105016932);
        setField(term101819, term101819.getClass(), "cnp_rr", enum244);
        setField(term101819, term101819.getClass(), "cnp_sp", "anSZCikKpS");
        setField(term101819, term101819.getClass(), "my_lst_0", "zvMQGbTtsV");
        setField(term101819, term101819.getClass(), "my_lst_1", "DyUuIDzZPG");
        setField(term101819, term101819.getClass(), "my_lst_2", "EGQLusEtRN");
        setField(term101819, term101819.getClass(), "my_lst_3", "GwGUMPdvZq");
        setField(term101819, term101819.getClass(), "my_lst_4", "iXRAYcFyfS");
        setField(term101819, term101819.getClass(), "dsp_clr_brdr", "lokyclbLEz");
        setBooleanField(term101819, term101819.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term101819, term101819.getClass(), "dsp_clr_sts", false);
        setField(term101819, term101819.getClass(), "clr_sts", "hAPmQGaxkI");
        setBooleanField(term101819, term101819.getClass(), "rgo_sts", false);
        setField(term101819, term101819.getClass(), "my_qst_id", "ojrnLnJZjT");
        setField(term101819, term101819.getClass(), "my_qst_sts", "rtvXSMjOdJ");
        setField(term101819, term101819.getClass(), "my_qst_prgrs", "EDkfjuDpNv");
        setField(term101819, term101819.getClass(), "my_qst_et", "LNHkTUfuHX");
        setField(term101819, term101819.getClass(), "p_std_ie_have", "SVWcOAHiTp");
        setField(term101819, term101819.getClass(), "p_std_se_have", "oShLCaneoQ");
        setField(term101819, term101819.getClass(), "cmd", "nwKkzNpzyC");
        setField(term101819, term101819.getClass(), "req_id", "CwrsdYnHpH");
        setField(term101819, term101819.getClass(), "stat", "jifjXNXluS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDsp_intrm_rnk", argTypes, term101819, args);
    }

};


