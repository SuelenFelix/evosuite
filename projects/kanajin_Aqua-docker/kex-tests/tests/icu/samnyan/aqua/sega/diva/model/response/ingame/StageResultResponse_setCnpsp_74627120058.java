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

public class StageResultResponse_setCnpsp_74627120058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43046;

    public StageResultResponse_setCnpsp_74627120058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43046 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse"));
        Object term43241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43246 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term43046, term43046.getClass(), "chllng_kind", -1231122778);
        setIntField(term43046, term43046.getClass(), "lv_num_old", 1923558221);
        setIntField(term43046, term43046.getClass(), "lv_pnt_old", 1762934060);
        setIntField(term43046, term43046.getClass(), "lv_num", -859828739);
        setIntField(term43046, term43046.getClass(), "lv_pnt", 1986855642);
        setField(term43046, term43046.getClass(), "lv_str", "FTuOcSieav");
        setIntField(term43046, term43046.getClass(), "lv_efct_id", 1280322790);
        setIntField(term43046, term43046.getClass(), "lv_plt_id", -1702209203);
        setIntField(term43046, term43046.getClass(), "vcld_pts", -1592307668);
        setIntField(term43046, term43046.getClass(), "prsnt_vcld_pts", -203832871);
        setIntField(term43046, term43046.getClass(), "cnp_cid", 1151963130);
        setIntField(term43046, term43046.getClass(), "cnp_val", -1855819749);
        setField(term43046, term43046.getClass(), "cnp_sp", "qSnwPXRuzC");
        setField(term43046, term43046.getClass(), "crwd_kind", "gqhqalMaKC");
        setField(term43046, term43046.getClass(), "crwd_value", "qkMduZHBXR");
        setField(term43046, term43046.getClass(), "crwd_str_0", "jMQsCLYfKd");
        setField(term43046, term43046.getClass(), "crwd_str_1", "dpcpGqEQLd");
        setIntField(term43046, term43046.getClass(), "cerwd_kind", 1059048043);
        setIntField(term43046, term43046.getClass(), "cerwd_value", 537273345);
        setField(term43046, term43046.getClass(), "cerwd_str_0", "pButgbcWlR");
        setField(term43046, term43046.getClass(), "cerwd_str_1", "tPiZMhJIXj");
        setField(term43046, term43046.getClass(), "ttl_str_ary", "lrEkNimddJ");
        setField(term43046, term43046.getClass(), "ttl_plt_id_ary", "fkeYGEUxMA");
        setField(term43046, term43046.getClass(), "ttl_desc_ary", "aJUGPodUIW");
        setField(term43046, term43046.getClass(), "skin_id_ary", "NpjPDfnDRd");
        setField(term43046, term43046.getClass(), "skin_name_ary", "SWMYovqYdk");
        setField(term43046, term43046.getClass(), "skin_illust_ary", "TQuvAoQcBe");
        setField(term43046, term43046.getClass(), "skin_desc_ary", "nGYLfZrtWO");
        setIntField(term43046, term43046.getClass(), "pdddt_flg", -346107257);
        setIntField(term43242, term43242.getClass(), "year", 2023);
        setShortField(term43242, term43242.getClass(), "month", (short) 2);
        setShortField(term43242, term43242.getClass(), "day", (short) 16);
        setField(term43241, term43241.getClass(), "date", term43242);
        setByteField(term43246, term43246.getClass(), "hour", (byte) 3);
        setByteField(term43246, term43246.getClass(), "minute", (byte) 18);
        setByteField(term43246, term43246.getClass(), "second", (byte) 56);
        setIntField(term43246, term43246.getClass(), "nano", 733017887);
        setField(term43241, term43241.getClass(), "time", term43246);
        setField(term43046, term43046.getClass(), "pdddt_tm", term43241);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_stts", -1577393360);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_tckt", 1112256038);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_is_opn", -441333794);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_prz", 1504698817);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_nxt_stts", -2018333791);
        setIntField(term43046, term43046.getClass(), "nblss_ltt_nxt_tckt", -742476678);
        setField(term43046, term43046.getClass(), "my_qst_id", "DBufEhhBCQ");
        setField(term43046, term43046.getClass(), "my_qst_r_qid", "GiNZRBZjgO");
        setField(term43046, term43046.getClass(), "my_qst_r_knd", "ceGAKcClsG");
        setField(term43046, term43046.getClass(), "my_qst_r_vl", "SEldZGJyvX");
        setField(term43046, term43046.getClass(), "my_qst_r_nflg", "vyvpqcHTQN");
        setField(term43046, term43046.getClass(), "my_ccd_r_qid", "QQcpNMSHvA");
        setField(term43046, term43046.getClass(), "my_ccd_r_hnd", "FLLklaMZvg");
        setField(term43046, term43046.getClass(), "my_ccd_r_vp", "jRDZpkFkoD");
        setField(term43046, term43046.getClass(), "cmd", "wwSknqIBIO");
        setField(term43046, term43046.getClass(), "req_id", "zQPAxUFaeX");
        setField(term43046, term43046.getClass(), "stat", "cKNHUkrYfK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.ingame.StageResultResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "crMeWqJOCQ";
        callMethod(klass, "setCnp_sp", argTypes, term43046, args);
    }

};


