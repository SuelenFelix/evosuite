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

public class StageResultResponse_getCrwdstr1_207721566518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18882;

    public StageResultResponse_getCrwdstr1_207721566518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18882 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term19077 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19078 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19082 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term18882, term18882.getClass(), "chllng_kind", -350454594);
        setIntField(term18882, term18882.getClass(), "lv_num_old", -1148142995);
        setIntField(term18882, term18882.getClass(), "lv_pnt_old", -233024044);
        setIntField(term18882, term18882.getClass(), "lv_num", 1820784228);
        setIntField(term18882, term18882.getClass(), "lv_pnt", 1390820006);
        setField(term18882, term18882.getClass(), "lv_str", "sEphiduvkv");
        setIntField(term18882, term18882.getClass(), "lv_efct_id", -828982065);
        setIntField(term18882, term18882.getClass(), "lv_plt_id", 1221443226);
        setIntField(term18882, term18882.getClass(), "vcld_pts", 908108726);
        setIntField(term18882, term18882.getClass(), "prsnt_vcld_pts", 1023209512);
        setIntField(term18882, term18882.getClass(), "cnp_cid", 1084849225);
        setIntField(term18882, term18882.getClass(), "cnp_val", -1702055571);
        setField(term18882, term18882.getClass(), "cnp_sp", "PbLgCSAHce");
        setField(term18882, term18882.getClass(), "crwd_kind", "NWldOLAbqk");
        setField(term18882, term18882.getClass(), "crwd_value", "qnYaYSpDwO");
        setField(term18882, term18882.getClass(), "crwd_str_0", "dgbFDCdHtj");
        setField(term18882, term18882.getClass(), "crwd_str_1", "EKpdCBubDE");
        setIntField(term18882, term18882.getClass(), "cerwd_kind", -944542900);
        setIntField(term18882, term18882.getClass(), "cerwd_value", 2063762142);
        setField(term18882, term18882.getClass(), "cerwd_str_0", "zMsSLTfGhl");
        setField(term18882, term18882.getClass(), "cerwd_str_1", "bEmHScVZaQ");
        setField(term18882, term18882.getClass(), "ttl_str_ary", "TcuXODkzBV");
        setField(term18882, term18882.getClass(), "ttl_plt_id_ary", "coJPjrBZNe");
        setField(term18882, term18882.getClass(), "ttl_desc_ary", "vMsWjuPTnO");
        setField(term18882, term18882.getClass(), "skin_id_ary", "zHvfKaOstO");
        setField(term18882, term18882.getClass(), "skin_name_ary", "tOszriqETr");
        setField(term18882, term18882.getClass(), "skin_illust_ary", "ncSPTkhKjO");
        setField(term18882, term18882.getClass(), "skin_desc_ary", "jcWKHRWhyj");
        setIntField(term18882, term18882.getClass(), "pdddt_flg", 1658391716);
        setIntField(term19078, term19078.getClass(), "year", 2029);
        setShortField(term19078, term19078.getClass(), "month", (short) 6);
        setShortField(term19078, term19078.getClass(), "day", (short) 23);
        setField(term19077, term19077.getClass(), "date", term19078);
        setByteField(term19082, term19082.getClass(), "hour", (byte) 21);
        setByteField(term19082, term19082.getClass(), "minute", (byte) 55);
        setByteField(term19082, term19082.getClass(), "second", (byte) 27);
        setIntField(term19082, term19082.getClass(), "nano", 66889274);
        setField(term19077, term19077.getClass(), "time", term19082);
        setField(term18882, term18882.getClass(), "pdddt_tm", term19077);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_stts", 2143282300);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_tckt", 1137624258);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_is_opn", 977862393);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_prz", 301401782);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_nxt_stts", 1988605357);
        setIntField(term18882, term18882.getClass(), "nblss_ltt_nxt_tckt", 808203320);
        setField(term18882, term18882.getClass(), "my_qst_id", "nrQjODRMLD");
        setField(term18882, term18882.getClass(), "my_qst_r_qid", "PNoWXrsFic");
        setField(term18882, term18882.getClass(), "my_qst_r_knd", "QZBHZqZope");
        setField(term18882, term18882.getClass(), "my_qst_r_vl", "VBUahCvyxC");
        setField(term18882, term18882.getClass(), "my_qst_r_nflg", "MlzTkzKMCX");
        setField(term18882, term18882.getClass(), "my_ccd_r_qid", "UqKUbMyPMJ");
        setField(term18882, term18882.getClass(), "my_ccd_r_hnd", "QpYltHAdyY");
        setField(term18882, term18882.getClass(), "my_ccd_r_vp", "lbmSGBwIiV");
        setField(term18882, term18882.getClass(), "cmd", "DAxyHoTLzZ");
        setField(term18882, term18882.getClass(), "req_id", "fhZgTouhCC");
        setField(term18882, term18882.getClass(), "stat", "wrikqJwXvL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCrwd_str_1", argTypes, term18882, args);
    }

};


