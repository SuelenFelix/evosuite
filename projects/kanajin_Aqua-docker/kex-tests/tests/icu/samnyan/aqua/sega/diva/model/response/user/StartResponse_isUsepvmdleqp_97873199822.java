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

public class StartResponse_isUsepvmdleqp_97873199822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47739;

    public StartResponse_isUsepvmdleqp_97873199822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48180 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Result");
        Field term48179 = ((Class) term48180).getDeclaredField((String) "SUCCESS");
        ((Field) term48179).setAccessible(true);
        Object enum110 = ((Field) term48179).get((Object) null);
        Class<? extends Object> term48448 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Field term48447 = ((Class) term48448).getDeclaredField((String) "MY_LIST_A");
        ((Field) term48447).setAccessible(true);
        Object enum111 = ((Field) term48447).get((Object) null);
        Class<? extends Object> term48782 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Field term48781 = ((Class) term48782).getDeclaredField((String) "EASY");
        ((Field) term48781).setAccessible(true);
        Object enum112 = ((Field) term48781).get((Object) null);
        Class<? extends Object> term49051 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.Edition");
        Field term49050 = ((Class) term49051).getDeclaredField((String) "EXTRA");
        ((Field) term49050).setAccessible(true);
        Object enum113 = ((Field) term49050).get((Object) null);
        Class<? extends Object> term49358 = Class.forName((String) "icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Field term49357 = ((Class) term49358).getDeclaredField((String) "SILVER");
        ((Field) term49357).setAccessible(true);
        Object enum114 = ((Field) term49357).get((Object) null);
        term47739 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse"));
        Object term47837 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47838 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47842 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47739, term47739.getClass(), "pd_id", 1116576792);
        setField(term47739, term47739.getClass(), "start_result", enum110);
        setIntField(term47739, term47739.getClass(), "accept_idx", -942194446);
        setIntField(term47739, term47739.getClass(), "start_idx", -938508470);
        setField(term47739, term47739.getClass(), "player_name", "UbZGBpQZQW");
        setIntField(term47739, term47739.getClass(), "hp_vol", 1242676024);
        setBooleanField(term47739, term47739.getClass(), "btn_se_vol", false);
        setIntField(term47739, term47739.getClass(), "btn_se_vol2", -1865023308);
        setIntField(term47739, term47739.getClass(), "sldr_se_vol2", 1698510819);
        setField(term47739, term47739.getClass(), "sort_kind", enum111);
        setIntField(term47739, term47739.getClass(), "lv_num", -1553893255);
        setIntField(term47739, term47739.getClass(), "lv_pnt", 1303442927);
        setField(term47739, term47739.getClass(), "lv_str", "SvGTualQPa");
        setIntField(term47739, term47739.getClass(), "lv_efct_id", 794568325);
        setIntField(term47739, term47739.getClass(), "lv_plt_id", -434468428);
        setField(term47739, term47739.getClass(), "mdl_eqp_ary", "mdxcgZwsaP");
        setField(term47739, term47739.getClass(), "c_itm_eqp_ary", "XildIRoZHG");
        setField(term47739, term47739.getClass(), "ms_itm_flg_ary", "lEcrFlxJXH");
        setIntField(term47838, term47838.getClass(), "year", 2015);
        setShortField(term47838, term47838.getClass(), "month", (short) 3);
        setShortField(term47838, term47838.getClass(), "day", (short) 10);
        setField(term47837, term47837.getClass(), "date", term47838);
        setByteField(term47842, term47842.getClass(), "hour", (byte) 23);
        setByteField(term47842, term47842.getClass(), "minute", (byte) 34);
        setByteField(term47842, term47842.getClass(), "second", (byte) 44);
        setIntField(term47842, term47842.getClass(), "nano", 587322824);
        setField(term47837, term47837.getClass(), "time", term47842);
        setField(term47739, term47739.getClass(), "mdl_eqp_tm", term47837);
        setField(term47739, term47739.getClass(), "mdl_have", "VNdDwXMYxR");
        setField(term47739, term47739.getClass(), "cstmz_itm_have", "bVbexZPmwW");
        setBooleanField(term47739, term47739.getClass(), "use_pv_mdl_eqp", false);
        setBooleanField(term47739, term47739.getClass(), "use_mdl_pri", true);
        setBooleanField(term47739, term47739.getClass(), "use_pv_skn_eqp", false);
        setBooleanField(term47739, term47739.getClass(), "use_pv_btn_se_eqp", false);
        setBooleanField(term47739, term47739.getClass(), "use_pv_sld_se_eqp", false);
        setBooleanField(term47739, term47739.getClass(), "use_pv_chn_sld_se_eqp", false);
        setBooleanField(term47739, term47739.getClass(), "use_pv_sldr_tch_se_eqp", false);
        setIntField(term47739, term47739.getClass(), "vcld_pts", 1559605714);
        setIntField(term47739, term47739.getClass(), "nxt_pv_id", 1146601902);
        setField(term47739, term47739.getClass(), "nxt_dffclty", enum112);
        setField(term47739, term47739.getClass(), "nxt_edtn", enum113);
        setField(term47739, term47739.getClass(), "cv_cid", "tvxYdqiyGc");
        setField(term47739, term47739.getClass(), "cv_sc", "ZEXFoMSKeG");
        setField(term47739, term47739.getClass(), "cv_rr", "HvxahUfZcJ");
        setField(term47739, term47739.getClass(), "cv_bv", "WkLpmqoQxy");
        setField(term47739, term47739.getClass(), "cv_bf", "XiNoscmYhd");
        setIntField(term47739, term47739.getClass(), "cnp_cid", -1938881385);
        setIntField(term47739, term47739.getClass(), "cnp_val", -1629418973);
        setField(term47739, term47739.getClass(), "cnp_rr", enum114);
        setField(term47739, term47739.getClass(), "cnp_sp", "asMqnMNrZp");
        setField(term47739, term47739.getClass(), "my_lst_0", "pqFUMTCKJd");
        setField(term47739, term47739.getClass(), "my_lst_1", "PTEndmPMzk");
        setField(term47739, term47739.getClass(), "my_lst_2", "aJQuCOCvZs");
        setField(term47739, term47739.getClass(), "my_lst_3", "lHYNCJRiOv");
        setField(term47739, term47739.getClass(), "my_lst_4", "QVLresHoaP");
        setField(term47739, term47739.getClass(), "dsp_clr_brdr", "IbxeAMwLVt");
        setBooleanField(term47739, term47739.getClass(), "dsp_intrm_rnk", false);
        setBooleanField(term47739, term47739.getClass(), "dsp_clr_sts", false);
        setField(term47739, term47739.getClass(), "clr_sts", "bShlAqoTmZ");
        setBooleanField(term47739, term47739.getClass(), "rgo_sts", false);
        setField(term47739, term47739.getClass(), "my_qst_id", "nOKlKlNhtU");
        setField(term47739, term47739.getClass(), "my_qst_sts", "gXFNBHJSey");
        setField(term47739, term47739.getClass(), "my_qst_prgrs", "wUcSfItZgv");
        setField(term47739, term47739.getClass(), "my_qst_et", "rOfPCPHmtJ");
        setField(term47739, term47739.getClass(), "p_std_ie_have", "EnmiAvfpJv");
        setField(term47739, term47739.getClass(), "p_std_se_have", "AdYzLPMcwe");
        setField(term47739, term47739.getClass(), "cmd", "FrTZLybkKk");
        setField(term47739, term47739.getClass(), "req_id", "FlxVmiMYKP");
        setField(term47739, term47739.getClass(), "stat", "fgOpAWlGYN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.user.StartResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUse_pv_mdl_eqp", argTypes, term47739, args);
    }

};


