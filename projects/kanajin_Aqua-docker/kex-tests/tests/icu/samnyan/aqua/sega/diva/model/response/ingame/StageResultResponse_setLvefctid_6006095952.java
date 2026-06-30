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
import java.lang.Integer;

public class StageResultResponse_setLvefctid_6006095952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39416;
     Object term39759;

    public StageResultResponse_setLvefctid_6006095952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39416 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term39611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39616 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39416, term39416.getClass(), "chllng_kind", 811839399);
        setIntField(term39416, term39416.getClass(), "lv_num_old", 593962063);
        setIntField(term39416, term39416.getClass(), "lv_pnt_old", -1485826786);
        setIntField(term39416, term39416.getClass(), "lv_num", -1549952664);
        setIntField(term39416, term39416.getClass(), "lv_pnt", 148394188);
        setField(term39416, term39416.getClass(), "lv_str", "djWEnlbOXu");
        setIntField(term39416, term39416.getClass(), "lv_efct_id", 504525721);
        setIntField(term39416, term39416.getClass(), "lv_plt_id", 1835568392);
        setIntField(term39416, term39416.getClass(), "vcld_pts", 457470807);
        setIntField(term39416, term39416.getClass(), "prsnt_vcld_pts", -994742871);
        setIntField(term39416, term39416.getClass(), "cnp_cid", -222412326);
        setIntField(term39416, term39416.getClass(), "cnp_val", -299497261);
        setField(term39416, term39416.getClass(), "cnp_sp", "MvDMzQBWME");
        setField(term39416, term39416.getClass(), "crwd_kind", "sZyAwmdGVS");
        setField(term39416, term39416.getClass(), "crwd_value", "VoKhXiLAaW");
        setField(term39416, term39416.getClass(), "crwd_str_0", "CaalXzRXQI");
        setField(term39416, term39416.getClass(), "crwd_str_1", "eRBnKPjyVg");
        setIntField(term39416, term39416.getClass(), "cerwd_kind", -23054366);
        setIntField(term39416, term39416.getClass(), "cerwd_value", 153009426);
        setField(term39416, term39416.getClass(), "cerwd_str_0", "svPqsHBvrm");
        setField(term39416, term39416.getClass(), "cerwd_str_1", "sRzUJLYMmB");
        setField(term39416, term39416.getClass(), "ttl_str_ary", "XxILklSDwz");
        setField(term39416, term39416.getClass(), "ttl_plt_id_ary", "TLjhFZbwKO");
        setField(term39416, term39416.getClass(), "ttl_desc_ary", "nxEbLIApFc");
        setField(term39416, term39416.getClass(), "skin_id_ary", "zzsdNZhejE");
        setField(term39416, term39416.getClass(), "skin_name_ary", "ILoodMZrgR");
        setField(term39416, term39416.getClass(), "skin_illust_ary", "XQiKmsCacK");
        setField(term39416, term39416.getClass(), "skin_desc_ary", "cTCixEbHYT");
        setIntField(term39416, term39416.getClass(), "pdddt_flg", 185751892);
        setIntField(term39612, term39612.getClass(), "year", 2021);
        setShortField(term39612, term39612.getClass(), "month", (short) 4);
        setShortField(term39612, term39612.getClass(), "day", (short) 17);
        setField(term39611, term39611.getClass(), "date", term39612);
        setByteField(term39616, term39616.getClass(), "hour", (byte) 4);
        setByteField(term39616, term39616.getClass(), "minute", (byte) 11);
        setByteField(term39616, term39616.getClass(), "second", (byte) 16);
        setIntField(term39616, term39616.getClass(), "nano", 509895858);
        setField(term39611, term39611.getClass(), "time", term39616);
        setField(term39416, term39416.getClass(), "pdddt_tm", term39611);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_stts", 1068256001);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_tckt", 1139078354);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_is_opn", -691164974);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_prz", -761675396);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_nxt_stts", -1954860951);
        setIntField(term39416, term39416.getClass(), "nblss_ltt_nxt_tckt", -2078879114);
        setField(term39416, term39416.getClass(), "my_qst_id", "bqKksqtAdT");
        setField(term39416, term39416.getClass(), "my_qst_r_qid", "jAIAdEmULK");
        setField(term39416, term39416.getClass(), "my_qst_r_knd", "EuAshkmbna");
        setField(term39416, term39416.getClass(), "my_qst_r_vl", "JwQlbBbGJR");
        setField(term39416, term39416.getClass(), "my_qst_r_nflg", "HdWLwfVsAM");
        setField(term39416, term39416.getClass(), "my_ccd_r_qid", "SxeKEdHXSl");
        setField(term39416, term39416.getClass(), "my_ccd_r_hnd", "BCAlJpNjIX");
        setField(term39416, term39416.getClass(), "my_ccd_r_vp", "PKClfBAwUr");
        setField(term39416, term39416.getClass(), "cmd", "JqbKrmVEMy");
        setField(term39416, term39416.getClass(), "req_id", "VygCEWaefB");
        setField(term39416, term39416.getClass(), "stat", "PqhYfEyDDA");
        term39759 = new Integer(-1186882318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39759;
        callMethod(klass, "setLv_efct_id", argTypes, term39416, args);
    }

};


