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

public class StartResponse_setMylst4_80243299103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217430;

    public StartResponse_setMylst4_80243299103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term217889 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term217888 = ((Class) term217889).getDeclaredField((String) "SUCCESS");
        ((Field) term217888).setAccessible(true);
        Object enum517 = ((Field) term217888).get((Object) null);
        Class<? extends Object> term218157 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term218156 = ((Class) term218157).getDeclaredField((String) "RELEASE_DATE");
        ((Field) term218156).setAccessible(true);
        Object enum518 = ((Field) term218156).get((Object) null);
        Class<? extends Object> term218500 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term218499 = ((Class) term218500).getDeclaredField((String) "UNDEFINED");
        ((Field) term218499).setAccessible(true);
        Object enum519 = ((Field) term218499).get((Object) null);
        Class<? extends Object> term218784 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term218783 = ((Class) term218784).getDeclaredField((String) "EXTRA");
        ((Field) term218783).setAccessible(true);
        Object enum520 = ((Field) term218783).get((Object) null);
        Class<? extends Object> term219091 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term219090 = ((Class) term219091).getDeclaredField((String) "GOLD");
        ((Field) term219090).setAccessible(true);
        Object enum521 = ((Field) term219090).get((Object) null);
        term217430 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term217531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term217536 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term217430, term217430.getClass(), "pd_id", -1981494102);
        setField(term217430, term217430.getClass(), "start_result", enum517);
        setIntField(term217430, term217430.getClass(), "accept_idx", -2064148945);
        setIntField(term217430, term217430.getClass(), "start_idx", 494400151);
        setField(term217430, term217430.getClass(), "player_name", "umJDDpmFWA");
        setIntField(term217430, term217430.getClass(), "hp_vol", 1588058685);
        setBooleanField(term217430, term217430.getClass(), "btn_se_vol", false);
        setIntField(term217430, term217430.getClass(), "btn_se_vol2", 1677707412);
        setIntField(term217430, term217430.getClass(), "sldr_se_vol2", -297367861);
        setField(term217430, term217430.getClass(), "sort_kind", enum518);
        setIntField(term217430, term217430.getClass(), "lv_num", -1133541490);
        setIntField(term217430, term217430.getClass(), "lv_pnt", 942412391);
        setField(term217430, term217430.getClass(), "lv_str", "BczZfNSwaD");
        setIntField(term217430, term217430.getClass(), "lv_efct_id", 751596480);
        setIntField(term217430, term217430.getClass(), "lv_plt_id", 1971485144);
        setField(term217430, term217430.getClass(), "mdl_eqp_ary", "UqBrzYVNgu");
        setField(term217430, term217430.getClass(), "c_itm_eqp_ary", "yETjenqbhE");
        setField(term217430, term217430.getClass(), "ms_itm_flg_ary", "XzpzIeoooh");
        setIntField(term217532, term217532.getClass(), "year", 2013);
        setShortField(term217532, term217532.getClass(), "month", (short) 7);
        setShortField(term217532, term217532.getClass(), "day", (short) 26);
        setField(term217531, term217531.getClass(), "date", term217532);
        setByteField(term217536, term217536.getClass(), "hour", (byte) 14);
        setByteField(term217536, term217536.getClass(), "minute", (byte) 45);
        setByteField(term217536, term217536.getClass(), "second", (byte) 33);
        setIntField(term217536, term217536.getClass(), "nano", 547995853);
        setField(term217531, term217531.getClass(), "time", term217536);
        setField(term217430, term217430.getClass(), "mdl_eqp_tm", term217531);
        setField(term217430, term217430.getClass(), "mdl_have", "sbsbTdToVA");
        setField(term217430, term217430.getClass(), "cstmz_itm_have", "PTMnmtfPDP");
        setBooleanField(term217430, term217430.getClass(), "use_pv_mdl_eqp", true);
        setBooleanField(term217430, term217430.getClass(), "use_mdl_pri", false);
        setBooleanField(term217430, term217430.getClass(), "use_pv_skn_eqp", true);
        setBooleanField(term217430, term217430.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term217430, term217430.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term217430, term217430.getClass(), "use_pv_chn_sld_se_eqp", true);
        setBooleanField(term217430, term217430.getClass(), "use_pv_sldr_tch_se_eqp", true);
        setIntField(term217430, term217430.getClass(), "vcld_pts", 2059603512);
        setIntField(term217430, term217430.getClass(), "nxt_pv_id", -1308902065);
        setField(term217430, term217430.getClass(), "nxt_dffclty", enum519);
        setField(term217430, term217430.getClass(), "nxt_edtn", enum520);
        setField(term217430, term217430.getClass(), "cv_cid", "POLJqDqHhk");
        setField(term217430, term217430.getClass(), "cv_sc", "eXlhmImRUd");
        setField(term217430, term217430.getClass(), "cv_rr", "pNjJQBsfBv");
        setField(term217430, term217430.getClass(), "cv_bv", "AeoFWTVnXE");
        setField(term217430, term217430.getClass(), "cv_bf", "KNodpPTOen");
        setIntField(term217430, term217430.getClass(), "cnp_cid", 605255795);
        setIntField(term217430, term217430.getClass(), "cnp_val", 1743438307);
        setField(term217430, term217430.getClass(), "cnp_rr", enum521);
        setField(term217430, term217430.getClass(), "cnp_sp", "HLdVSdPKUm");
        setField(term217430, term217430.getClass(), "my_lst_0", "cKqYMrtneQ");
        setField(term217430, term217430.getClass(), "my_lst_1", "CgvYDHvQnF");
        setField(term217430, term217430.getClass(), "my_lst_2", "wzvrwvpSgi");
        setField(term217430, term217430.getClass(), "my_lst_3", "qwrZBRPuHr");
        setField(term217430, term217430.getClass(), "my_lst_4", "ZlmkgzeZIu");
        setField(term217430, term217430.getClass(), "dsp_clr_brdr", "SFuBQQfwki");
        setBooleanField(term217430, term217430.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term217430, term217430.getClass(), "dsp_clr_sts", false);
        setField(term217430, term217430.getClass(), "clr_sts", "ryTUTfVgWx");
        setBooleanField(term217430, term217430.getClass(), "rgo_sts", true);
        setField(term217430, term217430.getClass(), "my_qst_id", "ImdGsYOHJc");
        setField(term217430, term217430.getClass(), "my_qst_sts", "MBkxidzets");
        setField(term217430, term217430.getClass(), "my_qst_prgrs", "PbMQbuzByL");
        setField(term217430, term217430.getClass(), "my_qst_et", "ILplPJhYrB");
        setField(term217430, term217430.getClass(), "p_std_ie_have", "ZLOixiOrLS");
        setField(term217430, term217430.getClass(), "p_std_se_have", "jyRmrZMyEy");
        setField(term217430, term217430.getClass(), "cmd", "EMhKuKuvTr");
        setField(term217430, term217430.getClass(), "req_id", "hjuOnNVIUc");
        setField(term217430, term217430.getClass(), "stat", "MTxeYrMCEJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbPIlRKXLL";
        callMethod(klass, "setMy_lst_4", argTypes, term217430, args);
    }

};


