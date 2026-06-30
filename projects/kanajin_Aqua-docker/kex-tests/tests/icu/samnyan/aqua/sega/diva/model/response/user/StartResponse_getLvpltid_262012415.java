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

public class StartResponse_getLvpltid_262012415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33169;

    public StartResponse_getLvpltid_262012415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33613 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term33612 = ((Class) term33613).getDeclaredField((String) "FAILED");
        ((Field) term33612).setAccessible(true);
        Object enum75 = ((Field) term33612).get((Object) null);
        Class<? extends Object> term33878 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term33877 = ((Class) term33878).getDeclaredField((String) "MY_LIST_B");
        ((Field) term33877).setAccessible(true);
        Object enum76 = ((Field) term33877).get((Object) null);
        Class<? extends Object> term34212 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term34211 = ((Class) term34212).getDeclaredField((String) "EXTREME");
        ((Field) term34211).setAccessible(true);
        Object enum77 = ((Field) term34211).get((Object) null);
        Class<? extends Object> term34490 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term34489 = ((Class) term34490).getDeclaredField((String) "ORIGINAL");
        ((Field) term34489).setAccessible(true);
        Object enum78 = ((Field) term34489).get((Object) null);
        Class<? extends Object> term34806 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term34805 = ((Class) term34806).getDeclaredField((String) "NONE");
        ((Field) term34805).setAccessible(true);
        Object enum79 = ((Field) term34805).get((Object) null);
        term33169 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term33266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term33271 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term33169, term33169.getClass(), "pd_id", 1593461795);
        setField(term33169, term33169.getClass(), "start_result", enum75);
        setIntField(term33169, term33169.getClass(), "accept_idx", 515182546);
        setIntField(term33169, term33169.getClass(), "start_idx", -936895502);
        setField(term33169, term33169.getClass(), "player_name", "DAujxZPHJC");
        setIntField(term33169, term33169.getClass(), "hp_vol", -129547140);
        setBooleanField(term33169, term33169.getClass(), "btn_se_vol", true);
        setIntField(term33169, term33169.getClass(), "btn_se_vol2", 199287428);
        setIntField(term33169, term33169.getClass(), "sldr_se_vol2", -1195339592);
        setField(term33169, term33169.getClass(), "sort_kind", enum76);
        setIntField(term33169, term33169.getClass(), "lv_num", -376422566);
        setIntField(term33169, term33169.getClass(), "lv_pnt", 306847454);
        setField(term33169, term33169.getClass(), "lv_str", "IlBhdrCvHq");
        setIntField(term33169, term33169.getClass(), "lv_efct_id", 1745276158);
        setIntField(term33169, term33169.getClass(), "lv_plt_id", 2009020256);
        setField(term33169, term33169.getClass(), "mdl_eqp_ary", "OirVUQhauU");
        setField(term33169, term33169.getClass(), "c_itm_eqp_ary", "GLbyDfbNZI");
        setField(term33169, term33169.getClass(), "ms_itm_flg_ary", "oNLcCYDAsO");
        setIntField(term33267, term33267.getClass(), "year", 2017);
        setShortField(term33267, term33267.getClass(), "month", (short) 6);
        setShortField(term33267, term33267.getClass(), "day", (short) 8);
        setField(term33266, term33266.getClass(), "date", term33267);
        setByteField(term33271, term33271.getClass(), "hour", (byte) 0);
        setByteField(term33271, term33271.getClass(), "minute", (byte) 18);
        setByteField(term33271, term33271.getClass(), "second", (byte) 55);
        setIntField(term33271, term33271.getClass(), "nano", 680586717);
        setField(term33266, term33266.getClass(), "time", term33271);
        setField(term33169, term33169.getClass(), "mdl_eqp_tm", term33266);
        setField(term33169, term33169.getClass(), "mdl_have", "CNqMxLvtcJ");
        setField(term33169, term33169.getClass(), "cstmz_itm_have", "ktbqerIaKW");
        setBooleanField(term33169, term33169.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term33169, term33169.getClass(), "use_mdl_pri", true);
        setBooleanField(term33169, term33169.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term33169, term33169.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term33169, term33169.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term33169, term33169.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term33169, term33169.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term33169, term33169.getClass(), "vcld_pts", 2049577015);
        setIntField(term33169, term33169.getClass(), "nxt_pv_id", 1236004505);
        setField(term33169, term33169.getClass(), "nxt_dffclty", enum77);
        setField(term33169, term33169.getClass(), "nxt_edtn", enum78);
        setField(term33169, term33169.getClass(), "cv_cid", "VoghngXfsK");
        setField(term33169, term33169.getClass(), "cv_sc", "GbahCBMvct");
        setField(term33169, term33169.getClass(), "cv_rr", "iiHBhsNFgk");
        setField(term33169, term33169.getClass(), "cv_bv", "HknsTajwxJ");
        setField(term33169, term33169.getClass(), "cv_bf", "XtiurrVYKw");
        setIntField(term33169, term33169.getClass(), "cnp_cid", 1050765721);
        setIntField(term33169, term33169.getClass(), "cnp_val", 474518942);
        setField(term33169, term33169.getClass(), "cnp_rr", enum79);
        setField(term33169, term33169.getClass(), "cnp_sp", "rsumfoDNHa");
        setField(term33169, term33169.getClass(), "my_lst_0", "ceCWHUTQUM");
        setField(term33169, term33169.getClass(), "my_lst_1", "LrqwfrKKtS");
        setField(term33169, term33169.getClass(), "my_lst_2", "ZUdnQXfzCI");
        setField(term33169, term33169.getClass(), "my_lst_3", "EULDrUNQvw");
        setField(term33169, term33169.getClass(), "my_lst_4", "BtvAvsJSei");
        setField(term33169, term33169.getClass(), "dsp_clr_brdr", "vqnBkkxoIa");
        setBooleanField(term33169, term33169.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term33169, term33169.getClass(), "dsp_clr_sts", false);
        setField(term33169, term33169.getClass(), "clr_sts", "bycpZjxXFn");
        setBooleanField(term33169, term33169.getClass(), "rgo_sts", true);
        setField(term33169, term33169.getClass(), "my_qst_id", "jQWttOAiwL");
        setField(term33169, term33169.getClass(), "my_qst_sts", "DzKFxEuEEC");
        setField(term33169, term33169.getClass(), "my_qst_prgrs", "CAMnvfDLJL");
        setField(term33169, term33169.getClass(), "my_qst_et", "mfHtgSbdjD");
        setField(term33169, term33169.getClass(), "p_std_ie_have", "cmuaUiHMVL");
        setField(term33169, term33169.getClass(), "p_std_se_have", "xjoSGPWUgu");
        setField(term33169, term33169.getClass(), "cmd", "uzmqjnOUXu");
        setField(term33169, term33169.getClass(), "req_id", "xeyjTOCOJb");
        setField(term33169, term33169.getClass(), "stat", "DGRqjjdhzy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLv_plt_id", argTypes, term33169, args);
    }

};


