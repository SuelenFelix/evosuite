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

public class StartResponse_getLvnum_213188575811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24817;

    public StartResponse_getLvnum_213188575811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25259 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term25258 = ((Class) term25259).getDeclaredField((String) "SUCCESS");
        ((Field) term25258).setAccessible(true);
        Object enum55 = ((Field) term25258).get((Object) null);
        Class<? extends Object> term25527 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term25526 = ((Class) term25527).getDeclaredField((String) "MY_LIST_A");
        ((Field) term25526).setAccessible(true);
        Object enum56 = ((Field) term25526).get((Object) null);
        Class<? extends Object> term25861 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term25860 = ((Class) term25861).getDeclaredField((String) "EXTREME");
        ((Field) term25860).setAccessible(true);
        Object enum57 = ((Field) term25860).get((Object) null);
        Class<? extends Object> term26139 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term26138 = ((Class) term26139).getDeclaredField((String) "EXTRA");
        ((Field) term26138).setAccessible(true);
        Object enum58 = ((Field) term26138).get((Object) null);
        Class<? extends Object> term26446 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term26445 = ((Class) term26446).getDeclaredField((String) "GOLD");
        ((Field) term26445).setAccessible(true);
        Object enum59 = ((Field) term26445).get((Object) null);
        term24817 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term24915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24920 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24817, term24817.getClass(), "pd_id", -1347358701);
        setField(term24817, term24817.getClass(), "start_result", enum55);
        setIntField(term24817, term24817.getClass(), "accept_idx", 806595993);
        setIntField(term24817, term24817.getClass(), "start_idx", 548228925);
        setField(term24817, term24817.getClass(), "player_name", "zgKiINdgNu");
        setIntField(term24817, term24817.getClass(), "hp_vol", -749861210);
        setBooleanField(term24817, term24817.getClass(), "btn_se_vol", false);
        setIntField(term24817, term24817.getClass(), "btn_se_vol2", 1694224101);
        setIntField(term24817, term24817.getClass(), "sldr_se_vol2", 937859191);
        setField(term24817, term24817.getClass(), "sort_kind", enum56);
        setIntField(term24817, term24817.getClass(), "lv_num", -916584829);
        setIntField(term24817, term24817.getClass(), "lv_pnt", -2131181468);
        setField(term24817, term24817.getClass(), "lv_str", "zLMTXDQHYH");
        setIntField(term24817, term24817.getClass(), "lv_efct_id", 282916351);
        setIntField(term24817, term24817.getClass(), "lv_plt_id", 880977281);
        setField(term24817, term24817.getClass(), "mdl_eqp_ary", "PqywFWJlpE");
        setField(term24817, term24817.getClass(), "c_itm_eqp_ary", "OzXRsFGTIp");
        setField(term24817, term24817.getClass(), "ms_itm_flg_ary", "TjWpyghUWN");
        setIntField(term24916, term24916.getClass(), "year", 2018);
        setShortField(term24916, term24916.getClass(), "month", (short) 9);
        setShortField(term24916, term24916.getClass(), "day", (short) 28);
        setField(term24915, term24915.getClass(), "date", term24916);
        setByteField(term24920, term24920.getClass(), "hour", (byte) 3);
        setByteField(term24920, term24920.getClass(), "minute", (byte) 37);
        setByteField(term24920, term24920.getClass(), "second", (byte) 46);
        setIntField(term24920, term24920.getClass(), "nano", 763326845);
        setField(term24915, term24915.getClass(), "time", term24920);
        setField(term24817, term24817.getClass(), "mdl_eqp_tm", term24915);
        setField(term24817, term24817.getClass(), "mdl_have", "dkZFDZxcde");
        setField(term24817, term24817.getClass(), "cstmz_itm_have", "WXcZEtUKlI");
        setBooleanField(term24817, term24817.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term24817, term24817.getClass(), "use_mdl_pri", false);
        setBooleanField(term24817, term24817.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term24817, term24817.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term24817, term24817.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term24817, term24817.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term24817, term24817.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term24817, term24817.getClass(), "vcld_pts", 371943306);
        setIntField(term24817, term24817.getClass(), "nxt_pv_id", 982388293);
        setField(term24817, term24817.getClass(), "nxt_dffclty", enum57);
        setField(term24817, term24817.getClass(), "nxt_edtn", enum58);
        setField(term24817, term24817.getClass(), "cv_cid", "IkpjUOuWQU");
        setField(term24817, term24817.getClass(), "cv_sc", "boSSpezHeU");
        setField(term24817, term24817.getClass(), "cv_rr", "OUeBWNTQDh");
        setField(term24817, term24817.getClass(), "cv_bv", "gltJarNuUk");
        setField(term24817, term24817.getClass(), "cv_bf", "ZwZIDwYcSW");
        setIntField(term24817, term24817.getClass(), "cnp_cid", -159494544);
        setIntField(term24817, term24817.getClass(), "cnp_val", -75206835);
        setField(term24817, term24817.getClass(), "cnp_rr", enum59);
        setField(term24817, term24817.getClass(), "cnp_sp", "sOdkipUKRu");
        setField(term24817, term24817.getClass(), "my_lst_0", "oKwCDqywym");
        setField(term24817, term24817.getClass(), "my_lst_1", "zjZYTddemL");
        setField(term24817, term24817.getClass(), "my_lst_2", "QtrylgCLiF");
        setField(term24817, term24817.getClass(), "my_lst_3", "orEuhCStGM");
        setField(term24817, term24817.getClass(), "my_lst_4", "HhEaSXWvrY");
        setField(term24817, term24817.getClass(), "dsp_clr_brdr", "CVRGEomOth");
        setBooleanField(term24817, term24817.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term24817, term24817.getClass(), "dsp_clr_sts", true);
        setField(term24817, term24817.getClass(), "clr_sts", "vSeruUyNWX");
        setBooleanField(term24817, term24817.getClass(), "rgo_sts", false);
        setField(term24817, term24817.getClass(), "my_qst_id", "UkKvaeJfEC");
        setField(term24817, term24817.getClass(), "my_qst_sts", "WPxXsahPRq");
        setField(term24817, term24817.getClass(), "my_qst_prgrs", "IENRuqmwUU");
        setField(term24817, term24817.getClass(), "my_qst_et", "GsWxOwXvSu");
        setField(term24817, term24817.getClass(), "p_std_ie_have", "bKBSncrMEZ");
        setField(term24817, term24817.getClass(), "p_std_se_have", "yeSXGqQExb");
        setField(term24817, term24817.getClass(), "cmd", "uXYcXVYJZM");
        setField(term24817, term24817.getClass(), "req_id", "BJhjdJUhkz");
        setField(term24817, term24817.getClass(), "stat", "cdHYQDgUZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_num", argTypes, term24817, args);
    }

};


