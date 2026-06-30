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

public class StartResponse_getCvrr_75579749435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74789;

    public StartResponse_getCvrr_75579749435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term75233 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term75232 = ((Class) term75233).getDeclaredField((String) "SUCCESS");
        ((Field) term75232).setAccessible(true);
        Object enum175 = ((Field) term75232).get((Object) null);
        Class<? extends Object> term75501 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term75500 = ((Class) term75501).getDeclaredField((String) "MY_LIST_B");
        ((Field) term75500).setAccessible(true);
        Object enum176 = ((Field) term75500).get((Object) null);
        Class<? extends Object> term75835 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term75834 = ((Class) term75835).getDeclaredField((String) "EXTREME");
        ((Field) term75834).setAccessible(true);
        Object enum177 = ((Field) term75834).get((Object) null);
        Class<? extends Object> term76113 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term76112 = ((Class) term76113).getDeclaredField((String) "EXTRA");
        ((Field) term76112).setAccessible(true);
        Object enum178 = ((Field) term76112).get((Object) null);
        Class<? extends Object> term76420 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term76419 = ((Class) term76420).getDeclaredField((String) "SILVER");
        ((Field) term76419).setAccessible(true);
        Object enum179 = ((Field) term76419).get((Object) null);
        term74789 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term74887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term74892 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term74789, term74789.getClass(), "pd_id", -1271375703);
        setField(term74789, term74789.getClass(), "start_result", enum175);
        setIntField(term74789, term74789.getClass(), "accept_idx", 1136208236);
        setIntField(term74789, term74789.getClass(), "start_idx", -1220630391);
        setField(term74789, term74789.getClass(), "player_name", "ewbQRtustW");
        setIntField(term74789, term74789.getClass(), "hp_vol", -995822131);
        setBooleanField(term74789, term74789.getClass(), "btn_se_vol", true);
        setIntField(term74789, term74789.getClass(), "btn_se_vol2", -687282231);
        setIntField(term74789, term74789.getClass(), "sldr_se_vol2", 1200440315);
        setField(term74789, term74789.getClass(), "sort_kind", enum176);
        setIntField(term74789, term74789.getClass(), "lv_num", 40571662);
        setIntField(term74789, term74789.getClass(), "lv_pnt", 1863910269);
        setField(term74789, term74789.getClass(), "lv_str", "cABEHYBnys");
        setIntField(term74789, term74789.getClass(), "lv_efct_id", 864645689);
        setIntField(term74789, term74789.getClass(), "lv_plt_id", 279384872);
        setField(term74789, term74789.getClass(), "mdl_eqp_ary", "EhlWSobaco");
        setField(term74789, term74789.getClass(), "c_itm_eqp_ary", "hEuycunsSe");
        setField(term74789, term74789.getClass(), "ms_itm_flg_ary", "IMFzXhpNCx");
        setIntField(term74888, term74888.getClass(), "year", 2024);
        setShortField(term74888, term74888.getClass(), "month", (short) 4);
        setShortField(term74888, term74888.getClass(), "day", (short) 24);
        setField(term74887, term74887.getClass(), "date", term74888);
        setByteField(term74892, term74892.getClass(), "hour", (byte) 7);
        setByteField(term74892, term74892.getClass(), "minute", (byte) 2);
        setByteField(term74892, term74892.getClass(), "second", (byte) 51);
        setIntField(term74892, term74892.getClass(), "nano", 635502964);
        setField(term74887, term74887.getClass(), "time", term74892);
        setField(term74789, term74789.getClass(), "mdl_eqp_tm", term74887);
        setField(term74789, term74789.getClass(), "mdl_have", "xAtFmANjwD");
        setField(term74789, term74789.getClass(), "cstmz_itm_have", "ICysuFllEZ");
        setBooleanField(term74789, term74789.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term74789, term74789.getClass(), "use_mdl_pri", false);
        setBooleanField(term74789, term74789.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term74789, term74789.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term74789, term74789.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term74789, term74789.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term74789, term74789.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term74789, term74789.getClass(), "vcld_pts", 1427305953);
        setIntField(term74789, term74789.getClass(), "nxt_pv_id", -781832877);
        setField(term74789, term74789.getClass(), "nxt_dffclty", enum177);
        setField(term74789, term74789.getClass(), "nxt_edtn", enum178);
        setField(term74789, term74789.getClass(), "cv_cid", "cGQJTTxcXr");
        setField(term74789, term74789.getClass(), "cv_sc", "aKaqvssiby");
        setField(term74789, term74789.getClass(), "cv_rr", "tTVbtBVAfo");
        setField(term74789, term74789.getClass(), "cv_bv", "cjaaJUnNCR");
        setField(term74789, term74789.getClass(), "cv_bf", "ETbxNuJLii");
        setIntField(term74789, term74789.getClass(), "cnp_cid", 797203987);
        setIntField(term74789, term74789.getClass(), "cnp_val", 1973060703);
        setField(term74789, term74789.getClass(), "cnp_rr", enum179);
        setField(term74789, term74789.getClass(), "cnp_sp", "YJhnPtWtJR");
        setField(term74789, term74789.getClass(), "my_lst_0", "xzGnrvbExX");
        setField(term74789, term74789.getClass(), "my_lst_1", "LFZNDELxUZ");
        setField(term74789, term74789.getClass(), "my_lst_2", "GNIVsSTglt");
        setField(term74789, term74789.getClass(), "my_lst_3", "mzPebFiUSP");
        setField(term74789, term74789.getClass(), "my_lst_4", "HvbkjsQyDy");
        setField(term74789, term74789.getClass(), "dsp_clr_brdr", "wzSukELQFL");
        setBooleanField(term74789, term74789.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term74789, term74789.getClass(), "dsp_clr_sts", false);
        setField(term74789, term74789.getClass(), "clr_sts", "VZyeaOWYEj");
        setBooleanField(term74789, term74789.getClass(), "rgo_sts", false);
        setField(term74789, term74789.getClass(), "my_qst_id", "PErxMBQSUv");
        setField(term74789, term74789.getClass(), "my_qst_sts", "KZQwbvujui");
        setField(term74789, term74789.getClass(), "my_qst_prgrs", "JPUZuGxKlI");
        setField(term74789, term74789.getClass(), "my_qst_et", "xqIbVsUspl");
        setField(term74789, term74789.getClass(), "p_std_ie_have", "GnjLRtJywq");
        setField(term74789, term74789.getClass(), "p_std_se_have", "TDaodpHTRK");
        setField(term74789, term74789.getClass(), "cmd", "JayazbYDLK");
        setField(term74789, term74789.getClass(), "req_id", "ORDuSTrpNA");
        setField(term74789, term74789.getClass(), "stat", "hysThIPoEJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCv_rr", argTypes, term74789, args);
    }

};


