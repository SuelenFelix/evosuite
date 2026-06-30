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

public class StageResultResponse_getMyqstrknd_146281302940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32148;

    public StageResultResponse_getMyqstrknd_146281302940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32148 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term32343 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32344 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32348 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term32148, term32148.getClass(), "chllng_kind", 1743398246);
        setIntField(term32148, term32148.getClass(), "lv_num_old", -934658823);
        setIntField(term32148, term32148.getClass(), "lv_pnt_old", 1632177303);
        setIntField(term32148, term32148.getClass(), "lv_num", -802592348);
        setIntField(term32148, term32148.getClass(), "lv_pnt", -1576584269);
        setField(term32148, term32148.getClass(), "lv_str", "GnjLRtJywq");
        setIntField(term32148, term32148.getClass(), "lv_efct_id", 1474899591);
        setIntField(term32148, term32148.getClass(), "lv_plt_id", 297582552);
        setIntField(term32148, term32148.getClass(), "vcld_pts", -1485916498);
        setIntField(term32148, term32148.getClass(), "prsnt_vcld_pts", 722787672);
        setIntField(term32148, term32148.getClass(), "cnp_cid", 2077491675);
        setIntField(term32148, term32148.getClass(), "cnp_val", -1728316609);
        setField(term32148, term32148.getClass(), "cnp_sp", "TDaodpHTRK");
        setField(term32148, term32148.getClass(), "crwd_kind", "JayazbYDLK");
        setField(term32148, term32148.getClass(), "crwd_value", "ORDuSTrpNA");
        setField(term32148, term32148.getClass(), "crwd_str_0", "hysThIPoEJ");
        setField(term32148, term32148.getClass(), "crwd_str_1", "dfZepHfGwh");
        setIntField(term32148, term32148.getClass(), "cerwd_kind", 47118909);
        setIntField(term32148, term32148.getClass(), "cerwd_value", -2093707412);
        setField(term32148, term32148.getClass(), "cerwd_str_0", "zjfMxUERFZ");
        setField(term32148, term32148.getClass(), "cerwd_str_1", "ooVlhmiOff");
        setField(term32148, term32148.getClass(), "ttl_str_ary", "dUNzDLXJcj");
        setField(term32148, term32148.getClass(), "ttl_plt_id_ary", "OrVSjRJVwa");
        setField(term32148, term32148.getClass(), "ttl_desc_ary", "cdZEcINJAM");
        setField(term32148, term32148.getClass(), "skin_id_ary", "qumYSwcWHz");
        setField(term32148, term32148.getClass(), "skin_name_ary", "raNzcEorkV");
        setField(term32148, term32148.getClass(), "skin_illust_ary", "nEgozCeoUr");
        setField(term32148, term32148.getClass(), "skin_desc_ary", "EWGMzlcOnW");
        setIntField(term32148, term32148.getClass(), "pdddt_flg", -680627153);
        setIntField(term32344, term32344.getClass(), "year", 2018);
        setShortField(term32344, term32344.getClass(), "month", (short) 7);
        setShortField(term32344, term32344.getClass(), "day", (short) 12);
        setField(term32343, term32343.getClass(), "date", term32344);
        setByteField(term32348, term32348.getClass(), "hour", (byte) 1);
        setByteField(term32348, term32348.getClass(), "minute", (byte) 3);
        setByteField(term32348, term32348.getClass(), "second", (byte) 47);
        setIntField(term32348, term32348.getClass(), "nano", 2729929);
        setField(term32343, term32343.getClass(), "time", term32348);
        setField(term32148, term32148.getClass(), "pdddt_tm", term32343);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_stts", 722519669);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_tckt", -40335961);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_is_opn", 175343605);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_prz", 1050853183);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_nxt_stts", 848428785);
        setIntField(term32148, term32148.getClass(), "nblss_ltt_nxt_tckt", -1984436481);
        setField(term32148, term32148.getClass(), "my_qst_id", "XeSDJYKMBf");
        setField(term32148, term32148.getClass(), "my_qst_r_qid", "tIsFcOGTUX");
        setField(term32148, term32148.getClass(), "my_qst_r_knd", "XUVRcnELFP");
        setField(term32148, term32148.getClass(), "my_qst_r_vl", "xIeSbezmkD");
        setField(term32148, term32148.getClass(), "my_qst_r_nflg", "txUWLZRkSv");
        setField(term32148, term32148.getClass(), "my_ccd_r_qid", "gHRMJRsBGm");
        setField(term32148, term32148.getClass(), "my_ccd_r_hnd", "rZyrfnMvHa");
        setField(term32148, term32148.getClass(), "my_ccd_r_vp", "GMyMhTZeDC");
        setField(term32148, term32148.getClass(), "cmd", "KqQOTshBOL");
        setField(term32148, term32148.getClass(), "req_id", "cuWgFcYkPC");
        setField(term32148, term32148.getClass(), "stat", "HfbcOKkXBm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMy_qst_r_knd", argTypes, term32148, args);
    }

};


