package icu.samnyan.aqua.sega.diva.model.response.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.response.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StageResultResponse_setLvstr_9602134951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38791;

    public StageResultResponse_setLvstr_9602134951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38791 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term38986 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38987 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38991 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term38791, term38791.getClass(), "chllng_kind", 1811833766);
        setIntField(term38791, term38791.getClass(), "lv_num_old", 735987104);
        setIntField(term38791, term38791.getClass(), "lv_pnt_old", -1784072578);
        setIntField(term38791, term38791.getClass(), "lv_num", 2011764585);
        setIntField(term38791, term38791.getClass(), "lv_pnt", -860680764);
        setField(term38791, term38791.getClass(), "lv_str", "cAObIvLmLo");
        setIntField(term38791, term38791.getClass(), "lv_efct_id", -963198667);
        setIntField(term38791, term38791.getClass(), "lv_plt_id", -1007935918);
        setIntField(term38791, term38791.getClass(), "vcld_pts", 1485731037);
        setIntField(term38791, term38791.getClass(), "prsnt_vcld_pts", 1304396087);
        setIntField(term38791, term38791.getClass(), "cnp_cid", 1782600602);
        setIntField(term38791, term38791.getClass(), "cnp_val", -185892708);
        setField(term38791, term38791.getClass(), "cnp_sp", "xwiCqRSWSe");
        setField(term38791, term38791.getClass(), "crwd_kind", "IbUFkzIgzq");
        setField(term38791, term38791.getClass(), "crwd_value", "dTOUSTDdbw");
        setField(term38791, term38791.getClass(), "crwd_str_0", "PECfBejlfo");
        setField(term38791, term38791.getClass(), "crwd_str_1", "SDbDgydVpg");
        setIntField(term38791, term38791.getClass(), "cerwd_kind", -203163250);
        setIntField(term38791, term38791.getClass(), "cerwd_value", 498473526);
        setField(term38791, term38791.getClass(), "cerwd_str_0", "EEMaiNkiOH");
        setField(term38791, term38791.getClass(), "cerwd_str_1", "sFdmTylvqh");
        setField(term38791, term38791.getClass(), "ttl_str_ary", "rgniLaOaiz");
        setField(term38791, term38791.getClass(), "ttl_plt_id_ary", "fzQzzdIOMC");
        setField(term38791, term38791.getClass(), "ttl_desc_ary", "hLVDOhfCKX");
        setField(term38791, term38791.getClass(), "skin_id_ary", "yXLTfzOgfX");
        setField(term38791, term38791.getClass(), "skin_name_ary", "MANlfBKTPY");
        setField(term38791, term38791.getClass(), "skin_illust_ary", "mRoEmuCJhW");
        setField(term38791, term38791.getClass(), "skin_desc_ary", "JJUWbMXpyM");
        setIntField(term38791, term38791.getClass(), "pdddt_flg", 1186917020);
        setIntField(term38987, term38987.getClass(), "year", 2024);
        setShortField(term38987, term38987.getClass(), "month", (short) 5);
        setShortField(term38987, term38987.getClass(), "day", (short) 6);
        setField(term38986, term38986.getClass(), "date", term38987);
        setByteField(term38991, term38991.getClass(), "hour", (byte) 20);
        setByteField(term38991, term38991.getClass(), "minute", (byte) 14);
        setByteField(term38991, term38991.getClass(), "second", (byte) 27);
        setIntField(term38991, term38991.getClass(), "nano", 900636101);
        setField(term38986, term38986.getClass(), "time", term38991);
        setField(term38791, term38791.getClass(), "pdddt_tm", term38986);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_stts", 1670041824);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_tckt", 2140388634);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_is_opn", 21095258);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_prz", -1793997256);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_nxt_stts", -1271598018);
        setIntField(term38791, term38791.getClass(), "nblss_ltt_nxt_tckt", 157967613);
        setField(term38791, term38791.getClass(), "my_qst_id", "KDrRQWVXok");
        setField(term38791, term38791.getClass(), "my_qst_r_qid", "oOOwvWgxtf");
        setField(term38791, term38791.getClass(), "my_qst_r_knd", "ywoADeiUfF");
        setField(term38791, term38791.getClass(), "my_qst_r_vl", "loHiudJxbt");
        setField(term38791, term38791.getClass(), "my_qst_r_nflg", "lRbxbybNew");
        setField(term38791, term38791.getClass(), "my_ccd_r_qid", "WzGudiEARD");
        setField(term38791, term38791.getClass(), "my_ccd_r_hnd", "IoefPqGtaj");
        setField(term38791, term38791.getClass(), "my_ccd_r_vp", "YMmtjELJuB");
        setField(term38791, term38791.getClass(), "cmd", "FzyIShiOmb");
        setField(term38791, term38791.getClass(), "req_id", "PEUfeJaZTk");
        setField(term38791, term38791.getClass(), "stat", "AIvyeIdskz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iSQqMWMRlU";
        callMethod(klass, "setLv_str", argTypes, term38791, args);
    }

};


