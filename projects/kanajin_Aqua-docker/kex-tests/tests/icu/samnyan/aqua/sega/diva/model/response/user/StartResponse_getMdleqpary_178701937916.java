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

public class StartResponse_getMdleqpary_178701937916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35259;

    public StartResponse_getMdleqpary_178701937916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35697 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term35696 = ((Class) term35697).getDeclaredField((String) "SUCCESS");
        ((Field) term35696).setAccessible(true);
        Object enum80 = ((Field) term35696).get((Object) null);
        Class<? extends Object> term35965 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term35964 = ((Class) term35965).getDeclaredField((String) "NAME");
        ((Field) term35964).setAccessible(true);
        Object enum81 = ((Field) term35964).get((Object) null);
        Class<? extends Object> term36284 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term36283 = ((Class) term36284).getDeclaredField((String) "NORMAL");
        ((Field) term36283).setAccessible(true);
        Object enum82 = ((Field) term36283).get((Object) null);
        Class<? extends Object> term36559 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term36558 = ((Class) term36559).getDeclaredField((String) "EXTRA");
        ((Field) term36558).setAccessible(true);
        Object enum83 = ((Field) term36558).get((Object) null);
        Class<? extends Object> term36866 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term36865 = ((Class) term36866).getDeclaredField((String) "SILVER");
        ((Field) term36865).setAccessible(true);
        Object enum84 = ((Field) term36865).get((Object) null);
        term35259 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term35352 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35353 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35357 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term35259, term35259.getClass(), "pd_id", -1656687479);
        setField(term35259, term35259.getClass(), "start_result", enum80);
        setIntField(term35259, term35259.getClass(), "accept_idx", -249614216);
        setIntField(term35259, term35259.getClass(), "start_idx", 1870727665);
        setField(term35259, term35259.getClass(), "player_name", "lQFkjJUPAR");
        setIntField(term35259, term35259.getClass(), "hp_vol", -519881101);
        setBooleanField(term35259, term35259.getClass(), "btn_se_vol", true);
        setIntField(term35259, term35259.getClass(), "btn_se_vol2", -680920524);
        setIntField(term35259, term35259.getClass(), "sldr_se_vol2", -916335264);
        setField(term35259, term35259.getClass(), "sort_kind", enum81);
        setIntField(term35259, term35259.getClass(), "lv_num", -919416536);
        setIntField(term35259, term35259.getClass(), "lv_pnt", -43417861);
        setField(term35259, term35259.getClass(), "lv_str", "BsuVlGUUjV");
        setIntField(term35259, term35259.getClass(), "lv_efct_id", -1533843432);
        setIntField(term35259, term35259.getClass(), "lv_plt_id", -123338791);
        setField(term35259, term35259.getClass(), "mdl_eqp_ary", "bHHjfDCntT");
        setField(term35259, term35259.getClass(), "c_itm_eqp_ary", "sEphiduvkv");
        setField(term35259, term35259.getClass(), "ms_itm_flg_ary", "PbLgCSAHce");
        setIntField(term35353, term35353.getClass(), "year", 2015);
        setShortField(term35353, term35353.getClass(), "month", (short) 9);
        setShortField(term35353, term35353.getClass(), "day", (short) 16);
        setField(term35352, term35352.getClass(), "date", term35353);
        setByteField(term35357, term35357.getClass(), "hour", (byte) 6);
        setByteField(term35357, term35357.getClass(), "minute", (byte) 19);
        setByteField(term35357, term35357.getClass(), "second", (byte) 42);
        setIntField(term35357, term35357.getClass(), "nano", 630084975);
        setField(term35352, term35352.getClass(), "time", term35357);
        setField(term35259, term35259.getClass(), "mdl_eqp_tm", term35352);
        setField(term35259, term35259.getClass(), "mdl_have", "NWldOLAbqk");
        setField(term35259, term35259.getClass(), "cstmz_itm_have", "qnYaYSpDwO");
        setBooleanField(term35259, term35259.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term35259, term35259.getClass(), "use_mdl_pri", false);
        setBooleanField(term35259, term35259.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term35259, term35259.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term35259, term35259.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term35259, term35259.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term35259, term35259.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term35259, term35259.getClass(), "vcld_pts", -1467089634);
        setIntField(term35259, term35259.getClass(), "nxt_pv_id", 413548937);
        setField(term35259, term35259.getClass(), "nxt_dffclty", enum82);
        setField(term35259, term35259.getClass(), "nxt_edtn", enum83);
        setField(term35259, term35259.getClass(), "cv_cid", "dgbFDCdHtj");
        setField(term35259, term35259.getClass(), "cv_sc", "EKpdCBubDE");
        setField(term35259, term35259.getClass(), "cv_rr", "zMsSLTfGhl");
        setField(term35259, term35259.getClass(), "cv_bv", "bEmHScVZaQ");
        setField(term35259, term35259.getClass(), "cv_bf", "TcuXODkzBV");
        setIntField(term35259, term35259.getClass(), "cnp_cid", 1901317214);
        setIntField(term35259, term35259.getClass(), "cnp_val", 1166710220);
        setField(term35259, term35259.getClass(), "cnp_rr", enum84);
        setField(term35259, term35259.getClass(), "cnp_sp", "coJPjrBZNe");
        setField(term35259, term35259.getClass(), "my_lst_0", "vMsWjuPTnO");
        setField(term35259, term35259.getClass(), "my_lst_1", "zHvfKaOstO");
        setField(term35259, term35259.getClass(), "my_lst_2", "tOszriqETr");
        setField(term35259, term35259.getClass(), "my_lst_3", "ncSPTkhKjO");
        setField(term35259, term35259.getClass(), "my_lst_4", "jcWKHRWhyj");
        setField(term35259, term35259.getClass(), "dsp_clr_brdr", "nrQjODRMLD");
        setBooleanField(term35259, term35259.getClass(), "dsp_intrm_rnk", true);
        setBooleanField(term35259, term35259.getClass(), "dsp_clr_sts", true);
        setField(term35259, term35259.getClass(), "clr_sts", "PNoWXrsFic");
        setBooleanField(term35259, term35259.getClass(), "rgo_sts", true);
        setField(term35259, term35259.getClass(), "my_qst_id", "QZBHZqZope");
        setField(term35259, term35259.getClass(), "my_qst_sts", "VBUahCvyxC");
        setField(term35259, term35259.getClass(), "my_qst_prgrs", "MlzTkzKMCX");
        setField(term35259, term35259.getClass(), "my_qst_et", "UqKUbMyPMJ");
        setField(term35259, term35259.getClass(), "p_std_ie_have", "QpYltHAdyY");
        setField(term35259, term35259.getClass(), "p_std_se_have", "lbmSGBwIiV");
        setField(term35259, term35259.getClass(), "cmd", "DAxyHoTLzZ");
        setField(term35259, term35259.getClass(), "req_id", "fhZgTouhCC");
        setField(term35259, term35259.getClass(), "stat", "wrikqJwXvL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_eqp_ary", argTypes, term35259, args);
    }

};


