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

public class StartResponse_setMyqststs_1052300320110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232154;

    public StartResponse_setMyqststs_1052300320110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term232612 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term232611 = ((Class) term232612).getDeclaredField((String) "FAILED");
        ((Field) term232611).setAccessible(true);
        Object enum552 = ((Field) term232611).get((Object) null);
        Class<? extends Object> term232877 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term232876 = ((Class) term232877).getDeclaredField((String) "MY_LIST_B");
        ((Field) term232876).setAccessible(true);
        Object enum553 = ((Field) term232876).get((Object) null);
        Class<? extends Object> term233211 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term233210 = ((Class) term233211).getDeclaredField((String) "EXTREME");
        ((Field) term233210).setAccessible(true);
        Object enum554 = ((Field) term233210).get((Object) null);
        Class<? extends Object> term233489 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term233488 = ((Class) term233489).getDeclaredField((String) "ORIGINAL");
        ((Field) term233488).setAccessible(true);
        Object enum555 = ((Field) term233488).get((Object) null);
        Class<? extends Object> term233805 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term233804 = ((Class) term233805).getDeclaredField((String) "BRONZE");
        ((Field) term233804).setAccessible(true);
        Object enum556 = ((Field) term233804).get((Object) null);
        term232154 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term232251 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232252 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232256 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term232154, term232154.getClass(), "pd_id", -2033952124);
        setField(term232154, term232154.getClass(), "start_result", enum552);
        setIntField(term232154, term232154.getClass(), "accept_idx", 560401653);
        setIntField(term232154, term232154.getClass(), "start_idx", 1633691536);
        setField(term232154, term232154.getClass(), "player_name", "gPuVkQobYQ");
        setIntField(term232154, term232154.getClass(), "hp_vol", 898165245);
        setBooleanField(term232154, term232154.getClass(), "btn_se_vol", false);
        setIntField(term232154, term232154.getClass(), "btn_se_vol2", 1810754549);
        setIntField(term232154, term232154.getClass(), "sldr_se_vol2", 338342107);
        setField(term232154, term232154.getClass(), "sort_kind", enum553);
        setIntField(term232154, term232154.getClass(), "lv_num", -650288950);
        setIntField(term232154, term232154.getClass(), "lv_pnt", 433039357);
        setField(term232154, term232154.getClass(), "lv_str", "sAHDMENVSp");
        setIntField(term232154, term232154.getClass(), "lv_efct_id", 1469939797);
        setIntField(term232154, term232154.getClass(), "lv_plt_id", 252799294);
        setField(term232154, term232154.getClass(), "mdl_eqp_ary", "oLoxfeWIGH");
        setField(term232154, term232154.getClass(), "c_itm_eqp_ary", "vdErTHSsJu");
        setField(term232154, term232154.getClass(), "ms_itm_flg_ary", "MeFZCtLbdV");
        setIntField(term232252, term232252.getClass(), "year", 2028);
        setShortField(term232252, term232252.getClass(), "month", (short) 1);
        setShortField(term232252, term232252.getClass(), "day", (short) 11);
        setField(term232251, term232251.getClass(), "date", term232252);
        setByteField(term232256, term232256.getClass(), "hour", (byte) 22);
        setByteField(term232256, term232256.getClass(), "minute", (byte) 3);
        setByteField(term232256, term232256.getClass(), "second", (byte) 39);
        setIntField(term232256, term232256.getClass(), "nano", 175567313);
        setField(term232251, term232251.getClass(), "time", term232256);
        setField(term232154, term232154.getClass(), "mdl_eqp_tm", term232251);
        setField(term232154, term232154.getClass(), "mdl_have", "oNgxBniAuz");
        setField(term232154, term232154.getClass(), "cstmz_itm_have", "hvbJVpbmAQ");
        setBooleanField(term232154, term232154.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term232154, term232154.getClass(), "use_mdl_pri", true);
        setBooleanField(term232154, term232154.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term232154, term232154.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term232154, term232154.getClass(), "use_pv_sld_se_eqp", true);
        setBooleanField(term232154, term232154.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term232154, term232154.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term232154, term232154.getClass(), "vcld_pts", -2072618022);
        setIntField(term232154, term232154.getClass(), "nxt_pv_id", -269909549);
        setField(term232154, term232154.getClass(), "nxt_dffclty", enum554);
        setField(term232154, term232154.getClass(), "nxt_edtn", enum555);
        setField(term232154, term232154.getClass(), "cv_cid", "aqayJgOWOQ");
        setField(term232154, term232154.getClass(), "cv_sc", "YStxlrcedL");
        setField(term232154, term232154.getClass(), "cv_rr", "mDLwflwlja");
        setField(term232154, term232154.getClass(), "cv_bv", "RqkgPxDFnv");
        setField(term232154, term232154.getClass(), "cv_bf", "egaLajwFgY");
        setIntField(term232154, term232154.getClass(), "cnp_cid", 686286032);
        setIntField(term232154, term232154.getClass(), "cnp_val", -1277201854);
        setField(term232154, term232154.getClass(), "cnp_rr", enum556);
        setField(term232154, term232154.getClass(), "cnp_sp", "wUXTYOJezz");
        setField(term232154, term232154.getClass(), "my_lst_0", "dovCZEmPER");
        setField(term232154, term232154.getClass(), "my_lst_1", "QIADULuFso");
        setField(term232154, term232154.getClass(), "my_lst_2", "XWnZIYfmmD");
        setField(term232154, term232154.getClass(), "my_lst_3", "PbkTntqZDZ");
        setField(term232154, term232154.getClass(), "my_lst_4", "yDWoqUswuW");
        setField(term232154, term232154.getClass(), "dsp_clr_brdr", "mgjEDzRwET");
        setBooleanField(term232154, term232154.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term232154, term232154.getClass(), "dsp_clr_sts", true);
        setField(term232154, term232154.getClass(), "clr_sts", "CepeBzACyE");
        setBooleanField(term232154, term232154.getClass(), "rgo_sts", false);
        setField(term232154, term232154.getClass(), "my_qst_id", "WtgzEUhZIl");
        setField(term232154, term232154.getClass(), "my_qst_sts", "tzigWGaijF");
        setField(term232154, term232154.getClass(), "my_qst_prgrs", "VWFNUuzpse");
        setField(term232154, term232154.getClass(), "my_qst_et", "XdnUnODLtI");
        setField(term232154, term232154.getClass(), "p_std_ie_have", "blbqUBWvWn");
        setField(term232154, term232154.getClass(), "p_std_se_have", "GqITHNYwXE");
        setField(term232154, term232154.getClass(), "cmd", "UZgYyXlvna");
        setField(term232154, term232154.getClass(), "req_id", "VGFyNxXSkc");
        setField(term232154, term232154.getClass(), "stat", "qkZsBlbGpw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UonOkFcwuK";
        callMethod(klass, "setMy_qst_sts", argTypes, term232154, args);
    }

};


